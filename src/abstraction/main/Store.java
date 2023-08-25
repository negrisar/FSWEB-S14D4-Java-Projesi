package abstraction.main;

import abstraction.products.Bread;
import abstraction.products.Chocolate;
import abstraction.products.Coke;
import abstraction.products.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("Sweets", 5.5, "Vegan", "Dark", 97);
        products[1] = new Coke("Beverage", 6, "Drink cold", true, "vanilla" );
        products[2] = new Bread("Bakery", 3, "Smells good", true, "Buckwheat");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if(products != null){
            for(ProductForSale product: products){
                if(product != null){
                    product.showDetails();
                }
            }
        }

    }
}