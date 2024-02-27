package sg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.FessMultiModel;
import java.util.ArrayList;
import ld.c;
import zb.e;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f31224d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f31225e;

    /* renamed from: sg.a$a  reason: collision with other inner class name */
    public static final class C0348a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final RecyclerView f31226y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f31227z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0348a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.feeRecycle);
            l.e(findViewById, "findViewById(...)");
            this.f31226y = (RecyclerView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.titledec);
            l.e(findViewById2, "findViewById(...)");
            this.f31227z = (TextView) findViewById2;
        }

        public final RecyclerView O() {
            return this.f31226y;
        }

        public final TextView P() {
            return this.f31227z;
        }
    }

    public a(ArrayList arrayList, Context context) {
        l.f(context, "mContext");
        this.f31224d = arrayList;
        this.f31225e = context;
    }

    /* renamed from: A */
    public void p(C0348a aVar, int i10) {
        l.f(aVar, "holder");
        new c(this.f31225e);
        aVar.O().setLayoutManager(new GridLayoutManager(this.f31225e, 2));
        aVar.O().setHasFixedSize(true);
        ArrayList arrayList = this.f31224d;
        String str = null;
        FessMultiModel fessMultiModel = arrayList != null ? (FessMultiModel) arrayList.get(i10) : null;
        TextView P = aVar.P();
        if (fessMultiModel != null) {
            str = fessMultiModel.getService_name();
        }
        P.setText(str);
        l.c(fessMultiModel);
        aVar.O().setAdapter(new e(fessMultiModel.getArrayList(), this.f31225e));
    }

    /* renamed from: B */
    public C0348a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fee_adapter_item, viewGroup, false);
        l.c(inflate);
        return new C0348a(inflate);
    }

    public int e() {
        ArrayList arrayList = this.f31224d;
        l.c(arrayList);
        return arrayList.size();
    }
}
