package history;

import history.model.EventList;
import history.model.FilteredTableModel;
import history.model.filter.LocationFilter;
import history.model.filter.NullFilter;
import history.ui.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class FilterController implements ActionListener, Observer {

    View view;
    EventList events;

    FilteredTableModel currentFilter;

    public FilterController(View view, EventList events) {
        this.view = view;
        this.events = events;

        events.addObserver(this);
        view.addFilterListener(this);

        this.currentFilter = new FilteredTableModel(events, new NullFilter());
        view.setTableModel(currentFilter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final String filterText = ((JMenuItem) e.getSource()).getText();

        currentFilter = new FilteredTableModel(events,
                filterText.equals(View.FILTER_ALL_TEXT) ? new NullFilter() : new LocationFilter(filterText));

        view.setTableModel(currentFilter);
    }

    @Override
    public void update(Observable o, Object arg) {
        currentFilter.fireTableDataChanged();
    }

}
