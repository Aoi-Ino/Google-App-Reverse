package ua;

import android.view.KeyEvent;
import android.widget.TextView;
import com.nic.mparivahan.Dl.SearchDL;

public final /* synthetic */ class f2 implements TextView.OnEditorActionListener {
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return SearchDL.J2(textView, i10, keyEvent);
    }
}
