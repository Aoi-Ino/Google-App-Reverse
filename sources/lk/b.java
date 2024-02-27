package lk;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo.SarathiLog;
import ld.c;
import lk.e;

public final /* synthetic */ class b implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f24904a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.a f24905b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SarathiLog f24906c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f24907d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f24908e;

    public /* synthetic */ b(e eVar, e.a aVar, SarathiLog sarathiLog, c cVar, int i10) {
        this.f24904a = eVar;
        this.f24905b = aVar;
        this.f24906c = sarathiLog;
        this.f24907d = cVar;
        this.f24908e = i10;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return e.H(this.f24904a, this.f24905b, this.f24906c, this.f24907d, this.f24908e, menuItem);
    }
}
