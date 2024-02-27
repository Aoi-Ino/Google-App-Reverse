package z8;

import android.view.KeyEvent;
import android.widget.TextView;
import com.nic.mparivahan.Checkpost.CheckPostSearchList;

public final /* synthetic */ class k implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckPostSearchList f18940a;

    public /* synthetic */ k(CheckPostSearchList checkPostSearchList) {
        this.f18940a = checkPostSearchList;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return CheckPostSearchList.s1(this.f18940a, textView, i10, keyEvent);
    }
}
