package db;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.Echallan.PrintChallanWebView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.utilities.d;
import java.util.ArrayList;
import java.util.List;
import ld.c;

public final class l extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final Context f9930d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f9931e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9932f;

    /* renamed from: g  reason: collision with root package name */
    private String f9933g;

    /* renamed from: h  reason: collision with root package name */
    private final c f9934h;

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
        private final MyTextView f9935y;

        /* renamed from: z  reason: collision with root package name */
        private final MyTextView f9936z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            cm.l.f(view, "itemView");
            View findViewById = view.findViewById(R.id.challanNoTv);
            cm.l.e(findViewById, "findViewById(...)");
            this.f9935y = (MyTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.challanTimeTv);
            cm.l.e(findViewById2, "findViewById(...)");
            this.f9936z = (MyTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.dlRcNoTv);
            cm.l.e(findViewById3, "findViewById(...)");
            this.A = (MyTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.violatorNameTv);
            cm.l.e(findViewById4, "findViewById(...)");
            this.B = (MyTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.statusTv);
            cm.l.e(findViewById5, "findViewById(...)");
            this.C = (MyTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.stateNameTv);
            cm.l.e(findViewById6, "findViewById(...)");
            this.D = (MyTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.paymentSourceTv);
            cm.l.e(findViewById7, "findViewById(...)");
            this.E = (MyTextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.amountTv);
            cm.l.e(findViewById8, "findViewById(...)");
            this.F = (MyTextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.viewDetailsTv);
            cm.l.e(findViewById9, "findViewById(...)");
            this.G = (AppCompatTextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.viewTv);
            cm.l.e(findViewById10, "findViewById(...)");
            this.H = (AppCompatTextView) findViewById10;
        }

        public final MyTextView O() {
            return this.F;
        }

        public final MyTextView P() {
            return this.f9935y;
        }

        public final MyTextView Q() {
            return this.f9936z;
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

    public l(Context context, ArrayList arrayList, int i10, String str, c cVar) {
        cm.l.f(context, "context");
        cm.l.f(arrayList, "searchList");
        cm.l.f(str, "name");
        cm.l.f(cVar, "langSession");
        this.f9930d = context;
        this.f9931e = arrayList;
        this.f9932f = i10;
        this.f9933g = str;
        this.f9934h = cVar;
    }

    /* access modifiers changed from: private */
    public static final void D(SearchChallanResultModel searchChallanResultModel, l lVar, View view) {
        cm.l.f(searchChallanResultModel, "$model");
        cm.l.f(lVar, "this$0");
        if (d.d(searchChallanResultModel.getReceiptUrl())) {
            Intent intent = new Intent(lVar.f9930d, PrintChallanWebView.class);
            intent.putExtra("challanPdfUrl", searchChallanResultModel.getReceiptUrl());
            intent.putExtra("challanNo", searchChallanResultModel.getDocNo());
            intent.putExtra("fromActivity", "reprintReceiptActivity");
            lVar.f9930d.startActivity(intent);
            return;
        }
        Toast.makeText(lVar.f9930d, lVar.f9934h.b("label_challan_payment_is_pending", "Payment is pending for this challan"), 0).show();
    }

    public final void B(List list) {
        cm.l.f(list, "searchList");
        ArrayList arrayList = this.f9931e;
        arrayList.clear();
        arrayList.addAll(list);
        j();
    }

    /* renamed from: C */
    public void p(a aVar, int i10) {
        AppCompatTextView W;
        String b10;
        AppCompatTextView V;
        int i11;
        cm.l.f(aVar, "holder");
        Object obj = this.f9931e.get(i10);
        cm.l.e(obj, "get(...)");
        SearchChallanResultModel searchChallanResultModel = (SearchChallanResultModel) obj;
        if (!ka.c.f13158a.m(this.f9933g)) {
            W = aVar.W();
            b10 = this.f9934h.b("View_Payment_Receipt", this.f9933g);
        } else {
            W = aVar.W();
            b10 = this.f9934h.b("label_challan_print_receipt", this.f9930d.getString(R.string.print_receipt));
        }
        W.setText(b10);
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
            aVar.Q().setText(com.nic.mparivahan.Echallan.a.f8906a.a(searchChallanResultModel.getDateTime()));
        }
        if (this.f9932f == 0) {
            V = aVar.V();
            i11 = 8;
        } else {
            V = aVar.V();
            i11 = 0;
        }
        V.setVisibility(i11);
        aVar.W().setOnClickListener(new k(searchChallanResultModel, this));
    }

    /* renamed from: E */
    public a r(ViewGroup viewGroup, int i10) {
        cm.l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_payment_search_challan, viewGroup, false);
        cm.l.c(inflate);
        return new a(inflate);
    }

    public int e() {
        return this.f9931e.size();
    }
}
