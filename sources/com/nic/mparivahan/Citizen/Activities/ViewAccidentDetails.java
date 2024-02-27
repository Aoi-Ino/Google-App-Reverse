package com.nic.mparivahan.Citizen.Activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetViolationEvidenceResponse;
import com.nic.mparivahan.Citizen.Models.VoilationEvidenceModel;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.utilities.e;
import d9.a2;
import d9.b2;
import d9.z1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import ni.n9;
import pl.x;
import v9.e;

public final class ViewAccidentDetails extends d {
    public Context G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public RecyclerView M;
    public String N;
    public ProgressDialog O;
    public k9.b P;
    public OffenceInterface Q;
    public ImageView R;
    public ImageView S;
    private boolean T;
    private boolean U;
    private String V = "";
    private String W = "";
    private String X = "";
    private n9 Y;
    public ld.c Z;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewAccidentDetails f7818e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ViewAccidentDetails viewAccidentDetails) {
            super(1);
            this.f7818e = viewAccidentDetails;
        }

        public final void b(h9.a aVar) {
            this.f7818e.t1().dismiss();
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((h9.a) null);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewAccidentDetails f7819e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ViewAccidentDetails viewAccidentDetails) {
            super(1);
            this.f7819e = viewAccidentDetails;
        }

        public final void b(GetViolationEvidenceResponse getViolationEvidenceResponse) {
            if (cm.l.a(getViolationEvidenceResponse.getStatusDesc(), "Success")) {
                try {
                    ArrayList<VoilationEvidenceModel> evidences = getViolationEvidenceResponse.getEvidences();
                    if (evidences.size() > 0) {
                        int size = evidences.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            if (cm.l.a(evidences.get(i10).getEvidenceType(), "IMG")) {
                                this.f7819e.M1(true);
                                this.f7819e.F1(evidences.get(i10).getEvidenceVal());
                            }
                            if (cm.l.a(evidences.get(i10).getEvidenceType(), "VID")) {
                                this.f7819e.N1(true);
                                this.f7819e.S1(evidences.get(i10).getEvidenceVal());
                            }
                        }
                        this.f7819e.C1();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                }
            }
            this.f7819e.k1().setVisibility(8);
            this.f7819e.l1().setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetViolationEvidenceResponse) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7820a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f7820a = lVar;
        }

        public final pl.c a() {
            return this.f7820a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7820a.invoke(obj);
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
    public final void C1() {
        if (this.U) {
            k1().setVisibility(0);
            if (this.W.length() > 0) {
                k1().setImageBitmap(e.c(this.W));
            }
        } else {
            k1().setVisibility(8);
        }
        if (this.T) {
            l1().setVisibility(0);
            byte[] decode = Base64.decode(this.V, 0);
            cm.l.c(decode);
            Charset forName = Charset.forName("UTF-8");
            cm.l.e(forName, "forName(charsetName)");
            this.X = new String(decode, forName);
            return;
        }
        l1().setVisibility(8);
    }

    private final void m1() {
        TextView x12;
        String str;
        View findViewById = findViewById(R.id.imageView);
        cm.l.e(findViewById, "findViewById(...)");
        D1((ImageView) findViewById);
        View findViewById2 = findViewById(R.id.videoView);
        cm.l.e(findViewById2, "findViewById(...)");
        E1((ImageView) findViewById2);
        View findViewById3 = findViewById(R.id.acc_feedback);
        cm.l.e(findViewById3, "findViewById(...)");
        A1((RecyclerView) findViewById3);
        View findViewById4 = findViewById(R.id.b_ok_button);
        cm.l.e(findViewById4, "findViewById(...)");
        J1((TextView) findViewById4);
        s1().setOnClickListener(new a2(this));
        View findViewById5 = findViewById(R.id.txt_location);
        cm.l.e(findViewById5, "findViewById(...)");
        P1((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.txt_status);
        cm.l.e(findViewById6, "findViewById(...)");
        Q1((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.txt_vehicle_number);
        cm.l.e(findViewById7, "findViewById(...)");
        R1((TextView) findViewById7);
        View findViewById8 = findViewById(R.id.txt_id);
        cm.l.e(findViewById8, "findViewById(...)");
        O1((TextView) findViewById8);
        w1().setText(getIntent().getStringExtra("location"));
        if (cm.l.a(getIntent().getStringExtra("status"), "0")) {
            x12 = x1();
            str = "Pending";
        } else {
            x12 = x1();
            str = "Active";
        }
        x12.setText(str);
        y1().setText(getIntent().getStringExtra("vehicleNumber"));
        if (j1() != null) {
            TextView v12 = v1();
            v12.setText("Accident ID: #" + j1());
        }
        I1((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(q1()))).a(k9.b.class));
        K1(new ProgressDialog(this));
        t1().setMessage("Please wait...");
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        r1().v().g(this, new c(new a(this)));
        r1().B().g(this, new c(new b(this)));
        l1().setOnClickListener(new b2(this));
    }

    /* access modifiers changed from: private */
    public static final void n1(ViewAccidentDetails viewAccidentDetails, View view) {
        cm.l.f(viewAccidentDetails, "this$0");
        if (viewAccidentDetails.j1() != null) {
            Intent intent = new Intent(viewAccidentDetails, AccidentFeedback.class);
            intent.putExtra("accRecordId", viewAccidentDetails.j1().toString());
            viewAccidentDetails.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    public static final void o1(ViewAccidentDetails viewAccidentDetails, View view) {
        cm.l.f(viewAccidentDetails, "this$0");
        if (com.nic.mparivahan.dlservices.utilities.d.d(viewAccidentDetails.X)) {
            Intent intent = new Intent(viewAccidentDetails, EvidenceVideoPlayActivity.class);
            intent.putExtra("videoUrl", viewAccidentDetails.X);
            viewAccidentDetails.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    public static final void z1(ViewAccidentDetails viewAccidentDetails, View view) {
        cm.l.f(viewAccidentDetails, "this$0");
        viewAccidentDetails.finish();
    }

    public final void A1(RecyclerView recyclerView) {
        cm.l.f(recyclerView, "<set-?>");
        this.M = recyclerView;
    }

    public final void B1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void D1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.R = imageView;
    }

    public final void E1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.S = imageView;
    }

    public final void F1(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void G1(Context context) {
        cm.l.f(context, "<set-?>");
        this.G = context;
    }

    public final void H1(OffenceInterface offenceInterface) {
        cm.l.f(offenceInterface, "<set-?>");
        this.Q = offenceInterface;
    }

    public final void I1(k9.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.P = bVar;
    }

    public final void J1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void K1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.O = progressDialog;
    }

    public final void L1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Z = cVar;
    }

    public final void M1(boolean z10) {
        this.U = z10;
    }

    public final void N1(boolean z10) {
        this.T = z10;
    }

    public final void O1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.K = textView;
    }

    public final void P1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.H = textView;
    }

    public final void Q1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.I = textView;
    }

    public final void R1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final void S1(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final String j1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("accRecordId");
        return null;
    }

    public final ImageView k1() {
        ImageView imageView = this.R;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("evidenceImg");
        return null;
    }

    public final ImageView l1() {
        ImageView imageView = this.S;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("evidenceVideo");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n9 c10 = n9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.Y = c10;
        n9 n9Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        G1(this);
        H1(OffenceInterface.f7826a.b(p1()));
        L1(new ld.c(this));
        e.a aVar = v9.e.f17509a;
        n9 n9Var2 = this.Y;
        if (n9Var2 == null) {
            cm.l.v("binding");
            n9Var2 = null;
        }
        aVar.k(this, n9Var2);
        n9 n9Var3 = this.Y;
        if (n9Var3 == null) {
            cm.l.v("binding");
            n9Var3 = null;
        }
        n9Var3.f27660d.f25961g.setText(u1().b("report_traffic_violation", "Report Traffic Violation"));
        B1(String.valueOf(getIntent().getStringExtra("accRecordId")));
        m1();
        r1().j(j1());
        n9 n9Var4 = this.Y;
        if (n9Var4 == null) {
            cm.l.v("binding");
        } else {
            n9Var = n9Var4;
        }
        n9Var.f27660d.f25959e.setOnClickListener(new z1(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        r1().i(j1());
    }

    public final Context p1() {
        Context context = this.G;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final OffenceInterface q1() {
        OffenceInterface offenceInterface = this.Q;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        cm.l.v("mOffenceInterface");
        return null;
    }

    public final k9.b r1() {
        k9.b bVar = this.P;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mOffenceViewModel");
        return null;
    }

    public final TextView s1() {
        TextView textView = this.L;
        if (textView != null) {
            return textView;
        }
        cm.l.v("OkButton");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.O;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final ld.c u1() {
        ld.c cVar = this.Z;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final TextView v1() {
        TextView textView = this.K;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtId");
        return null;
    }

    public final TextView w1() {
        TextView textView = this.H;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtLocation");
        return null;
    }

    public final TextView x1() {
        TextView textView = this.I;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtStatus");
        return null;
    }

    public final TextView y1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtVehicleNumber");
        return null;
    }
}
