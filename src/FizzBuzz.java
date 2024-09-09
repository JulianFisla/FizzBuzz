/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void mainFizzBuzz(int number){

        doFizzBuzz(number);

    }

    public static void doFizzBuzz(int number) {
        int counter = 1;

        while (counter <= number) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = counter % 3 == 0;
            boolean divisibleBy5 = counter % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(counter);

            }

            counter++;
        }
    }
}
