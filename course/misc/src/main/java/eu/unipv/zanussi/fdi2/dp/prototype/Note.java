package eu.unipv.zanussi.fdi2.dp.prototype;

/** Note class, example of the prototype design pattern. */
public class Note {

    private float length;
    private int value;

    public Note(float length, int value) {
        this.length = length;
        this.value = value;
    }

    /**
     * Creates a copy of this note.
     *
     * If was protected in {@link Object}, so we can redefine it public, but not private.
     * We can also redefine the return type.
     */
    @Override
    public Note clone() {
        return new Note(length, value);
    }

    // TODO

}
