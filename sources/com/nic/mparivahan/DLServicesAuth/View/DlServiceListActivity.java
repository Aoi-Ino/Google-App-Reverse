package com.nic.mparivahan.DLServicesAuth.View;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster;
import com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewService.NewServPojo.EkycImplState;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewService.NewServPojo.ServPojo;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.CheckByState;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ni.ka;
import oi.g;
import org.json.JSONObject;
import pl.x;

public final class DlServiceListActivity extends g {
    public ka J;
    private String K;
    private String L;
    private String M = "";
    private String N = "";
    public DldetobjX O;
    public ld.f P;
    public ba.b Q;
    public LinearLayout R;
    private HashMap S = new HashMap();
    public String T;
    private String U = "0";
    public String V;
    public String W;
    public ArrayList X;
    public ArrayList Y;
    public Context Z;

    /* renamed from: a0  reason: collision with root package name */
    public ld.f f8105a0;

    /* renamed from: b0  reason: collision with root package name */
    public DlServiceInt f8106b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f8107c0;

    /* renamed from: d0  reason: collision with root package name */
    public ld.c f8108d0;

    /* renamed from: e0  reason: collision with root package name */
    public da.c f8109e0;

    /* renamed from: f0  reason: collision with root package name */
    public AadharInterface f8110f0;

    /* renamed from: g0  reason: collision with root package name */
    public ArrayList f8111g0;

    /* renamed from: h0  reason: collision with root package name */
    private String f8112h0 = "valid";

    /* renamed from: i0  reason: collision with root package name */
    public ArrayList f8113i0;

