package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;
import o.g;

public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f809a;

    /* renamed from: b  reason: collision with root package name */
    final b f810b;

    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f811a;

        /* renamed from: b  reason: collision with root package name */
        final Context f812b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList f813c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        final g f814d = new g();

        public a(Context context, ActionMode.Callback callback) {
            this.f812b = context;
            this.f811a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f814d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f812b, (x.a) menu);
            this.f814d.put(menu, oVar);
            return oVar;
        }

        public boolean a(b bVar, Menu menu) {
            return this.f811a.onPrepareActionMode(e(bVar), f(menu));
        }

        public void b(b bVar) {
            this.f811a.onDestroyActionMode(e(bVar));
        }

        public boolean c(b bVar, MenuItem menuItem) {
            return this.f811a.onActionItemClicked(e(bVar), new j(this.f812b, (x.b) menuItem));
        }

        public boolean d(b bVar, Menu menu) {
            return this.f811a.onCreateActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f813c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f813c.get(i10);
                if (fVar != null && fVar.f810b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f812b, bVar);
            this.f813c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f809a = context;
        this.f810b = bVar;
    }

    public void finish() {
        this.f810b.c();
    }

    public View getCustomView() {
        return this.f810b.d();
    }

    public Menu getMenu() {
        return new o(this.f809a, (x.a) this.f810b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f810b.f();
    }

    public CharSequence getSubtitle() {
        return this.f810b.g();
    }

    public Object getTag() {
        return this.f810b.h();
    }

    public CharSequence getTitle() {
        return this.f810b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.f810b.j();
    }

    public void invalidate() {
        this.f810b.k();
    }

    public boolean isTitleOptional() {
        return this.f810b.l();
    }

    public void setCustomView(View view) {
        this.f810b.m(view);
    }

    public void setSubtitle(int i10) {
        this.f810b.n(i10);
    }

    public void setTag(Object obj) {
        this.f810b.p(obj);
    }

    public void setTitle(int i10) {
        this.f810b.q(i10);
    }

    public void setTitleOptionalHint(boolean z10) {
        this.f810b.s(z10);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f810b.o(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f810b.r(charSequence);
    }
}
