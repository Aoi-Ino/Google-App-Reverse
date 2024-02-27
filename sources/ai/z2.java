package ai;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.VahanServices.VahanView.VahanGenerateOTPScreen;

public final /* synthetic */ class z2 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f19311e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f19312f;

    public /* synthetic */ z2(EditText editText, ImageView imageView) {
        this.f19311e = editText;
        this.f19312f = imageView;
    }

    public final void onClick(View view) {
        VahanGenerateOTPScreen.g3(this.f19311e, this.f19312f, view);
    }
}
