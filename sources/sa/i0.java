package sa;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.nic.mparivahan.Dashboard.ui.VirtualDocScreen;

public final /* synthetic */ class i0 implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VirtualDocScreen f16097a;

    public /* synthetic */ i0(VirtualDocScreen virtualDocScreen) {
        this.f16097a = virtualDocScreen;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return VirtualDocScreen.N1(this.f16097a, menuItem);
    }
}
