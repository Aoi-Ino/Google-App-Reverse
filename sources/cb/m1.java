package cb;

import android.view.KeyEvent;
import android.widget.TextView;
import com.nic.mparivahan.Echallan.SearchChallanListActivity;

public final /* synthetic */ class m1 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchChallanListActivity f4856a;

    public /* synthetic */ m1(SearchChallanListActivity searchChallanListActivity) {
        this.f4856a = searchChallanListActivity;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return SearchChallanListActivity.Q1(this.f4856a, textView, i10, keyEvent);
    }
}
