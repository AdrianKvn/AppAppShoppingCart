import dto.ShoppingCart;

import java.util.ArrayList;

public class AppShoppingCart {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        ArrayList<String> arrayProducts = new ArrayList<>();
        arrayProducts.add("Jabón");
        arrayProducts.add("Trapero");
        arrayProducts.add("Gaseosa");
        arrayProducts.add("Pan Integral");

        shoppingCart.setIdPurchases(12);
        shoppingCart.setlistProducts(arrayProducts);
        shoppingCart.setQuantityProduct(arrayProducts.size());
        shoppingCart.setNameCustomer("Jairo Martinez");
        shoppingCart.setTotalCost(30212.0);
        shoppingCart.setStatus(false);

        System.out.println(shoppingCart);

        shoppingCart.pay();
        System.out.println(shoppingCart);

        shoppingCart.deleteshopping();
        System.out.println(shoppingCart);


    }
}
