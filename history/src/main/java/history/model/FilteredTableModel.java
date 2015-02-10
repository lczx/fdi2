package history.model;

import history.model.filter.Predicate;

import javax.swing.table.AbstractTableModel;
import java.util.SortedSet;
import java.util.TreeSet;

public class FilteredTableModel extends AbstractTableModel {

    EventList eventList;
    SortedSet<HistoryEvent> eventSubset;
    Predicate<HistoryEvent> filter;

    public FilteredTableModel(EventList eventList, Predicate<HistoryEvent> filter) {
        this.eventList = eventList;
        this.filter = filter;
        refreshData();
    }

    @Override
    public int getRowCount() {
        return eventSubset.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        int i = 0;
        for (HistoryEvent e : eventSubset) {
            if (i == rowIndex) {
                switch (columnIndex) {
                    case 0: return e.getName();
                    case 1: return e.getYear();
                    case 2: return e.getLocation();
                }
            }
            i++;
        }
        return null;
    }

    private void refreshData() {
        eventSubset = new TreeSet<HistoryEvent>();
        for (HistoryEvent e : eventList.getEvents()) {
            if (filter.run(e)) eventSubset.add(e);
        }
    }

    @Override
    public void fireTableDataChanged() {
        refreshData();
        super.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Name";
            case 1: return "Date";
            case 2: return "Location";
            default: return "unknown";
        }
    }

}
