package facadePatterns.supermarketDemo;

import facadePatterns.supermarketDemo.iPresenter.IAllRoute;
import facadePatterns.supermarketDemo.presenter.AllRoute;

public class SupermarketFacePatterns {
    public static void main(String[] args) {
        IAllRoute allRoute = new AllRoute();
        allRoute.getFiveRoute().hakkaCuisine();
        allRoute.getFiveRoute().teochewCuisine();
    }
}
