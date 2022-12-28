package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    //hear two empty lines whatsoever it is not crustal
    public static String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index].getColor(); // remove to String as we pass enums as Strings already.
    }
}
