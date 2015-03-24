package history.model.filter;

import history.model.HistoryEvent;

public class LocationFilter implements Predicate<HistoryEvent> {

    String locationValue;

    public LocationFilter(String locationValue) {
        this.locationValue = locationValue;
    }

    @Override
    public boolean run(HistoryEvent arg) {
        return arg.getLocation().equalsIgnoreCase(locationValue);
    }

}
