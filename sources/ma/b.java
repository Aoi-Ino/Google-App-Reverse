package ma;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Dashboard.ChallanViewMoreActivity;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Echallan.PaymentSearchChallan;
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
import com.nic.mparivahan.Echallan.SearchPrintChallanActivity;
import com.nic.mparivahan.Echallan.SearchPrintReceiptActivity;
import com.nic.mparivahan.Echallan.VerifyPaymentChallan;
import com.nic.mparivahan.R;
import java.util.List;
import ld.c;
import v9.e;

public final class b extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final List f13885d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13886e;

    /* renamed from: f  reason: collision with root package name */
    private String f13887f;

    /* renamed from: g  reason: collision with root package name */
    private String f13888g = "T";

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13889y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f13890z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.es_sarathi_service_name);
            l.e(findViewById, "findViewById(...)");
            this.f13889y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.layout_es_sarathi);
            l.e(findViewById2, "findViewById(...)");
            this.f13890z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.es_image);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
        }

        public final ImageView O() {
            return this.A;
        }

        public final TextView P() {
            return this.f13889y;
        }

        public final LinearLayout Q() {
            return this.f13890z;
        }
    }

    public b(List list, Context context, String str) {
        l.f(list, "mList");
        l.f(context, "mContext");
        l.f(str, "State_code");
        this.f13885d = list;
        this.f13886e = context;
        this.f13887f = str;
    }

    /* access modifiers changed from: private */
    public static final void C(int i10, b bVar, Enabledservice enabledservice, View view) {
        l.f(bVar, "this$0");
        l.f(enabledservice, "$mModel");
        if (i10 == 3) {
            Intent intent = new Intent(bVar.f13886e, ChallanViewMoreActivity.class);
            intent.putExtra("state_code", bVar.f13887f);
            bVar.f13886e.startActivity(intent);
            return;
        }
        bVar.E(enabledservice.getServCode(), bVar.f13886e);
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Enabledservice enabledservice = (Enabledservice) this.f13885d.get(i10);
        aVar.P().setText(e.f17509a.M(this.f13886e, enabledservice.getServCode(), enabledservice.getServName()));
        if (l.a(this.f13888g, "T") && i10 == 3) {
            aVar.P().setText(new c(this.f13886e).b("label_view_more", "View More"));
            enabledservice.setServCode("0");
            aVar.O().setImageDrawable(this.f13886e.getResources().getDrawable(R.drawable.ic_view));
        }
        F(enabledservice.getServCode(), aVar);
        aVar.Q().setOnClickListener(new a(i10, this, enabledservice));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.es_sarathi_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void E(String str, Context context) {
        l.f(str, "service_code");
        l.f(context, "context");
        if (str.equals("111")) {
            this.f13886e.startActivity(new Intent(this.f13886e, SearchChallanOnlineActivity.class));
        }
        if (str.equals("112")) {
            this.f13886e.startActivity(new Intent(this.f13886e, PaymentSearchChallan.class));
        }
        if (str.equals("113")) {
            this.f13886e.startActivity(new Intent(this.f13886e, VerifyPaymentChallan.class));
        }
        if (str.equals("114")) {
            this.f13886e.startActivity(new Intent(this.f13886e, SearchPrintChallanActivity.class));
        }
        if (str.equals("115")) {
            this.f13886e.startActivity(new Intent(this.f13886e, SearchPrintReceiptActivity.class));
        }
    }

    public final void F(String str, a aVar) {
        l.f(str, "service_code");
        l.f(aVar, "holder");
        if (str.equals("111")) {
            aVar.O().setImageDrawable(this.f13886e.getResources().getDrawable(R.drawable.ic_status));
        }
        if (str.equals("112")) {
            aVar.O().setImageDrawable(this.f13886e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (str.equals("113")) {
            aVar.O().setImageDrawable(this.f13886e.getResources().getDrawable(R.drawable.ic_verify));
        }
        if (str.equals("114")) {
            aVar.O().setImageDrawable(this.f13886e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (str.equals("115")) {
            aVar.O().setImageDrawable(this.f13886e.getResources().getDrawable(R.drawable.print_receipt));
        }
    }

    public int e() {
        if (this.f13885d.size() > 3) {
            this.f13888g = "T";
            return 4;
        }
        this.f13888g = "F";
        return this.f13885d.size();
    }
}
