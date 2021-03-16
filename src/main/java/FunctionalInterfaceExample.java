@FunctionalInterface
public interface FunctionalInterfaceExample {
    int add(int a, int b);

    /*int sum(int b, int a,int c); we can't have more than one Am in Functional Interface*/

    /*we can have following programming elements allowed in Functional Interface apart from single Am*/

    /*public final static variable*/
    public final static int age = 500;

    /*public final static variable*/
    public static int ages = 100;

    /*default methods*/
    public default String defaultMethod() {
        return "default methods";
    }

    /*static methods*/
    public static String name() {
        return "public static methods";
    }

    /*we can have static inner classes */
    static class A {
    }

    static class B {
    }


    /* private static and non-static methods are allowed in FI but After 1.9v of java
    private static String run() {
        return "private static methods";
    }
    private String runIt(){
        return "private non-static methods";
    }*/

    /*here we also allowed to use the abstract methode from Object Class without facing any exception bcoz
     * they are abstract method coming from Object class(Implicitly) but we can have only one explicit Am*/
    int hashCode();

    boolean equals(Object o);

    /*------------------------------------------------------
    * FI with multiple inheritance
    *   -----Case 1----
    *  we cant have two AM in FI
    *   @FunctionalInterface
        interface A {
            void m1();
        }
        @FunctionalInterface
        interface  B extends A{
            void m2();
        }
        * ---Case 2---
        * we can have implicit Am from Object Class
        * @FunctionalInterface
        interface A {
            void m1();
            * int hashCode();
        }
        @FunctionalInterface
        interface  B extends A{
            --- no Am ----
        }
        * ---Case 3---
        * we get compile time error coz of two Am  from A and B
        *
        @FunctionalInterface
        interface A {
            void m1();
        }
        @FunctionalInterface
        interface  B {
            void m2();
        }
        @FunctionalInterface
        interface  C extends A,B {
            --no Am---
        }
        *  ---Case 4---
        * we did not get compile time error coz of two Am  from A and B have same method sign.
        *
        @FunctionalInterface
        interface A {
            void m1();
        }
        @FunctionalInterface
        interface  B {
            void m1();
        }
        @FunctionalInterface
        interface  C extends A,B {
            --no Am---
        }*/





}


