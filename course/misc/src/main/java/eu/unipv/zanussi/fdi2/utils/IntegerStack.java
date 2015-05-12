package eu.unipv.zanussi.fdi2.utils;

/**
 * The almighty integer stack!!! like {@link java.util.Stack}
 * without values verification, may raise {@link IndexOutOfBoundsException}.
 */
public class IntegerStack {

    private int counter; // = 0
    private int[] values; // = null  << This encapsulates the array, ints length and so...

    public IntegerStack(int size) {
        this.values = new int[size];
    }

    public boolean push(int value) {
        if (counter < values.length) {
            values[counter++] = value; // Counter is used, then incremented
            return true; // Success
        }
        return false; // Fail
    }

    public int pop() {
        if (counter > 0)
            return values[--counter];
        return 0;
    }

}
