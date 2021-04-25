package uml_arqui;

import java.math.BigDecimal;

public class OrderDetails {
    
    private int orderId;
    private int productID;
    private String productName;
    private int quantity;
    private float unitCost;
    private float subtotal;

    public OrderDetails(int orderId, int productID, String productName, int quantity, float unitCost, float subtotal ){
        this.orderId = orderId;
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.unitCost = unitCost;
        this.subtotal = subtotal;
    }

    public BigDecimal calcPrice(){
        return new BigDecimal("0.0");
    }
}
