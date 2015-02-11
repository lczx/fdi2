package history.model;

import java.util.Observable;
import java.util.SortedSet;
import java.util.TreeSet;

public class EventList extends Observable {

    SortedSet<HistoryEvent> events = new TreeSet<HistoryEvent>();

    public void addEvent(String name, String year, String location) {
        getEvents().add(new HistoryEvent(name, Integer.parseInt(year), location));
        setChanged();
        notifyObservers();
    }

    public SortedSet<HistoryEvent> getEvents() {
        return events;
    }

}
