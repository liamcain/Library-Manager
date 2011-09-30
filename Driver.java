import java.util.Scanner;

public class Driver {
    
    public static String input(String message){
        Scanner reader = new Scanner(System.in);
        System.out.print(message);
        return reader.nextLine();
    }
    
    public static void acceptInput(Library library){
        String input = input("\nEnter a command: ");
        
        String[] command = input.split(" ", 2);
        
        if(command[0].equals("add"))
            library.add(command[1]);
        else if(command[0].equals("print"))
            System.out.print(library);
        else if(command[0].equals("remove"))
            library.remove(command[1]);
        else if(command[0].equals("take"))
            library.take(command[1]);
        else if(command[0].equals("return"))
            library.putBack(command[1]);
        else if(command[0].equals("sort"))
            library.sort();
        else if(command[0].equals("save"))
            library.save();       
        else if(command[0].equals("quit"))
            System.exit(0);
        else
            System.out.println("Command not found.");
        
    }
    
    public static void main(String[] args) {
        Library library = new Library();
        
        System.out.print(library);
        
        while(true){
            acceptInput(library);
        }
    }
}