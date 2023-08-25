package abstraction.products;

public class Coke extends ProductForSale{

    private boolean sugarFree;
    private String aroma;

    public Coke(String type, double price, String description, boolean sugarFree, String aroma) {
        super(type, price, description);
        this.sugarFree = sugarFree;
        this.aroma = aroma;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Sugar Free: " + sugarFree + "\n");
        builder.append("Aroma: " + aroma + "\n");
        builder.append("------------\n");
        System.out.println(result + builder.toString());
    }
}
