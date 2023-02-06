package us.ethanhay.assignment.iface;

import us.ethanhay.assignment.Sale;

import java.util.List;

public interface ShippingPolicy {
    void applyShipping(List<Sale> salesList);
}
