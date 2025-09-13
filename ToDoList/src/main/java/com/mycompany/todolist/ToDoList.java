package com.mycompany.todolist;
import java.util.Scanner;
/**
 *
 * @author abdullahalnoman
 */
public class ToDoList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- ToDo List Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task Status");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1 -> System.out.println("Add Task");
                case 2 -> System.out.println("View Tasks");
                case 3 -> System.out.println("Update Task Status");
                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
    
