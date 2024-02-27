package ua;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.nic.mparivahan.Dl.DLDashboardNew;

public final /* synthetic */ class p implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DLDashboardNew f17159a;

    public /* synthetic */ p(DLDashboardNew dLDashboardNew) {
        this.f17159a = dLDashboardNew;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return DLDashboardNew.r2(this.f17159a, menuItem);
    }
}
