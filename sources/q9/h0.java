package q9;

import android.widget.RadioGroup;
import com.nic.mparivahan.ClServices.View.NewCl.NewClTwo;

public final /* synthetic */ class h0 implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NewClTwo f15252a;

    public /* synthetic */ h0(NewClTwo newClTwo) {
        this.f15252a = newClTwo;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
        NewClTwo.P2(this.f15252a, radioGroup, i10);
    }
}
