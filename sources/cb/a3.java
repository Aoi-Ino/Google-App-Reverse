package cb;

import android.view.KeyEvent;
import android.widget.TextView;
import com.nic.mparivahan.Echallan.TranscationStatusActivity;

public final /* synthetic */ class a3 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TranscationStatusActivity f4794a;

    public /* synthetic */ a3(TranscationStatusActivity transcationStatusActivity) {
        this.f4794a = transcationStatusActivity;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return TranscationStatusActivity.y1(this.f4794a, textView, i10, keyEvent);
    }
}
