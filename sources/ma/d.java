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
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Echallan.PaymentSearchChallan;
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
import com.nic.mparivahan.Echallan.SearchPrintChallanActivity;
import com.nic.mparivahan.Echallan.SearchPrintReceiptActivity;
import com.nic.mparivahan.Echallan.VerifyPaymentChallan;
import com.nic.mparivahan.R;
import java.util.List;
import v9.e;

public final class d extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final List f13899d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13900e;

    /* renamed from: f  reason: collision with root package name */
    private final String f13901f;

    /* renamed from: g  reason: collision with root package name */
    private String f13902g = "T";

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13903y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f13904z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.es_sarathi_service_name);
            l.e(findViewById, "findViewById(...)");
            this.f13903y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.layout_es_sarathi);
            l.e(findViewById2, "findViewById(...)");
            this.f13904z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.es_image);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
        }

        public final ImageView O() {
            return this.A;
        }

        public final TextView P() {
            return this.f13903y;
        }

        public final LinearLayout Q() {
            return this.f13904z;
        }
    }

    public d(List list, Context context, String str) {
        l.f(list, "mList");
        l.f(context, "mContext");
        l.f(str, "State_code");
        this.f13899d = list;
        this.f13900e = context;
        this.f13901f = str;
    }

    /* access modifiers changed from: private */
    public static final void C(d dVar, Enabledservice enabledservice, View view) {
        l.f(dVar, "this$0");
        l.f(enabledservice, "$mModel");
        dVar.E(enabledservice.getServCode(), enabledservice.getServName().toString());
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Enabledservice enabledservice = (Enabledservice) this.f13899d.get(i10);
        aVar.P().setText(e.f17509a.M(this.f13900e, enabledservice.getServCode(), enabledservice.getServName()));
        F(enabledservice.getServCode(), aVar);
        aVar.Q().setOnClickListener(new c(this, enabledservice));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.es_sarathi_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void E(String str, String str2) {
        l.f(str, "service_code");
        l.f(str2, "service_name");
        if (str.equals("111")) {
            this.f13900e.startActivity(new Intent(this.f13900e, SearchChallanOnlineActivity.class));
        }
        if (str.equals("112")) {
            this.f13900e.startActivity(new Intent(this.f13900e, PaymentSearchChallan.class));
        }
        if (str.equals("113")) {
            this.f13900e.startActivity(new Intent(this.f13900e, VerifyPaymentChallan.class));
        }
        if (str.equals("114")) {
            Intent intent = new Intent(this.f13900e, SearchPrintChallanActivity.class);
            intent.putExtra("Service_name", str2);
            this.f13900e.startActivity(intent);
        }
        if (str.equals("115")) {
            Intent intent2 = new Intent(this.f13900e, SearchPrintReceiptActivity.class);
            intent2.putExtra("Service_name", str2);
            this.f13900e.startActivity(intent2);
        }
    }

    public final void F(String str, a aVar) {
        l.f(str, "service_code");
        l.f(aVar, "holder");
        if (str.equals("111")) {
            aVar.O().setImageDrawable(this.f13900e.getResources().getDrawable(R.drawable.ic_status));
        }
        if (str.equals("112")) {
            aVar.O().setImageDrawable(this.f13900e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (str.equals("113")) {
            aVar.O().setImageDrawable(this.f13900e.getResources().getDrawable(R.drawable.ic_verify));
        }
        if (str.equals("114")) {
            aVar.O().setImageDrawable(this.f13900e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (str.equals("115")) {
            aVar.O().setImageDrawable(this.f13900e.getResources().getDrawable(R.drawable.print_receipt));
        }
    }

    public int e() {
        return this.f13899d.size();
    }
}
