package us.ethanhay.assignment.impl;

import us.ethanhay.assignment.Sale;
import us.ethanhay.assignment.iface.SalesReport;

import java.util.List;

public class DetailedSalesReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES SUMMARY REPORT");
        System.out.println("Customer     Country     Amount    Tax       Shipping");
        for (Sale sale: salesList) {
            System.out.format("%20s %15s %8.2f %8.2f %8.2f\n",sale.getName(),sale.getCountry(),sale.getPrice(),sale.getTax(),sale.getShippingCost());
        }
    }
}
