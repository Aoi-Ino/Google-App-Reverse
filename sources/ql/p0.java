package ql;

import cm.l;
import java.util.Collections;
import java.util.Set;
import rl.h;

abstract class p0 {
    public static Set a(Set set) {
        l.f(set, "builder");
        return ((h) set).n();
    }

    public static Set b() {
        return new h();
    }

    public static Set c(Object obj) {
        Set singleton = Collections.singleton(obj);
        l.e(singleton, "singleton(element)");
        return singleton;
    }
}
