package com.nic.mparivahan.dlservices.ui.appcancel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.appcancel.Pojo.CancelApplSlotDetailsPojo;
import gj.b;
import java.util.ArrayList;
import ld.c;
import ld.f;
import ni.f5;
import oi.g;
import pl.x;
import v9.e;

public final class ApplicantDetails extends g {
    /* access modifiers changed from: private */
    public f5 J;
    private ArrayList K = new ArrayList();
    /* access modifiers changed from: private */
    public String L = "";
    public c M;
    public f N;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicantDetails f21903e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ApplicantDetails applicantDetails) {
            super(1);
            this.f21903e = applicantDetails;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            if (p.o(str, "yes", true)) {
                Intent intent = new Intent(this.f21903e, VerifyMobileScreen.class);
                intent.putExtra("applNo", this.f21903e.L);
                f5 y12 = this.f21903e.J;
                if (y12 == null) {
                    cm.l.v("binding");
                    y12 = null;
                }
                intent.putExtra("dob", y12.f26236e.getText().toString());
                this.f21903e.startActivity(intent);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    private final void B1() {
        E1(this.K);
    }

    private final void E1(ArrayList arrayList) {
        f5 f5Var = null;
        if (((CancelApplSlotDetailsPojo) arrayList.get(0)).getApplName().length() > 0) {
            f5 f5Var2 = this.J;
            if (f5Var2 == null) {
                cm.l.v("binding");
                f5Var2 = null;
            }
            f5Var2.f26242k.setText(((CancelApplSlotDetailsPojo) arrayList.get(0)).getApplName());
        }
        if (((CancelApplSlotDetailsPojo) arrayList.get(0)).getSwdName().length() > 0) {
            f5 f5Var3 = this.J;
            if (f5Var3 == null) {
                cm.l.v("binding");
                f5Var3 = null;
            }
            f5Var3.f26241j.setText(((CancelApplSlotDetailsPojo) arrayList.get(0)).getSwdName());
        }
        if (((CancelApplSlotDetailsPojo) arrayList.get(0)).getDob().length() > 0) {
            f5 f5Var4 = this.J;
            if (f5Var4 == null) {
                cm.l.v("binding");
                f5Var4 = null;
            }
            f5Var4.f26236e.setText(((CancelApplSlotDetailsPojo) arrayList.get(0)).getDob());
        }
        if (((CancelApplSlotDetailsPojo) arrayList.get(0)).getGender().length() > 0) {
            f5 f5Var5 = this.J;
            if (f5Var5 == null) {
                cm.l.v("binding");
                f5Var5 = null;
            }
            f5Var5.f26239h.setText(((CancelApplSlotDetailsPojo) arrayList.get(0)).getGender());
        }
        if (((CancelApplSlotDetailsPojo) arrayList.get(0)).getAge().length() > 0) {
            f5 f5Var6 = this.J;
            if (f5Var6 == null) {
                cm.l.v("binding");
                f5Var6 = null;
            }
            f5Var6.f26234c.setText(((CancelApplSlotDetailsPojo) arrayList.get(0)).getAge());
        }
        if (((CancelApplSlotDetailsPojo) arrayList.get(0)).getSlotDate().length() > 0) {
            f5 f5Var7 = this.J;
            if (f5Var7 == null) {
                cm.l.v("binding");
                f5Var7 = null;
            }
            f5Var7.f26246o.setText(((CancelApplSlotDetailsPojo) arrayList.get(0)).getSlotDate());
        }
        if (((CancelApplSlotDetailsPojo) arrayList.get(0)).getSlotTimings().length() > 0) {
            f5 f5Var8 = this.J;
            if (f5Var8 == null) {
                cm.l.v("binding");
                f5Var8 = null;
            }
            f5Var8.f26249r.setText(((CancelApplSlotDetailsPojo) arrayList.get(0)).getSlotTimings());
        }
        f5 f5Var9 = this.J;
        if (f5Var9 == null) {
            cm.l.v("binding");
            f5Var9 = null;
        }
        f5Var9.f26245n.setOnClickListener(new gj.a(this));
        f5 f5Var10 = this.J;
        if (f5Var10 == null) {
            cm.l.v("binding");
        } else {
            f5Var = f5Var10;
        }
        f5Var.f26240i.setOnClickListener(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void F1(ApplicantDetails applicantDetails, View view) {
        cm.l.f(applicantDetails, "this$0");
        applicantDetails.H1();
    }

    /* access modifiers changed from: private */
    public static final void G1(ApplicantDetails applicantDetails, View view) {
        cm.l.f(applicantDetails, "this$0");
        applicantDetails.onBackPressed();
    }

    private final void H1() {
        String b10 = z1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        String b11 = z1().b("label_want_to_proceed", getString(R.string.are_you_want_to_proceed));
        cm.l.c(b11);
        g.n1(this, b10, b11, 0, (String) null, (String) null, new a(this), 24, (Object) null);
    }

    public final f A1() {
        f fVar = this.N;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final void C1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final void D1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.N = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f5 c10 = f5.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.J = c10;
        f5 f5Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        C1(new c(this));
        D1(new f(this));
        e.a aVar = e.f17509a;
        f5 f5Var2 = this.J;
        if (f5Var2 == null) {
            cm.l.v("binding");
            f5Var2 = null;
        }
        aVar.F(this, f5Var2);
        if (getIntent().hasExtra("slotData")) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("slotData");
            cm.l.c(parcelableArrayListExtra);
            this.K = parcelableArrayListExtra;
        }
        String stringExtra = getIntent().getStringExtra("applNo");
        cm.l.c(stringExtra);
        this.L = stringExtra;
        f5 f5Var3 = this.J;
        if (f5Var3 == null) {
            cm.l.v("binding");
        } else {
            f5Var = f5Var3;
        }
        f5Var.f26243l.f28452f.setText(A1().i());
        B1();
    }

    public final c z1() {
        c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }
}
