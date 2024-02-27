package og;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;

public final /* synthetic */ class e0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppCompatEditText f30031e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f30032f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f30033g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f0 f30034h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f30035i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f30036j;

    public /* synthetic */ e0(AppCompatEditText appCompatEditText, Context context, Dialog dialog, f0 f0Var, String str, int i10) {
        this.f30031e = appCompatEditText;
        this.f30032f = context;
        this.f30033g = dialog;
        this.f30034h = f0Var;
        this.f30035i = str;
        this.f30036j = i10;
    }

    public final void onClick(View view) {
        f0.F(this.f30031e, this.f30032f, this.f30033g, this.f30034h, this.f30035i, this.f30036j, view);
    }
}
