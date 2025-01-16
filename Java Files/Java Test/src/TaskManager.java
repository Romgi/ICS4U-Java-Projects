/*
 * Jonathan Graydon
 * Task Manager Program
 * This program will keep track of the users tasks
 */

 import java.util.*;

public class TaskManager {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Dictionary of current tasks
        HashMap<String, String> taskList = new HashMap();

        //Initialize Variables
        int menuChoice = 0;
        String taskToAlter = "";
        String dueDate = "";

        System.out.println("Welcome to the task manager program. ");

        //Main program loop
        while(menuChoice != 4){
            System.out.println("Menu: \n [1] Add Task \n [2] Mark Task as Completed \n [3] View Task List \n [4] Quit" );
            menuChoice = sc.nextInt();

            //Switch statement for user operation selection
            switch(menuChoice){
                default: System.out.println("Please enter a valid operation.");
                    break;
                case 1: //Add a task
                    System.out.println("Enter the name of the task to add: ");
                    sc.nextLine();
                    taskToAlter = sc.nextLine();
                    System.out.println("Enter the due date of the task: ");
                    dueDate = sc.nextLine();
                    taskList.put(taskToAlter, "[Incomplete] " + "Due: " + dueDate);
                    System.out.println("Added task sucessfully.");
                    break;
                case 2: //Adjust task status
                    System.out.println("Current task list: \n" + taskList);
                    System.out.println("Enter the name of the task to mark completed: ");
                    sc.nextLine();
                    taskToAlter = sc.nextLine();
                    if(taskList.containsKey(taskToAlter)){
                        taskList.replace(taskToAlter, "[Complete]");
                        System.out.println("Marked " + taskToAlter + " as complete.");
                    }
                    else{
                        System.out.println("Invalid task, " + taskList + " does not exist.");
                    }

                    break;
                case 3: //Print current task list
                    System.out.println("Current task list: \n" + taskList);
                    break;
                case 4: //Exit program
                    System.out.println("Quitting program... ");
                    break;
            }
            
        }

    }
}
