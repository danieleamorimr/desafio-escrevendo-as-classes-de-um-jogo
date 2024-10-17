import model.Hero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the hero's name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter the hero's age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the hero's type (warrior, wizard, monk, ninja): ");
            String type = scanner.nextLine();

            Hero hero = new Hero(name, age, type);

            hero.attack();

        }
        catch (Exception e) {
           System.out.println("Ocorreu um erro: " + e.getMessage());
            
        } finally {
            System.out.println("FIM");
            scanner.close();
        }
    }
}