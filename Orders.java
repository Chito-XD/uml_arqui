package uml_arqui;

import java.util.Date;
public class Orders {
    private int orderId;
    private String dateCreated;
    private String dateShipped;
    private String status;

    private ShippingInfo shippingInfo;
    private OrderDetails orderDetails;

    public Orders(int orderId, String dateCreated, String dateShipped, String status, ShippingInfo shippingInfo, OrderDetails orderDetails){
        this.orderId = orderId;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.status = status;
        this.shippingInfo = shippingInfo;
        this.orderDetails = orderDetails;
    }

    public void placeOrder(Date date){
    }

    
}
