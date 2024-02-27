package db;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.Echallan.PaymentSearchChallanDetails;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import ld.c;

public final class d extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f9896d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f9897e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9898f;

    /* renamed from: g  reason: collision with root package name */
    private final String f9899g;

    /* renamed from: h  reason: collision with root package name */
    private final c f9900h;

    public static final class a extends RecyclerView.d0 {
        private final MyTextView A;
        private final MyTextView B;
        private final MyTextView C;
        private final MyTextView D;
        private final MyTextView E;
        private final MyTextView F;
        private final AppCompatTextView G;
        private final AppCompatTextView H;

        /* renamed from: y  reason: collision with root package name */
        private final MyTextView f9901y;

        /* renamed from: z  reason: collision with root package name */
        private final MyTextView f9902z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.challanNoTv);
            l.e(findViewById, "findViewById(...)");
            this.f9901y = (MyTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.challanTimeTv);
            l.e(findViewById2, "findViewById(...)");
            this.f9902z = (MyTextView) findViewById2;
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
            View findViewById9 = view.findViewById(R.id.viewDetailsTv);
            l.e(findViewById9, "findViewById(...)");
            this.G = (AppCompatTextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.viewTv);
            l.e(findViewById10, "findViewById(...)");
            this.H = (AppCompatTextView) findViewById10;
        }

        public final MyTextView O() {
            return this.F;
        }

        public final MyTextView P() {
            return this.f9901y;
        }

        public final MyTextView Q() {
            return this.f9902z;
        }

        public final MyTextView R() {
            return this.A;
        }

        public final MyTextView S() {
            return this.E;
        }

        public final MyTextView T() {
            return this.D;
        }

        public final MyTextView U() {
            return this.C;
        }

        public final AppCompatTextView V() {
            return this.G;
        }

        public final AppCompatTextView W() {
            return this.H;
        }

        public final MyTextView X() {
            return this.B;
        }
    }

    public d(Context context, ArrayList arrayList, int i10, String str, c cVar) {
        l.f(context, "context");
        l.f(arrayList, "searchList");
        l.f(str, "inputType");
        l.f(cVar, "langSession");
        this.f9896d = context;
        this.f9897e = arrayList;
        this.f9898f = i10;
        this.f9899g = str;
        this.f9900h = cVar;
    }

    /* access modifiers changed from: private */
    public static final void D(d dVar, int i10, View view) {
        l.f(dVar, "this$0");
        Intent intent = new Intent(dVar.f9896d, PaymentSearchChallanDetails.class);
        intent.putExtra("selectedData", (Parcelable) dVar.f9897e.get(i10));
        intent.putExtra("inputType", dVar.f9899g);
        dVar.f9896d.startActivity(intent);
    }

    public final void B(List list) {
        l.f(list, "searchList");
        ArrayList arrayList = this.f9897e;
        arrayList.clear();
        arrayList.addAll(list);
        j();
    }

    /* renamed from: C */
    public void p(a aVar, int i10) {
        AppCompatTextView V;
        int i11;
        l.f(aVar, "holder");
        Object obj = this.f9897e.get(i10);
        l.e(obj, "get(...)");
        SearchChallanResultModel searchChallanResultModel = (SearchChallanResultModel) obj;
        if (searchChallanResultModel.getChallanNo().length() > 0) {
            aVar.P().setText(searchChallanResultModel.getChallanNo());
        }
        if (searchChallanResultModel.getDocNo().length() > 0) {
            aVar.R().setText(searchChallanResultModel.getDocNo());
        }
        if (searchChallanResultModel.getOwnerName().length() > 0) {
            aVar.X().setText(searchChallanResultModel.getOwnerName());
        }
        if (searchChallanResultModel.getChallanStatus().length() > 0) {
            aVar.U().setText(searchChallanResultModel.getChallanStatus());
        }
        if (searchChallanResultModel.getStateCd().length() > 0) {
            aVar.T().setText(searchChallanResultModel.getStateCd());
        }
        if (searchChallanResultModel.getPaymentSource().length() > 0) {
            aVar.S().setText(searchChallanResultModel.getPaymentSource());
        }
        if (searchChallanResultModel.getAmount().length() > 0) {
            aVar.O().setText(searchChallanResultModel.getAmount());
        }
        if (searchChallanResultModel.getDateTime().length() > 0) {
            aVar.Q().setText(searchChallanResultModel.getDateTime());
        }
        if (this.f9898f == 0) {
            V = aVar.V();
            i11 = 8;
        } else {
            V = aVar.V();
            i11 = 0;
        }
        V.setVisibility(i11);
        aVar.W().setText(this.f9900h.b("label_challan_view_details", this.f9896d.getString(R.string.view_Details)));
        aVar.W().setOnClickListener(new c(this, i10));
    }

    /* renamed from: E */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_payment_search_challan, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f9897e.size();
    }
}
