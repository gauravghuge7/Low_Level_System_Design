import dal.UserDatabase;
import entities.Order;
import entities.Product;
import entities.ProductFactory;
import entities.UserAccount;

import java.util.ArrayList;
import java.util.List;

public class ShopWorldApp {
    public static void main(String[] args) {

        /*
        *
        * create a user database -- singleTon pattern
        * */

        UserDatabase userDb = UserDatabase.getInstance();

        ProductFactory factory = new ProductFactory();

        Product electronics = factory.createProduct("electronics");
        electronics.display();

        Product clothingProduct = factory.createProduct("Clothing");
        clothingProduct.display();



        /*
        *  build the user Account details
        *
        * */

        UserAccount.UserAccountBuilder user = new UserAccount.UserAccountBuilder("username", "password");

        UserAccount account = user.build();
        System.out.println(account);


        List<Product> products = new ArrayList<>();

        products.add(electronics);
        products.add(clothingProduct);

        Order.OrderBuilder builder = new Order.OrderBuilder("OrderId", products);

        Order order = builder.build();


        /*
         *   build the order for the
         */
    }
}
