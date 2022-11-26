package facadePatterns.supermarketDemo.presenter;

import facadePatterns.supermarketDemo.iPresenter.IThreeRoute;

public class HomeApplianceRoute implements IThreeRoute {
    @Override
    public void midea() {
        System.out.println("Find midea");
    }

    @Override
    public void gree() {
        System.out.println("Find gree");
    }

    @Override
    public void siemens() {
        System.out.println("Find siemens");
    }
}
