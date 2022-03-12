package powerpackage;

public class PowerFinder {
    public static int calculation(int base, int power) {
        int product_count = 1;
        for (int i = 0; i<power; i++) {
            product_count *= base;
        }
        return product_count;
    }
}