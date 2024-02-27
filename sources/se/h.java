package se;

import android.view.View;
import android.widget.EditText;
import cm.u;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.PassangerResultActivity;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EditText f31218e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EditText f31219f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ EditText f31220g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ PassangerResultActivity f31221h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ u f31222i;

    public /* synthetic */ h(EditText editText, EditText editText2, EditText editText3, PassangerResultActivity passangerResultActivity, u uVar) {
        this.f31218e = editText;
        this.f31219f = editText2;
        this.f31220g = editText3;
        this.f31221h = passangerResultActivity;
        this.f31222i = uVar;
    }

    public final void onClick(View view) {
        PassangerResultActivity.r1(this.f31218e, this.f31219f, this.f31220g, this.f31221h, this.f31222i, view);
    }
}
