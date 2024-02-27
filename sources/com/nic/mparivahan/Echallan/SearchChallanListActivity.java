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
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.RecyclerView;
import cb.n1;
import cb.o1;
import cm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Model.SearchChallanModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import fb.a;
import java.util.ArrayList;
import java.util.List;
import ni.wc;
import pl.x;

public final class SearchChallanListActivity extends androidx.appcompat.app.d {
    private AppCompatImageView G;
    private AppCompatImageView H;
    /* access modifiers changed from: private */
    public AppCompatEditText I;
    private MyTextView J;
    /* access modifiers changed from: private */
    public AppCompatTextView K;
    private RecyclerView L;
    private db.h M;
    /* access modifiers changed from: private */
    public ProgressBar N;
    private AppCompatTextView O;
    private AppCompatTextView P;
    private AppCompatTextView Q;
    private LinearLayout R;
    private AppCompatTextView S;
    private NestedScrollView T;
    private RelativeLayout U;
    private String V = "";
    private String W = "";
    private ArrayList X = new ArrayList();
    private ArrayList Y = new ArrayList();
    private ArrayList Z = new ArrayList();

    /* renamed from: a0  reason: collision with root package name */
    private int f8816a0;

    /* renamed from: b0  reason: collision with root package name */
    private int f8817b0;

    /* renamed from: c0  reason: collision with root package name */
    private int f8818c0;

    /* renamed from: d0  reason: collision with root package name */
    private int f8819d0;

    /* renamed from: e0  reason: collision with root package name */
    private final String f8820e0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* renamed from: f0  reason: collision with root package name */
    private int f8821f0 = 1;

    /* renamed from: g0  reason: collision with root package name */
    private int f8822g0 = 1;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f8823h0;

    /* renamed from: i0  reason: collision with root package name */
    private wc f8824i0;

    /* renamed from: j0  reason: collision with root package name */
    public ld.c f8825j0;

    /* renamed from: k0  reason: collision with root package name */
    private SearchChallanService f8826k0;

    /* renamed from: l0  reason: collision with root package name */
    private jb.c f8827l0;

    /* renamed from: m0  reason: collision with root package name */
    private final TextWatcher f8828m0 = new a(this);

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchChallanListActivity f8829e;

