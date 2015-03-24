package stock;

public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println(String.format("Stock [Name: %s, Quantity: %s] bought", name, quantity));
    }

    public void sell() {
        System.out.println(String.format("Stock [Name: %s, Quantity: %s] sold", name, quantity));
    }

}
