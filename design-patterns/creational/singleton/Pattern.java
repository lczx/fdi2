public class Pattern {

    public static void main(String[] args) {
        // This won't work:
        //   SingleObject object = new SingleObject();

        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }

}
