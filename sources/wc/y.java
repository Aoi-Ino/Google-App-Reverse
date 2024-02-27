package wc;

import android.view.MenuItem;
import android.widget.PopupMenu;
import cm.u;

public final /* synthetic */ class y implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0 f18148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f18149b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u f18150c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f18151d;

    public /* synthetic */ y(b0 b0Var, String str, u uVar, int i10) {
        this.f18148a = b0Var;
        this.f18149b = str;
        this.f18150c = uVar;
        this.f18151d = i10;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return b0.L(this.f18148a, this.f18149b, this.f18150c, this.f18151d, menuItem);
    }
}
