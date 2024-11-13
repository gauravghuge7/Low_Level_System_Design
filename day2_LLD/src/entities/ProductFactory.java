
package entities;

public class ProductFactory {

    public ProductFactory() {
    }

    public Product createProduct(String category) {

        switch (category.toLowerCase()) {
            case "electronics":
                return new ElectronicsProduct();

            case "clothing" :
                return new ClothingProduct();

            default:
                throw  new IllegalArgumentException("Invalid Category Asked"+ category);
        }
    }
}
