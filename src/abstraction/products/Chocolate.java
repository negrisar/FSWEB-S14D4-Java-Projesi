package abstraction.products;

public class Chocolate extends ProductForSale{

    private String color;
    private int cocoaPercentage;


    public Chocolate(String type, double price, String description, String color, int cocoaPercentage) {
        super(type, price, description);
        this.color = color;
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Color: " + color + "\n" );
        builder.append("cocoaPercentage: " + cocoaPercentage + "\n" );
        builder.append("------------\n");
        System.out.println(result + builder.toString());
    }
}
