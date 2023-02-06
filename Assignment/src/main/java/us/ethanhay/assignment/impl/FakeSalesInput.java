package us.ethanhay.assignment.impl;

import us.ethanhay.assignment.Sale;
import us.ethanhay.assignment.iface.SalesInput;

import java.util.ArrayList;
import java.util.List;

public class FakeSalesInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> theList = new ArrayList<>();
        theList.add(new Sale("Bob","Texas",4335.56,23.32));
        theList.add(new Sale("Sue","Wisconsin",2345.45,12.34));
        return theList;
    }
}
