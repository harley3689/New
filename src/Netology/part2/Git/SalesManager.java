package Netology.part2.Git;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long medium() {
        long medium = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != max()) {
                if (sales[i] != min()) {
                    medium += sales[i];
                }
            }
        }
        return medium / (sales.length - 2);
    }
}