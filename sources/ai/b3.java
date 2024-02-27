package ai;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import cm.u;
import com.nic.mparivahan.VahanServices.VahanView.VahanGenerateOTPScreen;

public final /* synthetic */ class b3 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f19102e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f19103f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f19104g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ VahanGenerateOTPScreen f19105h;

    public /* synthetic */ b3(EditText editText, Context context, u uVar, VahanGenerateOTPScreen vahanGenerateOTPScreen) {
        this.f19102e = editText;
        this.f19103f = context;
        this.f19104g = uVar;
        this.f19105h = vahanGenerateOTPScreen;
    }

    public final void onClick(View view) {
        VahanGenerateOTPScreen.i3(this.f19102e, this.f19103f, this.f19104g, this.f19105h, view);
    }
}
