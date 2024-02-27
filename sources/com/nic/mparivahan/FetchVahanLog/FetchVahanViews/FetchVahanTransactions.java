package com.nic.mparivahan.FetchVahanLog.FetchVahanViews;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.f;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.FetchChallanLog.FetchChallanAssets.FetchChallaInterface;
import com.nic.mparivahan.FetchChallanLog.PojoChallan.FetchChallanResponse;
import com.nic.mparivahan.FetchVahanLog.FetchVahanLog.VahanInterface;
import com.nic.mparivahan.FetchVahanLog.Pojo.DltVhnTransaction;
import com.nic.mparivahan.FetchVahanLog.Staging.VahanInterfaceStaging;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplicationTransactionStatus;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.fetchSarathiLog.FetchSarathiAssets.SarathiInterface;
import java.util.ArrayList;
import ld.g;
import lk.e;
import nb.i;
import nb.j;
import nb.k;
import nb.n;
import nb.o;
import nb.p;
import nb.q;
import nb.r;
import ni.va;
import pl.x;
import v9.e;

public final class FetchVahanTransactions extends androidx.appcompat.app.d implements mb.a, mk.a, lb.a {
    public Context G;
    public RecyclerView H;
    public mb.d I;
    public VahanInterface J;
    public ArrayList K;
    public g L;
    public mk.c M;
    public SarathiInterface N;
    public ArrayList O;
    public lb.c P;
    public FetchChallaInterface Q;
    public ArrayList R;
    private bi.b S;
    private bi.a T;
    private ApplicationService U;
    public String V;
    public TextView W;
    public RelativeLayout X;
    public ProgressBar Y;
    public nb.g Z;

    /* renamed from: a0  reason: collision with root package name */
    public e f8921a0;

    /* renamed from: b0  reason: collision with root package name */
    public kb.e f8922b0;

    /* renamed from: c0  reason: collision with root package name */
    private ApplicationServiceOtp f8923c0;

    /* renamed from: d0  reason: collision with root package name */
    private int f8924d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f8925e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f8926f0;

    /* renamed from: g0  reason: collision with root package name */
    public ProgressDialog f8927g0;

    /* renamed from: h0  reason: collision with root package name */
    private VahanInterfaceStaging f8928h0 = VahanInterfaceStaging.f8937a.a();

    /* renamed from: i0  reason: collision with root package name */
    public String f8929i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f8930j0;

    /* renamed from: k0  reason: collision with root package name */
    public ld.c f8931k0;

