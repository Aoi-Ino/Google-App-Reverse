package kb;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.nic.mparivahan.FetchChallanLog.PojoChallan.MparEchallanLog;
import kb.e;
import ld.c;

public final /* synthetic */ class b implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f13164a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MparEchallanLog f13165b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e.a f13166c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f13167d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13168e;

    public /* synthetic */ b(e eVar, MparEchallanLog mparEchallanLog, e.a aVar, c cVar, int i10) {
        this.f13164a = eVar;
        this.f13165b = mparEchallanLog;
        this.f13166c = aVar;
        this.f13167d = cVar;
        this.f13168e = i10;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return e.G(this.f13164a, this.f13165b, this.f13166c, this.f13167d, this.f13168e, menuItem);
    }
}
