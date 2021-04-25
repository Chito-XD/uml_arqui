package uml_arqui;

public class ShippingInfo {
    private int shippingId;
    private String shippingType;
    private int shippingCost;
    private int shippingRegionId;

    public ShippingInfo(int shippingId, String shippingType, int shippingCost, int shippingRegionId ){
        this.shippingId = shippingId;
        this.shippingType = shippingType;
        this.shippingCost = shippingCost;
        this.shippingRegionId = shippingRegionId;
    }

    public void updateShippingInfo(){
    }
    
}
