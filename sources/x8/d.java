package x8;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.nic.mparivahan.AddCov.View.CovApplication;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f18215e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f18216f;

    public /* synthetic */ d(EditText editText, ImageView imageView) {
        this.f18215e = editText;
        this.f18216f = imageView;
    }

    public final void onClick(View view) {
        CovApplication.m2(this.f18215e, this.f18216f, view);
    }
}
