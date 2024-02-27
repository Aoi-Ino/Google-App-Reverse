package ua;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.Dl.NewDlSearch;

public final /* synthetic */ class f1 implements View.OnKeyListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f17101e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f17102f;

    public /* synthetic */ f1(EditText editText, EditText editText2) {
        this.f17101e = editText;
        this.f17102f = editText2;
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return NewDlSearch.K2(this.f17101e, this.f17102f, view, i10, keyEvent);
    }
}
