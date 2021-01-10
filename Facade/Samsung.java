package Facade;

public class Samsung implements MobileShop{

    @Override
    public void mobileNo() {
        System.out.println("Galaxy");

    }

    @Override
    public void price() {
        System.out.println("Rs.45000");

    }
    
}
