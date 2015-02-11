package history;

import history.model.EventList;
import history.ui.View;

public class Application {

    // TODO: Add File saving facilities (see documentation)

    public static void main(String[] args) {
        EventList model = new EventList();
        View view = new View("History Channel");

        new DataUpdateController(view, model);
        new FilterController(view, model);
    }

}
