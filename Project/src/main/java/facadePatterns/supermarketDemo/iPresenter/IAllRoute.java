package facadePatterns.supermarketDemo.iPresenter;

public interface IAllRoute {
    IOneRoute getOneRoute();

    ITwoRoute getTwoRoute();

    IThreeRoute getThreeRoute();

    IFourRoute getFourRoute();

    IFiveRoute getFiveRoute();

    ISixRoute getSixRoute();
}
