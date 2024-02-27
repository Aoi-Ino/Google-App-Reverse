package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import cb.v3;
import cm.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Model.SearchChallanModel;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import db.o;
import fb.a;
import java.util.ArrayList;
import java.util.List;
import km.f;
import ni.k9;
import pl.x;

public final class VerifyPaymentChallanList extends androidx.appcompat.app.d {
    private AppCompatImageView G;
    private AppCompatImageView H;
    /* access modifiers changed from: private */
    public AppCompatEditText I;
    private MyTextView J;
    /* access modifiers changed from: private */
    public AppCompatTextView K;
    private RecyclerView L;
    private o M;
    /* access modifiers changed from: private */
    public ProgressBar N;
    private AppCompatTextView O;
    private RelativeLayout P;
    public ld.c Q;
    private String R = "";
    private String S = "";
    private ArrayList T = new ArrayList();
    private ArrayList U = new ArrayList();
    private int V = 1;
    private int W;
    private final String X = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private SearchChallanService Y;
    private jb.c Z;
    /* access modifiers changed from: private */

    /* renamed from: a0  reason: collision with root package name */
    public k9 f8897a0;

    /* renamed from: b0  reason: collision with root package name */
    private final TextWatcher f8898b0 = new a(this);

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyPaymentChallanList f8899e;

