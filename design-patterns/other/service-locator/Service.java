public interface Service {

    public String getName();

    public default void execute() {
        System.out.println("Executing " + getName());
    }

}
