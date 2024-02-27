package z7;

import java.util.logging.Level;
import java.util.logging.Logger;

public class d extends e {

    /* renamed from: a  reason: collision with root package name */
    Logger f18916a;

    public d(String str) {
        this.f18916a = Logger.getLogger(str);
    }

    public void b(String str) {
        this.f18916a.log(Level.FINE, str);
    }
}
