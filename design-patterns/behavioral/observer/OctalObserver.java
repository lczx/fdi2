import java.util.Observable;
import java.util.Observer;

public class OctalObserver implements Observer {

    private Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Octal string: " + Integer.toOctalString(subject.getState()));
    }

}
