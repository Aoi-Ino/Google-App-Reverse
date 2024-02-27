package ub;

import android.app.Dialog;
import android.view.View;
import android.widget.CompoundButton;
import com.nic.mparivahan.LLServices.editlearnerlicence.Activity.SelectedCovDetailsScreen;

public final /* synthetic */ class b0 implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Dialog f17219e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SelectedCovDetailsScreen f17220f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f17221g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f17222h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ CompoundButton f17223i;

    public /* synthetic */ b0(Dialog dialog, SelectedCovDetailsScreen selectedCovDetailsScreen, int i10, String str, CompoundButton compoundButton) {
        this.f17219e = dialog;
        this.f17220f = selectedCovDetailsScreen;
        this.f17221g = i10;
        this.f17222h = str;
        this.f17223i = compoundButton;
    }

    public final void onClick(View view) {
        SelectedCovDetailsScreen.E1(this.f17219e, this.f17220f, this.f17221g, this.f17222h, this.f17223i, view);
    }
}
