package ep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

class j2 extends LinkedHashMap implements Iterable {
    public Iterator iterator() {
        return values().iterator();
    }

    public List r() {
        Collection values = values();
        return !values.isEmpty() ? new ArrayList(values) : Collections.emptyList();
    }
}