    /* renamed from: j0  reason: collision with root package name */
    public ArrayList f8114j0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlServiceListActivity f8115e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DlServiceListActivity dlServiceListActivity) {
            super(1);
            this.f8115e = dlServiceListActivity;
        }

        public final void b(String str) {
            this.f8115e.M1().E.c(false);
            this.f8115e.x2("Service is temporary unavailable Try After some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlServiceListActivity f8116e;

        b(DlServiceListActivity dlServiceListActivity) {
            this.f8116e = dlServiceListActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            cm.l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (i10 == 0) {
                this.f8116e.S2("0");
                return;
            }
            try {
                DlServiceListActivity dlServiceListActivity = this.f8116e;
                dlServiceListActivity.S2(((StateMaster) dlServiceListActivity.e2().get(i10)).getState_code());
                DlServiceListActivity dlServiceListActivity2 = this.f8116e;
                dlServiceListActivity2.U2(((StateMaster) dlServiceListActivity2.e2().get(i10)).getState_name());
                ba.b Q1 = this.f8116e.Q1();
                DlServiceListActivity dlServiceListActivity3 = this.f8116e;
                Q1.h(dlServiceListActivity3, dlServiceListActivity3.d2());
            } catch (Exception e10) {
                e10.getLocalizedMessage();
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlServiceListActivity f8117e;

        c(DlServiceListActivity dlServiceListActivity) {
            this.f8117e = dlServiceListActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            DlServiceListActivity dlServiceListActivity;
            String rto_code;
            cm.l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            cm.l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (i10 != 0 || !cm.l.a(q.B0(this.f8117e.d2()).toString(), "DL")) {
                if (i10 != 0 || cm.l.a(q.B0(this.f8117e.d2()).toString(), "DL")) {
                    DlServiceListActivity dlServiceListActivity2 = this.f8117e;
                    dlServiceListActivity2.P2(((RtosMaster) dlServiceListActivity2.X1().get(i10)).getRto_name());
                    dlServiceListActivity = this.f8117e;
                    rto_code = ((RtosMaster) dlServiceListActivity.X1().get(i10)).getRto_code();
                } else {
                    dlServiceListActivity = this.f8117e;
                    rto_code = "0";
                }
                dlServiceListActivity.O2(rto_code);
                return;
            }
            this.f8117e.O2("DL3");
            this.f8117e.P2("DY.DIR.ZONAL OFFICE,SOUTH DELHI,SHEIKH SARAI - 98");
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlServiceListActivity f8118e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DlServiceListActivity dlServiceListActivity) {
            super(1);
            this.f8118e = dlServiceListActivity;
        }

        public final void b(String str) {
            this.f8118e.M1().E.c(false);
            DlServiceListActivity dlServiceListActivity = this.f8118e;
            dlServiceListActivity.u2(dlServiceListActivity, dlServiceListActivity.P1(), this.f8118e.O1(), false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlServiceListActivity f8119e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DlServiceListActivity dlServiceListActivity) {
            super(1);
            this.f8119e = dlServiceListActivity;
        }

        public final void b(ServPojo servPojo) {
            this.f8119e.M1().E.c(false);
            try {
                if (servPojo.getResponseMsg().getStatusCode() == 200) {
                    if (!p.o(servPojo.getEkycRequired(), "N", true)) {
                        this.f8119e.F2(servPojo.getEkycImplStates());
                        if (this.f8119e.S1().size() > 0) {
                            int size = this.f8119e.S1().size();
                            for (int i10 = 0; i10 < size; i10++) {
                                this.f8119e.R1().add(String.valueOf(((EkycImplState) this.f8119e.S1().get(i10)).getEkycIsTrcd()));
                            }
                            if (this.f8119e.R1().contains("513") || this.f8119e.R1().contains("514") || this.f8119e.R1().contains("515") || this.f8119e.R1().contains("516") || this.f8119e.R1().contains("524") || this.f8119e.R1().contains("526") || this.f8119e.R1().contains("537") || this.f8119e.R1().contains("548")) {
                                DlServiceListActivity dlServiceListActivity = this.f8119e;
                                dlServiceListActivity.u2(dlServiceListActivity, dlServiceListActivity.P1(), this.f8119e.O1(), true);
                                return;
                            }
                        }
                    }
                    this.f8119e.z2();
                    return;
                }
                Toast.makeText(this.f8119e, servPojo.getResponseMsg().getDeveloperMessage(), 1).show();
            } catch (Exception unused) {
                this.f8119e.x2("Service is temporary unavailable Try After some time");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ServPojo) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8120a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f8120a = lVar;
        }

        public final pl.c a() {
            return this.f8120a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8120a.invoke(obj);
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
    public static final void g2(DlServiceListActivity dlServiceListActivity, View view) {
        cm.l.f(dlServiceListActivity, "this$0");
        Intent intent = new Intent(dlServiceListActivity, DashBoard.class);
        intent.setFlags(67108864);
        dlServiceListActivity.startActivity(intent);
        dlServiceListActivity.finish();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d5 A[Catch:{ Exception -> 0x0104 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h2(com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity r4, com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto r5) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r4, r0)
            java.lang.String r0 = r5.getStatus_code()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = "00"
            boolean r0 = cm.l.a(r0, r1)     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00fc
            java.util.List r5 = r5.getResult()     // Catch:{ Exception -> 0x0104 }
            if (r5 == 0) goto L_0x010e
            ni.ka r0 = r4.M1()     // Catch:{ Exception -> 0x0104 }
            android.widget.TextView r0 = r0.f27154w     // Catch:{ Exception -> 0x0104 }
            r1 = 0
            java.lang.Object r2 = r5.get(r1)     // Catch:{ Exception -> 0x0104 }
            com.nic.mparivahan.DLServicesAuth.Model.RTO.Result r2 = (com.nic.mparivahan.DLServicesAuth.Model.RTO.Result) r2     // Catch:{ Exception -> 0x0104 }
            java.lang.String r2 = r2.getLastEndState()     // Catch:{ Exception -> 0x0104 }
            r0.setText(r2)     // Catch:{ Exception -> 0x0104 }
            ni.ka r0 = r4.M1()     // Catch:{ Exception -> 0x0104 }
            android.widget.TextView r0 = r0.f27153v     // Catch:{ Exception -> 0x0104 }
            java.lang.Object r2 = r5.get(r1)     // Catch:{ Exception -> 0x0104 }
            com.nic.mparivahan.DLServicesAuth.Model.RTO.Result r2 = (com.nic.mparivahan.DLServicesAuth.Model.RTO.Result) r2     // Catch:{ Exception -> 0x0104 }
            java.lang.String r2 = r2.getLastEndRTO()     // Catch:{ Exception -> 0x0104 }
            r0.setText(r2)     // Catch:{ Exception -> 0x0104 }
            java.lang.Object r0 = r5.get(r1)     // Catch:{ Exception -> 0x0104 }
            com.nic.mparivahan.DLServicesAuth.Model.RTO.Result r0 = (com.nic.mparivahan.DLServicesAuth.Model.RTO.Result) r0     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.getRtoCode()     // Catch:{ Exception -> 0x0104 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0104 }
            r4.M = r0     // Catch:{ Exception -> 0x0104 }
            java.lang.Object r0 = r5.get(r1)     // Catch:{ Exception -> 0x0104 }
            com.nic.mparivahan.DLServicesAuth.Model.RTO.Result r0 = (com.nic.mparivahan.DLServicesAuth.Model.RTO.Result) r0     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.getStCode()     // Catch:{ Exception -> 0x0104 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0104 }
            r4.N = r0     // Catch:{ Exception -> 0x0104 }
            ld.f r0 = r4.c2()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r2 = "4"
            boolean r0 = cm.l.a(r0, r2)     // Catch:{ Exception -> 0x0104 }
            r2 = 8
            if (r0 != 0) goto L_0x00c0
            ld.f r0 = r4.c2()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r3 = "5"
            boolean r0 = cm.l.a(r0, r3)     // Catch:{ Exception -> 0x0104 }
            if (r0 != 0) goto L_0x00c0
            ld.f r0 = r4.c2()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r3 = "524"
            boolean r0 = cm.l.a(r0, r3)     // Catch:{ Exception -> 0x0104 }
            if (r0 != 0) goto L_0x00c0
            ld.f r0 = r4.c2()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r3 = "548"
            boolean r0 = cm.l.a(r0, r3)     // Catch:{ Exception -> 0x0104 }
            if (r0 != 0) goto L_0x00c0
            ld.f r0 = r4.c2()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r3 = "526"
            boolean r0 = cm.l.a(r0, r3)     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00af
            goto L_0x00c0
        L_0x00af:
            ni.ka r0 = r4.M1()     // Catch:{ Exception -> 0x0104 }
            android.widget.ProgressBar r0 = r0.f27151t     // Catch:{ Exception -> 0x0104 }
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x0104 }
            ba.b r0 = r4.Q1()     // Catch:{ Exception -> 0x0104 }
            r0.i(r4)     // Catch:{ Exception -> 0x0104 }
            goto L_0x00c9
        L_0x00c0:
            ni.ka r0 = r4.M1()     // Catch:{ Exception -> 0x0104 }
            android.widget.ProgressBar r0 = r0.f27151t     // Catch:{ Exception -> 0x0104 }
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x0104 }
        L_0x00c9:
            java.lang.Object r0 = r5.get(r1)     // Catch:{ Exception -> 0x0104 }
            com.nic.mparivahan.DLServicesAuth.Model.RTO.Result r0 = (com.nic.mparivahan.DLServicesAuth.Model.RTO.Result) r0     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.getLastEndRTO()     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00f2
            int r0 = r0.length()     // Catch:{ Exception -> 0x0104 }
            if (r0 != 0) goto L_0x00dc
            goto L_0x00f2
        L_0x00dc:
            ld.f r0 = r4.b2()     // Catch:{ Exception -> 0x0104 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0104 }
            com.nic.mparivahan.DLServicesAuth.Model.RTO.Result r5 = (com.nic.mparivahan.DLServicesAuth.Model.RTO.Result) r5     // Catch:{ Exception -> 0x0104 }
            java.lang.String r5 = r5.getLastEndRTO()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0104 }
            r0.s(r5)     // Catch:{ Exception -> 0x0104 }
            goto L_0x010e
        L_0x00f2:
            ld.f r5 = r4.b2()     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = "NA"
            r5.s(r0)     // Catch:{ Exception -> 0x0104 }
            goto L_0x010e
        L_0x00fc:
            java.lang.String r5 = r5.getStatus_desc()     // Catch:{ Exception -> 0x0104 }
            r4.x2(r5)     // Catch:{ Exception -> 0x0104 }
            goto L_0x010e
        L_0x0104:
            r5 = 2132019106(0x7f1407a2, float:1.9676538E38)
            java.lang.String r5 = r4.getString(r5)
            r4.x2(r5)
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity.h2(com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity, com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto):void");
    }

    /* access modifiers changed from: private */
    public static final void i2(DlServiceListActivity dlServiceListActivity, String str) {
        cm.l.f(dlServiceListActivity, "this$0");
        dlServiceListActivity.M1().f27151t.setVisibility(8);
        dlServiceListActivity.x2(dlServiceListActivity.T1().b("service_is_not_present", dlServiceListActivity.getString(R.string.unable_to_get_details)));
    }

    /* access modifiers changed from: private */
    public static final void j2(DlServiceListActivity dlServiceListActivity, View view) {
        cm.l.f(dlServiceListActivity, "this$0");
        dlServiceListActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void k2(DlServiceListActivity dlServiceListActivity, String str) {
        cm.l.f(dlServiceListActivity, "this$0");
        try {
            dlServiceListActivity.x2(new JSONObject(str.toString()).getString("Result"));
        } catch (Exception unused) {
            dlServiceListActivity.x2(dlServiceListActivity.getString(R.string.service_unavable_please_try));
        }
    }

    /* access modifiers changed from: private */
    public static final void l2(DlServiceListActivity dlServiceListActivity, String str) {
        cm.l.f(dlServiceListActivity, "this$0");
        dlServiceListActivity.x2(dlServiceListActivity.getString(R.string.service_unavable_please_try));
    }

    /* access modifiers changed from: private */
    public static final void m2(DlServiceListActivity dlServiceListActivity, View view) {
        cm.l.f(dlServiceListActivity, "this$0");
        dlServiceListActivity.M1().f27139h.performClick();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e0 A[Catch:{ Exception -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n2(com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity r7, android.view.View r8) {
        /*
            java.lang.String r8 = "950"
            java.lang.String r0 = "537"
            java.lang.String r1 = "0"
            java.lang.String r2 = "548"
            java.lang.String r3 = "526"
            java.lang.String r4 = "524"
            java.lang.String r5 = "this$0"
            cm.l.f(r7, r5)
            ld.f r5 = r7.c2()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = "4"
            boolean r5 = cm.l.a(r5, r6)     // Catch:{ Exception -> 0x0031 }
            if (r5 == 0) goto L_0x0034
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "525"
            java.lang.String r1 = "International Driving Permit"
            r8.put(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
        L_0x002c:
            r7.t2(r8)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0203
        L_0x0031:
            r7 = move-exception
            goto L_0x01fa
        L_0x0034:
            ld.f r5 = r7.c2()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r6 = "5"
            boolean r5 = cm.l.a(r5, r6)     // Catch:{ Exception -> 0x0031 }
            if (r5 == 0) goto L_0x0050
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "523"
            java.lang.String r1 = "DL Extract"
            r8.put(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            goto L_0x002c
        L_0x0050:
            ld.f r5 = r7.c2()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0031 }
            boolean r5 = cm.l.a(r5, r4)     // Catch:{ Exception -> 0x0031 }
            if (r5 == 0) goto L_0x0068
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "Endorsement to Drive in Hill Region"
            r8.put(r4, r0)     // Catch:{ Exception -> 0x0031 }
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            goto L_0x002c
        L_0x0068:
            ld.f r4 = r7.c2()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0031 }
            boolean r4 = cm.l.a(r4, r3)     // Catch:{ Exception -> 0x0031 }
            if (r4 == 0) goto L_0x0080
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "Change of Name in DL"
            r8.put(r3, r0)     // Catch:{ Exception -> 0x0031 }
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            goto L_0x002c
        L_0x0080:
            ld.f r3 = r7.c2()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x0031 }
            boolean r3 = cm.l.a(r3, r2)     // Catch:{ Exception -> 0x0031 }
            if (r3 == 0) goto L_0x0098
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "Change of Date of Birth in DL"
            r8.put(r2, r0)     // Catch:{ Exception -> 0x0031 }
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            goto L_0x002c
        L_0x0098:
            java.lang.String r2 = r7.d2()     // Catch:{ Exception -> 0x0031 }
            r3 = 1
            boolean r2 = km.p.o(r2, r1, r3)     // Catch:{ Exception -> 0x0031 }
            if (r2 == 0) goto L_0x00b9
            ld.c r8 = r7.T1()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "label_log_sel_state"
            r1 = 2132018803(0x7f140673, float:1.9675923E38)
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r8 = r8.b(r0, r1)     // Catch:{ Exception -> 0x0031 }
        L_0x00b4:
            r7.x2(r8)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0203
        L_0x00b9:
            java.lang.String r2 = r7.U     // Catch:{ Exception -> 0x0031 }
            boolean r1 = km.p.o(r2, r1, r3)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "DL"
            if (r1 == 0) goto L_0x00e7
            java.lang.String r1 = r7.d2()     // Catch:{ Exception -> 0x0031 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0031 }
            boolean r1 = cm.l.a(r1, r2)     // Catch:{ Exception -> 0x0031 }
            if (r1 != 0) goto L_0x00e7
            ld.c r8 = r7.T1()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "select_rto"
            r1 = 2132018801(0x7f140671, float:1.9675919E38)
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r8 = r8.b(r0, r1)     // Catch:{ Exception -> 0x0031 }
            goto L_0x00b4
        L_0x00e7:
            ld.f r1 = r7.c2()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = r1.b()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "1"
            boolean r1 = km.p.o(r1, r4, r3)     // Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x0101
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "514"
            java.lang.String r1 = "Renewal of DL"
        L_0x00fd:
            r8.put(r0, r1)     // Catch:{ Exception -> 0x0031 }
            goto L_0x016e
        L_0x0101:
            ld.f r1 = r7.c2()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = r1.b()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "2"
            boolean r1 = km.p.o(r1, r4, r3)     // Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x0118
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "513"
            java.lang.String r1 = "Issue of Duplicate DL"
            goto L_0x00fd
        L_0x0118:
            ld.f r1 = r7.c2()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = r1.b()     // Catch:{ Exception -> 0x0031 }
            boolean r1 = km.p.o(r1, r0, r3)     // Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x012b
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "RE-VALIDATION OF EXPIRED DL"
            goto L_0x00fd
        L_0x012b:
            ld.f r0 = r7.c2()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "3"
            boolean r0 = km.p.o(r0, r1, r3)     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x0142
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "515"
            java.lang.String r1 = "Change of Address in DL"
            goto L_0x00fd
        L_0x0142:
            ld.f r0 = r7.c2()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "6"
            boolean r0 = km.p.o(r0, r1, r3)     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x0159
            java.util.HashMap r8 = r7.S     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "516"
            java.lang.String r1 = "Replacement of DL"
            goto L_0x00fd
        L_0x0159:
            ld.f r0 = r7.c2()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0031 }
            boolean r0 = km.p.o(r0, r8, r3)     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x016e
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "Multi Service"
            r0.put(r8, r1)     // Catch:{ Exception -> 0x0031 }
        L_0x016e:
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x0031 }
            java.lang.Class<com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithMobile> r0 = com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithMobile.class
            r8.<init>(r7, r0)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = r7.K     // Catch:{ Exception -> 0x0031 }
            r8.putExtra(r2, r0)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "dob"
            java.lang.String r1 = r7.L     // Catch:{ Exception -> 0x0031 }
            r8.putExtra(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "DLDetails"
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r7.O1()     // Catch:{ Exception -> 0x0031 }
            r8.putExtra(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "whatServiceRequired"
            java.util.HashMap r1 = r7.S     // Catch:{ Exception -> 0x0031 }
            r8.putExtra(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "lastEndorsedRTOCode"
            java.lang.String r1 = r7.U     // Catch:{ Exception -> 0x0031 }
            r8.putExtra(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "lastEndorseStateCode"
            java.lang.String r1 = r7.d2()     // Catch:{ Exception -> 0x0031 }
            r8.putExtra(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "lastEndorsedState"
            java.lang.String r1 = r7.f2()     // Catch:{ Exception -> 0x0031 }
            r8.putExtra(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "lastEndorsedRTO"
            java.lang.String r1 = r7.a2()     // Catch:{ Exception -> 0x0031 }
            r8.putExtra(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "bioRecGenesis"
            java.lang.String r1 = r7.N1()     // Catch:{ Exception -> 0x0031 }
            r8.putExtra(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = r7.N     // Catch:{ Exception -> 0x0031 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = r7.d2()     // Catch:{ Exception -> 0x0031 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0031 }
            boolean r0 = km.p.o(r0, r1, r3)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "state_value"
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = "same"
        L_0x01dc:
            r8.putExtra(r1, r0)     // Catch:{ Exception -> 0x0031 }
            goto L_0x01e3
        L_0x01e0:
            java.lang.String r0 = "differ"
            goto L_0x01dc
        L_0x01e3:
            java.lang.String r0 = "multiList"
            java.util.ArrayList r1 = r7.Y1()     // Catch:{ Exception -> 0x0031 }
            r8.putExtra(r0, r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r0 = "multiCheck"
            java.lang.String r1 = r7.f8112h0     // Catch:{ Exception -> 0x0031 }
            r8.putExtra(r0, r1)     // Catch:{ Exception -> 0x0031 }
            r7.startActivity(r8)     // Catch:{ Exception -> 0x0031 }
            r7.finish()     // Catch:{ Exception -> 0x0031 }
            goto L_0x0203
        L_0x01fa:
            java.lang.String r8 = "valueListActivity"
            java.lang.String r7 = r7.getLocalizedMessage()
            android.util.Log.d(r8, r7)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity.n2(com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void o2(DlServiceListActivity dlServiceListActivity, CheckByState checkByState) {
        cm.l.f(dlServiceListActivity, "this$0");
        dlServiceListActivity.M1().E.c(false);
        try {
            if (p.o(checkByState.getEkycRequired(), "N", true)) {
                dlServiceListActivity.z2();
            } else {
                dlServiceListActivity.u2(dlServiceListActivity, dlServiceListActivity.K, dlServiceListActivity.O1(), true);
            }
        } catch (Exception unused) {
            dlServiceListActivity.z2();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008d, code lost:
        r6.f27140i.setSelection(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p2(com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity r5, com.nic.mparivahan.dlservices.sarathiStateApi.SarathiStatePojo r6) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r5, r0)
            r0 = 1
            java.lang.String r1 = r6.getStatus_code()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r2 = "00"
            boolean r1 = km.p.o(r1, r2, r0)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r2 = "0"
            java.lang.String r3 = "Select State"
            r4 = 0
            if (r1 == 0) goto L_0x00d2
            java.util.List r6 = r6.getStateMaster()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r1 = "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster> }"
            cm.l.d(r6, r1)     // Catch:{ Exception -> 0x00f9 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ Exception -> 0x00f9 }
            r5.T2(r6)     // Catch:{ Exception -> 0x00f9 }
            java.util.ArrayList r6 = r5.e2()     // Catch:{ Exception -> 0x00f9 }
            com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster r1 = new com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster     // Catch:{ Exception -> 0x00f9 }
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x00f9 }
            r6.add(r4, r1)     // Catch:{ Exception -> 0x00f9 }
            aa.b r6 = new aa.b     // Catch:{ Exception -> 0x00f9 }
            java.util.ArrayList r1 = r5.e2()     // Catch:{ Exception -> 0x00f9 }
            r6.<init>(r5, r1)     // Catch:{ Exception -> 0x00f9 }
            ni.ka r1 = r5.M1()     // Catch:{ Exception -> 0x00f9 }
            android.widget.Spinner r1 = r1.f27140i     // Catch:{ Exception -> 0x00f9 }
            r1.setAdapter(r6)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r6 = "getStateCode"
            ld.f r1 = r5.b2()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r1 = r1.l()     // Catch:{ Exception -> 0x00f9 }
            android.util.Log.d(r6, r1)     // Catch:{ Exception -> 0x00f9 }
            java.util.ArrayList r6 = r5.e2()     // Catch:{ Exception -> 0x00f9 }
            int r6 = r6.size()     // Catch:{ Exception -> 0x00f9 }
            r1 = r4
        L_0x0059:
            if (r1 >= r6) goto L_0x00bf
            ld.f r2 = r5.b2()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r2 = r2.l()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r3 = "OR"
            boolean r2 = km.p.o(r2, r3, r0)     // Catch:{ Exception -> 0x00f9 }
            if (r2 == 0) goto L_0x0093
            java.util.ArrayList r2 = r5.e2()     // Catch:{ Exception -> 0x00f9 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x00f9 }
            com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster r2 = (com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster) r2     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r2 = r2.getState_code()     // Catch:{ Exception -> 0x00f9 }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r3 = "OD"
            boolean r2 = km.p.o(r2, r3, r0)     // Catch:{ Exception -> 0x00f9 }
            if (r2 == 0) goto L_0x0093
            ni.ka r6 = r5.M1()     // Catch:{ Exception -> 0x00f9 }
        L_0x008d:
            android.widget.Spinner r6 = r6.f27140i     // Catch:{ Exception -> 0x00f9 }
            r6.setSelection(r1)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x00bf
        L_0x0093:
            ld.f r2 = r5.b2()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r2 = r2.l()     // Catch:{ Exception -> 0x00f9 }
            java.util.ArrayList r3 = r5.e2()     // Catch:{ Exception -> 0x00f9 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ Exception -> 0x00f9 }
            com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster r3 = (com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster) r3     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r3 = r3.getState_code()     // Catch:{ Exception -> 0x00f9 }
            java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00f9 }
            boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x00f9 }
            if (r2 == 0) goto L_0x00bc
            ni.ka r6 = r5.M1()     // Catch:{ Exception -> 0x00f9 }
            goto L_0x008d
        L_0x00bc:
            int r1 = r1 + 1
            goto L_0x0059
        L_0x00bf:
            ni.ka r6 = r5.M1()     // Catch:{ Exception -> 0x00f9 }
            android.widget.Spinner r6 = r6.f27140i     // Catch:{ Exception -> 0x00f9 }
            r6.setEnabled(r4)     // Catch:{ Exception -> 0x00f9 }
            ni.ka r6 = r5.M1()     // Catch:{ Exception -> 0x00f9 }
            android.widget.Spinner r6 = r6.f27140i     // Catch:{ Exception -> 0x00f9 }
            r6.setClickable(r4)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0115
        L_0x00d2:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x00f9 }
            r6.<init>()     // Catch:{ Exception -> 0x00f9 }
            r5.T2(r6)     // Catch:{ Exception -> 0x00f9 }
            java.util.ArrayList r6 = r5.e2()     // Catch:{ Exception -> 0x00f9 }
            com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster r1 = new com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster     // Catch:{ Exception -> 0x00f9 }
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x00f9 }
            r6.add(r4, r1)     // Catch:{ Exception -> 0x00f9 }
            aa.b r6 = new aa.b     // Catch:{ Exception -> 0x00f9 }
            java.util.ArrayList r1 = r5.e2()     // Catch:{ Exception -> 0x00f9 }
            r6.<init>(r5, r1)     // Catch:{ Exception -> 0x00f9 }
            ni.ka r1 = r5.M1()     // Catch:{ Exception -> 0x00f9 }
            android.widget.Spinner r1 = r1.f27140i     // Catch:{ Exception -> 0x00f9 }
            r1.setAdapter(r6)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x0115
        L_0x00f9:
            android.content.Context r6 = r5.getApplicationContext()
            ld.c r1 = r5.T1()
            r2 = 2132019337(0x7f140889, float:1.9677006E38)
            java.lang.String r5 = r5.getString(r2)
            java.lang.String r2 = "service_is_not_present"
            java.lang.String r5 = r1.b(r2, r5)
            android.widget.Toast r5 = android.widget.Toast.makeText(r6, r5, r0)
            r5.show()
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity.p2(com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity, com.nic.mparivahan.dlservices.sarathiStateApi.SarathiStatePojo):void");
    }

    /* access modifiers changed from: private */
    public static final void q2(DlServiceListActivity dlServiceListActivity, String str) {
        cm.l.f(dlServiceListActivity, "this$0");
        dlServiceListActivity.M1().f27151t.setVisibility(8);
        Toast.makeText(dlServiceListActivity.getApplicationContext(), dlServiceListActivity.T1().b("service_is_not_present", dlServiceListActivity.getString(R.string.unable_to_get_details)), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void r2(DlServiceListActivity dlServiceListActivity, CurrentRTO currentRTO) {
        cm.l.f(dlServiceListActivity, "this$0");
        dlServiceListActivity.M1().f27151t.setVisibility(8);
        try {
            if (!p.o(currentRTO.getStatus_code(), "00", true)) {
                List<RtosMaster> rtosMaster = currentRTO.getRtosMaster();
                cm.l.d(rtosMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                dlServiceListActivity.L2((ArrayList) rtosMaster);
                ArrayList X1 = dlServiceListActivity.X1();
                String b10 = dlServiceListActivity.T1().b("select_rto", dlServiceListActivity.getString(R.string.please_select_rto));
                cm.l.c(b10);
                X1.add(0, new RtosMaster(b10, "0"));
                dlServiceListActivity.M1().f27139h.setAdapter(new aa.a(dlServiceListActivity, dlServiceListActivity.X1()));
            } else if (cm.l.a(dlServiceListActivity.d2(), "DL")) {
                List<RtosMaster> rtosMaster2 = currentRTO.getRtosMaster();
                cm.l.d(rtosMaster2, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                dlServiceListActivity.L2((ArrayList) rtosMaster2);
                dlServiceListActivity.X1().add(0, new RtosMaster("DY.DIR.ZONAL OFFICE,SOUTH DELHI,SHEIKH SARAI - 98", "DL3"));
                dlServiceListActivity.M1().f27139h.setAdapter(new aa.a(dlServiceListActivity, dlServiceListActivity.X1()));
                dlServiceListActivity.M1().f27139h.setEnabled(false);
                dlServiceListActivity.M1().f27139h.setClickable(false);
                dlServiceListActivity.M1().f27147p.setClickable(false);
            } else {
                dlServiceListActivity.M1().f27147p.setClickable(true);
                List<RtosMaster> rtosMaster3 = currentRTO.getRtosMaster();
                cm.l.d(rtosMaster3, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                dlServiceListActivity.L2((ArrayList) rtosMaster3);
                ArrayList X12 = dlServiceListActivity.X1();
                String b11 = dlServiceListActivity.T1().b("select_rto", dlServiceListActivity.getString(R.string.please_select_rto));
                cm.l.c(b11);
                X12.add(0, new RtosMaster(b11, "0"));
                dlServiceListActivity.M1().f27139h.setAdapter(new aa.a(dlServiceListActivity, dlServiceListActivity.X1()));
                dlServiceListActivity.M1().f27139h.setEnabled(true);
                dlServiceListActivity.M1().f27139h.setClickable(true);
            }
        } catch (Exception unused) {
            dlServiceListActivity.M1().f27151t.setVisibility(8);
            dlServiceListActivity.x2(dlServiceListActivity.T1().b("service_is_not_present", dlServiceListActivity.getString(R.string.unable_to_get_details)));
        }
    }

    private final void s2(HashMap hashMap) {
        Intent intent = new Intent(this, SarthiProcessWithAdhar.class);
        intent.putExtra("DL", this.K);
        intent.putExtra("dob", this.L);
        intent.putExtra("DLDetails", O1());
        intent.putExtra("whatServiceRequired", hashMap);
        intent.putExtra("lastEndorsedRTOCode", p.o(q.B0(this.N).toString(), "DL", true) ? "DL3" : this.M);
        intent.putExtra("lastEndorseStateCode", this.N);
        intent.putExtra("lastEndorsedState", M1().f27154w.getText().toString());
        intent.putExtra("lastEndorsedRTO", M1().f27153v.getText().toString());
        intent.putExtra("state_value", "same");
        intent.putExtra("bioRecGenesis", N1());
        intent.putExtra("multiList", cm.l.a(c2().b(), VContant.MULTISERVICE_PURPOSE_CODE) ? R1() : Y1());
        intent.putExtra("multiCheck", this.f8112h0);
        startActivity(intent);
        finish();
    }

    private final void t2(HashMap hashMap) {
        Intent intent = new Intent(this, SarthiProcessWithMobile.class);
        intent.putExtra("DL", this.K);
        intent.putExtra("dob", this.L);
        intent.putExtra("DLDetails", O1());
        intent.putExtra("whatServiceRequired", hashMap);
        intent.putExtra("lastEndorsedRTOCode", p.o(q.B0(this.N).toString(), "DL", true) ? "DL3" : this.M);
        intent.putExtra("lastEndorseStateCode", this.N);
        intent.putExtra("lastEndorsedState", M1().f27154w.getText().toString());
        intent.putExtra("lastEndorsedRTO", M1().f27153v.getText().toString());
        intent.putExtra("state_value", "same");
        intent.putExtra("bioRecGenesis", N1());
        intent.putExtra("multiList", Y1());
        intent.putExtra("multiCheck", this.f8112h0);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e8 A[Catch:{ Exception -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01fb A[SYNTHETIC, Splitter:B:62:0x01fb] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0203 A[Catch:{ Exception -> 0x0037 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v2(android.app.Dialog r5, com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity r6, android.view.View r7) {
        /*
            java.lang.String r7 = "537"
            java.lang.String r0 = "0"
            java.lang.String r1 = "548"
            java.lang.String r2 = "526"
            java.lang.String r3 = "524"
            java.lang.String r4 = "$d"
            cm.l.f(r5, r4)
            java.lang.String r4 = "this$0"
            cm.l.f(r6, r4)
            r5.dismiss()
            ld.f r5 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r4 = "4"
            boolean r5 = cm.l.a(r5, r4)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x003a
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "525"
            java.lang.String r0 = "International Driving Permit"
            r5.put(r7, r0)     // Catch:{ Exception -> 0x0037 }
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
        L_0x0032:
            r6.s2(r5)     // Catch:{ Exception -> 0x0037 }
            goto L_0x021f
        L_0x0037:
            r5 = move-exception
            goto L_0x0216
        L_0x003a:
            ld.f r5 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r4 = "5"
            boolean r5 = cm.l.a(r5, r4)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x0056
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "523"
            java.lang.String r0 = "DL Extract"
            r5.put(r7, r0)     // Catch:{ Exception -> 0x0037 }
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            goto L_0x0032
        L_0x0056:
            ld.f r5 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0037 }
            boolean r5 = cm.l.a(r5, r3)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x006e
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "Endorsement to Drive in Hill Region"
            r5.put(r3, r7)     // Catch:{ Exception -> 0x0037 }
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            goto L_0x0032
        L_0x006e:
            ld.f r5 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0037 }
            boolean r5 = cm.l.a(r5, r2)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x0086
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "Change of Name in DL"
            r5.put(r2, r7)     // Catch:{ Exception -> 0x0037 }
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            goto L_0x0032
        L_0x0086:
            ld.f r5 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0037 }
            boolean r5 = cm.l.a(r5, r1)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x009e
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "Change of Date of Birth in DL"
            r5.put(r1, r7)     // Catch:{ Exception -> 0x0037 }
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            goto L_0x0032
        L_0x009e:
            java.lang.String r5 = r6.d2()     // Catch:{ Exception -> 0x0037 }
            r1 = 1
            boolean r5 = km.p.o(r5, r0, r1)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x00bf
            ld.c r5 = r6.T1()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "label_log_sel_state"
            r0 = 2132018803(0x7f140673, float:1.9675923E38)
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b(r7, r0)     // Catch:{ Exception -> 0x0037 }
        L_0x00ba:
            r6.x2(r5)     // Catch:{ Exception -> 0x0037 }
            goto L_0x021f
        L_0x00bf:
            java.lang.String r5 = r6.U     // Catch:{ Exception -> 0x0037 }
            boolean r5 = km.p.o(r5, r0, r1)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r0 = "DL"
            if (r5 == 0) goto L_0x00ed
            java.lang.String r5 = r6.d2()     // Catch:{ Exception -> 0x0037 }
            java.lang.CharSequence r5 = km.q.B0(r5)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0037 }
            boolean r5 = cm.l.a(r5, r0)     // Catch:{ Exception -> 0x0037 }
            if (r5 != 0) goto L_0x00ed
            ld.c r5 = r6.T1()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "select_rto"
            r0 = 2132018801(0x7f140671, float:1.9675919E38)
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b(r7, r0)     // Catch:{ Exception -> 0x0037 }
            goto L_0x00ba
        L_0x00ed:
            ld.f r5 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = "1"
            boolean r5 = km.p.o(r5, r2, r1)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = "950"
            if (r5 == 0) goto L_0x0109
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "514"
            java.lang.String r3 = "Renewal of DL"
        L_0x0105:
            r5.put(r7, r3)     // Catch:{ Exception -> 0x0037 }
            goto L_0x0176
        L_0x0109:
            ld.f r5 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r3 = "2"
            boolean r5 = km.p.o(r5, r3, r1)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x0120
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "513"
            java.lang.String r3 = "Issue of Duplicate DL"
            goto L_0x0105
        L_0x0120:
            ld.f r5 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0037 }
            boolean r5 = km.p.o(r5, r7, r1)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x0133
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            java.lang.String r3 = "RE-VALIDATION OF EXPIRED DL"
            goto L_0x0105
        L_0x0133:
            ld.f r5 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "3"
            boolean r5 = km.p.o(r5, r7, r1)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x014a
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "515"
            java.lang.String r3 = "Change of Address in DL"
            goto L_0x0105
        L_0x014a:
            ld.f r5 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "6"
            boolean r5 = km.p.o(r5, r7, r1)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x0161
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "516"
            java.lang.String r3 = "Replacement of DL"
            goto L_0x0105
        L_0x0161:
            ld.f r5 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0037 }
            boolean r5 = km.p.o(r5, r2, r1)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x0176
            java.util.HashMap r5 = r6.S     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "Multi Service"
            r5.put(r2, r7)     // Catch:{ Exception -> 0x0037 }
        L_0x0176:
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x0037 }
            java.lang.Class<com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar> r7 = com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar.class
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = r6.K     // Catch:{ Exception -> 0x0037 }
            r5.putExtra(r0, r7)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "dob"
            java.lang.String r0 = r6.L     // Catch:{ Exception -> 0x0037 }
            r5.putExtra(r7, r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "DLDetails"
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r6.O1()     // Catch:{ Exception -> 0x0037 }
            r5.putExtra(r7, r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "whatServiceRequired"
            java.util.HashMap r0 = r6.S     // Catch:{ Exception -> 0x0037 }
            r5.putExtra(r7, r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "lastEndorsedRTOCode"
            java.lang.String r0 = r6.U     // Catch:{ Exception -> 0x0037 }
            r5.putExtra(r7, r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "lastEndorseStateCode"
            java.lang.String r0 = r6.d2()     // Catch:{ Exception -> 0x0037 }
            r5.putExtra(r7, r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "lastEndorsedState"
            java.lang.String r0 = r6.f2()     // Catch:{ Exception -> 0x0037 }
            r5.putExtra(r7, r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "lastEndorsedRTO"
            java.lang.String r0 = r6.a2()     // Catch:{ Exception -> 0x0037 }
            r5.putExtra(r7, r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = "bioRecGenesis"
            java.lang.String r0 = r6.N1()     // Catch:{ Exception -> 0x0037 }
            r5.putExtra(r7, r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = r6.N     // Catch:{ Exception -> 0x0037 }
            java.lang.CharSequence r7 = km.q.B0(r7)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r0 = r6.d2()     // Catch:{ Exception -> 0x0037 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0037 }
            boolean r7 = km.p.o(r7, r0, r1)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r0 = "state_value"
            if (r7 == 0) goto L_0x01e8
            java.lang.String r7 = "same"
        L_0x01e4:
            r5.putExtra(r0, r7)     // Catch:{ Exception -> 0x0037 }
            goto L_0x01eb
        L_0x01e8:
            java.lang.String r7 = "differ"
            goto L_0x01e4
        L_0x01eb:
            ld.f r7 = r6.c2()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r7 = r7.b()     // Catch:{ Exception -> 0x0037 }
            boolean r7 = cm.l.a(r7, r2)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r0 = "multiList"
            if (r7 == 0) goto L_0x0203
            java.util.ArrayList r7 = r6.R1()     // Catch:{ Exception -> 0x0037 }
        L_0x01ff:
            r5.putExtra(r0, r7)     // Catch:{ Exception -> 0x0037 }
            goto L_0x0208
        L_0x0203:
            java.util.ArrayList r7 = r6.Y1()     // Catch:{ Exception -> 0x0037 }
            goto L_0x01ff
        L_0x0208:
            java.lang.String r7 = "multiCheck"
            java.lang.String r0 = r6.f8112h0     // Catch:{ Exception -> 0x0037 }
            r5.putExtra(r7, r0)     // Catch:{ Exception -> 0x0037 }
            r6.startActivity(r5)     // Catch:{ Exception -> 0x0037 }
            r6.finish()     // Catch:{ Exception -> 0x0037 }
            goto L_0x021f
        L_0x0216:
            java.lang.String r6 = "valueListActivity"
            java.lang.String r5 = r5.getLocalizedMessage()
            android.util.Log.d(r6, r5)
        L_0x021f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity.v2(android.app.Dialog, com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void w2(Dialog dialog, DlServiceListActivity dlServiceListActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dlServiceListActivity, "this$0");
        dialog.dismiss();
        dlServiceListActivity.z2();
    }

    /* access modifiers changed from: private */
    public final void x2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(T1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(T1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(T1().b("btn_ok", "OK"));
        textView.setOnClickListener(new v(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void y2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c7 A[Catch:{ Exception -> 0x002a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z2() {
        /*
            r7 = this;
            java.lang.String r0 = "537"
            java.lang.String r1 = "0"
            java.lang.String r2 = "548"
            java.lang.String r3 = "526"
            java.lang.String r4 = "524"
            ld.f r5 = r7.c2()     // Catch:{ Exception -> 0x002a }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x002a }
            java.lang.String r6 = "4"
            boolean r5 = cm.l.a(r5, r6)     // Catch:{ Exception -> 0x002a }
            if (r5 == 0) goto L_0x002d
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "525"
            java.lang.String r2 = "International Driving Permit"
            r0.put(r1, r2)     // Catch:{ Exception -> 0x002a }
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
        L_0x0025:
            r7.t2(r0)     // Catch:{ Exception -> 0x002a }
            goto L_0x01ea
        L_0x002a:
            r0 = move-exception
            goto L_0x01e1
        L_0x002d:
            ld.f r5 = r7.c2()     // Catch:{ Exception -> 0x002a }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x002a }
            java.lang.String r6 = "5"
            boolean r5 = cm.l.a(r5, r6)     // Catch:{ Exception -> 0x002a }
            if (r5 == 0) goto L_0x0049
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "523"
            java.lang.String r2 = "DL Extract"
            r0.put(r1, r2)     // Catch:{ Exception -> 0x002a }
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            goto L_0x0025
        L_0x0049:
            ld.f r5 = r7.c2()     // Catch:{ Exception -> 0x002a }
            java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x002a }
            boolean r5 = cm.l.a(r5, r4)     // Catch:{ Exception -> 0x002a }
            if (r5 == 0) goto L_0x0061
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "Endorsement to Drive in Hill Region"
            r0.put(r4, r1)     // Catch:{ Exception -> 0x002a }
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            goto L_0x0025
        L_0x0061:
            ld.f r4 = r7.c2()     // Catch:{ Exception -> 0x002a }
            java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x002a }
            boolean r4 = cm.l.a(r4, r3)     // Catch:{ Exception -> 0x002a }
            if (r4 == 0) goto L_0x0079
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "Change of Name in DL"
            r0.put(r3, r1)     // Catch:{ Exception -> 0x002a }
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            goto L_0x0025
        L_0x0079:
            ld.f r3 = r7.c2()     // Catch:{ Exception -> 0x002a }
            java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x002a }
            boolean r3 = cm.l.a(r3, r2)     // Catch:{ Exception -> 0x002a }
            if (r3 == 0) goto L_0x0091
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "Change of Date of Birth in DL"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x002a }
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            goto L_0x0025
        L_0x0091:
            java.lang.String r2 = r7.d2()     // Catch:{ Exception -> 0x002a }
            r3 = 1
            boolean r2 = km.p.o(r2, r1, r3)     // Catch:{ Exception -> 0x002a }
            if (r2 == 0) goto L_0x00b2
            ld.c r0 = r7.T1()     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "label_log_sel_state"
            r2 = 2132018803(0x7f140673, float:1.9675923E38)
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r0.b(r1, r2)     // Catch:{ Exception -> 0x002a }
        L_0x00ad:
            r7.x2(r0)     // Catch:{ Exception -> 0x002a }
            goto L_0x01ea
        L_0x00b2:
            java.lang.String r2 = r7.U     // Catch:{ Exception -> 0x002a }
            boolean r1 = km.p.o(r2, r1, r3)     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = "DL"
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = r7.d2()     // Catch:{ Exception -> 0x002a }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x002a }
            boolean r1 = cm.l.a(r1, r2)     // Catch:{ Exception -> 0x002a }
            if (r1 != 0) goto L_0x00e0
            ld.c r0 = r7.T1()     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "select_rto"
            r2 = 2132018801(0x7f140671, float:1.9675919E38)
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r0.b(r1, r2)     // Catch:{ Exception -> 0x002a }
            goto L_0x00ad
        L_0x00e0:
            ld.f r1 = r7.c2()     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = r1.b()     // Catch:{ Exception -> 0x002a }
            java.lang.String r4 = "1"
            boolean r1 = km.p.o(r1, r4, r3)     // Catch:{ Exception -> 0x002a }
            if (r1 == 0) goto L_0x00fa
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "514"
            java.lang.String r4 = "Renewal of DL"
        L_0x00f6:
            r0.put(r1, r4)     // Catch:{ Exception -> 0x002a }
            goto L_0x0155
        L_0x00fa:
            ld.f r1 = r7.c2()     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = r1.b()     // Catch:{ Exception -> 0x002a }
            java.lang.String r4 = "2"
            boolean r1 = km.p.o(r1, r4, r3)     // Catch:{ Exception -> 0x002a }
            if (r1 == 0) goto L_0x0111
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "513"
            java.lang.String r4 = "Issue of Duplicate DL"
            goto L_0x00f6
        L_0x0111:
            ld.f r1 = r7.c2()     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = r1.b()     // Catch:{ Exception -> 0x002a }
            boolean r1 = km.p.o(r1, r0, r3)     // Catch:{ Exception -> 0x002a }
            if (r1 == 0) goto L_0x0127
            java.util.HashMap r1 = r7.S     // Catch:{ Exception -> 0x002a }
            java.lang.String r4 = "RE-VALIDATION OF EXPIRED DL"
            r1.put(r0, r4)     // Catch:{ Exception -> 0x002a }
            goto L_0x0155
        L_0x0127:
            ld.f r0 = r7.c2()     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "3"
            boolean r0 = km.p.o(r0, r1, r3)     // Catch:{ Exception -> 0x002a }
            if (r0 == 0) goto L_0x013e
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "515"
            java.lang.String r4 = "Change of Address in DL"
            goto L_0x00f6
        L_0x013e:
            ld.f r0 = r7.c2()     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "6"
            boolean r0 = km.p.o(r0, r1, r3)     // Catch:{ Exception -> 0x002a }
            if (r0 == 0) goto L_0x0155
            java.util.HashMap r0 = r7.S     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "516"
            java.lang.String r4 = "Replacement of DL"
            goto L_0x00f6
        L_0x0155:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x002a }
            java.lang.Class<com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithMobile> r1 = com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithMobile.class
            r0.<init>(r7, r1)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = r7.K     // Catch:{ Exception -> 0x002a }
            r0.putExtra(r2, r1)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "dob"
            java.lang.String r2 = r7.L     // Catch:{ Exception -> 0x002a }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "DLDetails"
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r7.O1()     // Catch:{ Exception -> 0x002a }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "whatServiceRequired"
            java.util.HashMap r2 = r7.S     // Catch:{ Exception -> 0x002a }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "lastEndorsedRTOCode"
            java.lang.String r2 = r7.U     // Catch:{ Exception -> 0x002a }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "lastEndorseStateCode"
            java.lang.String r2 = r7.d2()     // Catch:{ Exception -> 0x002a }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "lastEndorsedState"
            java.lang.String r2 = r7.f2()     // Catch:{ Exception -> 0x002a }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "lastEndorsedRTO"
            java.lang.String r2 = r7.a2()     // Catch:{ Exception -> 0x002a }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "bioRecGenesis"
            java.lang.String r2 = r7.N1()     // Catch:{ Exception -> 0x002a }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = r7.N     // Catch:{ Exception -> 0x002a }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = r7.d2()     // Catch:{ Exception -> 0x002a }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x002a }
            boolean r1 = km.p.o(r1, r2, r3)     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = "state_value"
            if (r1 == 0) goto L_0x01c7
            java.lang.String r1 = "same"
        L_0x01c3:
            r0.putExtra(r2, r1)     // Catch:{ Exception -> 0x002a }
            goto L_0x01ca
        L_0x01c7:
            java.lang.String r1 = "differ"
            goto L_0x01c3
        L_0x01ca:
            java.lang.String r1 = "multiList"
            java.util.ArrayList r2 = r7.Y1()     // Catch:{ Exception -> 0x002a }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r1 = "multiCheck"
            java.lang.String r2 = r7.f8112h0     // Catch:{ Exception -> 0x002a }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x002a }
            r7.startActivity(r0)     // Catch:{ Exception -> 0x002a }
            r7.finish()     // Catch:{ Exception -> 0x002a }
            goto L_0x01ea
        L_0x01e1:
            java.lang.String r1 = "valueListActivity"
            java.lang.String r0 = r0.getLocalizedMessage()
            android.util.Log.d(r1, r0)
        L_0x01ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity.z2():void");
    }

    public final void A2(ka kaVar) {
        cm.l.f(kaVar, "<set-?>");
        this.J = kaVar;
    }

    public final void B2(String str) {
        cm.l.f(str, "<set-?>");
        this.f8107c0 = str;
    }

    public final void C2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.O = dldetobjX;
    }

    public final void D2(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.Q = bVar;
    }

    public final void E2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f8114j0 = arrayList;
    }

    public final void F2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f8113i0 = arrayList;
    }

    public final void G2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8108d0 = cVar;
    }

    public final void H2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.R = linearLayout;
    }

    public final void I2(AadharInterface aadharInterface) {
        cm.l.f(aadharInterface, "<set-?>");
        this.f8110f0 = aadharInterface;
    }

    public final void J2(da.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8109e0 = cVar;
    }

    public final void K2(Context context) {
        cm.l.f(context, "<set-?>");
        this.Z = context;
    }

    public final void L2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.Y = arrayList;
    }

    public final ka M1() {
        ka kaVar = this.J;
        if (kaVar != null) {
            return kaVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final void M2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f8111g0 = arrayList;
    }

    public final String N1() {
        String str = this.f8107c0;
        if (str != null) {
            return str;
        }
        cm.l.v("bioRecGenesis");
        return null;
    }

    public final void N2(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.f8106b0 = dlServiceInt;
    }

    public final DldetobjX O1() {
        DldetobjX dldetobjX = this.O;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final void O2(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final String P1() {
        return this.K;
    }

    public final void P2(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final ba.b Q1() {
        ba.b bVar = this.Q;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final void Q2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f8105a0 = fVar;
    }

    public final ArrayList R1() {
        ArrayList arrayList = this.f8114j0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("eService");
        return null;
    }

    public final void R2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.P = fVar;
    }

    public final ArrayList S1() {
        ArrayList arrayList = this.f8113i0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("enabledService");
        return null;
    }

    public final void S2(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final ld.c T1() {
        ld.c cVar = this.f8108d0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final void T2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.X = arrayList;
    }

    public final LinearLayout U1() {
        LinearLayout linearLayout = this.R;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("ll_home");
        return null;
    }

    public final void U2(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final AadharInterface V1() {
        AadharInterface aadharInterface = this.f8110f0;
        if (aadharInterface != null) {
            return aadharInterface;
        }
        cm.l.v("mAadharInterface");
        return null;
    }

    public final da.c W1() {
        da.c cVar = this.f8109e0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mAadharViewModel");
        return null;
    }

    public final ArrayList X1() {
        ArrayList arrayList = this.Y;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("mRtosMaster");
        return null;
    }

    public final ArrayList Y1() {
        ArrayList arrayList = this.f8111g0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiList");
        return null;
    }

    public final DlServiceInt Z1() {
        DlServiceInt dlServiceInt = this.f8106b0;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final String a2() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("rto_name");
        return null;
    }

    public final ld.f b2() {
        ld.f fVar = this.f8105a0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sahi_session");
        return null;
    }

    public final ld.f c2() {
        ld.f fVar = this.P;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final String d2() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("state_code");
        return null;
    }

    public final ArrayList e2() {
        ArrayList arrayList = this.X;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("state_list");
        return null;
    }

    public final String f2() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("state_name");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ka c10 = ka.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        A2(c10);
        K2(this);
        Q2(new ld.f(this));
        G2(new ld.c(this));
        I2(AadharInterface.f8349a.a(this));
        J2((da.c) new u0((x0) this, (u0.b) new da.a(new da.b(V1()))).a(da.c.class));
        v9.e.f17509a.u0(this, M1());
        N2(DlServiceInt.f21675a.a(this));
        setContentView((View) M1().b());
        R2(new ld.f(this));
        if (cm.l.a(c2().b(), VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE) || cm.l.a(c2().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE) || cm.l.a(c2().b(), "524") || cm.l.a(c2().b(), "548") || cm.l.a(c2().b(), "526")) {
            M1().B.setVisibility(8);
            M1().f27150s.setVisibility(8);
            M1().C.setVisibility(8);
            M1().f27149r.setVisibility(8);
        } else {
            M1().B.setVisibility(0);
            M1().f27150s.setVisibility(0);
            M1().C.setVisibility(0);
            M1().f27149r.setVisibility(0);
        }
        View findViewById = findViewById(R.id.ll_home);
        cm.l.e(findViewById, "findViewById(...)");
        H2((LinearLayout) findViewById);
        U1().setOnClickListener(new q(this));
        try {
            B2(String.valueOf(getIntent().getStringExtra("bioRecGenesis")));
            this.K = String.valueOf(getIntent().getStringExtra("DL"));
            this.L = String.valueOf(getIntent().getStringExtra("dob"));
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            C2((DldetobjX) serializableExtra);
            TextView textView = M1().f27143l;
            textView.setText(T1().b("dl_no", "DL No. : ") + ' ' + this.K);
            MyTextView myTextView = M1().f27144m;
            myTextView.setText(T1().b("dl_no", "DL No. : ") + ' ' + this.K);
            BioImgObjX bioImgObj = O1().getBioImgObj();
            if ((bioImgObj != null ? bioImgObj.getBiPhoto() : null) == null) {
                M1().f27152u.setVisibility(8);
                M1().f27146o.setVisibility(0);
            } else {
                M1().f27152u.setVisibility(0);
                M1().f27146o.setVisibility(8);
                M1().f27148q.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(O1().getBioImgObj().getBiPhoto()));
            }
            this.f8112h0 = String.valueOf(getIntent().getStringExtra("multiCheck"));
            Serializable serializableExtra2 = getIntent().getSerializableExtra("multiList");
            cm.l.d(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            M2((ArrayList) serializableExtra2);
            cm.l.a(c2().b(), VContant.MULTISERVICE_PURPOSE_CODE);
        } catch (Exception unused) {
        }
        D2((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(Z1(), this))).a(ba.b.class));
        M1().f27151t.setVisibility(0);
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            ba.b Q1 = Q1();
            String str = this.K;
            cm.l.c(str);
            String str2 = this.L;
            cm.l.c(str2);
            Q1.x(this, str, str2);
        } else {
            Toast.makeText(getApplicationContext(), T1().b("label_log_check_internet", getString(R.string.msg_no_internet)), 1).show();
        }
        Q1().l().g(this, new y(this));
        Q1().m().g(this, new z(this));
        Q1().t().g(this, new a0(this));
        M1().f27147p.setOnClickListener(new b0(this));
        M1().f27145n.setText(c2().i());
        M1().E.setOnClickListener(new c0(this));
        M1().f27142k.setText(this.K);
        W1().j().g(this, new d0(this));
        W1().i().g(this, new f(new d(this)));
        F2(new ArrayList());
        E2(new ArrayList());
        W1().k().g(this, new f(new e(this)));
        W1().i().g(this, new f(new a(this)));
        Q1().z().g(this, new e0(this));
        Q1().B().g(this, new r(this));
        M1().f27140i.setOnItemSelectedListener(new b(this));
        Q1().y().g(this, new s(this));
        Q1().A().g(this, new w(this));
        M1().f27139h.setOnItemSelectedListener(new c(this));
        M1().D.setOnClickListener(new x(this));
    }

    public final void u2(Context context, String str, DldetobjX dldetobjX, boolean z10) {
        cm.l.f(context, "context");
        cm.l.f(dldetobjX, "dl_details");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.vahan_process_diloge);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        if (attributes != null) {
            attributes.windowAnimations = R.style.PauseDialogAnimation;
        }
        View findViewById = dialog.findViewById(R.id.process_with_Adhar);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.process_with_mobile);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        if (z10) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        textView.setOnClickListener(new t(dialog, this));
        textView2.setOnClickListener(new u(dialog, this));
        dialog.show();
    }
}
