package zh;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f33197e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f33198f;

    public /* synthetic */ d(Dialog dialog, Context context) {
        this.f33197e = dialog;
        this.f33198f = context;
    }

    public final void onClick(View view) {
        VUtility.a.w(this.f33197e, this.f33198f, view);
    }
}
