package nk;

import android.view.View;
import android.widget.ProgressBar;
import com.nic.mparivahan.sarathithreeservices.adharmobile.ConfirmMobNo;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ProgressBar f29870e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ConfirmMobNo f29871f;

    public /* synthetic */ e(ProgressBar progressBar, ConfirmMobNo confirmMobNo) {
        this.f29870e = progressBar;
        this.f29871f = confirmMobNo;
    }

    public final void onClick(View view) {
        ConfirmMobNo.N1(this.f29870e, this.f29871f, view);
    }
}
