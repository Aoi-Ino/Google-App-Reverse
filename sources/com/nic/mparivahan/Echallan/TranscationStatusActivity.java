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
import cb.b3;
import cm.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Model.SearchChallanModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import db.m;
import fb.a;
import java.util.ArrayList;
import java.util.List;
import km.f;
import ni.qa;
import pl.x;

public final class TranscationStatusActivity extends androidx.appcompat.app.d {
    private String G = "";
    private String H = "";
    private RelativeLayout I;
    private AppCompatImageView J;
    /* access modifiers changed from: private */
    public AppCompatEditText K;
    private MyTextView L;
    /* access modifiers changed from: private */
    public ProgressBar M;
    private RecyclerView N;
    private ArrayList O = new ArrayList();
    private m P;
    private final String Q = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    /* access modifiers changed from: private */
    public AppCompatTextView R;
    private AppCompatTextView S;
    private qa T;
    private SearchChallanService U;
    private jb.c V;
    public ld.c W;
    private final TextWatcher X = new a(this);

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TranscationStatusActivity f8864e;

        a(TranscationStatusActivity transcationStatusActivity) {
            this.f8864e = transcationStatusActivity;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                AppCompatEditText l12 = this.f8864e.K;
                if (l12 == null) {
                    l.v("numberEt");
                    l12 = null;
                }
                l12.setError((CharSequence) null);
            }
        }
    }

    static final class b extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TranscationStatusActivity f8865e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TranscationStatusActivity transcationStatusActivity) {
            super(1);
            this.f8865e = transcationStatusActivity;
        }

        public final void b(SearchChallanModel searchChallanModel) {
            TranscationStatusActivity transcationStatusActivity;
            AppCompatTextView appCompatTextView;
            String str;
            ProgressBar progressBar = null;
            try {
                if (p.o(searchChallanModel.getStatus(), "200", true)) {
                    this.f8865e.D1(searchChallanModel.getResult());
                    if (this.f8865e.r1().size() > 1) {
                        appCompatTextView = this.f8865e.R;
                        if (appCompatTextView == null) {
                            l.v("totalChallan");
                            appCompatTextView = null;
                        }
                        str = this.f8865e.t1().b("label_challan_totals", this.f8865e.getString(R.string.total_challans)) + ' ' + this.f8865e.r1().size();
                    } else if (this.f8865e.r1().size() == 0) {
                        AppCompatTextView n12 = this.f8865e.R;
                        if (n12 == null) {
                            l.v("totalChallan");
                            n12 = null;
                        }
                        str = this.f8865e.t1().b("label_challan_total", this.f8865e.getString(R.string.total_challan)) + " 0";
                    } else {
                        AppCompatTextView n13 = this.f8865e.R;
                        if (n13 == null) {
                            l.v("totalChallan");
                            n13 = null;
                        }
                        str = this.f8865e.t1().b("label_challan_total", this.f8865e.getString(R.string.total_challan)) + ' ' + this.f8865e.r1().size();
                    }
                    appCompatTextView.setText(str);
                    TranscationStatusActivity transcationStatusActivity2 = this.f8865e;
                    transcationStatusActivity2.C1(transcationStatusActivity2.r1());
                    ProgressBar m12 = this.f8865e.M;
                    if (m12 == null) {
                        l.v("progressBar");
                        m12 = null;
                    }
                    if (m12.getVisibility() == 0) {
                        ProgressBar m13 = this.f8865e.M;
                        if (m13 == null) {
                            l.v("progressBar");
                            m13 = null;
                        }
                        m13.setVisibility(8);
                    }
                    transcationStatusActivity = this.f8865e;
                } else if (l.a(searchChallanModel.getStatus(), "404")) {
                    ProgressBar m14 = this.f8865e.M;
                    if (m14 == null) {
                        l.v("progressBar");
                        m14 = null;
                    }
                    if (m14.getVisibility() == 0) {
                        ProgressBar m15 = this.f8865e.M;
                        if (m15 == null) {
                            l.v("progressBar");
                            m15 = null;
                        }
                        m15.setVisibility(8);
                    }
                    this.f8865e.q1();
                    TranscationStatusActivity transcationStatusActivity3 = this.f8865e;
                    transcationStatusActivity3.F1(transcationStatusActivity3, searchChallanModel.getMessage());
                    return;
                } else {
                    ProgressBar m16 = this.f8865e.M;
                    if (m16 == null) {
                        l.v("progressBar");
                        m16 = null;
                    }
                    if (m16.getVisibility() == 0) {
                        ProgressBar m17 = this.f8865e.M;
                        if (m17 == null) {
                            l.v("progressBar");
                            m17 = null;
                        }
                        m17.setVisibility(8);
                    }
                    transcationStatusActivity = this.f8865e;
                }
                transcationStatusActivity.q1();
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressBar m18 = this.f8865e.M;
                if (m18 == null) {
                    l.v("progressBar");
                    m18 = null;
                }
                if (m18.getVisibility() == 0) {
                    ProgressBar m19 = this.f8865e.M;
                    if (m19 == null) {
                        l.v("progressBar");
                    } else {
                        progressBar = m19;
                    }
                    progressBar.setVisibility(8);
                }
                this.f8865e.q1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SearchChallanModel) obj);
            return x.f30437a;
        }
    }

    static final class c extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TranscationStatusActivity f8866e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TranscationStatusActivity transcationStatusActivity) {
            super(1);
            this.f8866e = transcationStatusActivity;
        }

        public final void b(String str) {
            ProgressBar m12 = this.f8866e.M;
            ProgressBar progressBar = null;
            if (m12 == null) {
                l.v("progressBar");
                m12 = null;
            }
            if (m12.getVisibility() == 0) {
                ProgressBar m13 = this.f8866e.M;
                if (m13 == null) {
                    l.v("progressBar");
                } else {
                    progressBar = m13;
                }
                progressBar.setVisibility(8);
            }
            this.f8866e.q1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8867a;

        d(bm.l lVar) {
            l.f(lVar, "function");
            this.f8867a = lVar;
        }

        public final pl.c a() {
            return this.f8867a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8867a.invoke(obj);
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

    private final boolean A1() {
        Object systemService = getSystemService("connectivity");
        l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    private final void B1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void C1(List list) {
        m mVar = this.P;
        if (mVar == null) {
            l.v("adapter");
            mVar = null;
        }
        mVar.A(list);
        mVar.j();
    }

    /* access modifiers changed from: private */
    public static final void G1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final boolean H1() {
        String str;
        AppCompatEditText appCompatEditText = this.K;
        AppCompatEditText appCompatEditText2 = null;
        if (appCompatEditText == null) {
            l.v("numberEt");
            appCompatEditText = null;
        }
        String obj = q.B0(String.valueOf(appCompatEditText.getText())).toString();
        char[] charArray = obj.toCharArray();
        l.e(charArray, "this as java.lang.String).toCharArray()");
        if (obj.length() > 0) {
            AppCompatEditText appCompatEditText3 = this.K;
            if (appCompatEditText3 == null) {
                l.v("numberEt");
                appCompatEditText3 = null;
            }
            str = q.B0(String.valueOf(appCompatEditText3.getText())).toString().substring(0, 2);
            l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        if (l.a(this.H, "Challan")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText4 = this.K;
                if (appCompatEditText4 == null) {
                    l.v("numberEt");
                    appCompatEditText4 = null;
                }
                appCompatEditText4.setError(t1().b("label_challan_please_enter_challan_no", getString(R.string.please_enter_challan_no)));
                AppCompatEditText appCompatEditText5 = this.K;
                if (appCompatEditText5 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText5;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (!z1(str)) {
                AppCompatEditText appCompatEditText6 = this.K;
                if (appCompatEditText6 == null) {
                    l.v("numberEt");
                    appCompatEditText6 = null;
                }
                appCompatEditText6.setError(t1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
                AppCompatEditText appCompatEditText7 = this.K;
                if (appCompatEditText7 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText7;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (obj.length() < 12) {
                AppCompatEditText appCompatEditText8 = this.K;
                if (appCompatEditText8 == null) {
                    l.v("numberEt");
                    appCompatEditText8 = null;
                }
                appCompatEditText8.setError(t1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
                AppCompatEditText appCompatEditText9 = this.K;
                if (appCompatEditText9 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText9;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (obj.length() > 30) {
                AppCompatEditText appCompatEditText10 = this.K;
                if (appCompatEditText10 == null) {
                    l.v("numberEt");
                    appCompatEditText10 = null;
                }
                appCompatEditText10.setError(t1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                AppCompatEditText appCompatEditText11 = this.K;
                if (appCompatEditText11 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText11;
                }
                appCompatEditText2.requestFocus();
                return true;
            }
        } else if (l.a(this.H, "RC")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText12 = this.K;
                if (appCompatEditText12 == null) {
                    l.v("numberEt");
                    appCompatEditText12 = null;
                }
                appCompatEditText12.setError(t1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
                AppCompatEditText appCompatEditText13 = this.K;
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
                AppCompatEditText appCompatEditText14 = this.K;
                if (appCompatEditText14 == null) {
                    l.v("numberEt");
                    appCompatEditText14 = null;
                }
                appCompatEditText14.setError(t1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
                AppCompatEditText appCompatEditText15 = this.K;
                if (appCompatEditText15 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText15;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (obj.length() > 10) {
                AppCompatEditText appCompatEditText16 = this.K;
                if (appCompatEditText16 == null) {
                    l.v("numberEt");
                    appCompatEditText16 = null;
                }
                appCompatEditText16.setError(t1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                AppCompatEditText appCompatEditText17 = this.K;
                if (appCompatEditText17 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText17;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (!new f("[a-zA-Z0-9]*").a(obj)) {
                AppCompatEditText appCompatEditText18 = this.K;
                if (appCompatEditText18 == null) {
                    l.v("numberEt");
                    appCompatEditText18 = null;
                }
                appCompatEditText18.setError(t1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                AppCompatEditText appCompatEditText19 = this.K;
                if (appCompatEditText19 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText19;
                }
                appCompatEditText2.requestFocus();
                return true;
            }
        } else if (l.a(this.H, "DL")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText20 = this.K;
                if (appCompatEditText20 == null) {
                    l.v("numberEt");
                    appCompatEditText20 = null;
                }
                appCompatEditText20.setError(t1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                AppCompatEditText appCompatEditText21 = this.K;
                if (appCompatEditText21 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText21;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (obj.length() < 10) {
                AppCompatEditText appCompatEditText22 = this.K;
                if (appCompatEditText22 == null) {
                    l.v("numberEt");
                    appCompatEditText22 = null;
                }
                appCompatEditText22.setError(t1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                AppCompatEditText appCompatEditText23 = this.K;
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

    private final void p1() {
        if (A1()) {
            s1();
        } else {
            F1(this, t1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        }
    }

    /* access modifiers changed from: private */
    public final void q1() {
        AppCompatTextView appCompatTextView = null;
        if (this.O.size() == 0) {
            AppCompatTextView appCompatTextView2 = this.S;
            if (appCompatTextView2 == null) {
                l.v("noChallanFoundTv");
                appCompatTextView2 = null;
            }
            appCompatTextView2.setVisibility(0);
            RecyclerView recyclerView = this.N;
            if (recyclerView == null) {
                l.v("transactionStatusRv");
                recyclerView = null;
            }
            recyclerView.setVisibility(8);
            AppCompatTextView appCompatTextView3 = this.R;
            if (appCompatTextView3 == null) {
                l.v("totalChallan");
            } else {
                appCompatTextView = appCompatTextView3;
            }
            appCompatTextView.setVisibility(8);
            return;
        }
        AppCompatTextView appCompatTextView4 = this.S;
        if (appCompatTextView4 == null) {
            l.v("noChallanFoundTv");
            appCompatTextView4 = null;
        }
        appCompatTextView4.setVisibility(8);
        RecyclerView recyclerView2 = this.N;
        if (recyclerView2 == null) {
            l.v("transactionStatusRv");
            recyclerView2 = null;
        }
        recyclerView2.setVisibility(0);
        AppCompatTextView appCompatTextView5 = this.R;
        if (appCompatTextView5 == null) {
            l.v("totalChallan");
        } else {
            appCompatTextView = appCompatTextView5;
        }
        appCompatTextView.setVisibility(0);
    }

    private final void s1() {
        ProgressBar progressBar = null;
        try {
            ProgressBar progressBar2 = this.M;
            if (progressBar2 == null) {
                l.v("progressBar");
                progressBar2 = null;
            }
            progressBar2.setVisibility(0);
            jb.c cVar = this.V;
            if (cVar == null) {
                l.v("viewModel");
                cVar = null;
            }
            cVar.g(this.H, this.G, 1);
        } catch (Exception e10) {
            e10.printStackTrace();
            ProgressBar progressBar3 = this.M;
            if (progressBar3 == null) {
                l.v("progressBar");
                progressBar3 = null;
            }
            if (progressBar3.getVisibility() == 0) {
                ProgressBar progressBar4 = this.M;
                if (progressBar4 == null) {
                    l.v("progressBar");
                } else {
                    progressBar = progressBar4;
                }
                progressBar.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0171, code lost:
        if (r0 == null) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01b1, code lost:
        if (r0 == null) goto L_0x0173;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void u1() {
        /*
            r9 = this;
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            jb.b r1 = new jb.b
            jb.a r2 = new jb.a
            com.nic.mparivahan.Echallan.Networking.SearchChallanService r3 = r9.U
            r4 = 0
            if (r3 != 0) goto L_0x0011
            java.lang.String r3 = "retrofitService"
            cm.l.v(r3)
            r3 = r4
        L_0x0011:
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>((androidx.lifecycle.x0) r9, (androidx.lifecycle.u0.b) r1)
            java.lang.Class<jb.c> r1 = jb.c.class
            androidx.lifecycle.t0 r0 = r0.a(r1)
            jb.c r0 = (jb.c) r0
            r9.V = r0
            r0 = 2131363686(0x7f0a0766, float:1.8347188E38)
            android.view.View r0 = r9.findViewById(r0)
            java.lang.String r1 = "findViewById(...)"
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            r9.J = r0
            r0 = 2131363867(0x7f0a081b, float:1.8347555E38)
            android.view.View r0 = r9.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatEditText r0 = (androidx.appcompat.widget.AppCompatEditText) r0
            r9.K = r0
            r0 = 2131364461(0x7f0a0a6d, float:1.834876E38)
            android.view.View r0 = r9.findViewById(r0)
            cm.l.e(r0, r1)
            com.nic.mparivahan.MyTextView r0 = (com.nic.mparivahan.MyTextView) r0
            r9.L = r0
            r0 = 2131364948(0x7f0a0c54, float:1.8349747E38)
            android.view.View r0 = r9.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r9.N = r0
            r0 = 2131364160(0x7f0a0940, float:1.834815E38)
            android.view.View r0 = r9.findViewById(r0)
            cm.l.e(r0, r1)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r9.M = r0
            r0 = 2131363785(0x7f0a07c9, float:1.8347389E38)
            android.view.View r0 = r9.findViewById(r0)
            cm.l.e(r0, r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r9.I = r0
            androidx.appcompat.widget.AppCompatImageView r0 = r9.J
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "backIv"
            cm.l.v(r0)
            r0 = r4
        L_0x0084:
            cb.x2 r2 = new cb.x2
            r2.<init>(r9)
            r0.setOnClickListener(r2)
            r0 = 2131364888(0x7f0a0c18, float:1.8349626E38)
            android.view.View r0 = r9.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            r9.R = r0
            r0 = 2131363798(0x7f0a07d6, float:1.8347415E38)
            android.view.View r0 = r9.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            r9.S = r0
            androidx.appcompat.widget.AppCompatEditText r0 = r9.K
            java.lang.String r1 = "numberEt"
            if (r0 != 0) goto L_0x00b2
            cm.l.v(r1)
            r0 = r4
        L_0x00b2:
            java.lang.String r2 = r9.Q
            android.text.method.DigitsKeyListener r2 = android.text.method.DigitsKeyListener.getInstance(r2)
            r0.setKeyListener(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r9.K
            if (r0 != 0) goto L_0x00c3
            cm.l.v(r1)
            r0 = r4
        L_0x00c3:
            r2 = 4096(0x1000, float:5.74E-42)
            r0.setRawInputType(r2)
            android.widget.RelativeLayout r0 = r9.I
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = "nexGenHolder"
            cm.l.v(r0)
            r0 = r4
        L_0x00d2:
            cb.y2 r2 = new cb.y2
            r2.<init>(r9)
            r0.setOnClickListener(r2)
            java.lang.String r0 = r9.H
            int r0 = r0.length()
            r2 = 0
            if (r0 <= 0) goto L_0x01b4
            java.lang.String r0 = r9.H
            java.lang.String r3 = "Challan"
            boolean r3 = cm.l.a(r0, r3)
            r5 = 1
            java.lang.String r6 = "totalChallan"
            if (r3 == 0) goto L_0x0133
            androidx.appcompat.widget.AppCompatEditText r0 = r9.K
            if (r0 != 0) goto L_0x00f8
            cm.l.v(r1)
            r0 = r4
        L_0x00f8:
            ld.c r3 = r9.t1()
            r7 = 2132017803(0x7f14028b, float:1.9673895E38)
            java.lang.String r7 = r9.getString(r7)
            java.lang.String r8 = "label_challan_enter_challan_no"
            java.lang.String r3 = r3.b(r8, r7)
            r0.setHint(r3)
            androidx.appcompat.widget.AppCompatTextView r0 = r9.R
            if (r0 != 0) goto L_0x0114
            cm.l.v(r6)
            r0 = r4
        L_0x0114:
            r3 = 8
            r0.setVisibility(r3)
            androidx.appcompat.widget.AppCompatEditText r0 = r9.K
            if (r0 != 0) goto L_0x0121
            cm.l.v(r1)
            r0 = r4
        L_0x0121:
            android.text.InputFilter$LengthFilter[] r3 = new android.text.InputFilter.LengthFilter[r5]
            android.text.InputFilter$LengthFilter r5 = new android.text.InputFilter$LengthFilter
            r6 = 30
            r5.<init>(r6)
            r3[r2] = r5
            android.text.InputFilter[] r3 = (android.text.InputFilter[]) r3
            r0.setFilters(r3)
            goto L_0x01b4
        L_0x0133:
            java.lang.String r3 = "RC"
            boolean r0 = cm.l.a(r0, r3)
            if (r0 == 0) goto L_0x017b
            androidx.appcompat.widget.AppCompatEditText r0 = r9.K
            if (r0 != 0) goto L_0x0143
            cm.l.v(r1)
            r0 = r4
        L_0x0143:
            ld.c r3 = r9.t1()
            r7 = 2132017941(0x7f140315, float:1.9674175E38)
            java.lang.String r7 = r9.getString(r7)
            java.lang.String r8 = "label_challan_enter_vehicle_no"
            java.lang.String r3 = r3.b(r8, r7)
            r0.setHint(r3)
            androidx.appcompat.widget.AppCompatEditText r0 = r9.K
            if (r0 != 0) goto L_0x015f
            cm.l.v(r1)
            r0 = r4
        L_0x015f:
            android.text.InputFilter$LengthFilter[] r3 = new android.text.InputFilter.LengthFilter[r5]
            android.text.InputFilter$LengthFilter r5 = new android.text.InputFilter$LengthFilter
            r7 = 10
            r5.<init>(r7)
            r3[r2] = r5
            android.text.InputFilter[] r3 = (android.text.InputFilter[]) r3
            r0.setFilters(r3)
            androidx.appcompat.widget.AppCompatTextView r0 = r9.R
            if (r0 != 0) goto L_0x0177
        L_0x0173:
            cm.l.v(r6)
            r0 = r4
        L_0x0177:
            r0.setVisibility(r2)
            goto L_0x01b4
        L_0x017b:
            androidx.appcompat.widget.AppCompatEditText r0 = r9.K
            if (r0 != 0) goto L_0x0183
            cm.l.v(r1)
            r0 = r4
        L_0x0183:
            ld.c r3 = r9.t1()
            r7 = 2132017813(0x7f140295, float:1.9673915E38)
            java.lang.String r7 = r9.getString(r7)
            java.lang.String r8 = "label_challan_enter_dl_no"
            java.lang.String r3 = r3.b(r8, r7)
            r0.setHint(r3)
            androidx.appcompat.widget.AppCompatEditText r0 = r9.K
            if (r0 != 0) goto L_0x019f
            cm.l.v(r1)
            r0 = r4
        L_0x019f:
            android.text.InputFilter$LengthFilter[] r3 = new android.text.InputFilter.LengthFilter[r5]
            android.text.InputFilter$LengthFilter r5 = new android.text.InputFilter$LengthFilter
            r7 = 16
            r5.<init>(r7)
            r3[r2] = r5
            android.text.InputFilter[] r3 = (android.text.InputFilter[]) r3
            r0.setFilters(r3)
            androidx.appcompat.widget.AppCompatTextView r0 = r9.R
            if (r0 != 0) goto L_0x0177
            goto L_0x0173
        L_0x01b4:
            java.lang.String r0 = r9.G
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x01c9
            androidx.appcompat.widget.AppCompatEditText r0 = r9.K
            if (r0 != 0) goto L_0x01c4
            cm.l.v(r1)
            r0 = r4
        L_0x01c4:
            java.lang.String r3 = r9.G
            r0.setText(r3)
        L_0x01c9:
            androidx.recyclerview.widget.RecyclerView r0 = r9.N
            java.lang.String r3 = "transactionStatusRv"
            if (r0 != 0) goto L_0x01d3
            cm.l.v(r3)
            r0 = r4
        L_0x01d3:
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            r5.<init>(r9)
            r0.setLayoutManager(r5)
            db.m r0 = new db.m
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            ld.c r6 = r9.t1()
            r0.<init>(r9, r5, r6)
            r9.P = r0
            androidx.recyclerview.widget.RecyclerView r0 = r9.N
            if (r0 != 0) goto L_0x01f3
            cm.l.v(r3)
            r0 = r4
        L_0x01f3:
            r0.setNestedScrollingEnabled(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r9.N
            if (r0 != 0) goto L_0x01fe
            cm.l.v(r3)
            r0 = r4
        L_0x01fe:
            db.m r2 = r9.P
            if (r2 != 0) goto L_0x0208
            java.lang.String r2 = "adapter"
            cm.l.v(r2)
            r2 = r4
        L_0x0208:
            r0.setAdapter(r2)
            com.nic.mparivahan.MyTextView r0 = r9.L
            if (r0 != 0) goto L_0x0215
            java.lang.String r0 = "searchTv"
            cm.l.v(r0)
            r0 = r4
        L_0x0215:
            cb.z2 r2 = new cb.z2
            r2.<init>(r9)
            r0.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r9.K
            if (r0 != 0) goto L_0x0225
            cm.l.v(r1)
            r0 = r4
        L_0x0225:
            cb.a3 r2 = new cb.a3
            r2.<init>(r9)
            r0.setOnEditorActionListener(r2)
            androidx.appcompat.widget.AppCompatEditText r0 = r9.K
            if (r0 != 0) goto L_0x0235
            cm.l.v(r1)
            goto L_0x0236
        L_0x0235:
            r4 = r0
        L_0x0236:
            android.text.TextWatcher r0 = r9.X
            r4.addTextChangedListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.TranscationStatusActivity.u1():void");
    }

    /* access modifiers changed from: private */
    public static final void v1(TranscationStatusActivity transcationStatusActivity, View view) {
        l.f(transcationStatusActivity, "this$0");
        transcationStatusActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void w1(TranscationStatusActivity transcationStatusActivity, View view) {
        l.f(transcationStatusActivity, "this$0");
        transcationStatusActivity.B1();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        if (r5 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r5 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (r5 == null) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void x1(com.nic.mparivahan.Echallan.TranscationStatusActivity r5, android.view.View r6) {
        /*
            java.lang.String r6 = "this$0"
            cm.l.f(r5, r6)
            androidx.appcompat.widget.AppCompatEditText r6 = r5.K
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
            boolean r2 = r5.H1()
            if (r2 != 0) goto L_0x0031
            r5.G = r6
            java.util.ArrayList r6 = r5.O
            r6.clear()
            r5.p1()
            return
        L_0x0031:
            java.lang.String r6 = r5.H
            java.lang.String r2 = "Challan"
            boolean r2 = cm.l.a(r6, r2)
            if (r2 == 0) goto L_0x0064
            androidx.appcompat.widget.AppCompatEditText r6 = r5.K
            if (r6 != 0) goto L_0x0043
            cm.l.v(r1)
            r6 = r0
        L_0x0043:
            ld.c r2 = r5.t1()
            r3 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_please_enter_challan_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.K
            if (r5 != 0) goto L_0x005f
        L_0x005b:
            cm.l.v(r1)
            goto L_0x0060
        L_0x005f:
            r0 = r5
        L_0x0060:
            r0.requestFocus()
            goto L_0x00ae
        L_0x0064:
            java.lang.String r2 = "RC"
            boolean r6 = cm.l.a(r6, r2)
            if (r6 == 0) goto L_0x008d
            androidx.appcompat.widget.AppCompatEditText r6 = r5.K
            if (r6 != 0) goto L_0x0074
            cm.l.v(r1)
            r6 = r0
        L_0x0074:
            ld.c r2 = r5.t1()
            r3 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_please_enter_vehicle_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.K
            if (r5 != 0) goto L_0x005f
            goto L_0x005b
        L_0x008d:
            androidx.appcompat.widget.AppCompatEditText r6 = r5.K
            if (r6 != 0) goto L_0x0095
            cm.l.v(r1)
            r6 = r0
        L_0x0095:
            ld.c r2 = r5.t1()
            r3 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_valid_dl_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.K
            if (r5 != 0) goto L_0x005f
            goto L_0x005b
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.TranscationStatusActivity.x1(com.nic.mparivahan.Echallan.TranscationStatusActivity, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r4 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        if (r4 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00af, code lost:
        if (r4 == null) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean y1(com.nic.mparivahan.Echallan.TranscationStatusActivity r4, android.widget.TextView r5, int r6, android.view.KeyEvent r7) {
        /*
            java.lang.String r5 = "this$0"
            cm.l.f(r4, r5)
            r5 = 6
            if (r6 != r5) goto L_0x00b3
            androidx.appcompat.widget.AppCompatEditText r5 = r4.K
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
            boolean r0 = r4.H1()
            r1 = 1
            if (r0 != 0) goto L_0x0035
            r4.G = r5
            java.util.ArrayList r5 = r4.O
            r5.clear()
            r4.p1()
            return r1
        L_0x0035:
            java.lang.String r5 = r4.H
            java.lang.String r0 = "Challan"
            boolean r0 = cm.l.a(r5, r0)
            if (r0 == 0) goto L_0x0068
            androidx.appcompat.widget.AppCompatEditText r5 = r4.K
            if (r5 != 0) goto L_0x0047
            cm.l.v(r7)
            r5 = r6
        L_0x0047:
            ld.c r0 = r4.t1()
            r2 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "label_challan_please_enter_challan_no"
            java.lang.String r0 = r0.b(r3, r2)
            r5.setError(r0)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.K
            if (r4 != 0) goto L_0x0063
        L_0x005f:
            cm.l.v(r7)
            goto L_0x0064
        L_0x0063:
            r6 = r4
        L_0x0064:
            r6.requestFocus()
            goto L_0x00b2
        L_0x0068:
            java.lang.String r0 = "RC"
            boolean r5 = cm.l.a(r5, r0)
            if (r5 == 0) goto L_0x0091
            androidx.appcompat.widget.AppCompatEditText r5 = r4.K
            if (r5 != 0) goto L_0x0078
            cm.l.v(r7)
            r5 = r6
        L_0x0078:
            ld.c r0 = r4.t1()
            r2 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "label_challan_please_enter_vehicle_no"
            java.lang.String r0 = r0.b(r3, r2)
            r5.setError(r0)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.K
            if (r4 != 0) goto L_0x0063
            goto L_0x005f
        L_0x0091:
            androidx.appcompat.widget.AppCompatEditText r5 = r4.K
            if (r5 != 0) goto L_0x0099
            cm.l.v(r7)
            r5 = r6
        L_0x0099:
            ld.c r0 = r4.t1()
            r2 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "label_challan_valid_dl_no"
            java.lang.String r0 = r0.b(r3, r2)
            r5.setError(r0)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.K
            if (r4 != 0) goto L_0x0063
            goto L_0x005f
        L_0x00b2:
            return r1
        L_0x00b3:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.TranscationStatusActivity.y1(com.nic.mparivahan.Echallan.TranscationStatusActivity, android.widget.TextView, int, android.view.KeyEvent):boolean");
    }

    public final void D1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.O = arrayList;
    }

    public final void E1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.W = cVar;
    }

    public final void F1(Context context, String str) {
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
        textView.setOnClickListener(new b3(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qa c10 = qa.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.T = c10;
        jb.c cVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        E1(new ld.c(this));
        a.C0148a aVar = fb.a.f11584a;
        qa qaVar = this.T;
        if (qaVar == null) {
            l.v("binding");
            qaVar = null;
        }
        aVar.k(this, qaVar);
        String stringExtra = getIntent().getStringExtra("inputValue");
        l.c(stringExtra);
        this.G = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("inputType");
        l.c(stringExtra2);
        this.H = stringExtra2;
        this.U = SearchChallanService.f8750a.d(this);
        u1();
        p1();
        jb.c cVar2 = this.V;
        if (cVar2 == null) {
            l.v("viewModel");
            cVar2 = null;
        }
        cVar2.i().g(this, new d(new b(this)));
        jb.c cVar3 = this.V;
        if (cVar3 == null) {
            l.v("viewModel");
        } else {
            cVar = cVar3;
        }
        cVar.h().g(this, new d(new c(this)));
    }

    public final ArrayList r1() {
        return this.O;
    }

    public final ld.c t1() {
        ld.c cVar = this.W;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final boolean z1(String str) {
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
}
