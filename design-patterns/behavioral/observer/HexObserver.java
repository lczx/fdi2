import java.util.Observable;
import java.util.Observer;

public class HexObserver implements Observer {

    private Subject subject;

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("HEx string: " + Integer.toHexString(subject.getState()).toUpperCase());
    }

}
