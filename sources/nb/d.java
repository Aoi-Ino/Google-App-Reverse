package nb;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.nic.mparivahan.FetchVahanLog.Pojo.VahanLog;
import ld.c;
import nb.g;

public final /* synthetic */ class d implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f14226a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VahanLog f14227b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g.a f14228c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f14229d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f14230e;

    public /* synthetic */ d(g gVar, VahanLog vahanLog, g.a aVar, c cVar, int i10) {
        this.f14226a = gVar;
        this.f14227b = vahanLog;
        this.f14228c = aVar;
        this.f14229d = cVar;
        this.f14230e = i10;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return g.H(this.f14226a, this.f14227b, this.f14228c, this.f14229d, this.f14230e, menuItem);
    }
}
