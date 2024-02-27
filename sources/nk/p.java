package nk;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f29886e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MobUpdateAdhar f29887f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TextView f29888g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ImageView f29889h;

    public /* synthetic */ p(EditText editText, MobUpdateAdhar mobUpdateAdhar, TextView textView, ImageView imageView) {
        this.f29886e = editText;
        this.f29887f = mobUpdateAdhar;
        this.f29888g = textView;
        this.f29889h = imageView;
    }

    public final void onClick(View view) {
        MobUpdateAdhar.f3(this.f29886e, this.f29887f, this.f29888g, this.f29889h, view);
    }
}
