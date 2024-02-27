package cb;

import android.view.KeyEvent;
import android.widget.TextView;
import com.nic.mparivahan.Echallan.SearchPrintChallanListActivity;

public final /* synthetic */ class i2 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchPrintChallanListActivity f4836a;

    public /* synthetic */ i2(SearchPrintChallanListActivity searchPrintChallanListActivity) {
        this.f4836a = searchPrintChallanListActivity;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return SearchPrintChallanListActivity.w1(this.f4836a, textView, i10, keyEvent);
    }
}
