package Netology.part2.Git;

public class Main {
    public static void main(String[] args) {
        SalesManager amount = new SalesManager(new long[]{120, 150, 100, 50, 80, 200, 170});
        System.out.println("Maximum:" + amount.max() + "\nMinimum:" + amount.min() + "\nMedium:" + amount.medium());
    }
}