package wc;

import android.view.View;
import com.nic.mparivahan.RC.Model.RecentSearch;
import wc.p0;

public final /* synthetic */ class n0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p0 f18102e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p0.a f18103f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ RecentSearch f18104g;

    public /* synthetic */ n0(p0 p0Var, p0.a aVar, RecentSearch recentSearch) {
        this.f18102e = p0Var;
        this.f18103f = aVar;
        this.f18104g = recentSearch;
    }

    public final void onClick(View view) {
        p0.H(this.f18102e, this.f18103f, this.f18104g, view);
    }
}
