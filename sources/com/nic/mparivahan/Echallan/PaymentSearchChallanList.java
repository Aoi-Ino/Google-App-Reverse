package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cb.g0;
import cb.h0;
import cb.i0;
import cb.j0;
import cb.k0;
import cb.l0;
import cb.m0;
import cb.n0;
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
import ni.z7;
import pl.x;

public final class PaymentSearchChallanList extends androidx.appcompat.app.d {
    private AppCompatImageView G;
    private AppCompatImageView H;
    /* access modifiers changed from: private */
    public AppCompatEditText I;
    private MyTextView J;
    /* access modifiers changed from: private */
    public AppCompatTextView K;
    private RecyclerView L;
    private db.d M;
    /* access modifiers changed from: private */
    public ProgressBar N;
    private AppCompatTextView O;
    private AppCompatTextView P;
    private AppCompatTextView Q;
    private LinearLayout R;
    private AppCompatTextView S;
    private RelativeLayout T;
    private String U = "";
    private String V = "";
    private ArrayList W = new ArrayList();
    private ArrayList X = new ArrayList();
    private ArrayList Y = new ArrayList();
    private int Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f8789a0;

    /* renamed from: b0  reason: collision with root package name */
    private int f8790b0;

    /* renamed from: c0  reason: collision with root package name */
    private int f8791c0;

    /* renamed from: d0  reason: collision with root package name */
    private final String f8792d0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* renamed from: e0  reason: collision with root package name */
    private SearchChallanService f8793e0;

    /* renamed from: f0  reason: collision with root package name */
    private jb.c f8794f0;

    /* renamed from: g0  reason: collision with root package name */
    private z7 f8795g0;

    /* renamed from: h0  reason: collision with root package name */
    public ld.c f8796h0;

    /* renamed from: i0  reason: collision with root package name */
    private final TextWatcher f8797i0 = new a(this);

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PaymentSearchChallanList f8798e;