    /* renamed from: l0  reason: collision with root package name */
    private va f8932l0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FetchVahanTransactions f8933e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FetchVahanTransactions fetchVahanTransactions) {
            super(1);
            this.f8933e = fetchVahanTransactions;
        }

        public final void b(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            if (this.f8933e.G1().isShowing()) {
                this.f8933e.G1().dismiss();
            }
            try {
                if (applicationStatusSuccessModel.getTransList().size() > 0) {
                    Intent intent = new Intent(this.f8933e, VahanApplicationTransactionStatus.class);
                    intent.putExtra("transList", new i7.d().t(applicationStatusSuccessModel.getTransList()));
                    intent.putExtra("applicationNo", this.f8933e.r1());
                    intent.putExtra("ownerName", "");
                    intent.putExtra("stateCd", this.f8933e.K1());
                    intent.putExtra("regNo", "");
                    this.f8933e.startActivity(intent);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ApplicationStatusSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FetchVahanTransactions f8934e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FetchVahanTransactions fetchVahanTransactions) {
            super(1);
            this.f8934e = fetchVahanTransactions;
        }

        public final void b(String str) {
            if (this.f8934e.G1().isShowing()) {
                this.f8934e.G1().dismiss();
            }
            FetchVahanTransactions fetchVahanTransactions = this.f8934e;
            fetchVahanTransactions.b2(fetchVahanTransactions, "Service temporarily unavailable, Please try again later.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FetchVahanTransactions f8935e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FetchVahanTransactions fetchVahanTransactions) {
            super(1);
            this.f8935e = fetchVahanTransactions;
        }

        public final void b(DltVhnTransaction dltVhnTransaction) {
            if (cm.l.a(dltVhnTransaction.getStatusCode(), "AUD001")) {
                this.f8935e.z1().L(this.f8935e.N1());
                FetchVahanTransactions fetchVahanTransactions = this.f8935e;
                fetchVahanTransactions.X1(fetchVahanTransactions, fetchVahanTransactions.t1().b("vehicle_trans_deleted", "Transaction Record deleted successfully."));
                return;
            }
            FetchVahanTransactions fetchVahanTransactions2 = this.f8935e;
            fetchVahanTransactions2.X1(fetchVahanTransactions2, dltVhnTransaction.getStatusDesc());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DltVhnTransaction) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8936a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f8936a = lVar;
        }

        public final pl.c a() {
            return this.f8936a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8936a.invoke(obj);
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
    public static final void O1(FetchVahanTransactions fetchVahanTransactions, View view) {
        cm.l.f(fetchVahanTransactions, "this$0");
        fetchVahanTransactions.finish();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void P1(com.nic.mparivahan.FetchVahanLog.FetchVahanViews.FetchVahanTransactions r4, com.nic.mparivahan.FetchVahanLog.Pojo.VahanPojo r5) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r4, r0)
            android.widget.ProgressBar r0 = r4.L1()
            r1 = 8
            r0.setVisibility(r1)
            java.lang.String r0 = r5.getStatusCode()     // Catch:{ Exception -> 0x0077 }
            java.lang.String r2 = "AUD001"
            boolean r0 = cm.l.a(r0, r2)     // Catch:{ Exception -> 0x0077 }
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x006f
            android.widget.RelativeLayout r0 = r4.H1()     // Catch:{ Exception -> 0x0060 }
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x0060 }
            androidx.recyclerview.widget.RecyclerView r0 = r4.I1()     // Catch:{ Exception -> 0x0060 }
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x0060 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0060 }
            r0.setLayoutManager(r1)     // Catch:{ Exception -> 0x0060 }
            androidx.recyclerview.widget.RecyclerView r0 = r4.I1()     // Catch:{ Exception -> 0x0060 }
            r0.setAdapter(r3)     // Catch:{ Exception -> 0x0060 }
            java.util.ArrayList r5 = r5.getVahanLogs()     // Catch:{ Exception -> 0x0060 }
            r4.n2(r5)     // Catch:{ Exception -> 0x0060 }
            java.util.ArrayList r5 = r4.B1()     // Catch:{ Exception -> 0x0060 }
            ql.x.N(r5)     // Catch:{ Exception -> 0x0060 }
            nb.g r5 = new nb.g     // Catch:{ Exception -> 0x0060 }
            java.util.ArrayList r0 = r4.B1()     // Catch:{ Exception -> 0x0060 }
            android.content.Context r1 = r4.s1()     // Catch:{ Exception -> 0x0060 }
            r5.<init>(r0, r1, r4)     // Catch:{ Exception -> 0x0060 }
            r4.l2(r5)     // Catch:{ Exception -> 0x0060 }
            androidx.recyclerview.widget.RecyclerView r5 = r4.I1()     // Catch:{ Exception -> 0x0060 }
            nb.g r0 = r4.z1()     // Catch:{ Exception -> 0x0060 }
            r5.setAdapter(r0)     // Catch:{ Exception -> 0x0060 }
            goto L_0x007c
        L_0x0060:
            androidx.recyclerview.widget.RecyclerView r5 = r4.I1()     // Catch:{ Exception -> 0x0077 }
            r5.setAdapter(r3)     // Catch:{ Exception -> 0x0077 }
        L_0x0067:
            android.widget.RelativeLayout r5 = r4.H1()     // Catch:{ Exception -> 0x0077 }
            r5.setVisibility(r2)     // Catch:{ Exception -> 0x0077 }
            goto L_0x007c
        L_0x006f:
            androidx.recyclerview.widget.RecyclerView r5 = r4.I1()     // Catch:{ Exception -> 0x0077 }
            r5.setAdapter(r3)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0067
        L_0x0077:
            java.lang.String r5 = "Service temporarily unavailable, Please try again later."
            r4.Z1(r4, r5)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.FetchVahanLog.FetchVahanViews.FetchVahanTransactions.P1(com.nic.mparivahan.FetchVahanLog.FetchVahanViews.FetchVahanTransactions, com.nic.mparivahan.FetchVahanLog.Pojo.VahanPojo):void");
    }

    /* access modifiers changed from: private */
    public static final void Q1(FetchVahanTransactions fetchVahanTransactions, String str) {
        cm.l.f(fetchVahanTransactions, "this$0");
        fetchVahanTransactions.L1().setVisibility(8);
        fetchVahanTransactions.H1().setVisibility(8);
        fetchVahanTransactions.Z1(fetchVahanTransactions, "Service temporarily unavailable, Please try again later.");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R1(com.nic.mparivahan.FetchVahanLog.FetchVahanViews.FetchVahanTransactions r4, com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo.FetchSarathiPojo r5) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r4, r0)
            android.widget.ProgressBar r0 = r4.L1()
            r1 = 8
            r0.setVisibility(r1)
            java.lang.String r0 = r5.getStatusCode()     // Catch:{ Exception -> 0x0077 }
            java.lang.String r2 = "AUD001"
            boolean r0 = cm.l.a(r0, r2)     // Catch:{ Exception -> 0x0077 }
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x006f
            android.widget.RelativeLayout r0 = r4.H1()     // Catch:{ Exception -> 0x0060 }
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x0060 }
            androidx.recyclerview.widget.RecyclerView r0 = r4.I1()     // Catch:{ Exception -> 0x0060 }
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x0060 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0060 }
            r0.setLayoutManager(r1)     // Catch:{ Exception -> 0x0060 }
            androidx.recyclerview.widget.RecyclerView r0 = r4.I1()     // Catch:{ Exception -> 0x0060 }
            r0.setAdapter(r3)     // Catch:{ Exception -> 0x0060 }
            java.util.ArrayList r5 = r5.getSarathiLogs()     // Catch:{ Exception -> 0x0060 }
            r4.w2(r5)     // Catch:{ Exception -> 0x0060 }
            java.util.ArrayList r5 = r4.J1()     // Catch:{ Exception -> 0x0060 }
            ql.x.N(r5)     // Catch:{ Exception -> 0x0060 }
            lk.e r5 = new lk.e     // Catch:{ Exception -> 0x0060 }
            java.util.ArrayList r0 = r4.J1()     // Catch:{ Exception -> 0x0060 }
            android.content.Context r1 = r4.s1()     // Catch:{ Exception -> 0x0060 }
            r5.<init>(r0, r1, r4)     // Catch:{ Exception -> 0x0060 }
            r4.k2(r5)     // Catch:{ Exception -> 0x0060 }
            androidx.recyclerview.widget.RecyclerView r5 = r4.I1()     // Catch:{ Exception -> 0x0060 }
            lk.e r0 = r4.y1()     // Catch:{ Exception -> 0x0060 }
            r5.setAdapter(r0)     // Catch:{ Exception -> 0x0060 }
            goto L_0x007c
        L_0x0060:
            androidx.recyclerview.widget.RecyclerView r5 = r4.I1()     // Catch:{ Exception -> 0x0077 }
            r5.setAdapter(r3)     // Catch:{ Exception -> 0x0077 }
        L_0x0067:
            android.widget.RelativeLayout r5 = r4.H1()     // Catch:{ Exception -> 0x0077 }
            r5.setVisibility(r2)     // Catch:{ Exception -> 0x0077 }
            goto L_0x007c
        L_0x006f:
            androidx.recyclerview.widget.RecyclerView r5 = r4.I1()     // Catch:{ Exception -> 0x0077 }
            r5.setAdapter(r3)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0067
        L_0x0077:
            java.lang.String r5 = "Service temporarily unavailable, Please try again later."
            r4.Z1(r4, r5)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.FetchVahanLog.FetchVahanViews.FetchVahanTransactions.R1(com.nic.mparivahan.FetchVahanLog.FetchVahanViews.FetchVahanTransactions, com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo.FetchSarathiPojo):void");
    }

    /* access modifiers changed from: private */
    public static final void S1(FetchVahanTransactions fetchVahanTransactions, String str) {
        cm.l.f(fetchVahanTransactions, "this$0");
        fetchVahanTransactions.L1().setVisibility(8);
        fetchVahanTransactions.H1().setVisibility(8);
        fetchVahanTransactions.Z1(fetchVahanTransactions, "Service temporarily unavailable, Please try again later.");
    }

    /* access modifiers changed from: private */
    public static final void T1(FetchVahanTransactions fetchVahanTransactions, FetchChallanResponse fetchChallanResponse) {
        cm.l.f(fetchVahanTransactions, "this$0");
        fetchVahanTransactions.L1().setVisibility(8);
        Log.v("Response", fetchChallanResponse.toString());
        try {
            Log.v("Status", fetchChallanResponse.getStatusCode());
            if (cm.l.a(fetchChallanResponse.getStatusCode(), "AUD001")) {
                fetchVahanTransactions.H1().setVisibility(8);
                fetchVahanTransactions.I1().setLayoutManager(new LinearLayoutManager(fetchVahanTransactions));
                fetchVahanTransactions.I1().setAdapter((RecyclerView.h) null);
                fetchVahanTransactions.o2(fetchChallanResponse.getMparEchallanLog());
                x.N(fetchVahanTransactions.C1());
                fetchVahanTransactions.h2(new kb.e(fetchVahanTransactions.C1(), fetchVahanTransactions.s1(), fetchVahanTransactions));
                fetchVahanTransactions.I1().setAdapter(fetchVahanTransactions.v1());
                return;
            }
            fetchVahanTransactions.I1().setAdapter((RecyclerView.h) null);
            fetchVahanTransactions.H1().setVisibility(0);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void U1(FetchVahanTransactions fetchVahanTransactions, String str) {
        cm.l.f(fetchVahanTransactions, "this$0");
        fetchVahanTransactions.L1().setVisibility(8);
        fetchVahanTransactions.H1().setVisibility(8);
        fetchVahanTransactions.Z1(fetchVahanTransactions, "Service temporarily unavailable, Please try again later.");
    }

    /* access modifiers changed from: private */
    public static final void V1(FetchVahanTransactions fetchVahanTransactions, DltVhnTransaction dltVhnTransaction) {
        String statusDesc;
        cm.l.f(fetchVahanTransactions, "this$0");
        if (cm.l.a(dltVhnTransaction.getStatusCode(), "AUD001")) {
            fetchVahanTransactions.y1().L(fetchVahanTransactions.f8925e0);
            statusDesc = fetchVahanTransactions.t1().b("dl_transc_deleted", "Transaction Record deleted successfully.");
        } else {
            statusDesc = dltVhnTransaction.getStatusDesc();
        }
        fetchVahanTransactions.X1(fetchVahanTransactions, statusDesc);
    }

    /* access modifiers changed from: private */
    public static final void W1(FetchVahanTransactions fetchVahanTransactions, DltVhnTransaction dltVhnTransaction) {
        String statusDesc;
        cm.l.f(fetchVahanTransactions, "this$0");
        if (cm.l.a(dltVhnTransaction.getStatusCode(), "AUD001")) {
            fetchVahanTransactions.v1().K(fetchVahanTransactions.f8926f0);
            statusDesc = "Transaction Record deleted successfully.";
        } else {
            statusDesc = dltVhnTransaction.getStatusDesc();
        }
        fetchVahanTransactions.X1(fetchVahanTransactions, statusDesc);
    }

    /* access modifiers changed from: private */
    public static final void Y1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void a2(Dialog dialog, FetchVahanTransactions fetchVahanTransactions, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(fetchVahanTransactions, "this$0");
        dialog.dismiss();
        fetchVahanTransactions.finish();
    }

    /* access modifiers changed from: private */
    public static final void c2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public void A(Integer num, int i10) {
        this.f8924d0 = i10;
        mb.d A1 = A1();
        cm.l.c(num);
        A1.g(num.intValue(), false);
    }

    public final mb.d A1() {
        mb.d dVar = this.I;
        if (dVar != null) {
            return dVar;
        }
        cm.l.v("mFetchVahanVM");
        return null;
    }

    public final ArrayList B1() {
        ArrayList arrayList = this.K;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("mListVal");
        return null;
    }

    public final ArrayList C1() {
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("mMparEchallanLog");
        return null;
    }

    public void D(Integer num, int i10) {
        this.f8925e0 = i10;
        mk.c x12 = x1();
        cm.l.c(num);
        x12.g(num.intValue(), false);
    }

    public final SarathiInterface D1() {
        SarathiInterface sarathiInterface = this.N;
        if (sarathiInterface != null) {
            return sarathiInterface;
        }
        cm.l.v("mSarathiInterface");
        return null;
    }

    public final g E1() {
        g gVar = this.L;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSession");
        return null;
    }

    public final VahanInterface F1() {
        VahanInterface vahanInterface = this.J;
        if (vahanInterface != null) {
            return vahanInterface;
        }
        cm.l.v("mVahanInterface");
        return null;
    }

    public final ProgressDialog G1() {
        ProgressDialog progressDialog = this.f8927g0;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final RelativeLayout H1() {
        RelativeLayout relativeLayout = this.X;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        cm.l.v("rl_notransaction");
        return null;
    }

    public final RecyclerView I1() {
        RecyclerView recyclerView = this.H;
        if (recyclerView != null) {
            return recyclerView;
        }
        cm.l.v("rv_vahan_trans");
        return null;
    }

    public final ArrayList J1() {
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("sListVal");
        return null;
    }

    public final String K1() {
        String str = this.f8930j0;
        if (str != null) {
            return str;
        }
        cm.l.v("stateCd");
        return null;
    }

    public final ProgressBar L1() {
        ProgressBar progressBar = this.Y;
        if (progressBar != null) {
            return progressBar;
        }
        cm.l.v("trans_bar");
        return null;
    }

    public final String M1() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("trans_val");
        return null;
    }

    public final int N1() {
        return this.f8924d0;
    }

    public void U(String str, String str2) {
        cm.l.f(str, "vahlogApplicationId");
        cm.l.f(str2, "sCd");
        d2(str);
        x2(str2);
        G1().show();
        bi.a aVar = this.T;
        if (aVar == null) {
            cm.l.v("otpViewModel");
            aVar = null;
        }
        aVar.o(this, str, K1());
    }

    public void V(Long l10, int i10) {
        this.f8925e0 = i10;
        lb.c w12 = w1();
        cm.l.c(l10);
        w12.g(l10.longValue(), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        H1().setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        H1().setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (z1().e() <= 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (v1().e() <= 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void X1(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            cm.l.f(r5, r0)
            r0 = 0
            java.lang.String r1 = r4.M1()     // Catch:{ Exception -> 0x005f }
            int r2 = r1.hashCode()     // Catch:{ Exception -> 0x005f }
            r3 = 8
            switch(r2) {
                case 49: goto L_0x004b;
                case 50: goto L_0x0037;
                case 51: goto L_0x0014;
                default: goto L_0x0013;
            }     // Catch:{ Exception -> 0x005f }
        L_0x0013:
            goto L_0x005f
        L_0x0014:
            java.lang.String r2 = "3"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x005f }
            if (r1 != 0) goto L_0x001d
            goto L_0x005f
        L_0x001d:
            kb.e r1 = r4.v1()     // Catch:{ Exception -> 0x005f }
            int r1 = r1.e()     // Catch:{ Exception -> 0x005f }
            if (r1 > 0) goto L_0x002f
        L_0x0027:
            android.widget.RelativeLayout r1 = r4.H1()     // Catch:{ Exception -> 0x005f }
            r1.setVisibility(r0)     // Catch:{ Exception -> 0x005f }
            goto L_0x005f
        L_0x002f:
            android.widget.RelativeLayout r1 = r4.H1()     // Catch:{ Exception -> 0x005f }
            r1.setVisibility(r3)     // Catch:{ Exception -> 0x005f }
            goto L_0x005f
        L_0x0037:
            java.lang.String r2 = "2"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x005f }
            if (r1 != 0) goto L_0x0040
            goto L_0x005f
        L_0x0040:
            lk.e r1 = r4.y1()     // Catch:{ Exception -> 0x005f }
            int r1 = r1.e()     // Catch:{ Exception -> 0x005f }
            if (r1 > 0) goto L_0x002f
            goto L_0x0027
        L_0x004b:
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x005f }
            if (r1 != 0) goto L_0x0054
            goto L_0x005f
        L_0x0054:
            nb.g r1 = r4.z1()     // Catch:{ Exception -> 0x005f }
            int r1 = r1.e()     // Catch:{ Exception -> 0x005f }
            if (r1 > 0) goto L_0x002f
            goto L_0x0027
        L_0x005f:
            android.app.Dialog r1 = new android.app.Dialog
            r1.<init>(r5)
            r5 = 2131558870(0x7f0d01d6, float:1.8743068E38)
            r1.setContentView(r5)
            android.view.Window r5 = r1.getWindow()
            cm.l.c(r5)
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r0)
            r5.setBackgroundDrawable(r2)
            r5 = 2131364109(0x7f0a090d, float:1.8348046E38)
            android.view.View r5 = r1.findViewById(r5)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            cm.l.d(r5, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r2 = 2131364107(0x7f0a090b, float:1.8348042E38)
            android.view.View r2 = r1.findViewById(r2)
            cm.l.d(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131365224(0x7f0a0d68, float:1.8350307E38)
            android.view.View r3 = r1.findViewById(r3)
            cm.l.d(r3, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5.setText(r6)
            ld.c r5 = r4.t1()
            java.lang.String r6 = "btn_ok"
            java.lang.String r0 = "ok"
            java.lang.String r5 = r5.b(r6, r0)
            r2.setText(r5)
            ld.c r5 = r4.t1()
            java.lang.String r6 = "nex_parivahan"
            java.lang.String r0 = "NextGen mParivahan"
            java.lang.String r5 = r5.b(r6, r0)
            r3.setText(r5)
            nb.s r5 = new nb.s
            r5.<init>(r1)
            r2.setOnClickListener(r5)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.FetchVahanLog.FetchVahanViews.FetchVahanTransactions.X1(android.content.Context, java.lang.String):void");
    }

    public final void Z1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        textView.setText(t1().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(t1().b("nex_parivahan", "NextGen mParivahan"));
        ((TextView) findViewById2).setText(str);
        textView.setOnClickListener(new j(dialog, this));
        dialog.show();
    }

    public final void b2(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(t1().b("nex_parivahan", "NextGen mParivahan"));
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new i(dialog));
        dialog.show();
    }

    public final void d2(String str) {
        cm.l.f(str, "<set-?>");
        this.f8929i0 = str;
    }

    public final void e2(Context context) {
        cm.l.f(context, "<set-?>");
        this.G = context;
    }

    public final void f2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8931k0 = cVar;
    }

    public final void g2(FetchChallaInterface fetchChallaInterface) {
        cm.l.f(fetchChallaInterface, "<set-?>");
        this.Q = fetchChallaInterface;
    }

    public final void h2(kb.e eVar) {
        cm.l.f(eVar, "<set-?>");
        this.f8922b0 = eVar;
    }

    public final void i2(lb.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.P = cVar;
    }

    public final void j2(mk.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final void k2(e eVar) {
        cm.l.f(eVar, "<set-?>");
        this.f8921a0 = eVar;
    }

    public final void l2(nb.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.Z = gVar;
    }

    public final void m2(mb.d dVar) {
        cm.l.f(dVar, "<set-?>");
        this.I = dVar;
    }

    public final void n2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.K = arrayList;
    }

    public final void o2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.R = arrayList;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.fetch_vahan_transactions);
        va c10 = va.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.f8932l0 = c10;
        bi.a aVar = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e2(this);
        e.a aVar2 = v9.e.f17509a;
        Context s12 = s1();
        va vaVar = this.f8932l0;
        if (vaVar == null) {
            cm.l.v("binding");
            vaVar = null;
        }
        aVar2.W1(s12, vaVar);
        f2(new ld.c(s1()));
        p2(SarathiInterface.f22410a.a(s1()));
        r2(VahanInterface.f8917a.a(s1()));
        g2(FetchChallaInterface.f8913a.a(s1()));
        this.f8923c0 = ApplicationServiceOtp.f21184a.b(this);
        this.U = ApplicationService.f21181a.b(this);
        ApplicationService applicationService = this.U;
        if (applicationService == null) {
            cm.l.v("retrofitService");
            applicationService = null;
        }
        this.S = (bi.b) new u0((x0) this, (u0.b) new f(new wg.b(applicationService))).a(bi.b.class);
        ApplicationServiceOtp applicationServiceOtp = this.f8923c0;
        if (applicationServiceOtp == null) {
            cm.l.v("otpRetrofitService");
            applicationServiceOtp = null;
        }
        this.T = (bi.a) new u0((x0) this, (u0.b) new bi.e(new wg.a(applicationServiceOtp))).a(bi.a.class);
        t2(new ProgressDialog(this));
        G1().setMessage("Please wait...");
        G1().setCancelable(false);
        G1().setCanceledOnTouchOutside(false);
        View findViewById = findViewById(R.id.rv_vahan_trans);
        cm.l.e(findViewById, "findViewById(...)");
        v2((RecyclerView) findViewById);
        View findViewById2 = findViewById(R.id.my_transations);
        cm.l.e(findViewById2, "findViewById(...)");
        s2((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.trans_bar);
        cm.l.e(findViewById3, "findViewById(...)");
        y2((ProgressBar) findViewById3);
        View findViewById4 = findViewById(R.id.rl_notransaction);
        cm.l.e(findViewById4, "findViewById(...)");
        u2((RelativeLayout) findViewById4);
        va vaVar2 = this.f8932l0;
        if (vaVar2 == null) {
            cm.l.v("binding");
            vaVar2 = null;
        }
        vaVar2.f29060i.f25959e.setOnClickListener(new nb.h(this));
        q2(new g(this));
        z2(String.valueOf(getIntent().getStringExtra("trans_val")));
        m2((mb.d) new u0((x0) this, (u0.b) new mb.b(new mb.e(F1()))).a(mb.d.class));
        i2((lb.c) new u0((x0) this, (u0.b) new lb.d(new lb.e(u1()))).a(lb.c.class));
        j2((mk.c) new u0((x0) this, (u0.b) new mk.b(new mk.e(D1()))).a(mk.c.class));
        if (cm.l.a(M1(), "1")) {
            va vaVar3 = this.f8932l0;
            if (vaVar3 == null) {
                cm.l.v("binding");
                vaVar3 = null;
            }
            vaVar3.f29060i.f25961g.setText(t1().b("Vehicle_Transactions", "Vehicle Transactions"));
            L1().setVisibility(0);
            A1().h(Integer.parseInt(E1().k()), true);
            A1().k().g(this, new k(this));
            A1().i().g(this, new nb.l(this));
        }
        if (cm.l.a(M1(), "2")) {
            va vaVar4 = this.f8932l0;
            if (vaVar4 == null) {
                cm.l.v("binding");
                vaVar4 = null;
            }
            vaVar4.f29060i.f25961g.setText(t1().b("Driving_Licence_Transactions", "Driving Licence Transactions"));
            L1().setVisibility(0);
            x1().h(Integer.parseInt(E1().k()), true);
            x1().k().g(this, new nb.m(this));
            x1().i().g(this, new n(this));
        }
        if (cm.l.a(M1(), VContant.DUPLICATE_RC_PURPOSE_CODE)) {
            va vaVar5 = this.f8932l0;
            if (vaVar5 == null) {
                cm.l.v("binding");
                vaVar5 = null;
            }
            vaVar5.f29060i.f25961g.setText(t1().b("Challan_Transactions", "Challan Transactions"));
            L1().setVisibility(0);
            w1().h(Long.parseLong(E1().k()), true);
            w1().k().g(this, new o(this));
            w1().i().g(this, new p(this));
        }
        A1().j().g(this, new d(new c(this)));
        x1().j().g(this, new q(this));
        w1().j().g(this, new r(this));
        bi.a aVar3 = this.T;
        if (aVar3 == null) {
            cm.l.v("otpViewModel");
            aVar3 = null;
        }
        aVar3.n().g(this, new d(new a(this)));
        bi.a aVar4 = this.T;
        if (aVar4 == null) {
            cm.l.v("otpViewModel");
        } else {
            aVar = aVar4;
        }
        aVar.k().g(this, new d(new b(this)));
    }

    public final void p2(SarathiInterface sarathiInterface) {
        cm.l.f(sarathiInterface, "<set-?>");
        this.N = sarathiInterface;
    }

    public final void q2(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.L = gVar;
    }

    public final String r1() {
        String str = this.f8929i0;
        if (str != null) {
            return str;
        }
        cm.l.v("application");
        return null;
    }

    public final void r2(VahanInterface vahanInterface) {
        cm.l.f(vahanInterface, "<set-?>");
        this.J = vahanInterface;
    }

    public final Context s1() {
        Context context = this.G;
        if (context != null) {
            return context;
        }
        cm.l.v("context");
        return null;
    }

    public final void s2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.W = textView;
    }

    public final ld.c t1() {
        ld.c cVar = this.f8931k0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final void t2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.f8927g0 = progressDialog;
    }

    public final FetchChallaInterface u1() {
        FetchChallaInterface fetchChallaInterface = this.Q;
        if (fetchChallaInterface != null) {
            return fetchChallaInterface;
        }
        cm.l.v("mFetchChallaInterface");
        return null;
    }

    public final void u2(RelativeLayout relativeLayout) {
        cm.l.f(relativeLayout, "<set-?>");
        this.X = relativeLayout;
    }

    public final kb.e v1() {
        kb.e eVar = this.f8922b0;
        if (eVar != null) {
            return eVar;
        }
        cm.l.v("mFetchChallanAdapter");
        return null;
    }

    public final void v2(RecyclerView recyclerView) {
        cm.l.f(recyclerView, "<set-?>");
        this.H = recyclerView;
    }

    public final lb.c w1() {
        lb.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mFetchChallanVM");
        return null;
    }

    public final void w2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.O = arrayList;
    }

    public final mk.c x1() {
        mk.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mFetchSarathVMi");
        return null;
    }

    public final void x2(String str) {
        cm.l.f(str, "<set-?>");
        this.f8930j0 = str;
    }

    public final lk.e y1() {
        lk.e eVar = this.f8921a0;
        if (eVar != null) {
            return eVar;
        }
        cm.l.v("mFetchSarathiAdapter");
        return null;
    }

    public final void y2(ProgressBar progressBar) {
        cm.l.f(progressBar, "<set-?>");
        this.Y = progressBar;
    }

    public final nb.g z1() {
        nb.g gVar = this.Z;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mFetchVahanAdapter");
        return null;
    }

    public final void z2(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }
}
