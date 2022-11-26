package facadePatterns.supermarketDemo.presenter;

import facadePatterns.supermarketDemo.iPresenter.IFiveRoute;

public class FoodRoute implements IFiveRoute {
    @Override
    public void cantoneseFood() {
        System.out.println("Find cantoneseFood");
    }

    @Override
    public void hakkaCuisine() {
        System.out.println("Find hakkaCuisine");
    }

    @Override
    public void teochewCuisine() {
        System.out.println("Find teochewCuisine");
    }
}
