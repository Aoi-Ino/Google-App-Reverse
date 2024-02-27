package bj;

import android.view.View;
import android.widget.AdapterView;
import com.nic.mparivahan.dlservices.newlearner.LLSlots;

public final /* synthetic */ class e1 implements AdapterView.OnItemClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LLSlots f19780e;

    public /* synthetic */ e1(LLSlots lLSlots) {
        this.f19780e = lLSlots;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        LLSlots.b2(this.f19780e, adapterView, view, i10, j10);
    }
}
