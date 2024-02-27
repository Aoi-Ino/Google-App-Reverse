package androidx.core.view;

import android.support.v4.media.session.b;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class t {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f2665a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList f2666b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Map f2667c = new HashMap();

    public t(Runnable runnable) {
        this.f2665a = runnable;
    }

    public void a(v vVar) {
        this.f2666b.add(vVar);
        this.f2665a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f2666b.iterator();
        while (it.hasNext()) {
            ((v) it.next()).c(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.f2666b.iterator();
        while (it.hasNext()) {
            ((v) it.next()).b(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.f2666b.iterator();
        while (it.hasNext()) {
            if (((v) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.f2666b.iterator();
        while (it.hasNext()) {
            ((v) it.next()).d(menu);
        }
    }

    public void f(v vVar) {
        this.f2666b.remove(vVar);
        b.a(this.f2667c.remove(vVar));
        this.f2665a.run();
    }
}
