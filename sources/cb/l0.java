package cb;

import android.view.KeyEvent;
import android.widget.TextView;
import com.nic.mparivahan.Echallan.PaymentSearchChallanList;

public final /* synthetic */ class l0 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PaymentSearchChallanList f4850a;

    public /* synthetic */ l0(PaymentSearchChallanList paymentSearchChallanList) {
        this.f4850a = paymentSearchChallanList;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return PaymentSearchChallanList.K1(this.f4850a, textView, i10, keyEvent);
    }
}
