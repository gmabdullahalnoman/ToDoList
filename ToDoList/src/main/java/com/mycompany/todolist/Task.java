package com.mycompany.todolist;

/**
 *
 * @author abdullahalnoman
 */
public class Task {
    private String description;
    private String status;
    
    public Task (String description) {
        this.description = description;
        this.status = "Not Started yet" ;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    @Override
    public String toString(){
        return description + " [" + status + "]";
    }
}
