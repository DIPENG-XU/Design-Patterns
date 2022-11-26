package facadePatterns.noviceTutorialDemo.view;

import facadePatterns.noviceTutorialDemo.iPresenter.Shape;
import facadePatterns.noviceTutorialDemo.presenter.Circle;
import facadePatterns.noviceTutorialDemo.presenter.RectShape;
import facadePatterns.noviceTutorialDemo.presenter.Square;

public class ShapeMarker {
    private final Shape circle;
    private final Shape rectShape;
    private final Shape square;

    public ShapeMarker() {
        this.circle = new Circle();
        this.rectShape = new RectShape();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRect() {
        rectShape.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
