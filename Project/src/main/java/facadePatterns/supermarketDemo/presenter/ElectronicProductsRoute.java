package facadePatterns.supermarketDemo.presenter;

import facadePatterns.supermarketDemo.iPresenter.IFourRoute;

public class ElectronicProductsRoute implements IFourRoute {
    @Override
    public void samsung() {
        System.out.println("Find samsung");
    }

    @Override
    public void apple() {
        System.out.println("Find apple");
    }

    @Override
    public void xiaomi() {
        System.out.println("Find xiaomi");
    }

    @Override
    public void oppo() {
        System.out.println("Find oppo");
    }
}
