package wc;

import android.view.MenuItem;
import android.widget.PopupMenu;
import cm.u;

public final /* synthetic */ class r implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f18127a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f18128b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u f18129c;

    public /* synthetic */ r(u uVar, int i10, u uVar2) {
        this.f18127a = uVar;
        this.f18128b = i10;
        this.f18129c = uVar2;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return u.J(this.f18127a, this.f18128b, this.f18129c, menuItem);
    }
}
