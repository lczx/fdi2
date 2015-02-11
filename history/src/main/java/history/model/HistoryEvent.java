package history.model;

import org.jetbrains.annotations.NotNull;

public class HistoryEvent implements Comparable<HistoryEvent> {

    public static final String DEFAULT_LOCATION = "Other";

    public static final String[] LOCATIONS = { // Keep sorted!
            DEFAULT_LOCATION, "Austria", "France", "Germany / Prussia", "England", "Italy", "Russia", "Spain"
    };

    public static int getLocationID(String location) {
        for (int i = 0; i < LOCATIONS.length; i++)
            if (LOCATIONS[i].equalsIgnoreCase(location)) return i;
        return getLocationID(DEFAULT_LOCATION);
    }

    String name;
    int year;
    int locationID;

    public HistoryEvent(String name, int year, String location) {
        this.name = name;
        this.year = year;
        this.locationID = getLocationID(location);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getLocation() {
        return LOCATIONS[locationID];
    }

    @Override
    public int compareTo(@NotNull HistoryEvent that) {
        int result = this.year - that.year;
        if (result != 0) return result;

        result = this.locationID - that.locationID;
        if (result != 0) return result;

        return this.name.compareTo(that.name);
    }

    // HashCode implementation seems not to be needed.

}
