package facadePatterns.supermarketDemo.presenter;

import facadePatterns.supermarketDemo.iPresenter.ITwoRoute;

public class FurnitureRoute implements ITwoRoute {
    @Override
    public void yellowPearWood() {
        System.out.println("Find yellowPearWood");
    }

    @Override
    public void goldSilkPearWood() {
        System.out.println("Find goldSilkPearWood");
    }
}
