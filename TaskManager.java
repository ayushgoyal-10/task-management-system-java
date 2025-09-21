import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class TaskManager {
    private List<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
        loadTasks();
    }

    public void addTask(String title, String description, String dueDate) {
        Task task = new Task(nextId++, title, description, "PENDING", dueDate);
        tasks.add(task);
        saveTasks();
        System.out.println("Task added successfully!");
    }

    private void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tasks.txt"))) {
            for (Task task : tasks) {
                String line= task.getId() + "|" + task.getTitle() + "|" + 
                task.getDescription() + "|" + task.getStatus() + "|" + 
                task.getDueDate();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Tasks saved successfully !");
        } catch (Exception e) {
            System.out.println("Error saving tasks : " + e.getMessage());
        }
    }

    private void loadTasks(){
        File file= new File("tasks.txt");
        if(!file.exists()){
            System.out.println("No existing tasks found..");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))){
            String line;
            while((line= reader.readLine()) !=null ){
    
                String data[]= line.split("\\|");
                if(data.length==5){
                    Task task= new Task(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4]);
                    tasks.add(task);
                    nextId= Math.max(nextId, task.getId()+1);
                }
            }
            System.out.println("Loaded " + tasks.size() + " tasks from file.");
        } catch (Exception e) {
            System.out.println("Error loading tasks" + e.getMessage());
        }
    }
    public void viewAllTasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks available");
            return;
        }
        System.out.println("=== ALL TASKS ===");
        for(Task task: tasks){
            System.out.println("ID: " + task.getId() + 
            " | Title: " + task.getTitle() + 
            " | Description: " + task.getDescription() + 
            " | Status: " + task.getStatus() + 
            " | Due: " + task.getDueDate());
        }
    }
    public void updateTaskStatus(int id, String newStatus){
        for(Task task: tasks){
            if(task.getId()== id){
                String oldStatus= task.getStatus();
                task.setStatus(newStatus);
                saveTasks();
                System.out.println("Task id: " + id + " updated from " + oldStatus + " to " + newStatus);
                return;
            }
        }
        System.out.println("Task with ID: " + id + " not found!");
    }
    public void deleteTask(int id){
        for(int i=0; i<tasks.size(); i++){
            if(tasks.get(i).getId()==id){
                Task removedTask= tasks.remove(i);
                saveTasks();
                System.out.println("Deleted Task: " + removedTask);
                return;
            }
        }
        System.out.println("Task with ID: " + id + "not found");
    }
}
