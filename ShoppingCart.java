package uml_arqui;

import java.util.Date;

public class ShoppingCart {
    private int cardId;
    private int productID;
    private int quantity;
    private Date dateAdded;
    
    public ShoppingCart(int cardId, int productID, int quantity, Date date){
        this.cardId = cardId;
        this.productID = productID;
        this.quantity = quantity;
        this.dateAdded = date;
    }

    public void addCartItem(Item item){
    }

    protected void updateQuantity(int value){
    }

    public String viewCartDetails(){
        return "";
    }

    public boolean checkOut(){
        return true;
    }

}
