package abstraction.products;

public class Bread extends ProductForSale{

    private boolean glutenFree;
    private String flourType;

    public Bread(String type, double price, String description, boolean glutenFree, String flourType) {
        super(type, price, description);
        this.glutenFree = glutenFree;
        this.flourType = flourType;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Gluten Free: " + glutenFree + "\n");
        builder.append("Flour Type: " + flourType + "\n");
        builder.append("------------\n");
        System.out.println(result + builder.toString());

    }
}
