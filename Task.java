public class Task {
    // class fields
    private int id;
    private String title;
    private String description;
    private String status;
    private String dueDate;

    // constructor
    public Task(int id, String title, String desc, String status, String dd){
        this.id= id;
        this.title= title;
        this.description= desc;
        this.status= status;
        this.dueDate= dd;
    }

    // methods, getters, setters
    public void setId(int id){
        this.id= id;
    }
    public int getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title= title;
    }
    public String getTitle(){
        return this.title;
    }

    
    public void setDescription(String desc){
        this.description= desc;
    }
    public String getDescription(){
        return this.description;
    }

    
    public void setStatus(String status){
        this.status= status;
    }
    public String getStatus(){
        return this.status;
    }

    
    public void setDueDate(String dd){
        this.dueDate= dd;
    }
    public String getDueDate(){
        return this.dueDate;
    }

    @Override
    public String toString() {
        return "Task [ID: " + id + 
            ", Title: " + title + 
            ", Status: " + status + 
            ", Due: " + dueDate + "]";
    }
}
