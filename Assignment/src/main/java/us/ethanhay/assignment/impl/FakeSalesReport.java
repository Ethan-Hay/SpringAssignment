package us.ethanhay.assignment.impl;

import us.ethanhay.assignment.Sale;
import us.ethanhay.assignment.iface.SalesReport;

import java.util.List;

public class FakeSalesReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        for (Sale sale: salesList) {
            
        }
    }
}
