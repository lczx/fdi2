package history.model.filter;

import history.model.HistoryEvent;

public class NullFilter implements Predicate<HistoryEvent> {

    @Override
    public boolean run(HistoryEvent arg) {
        return true;
    }

}
