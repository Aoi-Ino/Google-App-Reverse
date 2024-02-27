package wc;

import android.view.MenuItem;
import android.widget.PopupMenu;

public final /* synthetic */ class n implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f18099a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f18100b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18101c;

    public /* synthetic */ n(o oVar, String str, int i10) {
        this.f18099a = oVar;
        this.f18100b = str;
        this.f18101c = i10;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return o.M(this.f18099a, this.f18100b, this.f18101c, menuItem);
    }
}
