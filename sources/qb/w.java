package qb;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.LLMainScreen.LlApplicationNumber;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f15355e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LlApplicationNumber f15356f;

    public /* synthetic */ w(Dialog dialog, LlApplicationNumber llApplicationNumber) {
        this.f15355e = dialog;
        this.f15356f = llApplicationNumber;
    }

    public final void onClick(View view) {
        LlApplicationNumber.E1(this.f15355e, this.f15356f, view);
    }
}
