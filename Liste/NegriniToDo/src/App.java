import java.io.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Stack<Activity> stack;
        String filename = "Activities.ser";

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            stack = (Stack<Activity>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            stack = new Stack<>();
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nATTIVITÀ:");
            System.out.println(stack);

            System.out.print("Aggiungi attività (exit per uscire): ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
                    oos.writeObject(stack);
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Errore nel salvataggio");
                }
                break;
            }
            stack.push(new Activity(input));
        }
        scanner.close();
    }
}