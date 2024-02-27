package sa;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.nic.mparivahan.Dashboard.ui.VirtualDocScreen;

public final /* synthetic */ class r0 implements View.OnKeyListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f16114e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f16115f;

    public /* synthetic */ r0(EditText editText, EditText editText2) {
        this.f16114e = editText;
        this.f16115f = editText2;
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return VirtualDocScreen.W1(this.f16114e, this.f16115f, view, i10, keyEvent);
    }
}
