package q9;

import android.app.Dialog;
import android.view.View;
import com.nic.mparivahan.ClServices.View.NewCl.NewClSubmitScreen;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f15259e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ NewClSubmitScreen f15260f;

    public /* synthetic */ o(Dialog dialog, NewClSubmitScreen newClSubmitScreen) {
        this.f15259e = dialog;
        this.f15260f = newClSubmitScreen;
    }

    public final void onClick(View view) {
        NewClSubmitScreen.B1(this.f15259e, this.f15260f, view);
    }
}
