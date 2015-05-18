package eu.unipv.zanussi.fdi2.template;

public class TemplateTest {

    public static void main(String[] args) {
        TemplateClass<String> t1 = new TemplateClass<>("Ciao", 0);
        TemplateClass<Integer> t2 = new TemplateClass<>(1, 1);
        TemplateClass<Double> t3 = new TemplateClass<>(1.0, 1);
    }

}