        a(PaymentSearchChallanList paymentSearchChallanList) {
            this.f8798e = paymentSearchChallanList;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                AppCompatEditText o12 = this.f8798e.I;
                if (o12 == null) {
                    l.v("numberEt");
                    o12 = null;
                }
                o12.setError((CharSequence) null);
            }
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PaymentSearchChallanList f8799e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PaymentSearchChallanList paymentSearchChallanList) {
            super(1);
            this.f8799e = paymentSearchChallanList;
        }

        public final void b(SearchChallanModel searchChallanModel) {
            PaymentSearchChallanList paymentSearchChallanList;
            String message;
            ProgressBar progressBar = null;
            try {
                if (p.o(searchChallanModel.getStatus(), "200", true)) {
                    PaymentSearchChallanList paymentSearchChallanList2 = this.f8799e;
                    l.c(searchChallanModel);
                    paymentSearchChallanList2.R1(searchChallanModel.getTotalChallan());
                    this.f8799e.Q1(searchChallanModel.getResult());
                    if (this.f8799e.D1() == 0) {
                        this.f8799e.t1();
                        PaymentSearchChallanList paymentSearchChallanList3 = this.f8799e;
                        paymentSearchChallanList3.P1(paymentSearchChallanList3.u1());
                    }
                    ProgressBar p12 = this.f8799e.N;
                    if (p12 == null) {
                        l.v("progressBar");
                        p12 = null;
                    }
                    if (p12.getVisibility() == 0) {
                        ProgressBar p13 = this.f8799e.N;
                        if (p13 == null) {
                            l.v("progressBar");
                            p13 = null;
                        }
                        p13.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (l.a(searchChallanModel.getStatus(), "Failed")) {
                    ProgressBar p14 = this.f8799e.N;
                    if (p14 == null) {
                        l.v("progressBar");
                        p14 = null;
                    }
                    if (p14.getVisibility() == 0) {
                        ProgressBar p15 = this.f8799e.N;
                        if (p15 == null) {
                            l.v("progressBar");
                            p15 = null;
                        }
                        p15.setVisibility(8);
                    }
                    this.f8799e.u1().clear();
                    if (this.f8799e.D1() == 0) {
                        this.f8799e.t1();
                        paymentSearchChallanList = this.f8799e;
                        message = searchChallanModel.getMessage();
                    } else {
                        return;
                    }
                } else if (l.a(searchChallanModel.getStatus(), "404")) {
                    ProgressBar p16 = this.f8799e.N;
                    if (p16 == null) {
                        l.v("progressBar");
                        p16 = null;
                    }
                    if (p16.getVisibility() == 0) {
                        ProgressBar p17 = this.f8799e.N;
                        if (p17 == null) {
                            l.v("progressBar");
                            p17 = null;
                        }
                        p17.setVisibility(8);
                    }
                    this.f8799e.u1().clear();
                    if (this.f8799e.D1() == 0) {
                        this.f8799e.t1();
                        paymentSearchChallanList = this.f8799e;
                        message = searchChallanModel.getMessage();
                    } else {
                        return;
                    }
                } else {
                    ProgressBar p18 = this.f8799e.N;
                    if (p18 == null) {
                        l.v("progressBar");
                        p18 = null;
                    }
                    if (p18.getVisibility() == 0) {
                        ProgressBar p19 = this.f8799e.N;
                        if (p19 == null) {
                            l.v("progressBar");
                            p19 = null;
                        }
                        p19.setVisibility(8);
                    }
                    this.f8799e.u1().clear();
                    if (this.f8799e.D1() == 0) {
                        this.f8799e.t1();
                        PaymentSearchChallanList paymentSearchChallanList4 = this.f8799e;
                        paymentSearchChallanList4.X1(paymentSearchChallanList4, paymentSearchChallanList4.z1().b("error_msg_record_not_found", this.f8799e.getString(R.string.service_unavable_please_try)));
                        return;
                    }
                    return;
                }
                paymentSearchChallanList.X1(paymentSearchChallanList, message);
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressBar p110 = this.f8799e.N;
                if (p110 == null) {
                    l.v("progressBar");
                    p110 = null;
                }
                if (p110.getVisibility() == 0) {
                    ProgressBar p111 = this.f8799e.N;
                    if (p111 == null) {
                        l.v("progressBar");
                    } else {
                        progressBar = p111;
                    }
                    progressBar.setVisibility(8);
                }
                this.f8799e.u1().clear();
                if (this.f8799e.D1() == 0) {
                    this.f8799e.t1();
                    PaymentSearchChallanList paymentSearchChallanList5 = this.f8799e;
                    paymentSearchChallanList5.X1(paymentSearchChallanList5, paymentSearchChallanList5.z1().b("error_msg_record_not_found", this.f8799e.getString(R.string.service_unavable_please_try)));
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
        final /* synthetic */ PaymentSearchChallanList f8800e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PaymentSearchChallanList paymentSearchChallanList) {
            super(1);
            this.f8800e = paymentSearchChallanList;
        }

        public final void b(String str) {
            ProgressBar p12 = this.f8800e.N;
            ProgressBar progressBar = null;
            if (p12 == null) {
                l.v("progressBar");
                p12 = null;
            }
            if (p12.getVisibility() == 0) {
                ProgressBar p13 = this.f8800e.N;
                if (p13 == null) {
                    l.v("progressBar");
                } else {
                    progressBar = p13;
                }
                progressBar.setVisibility(8);
            }
            this.f8800e.u1().clear();
            if (this.f8800e.D1() == 0) {
                this.f8800e.t1();
                PaymentSearchChallanList paymentSearchChallanList = this.f8800e;
                paymentSearchChallanList.X1(paymentSearchChallanList, paymentSearchChallanList.z1().b("error_msg_record_not_found", this.f8800e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PaymentSearchChallanList f8801e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PaymentSearchChallanList paymentSearchChallanList) {
            super(1);
            this.f8801e = paymentSearchChallanList;
        }

        public final void b(SearchChallanModel searchChallanModel) {
            PaymentSearchChallanList paymentSearchChallanList;
            String message;
            AppCompatTextView appCompatTextView;
            String str;
            ProgressBar progressBar = null;
            try {
                if (p.o(searchChallanModel.getStatus(), "200", true)) {
                    PaymentSearchChallanList paymentSearchChallanList2 = this.f8801e;
                    l.c(searchChallanModel);
                    paymentSearchChallanList2.V1(searchChallanModel.getTotalChallan());
                    this.f8801e.W1(searchChallanModel.getResult());
                    if (this.f8801e.D1() == 1) {
                        if (this.f8801e.B1() > 1) {
                            appCompatTextView = this.f8801e.K;
                            if (appCompatTextView == null) {
                                l.v("totalChallan");
                                appCompatTextView = null;
                            }
                            str = this.f8801e.z1().b("label_challan_totals", this.f8801e.getString(R.string.total_challans)) + ' ' + this.f8801e.B1();
                        } else if (this.f8801e.B1() == 0) {
                            AppCompatTextView q12 = this.f8801e.K;
                            if (q12 == null) {
                                l.v("totalChallan");
                                q12 = null;
                            }
                            str = this.f8801e.z1().b("label_challan_total", this.f8801e.getString(R.string.total_challan)) + " 0";
                        } else {
                            AppCompatTextView q13 = this.f8801e.K;
                            if (q13 == null) {
                                l.v("totalChallan");
                                q13 = null;
                            }
                            str = this.f8801e.z1().b("label_challan_total", this.f8801e.getString(R.string.total_challan)) + ' ' + this.f8801e.B1();
                        }
                        appCompatTextView.setText(str);
                        PaymentSearchChallanList paymentSearchChallanList3 = this.f8801e;
                        paymentSearchChallanList3.P1(paymentSearchChallanList3.C1());
                    }
                    if (this.f8801e.D1() == 1) {
                        this.f8801e.t1();
                    }
                    ProgressBar p12 = this.f8801e.N;
                    if (p12 == null) {
                        l.v("progressBar");
                        p12 = null;
                    }
                    if (p12.getVisibility() == 0) {
                        ProgressBar p13 = this.f8801e.N;
                        if (p13 == null) {
                            l.v("progressBar");
                            p13 = null;
                        }
                        p13.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (l.a(searchChallanModel.getStatus(), "Failed")) {
                    ProgressBar p14 = this.f8801e.N;
                    if (p14 == null) {
                        l.v("progressBar");
                        p14 = null;
                    }
                    if (p14.getVisibility() == 0) {
                        ProgressBar p15 = this.f8801e.N;
                        if (p15 == null) {
                            l.v("progressBar");
                            p15 = null;
                        }
                        p15.setVisibility(8);
                    }
                    this.f8801e.C1().clear();
                    if (this.f8801e.D1() == 1) {
                        this.f8801e.t1();
                        paymentSearchChallanList = this.f8801e;
                        message = searchChallanModel.getMessage();
                    } else {
                        return;
                    }
                } else if (l.a(searchChallanModel.getStatus(), "404")) {
                    ProgressBar p16 = this.f8801e.N;
                    if (p16 == null) {
                        l.v("progressBar");
                        p16 = null;
                    }
                    if (p16.getVisibility() == 0) {
                        ProgressBar p17 = this.f8801e.N;
                        if (p17 == null) {
                            l.v("progressBar");
                            p17 = null;
                        }
                        p17.setVisibility(8);
                    }
                    this.f8801e.C1().clear();
                    if (this.f8801e.D1() == 1) {
                        this.f8801e.t1();
                        paymentSearchChallanList = this.f8801e;
                        message = searchChallanModel.getMessage();
                    } else {
                        return;
                    }
                } else {
                    ProgressBar p18 = this.f8801e.N;
                    if (p18 == null) {
                        l.v("progressBar");
                        p18 = null;
                    }
                    if (p18.getVisibility() == 0) {
                        ProgressBar p19 = this.f8801e.N;
                        if (p19 == null) {
                            l.v("progressBar");
                            p19 = null;
                        }
                        p19.setVisibility(8);
                    }
                    this.f8801e.C1().clear();
                    if (this.f8801e.D1() == 1) {
                        this.f8801e.t1();
                        PaymentSearchChallanList paymentSearchChallanList4 = this.f8801e;
                        paymentSearchChallanList4.X1(paymentSearchChallanList4, paymentSearchChallanList4.z1().b("error_msg_record_not_found", this.f8801e.getString(R.string.service_unavable_please_try)));
                        return;
                    }
                    return;
                }
                paymentSearchChallanList.X1(paymentSearchChallanList, message);
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressBar p110 = this.f8801e.N;
                if (p110 == null) {
                    l.v("progressBar");
                    p110 = null;
                }
                if (p110.getVisibility() == 0) {
                    ProgressBar p111 = this.f8801e.N;
                    if (p111 == null) {
                        l.v("progressBar");
                    } else {
                        progressBar = p111;
                    }
                    progressBar.setVisibility(8);
                }
                this.f8801e.C1().clear();
                if (this.f8801e.D1() == 1) {
                    this.f8801e.t1();
                    PaymentSearchChallanList paymentSearchChallanList5 = this.f8801e;
                    paymentSearchChallanList5.X1(paymentSearchChallanList5, paymentSearchChallanList5.z1().b("error_msg_record_not_found", this.f8801e.getString(R.string.service_unavable_please_try)));
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
        final /* synthetic */ PaymentSearchChallanList f8802e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PaymentSearchChallanList paymentSearchChallanList) {
            super(1);
            this.f8802e = paymentSearchChallanList;
        }

        public final void b(String str) {
            ProgressBar p12 = this.f8802e.N;
            ProgressBar progressBar = null;
            if (p12 == null) {
                l.v("progressBar");
                p12 = null;
            }
            if (p12.getVisibility() == 0) {
                ProgressBar p13 = this.f8802e.N;
                if (p13 == null) {
                    l.v("progressBar");
                } else {
                    progressBar = p13;
                }
                progressBar.setVisibility(8);
            }
            this.f8802e.C1().clear();
            if (this.f8802e.D1() == 1) {
                this.f8802e.t1();
                PaymentSearchChallanList paymentSearchChallanList = this.f8802e;
                paymentSearchChallanList.X1(paymentSearchChallanList, paymentSearchChallanList.z1().b("error_msg_record_not_found", this.f8802e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PaymentSearchChallanList f8803e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PaymentSearchChallanList paymentSearchChallanList) {
            super(1);
            this.f8803e = paymentSearchChallanList;
        }

        public final void b(SearchChallanModel searchChallanModel) {
            PaymentSearchChallanList paymentSearchChallanList;
            String message;
            AppCompatTextView appCompatTextView;
            String str;
            ProgressBar progressBar = null;
            try {
                if (p.o(searchChallanModel.getStatus(), "200", true)) {
                    PaymentSearchChallanList paymentSearchChallanList2 = this.f8803e;
                    l.c(searchChallanModel);
                    paymentSearchChallanList2.T1(searchChallanModel.getTotalChallan());
                    this.f8803e.S1(searchChallanModel.getResult());
                    if (this.f8803e.D1() == 2) {
                        if (this.f8803e.y1() > 1) {
                            appCompatTextView = this.f8803e.K;
                            if (appCompatTextView == null) {
                                l.v("totalChallan");
                                appCompatTextView = null;
                            }
                            str = this.f8803e.z1().b("label_challan_totals", this.f8803e.getString(R.string.total_challans)) + ' ' + this.f8803e.y1();
                        } else if (this.f8803e.y1() == 0) {
                            AppCompatTextView q12 = this.f8803e.K;
                            if (q12 == null) {
                                l.v("totalChallan");
                                q12 = null;
                            }
                            str = this.f8803e.z1().b("label_challan_total", this.f8803e.getString(R.string.total_challan)) + " 0";
                        } else {
                            AppCompatTextView q13 = this.f8803e.K;
                            if (q13 == null) {
                                l.v("totalChallan");
                                q13 = null;
                            }
                            str = this.f8803e.z1().b("label_challan_total", this.f8803e.getString(R.string.total_challan)) + ' ' + this.f8803e.y1();
                        }
                        appCompatTextView.setText(str);
                        PaymentSearchChallanList paymentSearchChallanList3 = this.f8803e;
                        paymentSearchChallanList3.P1(paymentSearchChallanList3.w1());
                    }
                    if (this.f8803e.D1() == 2) {
                        this.f8803e.t1();
                    }
                    ProgressBar p12 = this.f8803e.N;
                    if (p12 == null) {
                        l.v("progressBar");
                        p12 = null;
                    }
                    if (p12.getVisibility() == 0) {
                        ProgressBar p13 = this.f8803e.N;
                        if (p13 == null) {
                            l.v("progressBar");
                            p13 = null;
                        }
                        p13.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (l.a(searchChallanModel.getStatus(), "Failed")) {
                    ProgressBar p14 = this.f8803e.N;
                    if (p14 == null) {
                        l.v("progressBar");
                        p14 = null;
                    }
                    if (p14.getVisibility() == 0) {
                        ProgressBar p15 = this.f8803e.N;
                        if (p15 == null) {
                            l.v("progressBar");
                            p15 = null;
                        }
                        p15.setVisibility(8);
                    }
                    this.f8803e.w1().clear();
                    if (this.f8803e.D1() == 2) {
                        this.f8803e.t1();
                        paymentSearchChallanList = this.f8803e;
                        message = searchChallanModel.getMessage();
                    } else {
                        return;
                    }
                } else if (l.a(searchChallanModel.getStatus(), "404")) {
                    ProgressBar p16 = this.f8803e.N;
                    if (p16 == null) {
                        l.v("progressBar");
                        p16 = null;
                    }
                    if (p16.getVisibility() == 0) {
                        ProgressBar p17 = this.f8803e.N;
                        if (p17 == null) {
                            l.v("progressBar");
                            p17 = null;
                        }
                        p17.setVisibility(8);
                    }
                    this.f8803e.w1().clear();
                    if (this.f8803e.D1() == 2) {
                        this.f8803e.t1();
                        paymentSearchChallanList = this.f8803e;
                        message = searchChallanModel.getMessage();
                    } else {
                        return;
                    }
                } else {
                    ProgressBar p18 = this.f8803e.N;
                    if (p18 == null) {
                        l.v("progressBar");
                        p18 = null;
                    }
                    if (p18.getVisibility() == 0) {
                        ProgressBar p19 = this.f8803e.N;
                        if (p19 == null) {
                            l.v("progressBar");
                            p19 = null;
                        }
                        p19.setVisibility(8);
                    }
                    this.f8803e.w1().clear();
                    if (this.f8803e.D1() == 2) {
                        this.f8803e.t1();
                        PaymentSearchChallanList paymentSearchChallanList4 = this.f8803e;
                        paymentSearchChallanList4.X1(paymentSearchChallanList4, paymentSearchChallanList4.z1().b("error_msg_record_not_found", this.f8803e.getString(R.string.service_unavable_please_try)));
                        return;
                    }
                    return;
                }
                paymentSearchChallanList.X1(paymentSearchChallanList, message);
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressBar p110 = this.f8803e.N;
                if (p110 == null) {
                    l.v("progressBar");
                    p110 = null;
                }
                if (p110.getVisibility() == 0) {
                    ProgressBar p111 = this.f8803e.N;
                    if (p111 == null) {
                        l.v("progressBar");
                    } else {
                        progressBar = p111;
                    }
                    progressBar.setVisibility(8);
                }
                this.f8803e.w1().clear();
                if (this.f8803e.D1() == 2) {
                    this.f8803e.t1();
                    PaymentSearchChallanList paymentSearchChallanList5 = this.f8803e;
                    paymentSearchChallanList5.X1(paymentSearchChallanList5, paymentSearchChallanList5.z1().b("error_msg_record_not_found", this.f8803e.getString(R.string.service_unavable_please_try)));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SearchChallanModel) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PaymentSearchChallanList f8804e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PaymentSearchChallanList paymentSearchChallanList) {
            super(1);
            this.f8804e = paymentSearchChallanList;
        }

        public final void b(String str) {
            ProgressBar p12 = this.f8804e.N;
            ProgressBar progressBar = null;
            if (p12 == null) {
                l.v("progressBar");
                p12 = null;
            }
            if (p12.getVisibility() == 0) {
                ProgressBar p13 = this.f8804e.N;
                if (p13 == null) {
                    l.v("progressBar");
                } else {
                    progressBar = p13;
                }
                progressBar.setVisibility(8);
            }
            this.f8804e.w1().clear();
            if (this.f8804e.D1() == 2) {
                this.f8804e.t1();
                PaymentSearchChallanList paymentSearchChallanList = this.f8804e;
                paymentSearchChallanList.X1(paymentSearchChallanList, paymentSearchChallanList.z1().b("error_msg_record_not_found", this.f8804e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8805a;

        h(bm.l lVar) {
            l.f(lVar, "function");
            this.f8805a = lVar;
        }

        public final pl.c a() {
            return this.f8805a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8805a.invoke(obj);
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

    private final void A1() {
        ProgressBar progressBar = null;
        try {
            ProgressBar progressBar2 = this.N;
            if (progressBar2 == null) {
                l.v("progressBar");
                progressBar2 = null;
            }
            progressBar2.setVisibility(0);
            jb.c cVar = this.f8794f0;
            if (cVar == null) {
                l.v("viewModel");
                cVar = null;
            }
            cVar.s(this.V, this.U, 1, 2);
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
            if (this.Z == 1) {
                t1();
            }
        }
    }

    private final void E1() {
        SearchChallanService searchChallanService = this.f8793e0;
        RelativeLayout relativeLayout = null;
        if (searchChallanService == null) {
            l.v("retrofitService");
            searchChallanService = null;
        }
        this.f8794f0 = (jb.c) new u0((x0) this, (u0.b) new jb.b(new jb.a(searchChallanService))).a(jb.c.class);
        View findViewById = findViewById(R.id.mvvm_back);
        l.e(findViewById, "findViewById(...)");
        this.G = (AppCompatImageView) findViewById;
        View findViewById2 = findViewById(R.id.notificationIv);
        l.e(findViewById2, "findViewById(...)");
        this.H = (AppCompatImageView) findViewById2;
        View findViewById3 = findViewById(R.id.numberEt);
        l.e(findViewById3, "findViewById(...)");
        AppCompatEditText appCompatEditText = (AppCompatEditText) findViewById3;
        this.I = appCompatEditText;
        if (appCompatEditText == null) {
            l.v("numberEt");
            appCompatEditText = null;
        }
        appCompatEditText.setKeyListener(DigitsKeyListener.getInstance(this.f8792d0));
        AppCompatEditText appCompatEditText2 = this.I;
        if (appCompatEditText2 == null) {
            l.v("numberEt");
            appCompatEditText2 = null;
        }
        appCompatEditText2.setRawInputType(4096);
        View findViewById4 = findViewById(R.id.searchTv);
        l.e(findViewById4, "findViewById(...)");
        this.J = (MyTextView) findViewById4;
        View findViewById5 = findViewById(R.id.totalChallanCountTv);
        l.e(findViewById5, "findViewById(...)");
        this.K = (AppCompatTextView) findViewById5;
        View findViewById6 = findViewById(R.id.challanListRv);
        l.e(findViewById6, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById6;
        this.L = recyclerView;
        if (recyclerView == null) {
            l.v("challanList");
            recyclerView = null;
        }
        recyclerView.setNestedScrollingEnabled(false);
        View findViewById7 = findViewById(R.id.progressBar);
        l.e(findViewById7, "findViewById(...)");
        this.N = (ProgressBar) findViewById7;
        View findViewById8 = findViewById(R.id.pendingTv);
        l.e(findViewById8, "findViewById(...)");
        this.O = (AppCompatTextView) findViewById8;
        View findViewById9 = findViewById(R.id.disposeTv);
        l.e(findViewById9, "findViewById(...)");
        this.P = (AppCompatTextView) findViewById9;
        View findViewById10 = findViewById(R.id.allTv);
        l.e(findViewById10, "findViewById(...)");
        this.Q = (AppCompatTextView) findViewById10;
        View findViewById11 = findViewById(R.id.tabBarLl);
        l.e(findViewById11, "findViewById(...)");
        this.R = (LinearLayout) findViewById11;
        View findViewById12 = findViewById(R.id.noChallanFoundTv);
        l.e(findViewById12, "findViewById(...)");
        this.S = (AppCompatTextView) findViewById12;
        View findViewById13 = findViewById(R.id.nexGenHolder);
        l.e(findViewById13, "findViewById(...)");
        this.T = (RelativeLayout) findViewById13;
        if (this.V.length() > 0) {
            String str = this.V;
            if (l.a(str, "Challan")) {
                AppCompatEditText appCompatEditText3 = this.I;
                if (appCompatEditText3 == null) {
                    l.v("numberEt");
                    appCompatEditText3 = null;
                }
                appCompatEditText3.setHint(z1().b("label_challan_enter_challan_no", getString(R.string.enter_challan_no)));
                AppCompatEditText appCompatEditText4 = this.I;
                if (appCompatEditText4 == null) {
                    l.v("numberEt");
                    appCompatEditText4 = null;
                }
                appCompatEditText4.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
                LinearLayout linearLayout = this.R;
                if (linearLayout == null) {
                    l.v("tabBarLl");
                    linearLayout = null;
                }
                linearLayout.setVisibility(8);
                AppCompatTextView appCompatTextView = this.K;
                if (appCompatTextView == null) {
                    l.v("totalChallan");
                    appCompatTextView = null;
                }
                appCompatTextView.setVisibility(8);
            } else if (l.a(str, "RC")) {
                AppCompatEditText appCompatEditText5 = this.I;
                if (appCompatEditText5 == null) {
                    l.v("numberEt");
                    appCompatEditText5 = null;
                }
                appCompatEditText5.setHint(z1().b("label_challan_enter_vehicle_no", getString(R.string.enter_vehicle_number)));
                AppCompatEditText appCompatEditText6 = this.I;
                if (appCompatEditText6 == null) {
                    l.v("numberEt");
                    appCompatEditText6 = null;
                }
                appCompatEditText6.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
                LinearLayout linearLayout2 = this.R;
                if (linearLayout2 == null) {
                    l.v("tabBarLl");
                    linearLayout2 = null;
                }
                linearLayout2.setVisibility(0);
                AppCompatTextView appCompatTextView2 = this.K;
                if (appCompatTextView2 == null) {
                    l.v("totalChallan");
                    appCompatTextView2 = null;
                }
                appCompatTextView2.setVisibility(0);
                AppCompatEditText appCompatEditText7 = this.I;
                if (appCompatEditText7 == null) {
                    l.v("numberEt");
                    appCompatEditText7 = null;
                }
                appCompatEditText7.setInputType(0);
            } else {
                AppCompatEditText appCompatEditText8 = this.I;
                if (appCompatEditText8 == null) {
                    l.v("numberEt");
                    appCompatEditText8 = null;
                }
                appCompatEditText8.setHint(z1().b("label_challan_enter_dl_no", getString(R.string.enter_dl_number)));
                AppCompatEditText appCompatEditText9 = this.I;
                if (appCompatEditText9 == null) {
                    l.v("numberEt");
                    appCompatEditText9 = null;
                }
                appCompatEditText9.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
                LinearLayout linearLayout3 = this.R;
                if (linearLayout3 == null) {
                    l.v("tabBarLl");
                    linearLayout3 = null;
                }
                linearLayout3.setVisibility(0);
                AppCompatTextView appCompatTextView3 = this.K;
                if (appCompatTextView3 == null) {
                    l.v("totalChallan");
                    appCompatTextView3 = null;
                }
                appCompatTextView3.setVisibility(0);
            }
        }
        if (this.U.length() > 0) {
            AppCompatEditText appCompatEditText10 = this.I;
            if (appCompatEditText10 == null) {
                l.v("numberEt");
                appCompatEditText10 = null;
            }
            appCompatEditText10.setText(this.U);
        }
        RecyclerView recyclerView2 = this.L;
        if (recyclerView2 == null) {
            l.v("challanList");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        this.M = new db.d(this, new ArrayList(), 0, this.V, z1());
        RecyclerView recyclerView3 = this.L;
        if (recyclerView3 == null) {
            l.v("challanList");
            recyclerView3 = null;
        }
        db.d dVar = this.M;
        if (dVar == null) {
            l.v("adapter");
            dVar = null;
        }
        recyclerView3.setAdapter(dVar);
        AppCompatImageView appCompatImageView = this.G;
        if (appCompatImageView == null) {
            l.v("backIv");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new g0(this));
        AppCompatTextView appCompatTextView4 = this.Q;
        if (appCompatTextView4 == null) {
            l.v("allChallan");
            appCompatTextView4 = null;
        }
        appCompatTextView4.setOnClickListener(new h0(this));
        AppCompatTextView appCompatTextView5 = this.O;
        if (appCompatTextView5 == null) {
            l.v("pendingChallan");
            appCompatTextView5 = null;
        }
        appCompatTextView5.setOnClickListener(new i0(this));
        AppCompatTextView appCompatTextView6 = this.P;
        if (appCompatTextView6 == null) {
            l.v("disposeChallan");
            appCompatTextView6 = null;
        }
        appCompatTextView6.setOnClickListener(new j0(this));
        MyTextView myTextView = this.J;
        if (myTextView == null) {
            l.v("searchTv");
            myTextView = null;
        }
        myTextView.setOnClickListener(new k0(this));
        AppCompatEditText appCompatEditText11 = this.I;
        if (appCompatEditText11 == null) {
            l.v("numberEt");
            appCompatEditText11 = null;
        }
        appCompatEditText11.setOnEditorActionListener(new l0(this));
        AppCompatEditText appCompatEditText12 = this.I;
        if (appCompatEditText12 == null) {
            l.v("numberEt");
            appCompatEditText12 = null;
        }
        appCompatEditText12.addTextChangedListener(this.f8797i0);
        RelativeLayout relativeLayout2 = this.T;
        if (relativeLayout2 == null) {
            l.v("nexGenHolder");
        } else {
            relativeLayout = relativeLayout2;
        }
        relativeLayout.setOnClickListener(new m0(this));
    }

    /* access modifiers changed from: private */
    public static final void F1(PaymentSearchChallanList paymentSearchChallanList, View view) {
        l.f(paymentSearchChallanList, "this$0");
        paymentSearchChallanList.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void G1(PaymentSearchChallanList paymentSearchChallanList, View view) {
        StringBuilder sb2;
        String b10;
        l.f(paymentSearchChallanList, "this$0");
        paymentSearchChallanList.Z = 0;
        AppCompatTextView appCompatTextView = paymentSearchChallanList.Q;
        AppCompatTextView appCompatTextView2 = null;
        if (appCompatTextView == null) {
            l.v("allChallan");
            appCompatTextView = null;
        }
        appCompatTextView.setBackground(androidx.core.content.a.e(paymentSearchChallanList, R.drawable.rectangle_bg_15_with_two_corner));
        AppCompatTextView appCompatTextView3 = paymentSearchChallanList.O;
        if (appCompatTextView3 == null) {
            l.v("pendingChallan");
            appCompatTextView3 = null;
        }
        appCompatTextView3.setBackground(androidx.core.content.a.e(paymentSearchChallanList, R.drawable.rectanlge_without_corner_unselected));
        AppCompatTextView appCompatTextView4 = paymentSearchChallanList.P;
        if (appCompatTextView4 == null) {
            l.v("disposeChallan");
            appCompatTextView4 = null;
        }
        appCompatTextView4.setBackground(androidx.core.content.a.e(paymentSearchChallanList, R.drawable.rectangle_bg_two_corner_right));
        AppCompatTextView appCompatTextView5 = paymentSearchChallanList.Q;
        if (appCompatTextView5 == null) {
            l.v("allChallan");
            appCompatTextView5 = null;
        }
        appCompatTextView5.setTextColor(androidx.core.content.a.c(paymentSearchChallanList, R.color.white));
        AppCompatTextView appCompatTextView6 = paymentSearchChallanList.P;
        if (appCompatTextView6 == null) {
            l.v("disposeChallan");
            appCompatTextView6 = null;
        }
        appCompatTextView6.setTextColor(androidx.core.content.a.c(paymentSearchChallanList, R.color.dove_grey));
        AppCompatTextView appCompatTextView7 = paymentSearchChallanList.O;
        if (appCompatTextView7 == null) {
            l.v("pendingChallan");
            appCompatTextView7 = null;
        }
        appCompatTextView7.setTextColor(androidx.core.content.a.c(paymentSearchChallanList, R.color.dove_grey));
        int i10 = paymentSearchChallanList.f8789a0;
        if (i10 > 1) {
            AppCompatTextView appCompatTextView8 = paymentSearchChallanList.K;
            if (appCompatTextView8 == null) {
                l.v("totalChallan");
            } else {
                appCompatTextView2 = appCompatTextView8;
            }
            sb2 = new StringBuilder();
            b10 = paymentSearchChallanList.z1().b("label_challan_totals", paymentSearchChallanList.getString(R.string.total_challans));
        } else if (i10 == 0) {
            AppCompatTextView appCompatTextView9 = paymentSearchChallanList.K;
            if (appCompatTextView9 == null) {
                l.v("totalChallan");
            } else {
                appCompatTextView2 = appCompatTextView9;
            }
            sb2 = new StringBuilder();
            sb2.append(paymentSearchChallanList.z1().b("label_challan_total", paymentSearchChallanList.getString(R.string.total_challan)));
            sb2.append(" 0");
            appCompatTextView2.setText(sb2.toString());
            paymentSearchChallanList.P1(paymentSearchChallanList.Y);
            paymentSearchChallanList.t1();
        } else {
            AppCompatTextView appCompatTextView10 = paymentSearchChallanList.K;
            if (appCompatTextView10 == null) {
                l.v("totalChallan");
            } else {
                appCompatTextView2 = appCompatTextView10;
            }
            sb2 = new StringBuilder();
            b10 = paymentSearchChallanList.z1().b("label_challan_total", paymentSearchChallanList.getString(R.string.total_challan));
        }
        sb2.append(b10);
        sb2.append(' ');
        sb2.append(paymentSearchChallanList.f8789a0);
        appCompatTextView2.setText(sb2.toString());
        paymentSearchChallanList.P1(paymentSearchChallanList.Y);
        paymentSearchChallanList.t1();
    }

    /* access modifiers changed from: private */
    public static final void H1(PaymentSearchChallanList paymentSearchChallanList, View view) {
        StringBuilder sb2;
        String sb3;
        l.f(paymentSearchChallanList, "this$0");
        paymentSearchChallanList.Z = 1;
        AppCompatTextView appCompatTextView = paymentSearchChallanList.Q;
        AppCompatTextView appCompatTextView2 = null;
        if (appCompatTextView == null) {
            l.v("allChallan");
            appCompatTextView = null;
        }
        appCompatTextView.setBackground(androidx.core.content.a.e(paymentSearchChallanList, R.drawable.rectangle_bg_two_corner_left_crystal_white));
        AppCompatTextView appCompatTextView3 = paymentSearchChallanList.O;
        if (appCompatTextView3 == null) {
            l.v("pendingChallan");
            appCompatTextView3 = null;
        }
        appCompatTextView3.setBackground(androidx.core.content.a.e(paymentSearchChallanList, R.drawable.rectangle_without_corner_selected));
        AppCompatTextView appCompatTextView4 = paymentSearchChallanList.P;
        if (appCompatTextView4 == null) {
            l.v("disposeChallan");
            appCompatTextView4 = null;
        }
        appCompatTextView4.setBackground(androidx.core.content.a.e(paymentSearchChallanList, R.drawable.rectangle_bg_two_corner_right));
        AppCompatTextView appCompatTextView5 = paymentSearchChallanList.O;
        if (appCompatTextView5 == null) {
            l.v("pendingChallan");
            appCompatTextView5 = null;
        }
        appCompatTextView5.setTextColor(androidx.core.content.a.c(paymentSearchChallanList, R.color.white));
        AppCompatTextView appCompatTextView6 = paymentSearchChallanList.P;
        if (appCompatTextView6 == null) {
            l.v("disposeChallan");
            appCompatTextView6 = null;
        }
        appCompatTextView6.setTextColor(androidx.core.content.a.c(paymentSearchChallanList, R.color.dove_grey));
        AppCompatTextView appCompatTextView7 = paymentSearchChallanList.Q;
        if (appCompatTextView7 == null) {
            l.v("allChallan");
            appCompatTextView7 = null;
        }
        appCompatTextView7.setTextColor(androidx.core.content.a.c(paymentSearchChallanList, R.color.dove_grey));
        int i10 = paymentSearchChallanList.f8790b0;
        if (i10 > 1) {
            AppCompatTextView appCompatTextView8 = paymentSearchChallanList.K;
            if (appCompatTextView8 == null) {
                l.v("totalChallan");
            } else {
                appCompatTextView2 = appCompatTextView8;
            }
            sb3 = paymentSearchChallanList.z1().b("label_challan_totals", paymentSearchChallanList.getString(R.string.total_challans)) + ' ' + paymentSearchChallanList.f8790b0;
        } else {
            if (i10 == 0) {
                AppCompatTextView appCompatTextView9 = paymentSearchChallanList.K;
                if (appCompatTextView9 == null) {
                    l.v("totalChallan");
                } else {
                    appCompatTextView2 = appCompatTextView9;
                }
                sb2 = new StringBuilder();
                sb2.append(paymentSearchChallanList.z1().b("label_challan_total", paymentSearchChallanList.getString(R.string.total_challan)));
                sb2.append(" 0");
            } else {
                AppCompatTextView appCompatTextView10 = paymentSearchChallanList.K;
                if (appCompatTextView10 == null) {
                    l.v("totalChallan");
                } else {
                    appCompatTextView2 = appCompatTextView10;
                }
                sb2 = new StringBuilder();
                sb2.append(paymentSearchChallanList.z1().b("label_challan_total", paymentSearchChallanList.getString(R.string.total_challan)));
                sb2.append(' ');
                sb2.append(paymentSearchChallanList.f8790b0);
            }
            sb3 = sb2.toString();
        }
        appCompatTextView2.setText(sb3);
        paymentSearchChallanList.P1(paymentSearchChallanList.W);
        paymentSearchChallanList.t1();
    }

    /* access modifiers changed from: private */
    public static final void I1(PaymentSearchChallanList paymentSearchChallanList, View view) {
        StringBuilder sb2;
        String b10;
        l.f(paymentSearchChallanList, "this$0");
        paymentSearchChallanList.Z = 2;
        AppCompatTextView appCompatTextView = paymentSearchChallanList.P;
        AppCompatTextView appCompatTextView2 = null;
        if (appCompatTextView == null) {
            l.v("disposeChallan");
            appCompatTextView = null;
        }
        appCompatTextView.setBackground(androidx.core.content.a.e(paymentSearchChallanList, R.drawable.rectangle_bg_15_right_dodger_blue));
        AppCompatTextView appCompatTextView3 = paymentSearchChallanList.Q;
        if (appCompatTextView3 == null) {
            l.v("allChallan");
            appCompatTextView3 = null;
        }
        appCompatTextView3.setBackground(androidx.core.content.a.e(paymentSearchChallanList, R.drawable.rectangle_bg_two_corner_left_crystal_white));
        AppCompatTextView appCompatTextView4 = paymentSearchChallanList.O;
        if (appCompatTextView4 == null) {
            l.v("pendingChallan");
            appCompatTextView4 = null;
        }
        appCompatTextView4.setBackground(androidx.core.content.a.e(paymentSearchChallanList, R.drawable.rectangle_without_corner_left_unselected));
        AppCompatTextView appCompatTextView5 = paymentSearchChallanList.Q;
        if (appCompatTextView5 == null) {
            l.v("allChallan");
            appCompatTextView5 = null;
        }
        appCompatTextView5.setTextColor(androidx.core.content.a.c(paymentSearchChallanList, R.color.dove_grey));
        AppCompatTextView appCompatTextView6 = paymentSearchChallanList.O;
        if (appCompatTextView6 == null) {
            l.v("pendingChallan");
            appCompatTextView6 = null;
        }
        appCompatTextView6.setTextColor(androidx.core.content.a.c(paymentSearchChallanList, R.color.dove_grey));
        AppCompatTextView appCompatTextView7 = paymentSearchChallanList.P;
        if (appCompatTextView7 == null) {
            l.v("disposeChallan");
            appCompatTextView7 = null;
        }
        appCompatTextView7.setTextColor(androidx.core.content.a.c(paymentSearchChallanList, R.color.white));
        int i10 = paymentSearchChallanList.f8791c0;
        if (i10 > 1) {
            AppCompatTextView appCompatTextView8 = paymentSearchChallanList.K;
            if (appCompatTextView8 == null) {
                l.v("totalChallan");
            } else {
                appCompatTextView2 = appCompatTextView8;
            }
            sb2 = new StringBuilder();
            b10 = paymentSearchChallanList.z1().b("label_challan_totals", paymentSearchChallanList.getString(R.string.total_challans));
        } else if (i10 == 0) {
            AppCompatTextView appCompatTextView9 = paymentSearchChallanList.K;
            if (appCompatTextView9 == null) {
                l.v("totalChallan");
            } else {
                appCompatTextView2 = appCompatTextView9;
            }
            sb2 = new StringBuilder();
            sb2.append(paymentSearchChallanList.z1().b("label_challan_total", paymentSearchChallanList.getString(R.string.total_challan)));
            sb2.append(" 0");
            appCompatTextView2.setText(sb2.toString());
            paymentSearchChallanList.P1(paymentSearchChallanList.X);
            paymentSearchChallanList.t1();
        } else {
            AppCompatTextView appCompatTextView10 = paymentSearchChallanList.K;
            if (appCompatTextView10 == null) {
                l.v("totalChallan");
            } else {
                appCompatTextView2 = appCompatTextView10;
            }
            sb2 = new StringBuilder();
            b10 = paymentSearchChallanList.z1().b("label_challan_total", paymentSearchChallanList.getString(R.string.total_challan));
        }
        sb2.append(b10);
        sb2.append(' ');
        sb2.append(paymentSearchChallanList.f8791c0);
        appCompatTextView2.setText(sb2.toString());
        paymentSearchChallanList.P1(paymentSearchChallanList.X);
        paymentSearchChallanList.t1();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007e, code lost:
        if (r5 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
        if (r5 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ce, code lost:
        if (r5 == null) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void J1(com.nic.mparivahan.Echallan.PaymentSearchChallanList r5, android.view.View r6) {
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
            boolean r2 = r5.Z1()
            java.lang.String r3 = "RC"
            if (r2 != 0) goto L_0x0056
            java.lang.String r0 = r5.V
            boolean r0 = cm.l.a(r0, r3)
            if (r0 == 0) goto L_0x0034
            r5.onBackPressed()
            goto L_0x0055
        L_0x0034:
            r5.U = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.X = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.W = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.Y = r6
            r6 = 0
            r5.f8789a0 = r6
            r5.f8790b0 = r6
            r5.f8791c0 = r6
            r5.s1()
        L_0x0055:
            return
        L_0x0056:
            java.lang.String r6 = r5.V
            java.lang.String r2 = "Challan"
            boolean r2 = cm.l.a(r6, r2)
            if (r2 == 0) goto L_0x0089
            androidx.appcompat.widget.AppCompatEditText r6 = r5.I
            if (r6 != 0) goto L_0x0068
            cm.l.v(r1)
            r6 = r0
        L_0x0068:
            ld.c r2 = r5.z1()
            r3 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_please_enter_challan_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.I
            if (r5 != 0) goto L_0x0084
        L_0x0080:
            cm.l.v(r1)
            goto L_0x0085
        L_0x0084:
            r0 = r5
        L_0x0085:
            r0.requestFocus()
            goto L_0x00d1
        L_0x0089:
            boolean r6 = cm.l.a(r6, r3)
            if (r6 == 0) goto L_0x00b0
            androidx.appcompat.widget.AppCompatEditText r6 = r5.I
            if (r6 != 0) goto L_0x0097
            cm.l.v(r1)
            r6 = r0
        L_0x0097:
            ld.c r2 = r5.z1()
            r3 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_please_enter_vehicle_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.I
            if (r5 != 0) goto L_0x0084
            goto L_0x0080
        L_0x00b0:
            androidx.appcompat.widget.AppCompatEditText r6 = r5.I
            if (r6 != 0) goto L_0x00b8
            cm.l.v(r1)
            r6 = r0
        L_0x00b8:
            ld.c r2 = r5.z1()
            r3 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_valid_dl_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            androidx.appcompat.widget.AppCompatEditText r5 = r5.I
            if (r5 != 0) goto L_0x0084
            goto L_0x0080
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.PaymentSearchChallanList.J1(com.nic.mparivahan.Echallan.PaymentSearchChallanList, android.view.View):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (r4 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (r4 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        if (r4 == null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean K1(com.nic.mparivahan.Echallan.PaymentSearchChallanList r4, android.widget.TextView r5, int r6, android.view.KeyEvent r7) {
        /*
            java.lang.String r5 = "this$0"
            cm.l.f(r4, r5)
            r5 = 6
            r7 = 0
            if (r6 != r5) goto L_0x00d0
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
            boolean r1 = r4.Z1()
            r2 = 1
            java.lang.String r3 = "RC"
            if (r1 != 0) goto L_0x0054
            java.lang.String r6 = r4.V
            boolean r6 = cm.l.a(r6, r3)
            if (r6 == 0) goto L_0x0039
            r4.onBackPressed()
            goto L_0x0053
        L_0x0039:
            r4.U = r5
            java.util.ArrayList r5 = r4.X
            r5.clear()
            java.util.ArrayList r5 = r4.W
            r5.clear()
            java.util.ArrayList r5 = r4.Y
            r5.clear()
            r4.f8789a0 = r7
            r4.f8790b0 = r7
            r4.f8791c0 = r7
            r4.s1()
        L_0x0053:
            return r2
        L_0x0054:
            java.lang.String r5 = r4.V
            java.lang.String r7 = "Challan"
            boolean r7 = cm.l.a(r5, r7)
            if (r7 == 0) goto L_0x0087
            androidx.appcompat.widget.AppCompatEditText r5 = r4.I
            if (r5 != 0) goto L_0x0066
            cm.l.v(r0)
            r5 = r6
        L_0x0066:
            ld.c r7 = r4.z1()
            r1 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r3 = "label_challan_please_enter_challan_no"
            java.lang.String r7 = r7.b(r3, r1)
            r5.setError(r7)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.I
            if (r4 != 0) goto L_0x0082
        L_0x007e:
            cm.l.v(r0)
            goto L_0x0083
        L_0x0082:
            r6 = r4
        L_0x0083:
            r6.requestFocus()
            goto L_0x00cf
        L_0x0087:
            boolean r5 = cm.l.a(r5, r3)
            if (r5 == 0) goto L_0x00ae
            androidx.appcompat.widget.AppCompatEditText r5 = r4.I
            if (r5 != 0) goto L_0x0095
            cm.l.v(r0)
            r5 = r6
        L_0x0095:
            ld.c r7 = r4.z1()
            r1 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r3 = "label_challan_please_enter_vehicle_no"
            java.lang.String r7 = r7.b(r3, r1)
            r5.setError(r7)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.I
            if (r4 != 0) goto L_0x0082
            goto L_0x007e
        L_0x00ae:
            androidx.appcompat.widget.AppCompatEditText r5 = r4.I
            if (r5 != 0) goto L_0x00b6
            cm.l.v(r0)
            r5 = r6
        L_0x00b6:
            ld.c r7 = r4.z1()
            r1 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r3 = "label_challan_valid_dl_no"
            java.lang.String r7 = r7.b(r3, r1)
            r5.setError(r7)
            androidx.appcompat.widget.AppCompatEditText r4 = r4.I
            if (r4 != 0) goto L_0x0082
            goto L_0x007e
        L_0x00cf:
            return r2
        L_0x00d0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.PaymentSearchChallanList.K1(com.nic.mparivahan.Echallan.PaymentSearchChallanList, android.widget.TextView, int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: private */
    public static final void L1(PaymentSearchChallanList paymentSearchChallanList, View view) {
        l.f(paymentSearchChallanList, "this$0");
        paymentSearchChallanList.O1();
    }

    private final boolean N1() {
        Object systemService = getSystemService("connectivity");
        l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    private final void O1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void P1(List list) {
        db.d dVar = this.M;
        if (dVar == null) {
            l.v("adapter");
            dVar = null;
        }
        dVar.B(list);
        dVar.j();
    }

    /* access modifiers changed from: private */
    public static final void Y1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final boolean Z1() {
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
        if (l.a(this.V, "Challan")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText4 = this.I;
                if (appCompatEditText4 == null) {
                    l.v("numberEt");
                    appCompatEditText4 = null;
                }
                appCompatEditText4.setError(z1().b("label_challan_please_enter_challan_no", getString(R.string.please_enter_challan_no)));
                AppCompatEditText appCompatEditText5 = this.I;
                if (appCompatEditText5 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText5;
                }
                appCompatEditText2.requestFocus();
                return true;
            } else if (!M1(str)) {
                AppCompatEditText appCompatEditText6 = this.I;
                if (appCompatEditText6 == null) {
                    l.v("numberEt");
                    appCompatEditText6 = null;
                }
                appCompatEditText6.setError(z1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
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
                appCompatEditText8.setError(z1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
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
                appCompatEditText10.setError(z1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                AppCompatEditText appCompatEditText11 = this.I;
                if (appCompatEditText11 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText11;
                }
                appCompatEditText2.requestFocus();
                return true;
            }
        } else if (l.a(this.V, "RC")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText12 = this.I;
                if (appCompatEditText12 == null) {
                    l.v("numberEt");
                    appCompatEditText12 = null;
                }
                appCompatEditText12.setError(z1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
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
            if (length >= 0 && length < 4) {
                AppCompatEditText appCompatEditText14 = this.I;
                if (appCompatEditText14 == null) {
                    l.v("numberEt");
                    appCompatEditText14 = null;
                }
                appCompatEditText14.setError(z1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
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
                appCompatEditText16.setError(z1().b("label_challan_rc_validation", getString(R.string.rc_text)));
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
                appCompatEditText18.setError(z1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                AppCompatEditText appCompatEditText19 = this.I;
                if (appCompatEditText19 == null) {
                    l.v("numberEt");
                } else {
                    appCompatEditText2 = appCompatEditText19;
                }
                appCompatEditText2.requestFocus();
                return true;
            }
        } else if (l.a(this.V, "DL")) {
            if (obj.length() == 0) {
                AppCompatEditText appCompatEditText20 = this.I;
                if (appCompatEditText20 == null) {
                    l.v("numberEt");
                    appCompatEditText20 = null;
                }
                appCompatEditText20.setError(z1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
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
                appCompatEditText22.setError(z1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
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

    private final void s1() {
        if (N1()) {
            if (!l.a(this.V, "Challan")) {
                A1();
                x1();
            }
            v1();
            return;
        }
        X1(this, z1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARNING: type inference failed for: r0v23, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARNING: type inference failed for: r0v33, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARNING: type inference failed for: r0v48, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARNING: type inference failed for: r0v66, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARNING: type inference failed for: r0v84, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARNING: type inference failed for: r0v95, types: [androidx.recyclerview.widget.RecyclerView] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0227, code lost:
        if (r0 != 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x026a, code lost:
        if (r0 == 0) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0270, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02b5, code lost:
        if (r0 == 0) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02f7, code lost:
        if (r0 == 0) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (r0 == 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
        if (r0 != 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0199, code lost:
        if (r0 != 0) goto L_0x0075;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x021e  */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t1() {
        /*
            r15 = this;
            java.lang.String r0 = r15.V
            java.lang.String r1 = "Challan"
            boolean r0 = cm.l.a(r0, r1)
            java.lang.String r1 = " 0"
            r2 = 8
            java.lang.String r3 = "challanList"
            r4 = 0
            java.lang.String r5 = "noChallanFoundTv"
            r6 = 2132019267(0x7f140843, float:1.9676864E38)
            java.lang.String r7 = "label_challan_total"
            java.lang.String r8 = "totalChallan"
            r9 = 0
            if (r0 == 0) goto L_0x007b
            java.util.ArrayList r0 = r15.Y
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0062
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x002b
            cm.l.v(r5)
            r0 = r9
        L_0x002b:
            r0.setVisibility(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0036
            cm.l.v(r3)
            r0 = r9
        L_0x0036:
            r0.setVisibility(r2)
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x0041
            cm.l.v(r8)
            goto L_0x0042
        L_0x0041:
            r9 = r0
        L_0x0042:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ld.c r2 = r15.z1()
            java.lang.String r3 = r15.getString(r6)
            java.lang.String r2 = r2.b(r7, r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.setText(r0)
            goto L_0x02fb
        L_0x0062:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x006a
            cm.l.v(r5)
            r0 = r9
        L_0x006a:
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0075
        L_0x0071:
            cm.l.v(r3)
            goto L_0x0076
        L_0x0075:
            r9 = r0
        L_0x0076:
            r9.setVisibility(r4)
            goto L_0x02fb
        L_0x007b:
            int r0 = r15.Z
            r10 = 2132019268(0x7f140844, float:1.9676866E38)
            java.lang.String r11 = "label_challan_totals"
            r12 = 1
            r13 = 32
            if (r0 != 0) goto L_0x0110
            java.util.ArrayList r0 = r15.Y
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0110
            int r0 = r15.f8789a0
            if (r0 <= r12) goto L_0x00bf
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x009b
            cm.l.v(r8)
            r0 = r9
        L_0x009b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ld.c r6 = r15.z1()
            java.lang.String r7 = r15.getString(r10)
            java.lang.String r6 = r6.b(r11, r7)
        L_0x00ac:
            r1.append(r6)
            r1.append(r13)
            int r6 = r15.f8789a0
            r1.append(r6)
            java.lang.String r1 = r1.toString()
        L_0x00bb:
            r0.setText(r1)
            goto L_0x00ff
        L_0x00bf:
            if (r0 != 0) goto L_0x00e5
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x00c9
            cm.l.v(r8)
            r0 = r9
        L_0x00c9:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            ld.c r10 = r15.z1()
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r6 = r10.b(r7, r6)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            goto L_0x00bb
        L_0x00e5:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x00ed
            cm.l.v(r8)
            r0 = r9
        L_0x00ed:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ld.c r8 = r15.z1()
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r6 = r8.b(r7, r6)
            goto L_0x00ac
        L_0x00ff:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x0107
            cm.l.v(r5)
            r0 = r9
        L_0x0107:
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0075
            goto L_0x0071
        L_0x0110:
            int r0 = r15.Z
            if (r0 != r12) goto L_0x019d
            java.util.ArrayList r0 = r15.W
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x019d
            int r0 = r15.f8790b0
            if (r0 <= r12) goto L_0x014c
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x0128
            cm.l.v(r8)
            r0 = r9
        L_0x0128:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ld.c r6 = r15.z1()
            java.lang.String r7 = r15.getString(r10)
            java.lang.String r6 = r6.b(r11, r7)
        L_0x0139:
            r1.append(r6)
            r1.append(r13)
            int r6 = r15.f8790b0
            r1.append(r6)
            java.lang.String r1 = r1.toString()
        L_0x0148:
            r0.setText(r1)
            goto L_0x018c
        L_0x014c:
            if (r0 != 0) goto L_0x0172
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x0156
            cm.l.v(r8)
            r0 = r9
        L_0x0156:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            ld.c r10 = r15.z1()
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r6 = r10.b(r7, r6)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            goto L_0x0148
        L_0x0172:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x017a
            cm.l.v(r8)
            r0 = r9
        L_0x017a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ld.c r8 = r15.z1()
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r6 = r8.b(r7, r6)
            goto L_0x0139
        L_0x018c:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x0194
            cm.l.v(r5)
            r0 = r9
        L_0x0194:
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0075
            goto L_0x0071
        L_0x019d:
            int r0 = r15.Z
            r14 = 2
            if (r0 != r14) goto L_0x022b
            java.util.ArrayList r0 = r15.X
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x022b
            int r0 = r15.f8791c0
            if (r0 <= r12) goto L_0x01da
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x01b6
            cm.l.v(r8)
            r0 = r9
        L_0x01b6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ld.c r6 = r15.z1()
            java.lang.String r7 = r15.getString(r10)
            java.lang.String r6 = r6.b(r11, r7)
        L_0x01c7:
            r1.append(r6)
            r1.append(r13)
            int r6 = r15.f8791c0
            r1.append(r6)
            java.lang.String r1 = r1.toString()
        L_0x01d6:
            r0.setText(r1)
            goto L_0x021a
        L_0x01da:
            if (r0 != 0) goto L_0x0200
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x01e4
            cm.l.v(r8)
            r0 = r9
        L_0x01e4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            ld.c r10 = r15.z1()
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r6 = r10.b(r7, r6)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            goto L_0x01d6
        L_0x0200:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x0208
            cm.l.v(r8)
            r0 = r9
        L_0x0208:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            ld.c r8 = r15.z1()
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r6 = r8.b(r7, r6)
            goto L_0x01c7
        L_0x021a:
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x0222
            cm.l.v(r5)
            r0 = r9
        L_0x0222:
            r0.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0075
            goto L_0x0071
        L_0x022b:
            int r0 = r15.Z
            if (r0 != 0) goto L_0x0276
            java.util.ArrayList r0 = r15.Y
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0276
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x023f
            cm.l.v(r8)
            r0 = r9
        L_0x023f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            ld.c r10 = r15.z1()
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r6 = r10.b(r7, r6)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r0.setText(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x0265
            cm.l.v(r5)
            r0 = r9
        L_0x0265:
            r0.setVisibility(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0270
        L_0x026c:
            cm.l.v(r3)
            goto L_0x0271
        L_0x0270:
            r9 = r0
        L_0x0271:
            r9.setVisibility(r2)
            goto L_0x02fb
        L_0x0276:
            int r0 = r15.Z
            if (r0 != r12) goto L_0x02b8
            java.util.ArrayList r0 = r15.W
            int r0 = r0.size()
            if (r0 != 0) goto L_0x02b8
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x028a
            cm.l.v(r8)
            r0 = r9
        L_0x028a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            ld.c r10 = r15.z1()
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r6 = r10.b(r7, r6)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r0.setText(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x02b0
            cm.l.v(r5)
            r0 = r9
        L_0x02b0:
            r0.setVisibility(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0270
            goto L_0x026c
        L_0x02b8:
            int r0 = r15.Z
            if (r0 != r14) goto L_0x02fb
            java.util.ArrayList r0 = r15.X
            int r0 = r0.size()
            if (r0 != 0) goto L_0x02fb
            androidx.appcompat.widget.AppCompatTextView r0 = r15.K
            if (r0 != 0) goto L_0x02cc
            cm.l.v(r8)
            r0 = r9
        L_0x02cc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            ld.c r10 = r15.z1()
            java.lang.String r6 = r15.getString(r6)
            java.lang.String r6 = r10.b(r7, r6)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r0.setText(r1)
            androidx.appcompat.widget.AppCompatTextView r0 = r15.S
            if (r0 != 0) goto L_0x02f2
            cm.l.v(r5)
            r0 = r9
        L_0x02f2:
            r0.setVisibility(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r15.L
            if (r0 != 0) goto L_0x0270
            goto L_0x026c
        L_0x02fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.PaymentSearchChallanList.t1():void");
    }

    private final void v1() {
        ProgressBar progressBar = null;
        try {
            ProgressBar progressBar2 = this.N;
            if (progressBar2 == null) {
                l.v("progressBar");
                progressBar2 = null;
            }
            progressBar2.setVisibility(0);
            jb.c cVar = this.f8794f0;
            if (cVar == null) {
                l.v("viewModel");
                cVar = null;
            }
            cVar.g(this.V, this.U, 1);
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
            if (this.Z == 0) {
                t1();
            }
        }
    }

    private final void x1() {
        ProgressBar progressBar = null;
        try {
            ProgressBar progressBar2 = this.N;
            if (progressBar2 == null) {
                l.v("progressBar");
                progressBar2 = null;
            }
            progressBar2.setVisibility(0);
            jb.c cVar = this.f8794f0;
            if (cVar == null) {
                l.v("viewModel");
                cVar = null;
            }
            cVar.l(this.V, this.U, 1, 1);
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
            if (this.Z == 2) {
                t1();
            }
        }
    }

    public final int B1() {
        return this.f8790b0;
    }

    public final ArrayList C1() {
        return this.W;
    }

    public final int D1() {
        return this.Z;
    }

    public final boolean M1(String str) {
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

    public final void Q1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.Y = arrayList;
    }

    public final void R1(int i10) {
        this.f8789a0 = i10;
    }

    public final void S1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.X = arrayList;
    }

    public final void T1(int i10) {
        this.f8791c0 = i10;
    }

    public final void U1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.f8796h0 = cVar;
    }

    public final void V1(int i10) {
        this.f8790b0 = i10;
    }

    public final void W1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.W = arrayList;
    }

    public final void X1(Context context, String str) {
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
        textView.setText(z1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(z1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new n0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z7 c10 = z7.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.f8795g0 = c10;
        jb.c cVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        a.C0148a aVar = fb.a.f11584a;
        z7 z7Var = this.f8795g0;
        if (z7Var == null) {
            l.v("binding");
            z7Var = null;
        }
        aVar.b(this, z7Var);
        U1(new ld.c(this));
        String stringExtra = getIntent().getStringExtra("inputValue");
        l.c(stringExtra);
        this.U = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("inputType");
        l.c(stringExtra2);
        this.V = stringExtra2;
        this.f8793e0 = SearchChallanService.f8750a.d(this);
        z7 z7Var2 = this.f8795g0;
        if (z7Var2 == null) {
            l.v("binding");
            z7Var2 = null;
        }
        z7Var2.f29711m.f28308i.setText(z1().b("label_challan_payment_search", "Challan Payment"));
        E1();
        s1();
        jb.c cVar2 = this.f8794f0;
        if (cVar2 == null) {
            l.v("viewModel");
            cVar2 = null;
        }
        cVar2.i().g(this, new h(new b(this)));
        jb.c cVar3 = this.f8794f0;
        if (cVar3 == null) {
            l.v("viewModel");
            cVar3 = null;
        }
        cVar3.h().g(this, new h(new c(this)));
        jb.c cVar4 = this.f8794f0;
        if (cVar4 == null) {
            l.v("viewModel");
            cVar4 = null;
        }
        cVar4.u().g(this, new h(new d(this)));
        jb.c cVar5 = this.f8794f0;
        if (cVar5 == null) {
            l.v("viewModel");
            cVar5 = null;
        }
        cVar5.t().g(this, new h(new e(this)));
        jb.c cVar6 = this.f8794f0;
        if (cVar6 == null) {
            l.v("viewModel");
            cVar6 = null;
        }
        cVar6.n().g(this, new h(new f(this)));
        jb.c cVar7 = this.f8794f0;
        if (cVar7 == null) {
            l.v("viewModel");
        } else {
            cVar = cVar7;
        }
        cVar.m().g(this, new h(new g(this)));
    }

    public final ArrayList u1() {
        return this.Y;
    }

    public final ArrayList w1() {
        return this.X;
    }

    public final int y1() {
        return this.f8791c0;
    }

    public final ld.c z1() {
        ld.c cVar = this.f8796h0;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }
}
