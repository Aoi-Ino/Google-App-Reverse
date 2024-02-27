package cb;

import android.view.KeyEvent;
import android.widget.TextView;
import com.nic.mparivahan.Echallan.SearchPrintReceiptListActivity;

public final /* synthetic */ class v2 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchPrintReceiptListActivity f4910a;

    public /* synthetic */ v2(SearchPrintReceiptListActivity searchPrintReceiptListActivity) {
        this.f4910a = searchPrintReceiptListActivity;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return SearchPrintReceiptListActivity.w1(this.f4910a, textView, i10, keyEvent);
    }
}
