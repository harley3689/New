package Netology.part2.Git;

public class Main {
    public static void main(String[] args) {
        SalesManager amount = new SalesManager(new long[]{20, 35, 10, 15, 8});
        System.out.println(amount.max());
    }
}