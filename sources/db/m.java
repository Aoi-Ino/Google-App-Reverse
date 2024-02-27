package db;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import ld.c;

public final class m extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f9937d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f9938e;

    /* renamed from: f  reason: collision with root package name */
    private final c f9939f;

    public static final class a extends RecyclerView.d0 {
        private final MyTextView A;
        private final MyTextView B;
        private final MyTextView C;
        private final MyTextView D;
        private final MyTextView E;
        private final MyTextView F;

        /* renamed from: y  reason: collision with root package name */
        private final MyTextView f9940y;

        /* renamed from: z  reason: collision with root package name */
        private final MyTextView f9941z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.challanNoTv);
            l.e(findViewById, "findViewById(...)");
            this.f9940y = (MyTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.challanTimeTv);
            l.e(findViewById2, "findViewById(...)");
            this.f9941z = (MyTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.dlRcNoTv);
            l.e(findViewById3, "findViewById(...)");
            this.A = (MyTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.violatorNameTv);
            l.e(findViewById4, "findViewById(...)");
            this.B = (MyTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.statusTv);
            l.e(findViewById5, "findViewById(...)");
            this.C = (MyTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.dlRcNo);
            l.e(findViewById6, "findViewById(...)");
            this.D = (MyTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.violatorName);
            l.e(findViewById7, "findViewById(...)");
            this.E = (MyTextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.status);
            l.e(findViewById8, "findViewById(...)");
            this.F = (MyTextView) findViewById8;
        }

        public final MyTextView O() {
            return this.f9940y;
        }

        public final MyTextView P() {
            return this.f9941z;
        }

        public final MyTextView Q() {
            return this.D;
        }

        public final MyTextView R() {
            return this.A;
        }

        public final MyTextView S() {
            return this.F;
        }

        public final MyTextView T() {
            return this.C;
        }

        public final MyTextView U() {
            return this.E;
        }

        public final MyTextView V() {
            return this.B;
        }
    }

    public m(Context context, ArrayList arrayList, c cVar) {
        l.f(context, "context");
        l.f(arrayList, "searchList");
        l.f(cVar, "langSession");
        this.f9937d = context;
        this.f9938e = arrayList;
        this.f9939f = cVar;
    }

    public final void A(List list) {
        l.f(list, "searchList");
        ArrayList arrayList = this.f9938e;
        arrayList.clear();
        arrayList.addAll(list);
        j();
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Object obj = this.f9938e.get(i10);
        l.e(obj, "get(...)");
        SearchChallanResultModel searchChallanResultModel = (SearchChallanResultModel) obj;
        aVar.Q().setText(this.f9939f.b("label_challan_dl_rc_number", this.f9937d.getString(R.string.dl_rc_number)));
        aVar.U().setText(this.f9939f.b("label_challan_violator_name", this.f9937d.getString(R.string.violator_name)));
        aVar.S().setText(this.f9939f.b("label_challan_pay_status", this.f9937d.getString(R.string.status)));
        if (searchChallanResultModel.getChallanNo().length() > 0) {
            aVar.O().setText(searchChallanResultModel.getChallanNo());
        }
        if (searchChallanResultModel.getDocNo().length() > 0) {
            aVar.R().setText(searchChallanResultModel.getDocNo());
        }
        if (searchChallanResultModel.getOwnerName().length() > 0) {
            aVar.V().setText(searchChallanResultModel.getOwnerName());
        }
        if (searchChallanResultModel.getChallanStatus().length() > 0) {
            aVar.T().setText(searchChallanResultModel.getChallanStatus());
        }
        String paymentDate = searchChallanResultModel.getPaymentDate();
        if (paymentDate != null && paymentDate.length() != 0) {
            aVar.P().setText(searchChallanResultModel.getPaymentDate());
        }
    }

    /* renamed from: C */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.echallan_payment_item_transcation_status, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f9938e.size();
    }
}