        a(SearchChallanListActivity searchChallanListActivity) {
            this.f8829e = searchChallanListActivity;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                AppCompatEditText q12 = this.f8829e.I;
                if (q12 == null) {
                    l.v("numberEt");
                    q12 = null;
                }
                q12.setError((CharSequence) null);
            }
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchChallanListActivity f8830e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SearchChallanListActivity searchChallanListActivity) {
            super(1);
            this.f8830e = searchChallanListActivity;
        }

        public final void b(SearchChallanModel searchChallanModel) {
            SearchChallanListActivity searchChallanListActivity;
            String message;
            AppCompatTextView appCompatTextView;
            String str;
            ProgressBar progressBar = null;
            try {
                l.c(searchChallanModel);
                if (p.o(searchChallanModel.getStatus(), "200", true)) {
                    this.f8830e.e2(searchChallanModel.getResult());
                    this.f8830e.d2(searchChallanModel.getTotalChallan());
                    if (searchChallanModel.getTotalChallan() > 20) {
                        this.f8830e.f2(searchChallanModel.getTotalChallan() / this.f8830e.H1().size());
                    }
                    if (this.f8830e.I1() == 1) {
                        if (this.f8830e.G1() > 1) {
                            appCompatTextView = this.f8830e.K;
                            if (appCompatTextView == null) {
                                l.v("totalChallan");
                                appCompatTextView = null;
                            }
                            str = this.f8830e.D1().b("label_challan_totals", this.f8830e.getString(R.string.total_challans)) + ' ' + this.f8830e.G1();
                        } else if (this.f8830e.G1() == 0) {
                            AppCompatTextView s12 = this.f8830e.K;
                            if (s12 == null) {
                                l.v("totalChallan");
                                s12 = null;
                            }
                            str = this.f8830e.D1().b("label_challan_total", this.f8830e.getString(R.string.total_challan)) + " 0";
                        } else {
                            AppCompatTextView s13 = this.f8830e.K;
                            if (s13 == null) {
                                l.v("totalChallan");
                                s13 = null;
                            }
                            str = this.f8830e.D1().b("label_challan_total", this.f8830e.getString(R.string.total_challan)) + ' ' + this.f8830e.G1();
                        }
                        appCompatTextView.setText(str);
                        if (this.f8830e.E1() == 1) {
                            SearchChallanListActivity searchChallanListActivity2 = this.f8830e;
                            searchChallanListActivity2.W1(searchChallanListActivity2.H1());
                        } else {
                            SearchChallanListActivity searchChallanListActivity3 = this.f8830e;
                            searchChallanListActivity3.u1(searchChallanListActivity3.H1());
                        }
                    }
                    if (this.f8830e.I1() == 1) {
                        this.f8830e.w1();
                    }
                    ProgressBar r12 = this.f8830e.N;
                    if (r12 == null) {
                        l.v("progressBar");
                        r12 = null;
                    }
                    if (r12.getVisibility() == 0) {
                        ProgressBar r13 = this.f8830e.N;
                        if (r13 == null) {
                            l.v("progressBar");
                            r13 = null;
                        }
                        r13.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (l.a(searchChallanModel.getStatus(), "Failed")) {
                    ProgressBar r14 = this.f8830e.N;
                    if (r14 == null) {
                        l.v("progressBar");
                        r14 = null;
                    }
                    if (r14.getVisibility() == 0) {
                        ProgressBar r15 = this.f8830e.N;
                        if (r15 == null) {
                            l.v("progressBar");
                            r15 = null;
                        }
                        r15.setVisibility(8);
                    }
                    this.f8830e.H1().clear();
                    if (this.f8830e.I1() == 1) {
                        this.f8830e.w1();
                        searchChallanListActivity = this.f8830e;
                        message = searchChallanModel.getMessage();
                    } else {
                        return;
                    }
                } else if (l.a(searchChallanModel.getStatus(), "404")) {
                    ProgressBar r16 = this.f8830e.N;
                    if (r16 == null) {
                        l.v("progressBar");
                        r16 = null;
                    }
                    if (r16.getVisibility() == 0) {
                        ProgressBar r17 = this.f8830e.N;
                        if (r17 == null) {
                            l.v("progressBar");
                            r17 = null;
                        }
                        r17.setVisibility(8);
                    }
                    this.f8830e.H1().clear();
                    if (this.f8830e.I1() == 1) {
                        this.f8830e.w1();
                        searchChallanListActivity = this.f8830e;
                        message = searchChallanModel.getMessage();
                    } else {
                        return;
                    }
                } else {
                    ProgressBar r18 = this.f8830e.N;
                    if (r18 == null) {
                        l.v("progressBar");
                        r18 = null;
                    }
                    if (r18.getVisibility() == 0) {
                        ProgressBar r19 = this.f8830e.N;
                        if (r19 == null) {
                            l.v("progressBar");
                            r19 = null;
                        }
                        r19.setVisibility(8);
                    }
                    this.f8830e.H1().clear();
                    if (this.f8830e.I1() == 1) {
                        this.f8830e.w1();
                        SearchChallanListActivity searchChallanListActivity4 = this.f8830e;
                        searchChallanListActivity4.g2(searchChallanListActivity4, searchChallanListActivity4.D1().b("error_msg_record_not_found", this.f8830e.getString(R.string.service_unavable_please_try)));
                        return;
                    }
                    return;
                }
                searchChallanListActivity.g2(searchChallanListActivity, message);
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressBar r110 = this.f8830e.N;
                if (r110 == null) {
                    l.v("progressBar");
                    r110 = null;
                }
                if (r110.getVisibility() == 0) {
                    ProgressBar r111 = this.f8830e.N;
                    if (r111 == null) {
                        l.v("progressBar");
                    } else {
                        progressBar = r111;
                    }
                    progressBar.setVisibility(8);
                }
                this.f8830e.H1().clear();
                if (this.f8830e.I1() == 1) {
                    this.f8830e.w1();
                    SearchChallanListActivity searchChallanListActivity5 = this.f8830e;
                    searchChallanListActivity5.g2(searchChallanListActivity5, searchChallanListActivity5.D1().b("error_msg_record_not_found", this.f8830e.getString(R.string.service_unavable_please_try)));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SearchChallanModel) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchChallanListActivity f8831e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchChallanListActivity searchChallanListActivity) {
            super(1);
            this.f8831e = searchChallanListActivity;
        }

        public final void b(String str) {
            ProgressBar r12 = this.f8831e.N;
            ProgressBar progressBar = null;
            if (r12 == null) {
                l.v("progressBar");
                r12 = null;
            }
            if (r12.getVisibility() == 0) {
                ProgressBar r13 = this.f8831e.N;
                if (r13 == null) {
                    l.v("progressBar");
                } else {
                    progressBar = r13;
                }
                progressBar.setVisibility(8);
            }
            this.f8831e.H1().clear();
            if (this.f8831e.I1() == 1) {
                this.f8831e.w1();
                SearchChallanListActivity searchChallanListActivity = this.f8831e;
                searchChallanListActivity.g2(searchChallanListActivity, searchChallanListActivity.D1().b("error_msg_record_not_found", this.f8831e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchChallanListActivity f8832e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SearchChallanListActivity searchChallanListActivity) {
            super(1);
            this.f8832e = searchChallanListActivity;
        }

        public final void b(SearchChallanModel searchChallanModel) {
            SearchChallanListActivity searchChallanListActivity;
            AppCompatTextView appCompatTextView;
            String str;
            ProgressBar progressBar = null;
            try {
                l.c(searchChallanModel);
                if (p.o(searchChallanModel.getStatus(), "200", true)) {
                    this.f8832e.X1(searchChallanModel.getResult());
                    this.f8832e.Y1(searchChallanModel.getTotalChallan());
                    if (searchChallanModel.getTotalChallan() > 20) {
                        this.f8832e.f2(searchChallanModel.getTotalChallan() / this.f8832e.x1().size());
                    }
                    if (this.f8832e.I1() == 0) {
                        if (this.f8832e.z1() > 1) {
                            appCompatTextView = this.f8832e.K;
                            if (appCompatTextView == null) {
                                l.v("totalChallan");
                                appCompatTextView = null;
                            }
                            str = this.f8832e.D1().b("label_challan_totals", this.f8832e.getString(R.string.total_challans)) + ' ' + this.f8832e.z1();
                        } else if (this.f8832e.z1() == 0) {
                            AppCompatTextView s12 = this.f8832e.K;
                            if (s12 == null) {
                                l.v("totalChallan");
                                s12 = null;
                            }
                            str = this.f8832e.D1().b("label_challan_total", this.f8832e.getString(R.string.total_challan)) + " 0";
                        } else {
                            AppCompatTextView s13 = this.f8832e.K;
                            if (s13 == null) {
                                l.v("totalChallan");
                                s13 = null;
                            }
                            str = this.f8832e.D1().b("label_challan_total", this.f8832e.getString(R.string.total_challan)) + ' ' + this.f8832e.z1();
                        }
                        appCompatTextView.setText(str);
                        if (this.f8832e.E1() == 1) {
                            SearchChallanListActivity searchChallanListActivity2 = this.f8832e;
                            searchChallanListActivity2.W1(searchChallanListActivity2.x1());
                        } else {
                            SearchChallanListActivity searchChallanListActivity3 = this.f8832e;
                            searchChallanListActivity3.u1(searchChallanListActivity3.x1());
                        }
                    }
                    this.f8832e.c2(false);
                    ProgressBar r12 = this.f8832e.N;
                    if (r12 == null) {
                        l.v("progressBar");
                        r12 = null;
                    }
                    if (r12.getVisibility() == 0) {
                        ProgressBar r13 = this.f8832e.N;
                        if (r13 == null) {
                            l.v("progressBar");
                            r13 = null;
                        }
                        r13.setVisibility(8);
                    }
                    if (this.f8832e.I1() == 0) {
                        searchChallanListActivity = this.f8832e;
                    } else {
                        return;
                    }
                } else if (l.a(searchChallanModel.getStatus(), "Failed")) {
                    ProgressBar r14 = this.f8832e.N;
                    if (r14 == null) {
                        l.v("progressBar");
                        r14 = null;
                    }
                    if (r14.getVisibility() == 0) {
                        ProgressBar r15 = this.f8832e.N;
                        if (r15 == null) {
                            l.v("progressBar");
                            r15 = null;
                        }
                        r15.setVisibility(8);
                    }
                    this.f8832e.x1().clear();
                    if (this.f8832e.I1() == 0) {
                        SearchChallanListActivity searchChallanListActivity4 = this.f8832e;
                        searchChallanListActivity4.g2(searchChallanListActivity4, searchChallanModel.getMessage());
                        searchChallanListActivity = this.f8832e;
                    } else {
                        return;
                    }
                } else if (l.a(searchChallanModel.getStatus(), "404")) {
                    ProgressBar r16 = this.f8832e.N;
                    if (r16 == null) {
                        l.v("progressBar");
                        r16 = null;
                    }
                    if (r16.getVisibility() == 0) {
                        ProgressBar r17 = this.f8832e.N;
                        if (r17 == null) {
                            l.v("progressBar");
                            r17 = null;
                        }
                        r17.setVisibility(8);
                    }
                    this.f8832e.x1().clear();
                    if (this.f8832e.I1() == 0) {
                        this.f8832e.w1();
                        SearchChallanListActivity searchChallanListActivity5 = this.f8832e;
                        searchChallanListActivity5.g2(searchChallanListActivity5, searchChallanModel.getMessage());
                        return;
                    }
                    return;
                } else {
                    ProgressBar r18 = this.f8832e.N;
                    if (r18 == null) {
                        l.v("progressBar");
                        r18 = null;
                    }
                    if (r18.getVisibility() == 0) {
                        ProgressBar r19 = this.f8832e.N;
                        if (r19 == null) {
                            l.v("progressBar");
                            r19 = null;
                        }
                        r19.setVisibility(8);
                    }
                    this.f8832e.x1().clear();
                    if (this.f8832e.I1() == 0) {
                        this.f8832e.w1();
                        SearchChallanListActivity searchChallanListActivity6 = this.f8832e;
                        searchChallanListActivity6.g2(searchChallanListActivity6, searchChallanListActivity6.D1().b("error_msg_record_not_found", this.f8832e.getString(R.string.service_unavable_please_try)));
                        return;
                    }
                    return;
                }
                searchChallanListActivity.w1();
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressBar r110 = this.f8832e.N;
                if (r110 == null) {
                    l.v("progressBar");
                    r110 = null;
                }
                if (r110.getVisibility() == 0) {
                    ProgressBar r111 = this.f8832e.N;
                    if (r111 == null) {
                        l.v("progressBar");
                    } else {
                        progressBar = r111;
                    }
                    progressBar.setVisibility(8);
                }
                this.f8832e.x1().clear();
                if (this.f8832e.I1() == 0) {
                    this.f8832e.w1();
                    SearchChallanListActivity searchChallanListActivity7 = this.f8832e;
                    searchChallanListActivity7.g2(searchChallanListActivity7, searchChallanListActivity7.D1().b("error_msg_record_not_found", this.f8832e.getString(R.string.service_unavable_please_try)));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SearchChallanModel) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchChallanListActivity f8833e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SearchChallanListActivity searchChallanListActivity) {
            super(1);
            this.f8833e = searchChallanListActivity;
        }

        public final void b(String str) {
            ProgressBar r12 = this.f8833e.N;
            ProgressBar progressBar = null;
            if (r12 == null) {
                l.v("progressBar");
                r12 = null;
            }
            if (r12.getVisibility() == 0) {
                ProgressBar r13 = this.f8833e.N;
                if (r13 == null) {
                    l.v("progressBar");
                } else {
                    progressBar = r13;
                }
                progressBar.setVisibility(8);
            }
            if (this.f8833e.I1() == 0) {
                this.f8833e.w1();
                SearchChallanListActivity searchChallanListActivity = this.f8833e;
                searchChallanListActivity.g2(searchChallanListActivity, searchChallanListActivity.D1().b("error_msg_record_not_found", this.f8833e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchChallanListActivity f8834e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SearchChallanListActivity searchChallanListActivity) {
            super(1);
            this.f8834e = searchChallanListActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0104  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.Echallan.Model.SearchChallanModel r12) {
            /*
                r11 = this;
                cm.l.c(r12)
                java.lang.String r0 = r12.getStatus()
                java.lang.String r1 = "200"
                r2 = 1
                boolean r0 = km.p.o(r0, r1, r2)
                r1 = 8
                r3 = 2
                java.lang.String r4 = "progressBar"
                r5 = 0
                if (r0 == 0) goto L_0x013e
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                java.util.ArrayList r6 = r12.getResult()
                r0.Z1(r6)
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                int r6 = r12.getTotalChallan()
                r0.a2(r6)
                int r0 = r12.getTotalChallan()
                r6 = 20
                if (r0 <= r6) goto L_0x0044
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                int r12 = r12.getTotalChallan()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r6 = r11.f8834e
                java.util.ArrayList r6 = r6.A1()
                int r6 = r6.size()
                int r12 = r12 / r6
                r0.f2(r12)
            L_0x0044:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                int r12 = r12.I1()
                if (r12 != r3) goto L_0x010d
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                int r12 = r12.C1()
                r0 = 32
                java.lang.String r6 = "totalChallan"
                if (r12 <= r2) goto L_0x0095
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                androidx.appcompat.widget.AppCompatTextView r12 = r12.K
                if (r12 != 0) goto L_0x0064
                cm.l.v(r6)
                r12 = r5
            L_0x0064:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r7 = r11.f8834e
                ld.c r7 = r7.D1()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r8 = r11.f8834e
                r9 = 2132019268(0x7f140844, float:1.9676866E38)
                java.lang.String r8 = r8.getString(r9)
                java.lang.String r9 = "label_challan_totals"
                java.lang.String r7 = r7.b(r9, r8)
            L_0x007e:
                r6.append(r7)
                r6.append(r0)
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                int r0 = r0.C1()
                r6.append(r0)
                java.lang.String r0 = r6.toString()
            L_0x0091:
                r12.setText(r0)
                goto L_0x00f2
            L_0x0095:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                int r12 = r12.C1()
                r7 = 2132019267(0x7f140843, float:1.9676864E38)
                java.lang.String r8 = "label_challan_total"
                if (r12 != 0) goto L_0x00d0
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                androidx.appcompat.widget.AppCompatTextView r12 = r12.K
                if (r12 != 0) goto L_0x00ae
                cm.l.v(r6)
                r12 = r5
            L_0x00ae:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r6 = r11.f8834e
                ld.c r6 = r6.D1()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r9 = r11.f8834e
                java.lang.String r7 = r9.getString(r7)
                java.lang.String r6 = r6.b(r8, r7)
                r0.append(r6)
                java.lang.String r6 = " 0"
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                goto L_0x0091
            L_0x00d0:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                androidx.appcompat.widget.AppCompatTextView r12 = r12.K
                if (r12 != 0) goto L_0x00dc
                cm.l.v(r6)
                r12 = r5
            L_0x00dc:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r9 = r11.f8834e
                ld.c r9 = r9.D1()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r10 = r11.f8834e
                java.lang.String r7 = r10.getString(r7)
                java.lang.String r7 = r9.b(r8, r7)
                goto L_0x007e
            L_0x00f2:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                int r12 = r12.E1()
                if (r12 != r2) goto L_0x0104
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                java.util.ArrayList r0 = r12.A1()
                r12.W1(r0)
                goto L_0x010d
            L_0x0104:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                java.util.ArrayList r0 = r12.A1()
                r12.u1(r0)
            L_0x010d:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                android.widget.ProgressBar r12 = r12.N
                if (r12 != 0) goto L_0x0119
                cm.l.v(r4)
                r12 = r5
            L_0x0119:
                int r12 = r12.getVisibility()
                if (r12 != 0) goto L_0x012f
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                android.widget.ProgressBar r12 = r12.N
                if (r12 != 0) goto L_0x012b
                cm.l.v(r4)
                goto L_0x012c
            L_0x012b:
                r5 = r12
            L_0x012c:
                r5.setVisibility(r1)
            L_0x012f:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                int r12 = r12.I1()
                if (r12 != r3) goto L_0x0227
            L_0x0137:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                r12.w1()
                goto L_0x0227
            L_0x013e:
                java.lang.String r0 = r12.getStatus()
                java.lang.String r2 = "Failed"
                boolean r0 = cm.l.a(r0, r2)
                if (r0 == 0) goto L_0x018d
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                android.widget.ProgressBar r0 = r0.N
                if (r0 != 0) goto L_0x0156
                cm.l.v(r4)
                r0 = r5
            L_0x0156:
                int r0 = r0.getVisibility()
                if (r0 != 0) goto L_0x016c
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                android.widget.ProgressBar r0 = r0.N
                if (r0 != 0) goto L_0x0168
                cm.l.v(r4)
                goto L_0x0169
            L_0x0168:
                r5 = r0
            L_0x0169:
                r5.setVisibility(r1)
            L_0x016c:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                java.util.ArrayList r0 = r0.A1()
                r0.clear()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                int r0 = r0.I1()
                if (r0 != r3) goto L_0x0227
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                r0.w1()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                java.lang.String r12 = r12.getMessage()
                r0.g2(r0, r12)
                goto L_0x0227
            L_0x018d:
                java.lang.String r0 = r12.getStatus()
                java.lang.String r2 = "404"
                boolean r0 = cm.l.a(r0, r2)
                if (r0 == 0) goto L_0x01d7
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                android.widget.ProgressBar r0 = r0.N
                if (r0 != 0) goto L_0x01a5
                cm.l.v(r4)
                r0 = r5
            L_0x01a5:
                int r0 = r0.getVisibility()
                if (r0 != 0) goto L_0x01bb
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                android.widget.ProgressBar r0 = r0.N
                if (r0 != 0) goto L_0x01b7
                cm.l.v(r4)
                goto L_0x01b8
            L_0x01b7:
                r5 = r0
            L_0x01b8:
                r5.setVisibility(r1)
            L_0x01bb:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                java.util.ArrayList r0 = r0.A1()
                r0.clear()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                int r0 = r0.I1()
                if (r0 != r3) goto L_0x0227
                com.nic.mparivahan.Echallan.SearchChallanListActivity r0 = r11.f8834e
                java.lang.String r12 = r12.getMessage()
                r0.g2(r0, r12)
                goto L_0x0137
            L_0x01d7:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                android.widget.ProgressBar r12 = r12.N
                if (r12 != 0) goto L_0x01e3
                cm.l.v(r4)
                r12 = r5
            L_0x01e3:
                int r12 = r12.getVisibility()
                if (r12 != 0) goto L_0x01f9
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                android.widget.ProgressBar r12 = r12.N
                if (r12 != 0) goto L_0x01f5
                cm.l.v(r4)
                goto L_0x01f6
            L_0x01f5:
                r5 = r12
            L_0x01f6:
                r5.setVisibility(r1)
            L_0x01f9:
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                java.util.ArrayList r12 = r12.A1()
                r12.clear()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                int r12 = r12.I1()
                if (r12 != r3) goto L_0x0227
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                r12.w1()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r12 = r11.f8834e
                ld.c r0 = r12.D1()
                com.nic.mparivahan.Echallan.SearchChallanListActivity r1 = r11.f8834e
                r2 = 2132019106(0x7f1407a2, float:1.9676538E38)
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r2 = "error_msg_record_not_found"
                java.lang.String r0 = r0.b(r2, r1)
                r12.g2(r12, r0)
            L_0x0227:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchChallanListActivity.f.b(com.nic.mparivahan.Echallan.Model.SearchChallanModel):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SearchChallanModel) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchChallanListActivity f8835e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SearchChallanListActivity searchChallanListActivity) {
            super(1);
            this.f8835e = searchChallanListActivity;
        }

        public final void b(String str) {
            ProgressBar r12 = this.f8835e.N;
            ProgressBar progressBar = null;
            if (r12 == null) {
                l.v("progressBar");
                r12 = null;
            }
            if (r12.getVisibility() == 0) {
                ProgressBar r13 = this.f8835e.N;
                if (r13 == null) {
                    l.v("progressBar");
                } else {
                    progressBar = r13;
                }
                progressBar.setVisibility(8);
            }
            this.f8835e.A1().clear();
            if (this.f8835e.I1() == 2) {
                this.f8835e.w1();
                SearchChallanListActivity searchChallanListActivity = this.f8835e;
                searchChallanListActivity.g2(searchChallanListActivity, searchChallanListActivity.D1().b("error_msg_record_not_found", this.f8835e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8836a;

        h(bm.l lVar) {
            l.f(lVar, "function");
            this.f8836a = lVar;
        }

        public final pl.c a() {
            return this.f8836a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8836a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final void B1() {
        ProgressBar progressBar = null;
        try {
            ProgressBar progressBar2 = this.N;
            if (progressBar2 == null) {
                l.v("progressBar");
                progressBar2 = null;
            }
            progressBar2.setVisibility(0);
            jb.c cVar = this.f8827l0;
            if (cVar == null) {
                l.v("viewModel");
                cVar = null;
            }
            cVar.l(this.W, this.V, 1, 1);
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
        }
    }

    private final void F1() {
        ProgressBar progressBar = null;
        try {
            ProgressBar progressBar2 = this.N;
            if (progressBar2 == null) {
                l.v("progressBar");
                progressBar2 = null;
            }
            progressBar2.setVisibility(0);
            jb.c cVar = this.f8827l0;
            if (cVar == null) {
                l.v("viewModel");
                cVar = null;
            }
            cVar.s(this.W, this.V, 1, 2);
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
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01c2, code lost:
        if (r0 == null) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x020d, code lost:
        if (r0 == null) goto L_0x01c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void J1() {
        /*
            r11 = this;
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            jb.b r1 = new jb.b
            jb.a r2 = new jb.a
            com.nic.mparivahan.Echallan.Networking.SearchChallanService r3 = r11.f8826k0
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
            r11.f8827l0 = r0
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
            java.lang.String r3 = r11.f8820e0
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
            r11.U = r0
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
            r0 = 2131364016(0x7f0a08b0, float:1.8347857E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            r11.O = r0
            r0 = 2131362536(0x7f0a02e8, float:1.8344855E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            r11.P = r0
            r0 = 2131361974(0x7f0a00b6, float:1.8343715E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            r11.Q = r0
            r0 = 2131364727(0x7f0a0b77, float:1.83493E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r11.R = r0
            r0 = 2131363798(0x7f0a07d6, float:1.8347415E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            r11.S = r0
            r0 = 2131363751(0x7f0a07a7, float:1.834732E38)
            android.view.View r0 = r11.findViewById(r0)
            cm.l.e(r0, r1)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r11.T = r0
            java.lang.String r0 = r11.W
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0210
            java.lang.String r0 = r11.W
            java.lang.String r1 = "Challan"
            boolean r1 = cm.l.a(r0, r1)
            java.lang.String r6 = "totalChallan"
            java.lang.String r7 = "tabBarLl"
            r8 = 1
            if (r1 == 0) goto L_0x0179
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x0133
            cm.l.v(r2)
            r0 = r4
        L_0x0133:
            ld.c r1 = r11.D1()
            r9 = 2132017803(0x7f14028b, float:1.9673895E38)
            java.lang.String r9 = r11.getString(r9)
            java.lang.String r10 = "label_challan_enter_challan_no"
            java.lang.String r1 = r1.b(r10, r9)
            r0.setHint(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x014f
            cm.l.v(r2)
            r0 = r4
        L_0x014f:
            android.text.InputFilter$LengthFilter[] r1 = new android.text.InputFilter.LengthFilter[r8]
            android.text.InputFilter$LengthFilter r8 = new android.text.InputFilter$LengthFilter
            r9 = 30
            r8.<init>(r9)
            r1[r5] = r8
            android.text.InputFilter[] r1 = (android.text.InputFilter[]) r1
            r0.setFilters(r1)
            android.widget.LinearLayout r0 = r11.R
            if (r0 != 0) goto L_0x0167
            cm.l.v(r7)
            r0 = r4
        L_0x0167:
            r1 = 8
            r0.setVisibility(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r11.K
            if (r0 != 0) goto L_0x0174
            cm.l.v(r6)
            r0 = r4
        L_0x0174:
            r0.setVisibility(r1)
            goto L_0x0210
        L_0x0179:
            java.lang.String r1 = "RC"
            boolean r0 = cm.l.a(r0, r1)
            if (r0 == 0) goto L_0x01cc
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x0189
            cm.l.v(r2)
            r0 = r4
        L_0x0189:
            ld.c r1 = r11.D1()
            r9 = 2132017941(0x7f140315, float:1.9674175E38)
            java.lang.String r9 = r11.getString(r9)
            java.lang.String r10 = "label_challan_enter_vehicle_no"
            java.lang.String r1 = r1.b(r10, r9)
            r0.setHint(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x01a5
            cm.l.v(r2)
            r0 = r4
        L_0x01a5:
            android.text.InputFilter$LengthFilter[] r1 = new android.text.InputFilter.LengthFilter[r8]
            android.text.InputFilter$LengthFilter r8 = new android.text.InputFilter$LengthFilter
            r9 = 10
            r8.<init>(r9)
            r1[r5] = r8
            android.text.InputFilter[] r1 = (android.text.InputFilter[]) r1
            r0.setFilters(r1)
            android.widget.LinearLayout r0 = r11.R
            if (r0 != 0) goto L_0x01bd
            cm.l.v(r7)
            r0 = r4
        L_0x01bd:
            r0.setVisibility(r5)
            androidx.appcompat.widget.AppCompatTextView r0 = r11.K
            if (r0 != 0) goto L_0x01c8
        L_0x01c4:
            cm.l.v(r6)
            r0 = r4
        L_0x01c8:
            r0.setVisibility(r5)
            goto L_0x0210
        L_0x01cc:
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x01d4
            cm.l.v(r2)
            r0 = r4
        L_0x01d4:
            ld.c r1 = r11.D1()
            r9 = 2132017813(0x7f140295, float:1.9673915E38)
            java.lang.String r9 = r11.getString(r9)
            java.lang.String r10 = "label_challan_enter_dl_no"
            java.lang.String r1 = r1.b(r10, r9)
            r0.setHint(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x01f0
            cm.l.v(r2)
            r0 = r4
        L_0x01f0:
            android.text.InputFilter$LengthFilter[] r1 = new android.text.InputFilter.LengthFilter[r8]
            android.text.InputFilter$LengthFilter r8 = new android.text.InputFilter$LengthFilter
            r9 = 16
            r8.<init>(r9)
            r1[r5] = r8
            android.text.InputFilter[] r1 = (android.text.InputFilter[]) r1
            r0.setFilters(r1)
            android.widget.LinearLayout r0 = r11.R
            if (r0 != 0) goto L_0x0208
            cm.l.v(r7)
            r0 = r4
        L_0x0208:
            r0.setVisibility(r5)
            androidx.appcompat.widget.AppCompatTextView r0 = r11.K
            if (r0 != 0) goto L_0x01c8
            goto L_0x01c4
        L_0x0210:
            java.lang.String r0 = r11.V
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0225
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x0220
            cm.l.v(r2)
            r0 = r4
        L_0x0220:
            java.lang.String r1 = r11.V
            r0.setText(r1)
        L_0x0225:
            androidx.recyclerview.widget.RecyclerView r0 = r11.L
            if (r0 != 0) goto L_0x022d
            cm.l.v(r3)
            r0 = r4
        L_0x022d:
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r11)
            r0.setLayoutManager(r1)
            db.h r0 = new db.h
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            java.lang.String r9 = r11.W
            ld.c r10 = r11.D1()
            r5 = r0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r11.M = r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.L
            if (r0 != 0) goto L_0x0252
            cm.l.v(r3)
            r0 = r4
        L_0x0252:
            db.h r1 = r11.M
            if (r1 != 0) goto L_0x025c
            java.lang.String r1 = "adapter"
            cm.l.v(r1)
            r1 = r4
        L_0x025c:
            r0.setAdapter(r1)
            androidx.appcompat.widget.AppCompatImageView r0 = r11.G
            if (r0 != 0) goto L_0x0269
            java.lang.String r0 = "backIv"
            cm.l.v(r0)
            r0 = r4
        L_0x0269:
            cb.g1 r1 = new cb.g1
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            android.widget.RelativeLayout r0 = r11.U
            if (r0 != 0) goto L_0x027b
            java.lang.String r0 = "nexGenHolder"
            cm.l.v(r0)
            r0 = r4
        L_0x027b:
            cb.h1 r1 = new cb.h1
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r11.Q
            if (r0 != 0) goto L_0x028d
            java.lang.String r0 = "allChallan"
            cm.l.v(r0)
            r0 = r4
        L_0x028d:
            cb.i1 r1 = new cb.i1
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r11.O
            if (r0 != 0) goto L_0x029f
            java.lang.String r0 = "pendingChallan"
            cm.l.v(r0)
            r0 = r4
        L_0x029f:
            cb.j1 r1 = new cb.j1
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r11.P
            if (r0 != 0) goto L_0x02b1
            java.lang.String r0 = "disposeChallan"
            cm.l.v(r0)
            r0 = r4
        L_0x02b1:
            cb.k1 r1 = new cb.k1
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            com.nic.mparivahan.MyTextView r0 = r11.J
            if (r0 != 0) goto L_0x02c3
            java.lang.String r0 = "searchTv"
            cm.l.v(r0)
            r0 = r4
        L_0x02c3:
            cb.l1 r1 = new cb.l1
            r1.<init>(r11)
            r0.setOnClickListener(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x02d3
            cm.l.v(r2)
            r0 = r4
        L_0x02d3:
            cb.m1 r1 = new cb.m1
            r1.<init>(r11)
            r0.setOnEditorActionListener(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r11.I
            if (r0 != 0) goto L_0x02e3
            cm.l.v(r2)
            goto L_0x02e4
        L_0x02e3:
            r4 = r0
        L_0x02e4:
            android.text.TextWatcher r0 = r11.f8828m0
            r4.addTextChangedListener(r0)
            r11.T1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchChallanListActivity.J1():void");
    }

    /* access modifiers changed from: private */
    public static final void K1(SearchChallanListActivity searchChallanListActivity, View view) {
        l.f(searchChallanListActivity, "this$0");
        searchChallanListActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void L1(SearchChallanListActivity searchChallanListActivity, View view) {
        l.f(searchChallanListActivity, "this$0");
        searchChallanListActivity.V1();
    }

    /* access modifiers changed from: private */
    public static final void M1(SearchChallanListActivity searchChallanListActivity, View view) {
        AppCompatTextView appCompatTextView;
        String str;
        l.f(searchChallanListActivity, "this$0");
        searchChallanListActivity.f8816a0 = 0;
        searchChallanListActivity.f8821f0 = 1;
        searchChallanListActivity.f8822g0 = 1;
        AppCompatTextView appCompatTextView2 = searchChallanListActivity.Q;
        RecyclerView recyclerView = null;
        if (appCompatTextView2 == null) {
            l.v("allChallan");
            appCompatTextView2 = null;
        }
        appCompatTextView2.setBackground(androidx.core.content.a.e(searchChallanListActivity, R.drawable.rectangle_bg_15_with_two_corner));
        AppCompatTextView appCompatTextView3 = searchChallanListActivity.O;
        if (appCompatTextView3 == null) {
            l.v("pendingChallan");
            appCompatTextView3 = null;
        }
        appCompatTextView3.setBackground(androidx.core.content.a.e(searchChallanListActivity, R.drawable.rectanlge_without_corner_unselected));
        AppCompatTextView appCompatTextView4 = searchChallanListActivity.P;
        if (appCompatTextView4 == null) {
            l.v("disposeChallan");
            appCompatTextView4 = null;
        }
        appCompatTextView4.setBackground(androidx.core.content.a.e(searchChallanListActivity, R.drawable.rectangle_bg_two_corner_right));
        AppCompatTextView appCompatTextView5 = searchChallanListActivity.Q;
        if (appCompatTextView5 == null) {
            l.v("allChallan");
            appCompatTextView5 = null;
        }
        appCompatTextView5.setTextColor(androidx.core.content.a.c(searchChallanListActivity, R.color.white));
        AppCompatTextView appCompatTextView6 = searchChallanListActivity.P;
        if (appCompatTextView6 == null) {
            l.v("disposeChallan");
            appCompatTextView6 = null;
        }
        appCompatTextView6.setTextColor(androidx.core.content.a.c(searchChallanListActivity, R.color.dove_grey));
        AppCompatTextView appCompatTextView7 = searchChallanListActivity.O;
        if (appCompatTextView7 == null) {
            l.v("pendingChallan");
            appCompatTextView7 = null;
        }
        appCompatTextView7.setTextColor(androidx.core.content.a.c(searchChallanListActivity, R.color.dove_grey));
        int i10 = searchChallanListActivity.f8817b0;
        if (i10 > 1) {
            AppCompatTextView appCompatTextView8 = searchChallanListActivity.K;
            if (appCompatTextView8 == null) {
                l.v("totalChallan");
                appCompatTextView8 = null;
            }
            appCompatTextView8.setText(searchChallanListActivity.D1().b("label_challan_totals", searchChallanListActivity.getString(R.string.total_challans)) + ' ' + searchChallanListActivity.f8817b0);
        } else {
            if (i10 == 0) {
                appCompatTextView = searchChallanListActivity.K;
                if (appCompatTextView == null) {
                    l.v("totalChallan");
                    appCompatTextView = null;
                }
                str = searchChallanListActivity.D1().b("label_challan_total", searchChallanListActivity.getString(R.string.total_challan)) + " 0";
            } else {
                AppCompatTextView appCompatTextView9 = searchChallanListActivity.K;
                if (appCompatTextView9 == null) {
                    l.v("totalChallan");
                    appCompatTextView9 = null;
                }
                str = searchChallanListActivity.D1().b("label_challan_total", searchChallanListActivity.getString(R.string.total_challan)) + ' ' + searchChallanListActivity.f8817b0;
            }
            appCompatTextView.setText(str);
        }
        searchChallanListActivity.W1(searchChallanListActivity.Z);
        RecyclerView recyclerView2 = searchChallanListActivity.L;
        if (recyclerView2 == null) {
            l.v("challanList");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.r1(0);
        searchChallanListActivity.T1();
    }

    /* access modifiers changed from: private */
    public static final void N1(SearchChallanListActivity searchChallanListActivity, View view) {
        AppCompatTextView appCompatTextView;
        String str;
        l.f(searchChallanListActivity, "this$0");
        searchChallanListActivity.f8816a0 = 1;
        searchChallanListActivity.f8821f0 = 1;
        searchChallanListActivity.f8822g0 = 1;
        AppCompatTextView appCompatTextView2 = searchChallanListActivity.Q;
        RecyclerView recyclerView = null;
        if (appCompatTextView2 == null) {
            l.v("allChallan");
            appCompatTextView2 = null;
        }
        appCompatTextView2.setBackground(androidx.core.content.a.e(searchChallanListActivity, R.drawable.rectangle_bg_two_corner_left_crystal_white));
        AppCompatTextView appCompatTextView3 = searchChallanListActivity.O;
        if (appCompatTextView3 == null) {
            l.v("pendingChallan");
            appCompatTextView3 = null;
        }
        appCompatTextView3.setBackground(androidx.core.content.a.e(searchChallanListActivity, R.drawable.rectangle_without_corner_selected));
        AppCompatTextView appCompatTextView4 = searchChallanListActivity.P;
        if (appCompatTextView4 == null) {
            l.v("disposeChallan");
            appCompatTextView4 = null;
        }
        appCompatTextView4.setBackground(androidx.core.content.a.e(searchChallanListActivity, R.drawable.rectangle_bg_two_corner_right));
        AppCompatTextView appCompatTextView5 = searchChallanListActivity.O;
        if (appCompatTextView5 == null) {
            l.v("pendingChallan");
            appCompatTextView5 = null;
        }
        appCompatTextView5.setTextColor(androidx.core.content.a.c(searchChallanListActivity, R.color.white));
        AppCompatTextView appCompatTextView6 = searchChallanListActivity.P;
        if (appCompatTextView6 == null) {
            l.v("disposeChallan");
            appCompatTextView6 = null;
        }
        appCompatTextView6.setTextColor(androidx.core.content.a.c(searchChallanListActivity, R.color.dove_grey));
        AppCompatTextView appCompatTextView7 = searchChallanListActivity.Q;
        if (appCompatTextView7 == null) {
            l.v("allChallan");
            appCompatTextView7 = null;
        }
        appCompatTextView7.setTextColor(androidx.core.content.a.c(searchChallanListActivity, R.color.dove_grey));
        int i10 = searchChallanListActivity.f8818c0;
        if (i10 > 1) {
            AppCompatTextView appCompatTextView8 = searchChallanListActivity.K;
            if (appCompatTextView8 == null) {
                l.v("totalChallan");
                appCompatTextView8 = null;
            }
            appCompatTextView8.setText(searchChallanListActivity.D1().b("label_challan_totals", searchChallanListActivity.getString(R.string.total_challans)) + ' ' + searchChallanListActivity.f8818c0);
        } else {
            if (i10 == 0) {
                appCompatTextView = searchChallanListActivity.K;
                if (appCompatTextView == null) {
                    l.v("totalChallan");
                    appCompatTextView = null;
                }
                str = searchChallanListActivity.D1().b("label_challan_total", searchChallanListActivity.getString(R.string.total_challan)) + " 0";
            } else {
                AppCompatTextView appCompatTextView9 = searchChallanListActivity.K;
                if (appCompatTextView9 == null) {
                    l.v("totalChallan");
                    appCompatTextView9 = null;
                }
                str = searchChallanListActivity.D1().b("label_challan_total", searchChallanListActivity.getString(R.string.total_challan)) + ' ' + searchChallanListActivity.f8818c0;
            }
            appCompatTextView.setText(str);
        }
        searchChallanListActivity.W1(searchChallanListActivity.X);
        RecyclerView recyclerView2 = searchChallanListActivity.L;
        if (recyclerView2 == null) {
            l.v("challanList");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.r1(0);
        searchChallanListActivity.T1();
    }

    /* access modifiers changed from: private */
    public static final void O1(SearchChallanListActivity searchChallanListActivity, View view) {
        AppCompatTextView appCompatTextView;
        String str;
        l.f(searchChallanListActivity, "this$0");
        searchChallanListActivity.f8816a0 = 2;
        searchChallanListActivity.f8821f0 = 1;
        searchChallanListActivity.f8822g0 = 1;
        AppCompatTextView appCompatTextView2 = searchChallanListActivity.P;
        RecyclerView recyclerView = null;
        if (appCompatTextView2 == null) {
            l.v("disposeChallan");
            appCompatTextView2 = null;
        }
        appCompatTextView2.setBackground(androidx.core.content.a.e(searchChallanListActivity, R.drawable.rectangle_bg_15_right_dodger_blue));
        AppCompatTextView appCompatTextView3 = searchChallanListActivity.Q;
        if (appCompatTextView3 == null) {
            l.v("allChallan");
            appCompatTextView3 = null;
        }
        appCompatTextView3.setBackground(androidx.core.content.a.e(searchChallanListActivity, R.drawable.rectangle_bg_two_corner_left_crystal_white));
        AppCompatTextView appCompatTextView4 = searchChallanListActivity.O;
        if (appCompatTextView4 == null) {
            l.v("pendingChallan");
            appCompatTextView4 = null;
        }
        appCompatTextView4.setBackground(androidx.core.content.a.e(searchChallanListActivity, R.drawable.rectangle_without_corner_left_unselected));
        AppCompatTextView appCompatTextView5 = searchChallanListActivity.Q;
        if (appCompatTextView5 == null) {
            l.v("allChallan");
            appCompatTextView5 = null;
        }
        appCompatTextView5.setTextColor(androidx.core.content.a.c(searchChallanListActivity, R.color.dove_grey));
        AppCompatTextView appCompatTextView6 = searchChallanListActivity.O;
        if (appCompatTextView6 == null) {
            l.v("pendingChallan");
            appCompatTextView6 = null;
        }
        appCompatTextView6.setTextColor(androidx.core.content.a.c(searchChallanListActivity, R.color.dove_grey));
        AppCompatTextView appCompatTextView7 = searchChallanListActivity.P;
        if (appCompatTextView7 == null) {
            l.v("disposeChallan");
            appCompatTextView7 = null;
        }
        appCompatTextView7.setTextColor(androidx.core.content.a.c(searchChallanListActivity, R.color.white));
        int i10 = searchChallanListActivity.f8819d0;
        if (i10 > 1) {
            AppCompatTextView appCompatTextView8 = searchChallanListActivity.K;
            if (appCompatTextView8 == null) {
                l.v("totalChallan");
                appCompatTextView8 = null;
            }
            appCompatTextView8.setText(searchChallanListActivity.D1().b("label_challan_totals", searchChallanListActivity.getString(R.string.total_challans)) + ' ' + searchChallanListActivity.f8819d0);
        } else {
            if (i10 == 0) {
                appCompatTextView = searchChallanListActivity.K;
                if (appCompatTextView == null) {
                    l.v("totalChallan");
                    appCompatTextView = null;
                }
                str = searchChallanListActivity.D1().b("label_challan_total", searchChallanListActivity.getString(R.string.total_challan)) + " 0";
            } else {
                AppCompatTextView appCompatTextView9 = searchChallanListActivity.K;
                if (appCompatTextView9 == null) {
                    l.v("totalChallan");
                    appCompatTextView9 = null;
                }
                str = searchChallanListActivity.D1().b("label_challan_total", searchChallanListActivity.getString(R.string.total_challan)) + ' ' + searchChallanListActivity.f8819d0;
            }
            appCompatTextView.setText(str);
        }
        searchChallanListActivity.W1(searchChallanListActivity.Y);
        RecyclerView recyclerView2 = searchChallanListActivity.L;
        if (recyclerView2 == null) {
            l.v("challanList");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.r1(0);
        searchChallanListActivity.T1();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        if (r5 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ac, code lost:
        if (r5 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cd, code lost:
        if (r5 == null) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void P1(com.nic.mparivahan.Echallan.SearchChallanListActivity r5, android.view.View r6) {
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
            boolean r2 = r5.i2()
            java.lang.String r3 = "RC"
            if (r2 != 0) goto L_0x0055
            java.lang.String r0 = r5.W
            boolean r0 = cm.l.a(r0, r3)
            if (r0 == 0) goto L_0x0034
            r5.onBackPressed()
            goto L_0x0054
        L_0x0034:
            r5.V = r6
            java.util.ArrayList r6 = r5.Y
            r6.clear()
            java.util.ArrayList r6 = r5.X
            r6.clear()
            java.util.ArrayList r6 = r5.Z
            r6.clear()
            r6 = 1
            r5.f8821f0 = r6
            r5.f8822g0 = r6
            r6 = 0
            r5.f8817b0 = r6
            r5.f8818c0 = r6
            r5.f8819d0 = r6
            r5.v1()
        L_0x0054:
            return
        L_0x0055:
            java.lang.String r6 = r5.W
            java.lang.String r2 = "Challan"
            boolean r2 = cm.l.a(r6, r2)
            if (r2 == 0) goto L_0x0088
            androidx.appcompat.widget.AppCompatEditText r6 = r5.I
            if (r6 != 0) goto L_0x0067
            cm.l.v(r1)
            r6 = r0
        L_0x0067:
            ld.c r2 = r5.D1()
            r3 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_please_enter_challan_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.I
            if (r5 != 0) goto L_0x0083
        L_0x007f:
            cm.l.v(r1)
            goto L_0x0084
        L_0x0083:
            r0 = r5
        L_0x0084:
            r0.requestFocus()
            goto L_0x00d0
        L_0x0088:
            boolean r6 = cm.l.a(r6, r3)
            if (r6 == 0) goto L_0x00af
            androidx.appcompat.widget.AppCompatEditText r6 = r5.I
            if (r6 != 0) goto L_0x0096
            cm.l.v(r1)
            r6 = r0
        L_0x0096:
            ld.c r2 = r5.D1()
            r3 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_please_enter_vehicle_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.I
            if (r5 != 0) goto L_0x0083
            goto L_0x007f
        L_0x00af:
            androidx.appcompat.widget.AppCompatEditText r6 = r5.I
            if (r6 != 0) goto L_0x00b7
            cm.l.v(r1)
            r6 = r0
        L_0x00b7:
            ld.c r2 = r5.D1()
            r3 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_valid_dl_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.I
            if (r5 != 0) goto L_0x0083
            goto L_0x007f
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchChallanListActivity.P1(com.nic.mparivahan.Echallan.SearchChallanListActivity, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (r4 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        if (r4 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d0, code lost:
        if (r4 == null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean Q1(com.nic.mparivahan.Echallan.SearchChallanListActivity r4, android.widget.TextView r5, int r6, android.view.KeyEvent r7) {
        /*
            java.lang.String r5 = "this$0"
            cm.l.f(r4, r5)
            r5 = 6
            r7 = 0
            if (r6 != r5) goto L_0x00d4
            androidx.appcompat.widget.AppCompatEditText r5 = r4.I
            r6 = 0
            java.lang.String r0 = "numberEt"
            if (r5 != 0) goto L_0x0014
            cm.l.v(r0)
            r5 = r6
        L_0x0014:
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.CharSequence r5 = km.q.B0(r5)
            java.lang.String r5 = r5.toString()
            boolean r1 = r4.i2()
            java.lang.String r2 = "RC"
            r3 = 1
            if (r1 != 0) goto L_0x0058
            java.lang.String r6 = r4.W
            boolean r6 = cm.l.a(r6, r2)
            if (r6 == 0) goto L_0x0039
            r4.onBackPressed()
            goto L_0x0057
        L_0x0039:
            r4.V = r5
            java.util.ArrayList r5 = r4.Y
            r5.clear()
            java.util.ArrayList r5 = r4.X
            r5.clear()
            java.util.ArrayList r5 = r4.Z
            r5.clear()
            r4.f8821f0 = r3
            r4.f8822g0 = r3
            r4.f8817b0 = r7
            r4.f8818c0 = r7
            r4.f8819d0 = r7
            r4.v1()
        L_0x0057:
            return r3
        L_0x0058:
            java.lang.String r5 = r4.W
            java.lang.String r7 = "Challan"
            boolean r7 = cm.l.a(r5, r7)
            if (r7 == 0) goto L_0x008b
            androidx.appcompat.widget.AppCompatEditText r5 = r4.I
            if (r5 != 0) goto L_0x006a
            cm.l.v(r0)
            r5 = r6
        L_0x006a:
            ld.c r7 = r4.D1()
            r1 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r2 = "label_challan_please_enter_challan_no"
            java.lang.String r7 = r7.b(r2, r1)
            r5.setError(r7)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.I
            if (r4 != 0) goto L_0x0086
        L_0x0082:
            cm.l.v(r0)
            goto L_0x0087
        L_0x0086:
            r6 = r4
        L_0x0087:
            r6.requestFocus()
            goto L_0x00d3
        L_0x008b:
            boolean r5 = cm.l.a(r5, r2)
            if (r5 == 0) goto L_0x00b2
            androidx.appcompat.widget.AppCompatEditText r5 = r4.I
            if (r5 != 0) goto L_0x0099
            cm.l.v(r0)
            r5 = r6
        L_0x0099:
            ld.c r7 = r4.D1()
            r1 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r2 = "label_challan_please_enter_vehicle_no"
            java.lang.String r7 = r7.b(r2, r1)
            r5.setError(r7)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.I
            if (r4 != 0) goto L_0x0086
            goto L_0x0082
        L_0x00b2:
            androidx.appcompat.widget.AppCompatEditText r5 = r4.I
            if (r5 != 0) goto L_0x00ba
            cm.l.v(r0)
            r5 = r6
        L_0x00ba:
            ld.c r7 = r4.D1()
            r1 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r2 = "label_challan_valid_dl_no"
            java.lang.String r7 = r7.b(r2, r1)
            r5.setError(r7)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.I
            if (r4 != 0) goto L_0x0086
            goto L_0x0082
        L_0x00d3:
            return r3
        L_0x00d4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchChallanListActivity.Q1(com.nic.mparivahan.Echallan.SearchChallanListActivity, android.widget.TextView, int, android.view.KeyEvent):boolean");
    }

    private final boolean R1(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (('A' > charAt || charAt >= '[') && ('a' > charAt || charAt >= '{')) {
                return false;
            }
        }
        return true;
    }

    private final boolean S1() {
        Object systemService = getSystemService("connectivity");
        l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    private final void T1() {
        NestedScrollView nestedScrollView = this.T;
        if (nestedScrollView == null) {
            l.v("nestedScrollView");
            nestedScrollView = null;
        }
        nestedScrollView.setOnScrollChangeListener(new o1(this));
    }

    /* access modifiers changed from: private */
    public static final void U1(SearchChallanListActivity searchChallanListActivity, NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        l.f(searchChallanListActivity, "this$0");
        l.f(nestedScrollView, "v");
        if (i11 == nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) {
            int i14 = searchChallanListActivity.f8821f0 + 1;
            searchChallanListActivity.f8821f0 = i14;
            if (searchChallanListActivity.f8822g0 >= i14) {
                int i15 = searchChallanListActivity.f8816a0;
                if (i15 == 0) {
                    searchChallanListActivity.y1();
                } else if (i15 == 1) {
                    searchChallanListActivity.F1();
                } else if (i15 == 2) {
                    searchChallanListActivity.B1();
                }
            }
        }
    }

    private final void V1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void W1(List list) {
        db.h hVar = this.M;
        if (hVar == null) {
            l.v("adapter");
            hVar = null;
        }
        hVar.B(list);
        hVar.j();
    }

    /* access modifiers changed from: private */
    public static final void h2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final boolean i2() {
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
        if (l.a(this.W, "Challan")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText4 = this.I;
                if (appCompatEditText4 == null) {
                    l.v("numberEt");
                    appCompatEditText4 = null;
                }
                appCompatEditText4.setError(D1().b("label_challan_please_enter_challan_no", getString(R.string.please_enter_challan_no)));
                AppCompatEditText appCompatEditText5 = this.I;
                if (appCompatEditText5 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText5;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (!R1(str)) {
                AppCompatEditText appCompatEditText6 = this.I;
                if (appCompatEditText6 == null) {
                    l.v("numberEt");
                    appCompatEditText6 = null;
                }
                appCompatEditText6.setError(D1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
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
                appCompatEditText8.setError(D1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
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
                appCompatEditText10.setError(D1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                AppCompatEditText appCompatEditText11 = this.I;
                if (appCompatEditText11 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText11;
                }
                appCompatEditText2.requestFocus();
                return true;
            }
        } else if (l.a(this.W, "RC")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText12 = this.I;
                if (appCompatEditText12 == null) {
                    l.v("numberEt");
                    appCompatEditText12 = null;
                }
                appCompatEditText12.setError(D1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
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
                appCompatEditText14.setError(D1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
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
                appCompatEditText16.setError(D1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                AppCompatEditText appCompatEditText17 = this.I;
                if (appCompatEditText17 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText17;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (!new km.f("[a-zA-Z0-9]*").a(obj)) {
                AppCompatEditText appCompatEditText18 = this.I;
                if (appCompatEditText18 == null) {
                    l.v("numberEt");
                    appCompatEditText18 = null;
                }
                appCompatEditText18.setError(D1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                AppCompatEditText appCompatEditText19 = this.I;
                if (appCompatEditText19 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText19;
                }
                appCompatEditText2.requestFocus();
                return true;
            }
        } else if (l.a(this.W, "DL")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText20 = this.I;
                if (appCompatEditText20 == null) {
                    l.v("numberEt");
                    appCompatEditText20 = null;
                }
                appCompatEditText20.setError(D1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
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
                appCompatEditText22.setError(D1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
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

    /* access modifiers changed from: private */
    public final void u1(List list) {
        db.h hVar = this.M;
        if (hVar == null) {
            l.v("adapter");
            hVar = null;
        }
        hVar.C(list);
    }

    private final void v1() {
        if (S1()) {
            if (!l.a(this.W, "Challan")) {
                F1();
                B1();
            }
            y1();
            return;
        }
        g2(this, D1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023c, code lost:
        if (r0 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c9, code lost:
        if (r0 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r0 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        cm.l.v("challanList");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r5.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d7, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011b, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01af, code lost:
        if (r0 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w1() {
        /*
            r15 = this;
            java.lang.String r0 = r15.W
            java.lang.String r1 = "Challan"
            boolean r0 = cm.l.a(r0, r1)
            r1 = 8
            java.lang.String r2 = "challanList"
            r3 = 0
            java.lang.String r4 = "noChallanFoundTv"
            r5 = 0
            if (r0 == 0) goto L_0x004c
            java.util.ArrayList r0 = r15.Z
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0033
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x0022
            cm.l.v(r4)
            r0 = r5
        L_0x0022:
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x002d
        L_0x0029:
            cm.l.v(r2)
            goto L_0x002e
        L_0x002d:
            r5 = r0
        L_0x002e:
            r5.setVisibility(r1)
            goto L_0x02cd
        L_0x0033:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x003b
            cm.l.v(r4)
            r0 = r5
        L_0x003b:
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0046
        L_0x0042:
            cm.l.v(r2)
            goto L_0x0047
        L_0x0046:
            r5 = r0
        L_0x0047:
            r5.setVisibility(r3)
            goto L_0x02cd
        L_0x004c:
            int r0 = r15.f8816a0
            java.lang.String r6 = " 0"
            r7 = 2132019267(0x7f140843, float:1.9676864E38)
            java.lang.String r8 = "label_challan_total"
            java.lang.String r9 = "totalChallan"
            if (r0 != 0) goto L_0x0097
            java.util.ArrayList r0 = r15.Z
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0097
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x0069
            cm.l.v(r9)
            r0 = r5
        L_0x0069:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            ld.c r10 = r15.D1()
            java.lang.String r7 = r15.getString(r7)
            java.lang.String r7 = r10.b(r8, r7)
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r0.setText(r6)
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x008f
            cm.l.v(r4)
            r0 = r5
        L_0x008f:
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x002d
            goto L_0x0029
        L_0x0097:
            int r0 = r15.f8816a0
            r10 = 1
            if (r0 != r10) goto L_0x00db
            java.util.ArrayList r0 = r15.X
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00db
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x00ac
            cm.l.v(r9)
            r0 = r5
        L_0x00ac:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            ld.c r10 = r15.D1()
            java.lang.String r7 = r15.getString(r7)
            java.lang.String r7 = r10.b(r8, r7)
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r0.setText(r6)
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x00d2
            cm.l.v(r4)
            r0 = r5
        L_0x00d2:
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x002d
            goto L_0x0029
        L_0x00db:
            int r0 = r15.f8816a0
            r11 = 2
            if (r0 != r11) goto L_0x011f
            java.util.ArrayList r0 = r15.Y
            int r0 = r0.size()
            if (r0 != 0) goto L_0x011f
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x00f0
            cm.l.v(r9)
            r0 = r5
        L_0x00f0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            ld.c r10 = r15.D1()
            java.lang.String r7 = r15.getString(r7)
            java.lang.String r7 = r10.b(r8, r7)
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r0.setText(r6)
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x0116
            cm.l.v(r4)
            r0 = r5
        L_0x0116:
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x002d
            goto L_0x0029
        L_0x011f:
            int r0 = r15.f8816a0
            r12 = 2132019268(0x7f140844, float:1.9676866E38)
            java.lang.String r13 = "label_challan_totals"
            r14 = 32
            if (r0 != 0) goto L_0x01b3
            java.util.ArrayList r0 = r15.Z
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01b3
            int r0 = r15.f8817b0
            if (r0 <= r10) goto L_0x0162
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x013e
            cm.l.v(r9)
            r0 = r5
        L_0x013e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            ld.c r7 = r15.D1()
            java.lang.String r8 = r15.getString(r12)
            java.lang.String r7 = r7.b(r13, r8)
        L_0x014f:
            r6.append(r7)
            r6.append(r14)
            int r7 = r15.f8817b0
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x015e:
            r0.setText(r6)
            goto L_0x01a2
        L_0x0162:
            if (r0 != 0) goto L_0x0188
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x016c
            cm.l.v(r9)
            r0 = r5
        L_0x016c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            ld.c r10 = r15.D1()
            java.lang.String r7 = r15.getString(r7)
            java.lang.String r7 = r10.b(r8, r7)
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x015e
        L_0x0188:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x0190
            cm.l.v(r9)
            r0 = r5
        L_0x0190:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            ld.c r9 = r15.D1()
            java.lang.String r7 = r15.getString(r7)
            java.lang.String r7 = r9.b(r8, r7)
            goto L_0x014f
        L_0x01a2:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x01aa
            cm.l.v(r4)
            r0 = r5
        L_0x01aa:
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0046
            goto L_0x0042
        L_0x01b3:
            int r0 = r15.f8816a0
            if (r0 != r10) goto L_0x0240
            java.util.ArrayList r0 = r15.X
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0240
            int r0 = r15.f8818c0
            if (r0 <= r10) goto L_0x01ef
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x01cb
            cm.l.v(r9)
            r0 = r5
        L_0x01cb:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            ld.c r7 = r15.D1()
            java.lang.String r8 = r15.getString(r12)
            java.lang.String r7 = r7.b(r13, r8)
        L_0x01dc:
            r6.append(r7)
            r6.append(r14)
            int r7 = r15.f8818c0
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x01eb:
            r0.setText(r6)
            goto L_0x022f
        L_0x01ef:
            if (r0 != 0) goto L_0x0215
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x01f9
            cm.l.v(r9)
            r0 = r5
        L_0x01f9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            ld.c r10 = r15.D1()
            java.lang.String r7 = r15.getString(r7)
            java.lang.String r7 = r10.b(r8, r7)
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x01eb
        L_0x0215:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x021d
            cm.l.v(r9)
            r0 = r5
        L_0x021d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            ld.c r9 = r15.D1()
            java.lang.String r7 = r15.getString(r7)
            java.lang.String r7 = r9.b(r8, r7)
            goto L_0x01dc
        L_0x022f:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x0237
            cm.l.v(r4)
            r0 = r5
        L_0x0237:
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0046
            goto L_0x0042
        L_0x0240:
            int r0 = r15.f8816a0
            if (r0 != r11) goto L_0x02cd
            java.util.ArrayList r0 = r15.Y
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02cd
            int r0 = r15.f8819d0
            if (r0 <= r10) goto L_0x027c
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x0258
            cm.l.v(r9)
            r0 = r5
        L_0x0258:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            ld.c r7 = r15.D1()
            java.lang.String r8 = r15.getString(r12)
            java.lang.String r7 = r7.b(r13, r8)
        L_0x0269:
            r6.append(r7)
            r6.append(r14)
            int r7 = r15.f8819d0
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x0278:
            r0.setText(r6)
            goto L_0x02bc
        L_0x027c:
            if (r0 != 0) goto L_0x02a2
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x0286
            cm.l.v(r9)
            r0 = r5
        L_0x0286:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            ld.c r8 = r15.D1()
            java.lang.String r9 = r15.getString(r12)
            java.lang.String r8 = r8.b(r13, r9)
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            goto L_0x0278
        L_0x02a2:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x02aa
            cm.l.v(r9)
            r0 = r5
        L_0x02aa:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            ld.c r9 = r15.D1()
            java.lang.String r7 = r15.getString(r7)
            java.lang.String r7 = r9.b(r8, r7)
            goto L_0x0269
        L_0x02bc:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x02c4
            cm.l.v(r4)
            r0 = r5
        L_0x02c4:
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0046
            goto L_0x0042
        L_0x02cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchChallanListActivity.w1():void");
    }

    private final void y1() {
        ProgressBar progressBar = null;
        try {
            this.f8823h0 = true;
            ProgressBar progressBar2 = this.N;
            if (progressBar2 == null) {
                l.v("progressBar");
                progressBar2 = null;
            }
            progressBar2.setVisibility(0);
            jb.c cVar = this.f8827l0;
            if (cVar == null) {
                l.v("viewModel");
                cVar = null;
            }
            cVar.g(this.W, this.V, 1);
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
            w1();
        }
    }

    public final ArrayList A1() {
        return this.Y;
    }

    public final int C1() {
        return this.f8819d0;
    }

    public final ld.c D1() {
        ld.c cVar = this.f8825j0;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final int E1() {
        return this.f8821f0;
    }

    public final int G1() {
        return this.f8818c0;
    }

    public final ArrayList H1() {
        return this.X;
    }

    public final int I1() {
        return this.f8816a0;
    }

    public final void X1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.Z = arrayList;
    }

    public final void Y1(int i10) {
        this.f8817b0 = i10;
    }

    public final void Z1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.Y = arrayList;
    }

    public final void a2(int i10) {
        this.f8819d0 = i10;
    }

    public final void b2(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.f8825j0 = cVar;
    }

    public final void c2(boolean z10) {
        this.f8823h0 = z10;
    }

    public final void d2(int i10) {
        this.f8818c0 = i10;
    }

    public final void e2(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.X = arrayList;
    }

    public final void f2(int i10) {
        this.f8822g0 = i10;
    }

    public final void g2(Context context, String str) {
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
        textView.setText(D1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(D1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new n1(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wc c10 = wc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.f8824i0 = c10;
        jb.c cVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        b2(new ld.c(this));
        a.C0148a aVar = fb.a.f11584a;
        wc wcVar = this.f8824i0;
        if (wcVar == null) {
            l.v("binding");
            wcVar = null;
        }
        aVar.h(this, wcVar);
        String stringExtra = getIntent().getStringExtra("inputValue");
        l.c(stringExtra);
        this.V = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("inputType");
        l.c(stringExtra2);
        this.W = stringExtra2;
        this.f8826k0 = SearchChallanService.f8750a.d(this);
        J1();
        v1();
        jb.c cVar2 = this.f8827l0;
        if (cVar2 == null) {
            l.v("viewModel");
            cVar2 = null;
        }
        cVar2.u().g(this, new h(new b(this)));
        jb.c cVar3 = this.f8827l0;
        if (cVar3 == null) {
            l.v("viewModel");
            cVar3 = null;
        }
        cVar3.t().g(this, new h(new c(this)));
        jb.c cVar4 = this.f8827l0;
        if (cVar4 == null) {
            l.v("viewModel");
            cVar4 = null;
        }
        cVar4.i().g(this, new h(new d(this)));
        jb.c cVar5 = this.f8827l0;
        if (cVar5 == null) {
            l.v("viewModel");
            cVar5 = null;
        }
        cVar5.h().g(this, new h(new e(this)));
        jb.c cVar6 = this.f8827l0;
        if (cVar6 == null) {
            l.v("viewModel");
            cVar6 = null;
        }
        cVar6.n().g(this, new h(new f(this)));
        jb.c cVar7 = this.f8827l0;
        if (cVar7 == null) {
            l.v("viewModel");
        } else {
            cVar = cVar7;
        }
        cVar.m().g(this, new h(new g(this)));
    }

    public final ArrayList x1() {
        return this.Z;
    }

    public final int z1() {
        return this.f8817b0;
    }
}
