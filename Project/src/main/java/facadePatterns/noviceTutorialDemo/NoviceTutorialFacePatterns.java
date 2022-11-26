package facadePatterns.noviceTutorialDemo;

import facadePatterns.noviceTutorialDemo.view.ShapeMarker;

public class NoviceTutorialFacePatterns {
    public static void main(String[] args) {
        var shapeMarker = new ShapeMarker();
        shapeMarker.drawCircle();
        shapeMarker.drawSquare();
        shapeMarker.drawRect();
    }
}
