package ep;

import java.util.Iterator;
import java.util.LinkedHashMap;

class v extends LinkedHashMap implements Iterable {
    v() {
    }

    public Iterator iterator() {
        return values().iterator();
    }
}
