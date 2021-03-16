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

    public static void main(String[] args) {

        FunctionalInterfaceExample fi = (a,b)-> {int i = a+b;
            System.out.println("Addition of a and b :-"+i);
            return i;};

        fi.add(5,10);

    }
}
