package com.nic.mparivahan.NewDesignActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cc.a0;
import cc.c0;
import cc.y;
import cc.z;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.DLVirtualRcScreen;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.UpdateDocSuccessResponse;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.RcInterface.RcService;
import ni.ma;
import pl.x;

public final class VirtualDlActivity extends androidx.appcompat.app.d {
    public ma G;
    public DatabaseHelper H;
    public ld.g I;
    public ProgressDialog J;
    public za.a K;
    public DlService L;
    public DldetobjX M;
    public cd.c N;
    public RcService O;
    public ld.c P;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDlActivity f9264e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VirtualDlActivity virtualDlActivity) {
            super(1);
            this.f9264e = virtualDlActivity;
        }

        public final void b(UpdateDocSuccessResponse updateDocSuccessResponse) {
            if (cm.l.a(updateDocSuccessResponse.getStatusCode(), "VTLD001")) {
                this.f9264e.p1().j(q.B0(this.f9264e.m1().getDlobj().getDlLicno().toString()).toString(), z9.a.f18947a.b(q.B0(this.f9264e.m1().getBioObj().getBioDob().toString()).toString()), this.f9264e);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UpdateDocSuccessResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDlActivity f9265e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VirtualDlActivity virtualDlActivity) {
            super(1);
            this.f9265e = virtualDlActivity;
        }

        public final void b(String str) {
            if (this.f9265e.s1().isShowing()) {
                this.f9265e.s1().dismiss();
            }
            VirtualDlActivity virtualDlActivity = this.f9265e;
            virtualDlActivity.K1(virtualDlActivity, "Unable to update the Virtual DL, Please try after some time!");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDlActivity f9266e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VirtualDlActivity virtualDlActivity) {
            super(1);
            this.f9266e = virtualDlActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x00d1, code lost:
            r0 = r0.getDlobj();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1 r5) {
            /*
                r4 = this;
                com.nic.mparivahan.NewDesignActivity.VirtualDlActivity r0 = r4.f9266e     // Catch:{ Exception -> 0x0016 }
                android.app.ProgressDialog r0 = r0.s1()     // Catch:{ Exception -> 0x0016 }
                boolean r0 = r0.isShowing()     // Catch:{ Exception -> 0x0016 }
                if (r0 == 0) goto L_0x0019
                com.nic.mparivahan.NewDesignActivity.VirtualDlActivity r0 = r4.f9266e     // Catch:{ Exception -> 0x0016 }
                android.app.ProgressDialog r0 = r0.s1()     // Catch:{ Exception -> 0x0016 }
                r0.dismiss()     // Catch:{ Exception -> 0x0016 }
                goto L_0x0019
            L_0x0016:
                r5 = move-exception
                goto L_0x0141
            L_0x0019:
                com.nic.mparivahan.NewDesignActivity.VirtualDlActivity r0 = r4.f9266e     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.DB.DatabaseHelper r0 = r0.l1()     // Catch:{ Exception -> 0x00dc }
                java.util.List r1 = r5.getDldetobj()     // Catch:{ Exception -> 0x00dc }
                r2 = 0
                java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.DldetobjX r1 = (com.nic.mparivahan.Dl.Model.DldetobjX) r1     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x00dc }
                java.lang.String r1 = r1.getDlLicno()     // Catch:{ Exception -> 0x00dc }
                java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x00dc }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00dc }
                java.util.List r3 = r5.getDldetobj()     // Catch:{ Exception -> 0x00dc }
                java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x00dc }
                r0.M0(r1, r3)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.NewDesignActivity.VirtualDlActivity r0 = r4.f9266e     // Catch:{ Exception -> 0x00dc }
                ni.ma r0 = r0.k1()     // Catch:{ Exception -> 0x00dc }
                android.widget.TextView r0 = r0.f27466h     // Catch:{ Exception -> 0x00dc }
                java.util.List r1 = r5.getDldetobj()     // Catch:{ Exception -> 0x00dc }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.DldetobjX r1 = (com.nic.mparivahan.Dl.Model.DldetobjX) r1     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.BioObjX r1 = r1.getBioObj()     // Catch:{ Exception -> 0x00dc }
                java.lang.String r1 = r1.getBioSwdFullName()     // Catch:{ Exception -> 0x00dc }
                r0.setText(r1)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.NewDesignActivity.VirtualDlActivity r0 = r4.f9266e     // Catch:{ Exception -> 0x00dc }
                ni.ma r0 = r0.k1()     // Catch:{ Exception -> 0x00dc }
                android.widget.TextView r0 = r0.f27460b     // Catch:{ Exception -> 0x00dc }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dc }
                r1.<init>()     // Catch:{ Exception -> 0x00dc }
                java.util.List r3 = r5.getDldetobj()     // Catch:{ Exception -> 0x00dc }
                java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.BioObjX r3 = r3.getBioObj()     // Catch:{ Exception -> 0x00dc }
                java.lang.String r3 = r3.getBioPermAdd1()     // Catch:{ Exception -> 0x00dc }
                r1.append(r3)     // Catch:{ Exception -> 0x00dc }
                r3 = 32
                r1.append(r3)     // Catch:{ Exception -> 0x00dc }
                java.util.List r3 = r5.getDldetobj()     // Catch:{ Exception -> 0x00dc }
                java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.BioObjX r3 = r3.getBioObj()     // Catch:{ Exception -> 0x00dc }
                java.lang.String r3 = r3.getBioPermAdd2()     // Catch:{ Exception -> 0x00dc }
                r1.append(r3)     // Catch:{ Exception -> 0x00dc }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00dc }
                r0.setText(r1)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.NewDesignActivity.VirtualDlActivity r0 = r4.f9266e     // Catch:{ Exception -> 0x00dc }
                ni.ma r0 = r0.k1()     // Catch:{ Exception -> 0x00dc }
                android.widget.TextView r0 = r0.f27463e     // Catch:{ Exception -> 0x00dc }
                java.util.List r1 = r5.getDldetobj()     // Catch:{ Exception -> 0x00dc }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.DldetobjX r1 = (com.nic.mparivahan.Dl.Model.DldetobjX) r1     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x00dc }
                java.lang.String r1 = r1.getDlIssuedt()     // Catch:{ Exception -> 0x00dc }
                r0.setText(r1)     // Catch:{ Exception -> 0x00dc }
                java.util.List r0 = r5.getDldetobj()     // Catch:{ Exception -> 0x00dc }
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.DldetobjX r0 = (com.nic.mparivahan.Dl.Model.DldetobjX) r0     // Catch:{ Exception -> 0x00dc }
                r1 = 0
                if (r0 == 0) goto L_0x00de
                com.nic.mparivahan.Dl.Model.DlobjX r0 = r0.getDlobj()     // Catch:{ Exception -> 0x00dc }
                if (r0 == 0) goto L_0x00de
                java.lang.String r0 = r0.getDlNtValdtoDt()     // Catch:{ Exception -> 0x00dc }
                goto L_0x00df
            L_0x00dc:
                r5 = move-exception
                goto L_0x013d
            L_0x00de:
                r0 = r1
            L_0x00df:
                if (r0 == 0) goto L_0x0114
                int r0 = r0.length()     // Catch:{ Exception -> 0x00dc }
                if (r0 != 0) goto L_0x00e8
                goto L_0x0114
            L_0x00e8:
                com.nic.mparivahan.NewDesignActivity.VirtualDlActivity r0 = r4.f9266e     // Catch:{ Exception -> 0x00dc }
                ni.ma r0 = r0.k1()     // Catch:{ Exception -> 0x00dc }
                android.widget.TextView r0 = r0.f27464f     // Catch:{ Exception -> 0x00dc }
                z9.a$a r3 = z9.a.f18947a     // Catch:{ Exception -> 0x00dc }
                java.util.List r5 = r5.getDldetobj()     // Catch:{ Exception -> 0x00dc }
                java.lang.Object r5 = r5.get(r2)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = (com.nic.mparivahan.Dl.Model.DldetobjX) r5     // Catch:{ Exception -> 0x00dc }
                if (r5 == 0) goto L_0x0108
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x00dc }
                if (r5 == 0) goto L_0x0108
                java.lang.String r1 = r5.getDlTrValdtoDt()     // Catch:{ Exception -> 0x00dc }
            L_0x0108:
                java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00dc }
                java.lang.String r5 = r3.f(r5)     // Catch:{ Exception -> 0x00dc }
            L_0x0110:
                r0.setText(r5)     // Catch:{ Exception -> 0x00dc }
                goto L_0x0159
            L_0x0114:
                com.nic.mparivahan.NewDesignActivity.VirtualDlActivity r0 = r4.f9266e     // Catch:{ Exception -> 0x00dc }
                ni.ma r0 = r0.k1()     // Catch:{ Exception -> 0x00dc }
                android.widget.TextView r0 = r0.f27464f     // Catch:{ Exception -> 0x00dc }
                z9.a$a r3 = z9.a.f18947a     // Catch:{ Exception -> 0x00dc }
                java.util.List r5 = r5.getDldetobj()     // Catch:{ Exception -> 0x00dc }
                java.lang.Object r5 = r5.get(r2)     // Catch:{ Exception -> 0x00dc }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = (com.nic.mparivahan.Dl.Model.DldetobjX) r5     // Catch:{ Exception -> 0x00dc }
                if (r5 == 0) goto L_0x0134
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x00dc }
                if (r5 == 0) goto L_0x0134
                java.lang.String r1 = r5.getDlNtValdtoDt()     // Catch:{ Exception -> 0x00dc }
            L_0x0134:
                java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00dc }
                java.lang.String r5 = r3.f(r5)     // Catch:{ Exception -> 0x00dc }
                goto L_0x0110
            L_0x013d:
                r5.printStackTrace()     // Catch:{ Exception -> 0x0016 }
                goto L_0x0159
            L_0x0141:
                r5.printStackTrace()
                com.nic.mparivahan.NewDesignActivity.VirtualDlActivity r5 = r4.f9266e
                android.app.ProgressDialog r5 = r5.s1()
                boolean r5 = r5.isShowing()
                if (r5 == 0) goto L_0x0159
                com.nic.mparivahan.NewDesignActivity.VirtualDlActivity r5 = r4.f9266e
                android.app.ProgressDialog r5 = r5.s1()
                r5.dismiss()
            L_0x0159:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.NewDesignActivity.VirtualDlActivity.c.b(com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLServiceResponseModleV1) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDlActivity f9267e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VirtualDlActivity virtualDlActivity) {
            super(1);
            this.f9267e = virtualDlActivity;
        }

        public final void b(String str) {
            try {
                if (this.f9267e.s1().isShowing()) {
                    this.f9267e.s1().dismiss();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (this.f9267e.s1().isShowing()) {
                    this.f9267e.s1().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDlActivity f9268e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VirtualDlActivity virtualDlActivity) {
            super(1);
            this.f9268e = virtualDlActivity;
        }

        public final void b(DLServiceResponseModleV1 dLServiceResponseModleV1) {
            try {
                if (this.f9268e.s1().isShowing()) {
                    this.f9268e.s1().dismiss();
                }
                try {
                    this.f9268e.l1().M0(q.B0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                    VirtualDlActivity virtualDlActivity = this.f9268e;
                    virtualDlActivity.K1(virtualDlActivity, "Virtual DL Successfully updated!");
                } catch (Exception e10) {
                    e10.printStackTrace();
                    VirtualDlActivity virtualDlActivity2 = this.f9268e;
                    virtualDlActivity2.K1(virtualDlActivity2, "Unable to update the Virtual DL, Please try after some time!");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (this.f9268e.s1().isShowing()) {
                    this.f9268e.s1().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLServiceResponseModleV1) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDlActivity f9269e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VirtualDlActivity virtualDlActivity) {
            super(1);
            this.f9269e = virtualDlActivity;
        }

        public final void b(String str) {
            try {
                if (this.f9269e.s1().isShowing()) {
                    this.f9269e.s1().dismiss();
                }
                VirtualDlActivity virtualDlActivity = this.f9269e;
                virtualDlActivity.K1(virtualDlActivity, "Unable to update the Virtual DL, Please try after some time!");
            } catch (Exception e10) {
                e10.printStackTrace();
                if (this.f9269e.s1().isShowing()) {
                    this.f9269e.s1().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDlActivity f9270e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VirtualDlActivity virtualDlActivity) {
            super(1);
            this.f9270e = virtualDlActivity;
        }

        public final void b(MyRcDeletResponse myRcDeletResponse) {
            Toast makeText;
            try {
                this.f9270e.s1().dismiss();
                if (p.o(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        this.f9270e.l1().E();
                        VirtualDlActivity virtualDlActivity = this.f9270e;
                        virtualDlActivity.K1(virtualDlActivity, "Virtual DL successfully deleted!");
                        this.f9270e.B1();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        makeText = Toast.makeText(this.f9270e.getApplicationContext(), "Unable to delete the Virtual DL, Please try after some times", 1);
                    }
                } else {
                    makeText = p.o(myRcDeletResponse.getStatusCode(), "VTLD007", true) ? Toast.makeText(this.f9270e.getApplicationContext(), "Unable to delete the Virtual DL, Please try after some times", 1) : Toast.makeText(this.f9270e.getApplicationContext(), "Unable to delete the Virtual DL, Please try after some times", 1);
                    makeText.show();
                }
            } catch (Exception e11) {
                if (this.f9270e.s1().isShowing()) {
                    this.f9270e.s1().dismiss();
                }
                e11.printStackTrace();
                Toast.makeText(this.f9270e.getApplicationContext(), "Unable to delete the Virtual DL, Please try after some times", 1).show();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VirtualDlActivity f9271e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VirtualDlActivity virtualDlActivity) {
            super(1);
            this.f9271e = virtualDlActivity;
        }

        public final void b(String str) {
            if (this.f9271e.s1().isShowing()) {
                this.f9271e.s1().dismiss();
            }
            Toast.makeText(this.f9271e.getApplicationContext(), "Unable to delete the Virtual DL, Please try after some times", 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9272a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f9272a = lVar;
        }

        public final pl.c a() {
            return this.f9272a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9272a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void L1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void t1() {
        k1().f27467i.setNestedScrollingEnabled(false);
        k1().f27469k.f28305f.setOnClickListener(new y(this));
        k1().f27469k.f28306g.setOnClickListener(new z(this));
        H1((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(q1()))).a(cd.c.class));
        F1((za.a) new u0((x0) this, (u0.b) new za.b(new ya.a(o1()))).a(za.a.class));
        B1();
        k1().f27465g.setOnClickListener(new a0(this));
        p1().r().g(this, new i(new c(this)));
        p1().s().g(this, new i(new d(this)));
        p1().n().g(this, new i(new e(this)));
        p1().o().g(this, new i(new f(this)));
        r1().x().g(this, new i(new g(this)));
        r1().y().g(this, new i(new h(this)));
        p1().y().g(this, new i(new a(this)));
        p1().x().g(this, new i(new b(this)));
    }

    /* access modifiers changed from: private */
    public static final void u1(VirtualDlActivity virtualDlActivity, View view) {
        cm.l.f(virtualDlActivity, "this$0");
        virtualDlActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void v1(VirtualDlActivity virtualDlActivity, View view) {
        cm.l.f(virtualDlActivity, "this$0");
        virtualDlActivity.y1();
    }

    /* access modifiers changed from: private */
    public static final void w1(VirtualDlActivity virtualDlActivity, View view) {
        cm.l.f(virtualDlActivity, "this$0");
        PopupMenu popupMenu = new PopupMenu(virtualDlActivity, virtualDlActivity.k1().f27465g);
        popupMenu.inflate(R.menu.dl_menu);
        popupMenu.setGravity(5);
        popupMenu.setOnMenuItemClickListener(new c0(virtualDlActivity));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public static final boolean x1(VirtualDlActivity virtualDlActivity, MenuItem menuItem) {
        cm.l.f(virtualDlActivity, "this$0");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /*2131363612*/:
                virtualDlActivity.startActivity(new Intent(virtualDlActivity, DLVirtualRcScreen.class));
                break;
            case R.id.menu2 /*2131363613*/:
                try {
                    if (virtualDlActivity.s1().isShowing()) {
                        virtualDlActivity.s1().dismiss();
                    }
                    virtualDlActivity.s1().show();
                    DldetobjX dldetails = ((DLDocument) virtualDlActivity.l1().c0().get(0)).getDldetails();
                    cm.l.c(dldetails);
                    virtualDlActivity.C1(dldetails);
                    String j02 = virtualDlActivity.l1().j0(q.B0(virtualDlActivity.m1().getDlobj().getDlLicno()).toString());
                    za.a p12 = virtualDlActivity.p1();
                    cm.l.c(j02);
                    p12.E(j02, "DL", z9.a.f18947a.a(q.B0(virtualDlActivity.m1().getBioObj().getBioDob()).toString()), virtualDlActivity);
                    break;
                } catch (Exception unused) {
                    if (virtualDlActivity.s1().isShowing()) {
                        virtualDlActivity.s1().dismiss();
                        break;
                    }
                }
                break;
            case R.id.menu3 /*2131363614*/:
                if (virtualDlActivity.k1().f27462d.getText().toString().length() > 0) {
                    try {
                        if (virtualDlActivity.s1().isShowing()) {
                            virtualDlActivity.s1().dismiss();
                        }
                        virtualDlActivity.s1().show();
                        String j03 = virtualDlActivity.l1().j0(new km.f("\\s").b(virtualDlActivity.k1().f27462d.getText().toString(), ""));
                        if (j03 != null) {
                            if (j03.length() != 0) {
                                cd.c r12 = virtualDlActivity.r1();
                                cm.l.c(j03);
                                r12.g(j03, virtualDlActivity);
                                break;
                            } else {
                                break;
                            }
                        }
                    } catch (Exception e10) {
                        if (virtualDlActivity.s1().isShowing()) {
                            virtualDlActivity.s1().dismiss();
                        }
                        e10.printStackTrace();
                        break;
                    }
                }
                break;
        }
        return false;
    }

    private final void y1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.H = databaseHelper;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00af, code lost:
        r0 = r0.getBioObj();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B1() {
        /*
            r10 = this;
            com.nic.mparivahan.DB.DatabaseHelper r0 = r10.l1()
            java.util.ArrayList r0 = r0.c0()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x01d2
            ni.ma r0 = r10.k1()
            android.widget.TextView r0 = r0.f27468j
            r0.setVisibility(r1)
            ni.ma r0 = r10.k1()
            android.widget.LinearLayout r0 = r0.f27461c
            r0.setVisibility(r2)
            com.nic.mparivahan.DB.DatabaseHelper r0 = r10.l1()
            java.util.ArrayList r0 = r0.c0()
            java.lang.Object r3 = r0.get(r2)
            com.nic.mparivahan.Dl.Model.DLDocument r3 = (com.nic.mparivahan.Dl.Model.DLDocument) r3
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r3.getDldetails()
            java.lang.Object r4 = r0.get(r2)
            com.nic.mparivahan.Dl.Model.DLDocument r4 = (com.nic.mparivahan.Dl.Model.DLDocument) r4
            java.lang.String r4 = r4.getDocnumber()
            if (r4 == 0) goto L_0x01ed
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0045
            goto L_0x01ed
        L_0x0045:
            ni.ma r4 = r10.k1()
            android.widget.TextView r4 = r4.f27462d
            java.lang.Object r5 = r0.get(r2)
            com.nic.mparivahan.Dl.Model.DLDocument r5 = (com.nic.mparivahan.Dl.Model.DLDocument) r5
            java.lang.String r5 = r5.getDocnumber()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.setText(r5)
            java.lang.Object r4 = r0.get(r2)
            com.nic.mparivahan.Dl.Model.DLDocument r4 = (com.nic.mparivahan.Dl.Model.DLDocument) r4
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r4.getDldetails()
            if (r4 != 0) goto L_0x009c
            android.app.ProgressDialog r1 = r10.s1()
            r1.show()
            za.a r1 = r10.p1()
            java.lang.Object r3 = r0.get(r2)
            com.nic.mparivahan.Dl.Model.DLDocument r3 = (com.nic.mparivahan.Dl.Model.DLDocument) r3
            java.lang.String r3 = r3.getDocnumber()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object r0 = r0.get(r2)
            com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0
            java.lang.String r0 = r0.getDob()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r0 = km.q.B0(r0)
            java.lang.String r0 = r0.toString()
            r1.i(r3, r0, r10)
            goto L_0x01ed
        L_0x009c:
            ni.ma r4 = r10.k1()
            android.widget.TextView r4 = r4.f27466h
            java.lang.Object r0 = r0.get(r2)
            com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r0.getDldetails()
            r2 = 0
            if (r0 == 0) goto L_0x00ba
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = r0.getBioFullName()
            goto L_0x00bb
        L_0x00ba:
            r0 = r2
        L_0x00bb:
            r4.setText(r0)
            ni.ma r0 = r10.k1()
            android.widget.TextView r0 = r0.f27460b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            if (r3 == 0) goto L_0x00d0
            com.nic.mparivahan.Dl.Model.BioObjX r5 = r3.getBioObj()
            goto L_0x00d1
        L_0x00d0:
            r5 = r2
        L_0x00d1:
            cm.l.c(r5)
            java.lang.String r5 = r5.getBioPermAdd1()
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r3.getBioObj()
            java.lang.String r6 = r6.getBioPermAdd2()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
            ni.ma r0 = r10.k1()
            android.widget.TextView r0 = r0.f27463e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Issue Date :"
            r4.append(r6)
            z9.a$a r6 = z9.a.f18947a
            com.nic.mparivahan.Dl.Model.DlobjX r7 = r3.getDlobj()
            java.lang.String r7 = r7.getDlIssuedt()
            java.lang.String r7 = r6.f(r7)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
            ni.ma r0 = r10.k1()
            android.widget.TextView r0 = r0.f27463e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            ld.c r7 = r10.n1()
            java.lang.String r8 = "issue_date"
            java.lang.String r9 = "Issue Date"
            java.lang.String r7 = r7.b(r8, r9)
            r4.append(r7)
            java.lang.String r7 = " - "
            r4.append(r7)
            com.nic.mparivahan.Dl.Model.DlobjX r7 = r3.getDlobj()
            java.lang.String r7 = r7.getDlIssuedt()
            java.lang.String r7 = r6.f(r7)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
            ni.ma r0 = r10.k1()
            android.widget.TextView r0 = r0.f27470l
            r0.setVisibility(r1)
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r3.getDlobj()
            if (r0 == 0) goto L_0x0163
            java.lang.String r0 = r0.getDlNtValdtoDt()
            goto L_0x0164
        L_0x0163:
            r0 = r2
        L_0x0164:
            java.lang.String r1 = "Valid Upto"
            java.lang.String r4 = "label_dl_serv_valid_upto"
            if (r0 == 0) goto L_0x01ae
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0171
            goto L_0x01ae
        L_0x0171:
            java.lang.String r0 = "details"
            java.lang.String r7 = "call2"
            android.util.Log.e(r0, r7)
            ni.ma r0 = r10.k1()
            android.widget.TextView r0 = r0.f27464f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            ld.c r8 = r10.n1()
            java.lang.String r1 = r8.b(r4, r1)
            r7.append(r1)
            r7.append(r5)
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r3.getDlobj()
            if (r1 == 0) goto L_0x019b
            java.lang.String r2 = r1.getDlNtValdtoDt()
        L_0x019b:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r1 = r6.f(r1)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
        L_0x01aa:
            r0.setText(r1)
            goto L_0x01ed
        L_0x01ae:
            ni.ma r0 = r10.k1()
            android.widget.TextView r0 = r0.f27464f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            ld.c r8 = r10.n1()
            java.lang.String r1 = r8.b(r4, r1)
            r7.append(r1)
            r7.append(r5)
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r3.getDlobj()
            if (r1 == 0) goto L_0x019b
            java.lang.String r2 = r1.getDlTrValdtoDt()
            goto L_0x019b
        L_0x01d2:
            ni.ma r0 = r10.k1()
            android.widget.LinearLayout r0 = r0.f27461c
            r0.setVisibility(r1)
            ni.ma r0 = r10.k1()
            android.widget.TextView r0 = r0.f27468j
            r0.setVisibility(r2)
            ni.ma r0 = r10.k1()
            android.widget.TextView r0 = r0.f27468j
            java.lang.String r1 = "No Virtual DL Found"
            goto L_0x01aa
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.NewDesignActivity.VirtualDlActivity.B1():void");
    }

    public final void C1(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.M = dldetobjX;
    }

    public final void D1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.P = cVar;
    }

    public final void E1(DlService dlService) {
        cm.l.f(dlService, "<set-?>");
        this.L = dlService;
    }

    public final void F1(za.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.K = aVar;
    }

    public final void G1(RcService rcService) {
        cm.l.f(rcService, "<set-?>");
        this.O = rcService;
    }

    public final void H1(cd.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.N = cVar;
    }

    public final void I1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void J1(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.I = gVar;
    }

    public final void K1(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(n1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(n1().b("btn_ok", "OK"));
        textView.setOnClickListener(new cc.b0(dialog));
        dialog.show();
    }

    public final ma k1() {
        ma maVar = this.G;
        if (maVar != null) {
            return maVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final DatabaseHelper l1() {
        DatabaseHelper databaseHelper = this.H;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final DldetobjX m1() {
        DldetobjX dldetobjX = this.M;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dl_data");
        return null;
    }

    public final ld.c n1() {
        ld.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final DlService o1() {
        DlService dlService = this.L;
        if (dlService != null) {
            return dlService;
        }
        cm.l.v("mDlService");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.doc_virtual_dl);
        ma c10 = ma.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        z1(c10);
        setContentView((View) k1().b());
        D1(new ld.c(this));
        G1(RcService.f9484a.c(this));
        E1(DlService.f8615a.c(this));
        J1(new ld.g(this));
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        A1(A0);
        I1(new ProgressDialog(this));
        s1().setMessage("Please wait...");
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        t1();
    }

    public final za.a p1() {
        za.a aVar = this.K;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mDlViewModel");
        return null;
    }

    public final RcService q1() {
        RcService rcService = this.O;
        if (rcService != null) {
            return rcService;
        }
        cm.l.v("mRcService");
        return null;
    }

    public final cd.c r1() {
        cd.c cVar = this.N;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mRcViewModel");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void z1(ma maVar) {
        cm.l.f(maVar, "<set-?>");
        this.G = maVar;
    }
}
