package part;

import visitor.ComputerPartVisitor;

public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);

}
