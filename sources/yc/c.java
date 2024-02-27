package yc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import yc.i;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f18669e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ImageView f18670f;

    public /* synthetic */ c(EditText editText, ImageView imageView) {
        this.f18669e = editText;
        this.f18670f = imageView;
    }

    public final void onClick(View view) {
        i.a.n(this.f18669e, this.f18670f, view);
    }
}
