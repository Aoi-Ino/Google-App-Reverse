package ai;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import cm.u;
import com.nic.mparivahan.VahanServices.VahanView.VahanGenerateOTPScreen;

public final /* synthetic */ class a3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanGenerateOTPScreen f19089e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f19090f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f19091g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f19092h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TextView f19093i;

    public /* synthetic */ a3(VahanGenerateOTPScreen vahanGenerateOTPScreen, TextView textView, u uVar, Context context, TextView textView2) {
        this.f19089e = vahanGenerateOTPScreen;
        this.f19090f = textView;
        this.f19091g = uVar;
        this.f19092h = context;
        this.f19093i = textView2;
    }

    public final void onClick(View view) {
        VahanGenerateOTPScreen.h3(this.f19089e, this.f19090f, this.f19091g, this.f19092h, this.f19093i, view);
    }
}
