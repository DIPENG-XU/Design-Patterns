package facadePatterns.supermarketDemo.presenter;

import facadePatterns.supermarketDemo.iPresenter.ISixRoute;

public class FoodAndCinemaRoute implements ISixRoute {
    @Override
    public void wandaCinema() {
        System.out.println("Find wandaCinema");
    }

    @Override
    public void buffet() {
        System.out.println("Find buffet");
    }

    @Override
    public void westernFood() {
        System.out.println("Find westernFood");
    }
}
