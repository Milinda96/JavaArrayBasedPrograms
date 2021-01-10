package Singleton;

public class SingletonAccess {
    public static void main(String[] args) {
        SingletonObject object = SingletonObject.getInstance();
        object.getMessage();
    }
}
