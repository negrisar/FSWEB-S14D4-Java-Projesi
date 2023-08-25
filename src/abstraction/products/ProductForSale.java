package abstraction.products;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }


    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    public abstract void showDetails();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("------------\n");
        builder.append("Type: " + type + "\n");
        builder.append("Price: " + price + "\n");
        builder.append("Description: " + description + "\n");
        return builder.toString();
    }
}
