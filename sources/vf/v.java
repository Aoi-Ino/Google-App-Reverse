package vf;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f32299e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f32300f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f32301g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ NomineeMainViewScreen f32302h;

    public /* synthetic */ v(Dialog dialog, Context context, String str, NomineeMainViewScreen nomineeMainViewScreen) {
        this.f32299e = dialog;
        this.f32300f = context;
        this.f32301g = str;
        this.f32302h = nomineeMainViewScreen;
    }

    public final void onClick(View view) {
        NomineeMainViewScreen.w1(this.f32299e, this.f32300f, this.f32301g, this.f32302h, view);
    }
}
