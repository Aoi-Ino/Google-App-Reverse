package x8;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.AddCov.View.CovApplication;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ CovApplication f18217e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f18218f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f18219g;

    public /* synthetic */ e(CovApplication covApplication, TextView textView, TextView textView2) {
        this.f18217e = covApplication;
        this.f18218f = textView;
        this.f18219g = textView2;
    }

    public final void onClick(View view) {
        CovApplication.n2(this.f18217e, this.f18218f, this.f18219g, view);
    }
}
