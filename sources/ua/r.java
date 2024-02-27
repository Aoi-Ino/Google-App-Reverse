package ua;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.Dl.DLDashboardNew;

public final /* synthetic */ class r implements View.OnKeyListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f17169e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f17170f;

    public /* synthetic */ r(EditText editText, EditText editText2) {
        this.f17169e = editText;
        this.f17170f = editText2;
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return DLDashboardNew.p3(this.f17169e, this.f17170f, view, i10, keyEvent);
    }
}
