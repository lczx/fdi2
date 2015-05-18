package eu.unipv.zanussi.fdi2.exceptions;

public class Example01 {

    public static void main(String[] args) {
        try {
            throw new Exception("Example01");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Still here!");
    }

}
