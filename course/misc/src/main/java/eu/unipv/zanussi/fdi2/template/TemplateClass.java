package eu.unipv.zanussi.fdi2.template;

public class TemplateClass<E> {

    private E element;
    private int index;

    public TemplateClass(E element, int index) {
        this.element = element;
        this.index = index;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public int getIndex() {
        return index;
    }

}
