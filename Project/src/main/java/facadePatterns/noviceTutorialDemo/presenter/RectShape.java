package facadePatterns.noviceTutorialDemo.presenter;

import facadePatterns.noviceTutorialDemo.iPresenter.Shape;

public class RectShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a rect");
    }
}
