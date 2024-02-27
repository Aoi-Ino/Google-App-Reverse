package sa;

import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;

public final /* synthetic */ class v implements NavigationView.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DashBoard f16119a;

    public /* synthetic */ v(DashBoard dashBoard) {
        this.f16119a = dashBoard;
    }

    public final boolean a(MenuItem menuItem) {
        return DashBoard.F1(this.f16119a, menuItem);
    }
}
