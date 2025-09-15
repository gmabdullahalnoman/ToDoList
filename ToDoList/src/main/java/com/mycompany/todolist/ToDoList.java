package com.mycompany.todolist;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author abdullahalnoman
 */
public class ToDoList {
    List<Task> tasks = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        
        while (true) {
            System.out.println("\n>>>>> ToDo List Menu <<<<<");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task Status");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            
            int choice = todo.input.nextInt();
            todo.input.nextLine(); 

            switch (choice) {
                case 1 -> todo.addTask();
                case 2 -> todo.viewTasks();
                case 3 -> todo.updateTaskStatus();
                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
    void addTask() {
        System.out.println("Enter task description: ");
        String description = input.nextLine();
        tasks.add(new Task(description));
        System.out.println("Task added");
    }
    
    void viewTasks() {
        if (tasks.isEmpty()){
            System.out.println("No tasks added yet.");
            return;
        }
        System.out.println("\n--- Your Tasks ---");
        for(int i=0; i<tasks.size();i++){
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }
    void updateTaskStatus() {
        if (tasks.isEmpty()){
            System.out.println("No tasks to update");
            return;
        }
        
        System.out.println("Your tasks: ");
        for (int i=0;i<tasks.size();i++){
            System.out.println((i+1) + ". " + tasks.get(i));
        }
        
        System.out.println("Enter task number to update: ");
        int taskNumber = input.nextInt();
        input.nextLine();
        
        System.out.println("Enter new status: ");
        String newStatus = input.nextLine();
        
        Task selectedTask = tasks.get(taskNumber -1);
        selectedTask.setStatus(newStatus);
        System.out.println("Task Status updated!");
    }
}
    
