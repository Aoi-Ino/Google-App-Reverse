package ai;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.VahanServices.VahanView.VahanProcessWithAdhar;

public final /* synthetic */ class q4 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ VahanProcessWithAdhar f19232e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f19233f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f19234g;

    public /* synthetic */ q4(VahanProcessWithAdhar vahanProcessWithAdhar, TextView textView, TextView textView2) {
        this.f19232e = vahanProcessWithAdhar;
        this.f19233f = textView;
        this.f19234g = textView2;
    }

    public final void onClick(View view) {
        VahanProcessWithAdhar.x2(this.f19232e, this.f19233f, this.f19234g, view);
    }
}
