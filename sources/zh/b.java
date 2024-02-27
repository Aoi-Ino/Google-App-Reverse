package zh;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f33194e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f33195f;

    public /* synthetic */ b(Dialog dialog, Context context) {
        this.f33194e = dialog;
        this.f33195f = context;
    }

    public final void onClick(View view) {
        VUtility.a.z(this.f33194e, this.f33195f, view);
    }
}
