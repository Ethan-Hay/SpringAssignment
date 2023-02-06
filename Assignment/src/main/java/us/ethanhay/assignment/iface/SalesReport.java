package us.ethanhay.assignment.iface;

import us.ethanhay.assignment.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
