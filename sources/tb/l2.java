package tb;

import android.view.View;
import android.widget.AdapterView;
import com.nic.mparivahan.LLServices.UI.LlSlots;

public final /* synthetic */ class l2 implements AdapterView.OnItemClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LlSlots f16789e;

    public /* synthetic */ l2(LlSlots llSlots) {
        this.f16789e = llSlots;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        LlSlots.f2(this.f16789e, adapterView, view, i10, j10);
    }
}
