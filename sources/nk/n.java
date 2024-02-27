package nk;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f29881e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f29882f;

    public /* synthetic */ n(EditText editText, ImageView imageView) {
        this.f29881e = editText;
        this.f29882f = imageView;
    }

    public final void onClick(View view) {
        MobUpdateAdhar.d3(this.f29881e, this.f29882f, view);
    }
}
