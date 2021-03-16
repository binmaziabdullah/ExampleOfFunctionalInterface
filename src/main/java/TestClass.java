import java.util.Scanner;

public class TestClass {
    /*the interface which have exactly single abstract method known as functional interface
      Functional Interface is enabling the functional programming
    * @FunctionalInterface is the annotation used to declare an interface as a Functional Interface.
    * @FunctionalInterface is  explicit type of creating FI and also tells compiler
    * to prevent other programmer to add more than one Am or remove the existing AM if they do so,
    * Exception is throw at compile time*
      -----------------------------------------------------
    lambda expression is the implementation for Functional Interface
    * by Functional Interface we can write lambda expression so it must to have FI and on top of that
    * we can create the lambda expression/
    */

    /*-------lambda expression----------
    * lambda expression is the anonymous function and it  is the implementation of Functional Interface.
    * or you can say it it is the extension or the enhancement of anonymous class.
    * lambda expression is an object and instance of one FI when it is implemented.
    * lambda expression is used to write the clean & concise way to represent the code.
    * it optimise the code and increase the readability of the code.
    * it only takes the (param list) and method body which is separate by ->(arrow).
    * method signature is optional in lambda expression*/

    public static void main(String[] args) {

        FunctionalInterfaceExample fi = (a,b)-> {int i = a+b;
            System.out.println("Addition of a and b :-"+i);
            return i;};

        fi.add(5,10);

        EvenOrOdd evenOrOdd = ()->{
            int num;
            System.out.println("Enter the number to check:");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();

            if (num%2==0)
                System.out.println(num+" "+"is Even number");
            else
                System.out.println(num+" "+"is Odd number");
        };

        evenOrOdd.evenOrOdd();

    }
}
