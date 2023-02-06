package us.ethanhay.assignment.impl;

import us.ethanhay.assignment.Sale;
import us.ethanhay.assignment.iface.SalesInput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileSalesInput implements SalesInput {
    private static final String INPUT_FILE_PATH = "sales.txt";

    @Override
    public List<Sale> getSales() {
        List<Sale> theSales = new ArrayList<>();
        File inputFile = new File(INPUT_FILE_PATH);

        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputFile));
        }catch (FileNotFoundException e){
            e.printStackTrace();
            throw new IllegalArgumentException();
        }

        String line;
        System.out.println("Generating Sales: ");
        do {
            try {
                line = bufferedReader.readLine();
            }catch (IOException e){
                e.printStackTrace();
                break;
            }
            if(line == null){
                break;
            }

            String[] splitline = line.split(",",4);
            System.out.print(".");
            theSales.add(new Sale(splitline[0],splitline[1],Double.parseDouble(splitline[2]),Double.parseDouble(splitline[3])));
        }while (true);
        System.out.println("\n"+theSales.size()+" sales generated from file at "+INPUT_FILE_PATH);
        return theSales;
    }
}
