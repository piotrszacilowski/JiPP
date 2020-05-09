package task05;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza[] values = Pizza.values();

        System.out.println("Menu: ");
        for (var value : values) {
            System.out.println(value);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Which pizza you choose ?");
        Pizza pizza = Pizza.valueOf(input.nextLine().toUpperCase());

        System.out.println("You chose: " + pizza.name());
        input.close();
    }
}
