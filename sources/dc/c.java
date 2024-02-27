package dc;

import android.view.MenuItem;
import android.widget.PopupMenu;

public final /* synthetic */ class c implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f9956a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9957b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9958c;

    public /* synthetic */ c(d dVar, String str, int i10) {
        this.f9956a = dVar;
        this.f9957b = str;
        this.f9958c = i10;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return d.G(this.f9956a, this.f9957b, this.f9958c, menuItem);
    }
}
