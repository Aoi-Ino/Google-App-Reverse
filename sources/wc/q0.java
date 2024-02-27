package wc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.util.ArrayList;
import java.util.List;
import ld.c;

public final class q0 extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f18122d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f18123e;

    /* renamed from: f  reason: collision with root package name */
    private final c f18124f;

    public static final class a extends RecyclerView.d0 {
        private final MyTextView A;
        private final MyTextView B;
        private final MyTextView C;
        private final MyTextView D;
        private final MyTextView E;
        private final MyTextView F;
        private final MyTextView G;
        private final MyTextView H;
        private final MyTextView I;
        private final MyTextView J;
        private final MyTextView K;

        /* renamed from: y  reason: collision with root package name */
        private final MyTextView f18125y;

        /* renamed from: z  reason: collision with root package name */
        private final MyTextView f18126z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.challanNoTv);
            l.e(findViewById, "findViewById(...)");
            this.f18125y = (MyTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.challanTimeTv);
            l.e(findViewById2, "findViewById(...)");
            this.f18126z = (MyTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.dlRcNoTv);
            l.e(findViewById3, "findViewById(...)");
            this.A = (MyTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.violatorNameTv);
            l.e(findViewById4, "findViewById(...)");
            this.B = (MyTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.statusTv);
            l.e(findViewById5, "findViewById(...)");
            this.C = (MyTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.stateNameTv);
            l.e(findViewById6, "findViewById(...)");
            this.D = (MyTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.paymentSourceTv);
            l.e(findViewById7, "findViewById(...)");
            this.E = (MyTextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.amountTv);
            l.e(findViewById8, "findViewById(...)");
            this.F = (MyTextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.dlRcNo);
            l.e(findViewById9, "findViewById(...)");
            this.G = (MyTextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.violatorName);
            l.e(findViewById10, "findViewById(...)");
            this.H = (MyTextView) findViewById10;
            View findViewById11 = view.findViewById(R.id.status);
            l.e(findViewById11, "findViewById(...)");
            this.I = (MyTextView) findViewById11;
            View findViewById12 = view.findViewById(R.id.state);
            l.e(findViewById12, "findViewById(...)");
            this.J = (MyTextView) findViewById12;
            View findViewById13 = view.findViewById(R.id.amount);
            l.e(findViewById13, "findViewById(...)");
            this.K = (MyTextView) findViewById13;
        }

        public final MyTextView O() {
            return this.K;
        }

        public final MyTextView P() {
            return this.F;
        }

        public final MyTextView Q() {
            return this.f18125y;
        }

        public final MyTextView R() {
            return this.f18126z;
        }

        public final MyTextView S() {
            return this.G;
        }

        public final MyTextView T() {
            return this.A;
        }

        public final MyTextView U() {
            return this.E;
        }

        public final MyTextView V() {
            return this.J;
        }

        public final MyTextView W() {
            return this.D;
        }

        public final MyTextView X() {
            return this.I;
        }

        public final MyTextView Y() {
            return this.C;
        }

        public final MyTextView Z() {
            return this.H;
        }

        public final MyTextView a0() {
            return this.B;
        }
    }

    public q0(Context context, ArrayList arrayList, c cVar) {
        l.f(context, "context");
        l.f(arrayList, "searchList");
        l.f(cVar, "langSess");
        this.f18122d = context;
        this.f18123e = arrayList;
        this.f18124f = cVar;
    }

    public final void A(List list) {
        l.f(list, "searchList");
        ArrayList arrayList = this.f18123e;
        arrayList.clear();
        arrayList.addAll(list);
        j();
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        MyTextView U;
        String str;
        l.f(aVar, "holder");
        Object obj = this.f18123e.get(i10);
        l.e(obj, "get(...)");
        SearchChallanResultModel searchChallanResultModel = (SearchChallanResultModel) obj;
        if (searchChallanResultModel.getChallanNo().length() > 0) {
            aVar.Q().setText(searchChallanResultModel.getChallanNo());
        }
        aVar.S().setText(this.f18124f.b("label_challan_dl_rc_number", this.f18122d.getString(R.string.dl_rc_number)));
        aVar.Z().setText(this.f18124f.b("label_challan_violator_name", this.f18122d.getString(R.string.violator_name)));
        aVar.X().setText(this.f18124f.b("label_challan_pay_status", this.f18122d.getString(R.string.status)));
        aVar.V().setText(this.f18124f.b("label_challan_state", this.f18122d.getString(R.string.state)));
        aVar.O().setText(this.f18124f.b("label_challan_amount", this.f18122d.getString(R.string.amount)));
        if (searchChallanResultModel.getDocNo().length() > 0) {
            aVar.T().setText(searchChallanResultModel.getDocNo());
        }
        if (searchChallanResultModel.getOwnerName().length() > 0) {
            aVar.a0().setText(searchChallanResultModel.getOwnerName());
        }
        if (searchChallanResultModel.getChallanStatus().length() > 0) {
            aVar.Y().setText(searchChallanResultModel.getChallanStatus());
        }
        if (searchChallanResultModel.getStateCd().length() > 0) {
            aVar.W().setText(VContant.Companion.k(q.B0(searchChallanResultModel.getStateCd().toString()).toString()));
        }
        if (searchChallanResultModel.getPaymentSource().length() > 0) {
            U = aVar.U();
            str = searchChallanResultModel.getPaymentSource();
        } else {
            U = aVar.U();
            str = "";
        }
        U.setText(str);
        if (searchChallanResultModel.getAmount().length() > 0) {
            aVar.P().setText(searchChallanResultModel.getAmount());
        }
        if (searchChallanResultModel.getDateTime().length() > 0) {
            aVar.R().setText(searchChallanResultModel.getDateTime());
        }
    }

    /* renamed from: C */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_view_challan, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f18123e.size();
    }
}
