package androidx.core.widget;

import android.widget.ListView;

public abstract class g {

    static class a {
        static boolean a(ListView listView, int i10) {
            return listView.canScrollList(i10);
        }

        static void b(ListView listView, int i10) {
            listView.scrollListBy(i10);
        }
    }

    public static void a(ListView listView, int i10) {
        a.b(listView, i10);
    }
}
