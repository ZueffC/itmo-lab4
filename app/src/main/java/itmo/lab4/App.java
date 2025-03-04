package itmo.lab4;

import itmo.lab4.models.scene.Scene;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var scene = new Scene();
        
        System.out.println(
                "Here we go! This is a small story telling program. "
                +"It can generate random story and the *main story*"
        );
        System.out.println("Enter command (random/main/exit): ");
       
        
        OUTER:
        while (true) {
            System.out.print(">");
            if(!scanner.hasNextLine()) {
                break;
            }
            
            
            String command = scanner.nextLine().trim().toLowerCase();
            
            switch(command) {
                case "exit" -> {
                    break OUTER;
                }
                case "random" -> System.out.println(scene.getRandomStory());
                case "main" -> System.out.println(scene.getMainStory());
                default -> System.out.println("Unknown command. Please enter 'random', 'main', or 'exit'.");
            }
        }
        
        scanner.close();
    }
}