package cc;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.nic.mparivahan.NewDesignActivity.VirtualDlActivity;

public final /* synthetic */ class c0 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VirtualDlActivity f4936a;

    public /* synthetic */ c0(VirtualDlActivity virtualDlActivity) {
        this.f4936a = virtualDlActivity;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return VirtualDlActivity.x1(this.f4936a, menuItem);
    }
}
