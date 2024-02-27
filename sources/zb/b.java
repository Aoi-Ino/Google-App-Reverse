package zb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.FeeDobj;
import java.util.ArrayList;
import ld.c;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f18988d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f18989e;

    public static final class a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final TextView f18990y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f18991z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.feeTitle);
            l.e(findViewById, "findViewById(...)");
            this.f18990y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.fee_Value);
            l.e(findViewById2, "findViewById(...)");
            this.f18991z = (TextView) findViewById2;
        }

        public final TextView O() {
            return this.f18990y;
        }

        public final TextView P() {
            return this.f18991z;
        }
    }

    public b(ArrayList arrayList, Context context) {
        l.f(arrayList, "language_modle");
        l.f(context, "context");
        this.f18988d = arrayList;
        this.f18989e = context;
    }

    /* renamed from: A */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        new c(this.f18989e);
        Object obj = this.f18988d.get(i10);
        l.e(obj, "get(...)");
        FeeDobj feeDobj = (FeeDobj) obj;
        aVar.O().setText(feeDobj.getFeeHeadDescr());
        aVar.P().setText(String.valueOf(feeDobj.getFeeAmount()));
    }

    /* renamed from: B */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fess_item, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f18988d.size();
    }
}
