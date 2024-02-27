package ua;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.Dl.SearchDL;

public final /* synthetic */ class g2 implements View.OnKeyListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f17107e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f17108f;

    public /* synthetic */ g2(EditText editText, EditText editText2) {
        this.f17107e = editText;
        this.f17108f = editText2;
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return SearchDL.K2(this.f17107e, this.f17108f, view, i10, keyEvent);
    }
}
