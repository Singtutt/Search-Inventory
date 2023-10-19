package com.pluralsight;
import java.util.*;
import java.io.*;
import static java.util.Collections.*;

public class SearchInventory {
    public static ArrayList<Product> getChest() {
        ArrayList<Product> list = new ArrayList<Product>();
        try {
            FileReader readFile = new FileReader("inventory.csv");
            BufferedReader readBuff = new BufferedReader(readFile);
            String element;

            while ((line = readBuff.readLine()) != null) {
                String[] line = element.split("\\|");
                int id = Integer.parseInt(line[0]);
                String name = line[1];
                double price = Double.parseDouble(line[2]);
                list.add(new Product(id, name, price));
            }
            sort(item, Comparator.comparing(Product::getName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<String> chest = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean process = true;

        while (process) {
            System.out.println("What do you want to do?\n" +
                    "1- List all products\n" +
                    "2- Lookup a product by its id\n" +
                    "3- Find all products within a price range\n" +
                    "4- Add a new product\n" +
                    "5- Quit the application");
            System.out.println("Enter command: ");
            int option = scan.nextInt();
            scan.nextLine();

            switch (input) {
                case 1:
                    optionOne(chest);
                    break;
                case 2:
                    optionTwo(chest, scan);
                    break;
                case 3:
                    optionThree(chest, scan);
                    break;
                case 4:
                    optionFour(chest, scan);
                    break;
                case 5:
                    process = false;
                    System.out.println(("Exiting application... Goodbye!"));
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
    public static void optionOne(ArrayList<Product> inventory) {
        System.out.println();
        for (Product product : chest) {
            System.out.println(product);
        }
    }
}
