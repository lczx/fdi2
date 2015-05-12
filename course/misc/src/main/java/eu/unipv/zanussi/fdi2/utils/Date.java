package eu.unipv.zanussi.fdi2.utils;

/**
 * useless Date class to represent a combination of day, month and year.
 */
public class Date {

    private int day, month, year;

    /**
     * Constructor
     * @param day The day
     * @param month Da month
     * @param year Ze year
     */
    public Date(int day, int month, int year) {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    /**
     * Nice toString conversion.
     * @return The string representation of this date
     */
    @Override
    public String toString() {
        return String.format("(%d, %d, %d)", day, month, year);
    }

    /**
     * To get the day
     * @return The day
     */
    public int getDay() {
        return day;
    }

    /**
     * Setter method for day, maximum allowed value depends on month.
     * @param day Mah day
     */
    public void setDay(int day) {
        this.day = Math.max(1, Math.min(getMaxDays(this.month), day));
    }


    /**
     * Getter method, my month value
     * @return The stored month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Setter method of month, which can be in between 1 and 12.
     * @param month The new month
     */
    public void setMonth(int month) {
        this.month = Math.max(1, Math.min(12, month));
        this.setDay(this.day); // Reformat day to keep in between bounds
    }

    /**
     * Year getter
     * @return It
     */
    public int getYear() {
        return year;
    }

    /**
     * Set da year
     * @param year Yeah
     */
    public void setYear(int year) {
        this.year = Math.max(0, year);
    }


    /**
     * Get maximum days in a month; may be useful also outside, keep public.
     * @param month The month we are referencing to
     * @return The number of days in that month
     */
    public static int getMaxDays(int month) {
        int maxDays = 31;
        switch (month) {
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = 28; // February always 28??
                break;
        }
        return maxDays;
    }

}
