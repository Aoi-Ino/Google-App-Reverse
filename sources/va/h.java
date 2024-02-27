package va;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.nic.mparivahan.RC.Model.RecentSearch;

public final /* synthetic */ class h implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f17608a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RecentSearch f17609b;

    public /* synthetic */ h(i iVar, RecentSearch recentSearch) {
        this.f17608a = iVar;
        this.f17609b = recentSearch;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return i.I(this.f17608a, this.f17609b, menuItem);
    }
}
