import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager= new TaskManager();
        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("\n=== Task Management System ===");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Update Task Status");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            int choice= sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title= sc.nextLine();
                    System.out.print("Enter description: ");
                    String description= sc.nextLine();
                    System.out.println("Enter Due Date: ");
                    String dueDate= sc.nextLine();
                    taskManager.addTask(title, description, dueDate);
                    break;
                case 2:
                    taskManager.viewAllTasks();
                    break;
                case 3:
                    System.out.println("Enter task ID: ");
                    int id= sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new status: ");
                    String newStatus= sc.nextLine();
                    taskManager.updateTaskStatus(id, newStatus);
                    break;
                case 4:
                    System.out.println("Enter task ID: ");
                    int deleteId= sc.nextInt();
                    taskManager.deleteTask(deleteId);
                    break;
                case 5:
                    System.out.println("GoodBye !!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.. !");
                    break;
            }
        }
    }
}
