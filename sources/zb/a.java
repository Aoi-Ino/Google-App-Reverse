package zb;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem;
import java.util.ArrayList;
import ld.c;

public final class a extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f18984d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f18985e;

    /* renamed from: zb.a$a  reason: collision with other inner class name */
    public static final class C0253a extends RecyclerView.d0 {

        /* renamed from: y  reason: collision with root package name */
        private final TextView f18986y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f18987z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0253a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.feeTitle);
            l.e(findViewById, "findViewById(...)");
            this.f18986y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.fee_Value);
            l.e(findViewById2, "findViewById(...)");
            this.f18987z = (TextView) findViewById2;
        }

        public final TextView O() {
            return this.f18986y;
        }

        public final TextView P() {
            return this.f18987z;
        }
    }

    public a(ArrayList arrayList, Context context) {
        l.f(arrayList, "language_modle");
        l.f(context, "context");
        this.f18984d = arrayList;
        this.f18985e = context;
    }

    /* renamed from: A */
    public void p(C0253a aVar, int i10) {
        l.f(aVar, "holder");
        new c(this.f18985e);
        Object obj = this.f18984d.get(i10);
        l.e(obj, "get(...)");
        FeesModleItem feesModleItem = (FeesModleItem) obj;
        aVar.O().setText(feesModleItem.getFeeHeadDescr());
        aVar.P().setText(String.valueOf(feesModleItem.getFeeAmount()));
        Log.e("title", feesModleItem.getFeeHeadDescr());
    }

    /* renamed from: B */
    public C0253a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fess_item, viewGroup, false);
        l.c(inflate);
        return new C0253a(inflate);
    }

    public int e() {
        return this.f18984d.size();
    }
}
