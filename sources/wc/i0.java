package wc;

import android.view.MenuItem;
import android.widget.PopupMenu;
import cm.u;

public final /* synthetic */ class i0 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l0 f18060a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f18061b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18062c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u f18063d;

    public /* synthetic */ i0(l0 l0Var, u uVar, int i10, u uVar2) {
        this.f18060a = l0Var;
        this.f18061b = uVar;
        this.f18062c = i10;
        this.f18063d = uVar2;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return l0.T(this.f18060a, this.f18061b, this.f18062c, this.f18063d, menuItem);
    }
}
