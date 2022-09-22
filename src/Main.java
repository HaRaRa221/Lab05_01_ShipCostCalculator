public class Main {
    public static void main(String[] args)
    {
        double shippingCost;
        int itemPrice;
        double totalCost;

        itemPrice = 100;
        shippingCost= itemPrice * .02;
        totalCost = itemPrice + shippingCost;

        if(itemPrice >= 100)
        {
            System.out.println("The shipping cost of the item is free.");
            System.out.println("The total cost is " + itemPrice);
        }
        else
        {
            System.out.println("The shipping cost of the item is " + shippingCost);
            System.out.println("The total cost of the item is " + totalCost);
        }

    }
}