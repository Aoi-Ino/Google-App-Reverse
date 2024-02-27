package com.nic.mparivahan.Tax;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.Model.BeforeResponse;
import com.nic.mparivahan.Tax.Model.CalculateTaxResponse;
import com.nic.mparivahan.Tax.Model.Latestpaytaxdetails;
import com.nic.mparivahan.Tax.Model.TaxCalModleItem;
import com.nic.mparivahan.Tax.Model.TaxDataFormat;
import com.nic.mparivahan.Tax.Model.TaxModes;
import com.nic.mparivahan.Tax.Model.TaxOwnerDetailsPuccPermit;
import com.nic.mparivahan.Tax.Model.TaxPurCdDescr;
import com.nic.mparivahan.Tax.ViewModel.PaytaxViewModel;
import com.nic.mparivahan.Tax.payment.TaxPaymentActivity;
import com.nic.mparivahan.VahanServices.Model.PermitDetailDto;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.SaveVahanlog;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ka.c;
import ni.l8;
import pl.x;
import sd.a;
import td.a;
import v9.e;

public final class PayTaxActivity extends androidx.appcompat.app.d implements View.OnClickListener, a.C0347a {
    /* access modifiers changed from: private */
    public l8 G;
    private PaytaxViewModel H;
    private PaytaxService I;
    public String J;
    public String K;
    public String L;
    public TaxDataFormat M;
    private int N;
    public bi.h O;
    public VahanProService P;
    public NrvDetails Q;
    public TaxOwnerDetailsPuccPermit R;
    private Double S = Double.valueOf(0.0d);
    private ArrayList T = new ArrayList();
    public sd.a U;
    private CalculateTaxResponse V;
    public ld.c W;
    private boolean X;
    public String Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private HashMap f20466a0 = new HashMap();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PayTaxActivity f20467e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(PayTaxActivity payTaxActivity) {
            super(1);
            this.f20467e = payTaxActivity;
        }

