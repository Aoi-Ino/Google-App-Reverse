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
import com.nic.mparivahan.Checkpost.CheckPostReceiptStatus;
import com.nic.mparivahan.Checkpost.DownloadCheckPostReceipt2;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyNumberStatus;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeeReceipt;
import com.nic.mparivahan.VahanServices.FancyServices.RunningAuctionActivity;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCCertificateDownload;
import java.util.List;
import v9.e;

public final class b0 extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final List f13891d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13892e;

    /* renamed from: f  reason: collision with root package name */
    private final String f13893f;

    /* renamed from: g  reason: collision with root package name */
    private String f13894g = "T";

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13895y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f13896z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.es_sarathi_service_name);
            l.e(findViewById, "findViewById(...)");
            this.f13895y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.layout_es_sarathi);
            l.e(findViewById2, "findViewById(...)");
            this.f13896z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.es_image);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
        }

        public final ImageView O() {
            return this.A;
        }

        public final TextView P() {
            return this.f13895y;
        }

        public final LinearLayout Q() {
            return this.f13896z;
        }
    }

    public b0(List list, Context context, String str) {
        l.f(list, "mList");
        l.f(context, "mContext");
        l.f(str, "State_code");
        this.f13891d = list;
        this.f13892e = context;
        this.f13893f = str;
    }

    /* access modifiers changed from: private */
    public static final void C(b0 b0Var, Enabledservice enabledservice, View view) {
        l.f(b0Var, "this$0");
        l.f(enabledservice, "$mModel");
        b0Var.E(enabledservice.getServCode(), b0Var.f13892e, enabledservice.getServName());
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        Enabledservice enabledservice = (Enabledservice) this.f13891d.get(i10);
        aVar.P().setText(e.f17509a.S(this.f13892e, enabledservice.getServCode(), enabledservice.getServName()));
        F(enabledservice.getServCode(), aVar);
        aVar.Q().setOnClickListener(new a0(this, enabledservice));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.es_sarathi_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void E(String str, Context context, String str2) {
        l.f(str, "service_code");
        l.f(context, "context");
        l.f(str2, "name");
        if (str.equals("2002")) {
            Intent intent = new Intent(context, AvailableFancyNumberStatus.class);
            intent.putExtra("ServiceName", str2);
            context.startActivity(intent);
        }
        if (str.equals("2003")) {
            Intent intent2 = new Intent(context, AuctionStatusActivity.class);
            intent2.putExtra("ServiceName", str2);
            context.startActivity(intent2);
        }
        if (str.equals("2004")) {
            Intent intent3 = new Intent(context, FancyFeeReceipt.class);
            intent3.putExtra("ServiceName", str2);
            context.startActivity(intent3);
        }
        if (str.equals("2005")) {
            Intent intent4 = new Intent(context, AllotmentLetterActivity.class);
            intent4.putExtra("ServiceName", str2);
            context.startActivity(intent4);
        }
        if (str.equals("2001")) {
            Intent intent5 = new Intent(context, PUCCCertificateDownload.class);
            intent5.putExtra("ServiceName", str2);
            context.startActivity(intent5);
        }
        if (str.equals("2007")) {
            Intent intent6 = new Intent(context, CheckPostReceiptStatus.class);
            intent6.putExtra("ServiceName", str2);
            context.startActivity(intent6);
        }
        if (str.equals("2008")) {
            Intent intent7 = new Intent(context, DownloadCheckPostReceipt2.class);
            intent7.putExtra("ServiceName", str2);
            context.startActivity(intent7);
        }
        if (str.equals("2006")) {
            Intent intent8 = new Intent(context, RunningAuctionActivity.class);
            intent8.putExtra("ServiceName", str2);
            context.startActivity(intent8);
        }
    }

    public final void F(String str, a aVar) {
        l.f(str, "service_code");
        l.f(aVar, "holder");
        if (str.equals("111")) {
            aVar.O().setImageDrawable(this.f13892e.getResources().getDrawable(R.drawable.ic_status));
        }
        if (str.equals("112")) {
            aVar.O().setImageDrawable(this.f13892e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (str.equals("113")) {
            aVar.O().setImageDrawable(this.f13892e.getResources().getDrawable(R.drawable.ic_verify));
        }
        if (str.equals("114")) {
            aVar.O().setImageDrawable(this.f13892e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (str.equals("115")) {
            aVar.O().setImageDrawable(this.f13892e.getResources().getDrawable(R.drawable.print_receipt));
        }
    }

    public int e() {
        return this.f13891d.size();
    }
}
