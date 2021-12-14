package Solution11_7_1;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Long.compare(o1.getSerialNumber(), o2.getSerialNumber());
    }
}
