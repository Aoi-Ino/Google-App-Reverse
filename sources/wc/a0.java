package wc;

import android.app.Dialog;
import android.view.View;

public final /* synthetic */ class a0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17992e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b0 f17993f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f17994g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f17995h;

    public /* synthetic */ a0(Dialog dialog, b0 b0Var, String str, int i10) {
        this.f17992e = dialog;
        this.f17993f = b0Var;
        this.f17994g = str;
        this.f17995h = i10;
    }

    public final void onClick(View view) {
        b0.P(this.f17992e, this.f17993f, this.f17994g, this.f17995h, view);
    }
}
