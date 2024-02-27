package ai;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.VahanServices.VahanView.VahanProcessWithAdhar;

public final /* synthetic */ class p4 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f19220e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f19221f;

    public /* synthetic */ p4(EditText editText, ImageView imageView) {
        this.f19220e = editText;
        this.f19221f = imageView;
    }

    public final void onClick(View view) {
        VahanProcessWithAdhar.w2(this.f19220e, this.f19221f, view);
    }
}
