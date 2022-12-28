package core.basesyntax;

public class Ball {
        /**
     * a private final String is not accessible outside the class in which it is declared.
     * whereas a public String is accessible from any class.
     * additionally, a private final String cannot be modified, whereas a public String can be modified.
     */
    private final String ballColor;
    private final int ballNumber;

    /**
     * An empty constructor is a constructor that doesn't take any parameters and doesn't contain any code.
     * It is used when you want to create an instance of the class without having to provide any parameters.
     * An empty constructor is useful if you want to create an object with default values or set up the object with values from another source.
     * You don't need an empty constructor in Java, but it can be useful in certain situations.
     */

    /**
     * This is a constructor for a Ball class, which takes two parameters: a String for the color and an integer for the number.
     * The constructor sets the color and number instance variables to the values of the parameters passed in.
     * The constructor is a special method that is called when an object of a class is created.
     */
    public Ball(String color, int number) {
        this.ballColor = color;
        this.ballNumber = number;
    }

    /**
     * You should use getters and setters when you need to have more control over the values of a property,
     * for example, when you need to perform validation or perform an action when a property is modified.
     */


    @Override
    // this annotation is used to override the toString() method of the Object class (this student forgot to put it).
    public String toString() {
        return "Ball with number: "
                + ballNumber
                + " and color: "
                + ballColor;
    }
}
