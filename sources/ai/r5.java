package ai;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanSelectServiceScreen;

public final /* synthetic */ class r5 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19249e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f19250f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f19251g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ VahanSelectServiceScreen f19252h;

    public /* synthetic */ r5(Dialog dialog, Context context, String str, VahanSelectServiceScreen vahanSelectServiceScreen) {
        this.f19249e = dialog;
        this.f19250f = context;
        this.f19251g = str;
        this.f19252h = vahanSelectServiceScreen;
    }

    public final void onClick(View view) {
        VahanSelectServiceScreen.N1(this.f19249e, this.f19250f, this.f19251g, this.f19252h, view);
    }
}
