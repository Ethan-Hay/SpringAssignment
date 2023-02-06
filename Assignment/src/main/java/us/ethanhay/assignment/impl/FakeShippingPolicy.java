package us.ethanhay.assignment.impl;

import us.ethanhay.assignment.Sale;
import us.ethanhay.assignment.iface.ShippingPolicy;

import java.util.List;

public class FakeShippingPolicy implements ShippingPolicy {
    @Override
    public void applyShipping(List<Sale> salesList) {

    }
}
