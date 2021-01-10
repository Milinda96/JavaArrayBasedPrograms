package Facade;

public class IPhone implements MobileShop{

    @Override
    public void mobileNo() {
        System.out.println("Iphone 6");

    }

    @Override
    public void price() {
        System.out.println("Rs. 65000");

    }
    
}
