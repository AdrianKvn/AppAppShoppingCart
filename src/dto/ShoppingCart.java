package dto;
/**
 * Clase ShoppingCart
 * en esta clase se declaran los atributos, los getters,setters y sus difenrentes metodos
 * @author Adrian Luengas
 *
 */

import java.util.ArrayList;

public class ShoppingCart {
    private Integer idPurchases;
    public ArrayList<String> listProducts;
    public Integer quantityProduct;
    private String nameCustomer;
    public Double totalCost;
    private Boolean status;

    /**
     * Este método retorna el número de la factura
     * @return
     */
    public Integer getIdPurchases() {
        return idPurchases;
    }

    /**
     * Método que recibe como parámetro el numero de factura
     * @param idPurchases
     */
    public void setIdPurchases(Integer idPurchases) {
        this.idPurchases = idPurchases;
    }

    /**
     * Este método regresa un array de productos
     * @return
     */
    public ArrayList<String> getlistProducts() {
        return listProducts;
    }

    /**
     * Método que recibe como parámetro un array productos
     * @param listProducts
     */
    public void setlistProducts(ArrayList<String> listProducts) {
        this.listProducts = listProducts;
    }

    /**
     * Método que regresa la cantidad de productos
     * @return
     */
    public Integer getQuantityProduct() {
        return quantityProduct;
    }

    /**
     * Método que recibe como parámetro la cantidad de productos
     * @param quantityProduct
     */
    public void setQuantityProduct(Integer quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    /**
     * Método que regresa el nombre del comprador
     * @return
     */
    public String getNameCustomer() {
        return nameCustomer;
    }

    /**
     * Este método recibe como parámetro el nombre del comprador
     * @param nameCustomer
     */
    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    /**
     * Este método regresa el total de la compra
     * @return
     */
    public Double getTotalCost() {
        return totalCost;
    }

    /**
     * Metodo recibe como parametro el valor de la compra
     * @param totalCost
     */
    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * Este método regresa si la factura esta paga o no (true/false)
     * @return
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * Este método recibe como parametro el estado de la compra (true/false)
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * Este regresa un mensaje segun el estado de la compra
     * @return
     */
    public String statusPay() {
        String msg;
        if (this.status) {
            msg = "Si";
        } else {
            msg = "No";
        }
        return msg;
    }

    /**
     * Este método cambia el estado de la compra
     */
    public void pay() {
        if (this.status) {
            status = false;
        } else {
            status = true;
        }
    }

    /**
     * Este método elimina los datos de la factura, setenado los valores a vacios yo 0
     */
    public void deleteshopping() {
        this.idPurchases = 0;
        listProducts.clear();
        this.quantityProduct = 0;
        this.nameCustomer = "";
        this.totalCost = 0.0;
        this.status = false;
    }

}
