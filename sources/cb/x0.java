package cb;

import android.view.KeyEvent;
import android.widget.TextView;
import com.nic.mparivahan.Echallan.ReprintReceiptActivity;

public final /* synthetic */ class x0 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReprintReceiptActivity f4918a;

    public /* synthetic */ x0(ReprintReceiptActivity reprintReceiptActivity) {
        this.f4918a = reprintReceiptActivity;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return ReprintReceiptActivity.z1(this.f4918a, textView, i10, keyEvent);
    }
}
