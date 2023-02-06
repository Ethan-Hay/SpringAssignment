package us.ethanhay.assignment.impl;

import us.ethanhay.assignment.Sale;
import us.ethanhay.assignment.iface.ShippingPolicy;

import java.util.List;
import java.util.Locale;

public class FlatRateDomesticShippingPolicy implements ShippingPolicy {
    @Override
    public void applyShipping(List<Sale> salesList) {
        for (Sale sale: salesList){
            Double shipping;
            switch (sale.getCountry().toLowerCase()){
                case "united states","usa","us" -> shipping = 29.95;
                case "japan" -> shipping = 14.50;
                case "scotland" -> shipping= 7.54;
                case "india" -> shipping = 11.79;
                default -> {
                    System.out.println("COUNTRY NAME NOT FOUND");
                    throw new IllegalArgumentException();
                }
            }
            sale.setShippingCost(shipping);
        }
    }
}
