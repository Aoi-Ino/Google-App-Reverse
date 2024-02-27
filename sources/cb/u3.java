package cb;

import android.view.KeyEvent;
import android.widget.TextView;
import com.nic.mparivahan.Echallan.VerifyPaymentChallanList;

public final /* synthetic */ class u3 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VerifyPaymentChallanList f4906a;

    public /* synthetic */ u3(VerifyPaymentChallanList verifyPaymentChallanList) {
        this.f4906a = verifyPaymentChallanList;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return VerifyPaymentChallanList.B1(this.f4906a, textView, i10, keyEvent);
    }
}
