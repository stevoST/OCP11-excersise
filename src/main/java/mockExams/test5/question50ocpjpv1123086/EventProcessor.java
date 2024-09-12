package mockExams.test5.question50ocpjpv1123086;

import java.util.Collection;
import java.util.Map;

public class EventProcessor {
    public void processEvents(Collection c) {
        c.forEach(o -> System.out.println(o));
    }
}

class MapEventProcessor extends EventProcessor {
    public void processEvents(Map events) {
        super.processEvents(events.values());
    }
}