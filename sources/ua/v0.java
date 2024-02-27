package ua;

import android.view.KeyEvent;
import android.view.View;
import com.nic.mparivahan.Dl.NewDlSearch;

public final /* synthetic */ class v0 implements View.OnKeyListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ NewDlSearch f17190e;

    public /* synthetic */ v0(NewDlSearch newDlSearch) {
        this.f17190e = newDlSearch;
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        return NewDlSearch.m2(this.f17190e, view, i10, keyEvent);
    }
}
