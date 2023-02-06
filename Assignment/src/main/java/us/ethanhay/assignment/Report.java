package us.ethanhay.assignment;

import org.springframework.stereotype.Component;
import us.ethanhay.assignment.iface.SalesInput;
import us.ethanhay.assignment.iface.SalesReport;
import us.ethanhay.assignment.iface.ShippingPolicy;

import java.util.List;

@Component
public class Report {
    private SalesInput salesInput;
    private SalesReport salesReport;
    private ShippingPolicy shippingPolicy;
    public Report(SalesInput salesInput, SalesReport salesReport, ShippingPolicy shippingPolicy){
    this.salesInput = salesInput;
    this.salesReport =salesReport;
    this.shippingPolicy = shippingPolicy;
    }

    public void run(){
        List<Sale> theSales = salesInput.getSales();
        shippingPolicy.applyShipping(theSales);
        salesReport.generateReport(theSales);
    }
}
