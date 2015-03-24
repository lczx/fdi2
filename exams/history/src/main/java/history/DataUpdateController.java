package history;

import history.model.EventList;
import history.ui.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataUpdateController implements ActionListener {

    View view;
    EventList events;

    public DataUpdateController(View view, EventList events) {
        this.view = view;
        this.events = events;
        view.addTextBoxListener(this);
    }

    // On Text Boxes input; add a new HistoryEvent
    @Override
    public void actionPerformed(ActionEvent e) {
        String data[] = view.getTextInput();
        if (data[0].equals("") || data[1].equals("")) return;

        events.addEvent(data[0], data[1], data[2]);
    }

}
