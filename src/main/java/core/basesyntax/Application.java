package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        /**
         * we are just trying to access the methods or properties of the Lottery class,
         * so we can create instances inside a print statement
         */
//        Lottery ball = new Lottery();
         IntStream.range(0, 5)
                 .forEach(i -> System.out.println(new Lottery().getRandomBall()));


        /**
         * we can use traditional for loop as well, but IntStream is more readable,
         * and it is more efficient
         */
//        for (int i = 0; i < 3; i++) {
//            System.out.println(ball.getRandomBall());
//        }

        /**
         * It is so called "best practice" to remove redundancy and keep code clean,
         * as part of DRY and KISS principle
         */
//        Lottery ball1 = new Lottery();
//        System.out.println(ball1.getRandomBall().toString());
//        Lottery ball2 = new Lottery();
//        System.out.println(ball2.getRandomBall().toString());
//        Lottery ball3 = new Lottery();
//        System.out.println(ball3.getRandomBall().toString());
    }

}
