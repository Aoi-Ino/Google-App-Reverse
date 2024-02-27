package zb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.Fees;
import java.util.ArrayList;
import ld.c;

public final class e extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f19002d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f19003e;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final TextView f19004y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f19005z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.feeTitle);
            l.e(findViewById, "findViewById(...)");
            this.f19004y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.fee_Value);
            l.e(findViewById2, "findViewById(...)");
            this.f19005z = (TextView) findViewById2;
        }

        public final TextView O() {
            return this.f19004y;
        }

        public final TextView P() {
            return this.f19005z;
        }
    }

    public e(ArrayList arrayList, Context context) {
        l.f(arrayList, "language_modle");
        l.f(context, "context");
        this.f19002d = arrayList;
        this.f19003e = context;
    }

    /* renamed from: A */
    public void p(a aVar, int i10) {
        TextView O;
        l.f(aVar, "holder");
        new c(this.f19003e);
        Object obj = this.f19002d.get(i10);
        l.e(obj, "get(...)");
        Fees fees = (Fees) obj;
        String feeHeadDescr = fees.getFeeHeadDescr();
        int feeAmount = fees.getFeeAmount();
        if (VContant.Companion.F(String.valueOf(fees.getPurCd()))) {
            O = aVar.O();
            feeHeadDescr = "Fee Amount";
        } else {
            O = aVar.O();
        }
        O.setText(feeHeadDescr);
        aVar.P().setText(String.valueOf(feeAmount));
    }

    /* renamed from: B */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fees_item_multi_service, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f19002d.size();
    }
}
