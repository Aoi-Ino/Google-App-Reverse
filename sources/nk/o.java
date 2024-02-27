package nk;

import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MobUpdateAdhar f29883e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f29884f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f29885g;

    public /* synthetic */ o(MobUpdateAdhar mobUpdateAdhar, TextView textView, TextView textView2) {
        this.f29883e = mobUpdateAdhar;
        this.f29884f = textView;
        this.f29885g = textView2;
    }

    public final void onClick(View view) {
        MobUpdateAdhar.e3(this.f29883e, this.f29884f, this.f29885g, view);
    }
}
