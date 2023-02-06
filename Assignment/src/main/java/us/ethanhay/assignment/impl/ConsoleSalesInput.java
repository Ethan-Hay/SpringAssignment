package us.ethanhay.assignment.impl;

import us.ethanhay.assignment.Sale;
import us.ethanhay.assignment.iface.SalesInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleSalesInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        List<Sale> sales = new ArrayList<>();
        String country;
        double price;
        double tax;
        while (!input.equals("NA")){
            System.out.print("Enter in Person Name (NA to quit): ");
            input = scanner.nextLine();
            if(!input.equals("NA")){
                System.out.print("Enter in Country: ");
                country = scanner.nextLine();
                System.out.print("Enter in Price: ");
                price = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter in Tax: ");
                tax = Double.parseDouble(scanner.nextLine());
                sales.add(new Sale(input,country,price,tax));
            }
        }
        return sales;
    }
}