        public final void b(BeforeResponse beforeResponse) {
            l8 l8Var = null;
            try {
                l8 m12 = this.f20467e.G;
                if (m12 == null) {
                    cm.l.v("binding");
                    m12 = null;
                }
                m12.f27299t.setVisibility(8);
                this.f20467e.b2(beforeResponse.getReturnUrl());
            } catch (Exception e10) {
                e10.printStackTrace();
                l8 m13 = this.f20467e.G;
                if (m13 == null) {
                    cm.l.v("binding");
                } else {
                    l8Var = m13;
                }
                l8Var.f27299t.setVisibility(8);
                PayTaxActivity payTaxActivity = this.f20467e;
                payTaxActivity.M1(payTaxActivity, payTaxActivity.w1().b("please_try_after_some_time", this.f20467e.getString(R.string.please_try_after_some_time)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((BeforeResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PayTaxActivity f20468e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PayTaxActivity payTaxActivity) {
            super(1);
            this.f20468e = payTaxActivity;
        }

        public final void b(String str) {
            l8 l8Var = null;
            try {
                l8 m12 = this.f20468e.G;
                if (m12 == null) {
                    cm.l.v("binding");
                    m12 = null;
                }
                m12.f27299t.setVisibility(8);
                if (p.o(str, "Error", true)) {
                    PayTaxActivity payTaxActivity = this.f20468e;
                    payTaxActivity.M1(payTaxActivity, payTaxActivity.w1().b("unable_to_calculate_the_tax", this.f20468e.getString(R.string.unable_to_calculate_the_tax)));
                    return;
                }
                PayTaxActivity payTaxActivity2 = this.f20468e;
                payTaxActivity2.M1(payTaxActivity2, str.toString());
            } catch (Exception e10) {
                e10.printStackTrace();
                l8 m13 = this.f20468e.G;
                if (m13 == null) {
                    cm.l.v("binding");
                } else {
                    l8Var = m13;
                }
                l8Var.f27299t.setVisibility(8);
                PayTaxActivity payTaxActivity3 = this.f20468e;
                payTaxActivity3.M1(payTaxActivity3, payTaxActivity3.w1().b("please_try_after_some_time", this.f20468e.getString(R.string.please_try_after_some_time)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PayTaxActivity f20469e;

        c(PayTaxActivity payTaxActivity) {
            this.f20469e = payTaxActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l8 m12 = this.f20469e.G;
            if (m12 == null) {
                cm.l.v("binding");
                m12 = null;
            }
            Object selectedItem = m12.f27300u.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) selectedItem).intValue() != ((TaxCalModleItem) this.f20469e.B1().get(0)).getTimePeriod()) {
                int size = this.f20469e.B1().size();
                for (int i11 = 0; i11 < size; i11++) {
                    l8 m13 = this.f20469e.G;
                    if (m13 == null) {
                        cm.l.v("binding");
                        m13 = null;
                    }
                    Object selectedItem2 = m13.f27300u.getSelectedItem();
                    cm.l.d(selectedItem2, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) selectedItem2).intValue();
                    Object obj = this.f20469e.B1().get(i11);
                    cm.l.e(obj, "get(...)");
                    this.f20469e.B1().set(i11, TaxCalModleItem.copy$default((TaxCalModleItem) obj, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, intValue, 65535, (Object) null));
                }
                this.f20469e.C1().j();
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class d implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20470a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f20470a = lVar;
        }

        public final pl.c a() {
            return this.f20470a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20470a.invoke(obj);
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

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PayTaxActivity f20471e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f20472f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PayTaxActivity payTaxActivity, ArrayList arrayList) {
            super(1);
            this.f20471e = payTaxActivity;
            this.f20472f = arrayList;
        }

        public final void b(CalculateTaxResponse calculateTaxResponse) {
            l8 l8Var = null;
            if (calculateTaxResponse != null) {
                try {
                    this.f20471e.W1(calculateTaxResponse);
                    this.f20471e.q1(this.f20472f, calculateTaxResponse);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    l8 m12 = this.f20471e.G;
                    if (m12 == null) {
                        cm.l.v("binding");
                    } else {
                        l8Var = m12;
                    }
                    l8Var.f27299t.setVisibility(8);
                    PayTaxActivity payTaxActivity = this.f20471e;
                    payTaxActivity.M1(payTaxActivity, payTaxActivity.w1().b("please_try_after_some_time", this.f20471e.getString(R.string.please_try_after_some_time)));
                    return;
                }
            }
            l8 m13 = this.f20471e.G;
            if (m13 == null) {
                cm.l.v("binding");
                m13 = null;
            }
            m13.f27299t.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CalculateTaxResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PayTaxActivity f20473e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PayTaxActivity payTaxActivity) {
            super(1);
            this.f20473e = payTaxActivity;
        }

        public final void b(String str) {
            l8 m12 = this.f20473e.G;
            if (m12 == null) {
                cm.l.v("binding");
                m12 = null;
            }
            m12.f27299t.setVisibility(8);
            if (str != null && !cm.l.a(str, "")) {
                if (str.equals("Error")) {
                    PayTaxActivity payTaxActivity = this.f20473e;
                    payTaxActivity.M1(payTaxActivity, payTaxActivity.w1().b("unable_to_calculate_the_tax", this.f20473e.getString(R.string.unable_to_calculate_the_tax)));
                } else {
                    PayTaxActivity payTaxActivity2 = this.f20473e;
                    payTaxActivity2.M1(payTaxActivity2, str);
                }
                this.f20473e.I1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PayTaxActivity f20474e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f20475f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f20476g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f20477h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PayTaxActivity payTaxActivity, String str, String str2, String str3) {
            super(1);
            this.f20474e = payTaxActivity;
            this.f20475f = str;
            this.f20476g = str2;
            this.f20477h = str3;
        }

        public final void b(TaxDataFormat taxDataFormat) {
            l8 l8Var = null;
            try {
                PayTaxActivity payTaxActivity = this.f20474e;
                cm.l.c(taxDataFormat);
                payTaxActivity.Y1(taxDataFormat);
                this.f20474e.F1().v0(this.f20474e, this.f20475f, this.f20476g, String.valueOf(taxDataFormat.getPur_cd()), this.f20477h);
                PayTaxActivity payTaxActivity2 = this.f20474e;
                String pur_cd = payTaxActivity2.D1().getPur_cd();
                cm.l.c(pur_cd);
                payTaxActivity2.S1(Integer.parseInt(pur_cd));
                l8 m12 = this.f20474e.G;
                if (m12 == null) {
                    cm.l.v("binding");
                    m12 = null;
                }
                TextView textView = m12.D;
                ArrayList<TaxModes> listTaxModes = taxDataFormat.getListTaxModes();
                cm.l.c(listTaxModes);
                textView.setText(listTaxModes.get(0).getDescr());
                l8 m13 = this.f20474e.G;
                if (m13 == null) {
                    cm.l.v("binding");
                    m13 = null;
                }
                m13.F.setText(String.valueOf(taxDataFormat.getVh_class()));
            } catch (Exception e10) {
                e10.printStackTrace();
                l8 m14 = this.f20474e.G;
                if (m14 == null) {
                    cm.l.v("binding");
                } else {
                    l8Var = m14;
                }
                l8Var.f27299t.setVisibility(8);
                PayTaxActivity payTaxActivity3 = this.f20474e;
                payTaxActivity3.M1(payTaxActivity3, payTaxActivity3.w1().b("please_try_after_some_time", this.f20474e.getString(R.string.please_try_after_some_time)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TaxDataFormat) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PayTaxActivity f20478e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(PayTaxActivity payTaxActivity) {
            super(1);
            this.f20478e = payTaxActivity;
        }

        public final void b(String str) {
            l8 m12 = this.f20478e.G;
            if (m12 == null) {
                cm.l.v("binding");
                m12 = null;
            }
            m12.f27299t.setVisibility(8);
            if (p.o(str, "Error", true)) {
                PayTaxActivity payTaxActivity = this.f20478e;
                payTaxActivity.M1(payTaxActivity, payTaxActivity.w1().b("please_try_after_some_time", this.f20478e.getString(R.string.please_try_after_some_time)));
                return;
            }
            PayTaxActivity payTaxActivity2 = this.f20478e;
            payTaxActivity2.M1(payTaxActivity2, str.toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PayTaxActivity f20479e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(PayTaxActivity payTaxActivity) {
            super(1);
            this.f20479e = payTaxActivity;
        }

        public final void b(TaxOwnerDetailsPuccPermit taxOwnerDetailsPuccPermit) {
            l8 l8Var = null;
            try {
                l8 m12 = this.f20479e.G;
                if (m12 == null) {
                    cm.l.v("binding");
                    m12 = null;
                }
                m12.f27293n.setVisibility(0);
                PayTaxActivity payTaxActivity = this.f20479e;
                cm.l.c(taxOwnerDetailsPuccPermit);
                payTaxActivity.R1(taxOwnerDetailsPuccPermit);
                this.f20479e.T1(VContant.Companion.d(taxOwnerDetailsPuccPermit));
                l8 m13 = this.f20479e.G;
                if (m13 == null) {
                    cm.l.v("binding");
                    m13 = null;
                }
                m13.f27291l.setText(taxOwnerDetailsPuccPermit.getOwner_name());
                l8 m14 = this.f20479e.G;
                if (m14 == null) {
                    cm.l.v("binding");
                    m14 = null;
                }
                m14.F.setText(String.valueOf(taxOwnerDetailsPuccPermit.getVh_class_desc()));
                if (taxOwnerDetailsPuccPermit.getLatesttaxdetails() != null) {
                    l8 m15 = this.f20479e.G;
                    if (m15 == null) {
                        cm.l.v("binding");
                        m15 = null;
                    }
                    TextView textView = m15.E;
                    Latestpaytaxdetails latesttaxdetails = taxOwnerDetailsPuccPermit.getLatesttaxdetails();
                    cm.l.c(latesttaxdetails);
                    textView.setText(String.valueOf(latesttaxdetails.getTax_upto()));
                    l8 m16 = this.f20479e.G;
                    if (m16 == null) {
                        cm.l.v("binding");
                        m16 = null;
                    }
                    TextView textView2 = m16.C;
                    Latestpaytaxdetails latesttaxdetails2 = taxOwnerDetailsPuccPermit.getLatesttaxdetails();
                    cm.l.c(latesttaxdetails2);
                    textView2.setText(latesttaxdetails2.getRcpt_dt().toString());
                } else {
                    l8 m17 = this.f20479e.G;
                    if (m17 == null) {
                        cm.l.v("binding");
                        m17 = null;
                    }
                    m17.E.setText("--");
                    l8 m18 = this.f20479e.G;
                    if (m18 == null) {
                        cm.l.v("binding");
                        m18 = null;
                    }
                    m18.C.setText("--");
                }
                l8 m19 = this.f20479e.G;
                if (m19 == null) {
                    cm.l.v("binding");
                    m19 = null;
                }
                m19.f27299t.setVisibility(8);
                c.a aVar = ka.c.f13158a;
                PermitDetailDto permitDetailDto = taxOwnerDetailsPuccPermit.getPermitDetailDto();
                if (!aVar.m(permitDetailDto != null ? permitDetailDto.getPermitType() : null)) {
                    l8 m110 = this.f20479e.G;
                    if (m110 == null) {
                        cm.l.v("binding");
                        m110 = null;
                    }
                    TextView textView3 = m110.f27295p;
                    PermitDetailDto permitDetailDto2 = taxOwnerDetailsPuccPermit.getPermitDetailDto();
                    textView3.setText(permitDetailDto2 != null ? permitDetailDto2.getPermitType() : null);
                } else {
                    l8 m111 = this.f20479e.G;
                    if (m111 == null) {
                        cm.l.v("binding");
                        m111 = null;
                    }
                    m111.f27297r.setVisibility(4);
                }
                Latestpaytaxdetails latesttaxdetails3 = taxOwnerDetailsPuccPermit.getLatesttaxdetails();
                if (!aVar.m(String.valueOf(latesttaxdetails3 != null ? latesttaxdetails3.getTax_from() : null))) {
                    l8 m112 = this.f20479e.G;
                    if (m112 == null) {
                        cm.l.v("binding");
                        m112 = null;
                    }
                    TextView textView4 = m112.G;
                    Latestpaytaxdetails latesttaxdetails4 = taxOwnerDetailsPuccPermit.getLatesttaxdetails();
                    textView4.setText(String.valueOf(latesttaxdetails4 != null ? latesttaxdetails4.getTax_from() : null));
                } else {
                    l8 m113 = this.f20479e.G;
                    if (m113 == null) {
                        cm.l.v("binding");
                        m113 = null;
                    }
                    m113.G.setText("--");
                }
                Latestpaytaxdetails latesttaxdetails5 = taxOwnerDetailsPuccPermit.getLatesttaxdetails();
                if (!aVar.m(String.valueOf(latesttaxdetails5 != null ? latesttaxdetails5.getTax_amt() : null))) {
                    l8 m114 = this.f20479e.G;
                    if (m114 == null) {
                        cm.l.v("binding");
                        m114 = null;
                    }
                    TextView textView5 = m114.f27283d;
                    Latestpaytaxdetails latesttaxdetails6 = taxOwnerDetailsPuccPermit.getLatesttaxdetails();
                    textView5.setText(String.valueOf(latesttaxdetails6 != null ? latesttaxdetails6.getTax_amt() : null));
                } else {
                    l8 m115 = this.f20479e.G;
                    if (m115 == null) {
                        cm.l.v("binding");
                        m115 = null;
                    }
                    m115.f27283d.setText("--");
                }
                PayTaxActivity payTaxActivity2 = this.f20479e;
                payTaxActivity2.H1(payTaxActivity2.D1());
            } catch (Exception e10) {
                e10.printStackTrace();
                l8 m116 = this.f20479e.G;
                if (m116 == null) {
                    cm.l.v("binding");
                } else {
                    l8Var = m116;
                }
                l8Var.f27299t.setVisibility(8);
                PayTaxActivity payTaxActivity3 = this.f20479e;
                payTaxActivity3.M1(payTaxActivity3, payTaxActivity3.w1().b("please_try_after_some_time", this.f20479e.getString(R.string.please_try_after_some_time)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TaxOwnerDetailsPuccPermit) obj);
            return x.f30437a;
        }
    }

    static final class j extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PayTaxActivity f20480e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(PayTaxActivity payTaxActivity) {
            super(1);
            this.f20480e = payTaxActivity;
        }

        public final void b(String str) {
            l8 m12 = this.f20480e.G;
            if (m12 == null) {
                cm.l.v("binding");
                m12 = null;
            }
            m12.f27299t.setVisibility(8);
            PayTaxActivity payTaxActivity = this.f20480e;
            payTaxActivity.M1(payTaxActivity, payTaxActivity.w1().b("please_try_after_some_time", this.f20480e.getString(R.string.please_try_after_some_time)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(PayTaxActivity payTaxActivity, View view) {
        cm.l.f(payTaxActivity, "this$0");
        Intent intent = new Intent(payTaxActivity, PayTaxActivity.class);
        intent.putExtra("RC", payTaxActivity.z1());
        intent.putExtra("State", payTaxActivity.A1());
        intent.putExtra("map", payTaxActivity.f20466a0);
        intent.putExtra("off_code", payTaxActivity.x1());
        intent.putExtra("chassis_no", payTaxActivity.u1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, payTaxActivity.Z);
        intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
        intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
        payTaxActivity.startActivity(intent);
        payTaxActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void I1() {
        l8 l8Var = this.G;
        if (l8Var == null) {
            cm.l.v("binding");
            l8Var = null;
        }
        l8Var.f27282c.setText(w1().b("btn_calculate_tax", getString(R.string.calculate_tax)));
        l8 l8Var2 = this.G;
        if (l8Var2 == null) {
            cm.l.v("binding");
            l8Var2 = null;
        }
        l8Var2.f27285f.setVisibility(8);
        l8 l8Var3 = this.G;
        if (l8Var3 == null) {
            cm.l.v("binding");
            l8Var3 = null;
        }
        l8Var3.P.setVisibility(8);
        PaytaxViewModel paytaxViewModel = this.H;
        if (paytaxViewModel == null) {
            cm.l.v("viewModel");
            paytaxViewModel = null;
        }
        paytaxViewModel.n().k((Object) null);
        PaytaxViewModel paytaxViewModel2 = this.H;
        if (paytaxViewModel2 == null) {
            cm.l.v("viewModel");
            paytaxViewModel2 = null;
        }
        paytaxViewModel2.p().k((Object) null);
    }

    /* access modifiers changed from: private */
    public static final void K1(Dialog dialog, PayTaxActivity payTaxActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(payTaxActivity, "this$0");
        dialog.dismiss();
        CalculateTaxResponse calculateTaxResponse = payTaxActivity.V;
        if (calculateTaxResponse != null) {
            payTaxActivity.p1(calculateTaxResponse);
        }
    }

    /* access modifiers changed from: private */
    public static final void L1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void N1(Dialog dialog, PayTaxActivity payTaxActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(payTaxActivity, "this$0");
        dialog.dismiss();
        payTaxActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void b2(String str) {
        try {
            SaveVahanlog.a aVar = SaveVahanlog.f20959k;
            NrvDetails y12 = y1();
            boolean z10 = this.Z;
            String substring = z1().substring(0, 4);
            cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            aVar.a(this, y12, z10, " ", VContant.Tax_PURPOSE_CODE, substring);
        } catch (Exception e10) {
            try {
                e10.printStackTrace();
            } catch (Exception unused) {
                return;
            }
        }
        Intent intent = new Intent(this, TaxPaymentActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("RcDetails", y1());
        startActivity(intent);
        finish();
    }

    private final void c2(ArrayList arrayList) {
        PaytaxViewModel paytaxViewModel;
        l8 l8Var = this.G;
        PaytaxViewModel paytaxViewModel2 = null;
        if (l8Var == null) {
            cm.l.v("binding");
            l8Var = null;
        }
        l8Var.f27299t.setVisibility(0);
        PaytaxViewModel paytaxViewModel3 = this.H;
        if (paytaxViewModel3 == null) {
            cm.l.v("viewModel");
            paytaxViewModel = null;
        } else {
            paytaxViewModel = paytaxViewModel3;
        }
        String A1 = A1();
        String z12 = z1();
        a.C0353a aVar = td.a.f31331a;
        String b10 = aVar.b(arrayList);
        String a10 = aVar.a(arrayList);
        l8 l8Var2 = this.G;
        if (l8Var2 == null) {
            cm.l.v("binding");
            l8Var2 = null;
        }
        paytaxViewModel.t(A1, z12, b10, a10, l8Var2.f27300u.getSelectedItem().toString());
        PaytaxViewModel paytaxViewModel4 = this.H;
        if (paytaxViewModel4 == null) {
            cm.l.v("viewModel");
            paytaxViewModel4 = null;
        }
        paytaxViewModel4.r().g(this, new d(new e(this, arrayList)));
        PaytaxViewModel paytaxViewModel5 = this.H;
        if (paytaxViewModel5 == null) {
            cm.l.v("viewModel");
        } else {
            paytaxViewModel2 = paytaxViewModel5;
        }
        paytaxViewModel2.n().g(this, new d(new f(this)));
    }

    private final void d2(String str, String str2, String str3) {
        l8 l8Var = this.G;
        PaytaxViewModel paytaxViewModel = null;
        if (l8Var == null) {
            cm.l.v("binding");
            l8Var = null;
        }
        l8Var.f27299t.setVisibility(0);
        PaytaxViewModel paytaxViewModel2 = this.H;
        if (paytaxViewModel2 == null) {
            cm.l.v("viewModel");
            paytaxViewModel2 = null;
        }
        paytaxViewModel2.u(str, str2, str3);
        PaytaxViewModel paytaxViewModel3 = this.H;
        if (paytaxViewModel3 == null) {
            cm.l.v("viewModel");
            paytaxViewModel3 = null;
        }
        paytaxViewModel3.q().g(this, new d(new g(this, str2, str, str3)));
        PaytaxViewModel paytaxViewModel4 = this.H;
        if (paytaxViewModel4 == null) {
            cm.l.v("viewModel");
        } else {
            paytaxViewModel = paytaxViewModel4;
        }
        paytaxViewModel.k().g(this, new d(new h(this)));
        F1().Y0().g(this, new d(new i(this)));
        F1().X0().g(this, new d(new j(this)));
    }

    private final void e2() {
        try {
            if (y1() != null) {
                Intent intent = new Intent(this, VahanVehicleDetailsService.class);
                intent.putExtra("RC", z1());
                intent.putExtra("RcDetails", y1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                startActivity(intent);
            }
        } catch (Exception unused) {
            M1(this, w1().b("please_try_after_some_time", getString(R.string.please_try_after_some_time)));
        }
    }

    private final void p1(CalculateTaxResponse calculateTaxResponse) {
        l8 l8Var = this.G;
        PaytaxViewModel paytaxViewModel = null;
        if (l8Var == null) {
            cm.l.v("binding");
            l8Var = null;
        }
        l8Var.f27299t.setVisibility(0);
        PaytaxViewModel paytaxViewModel2 = this.H;
        if (paytaxViewModel2 == null) {
            cm.l.v("viewModel");
            paytaxViewModel2 = null;
        }
        paytaxViewModel2.v(calculateTaxResponse);
        PaytaxViewModel paytaxViewModel3 = this.H;
        if (paytaxViewModel3 == null) {
            cm.l.v("viewModel");
            paytaxViewModel3 = null;
        }
        paytaxViewModel3.j().g(this, new d(new a(this)));
        PaytaxViewModel paytaxViewModel4 = this.H;
        if (paytaxViewModel4 == null) {
            cm.l.v("viewModel");
        } else {
            paytaxViewModel = paytaxViewModel4;
        }
        paytaxViewModel.m().g(this, new d(new b(this)));
    }

    /* access modifiers changed from: private */
    public final void q1(ArrayList arrayList, CalculateTaxResponse calculateTaxResponse) {
        ArrayList arrayList2 = arrayList;
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                String pur_CD = ((TaxCalModleItem) arrayList2.get(i10)).getPur_CD();
                int size2 = calculateTaxResponse.getTaxGroupDetails().size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    } else if (p.o(pur_CD, String.valueOf(calculateTaxResponse.getTaxGroupDetails().get(i11).getPur_CD()), true)) {
                        double amount1 = calculateTaxResponse.getTaxGroupDetails().get(i11).getAmount1();
                        double penalty = calculateTaxResponse.getTaxGroupDetails().get(i11).getPenalty();
                        double fine = calculateTaxResponse.getTaxGroupDetails().get(i11).getFine();
                        double amount = calculateTaxResponse.getTaxGroupDetails().get(i11).getAmount();
                        double surcharge = calculateTaxResponse.getTaxGroupDetails().get(i11).getSurcharge();
                        double rebate = calculateTaxResponse.getTaxGroupDetails().get(i11).getRebate();
                        double interest = calculateTaxResponse.getTaxGroupDetails().get(i11).getInterest();
                        double gamount = calculateTaxResponse.getTaxGroupDetails().get(i11).getGamount();
                        String tax_UPTO = calculateTaxResponse.getTaxGroupDetails().get(i11).getTax_UPTO();
                        String tax_FROM = calculateTaxResponse.getTaxGroupDetails().get(i11).getTax_FROM();
                        Object obj = arrayList2.get(i10);
                        cm.l.e(obj, "get(...)");
                        arrayList2.set(i10, TaxCalModleItem.copy$default((TaxCalModleItem) obj, amount, amount1, 0.0d, true, fine, gamount, interest, penalty, rebate, surcharge, tax_FROM, (String) null, (String) null, tax_UPTO, (ArrayList) null, (String) null, 0, 120836, (Object) null));
                        C1().k(i10);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        l8 l8Var = this.G;
        l8 l8Var2 = null;
        if (l8Var == null) {
            cm.l.v("binding");
            l8Var = null;
        }
        l8Var.f27285f.setText(String.valueOf(calculateTaxResponse.getFinalTaxAmount()));
        l8 l8Var3 = this.G;
        if (l8Var3 == null) {
            cm.l.v("binding");
            l8Var3 = null;
        }
        l8Var3.f27285f.setVisibility(0);
        l8 l8Var4 = this.G;
        if (l8Var4 == null) {
            cm.l.v("binding");
            l8Var4 = null;
        }
        l8Var4.P.setVisibility(0);
        l8 l8Var5 = this.G;
        if (l8Var5 == null) {
            cm.l.v("binding");
            l8Var5 = null;
        }
        l8Var5.f27305z.setVisibility(0);
        l8 l8Var6 = this.G;
        if (l8Var6 == null) {
            cm.l.v("binding");
            l8Var6 = null;
        }
        l8Var6.Q.setVisibility(0);
        l8 l8Var7 = this.G;
        if (l8Var7 == null) {
            cm.l.v("binding");
            l8Var7 = null;
        }
        l8Var7.R.setVisibility(0);
        l8 l8Var8 = this.G;
        if (l8Var8 == null) {
            cm.l.v("binding");
            l8Var8 = null;
        }
        l8Var8.L.setVisibility(0);
        l8 l8Var9 = this.G;
        if (l8Var9 == null) {
            cm.l.v("binding");
            l8Var9 = null;
        }
        l8Var9.M.setVisibility(0);
        l8 l8Var10 = this.G;
        if (l8Var10 == null) {
            cm.l.v("binding");
            l8Var10 = null;
        }
        l8Var10.R.setText(String.valueOf(calculateTaxResponse.getUserChrg()));
        l8 l8Var11 = this.G;
        if (l8Var11 == null) {
            cm.l.v("binding");
            l8Var11 = null;
        }
        l8Var11.M.setText(String.valueOf(calculateTaxResponse.getTotalTransactionChrg()));
        l8 l8Var12 = this.G;
        if (l8Var12 == null) {
            cm.l.v("binding");
            l8Var12 = null;
        }
        l8Var12.f27300u.setEnabled(false);
        this.X = true;
        l8 l8Var13 = this.G;
        if (l8Var13 == null) {
            cm.l.v("binding");
            l8Var13 = null;
        }
        l8Var13.f27302w.setEnabled(true);
        l8 l8Var14 = this.G;
        if (l8Var14 == null) {
            cm.l.v("binding");
            l8Var14 = null;
        }
        l8Var14.f27302w.setAlpha(1.0f);
        if (p.o(new ld.h(this).c(), VContant.PAY_TAX_ASS_CODE, true)) {
            l8 l8Var15 = this.G;
            if (l8Var15 == null) {
                cm.l.v("binding");
            } else {
                l8Var2 = l8Var15;
            }
            l8Var2.f27282c.setVisibility(8);
            return;
        }
        l8 l8Var16 = this.G;
        if (l8Var16 == null) {
            cm.l.v("binding");
        } else {
            l8Var2 = l8Var16;
        }
        l8Var2.f27282c.setText(w1().b("btn_pay_now", getString(R.string.pay_now)));
    }

    /* access modifiers changed from: private */
    public static final void s1(Dialog dialog, PayTaxActivity payTaxActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(payTaxActivity, "this$0");
        dialog.dismiss();
        payTaxActivity.c2(payTaxActivity.T);
    }

    /* access modifiers changed from: private */
    public static final void t1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final String A1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        cm.l.v("state_cd");
        return null;
    }

    public final ArrayList B1() {
        return this.T;
    }

    public final sd.a C1() {
        sd.a aVar = this.U;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("taxDetailsAdapter");
        return null;
    }

    public final TaxDataFormat D1() {
        TaxDataFormat taxDataFormat = this.M;
        if (taxDataFormat != null) {
            return taxDataFormat;
        }
        cm.l.v("taxpurdesc");
        return null;
    }

    public final VahanProService E1() {
        VahanProService vahanProService = this.P;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("vahanService");
        return null;
    }

    public final bi.h F1() {
        bi.h hVar = this.O;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("vahanViewModle");
        return null;
    }

    public final void G0() {
        ld.h hVar = new ld.h(this);
        l8 l8Var = this.G;
        l8 l8Var2 = null;
        if (l8Var == null) {
            cm.l.v("binding");
            l8Var = null;
        }
        l8Var.S.setText(VContant.Companion.l(this, hVar));
        d2(A1(), z1(), u1());
        l8 l8Var3 = this.G;
        if (l8Var3 == null) {
            cm.l.v("binding");
            l8Var3 = null;
        }
        AppCompatTextView appCompatTextView = l8Var3.X;
        l8 l8Var4 = this.G;
        if (l8Var4 == null) {
            cm.l.v("binding");
            l8Var4 = null;
        }
        appCompatTextView.setPaintFlags(l8Var4.X.getPaintFlags() | 8);
        l8 l8Var5 = this.G;
        if (l8Var5 == null) {
            cm.l.v("binding");
            l8Var5 = null;
        }
        l8Var5.f27294o.setText(w1().b("owner_current_tax_details", getString(R.string.owner_current_tax_details)));
        l8 l8Var6 = this.G;
        if (l8Var6 == null) {
            cm.l.v("binding");
            l8Var6 = null;
        }
        l8Var6.f27282c.setOnClickListener(this);
        l8 l8Var7 = this.G;
        if (l8Var7 == null) {
            cm.l.v("binding");
            l8Var7 = null;
        }
        l8Var7.D.setOnClickListener(this);
        l8 l8Var8 = this.G;
        if (l8Var8 == null) {
            cm.l.v("binding");
            l8Var8 = null;
        }
        l8Var8.f27289j.setOnClickListener(this);
        l8 l8Var9 = this.G;
        if (l8Var9 == null) {
            cm.l.v("binding");
            l8Var9 = null;
        }
        l8Var9.X.setOnClickListener(this);
        l8 l8Var10 = this.G;
        if (l8Var10 == null) {
            cm.l.v("binding");
            l8Var10 = null;
        }
        l8Var10.U.setText(z1());
        l8 l8Var11 = this.G;
        if (l8Var11 == null) {
            cm.l.v("binding");
            l8Var11 = null;
        }
        l8Var11.f27285f.setVisibility(8);
        l8 l8Var12 = this.G;
        if (l8Var12 == null) {
            cm.l.v("binding");
            l8Var12 = null;
        }
        l8Var12.P.setVisibility(8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        l8 l8Var13 = this.G;
        if (l8Var13 == null) {
            cm.l.v("binding");
            l8Var13 = null;
        }
        l8Var13.f27305z.setLayoutManager(linearLayoutManager);
        l8 l8Var14 = this.G;
        if (l8Var14 == null) {
            cm.l.v("binding");
            l8Var14 = null;
        }
        l8Var14.f27305z.setNestedScrollingEnabled(false);
        if (!this.X) {
            l8 l8Var15 = this.G;
            if (l8Var15 == null) {
                cm.l.v("binding");
                l8Var15 = null;
            }
            l8Var15.f27302w.setEnabled(false);
            l8 l8Var16 = this.G;
            if (l8Var16 == null) {
                cm.l.v("binding");
                l8Var16 = null;
            }
            l8Var16.f27302w.setAlpha(0.5f);
        }
        l8 l8Var17 = this.G;
        if (l8Var17 == null) {
            cm.l.v("binding");
            l8Var17 = null;
        }
        l8Var17.f27302w.setOnClickListener(new rd.f(this));
        l8 l8Var18 = this.G;
        if (l8Var18 == null) {
            cm.l.v("binding");
        } else {
            l8Var2 = l8Var18;
        }
        Spinner spinner = l8Var2.f27300u;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new c(this));
        }
    }

    public final void H1(TaxDataFormat taxDataFormat) {
        cm.l.f(taxDataFormat, "taxpurdesc");
        try {
            List<TaxPurCdDescr> taxPurCdDesc = taxDataFormat.getTaxPurCdDesc();
            cm.l.c(taxPurCdDesc);
            if (taxPurCdDesc.size() > 0) {
                sd.b bVar = new sd.b(this, td.a.f31331a.c());
                l8 l8Var = this.G;
                l8 l8Var2 = null;
                if (l8Var == null) {
                    cm.l.v("binding");
                    l8Var = null;
                }
                l8Var.f27300u.setAdapter(bVar);
                l8 l8Var3 = this.G;
                if (l8Var3 == null) {
                    cm.l.v("binding");
                    l8Var3 = null;
                }
                l8Var3.H.setLayoutManager(new LinearLayoutManager(this, 1, false));
                ArrayList v12 = v1(taxDataFormat);
                this.T = v12;
                X1(new sd.a(v12, this, this));
                l8 l8Var4 = this.G;
                if (l8Var4 == null) {
                    cm.l.v("binding");
                } else {
                    l8Var2 = l8Var4;
                }
                l8Var2.H.setAdapter(C1());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void J1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ld.c cVar = new ld.c(context);
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        textView.setOnClickListener(new rd.b(dialog, this));
        textView2.setOnClickListener(new rd.c(dialog));
        dialog.show();
    }

    public final void M1(Context context, String str) {
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
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ld.c cVar = new ld.c(context);
        ((TextView) findViewById3).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new rd.g(dialog, this));
        dialog.show();
    }

    public final void O1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void P1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.W = cVar;
    }

    public final void Q1(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void R1(TaxOwnerDetailsPuccPermit taxOwnerDetailsPuccPermit) {
        cm.l.f(taxOwnerDetailsPuccPermit, "<set-?>");
        this.R = taxOwnerDetailsPuccPermit;
    }

    public final void S1(int i10) {
        this.N = i10;
    }

    public final void T1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.Q = nrvDetails;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.J = str;
    }

    public final void W1(CalculateTaxResponse calculateTaxResponse) {
        this.V = calculateTaxResponse;
    }

    public final void X1(sd.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.U = aVar;
    }

    public final void Y1(TaxDataFormat taxDataFormat) {
        cm.l.f(taxDataFormat, "<set-?>");
        this.M = taxDataFormat;
    }

    public final void Z1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.P = vahanProService;
    }

    public final void a2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.O = hVar;
    }

    public void onClick(View view) {
        String b10;
        l8 l8Var = null;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.nexgenarrow) {
            onBackPressed();
        } else if (valueOf != null && valueOf.intValue() == R.id.view_vehicle_detail) {
            e2();
        } else if (valueOf != null && valueOf.intValue() == R.id.calculatetax) {
            l8 l8Var2 = this.G;
            if (l8Var2 == null) {
                cm.l.v("binding");
            } else {
                l8Var = l8Var2;
            }
            String obj = l8Var.D.getText().toString();
            if (obj != null && !p.q(obj)) {
                if (!this.X) {
                    a.C0353a aVar = td.a.f31331a;
                    if (!aVar.e(this.T)) {
                        b10 = w1().b("please_select_tax_mode", getString(R.string.plz_select_taxmodevalue));
                    } else if (aVar.f(this.T)) {
                        r1(this, w1().b("are_you_sure_you_want_to_Calcualte", getString(R.string.are_you_sure_you_want_to_calcualte)));
                        return;
                    } else {
                        b10 = aVar.d(this.T, this);
                    }
                    Toast.makeText(this, b10, 0).show();
                    return;
                }
                J1(this, w1().b("are_you_sure_you_want_to_make_payment", getString(R.string.are_you_sure_you_want_to_make_payment)));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l8 c10 = l8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        PaytaxService paytaxService = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        getWindow().addFlags(128);
        e.a aVar = v9.e.f17509a;
        l8 l8Var = this.G;
        if (l8Var == null) {
            cm.l.v("binding");
            l8Var = null;
        }
        aVar.z1(this, l8Var);
        V1(String.valueOf(getIntent().getStringExtra("State")));
        U1(String.valueOf(getIntent().getStringExtra("RC")));
        O1(String.valueOf(getIntent().getStringExtra("chassis_no")));
        Q1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.Z = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        HashMap hashMap = (HashMap) getIntent().getSerializableExtra("map");
        cm.l.c(hashMap);
        this.f20466a0 = hashMap;
        this.I = PaytaxService.f20481a.a(this);
        Z1(VahanProService.f21196b.b(this));
        PaytaxService paytaxService2 = this.I;
        if (paytaxService2 == null) {
            cm.l.v("retrofitService");
        } else {
            paytaxService = paytaxService2;
        }
        this.H = (PaytaxViewModel) new u0((x0) this, (u0.b) new rd.a(new rd.h(paytaxService))).a(PaytaxViewModel.class);
        a2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(E1()))).a(bi.h.class));
        P1(new ld.c(this));
        G0();
    }

    public void r(int i10, String str) {
        int i11 = i10;
        cm.l.f(str, "taxMode");
        Object obj = this.T.get(i11);
        cm.l.e(obj, "get(...)");
        this.T.set(i11, TaxCalModleItem.copy$default((TaxCalModleItem) obj, 0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (String) null, (String) null, str, (String) null, (ArrayList) null, (String) null, 0, 126975, (Object) null));
        C1().k(i11);
    }

    public final void r1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ld.c cVar = new ld.c(context);
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new rd.d(dialog, this));
        textView2.setOnClickListener(new rd.e(dialog));
        dialog.show();
    }

    public final String u1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("chassis_no");
        return null;
    }

    public final ArrayList v1(TaxDataFormat taxDataFormat) {
        cm.l.f(taxDataFormat, "taxpurdesc");
        ArrayList arrayList = new ArrayList();
        List<TaxPurCdDescr> taxPurCdDesc = taxDataFormat.getTaxPurCdDesc();
        cm.l.c(taxPurCdDesc);
        int size = taxPurCdDesc.size();
        for (int i10 = 0; i10 < size; i10++) {
            l8 l8Var = null;
            if (taxDataFormat.getTaxPurCdDesc().get(i10).getPur_code().equals("81")) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new TaxModes("YEARLY", "Y"));
                l8 l8Var2 = this.G;
                if (l8Var2 == null) {
                    cm.l.v("binding");
                } else {
                    l8Var = l8Var2;
                }
                ArrayList arrayList3 = arrayList2;
                arrayList.add(new TaxCalModleItem(0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, "", taxDataFormat.getTaxPurCdDesc().get(i10).getDescr(), "0", "", arrayList3, taxDataFormat.getTaxPurCdDesc().get(i10).getPur_code(), Integer.parseInt(l8Var.f27300u.getSelectedItem().toString())));
            } else {
                l8 l8Var3 = this.G;
                if (l8Var3 == null) {
                    cm.l.v("binding");
                } else {
                    l8Var = l8Var3;
                }
                TaxCalModleItem taxCalModleItem = r6;
                TaxCalModleItem taxCalModleItem2 = new TaxCalModleItem(0.0d, 0.0d, 0.0d, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, "", taxDataFormat.getTaxPurCdDesc().get(i10).getDescr(), "0", "", taxDataFormat.getTaxPurCdDesc().get(i10).getListTaxModes(), taxDataFormat.getTaxPurCdDesc().get(i10).getPur_code(), Integer.parseInt(l8Var.f27300u.getSelectedItem().toString()));
                arrayList.add(taxCalModleItem);
            }
        }
        return arrayList;
    }

    public final ld.c w1() {
        ld.c cVar = this.W;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final String x1() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final NrvDetails y1() {
        NrvDetails nrvDetails = this.Q;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcDetails");
        return null;
    }

    public final String z1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("regn_no");
        return null;
    }
}
