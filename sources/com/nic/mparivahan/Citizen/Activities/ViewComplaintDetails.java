package com.nic.mparivahan.Citizen.Activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetTrafficFeedback;
import com.nic.mparivahan.Citizen.Models.GetViolationEvidenceResponse;
import com.nic.mparivahan.Citizen.Models.VoilationEvidenceModel;
import com.nic.mparivahan.R;
import d9.c2;
import d9.d2;
import d9.e2;
import j4.e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import ni.o9;
import pl.x;
import v9.e;

public final class ViewComplaintDetails extends androidx.appcompat.app.d implements e {
    public Context G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public String M;
    public RecyclerView N;
    public ProgressDialog O;
    public k9.b P;
    public OffenceInterface Q;
    public ArrayList R;
    public ImageView S;
    public ImageView T;
    private boolean U;
    private boolean V;
    private String W = "";
    private String X = "";
    private String Y = "";
    private o9 Z;

    /* renamed from: a0  reason: collision with root package name */
    public ld.c f7821a0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewComplaintDetails f7822e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ViewComplaintDetails viewComplaintDetails) {
            super(1);
            this.f7822e = viewComplaintDetails;
        }

        public final void b(GetTrafficFeedback getTrafficFeedback) {
            try {
                this.f7822e.t1().dismiss();
                if (cm.l.a(getTrafficFeedback.getStatusDesc(), "Success")) {
                    this.f7822e.v1().setLayoutManager(new LinearLayoutManager(this.f7822e));
                    this.f7822e.v1().setAdapter((RecyclerView.h) null);
                    this.f7822e.I1(getTrafficFeedback.getViolationFeedbacks());
                    x.N(this.f7822e.p1());
                    this.f7822e.v1().setAdapter(new e9.d(this.f7822e.p1(), this.f7822e.o1()));
                }
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetTrafficFeedback) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewComplaintDetails f7823e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ViewComplaintDetails viewComplaintDetails) {
            super(1);
            this.f7823e = viewComplaintDetails;
        }

        public final void b(String str) {
            if (this.f7823e.t1().isShowing()) {
                this.f7823e.t1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewComplaintDetails f7824e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ViewComplaintDetails viewComplaintDetails) {
            super(1);
            this.f7824e = viewComplaintDetails;
        }

        public final void b(GetViolationEvidenceResponse getViolationEvidenceResponse) {
            if (cm.l.a(getViolationEvidenceResponse.getStatusDesc(), "Success")) {
                try {
                    ArrayList<VoilationEvidenceModel> evidences = getViolationEvidenceResponse.getEvidences();
                    if (evidences.size() > 0) {
                        int size = evidences.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            if (cm.l.a(evidences.get(i10).getEvidenceType(), "IMG")) {
                                this.f7824e.O1(true);
                                this.f7824e.G1(evidences.get(i10).getEvidenceVal());
                            }
                            if (cm.l.a(evidences.get(i10).getEvidenceType(), "VID")) {
                                this.f7824e.P1(true);
                                if (evidences.get(i10).getEvidenceVal().length() > 0) {
                                    this.f7824e.V1(evidences.get(i10).getEvidenceVal());
                                    Log.e("VideoLink - ", this.f7824e.A1());
                                }
                            }
                        }
                        this.f7824e.D1();
                    }
                } catch (Exception e10) {
                    this.f7824e.j1().setVisibility(8);
                    this.f7824e.k1().setVisibility(8);
                    e10.printStackTrace();
                }
            } else {
                this.f7824e.j1().setVisibility(8);
                this.f7824e.k1().setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetViolationEvidenceResponse) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7825a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f7825a = lVar;
        }

        public final pl.c a() {
            return this.f7825a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7825a.invoke(obj);
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
    public static final void C1(ViewComplaintDetails viewComplaintDetails, View view) {
        cm.l.f(viewComplaintDetails, "this$0");
        viewComplaintDetails.finish();
    }

    /* access modifiers changed from: private */
    public final void D1() {
        if (this.V) {
            j1().setVisibility(0);
            if (this.X.length() > 0) {
                j1().setImageBitmap(com.nic.mparivahan.dlservices.utilities.e.c(this.X));
            }
        } else {
            j1().setVisibility(8);
        }
        if (this.U) {
            k1().setVisibility(0);
            byte[] decode = Base64.decode(this.W, 0);
            cm.l.c(decode);
            Charset forName = Charset.forName("UTF-8");
            cm.l.e(forName, "forName(charsetName)");
            String str = new String(decode, forName);
            this.Y = str;
            Log.e("VideoLink - ", str);
            return;
        }
        k1().setVisibility(8);
    }

    private final void l1() {
        TextView y12;
        String str;
        View findViewById = findViewById(R.id.imageView);
        cm.l.e(findViewById, "findViewById(...)");
        E1((ImageView) findViewById);
        View findViewById2 = findViewById(R.id.videoView);
        cm.l.e(findViewById2, "findViewById(...)");
        F1((ImageView) findViewById2);
        View findViewById3 = findViewById(R.id.traffic_feedback);
        cm.l.e(findViewById3, "findViewById(...)");
        Q1((RecyclerView) findViewById3);
        View findViewById4 = findViewById(R.id.b_ok_button);
        cm.l.e(findViewById4, "findViewById(...)");
        L1((TextView) findViewById4);
        s1().setOnClickListener(new d2(this));
        View findViewById5 = findViewById(R.id.txt_location);
        cm.l.e(findViewById5, "findViewById(...)");
        S1((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.txt_status);
        cm.l.e(findViewById6, "findViewById(...)");
        T1((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.txt_vehicle_number);
        cm.l.e(findViewById7, "findViewById(...)");
        U1((TextView) findViewById7);
        View findViewById8 = findViewById(R.id.txt_id);
        cm.l.e(findViewById8, "findViewById(...)");
        R1((TextView) findViewById8);
        x1().setText(getIntent().getStringExtra("location"));
        if (cm.l.a(getIntent().getStringExtra("status"), "0")) {
            y12 = y1();
            str = "Pending";
        } else {
            y12 = y1();
            str = "Active";
        }
        y12.setText(str);
        z1().setText(getIntent().getStringExtra("vehicleNumber"));
        if (B1() != null) {
            TextView w12 = w1();
            w12.setText("Violation ID: #" + B1());
        }
        K1((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(q1()))).a(k9.b.class));
        M1(new ProgressDialog(this));
        t1().setMessage("Please wait...");
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        r1().A().g(this, new d(new a(this)));
        r1().s().g(this, new d(new b(this)));
        r1().B().g(this, new d(new c(this)));
        k1().setOnClickListener(new e2(this));
    }

    /* access modifiers changed from: private */
    public static final void m1(ViewComplaintDetails viewComplaintDetails, View view) {
        cm.l.f(viewComplaintDetails, "this$0");
        if (viewComplaintDetails.B1() != null) {
            Intent intent = new Intent(viewComplaintDetails, TrafficFeedback.class);
            intent.putExtra("violOffenceId", viewComplaintDetails.B1().toString());
            viewComplaintDetails.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    public static final void n1(ViewComplaintDetails viewComplaintDetails, View view) {
        cm.l.f(viewComplaintDetails, "this$0");
        if (com.nic.mparivahan.dlservices.utilities.d.d(viewComplaintDetails.Y)) {
            Intent intent = new Intent(viewComplaintDetails, EvidenceVideoPlayActivity.class);
            intent.putExtra("videoUrl", viewComplaintDetails.Y);
            viewComplaintDetails.startActivity(intent);
        }
    }

    public final String A1() {
        return this.W;
    }

    public final String B1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("violOffenceId");
        return null;
    }

    public final void E1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.S = imageView;
    }

    public final void F1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.T = imageView;
    }

    public final void G1(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final void H1(Context context) {
        cm.l.f(context, "<set-?>");
        this.G = context;
    }

    public final void I1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.R = arrayList;
    }

    public final void J1(OffenceInterface offenceInterface) {
        cm.l.f(offenceInterface, "<set-?>");
        this.Q = offenceInterface;
    }

    public final void K1(k9.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.P = bVar;
    }

    public final void L1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void M1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.O = progressDialog;
    }

    public final void N1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f7821a0 = cVar;
    }

    public final void O1(boolean z10) {
        this.V = z10;
    }

    public final void P1(boolean z10) {
        this.U = z10;
    }

    public final void Q1(RecyclerView recyclerView) {
        cm.l.f(recyclerView, "<set-?>");
        this.N = recyclerView;
    }

    public final void R1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.K = textView;
    }

    public final void S1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.H = textView;
    }

    public final void T1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.I = textView;
    }

    public final void U1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void W1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final ImageView j1() {
        ImageView imageView = this.S;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("evidenceImg");
        return null;
    }

    public final ImageView k1() {
        ImageView imageView = this.T;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("evidenceVideo");
        return null;
    }

    public void m(j4.c cVar) {
        cm.l.f(cVar, "googleMap");
    }

    public final Context o1() {
        Context context = this.G;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o9 c10 = o9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.Z = c10;
        o9 o9Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        H1(this);
        J1(OffenceInterface.f7826a.b(this));
        W1(String.valueOf(getIntent().getStringExtra("violOffenceId")));
        N1(new ld.c(this));
        e.a aVar = v9.e.f17509a;
        o9 o9Var2 = this.Z;
        if (o9Var2 == null) {
            cm.l.v("binding");
            o9Var2 = null;
        }
        aVar.j(this, o9Var2);
        o9 o9Var3 = this.Z;
        if (o9Var3 == null) {
            cm.l.v("binding");
            o9Var3 = null;
        }
        o9Var3.f27814c.f25961g.setText(u1().b("report_traffic_violation", "View Details"));
        l1();
        r1().U(B1());
        o9 o9Var4 = this.Z;
        if (o9Var4 == null) {
            cm.l.v("binding");
        } else {
            o9Var = o9Var4;
        }
        o9Var.f27814c.f25959e.setOnClickListener(new c2(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        r1().S(B1());
    }

    public final ArrayList p1() {
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("mListVal");
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
        ld.c cVar = this.f7821a0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final RecyclerView v1() {
        RecyclerView recyclerView = this.N;
        if (recyclerView != null) {
            return recyclerView;
        }
        cm.l.v("trafficFeedBackRecyclerView");
        return null;
    }

    public final TextView w1() {
        TextView textView = this.K;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtId");
        return null;
    }

    public final TextView x1() {
        TextView textView = this.H;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtLocation");
        return null;
    }

    public final TextView y1() {
        TextView textView = this.I;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtStatus");
        return null;
    }

    public final TextView z1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtVehicleNumber");
        return null;
    }
}
