package facadePatterns.supermarketDemo.presenter;

import facadePatterns.supermarketDemo.iPresenter.*;

public class AllRoute implements IAllRoute {
    @Override
    public IOneRoute getOneRoute() {
        return new BeddingRoute();
    }

    @Override
    public ITwoRoute getTwoRoute() {
        return new FurnitureRoute();
    }

    @Override
    public IThreeRoute getThreeRoute() {
        return new HomeApplianceRoute();
    }

    @Override
    public IFourRoute getFourRoute() {
        return new ElectronicProductsRoute();
    }

    @Override
    public IFiveRoute getFiveRoute() {
        return new FoodRoute();
    }

    @Override
    public ISixRoute getSixRoute() {
        return new FoodAndCinemaRoute();
    }
}
