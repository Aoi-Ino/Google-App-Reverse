package gc;

import android.view.View;
import android.widget.AdapterView;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlSlots;

public final /* synthetic */ class p0 implements AdapterView.OnItemClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DlSlots f11809e;

    public /* synthetic */ p0(DlSlots dlSlots) {
        this.f11809e = dlSlots;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        DlSlots.Y1(this.f11809e, adapterView, view, i10, j10);
    }
}
