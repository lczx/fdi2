package eu.unipv.zanussi.fdi2.exceptions;

public class Example02 {

    public static void doSomethingBase() {
        throw new RuntimeException("Example02");
    }

    public static void doSomething() {
        doSomethingBase();
    }

    public static void main(String[] args) {
        try {
            doSomething();
            System.out.println("Not written!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Ahaha!");
    }

}
