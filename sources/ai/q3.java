package ai;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanView.VahanMainViewScreen;

public final /* synthetic */ class q3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f19228e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f19229f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f19230g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ VahanMainViewScreen f19231h;

    public /* synthetic */ q3(Dialog dialog, Context context, String str, VahanMainViewScreen vahanMainViewScreen) {
        this.f19228e = dialog;
        this.f19229f = context;
        this.f19230g = str;
        this.f19231h = vahanMainViewScreen;
    }

    public final void onClick(View view) {
        VahanMainViewScreen.w1(this.f19228e, this.f19229f, this.f19230g, this.f19231h, view);
    }
}
