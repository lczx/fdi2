import part.Computer;
import part.ComputerPart;
import visitor.*;

public class Pattern {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
