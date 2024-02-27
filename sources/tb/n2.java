package tb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.LLServices.UI.LlSlots;

public final /* synthetic */ class n2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LlSlots f16802e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f16803f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Dialog f16804g;

    public /* synthetic */ n2(LlSlots llSlots, int i10, Dialog dialog) {
        this.f16802e = llSlots;
        this.f16803f = i10;
        this.f16804g = dialog;
    }

    public final void onClick(View view) {
        LlSlots.X1(this.f16802e, this.f16803f, this.f16804g, view);
    }
}
