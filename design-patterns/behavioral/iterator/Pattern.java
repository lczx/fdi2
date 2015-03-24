import java.util.Iterator;

public class Pattern {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator itr = namesRepository.getIterator(); itr.hasNext();) {
            String name = (String) itr.next();
            System.out.println("Name: " + name);
        }
    }

}
