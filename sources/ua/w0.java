package ua;

import android.view.KeyEvent;
import android.view.View;
import com.nic.mparivahan.Dl.NewDlSearch;

public final /* synthetic */ class w0 implements View.OnKeyListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ NewDlSearch f17194e;

    public /* synthetic */ w0(NewDlSearch newDlSearch) {
        this.f17194e = newDlSearch;
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return NewDlSearch.Y1(this.f17194e, view, i10, keyEvent);
    }
}
