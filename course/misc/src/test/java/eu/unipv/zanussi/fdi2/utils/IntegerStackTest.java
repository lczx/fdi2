package eu.unipv.zanussi.fdi2.utils;

public class IntegerStackTest {

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(2);
        stack.push(1);
        stack.push(2);
        stack.push(4); // Ignored
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 1
        System.out.println(stack.pop()); // 0
    }

}
