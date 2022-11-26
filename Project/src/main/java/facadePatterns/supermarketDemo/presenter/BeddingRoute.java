package facadePatterns.supermarketDemo.presenter;

import facadePatterns.supermarketDemo.iPresenter.IOneRoute;

public class BeddingRoute implements IOneRoute {
    @Override
    public void richAnna() {
        System.out.println("Find richAnna");
    }

    @Override
    public void peopleFromTheSouthPole() {
        System.out.println("Find peopleFromTheSouthPole");
    }
}
