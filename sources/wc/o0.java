package wc;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.nic.mparivahan.RC.Model.RecentSearch;

public final /* synthetic */ class o0 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p0 f18110a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RecentSearch f18111b;

    public /* synthetic */ o0(p0 p0Var, RecentSearch recentSearch) {
        this.f18110a = p0Var;
        this.f18111b = recentSearch;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return p0.I(this.f18110a, this.f18111b, menuItem);
    }
}
