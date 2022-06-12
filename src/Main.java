public class Main {
    public static void main(String[] args) {
        double price = 110.5;

        if (price >= 100) {
            System.out.println("Shipping is free!");
            System.out.println("Total cost is " + price);
        } else {
            double shipping = price * .02;
            double totalCost = shipping + price;
            System.out.println("Shipping is $" + shipping);
            System.out.println("Total cost is $" + totalCost);
        }
    }
}