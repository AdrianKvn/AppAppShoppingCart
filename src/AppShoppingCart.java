import dto.ShoppingCart;

import java.util.ArrayList;

public class AppShoppingCart {
    public static void main(String[] args) {
        /**
         * Creamos un objeto tipo ShoppingCart
         */
        ShoppingCart shoppingCart = new ShoppingCart();
        /**
         * Creaamos el arrayde productos y agregamos valores
         */
        ArrayList<String> arrayProducts = new ArrayList<>();
        arrayProducts.add("Jabón");
        arrayProducts.add("Trapero");
        arrayProducts.add("Gaseosa");
        arrayProducts.add("Pan Integral");
        /**
         * Llenamos nuestro objeto tipo ShoppingCart con los atributos previamnete definidos
         * en la clase ShoppingCart
         */
        shoppingCart.setIdPurchases(12);
        shoppingCart.setlistProducts(arrayProducts);
        shoppingCart.setQuantityProduct(arrayProducts.size());
        shoppingCart.setNameCustomer("Jairo Martinez");
        shoppingCart.setTotalCost(30212.0);
        shoppingCart.setStatus(false);

        /**
         * Llamamos el metodo ya definido y hacemos el pago de la factura
         */
        shoppingCart.pay();
        System.out.println("Información ShoppinCart");
        System.out.println("Numero de factura " + shoppingCart.getIdPurchases() + '\n' +
                "Lista de productos " + shoppingCart.getlistProducts() + '\n' +
                "Cantidad productos " + shoppingCart.getQuantityProduct() + '\n' +
                "Nombre del cliente " + shoppingCart.getNameCustomer() + '\n' +
                "Total a pagar $" + shoppingCart.getTotalCost() + '\n' +
                "Factura paga " + shoppingCart.statusPay());
        /**
         * llamamos el método para eliminar la información de la factura
         */
        shoppingCart.deleteshopping();
        System.out.println("\nInformación ShoppinCart");
        System.out.println("Numero de factura " + shoppingCart.getIdPurchases() + '\n' +
                "Lista de productos " + shoppingCart.getlistProducts() + '\n' +
                "Cantidad productos " + shoppingCart.getQuantityProduct() + '\n' +
                "Nombre del cliente " + shoppingCart.getNameCustomer() + '\n' +
                "Total a pagar $" + shoppingCart.getTotalCost() + '\n' +
                "Factura paga " + shoppingCart.statusPay());


    }
}
