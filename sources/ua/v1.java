package ua;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.Dl.SearchDL;

public final /* synthetic */ class v1 implements View.OnKeyListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f17191e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f17192f;

    public /* synthetic */ v1(EditText editText, EditText editText2) {
        this.f17191e = editText;
        this.f17192f = editText2;
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return SearchDL.D2(this.f17191e, this.f17192f, view, i10, keyEvent);
    }
}
