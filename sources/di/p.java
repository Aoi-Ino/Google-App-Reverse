package di;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanConfirmUpdateMobileActivity;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f22875e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f22876f;

    public /* synthetic */ p(EditText editText, ImageView imageView) {
        this.f22875e = editText;
        this.f22876f = imageView;
    }

    public final void onClick(View view) {
        VahanConfirmUpdateMobileActivity.n2(this.f22875e, this.f22876f, view);
    }
}
