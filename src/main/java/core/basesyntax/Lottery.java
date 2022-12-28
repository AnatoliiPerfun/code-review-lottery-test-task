package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    //the getRandomColor () method is static and we can call it without creating an object
    public Ball getRandomBall() {
        return new Ball( ColorSupplier.getRandomColor(),
                new Random().nextInt(100));
    }
}
