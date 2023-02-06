package us.ethanhay.assignment.impl;

import us.ethanhay.assignment.Sale;
import us.ethanhay.assignment.iface.ShippingPolicy;

import java.util.List;

public class FreeShipping implements ShippingPolicy {
    @Override
    public void applyShipping(List<Sale> salesList) {
        for (Sale sale: salesList){
            sale.setShippingCost(0);
        }
    }
}
