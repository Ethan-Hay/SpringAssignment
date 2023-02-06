package us.ethanhay.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import us.ethanhay.assignment.iface.SalesInput;
import us.ethanhay.assignment.iface.SalesReport;
import us.ethanhay.assignment.iface.ShippingPolicy;
import us.ethanhay.assignment.impl.*;

@Configuration
@ComponentScan("us.ethanhay.assignment")
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        //return new FakeSalesInput();
        //return new ConsoleSalesInput();
        return new FileSalesInput();
    }

    @Bean
    public SalesReport salesReport() {
        //return new FakeSalesReport();
        //return new SummarySalesReport();
        return new DetailedSalesReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy() {
        //return new FakeShippingPolicy();
        //return new FreeShipping();
        //return new FlatRateDomesticShippingPolicy();
        return new FreeShippingOverShippingPolicy(50.0);
    }
}
