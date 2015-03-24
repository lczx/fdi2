import java.util.Observable;
import java.util.Observer;

public class BinaryObserver implements Observer {

    private Subject subject;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Binary string: " + Integer.toBinaryString(subject.getState()));
    }
    
}
