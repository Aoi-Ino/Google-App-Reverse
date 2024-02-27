package nk;

import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar;

public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f29891e;

    public /* synthetic */ r(EditText editText) {
        this.f29891e = editText;
    }

    public final void onClick(View view) {
        MobUpdateAdhar.g3(this.f29891e, view);
    }
}
