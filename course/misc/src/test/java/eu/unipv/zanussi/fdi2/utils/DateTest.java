package eu.unipv.zanussi.fdi2.utils;

public class DateTest {

    public static void main(String[] args) {
        Date date = new Date(20,34,12);
        System.out.println(date.getMonth());
        date.setMonth(-4);
        System.out.println(date.getMonth());

        for (int m = 1; m < 13; m++) {
            date.setMonth(m);
            date.setDay(50);
            System.out.printf("\t%d\t%d\t%d\n", date.getYear(), date.getMonth(), date.getDay());
        }
    }

}
