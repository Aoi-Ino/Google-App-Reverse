package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import o.g;
import x.b;

abstract class c {

    /* renamed from: a  reason: collision with root package name */
    final Context f922a;

    /* renamed from: b  reason: collision with root package name */
    private g f923b;

    /* renamed from: c  reason: collision with root package name */
    private g f924c;

    c(Context context) {
        this.f922a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f923b == null) {
            this.f923b = new g();
        }
        MenuItem menuItem2 = (MenuItem) this.f923b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f922a, bVar);
        this.f923b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        g gVar = this.f923b;
        if (gVar != null) {
            gVar.clear();
        }
        g gVar2 = this.f924c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10) {
        if (this.f923b != null) {
            int i11 = 0;
            while (i11 < this.f923b.size()) {
                if (((b) this.f923b.i(i11)).getGroupId() == i10) {
                    this.f923b.k(i11);
                    i11--;
                }
                i11++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i10) {
        if (this.f923b != null) {
            for (int i11 = 0; i11 < this.f923b.size(); i11++) {
                if (((b) this.f923b.i(i11)).getItemId() == i10) {
                    this.f923b.k(i11);
                    return;
                }
            }
        }
    }
}
