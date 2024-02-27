package ql;

import cm.l;
import java.util.Collections;
import java.util.List;

abstract class u extends t {
    public static void u(List list) {
        l.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
