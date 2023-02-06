package us.ethanhay.assignment.impl;

import us.ethanhay.assignment.Sale;
import us.ethanhay.assignment.iface.ShippingPolicy;

import java.util.List;

public class FreeShippingOverShippingPolicy implements ShippingPolicy {
    double threshold = Double.MAX_VALUE;
    public FreeShippingOverShippingPolicy(Double minLimit){
        this.threshold = minLimit;
    }
    @Override
    public void applyShipping(List<Sale> salesList) {
        new FlatRateDomesticShippingPolicy().applyShipping(salesList);
        if (this.threshold <0){
            throw new IllegalArgumentException("The min limit is too low");
        }
        for (Sale sale: salesList){
            if (sale.getPrice()>this.threshold)
                sale.setShippingCost(0);
        }
    }
}
