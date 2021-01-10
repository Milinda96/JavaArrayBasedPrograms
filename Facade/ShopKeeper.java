package Facade;

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;

    public ShopKeeper() {
        iphone = new IPhone();
        samsung = new Samsung();
    }

    public void iPhoneSale() {
        iphone.mobileNo();
        iphone.price();
    }

    public void samsungSale() {
        samsung.mobileNo();
        samsung.price();
    }
}