        a(VerifyPaymentChallanList verifyPaymentChallanList) {
            this.f8899e = verifyPaymentChallanList;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                AppCompatEditText m12 = this.f8899e.I;
                if (m12 == null) {
                    l.v("numberEt");
                    m12 = null;
                }
                m12.setError((CharSequence) null);
            }
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyPaymentChallanList f8900e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VerifyPaymentChallanList verifyPaymentChallanList) {
            super(1);
            this.f8900e = verifyPaymentChallanList;
        }

        public final void b(SearchChallanModel searchChallanModel) {
            VerifyPaymentChallanList verifyPaymentChallanList;
            String message;
            AppCompatTextView appCompatTextView;
            String str;
            ProgressBar progressBar = null;
            try {
                l.c(searchChallanModel);
                if (p.o(searchChallanModel.getStatus(), "200", true)) {
                    this.f8900e.G1(searchChallanModel.getResult());
                    this.f8900e.I1(searchChallanModel.getTotalChallan());
                    if (this.f8900e.s1().size() > 0) {
                        int size = this.f8900e.s1().size();
                        for (int i10 = 0; i10 < size; i10++) {
                            if (((SearchChallanResultModel) this.f8900e.s1().get(i10)).getPaymentEligible() == 0) {
                                this.f8900e.v1().add(this.f8900e.s1().get(i10));
                            }
                        }
                        VerifyPaymentChallanList verifyPaymentChallanList2 = this.f8900e;
                        verifyPaymentChallanList2.F1(verifyPaymentChallanList2.v1());
                    }
                    this.f8900e.r1();
                    if (this.f8900e.w1() == 1) {
                        if (this.f8900e.v1().size() > 1) {
                            appCompatTextView = this.f8900e.K;
                            if (appCompatTextView == null) {
                                l.v("totalChallan");
                                appCompatTextView = null;
                            }
                            str = this.f8900e.t1().b("label_challan_totals", this.f8900e.getString(R.string.total_challans)) + ' ' + this.f8900e.v1().size();
                        } else if (this.f8900e.v1().size() == 0) {
                            AppCompatTextView o12 = this.f8900e.K;
                            if (o12 == null) {
                                l.v("totalChallan");
                                o12 = null;
                            }
                            str = this.f8900e.t1().b("label_challan_total", this.f8900e.getString(R.string.total_challan)) + " 0";
                        } else {
                            AppCompatTextView o13 = this.f8900e.K;
                            if (o13 == null) {
                                l.v("totalChallan");
                                o13 = null;
                            }
                            str = this.f8900e.t1().b("label_challan_total", this.f8900e.getString(R.string.total_challan)) + ' ' + this.f8900e.v1().size();
                        }
                        appCompatTextView.setText(str);
                    }
                    ProgressBar n12 = this.f8900e.N;
                    if (n12 == null) {
                        l.v("progressBar");
                        n12 = null;
                    }
                    if (n12.getVisibility() == 0) {
                        ProgressBar n13 = this.f8900e.N;
                        if (n13 == null) {
                            l.v("progressBar");
                            n13 = null;
                        }
                        n13.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (l.a(searchChallanModel.getStatus(), "Failed")) {
                    k9 l12 = this.f8900e.f8897a0;
                    if (l12 == null) {
                        l.v("binding");
                        l12 = null;
                    }
                    ProgressBar progressBar2 = l12.f27127e;
                    l.e(progressBar2, "progressBar");
                    if (progressBar2.getVisibility() == 0) {
                        k9 l13 = this.f8900e.f8897a0;
                        if (l13 == null) {
                            l.v("binding");
                            l13 = null;
                        }
                        l13.f27127e.setVisibility(8);
                    }
                    this.f8900e.v1().clear();
                    this.f8900e.r1();
                    verifyPaymentChallanList = this.f8900e;
                    message = searchChallanModel.getMessage();
                } else if (l.a(searchChallanModel.getStatus(), "404")) {
                    k9 l14 = this.f8900e.f8897a0;
                    if (l14 == null) {
                        l.v("binding");
                        l14 = null;
                    }
                    ProgressBar progressBar3 = l14.f27127e;
                    l.e(progressBar3, "progressBar");
                    if (progressBar3.getVisibility() == 0) {
                        k9 l15 = this.f8900e.f8897a0;
                        if (l15 == null) {
                            l.v("binding");
                            l15 = null;
                        }
                        l15.f27127e.setVisibility(8);
                    }
                    this.f8900e.v1().clear();
                    this.f8900e.r1();
                    verifyPaymentChallanList = this.f8900e;
                    message = searchChallanModel.getMessage();
                } else {
                    ProgressBar n14 = this.f8900e.N;
                    if (n14 == null) {
                        l.v("progressBar");
                        n14 = null;
                    }
                    if (n14.getVisibility() == 0) {
                        ProgressBar n15 = this.f8900e.N;
                        if (n15 == null) {
                            l.v("progressBar");
                            n15 = null;
                        }
                        n15.setVisibility(8);
                    }
                    this.f8900e.v1().clear();
                    this.f8900e.r1();
                    return;
                }
                verifyPaymentChallanList.J1(verifyPaymentChallanList, message);
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressBar n16 = this.f8900e.N;
                if (n16 == null) {
                    l.v("progressBar");
                    n16 = null;
                }
                if (n16.getVisibility() == 0) {
                    ProgressBar n17 = this.f8900e.N;
                    if (n17 == null) {
                        l.v("progressBar");
                    } else {
                        progressBar = n17;
                    }
                    progressBar.setVisibility(8);
                }
                this.f8900e.v1().clear();
                this.f8900e.r1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SearchChallanModel) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyPaymentChallanList f8901e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VerifyPaymentChallanList verifyPaymentChallanList) {
            super(1);
            this.f8901e = verifyPaymentChallanList;
        }

        public final void b(String str) {
            ProgressBar n12 = this.f8901e.N;
            ProgressBar progressBar = null;
            if (n12 == null) {
                l.v("progressBar");
                n12 = null;
            }
            if (n12.getVisibility() == 0) {
                ProgressBar n13 = this.f8901e.N;
                if (n13 == null) {
                    l.v("progressBar");
                } else {
                    progressBar = n13;
                }
                progressBar.setVisibility(8);
            }
            this.f8901e.v1().clear();
            this.f8901e.r1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8902a;

        d(bm.l lVar) {
            l.f(lVar, "function");
            this.f8902a = lVar;
        }

        public final pl.c a() {
            return this.f8902a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8902a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        if (r5 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (r5 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        if (r5 == null) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A1(com.nic.mparivahan.Echallan.VerifyPaymentChallanList r5, android.view.View r6) {
        /*
            java.lang.String r6 = "this$0"
            cm.l.f(r5, r6)
            androidx.appcompat.widget.AppCompatEditText r6 = r5.I
            r0 = 0
            java.lang.String r1 = "numberEt"
            if (r6 != 0) goto L_0x0010
            cm.l.v(r1)
            r6 = r0
        L_0x0010:
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.CharSequence r6 = km.q.B0(r6)
            java.lang.String r6 = r6.toString()
            boolean r2 = r5.L1()
            java.lang.String r3 = "RC"
            if (r2 != 0) goto L_0x003f
            java.lang.String r0 = r5.S
            boolean r0 = cm.l.a(r0, r3)
            if (r0 == 0) goto L_0x0034
            r5.onBackPressed()
            goto L_0x003e
        L_0x0034:
            r5.R = r6
            java.util.ArrayList r6 = r5.T
            r6.clear()
            r5.q1()
        L_0x003e:
            return
        L_0x003f:
            java.lang.String r6 = r5.S
            java.lang.String r2 = "Challan"
            boolean r2 = cm.l.a(r6, r2)
            if (r2 == 0) goto L_0x0072
            androidx.appcompat.widget.AppCompatEditText r6 = r5.I
            if (r6 != 0) goto L_0x0051
            cm.l.v(r1)
            r6 = r0
        L_0x0051:
            ld.c r2 = r5.t1()
            r3 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_please_enter_challan_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.I
            if (r5 != 0) goto L_0x006d
        L_0x0069:
            cm.l.v(r1)
            goto L_0x006e
        L_0x006d:
            r0 = r5
        L_0x006e:
            r0.requestFocus()
            goto L_0x00ba
        L_0x0072:
            boolean r6 = cm.l.a(r6, r3)
            if (r6 == 0) goto L_0x0099
            androidx.appcompat.widget.AppCompatEditText r6 = r5.I
            if (r6 != 0) goto L_0x0080
            cm.l.v(r1)
            r6 = r0
        L_0x0080:
            ld.c r2 = r5.t1()
            r3 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_please_enter_vehicle_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.I
            if (r5 != 0) goto L_0x006d
            goto L_0x0069
        L_0x0099:
            androidx.appcompat.widget.AppCompatEditText r6 = r5.I
            if (r6 != 0) goto L_0x00a1
            cm.l.v(r1)
            r6 = r0
        L_0x00a1:
            ld.c r2 = r5.t1()
            r3 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_valid_dl_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.I
            if (r5 != 0) goto L_0x006d
            goto L_0x0069
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.VerifyPaymentChallanList.A1(com.nic.mparivahan.Echallan.VerifyPaymentChallanList, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (r4 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009a, code lost:
        if (r4 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        if (r4 == null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean B1(com.nic.mparivahan.Echallan.VerifyPaymentChallanList r4, android.widget.TextView r5, int r6, android.view.KeyEvent r7) {
        /*
            java.lang.String r5 = "this$0"
            cm.l.f(r4, r5)
            r5 = 6
            if (r6 != r5) goto L_0x00bf
            androidx.appcompat.widget.AppCompatEditText r5 = r4.I
            r6 = 0
            java.lang.String r7 = "numberEt"
            if (r5 != 0) goto L_0x0013
            cm.l.v(r7)
            r5 = r6
        L_0x0013:
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.CharSequence r5 = km.q.B0(r5)
            java.lang.String r5 = r5.toString()
            boolean r0 = r4.L1()
            r1 = 1
            java.lang.String r2 = "RC"
            if (r0 != 0) goto L_0x0043
            java.lang.String r6 = r4.S
            boolean r6 = cm.l.a(r6, r2)
            if (r6 == 0) goto L_0x0038
            r4.onBackPressed()
            goto L_0x0042
        L_0x0038:
            r4.R = r5
            java.util.ArrayList r5 = r4.T
            r5.clear()
            r4.q1()
        L_0x0042:
            return r1
        L_0x0043:
            java.lang.String r5 = r4.S
            java.lang.String r0 = "Challan"
            boolean r0 = cm.l.a(r5, r0)
            if (r0 == 0) goto L_0x0076
            androidx.appcompat.widget.AppCompatEditText r5 = r4.I
            if (r5 != 0) goto L_0x0055
            cm.l.v(r7)
            r5 = r6
        L_0x0055:
            ld.c r0 = r4.t1()
            r2 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "label_challan_please_enter_challan_no"
            java.lang.String r0 = r0.b(r3, r2)
            r5.setError(r0)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.I
            if (r4 != 0) goto L_0x0071
        L_0x006d:
            cm.l.v(r7)
            goto L_0x0072
        L_0x0071:
            r6 = r4
        L_0x0072:
            r6.requestFocus()
            goto L_0x00be
        L_0x0076:
            boolean r5 = cm.l.a(r5, r2)
            if (r5 == 0) goto L_0x009d
            androidx.appcompat.widget.AppCompatEditText r5 = r4.I
            if (r5 != 0) goto L_0x0084
            cm.l.v(r7)
            r5 = r6
        L_0x0084:
            ld.c r0 = r4.t1()
            r2 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "label_challan_please_enter_vehicle_no"
            java.lang.String r0 = r0.b(r3, r2)
            r5.setError(r0)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.I
            if (r4 != 0) goto L_0x0071
            goto L_0x006d
        L_0x009d:
            androidx.appcompat.widget.AppCompatEditText r5 = r4.I
            if (r5 != 0) goto L_0x00a5
            cm.l.v(r7)
            r5 = r6
        L_0x00a5:
            ld.c r0 = r4.t1()
            r2 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "label_challan_valid_dl_no"
            java.lang.String r0 = r0.b(r3, r2)
            r5.setError(r0)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.I
            if (r4 != 0) goto L_0x0071
            goto L_0x006d
        L_0x00be:
            return r1
        L_0x00bf:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.VerifyPaymentChallanList.B1(com.nic.mparivahan.Echallan.VerifyPaymentChallanList, android.widget.TextView, int, android.view.KeyEvent):boolean");
    }

    private final boolean D1() {
        Object systemService = getSystemService("connectivity");
        l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    private final void E1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void F1(List list) {
        o oVar = this.M;
        if (oVar == null) {
            l.v("adapter");
            oVar = null;
        }
        oVar.B(list);
        oVar.j();
    }

    /* access modifiers changed from: private */
    public static final void K1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final boolean L1() {
        String str;
        AppCompatEditText appCompatEditText = this.I;
        AppCompatEditText appCompatEditText2 = null;
        if (appCompatEditText == null) {
            l.v("numberEt");
            appCompatEditText = null;
        }
        String obj = q.B0(String.valueOf(appCompatEditText.getText())).toString();
        char[] charArray = obj.toCharArray();
        l.e(charArray, "this as java.lang.String).toCharArray()");
        if (obj.length() <= 0 || obj.length() <= 2) {
            str = "";
        } else {
            AppCompatEditText appCompatEditText3 = this.I;
            if (appCompatEditText3 == null) {
                l.v("numberEt");
                appCompatEditText3 = null;
            }
            str = q.B0(String.valueOf(appCompatEditText3.getText())).toString().substring(0, 2);
            l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (l.a(this.S, "Challan")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText4 = this.I;
                if (appCompatEditText4 == null) {
                    l.v("numberEt");
                    appCompatEditText4 = null;
                }
                appCompatEditText4.setError(t1().b("label_challan_please_enter_challan_no", getString(R.string.please_enter_challan_no)));
                AppCompatEditText appCompatEditText5 = this.I;
                if (appCompatEditText5 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText5;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (!C1(str)) {
                AppCompatEditText appCompatEditText6 = this.I;
                if (appCompatEditText6 == null) {
                    l.v("numberEt");
                    appCompatEditText6 = null;
                }
                appCompatEditText6.setError(t1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
                AppCompatEditText appCompatEditText7 = this.I;
                if (appCompatEditText7 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText7;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (obj.length() < 12) {
                AppCompatEditText appCompatEditText8 = this.I;
                if (appCompatEditText8 == null) {
                    l.v("numberEt");
                    appCompatEditText8 = null;
                }
                appCompatEditText8.setError(t1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
                AppCompatEditText appCompatEditText9 = this.I;
                if (appCompatEditText9 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText9;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (obj.length() > 30) {
                AppCompatEditText appCompatEditText10 = this.I;
                if (appCompatEditText10 == null) {
                    l.v("numberEt");
                    appCompatEditText10 = null;
                }
                appCompatEditText10.setError(t1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                AppCompatEditText appCompatEditText11 = this.I;
                if (appCompatEditText11 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText11;
                }
                appCompatEditText2.requestFocus();
                return true;
            }
        } else if (l.a(this.S, "RC")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText12 = this.I;
                if (appCompatEditText12 == null) {
                    l.v("numberEt");
                    appCompatEditText12 = null;
                }
                appCompatEditText12.setError(t1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
                AppCompatEditText appCompatEditText13 = this.I;
                if (appCompatEditText13 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText13;
                }
                appCompatEditText2.requestFocus();
                return true;
            }
            int length = charArray.length;
            if (length >= 0 && length < 7) {
                AppCompatEditText appCompatEditText14 = this.I;
                if (appCompatEditText14 == null) {
                    l.v("numberEt");
                    appCompatEditText14 = null;
                }
                appCompatEditText14.setError(t1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
                AppCompatEditText appCompatEditText15 = this.I;
                if (appCompatEditText15 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText15;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (obj.length() > 10) {
                AppCompatEditText appCompatEditText16 = this.I;
                if (appCompatEditText16 == null) {
                    l.v("numberEt");
                    appCompatEditText16 = null;
                }
                appCompatEditText16.setError(t1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                AppCompatEditText appCompatEditText17 = this.I;
                if (appCompatEditText17 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText17;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (!new f("[a-zA-Z0-9]*").a(obj)) {
                AppCompatEditText appCompatEditText18 = this.I;
                if (appCompatEditText18 == null) {
                    l.v("numberEt");
                    appCompatEditText18 = null;
                }
                appCompatEditText18.setError(t1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                AppCompatEditText appCompatEditText19 = this.I;
                if (appCompatEditText19 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText19;
                }
                appCompatEditText2.requestFocus();
                return true;
            }
        } else if (l.a(this.S, "DL")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText20 = this.I;
                if (appCompatEditText20 == null) {
                    l.v("numberEt");
                    appCompatEditText20 = null;
                }
                appCompatEditText20.setError(t1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                AppCompatEditText appCompatEditText21 = this.I;
                if (appCompatEditText21 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText21;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (obj.length() < 10) {
                AppCompatEditText appCompatEditText22 = this.I;
                if (appCompatEditText22 == null) {
                    l.v("numberEt");
                    appCompatEditText22 = null;
                }
                appCompatEditText22.setError(t1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                AppCompatEditText appCompatEditText23 = this.I;
                if (appCompatEditText23 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText23;
                }
                appCompatEditText2.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void q1() {
        if (D1()) {
            u1();
        } else {
            J1(this, t1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        }
    }

    /* access modifiers changed from: private */
    public final void r1() {
        AppCompatTextView appCompatTextView = null;
        if (this.T.size() == 0) {
            AppCompatTextView appCompatTextView2 = this.O;
            if (appCompatTextView2 == null) {
                l.v("noChallanFoundTv");
                appCompatTextView2 = null;
            }
            appCompatTextView2.setVisibility(0);
            RecyclerView recyclerView = this.L;
            if (recyclerView == null) {
                l.v("challanList");
                recyclerView = null;
            }
            recyclerView.setVisibility(8);
            AppCompatTextView appCompatTextView3 = this.K;
            if (appCompatTextView3 == null) {
                l.v("totalChallan");
            } else {
                appCompatTextView = appCompatTextView3;
            }
            appCompatTextView.setVisibility(8);
            return;
        }
        AppCompatTextView appCompatTextView4 = this.O;
        if (appCompatTextView4 == null) {
            l.v("noChallanFoundTv");
            appCompatTextView4 = null;
        }
        appCompatTextView4.setVisibility(8);
        RecyclerView recyclerView2 = this.L;
        if (recyclerView2 == null) {
            l.v("challanList");
            recyclerView2 = null;
        }
        recyclerView2.setVisibility(0);
        AppCompatTextView appCompatTextView5 = this.K;
        if (appCompatTextView5 == null) {
            l.v("totalChallan");
        } else {
            appCompatTextView = appCompatTextView5;
        }
        appCompatTextView.setVisibility(0);
    }

    private final void u1() {
        ProgressBar progressBar = null;
        try {
            ProgressBar progressBar2 = this.N;
            if (progressBar2 == null) {
                l.v("progressBar");
                progressBar2 = null;
            }
            progressBar2.setVisibility(0);
            jb.c cVar = this.Z;
            if (cVar == null) {
                l.v("viewModel");
                cVar = null;
            }
            cVar.s(this.S, this.R, 1, 2);
        } catch (Exception e10) {
            e10.printStackTrace();
            ProgressBar progressBar3 = this.N;
            if (progressBar3 == null) {
                l.v("progressBar");
                progressBar3 = null;
            }
            if (progressBar3.getVisibility() == 0) {
                ProgressBar progressBar4 = this.N;
                if (progressBar4 == null) {
                    l.v("progressBar");
                } else {
                    progressBar = progressBar4;
                }
                progressBar.setVisibility(8);
            }
            this.T.clear();
            r1();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x019c, code lost:
        if (r0 == null) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01dc, code lost:
        if (r0 == null) goto L_0x019e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void x1() {
        /*
            r11 = this;
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            jb.b r1 = new jb.b
            jb.a r2 = new jb.a
            com.nic.mparivahan.Echallan.Networking.SearchChallanService r3 = r11.Y
            r4 = 0
            if (r3 != 0) goto L_0x0011
            java.lang.String r3 = "retrofitService"
            cm.l.v(r3)
            r3 = r4
        L_0x0011:
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>((androidx.lifecycle.x0) r11, (androidx.lifecycle.u0.b) r1)
            java.lang.Class<jb.c> r1 = jb.c.class
            androidx.lifecycle.t0 r0 = r0.a(r1)
            jb.c r0 = (jb.c) r0
            r11.Z = r0
            r0 = 2131363686(0x7f0a0766, float:1.8347188E38)
            android.view.View r0 = r11.findViewById(r0)
            java.lang.String r1 = "findViewById(...)"
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r11.G = r0
            r0 = 2131363855(0x7f0a080f, float:1.834753E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r11.H = r0
            r0 = 2131363867(0x7f0a081b, float:1.8347555E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatEditText r0 = (androidx.appcompat.widget.AppCompatEditText) r0
            r11.I = r0
            java.lang.String r2 = "numberEt"
            if (r0 != 0) goto L_0x0058
            cm.l.v(r2)
            r0 = r4
        L_0x0058:
            java.lang.String r3 = r11.X
            android.text.method.DigitsKeyListener r3 = android.text.method.DigitsKeyListener.getInstance(r3)
            r0.setKeyListener(r3)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x0069
            cm.l.v(r2)
            r0 = r4
        L_0x0069:
            r3 = 4096(0x1000, float:5.74E-42)
            r0.setRawInputType(r3)
            r0 = 2131363785(0x7f0a07c9, float:1.8347389E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r11.P = r0
            r0 = 2131364461(0x7f0a0a6d, float:1.834876E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            com.nic.mparivahan.MyTextView r0 = (com.nic.mparivahan.MyTextView) r0
            r11.J = r0
            r0 = 2131364888(0x7f0a0c18, float:1.8349626E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            r11.K = r0
            r0 = 2131362253(0x7f0a01cd, float:1.8344281E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r11.L = r0
            java.lang.String r3 = "challanList"
            if (r0 != 0) goto L_0x00ae
            cm.l.v(r3)
            r0 = r4
        L_0x00ae:
            r5 = 0
            r0.setNestedScrollingEnabled(r5)
            r0 = 2131364160(0x7f0a0940, float:1.834815E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r11.N = r0
            r0 = 2131363798(0x7f0a07d6, float:1.8347415E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            r11.O = r0
            ni.k9 r0 = r11.f8897a0
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "binding"
            cm.l.v(r0)
            r0 = r4
        L_0x00d8:
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f27129g
            ld.c r1 = r11.t1()
            java.lang.String r6 = "label_verify_payment_status"
            java.lang.String r7 = "Verify Payment Status"
            java.lang.String r1 = r1.b(r6, r7)
            r0.setText(r1)
            android.widget.RelativeLayout r0 = r11.P
            if (r0 != 0) goto L_0x00f3
            java.lang.String r0 = "nexGenHolder"
            cm.l.v(r0)
            r0 = r4
        L_0x00f3:
            cb.r3 r1 = new cb.r3
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            java.lang.String r0 = r11.S
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x01df
            java.lang.String r0 = r11.S
            java.lang.String r1 = "Challan"
            boolean r1 = cm.l.a(r0, r1)
            java.lang.String r6 = "totalChallan"
            r7 = 1
            if (r1 == 0) goto L_0x0153
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x0118
            cm.l.v(r2)
            r0 = r4
        L_0x0118:
            ld.c r1 = r11.t1()
            r8 = 2132017803(0x7f14028b, float:1.9673895E38)
            java.lang.String r8 = r11.getString(r8)
            java.lang.String r9 = "label_challan_enter_challan_no"
            java.lang.String r1 = r1.b(r9, r8)
            r0.setHint(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x0134
            cm.l.v(r2)
            r0 = r4
        L_0x0134:
            android.text.InputFilter$LengthFilter[] r1 = new android.text.InputFilter.LengthFilter[r7]
            android.text.InputFilter$LengthFilter r7 = new android.text.InputFilter$LengthFilter
            r8 = 30
            r7.<init>(r8)
            r1[r5] = r7
            android.text.InputFilter[] r1 = (android.text.InputFilter[]) r1
            r0.setFilters(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r11.K
            if (r0 != 0) goto L_0x014c
            cm.l.v(r6)
            r0 = r4
        L_0x014c:
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x01df
        L_0x0153:
            java.lang.String r1 = "RC"
            boolean r0 = cm.l.a(r0, r1)
            if (r0 == 0) goto L_0x01a6
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x0163
            cm.l.v(r2)
            r0 = r4
        L_0x0163:
            ld.c r1 = r11.t1()
            r8 = 2132017941(0x7f140315, float:1.9674175E38)
            java.lang.String r8 = r11.getString(r8)
            java.lang.String r9 = "label_challan_enter_vehicle_no"
            java.lang.String r1 = r1.b(r9, r8)
            r0.setHint(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x017f
            cm.l.v(r2)
            r0 = r4
        L_0x017f:
            android.text.InputFilter$LengthFilter[] r1 = new android.text.InputFilter.LengthFilter[r7]
            android.text.InputFilter$LengthFilter r7 = new android.text.InputFilter$LengthFilter
            r8 = 10
            r7.<init>(r8)
            r1[r5] = r7
            android.text.InputFilter[] r1 = (android.text.InputFilter[]) r1
            r0.setFilters(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x0197
            cm.l.v(r2)
            r0 = r4
        L_0x0197:
            r0.setInputType(r5)
            androidx.appcompat.widget.AppCompatTextView r0 = r11.K
            if (r0 != 0) goto L_0x01a2
        L_0x019e:
            cm.l.v(r6)
            r0 = r4
        L_0x01a2:
            r0.setVisibility(r5)
            goto L_0x01df
        L_0x01a6:
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x01ae
            cm.l.v(r2)
            r0 = r4
        L_0x01ae:
            ld.c r1 = r11.t1()
            r8 = 2132017813(0x7f140295, float:1.9673915E38)
            java.lang.String r8 = r11.getString(r8)
            java.lang.String r9 = "label_challan_enter_dl_no"
            java.lang.String r1 = r1.b(r9, r8)
            r0.setHint(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x01ca
            cm.l.v(r2)
            r0 = r4
        L_0x01ca:
            android.text.InputFilter$LengthFilter[] r1 = new android.text.InputFilter.LengthFilter[r7]
            android.text.InputFilter$LengthFilter r7 = new android.text.InputFilter$LengthFilter
            r8 = 16
            r7.<init>(r8)
            r1[r5] = r7
            android.text.InputFilter[] r1 = (android.text.InputFilter[]) r1
            r0.setFilters(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r11.K
            if (r0 != 0) goto L_0x01a2
            goto L_0x019e
        L_0x01df:
            java.lang.String r0 = r11.R
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x01f4
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x01ef
            cm.l.v(r2)
            r0 = r4
        L_0x01ef:
            java.lang.String r1 = r11.R
            r0.setText(r1)
        L_0x01f4:
            androidx.recyclerview.widget.RecyclerView r0 = r11.L
            if (r0 != 0) goto L_0x01fc
            cm.l.v(r3)
            r0 = r4
        L_0x01fc:
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r11)
            r0.setLayoutManager(r1)
            db.o r0 = new db.o
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            java.lang.String r9 = r11.S
            ld.c r10 = r11.t1()
            r5 = r0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r11.M = r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.L
            if (r0 != 0) goto L_0x0221
            cm.l.v(r3)
            r0 = r4
        L_0x0221:
            db.o r1 = r11.M
            if (r1 != 0) goto L_0x022b
            java.lang.String r1 = "adapter"
            cm.l.v(r1)
            r1 = r4
        L_0x022b:
            r0.setAdapter(r1)
            androidx.appcompat.widget.AppCompatImageView r0 = r11.G
            if (r0 != 0) goto L_0x0238
            java.lang.String r0 = "backIv"
            cm.l.v(r0)
            r0 = r4
        L_0x0238:
            cb.s3 r1 = new cb.s3
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            com.nic.mparivahan.MyTextView r0 = r11.J
            if (r0 != 0) goto L_0x024a
            java.lang.String r0 = "searchTv"
            cm.l.v(r0)
            r0 = r4
        L_0x024a:
            cb.t3 r1 = new cb.t3
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x025a
            cm.l.v(r2)
            r0 = r4
        L_0x025a:
            cb.u3 r1 = new cb.u3
            r1.<init>(r11)
            r0.setOnEditorActionListener(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x026a
            cm.l.v(r2)
            goto L_0x026b
        L_0x026a:
            r4 = r0
        L_0x026b:
            android.text.TextWatcher r0 = r11.f8898b0
            r4.addTextChangedListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.VerifyPaymentChallanList.x1():void");
    }

    /* access modifiers changed from: private */
    public static final void y1(VerifyPaymentChallanList verifyPaymentChallanList, View view) {
        l.f(verifyPaymentChallanList, "this$0");
        verifyPaymentChallanList.E1();
    }

    /* access modifiers changed from: private */
    public static final void z1(VerifyPaymentChallanList verifyPaymentChallanList, View view) {
        l.f(verifyPaymentChallanList, "this$0");
        verifyPaymentChallanList.onBackPressed();
    }

    public final boolean C1(String str) {
        l.f(str, "string");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (('A' > charAt || charAt >= '[') && ('a' > charAt || charAt >= '{')) {
                return false;
            }
        }
        return true;
    }

    public final void G1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.U = arrayList;
    }

    public final void H1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void I1(int i10) {
        this.W = i10;
    }

    public final void J1(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(t1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(t1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new v3(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k9 c10 = k9.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.f8897a0 = c10;
        jb.c cVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        H1(new ld.c(this));
        a.C0148a aVar = fb.a.f11584a;
        k9 k9Var = this.f8897a0;
        if (k9Var == null) {
            l.v("binding");
            k9Var = null;
        }
        aVar.l(this, k9Var);
        String stringExtra = getIntent().getStringExtra("inputValue");
        l.c(stringExtra);
        this.R = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("inputType");
        l.c(stringExtra2);
        this.S = stringExtra2;
        this.Y = SearchChallanService.f8750a.d(this);
        x1();
        q1();
        jb.c cVar2 = this.Z;
        if (cVar2 == null) {
            l.v("viewModel");
            cVar2 = null;
        }
        cVar2.u().g(this, new d(new b(this)));
        jb.c cVar3 = this.Z;
        if (cVar3 == null) {
            l.v("viewModel");
        } else {
            cVar = cVar3;
        }
        cVar.t().g(this, new d(new c(this)));
    }

    public final ArrayList s1() {
        return this.U;
    }

    public final ld.c t1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final ArrayList v1() {
        return this.T;
    }

    public final int w1() {
        return this.V;
    }
}
