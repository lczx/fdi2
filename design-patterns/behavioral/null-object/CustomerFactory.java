public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name2) {
        for (String name1: names)
            if (name1.equalsIgnoreCase(name2)) return new RealCustomer(name2);

        return new NullCustomer();
    }

}
