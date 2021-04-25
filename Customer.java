package uml_arqui;

public class Customer extends User {
    private String name;
    private String address;
    private String email;
    private String shippingInfo;

    private ShoppingCart shoppingCarts [];
    private Orders orders [];

    public Customer(String userId, String password, String loginStatus, String name, String address, String email, String shippingInfo, ShoppingCart [] shoppingCarts, Orders [] orders){
        super(userId, password, loginStatus);
        this.name = name;
        this.address = address;
        this.email = email;
        this.shippingInfo = shippingInfo;
        this.shoppingCarts = shoppingCarts;
        this.orders = orders;
    }

    public boolean register(){
        return true;
    }

    public boolean login(){
        return true;
    }

    public void updateProfile(Customer customer){
    }

    @Override
    public boolean verifyLogin() {
        return true;
    }
}
