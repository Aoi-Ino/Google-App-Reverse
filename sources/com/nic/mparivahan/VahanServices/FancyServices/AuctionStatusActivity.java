package com.nic.mparivahan.VahanServices.FancyServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusModel.AuctionStatusModel;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusModel.Data;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusServices.AuctionStatusRetrofitServices;
import ni.r;
import pl.x;
import v9.e;
import ye.i;
import ye.j;
import ye.k;
import ye.n;

public final class AuctionStatusActivity extends d {
    private r G;
    public ProgressDialog H;
    public AuctionStatusRetrofitServices I;
    public cf.a J;
    private final String K = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    public AuctionStatusModel L;
    public ld.c M;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AuctionStatusActivity f20610e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AuctionStatusActivity auctionStatusActivity) {
            super(1);
            this.f20610e = auctionStatusActivity;
        }

        public final void b(AuctionStatusModel auctionStatusModel) {
            try {
                AuctionStatusActivity auctionStatusActivity = this.f20610e;
                cm.l.c(auctionStatusModel);
                auctionStatusActivity.A1(auctionStatusModel);
                this.f20610e.r1().dismiss();
                this.f20610e.l1();
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AuctionStatusModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AuctionStatusActivity f20611e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AuctionStatusActivity auctionStatusActivity) {
            super(1);
            this.f20611e = auctionStatusActivity;
        }

        public final void b(String str) {
            this.f20611e.r1().dismiss();
            this.f20611e.E1(str.toString());
            Log.e("CallingError", str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20612a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f20612a = lVar;
        }

        public final pl.c a() {
            return this.f20612a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20612a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return cm.l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public final void E1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText(q1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new ye.m(dialog));
        textView2.setOnClickListener(new n(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void F1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void G1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final boolean H1() {
        r1().show();
        r rVar = this.G;
        r rVar2 = null;
        if (rVar == null) {
            cm.l.v("binding");
            rVar = null;
        }
        Editable text = rVar.f28316h.getText();
        cm.l.c(text);
        if (text.length() == 0) {
            r rVar3 = this.G;
            if (rVar3 == null) {
                cm.l.v("binding");
                rVar3 = null;
            }
            rVar3.f28316h.setError(q1().b("please_enter_ack_no", getString(R.string.please_enter_ack_no)));
            r rVar4 = this.G;
            if (rVar4 == null) {
                cm.l.v("binding");
            } else {
                rVar2 = rVar4;
            }
            rVar2.f28316h.requestFocus();
            r1().dismiss();
            return false;
        }
        cf.a o12 = o1();
        r rVar5 = this.G;
        if (rVar5 == null) {
            cm.l.v("binding");
        } else {
            rVar2 = rVar5;
        }
        Editable text2 = rVar2.f28316h.getText();
        cm.l.c(text2);
        o12.i(text2.toString());
        return true;
    }

    /* access modifiers changed from: private */
    public final void l1() {
        Data data;
        Data data2;
        Data data3;
        Data data4;
        Data data5;
        Data data6;
        Data data7;
        Data data8;
        Data data9;
        Data data10;
        Data data11;
        Data data12;
        Data data13;
        Data data14;
        Data data15;
        AuctionStatusModel p12 = p1();
        String str = null;
        if (p.p(p12 != null ? p12.getMessage() : null, "Record found.", false, 2, (Object) null)) {
            Intent intent = new Intent(this, AllocateStatusDetails.class);
            AuctionStatusModel p13 = p1();
            intent.putExtra("regno", (p13 == null || (data15 = p13.getData()) == null) ? null : data15.getRegn_no());
            AuctionStatusModel p14 = p1();
            intent.putExtra("ackNo", (p14 == null || (data14 = p14.getData()) == null) ? null : data14.getAck_no());
            AuctionStatusModel p15 = p1();
            intent.putExtra("recpno", (p15 == null || (data13 = p15.getData()) == null) ? null : data13.getRecp_no());
            AuctionStatusModel p16 = p1();
            intent.putExtra("ownerName", (p16 == null || (data12 = p16.getData()) == null) ? null : data12.getOwner_name());
            AuctionStatusModel p17 = p1();
            intent.putExtra("fatherName", (p17 == null || (data11 = p17.getData()) == null) ? null : data11.getFather_name());
            AuctionStatusModel p18 = p1();
            intent.putExtra("mobileNumber", (p18 == null || (data10 = p18.getData()) == null) ? null : data10.getMobile_no());
            AuctionStatusModel p19 = p1();
            intent.putExtra("address", (p19 == null || (data9 = p19.getData()) == null) ? null : data9.getAddress());
            AuctionStatusModel p110 = p1();
            intent.putExtra("pincode", (p110 == null || (data8 = p110.getData()) == null) ? null : data8.getPincode());
            AuctionStatusModel p111 = p1();
            intent.putExtra("state", (p111 == null || (data7 = p111.getData()) == null) ? null : data7.getState());
            AuctionStatusModel p112 = p1();
            intent.putExtra("rto", (p112 == null || (data6 = p112.getData()) == null) ? null : data6.getRto());
            AuctionStatusModel p113 = p1();
            intent.putExtra("reserve_amt", (p113 == null || (data5 = p113.getData()) == null) ? null : data5.getReserve_amt());
            AuctionStatusModel p114 = p1();
            intent.putExtra("auctionAmt", (p114 == null || (data4 = p114.getData()) == null) ? null : data4.getAuction_amt());
            AuctionStatusModel p115 = p1();
            intent.putExtra("bookingDate", (p115 == null || (data3 = p115.getData()) == null) ? null : data3.getOp_dt());
            AuctionStatusModel p116 = p1();
            intent.putExtra("allotmentType", (p116 == null || (data2 = p116.getData()) == null) ? null : data2.getAllotted_to());
            AuctionStatusModel p117 = p1();
            if (!(p117 == null || (data = p117.getData()) == null)) {
                str = data.getStatus();
            }
            intent.putExtra("status", str);
            startActivity(intent);
        }
    }

    private final void t1() {
        try {
            getIntent();
        } catch (Exception unused) {
        }
        r rVar = this.G;
        r rVar2 = null;
        if (rVar == null) {
            cm.l.v("binding");
            rVar = null;
        }
        rVar.f28311c.f28306g.setOnClickListener(new i(this));
        r rVar3 = this.G;
        if (rVar3 == null) {
            cm.l.v("binding");
            rVar3 = null;
        }
        rVar3.f28311c.f28305f.setOnClickListener(new j(this));
        r rVar4 = this.G;
        if (rVar4 == null) {
            cm.l.v("binding");
            rVar4 = null;
        }
        rVar4.f28314f.setOnClickListener(new k(this));
        r rVar5 = this.G;
        if (rVar5 == null) {
            cm.l.v("binding");
            rVar5 = null;
        }
        rVar5.f28312d.setOnClickListener(new ye.l(this));
        r rVar6 = this.G;
        if (rVar6 == null) {
            cm.l.v("binding");
            rVar6 = null;
        }
        rVar6.f28316h.setKeyListener(DigitsKeyListener.getInstance(this.K));
        r rVar7 = this.G;
        if (rVar7 == null) {
            cm.l.v("binding");
        } else {
            rVar2 = rVar7;
        }
        rVar2.f28316h.setRawInputType(4096);
    }

    /* access modifiers changed from: private */
    public static final void u1(AuctionStatusActivity auctionStatusActivity, View view) {
        cm.l.f(auctionStatusActivity, "this$0");
        auctionStatusActivity.y1();
    }

    /* access modifiers changed from: private */
    public static final void v1(AuctionStatusActivity auctionStatusActivity, View view) {
        cm.l.f(auctionStatusActivity, "this$0");
        auctionStatusActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void w1(AuctionStatusActivity auctionStatusActivity, View view) {
        cm.l.f(auctionStatusActivity, "this$0");
        if (auctionStatusActivity.H1()) {
            AuctionStatusModel p12 = auctionStatusActivity.p1();
            String message = p12 != null ? p12.getMessage() : null;
            cm.l.c(message);
            Log.e("auctionRespo02", message);
        }
    }

    /* access modifiers changed from: private */
    public static final void x1(AuctionStatusActivity auctionStatusActivity, View view) {
        cm.l.f(auctionStatusActivity, "this$0");
        auctionStatusActivity.finish();
    }

    private final void y1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(AuctionStatusModel auctionStatusModel) {
        cm.l.f(auctionStatusModel, "<set-?>");
        this.L = auctionStatusModel;
    }

    public final void B1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final void C1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.H = progressDialog;
    }

    public final void D1(AuctionStatusRetrofitServices auctionStatusRetrofitServices) {
        cm.l.f(auctionStatusRetrofitServices, "<set-?>");
        this.I = auctionStatusRetrofitServices;
    }

    public final cf.a o1() {
        cf.a aVar = this.J;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("auctionViewModle");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r c10 = r.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        r rVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        B1(new ld.c(this));
        e.a aVar = e.f17509a;
        r rVar2 = this.G;
        if (rVar2 == null) {
            cm.l.v("binding");
            rVar2 = null;
        }
        aVar.I(this, rVar2);
        r rVar3 = this.G;
        if (rVar3 == null) {
            cm.l.v("binding");
        } else {
            rVar = rVar3;
        }
        rVar.f28311c.f28308i.setText(getIntent().getStringExtra("ServiceName"));
        C1(new ProgressDialog(this));
        r1().setMessage(q1().b("label_challan_please_wait", "Please wait..."));
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        D1(AuctionStatusRetrofitServices.f20613a.b(this));
        z1((cf.a) new u0((x0) this, (u0.b) new bf.a(new bf.b(s1()))).a(cf.a.class));
        Data data = r3;
        Data data2 = new Data("", "", "", 0, "", "", "", "", "", "", "", "", 0, "", "", "");
        AuctionStatusModel auctionStatusModel = new AuctionStatusModel(data, "", "");
        A1(auctionStatusModel);
        t1();
        o1().h().g(this, new c(new a(this)));
        o1().g().g(this, new c(new b(this)));
    }

    public final AuctionStatusModel p1() {
        AuctionStatusModel auctionStatusModel = this.L;
        if (auctionStatusModel != null) {
            return auctionStatusModel;
        }
        cm.l.v("checkObj");
        return null;
    }

    public final ld.c q1() {
        ld.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.H;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final AuctionStatusRetrofitServices s1() {
        AuctionStatusRetrofitServices auctionStatusRetrofitServices = this.I;
        if (auctionStatusRetrofitServices != null) {
            return auctionStatusRetrofitServices;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final void z1(cf.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.J = aVar;
    }
}
