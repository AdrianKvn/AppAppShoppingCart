package dto;

import java.util.ArrayList;

public class ShoppingCart {
    private Integer idPurchases;
    public ArrayList<String> listProducts;
    public Integer quantityProduct;
    private String nameCustomer;
    public Double totalCost;
    private Boolean status;

    public Integer getIdPurchases() {
        return idPurchases;
    }

    public void setIdPurchases(Integer idPurchases) {
        this.idPurchases = idPurchases;
    }

    public ArrayList<String> getlistProducts() {
        return listProducts;
    }

    public void setlistProducts(ArrayList<String> listProducts) {
        this.listProducts = listProducts;
    }

    public Integer getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(Integer quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }


    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nInformación ShoppingCart " + '\n' +
                "id Factura " + idPurchases + '\n' +
                "Nombre de productos " + listProducts + '\n' +
                "Cantidad de productos " + quantityProduct + '\n' +
                "Nombre comprador " + nameCustomer + '\n' +
                "Total a pagar $" + totalCost + '\n' +
                "Pagado " + statusPay();
    }

    public String statusPay() {
        String msg;
        if (this.status) {
            msg = "Si";
        } else {
            msg = "No";
        }
        return msg;
    }

    public void pay() {
        if (this.status) {
            status = false;
        } else {
            status = true;
        }
    }

    public void deleteshopping() {
        this.idPurchases = 0;
        listProducts.clear();
        this.quantityProduct = 0;
        this.nameCustomer = "";
        this.totalCost = 0.0;
        this.status = false;
    }

}
