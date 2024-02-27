package zb;

import android.view.View;
import cm.u;
import com.nic.mparivahan.Language.Modle.Language;
import zb.d;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f18992e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Language f18993f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f18994g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f18995h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ d.a f18996i;

    public /* synthetic */ c(d dVar, Language language, int i10, u uVar, d.a aVar) {
        this.f18992e = dVar;
        this.f18993f = language;
        this.f18994g = i10;
        this.f18995h = uVar;
        this.f18996i = aVar;
    }

    public final void onClick(View view) {
        d.C(this.f18992e, this.f18993f, this.f18994g, this.f18995h, this.f18996i, view);
    }
}
