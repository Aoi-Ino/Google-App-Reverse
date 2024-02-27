package com.nic.mparivahan.VahanServices.AlterationOfVehicle;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel.AOVModel;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel.ApiMessage;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVModel.VmFuel;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.AOVSaveToDraftReponse;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.AOVSaveToDraftRequest;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.Data;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVServices.AOVSaveToDraftService;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVServices.AOVServices;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.c;
import ni.v8;
import pl.x;

public final class VahanAlterationOfVehicle extends androidx.appcompat.app.d {
    public v8 G;
    public ae.b H;
    public AOVServices I;
    public ae.a J;
    public AOVSaveToDraftService K;
    public ld.c L;
    public ProgressDialog M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    public String Y;
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f20526a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f20527b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f20528c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f20529d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f20530e0;

    /* renamed from: f0  reason: collision with root package name */
    public String f20531f0;

    /* renamed from: g0  reason: collision with root package name */
    public String f20532g0;

    /* renamed from: h0  reason: collision with root package name */
    public String f20533h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f20534i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f20535j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f20536k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f20537l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f20538m0;

    /* renamed from: n0  reason: collision with root package name */
    public NrvDetails f20539n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f20540o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f20541p0;

    /* renamed from: q0  reason: collision with root package name */
    public String f20542q0;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f20543r0;

    /* renamed from: s0  reason: collision with root package name */
    private ArrayList f20544s0 = new ArrayList();

    /* renamed from: t0  reason: collision with root package name */
    private ArrayList f20545t0 = new ArrayList();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanAlterationOfVehicle f20546e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanAlterationOfVehicle vahanAlterationOfVehicle) {
            super(1);
            this.f20546e = vahanAlterationOfVehicle;
        }

        public final void b(AOVModel aOVModel) {
            try {
                this.f20546e.S1().dismiss();
                ApiMessage apiMessage = aOVModel.getApiMessage();
                if (apiMessage != null && apiMessage.getStatusCode() == 200) {
                    VahanAlterationOfVehicle vahanAlterationOfVehicle = this.f20546e;
                    vahanAlterationOfVehicle.w2(vahanAlterationOfVehicle.q1(String.valueOf(aOVModel.getData().getOwnerInfo().getFitupto())));
                    VahanAlterationOfVehicle vahanAlterationOfVehicle2 = this.f20546e;
                    vahanAlterationOfVehicle2.x2(vahanAlterationOfVehicle2.s1(String.valueOf(aOVModel.getData().getOwnerInfo().getFloorarea())));
                    VahanAlterationOfVehicle vahanAlterationOfVehicle3 = this.f20546e;
                    vahanAlterationOfVehicle3.A2(vahanAlterationOfVehicle3.s1(String.valueOf(aOVModel.getData().getOwnerInfo().getGcw())));
                    this.f20546e.I2(String.valueOf(aOVModel.getData().getOwnerInfo().getOpdt()));
                    this.f20546e.Q2(String.valueOf(aOVModel.getData().getOwnerInfo().getVchcatg()));
                    VahanAlterationOfVehicle vahanAlterationOfVehicle4 = this.f20546e;
                    vahanAlterationOfVehicle4.R2(vahanAlterationOfVehicle4.s1(String.valueOf(aOVModel.getData().getOwnerInfo().getVhclass())));
                    this.f20546e.C1().f29021f.setText(this.f20546e.q1(String.valueOf(aOVModel.getData().getOwnerInfo().getBodytype())));
                    this.f20546e.C1().C.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getSeatcap())));
                    this.f20546e.C1().E.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getSleepercap())));
                    c.a aVar = ka.c.f13158a;
                    if (aVar.m(String.valueOf(aOVModel.getData().getOwnerInfo().getSeatcap()))) {
                        this.f20546e.C1().C.setText("0");
                    }
                    if (aVar.m(String.valueOf(aOVModel.getData().getOwnerInfo().getSleepercap()))) {
                        this.f20546e.C1().E.setText("0");
                    }
                    this.f20546e.C1().G.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getStandcap())));
                    this.f20546e.C1().f29038w.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getNocyl())));
                    this.f20546e.C1().J.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getUnldwt())));
                    this.f20546e.C1().f29034s.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getLdwt())));
                    this.f20546e.C1().f29032q.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getHp())));
                    ArrayList Z1 = this.f20546e.Z1();
                    Z1.add(0, "Select Fuel");
                    this.f20546e.C1().f29028m.setAdapter(new re.b(this.f20546e, Z1));
                    this.f20546e.C1().f29028m.setSelection(this.f20546e.t1(aOVModel.getData().getVmFuel(), aOVModel.getData().getOwnerInfo().getFuel()));
                    this.f20546e.C1().f29024i.setText(this.f20546e.q1(String.valueOf(aOVModel.getData().getOwnerInfo().getColor())));
                    this.f20546e.C1().P.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getWheelbase())));
                    this.f20546e.C1().f29026k.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getCubiccap())));
                    int unused = this.f20546e.j2(String.valueOf(aOVModel.getData().getOwnerInfo().getAcfitted()));
                    ArrayList e10 = q.e("Yes", "No");
                    if (e10 != null) {
                        e10.add(0, "Select Ac Fitted");
                    }
                    this.f20546e.C1().f29017b.setAdapter(new re.b(this.f20546e, e10));
                    Spinner spinner = this.f20546e.C1().f29017b;
                    VahanAlterationOfVehicle vahanAlterationOfVehicle5 = this.f20546e;
                    String acfitted = aOVModel.getData().getOwnerInfo().getAcfitted();
                    cm.l.c(acfitted);
                    spinner.setSelection(vahanAlterationOfVehicle5.j2(acfitted));
                    ArrayList e11 = q.e("Yes", "No");
                    if (e11 != null) {
                        e11.add(0, "Select Audio Fitted");
                    }
                    this.f20546e.C1().f29019d.setAdapter(new re.b(this.f20546e, e11));
                    Spinner spinner2 = this.f20546e.C1().f29019d;
                    VahanAlterationOfVehicle vahanAlterationOfVehicle6 = this.f20546e;
                    String audiofitted = aOVModel.getData().getOwnerInfo().getAudiofitted();
                    cm.l.c(audiofitted);
                    spinner2.setSelection(vahanAlterationOfVehicle6.j2(audiofitted));
                    ArrayList e12 = q.e("Yes", "No");
                    if (e12 != null) {
                        e12.add(0, "Select Video Fitted");
                    }
                    this.f20546e.C1().N.setAdapter(new re.b(this.f20546e, e12));
                    Spinner spinner3 = this.f20546e.C1().N;
                    VahanAlterationOfVehicle vahanAlterationOfVehicle7 = this.f20546e;
                    String videofitted = aOVModel.getData().getOwnerInfo().getVideofitted();
                    cm.l.c(videofitted);
                    spinner3.setSelection(vahanAlterationOfVehicle7.j2(videofitted));
                    this.f20546e.C1().f29030o.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getHeight())));
                    this.f20546e.C1().f29036u.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getLength())));
                    this.f20546e.C1().R.setText(this.f20546e.r1(String.valueOf(aOVModel.getData().getOwnerInfo().getWidth())));
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AOVModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final b f20547e = new b();

        b() {
            super(1);
        }

        public final void b(String str) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanAlterationOfVehicle f20548e;

        c(VahanAlterationOfVehicle vahanAlterationOfVehicle) {
            this.f20548e = vahanAlterationOfVehicle;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String valueOf = String.valueOf(charSequence);
            Locale locale = Locale.getDefault();
            cm.l.e(locale, "getDefault(...)");
            String upperCase = valueOf.toUpperCase(locale);
            cm.l.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (!cm.l.a(valueOf, upperCase)) {
                Locale locale2 = Locale.getDefault();
                cm.l.e(locale2, "getDefault(...)");
                String upperCase2 = valueOf.toUpperCase(locale2);
                cm.l.e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                this.f20548e.C1().f29021f.setText(upperCase2);
                this.f20548e.C1().f29021f.setSelection(this.f20548e.C1().f29021f.length());
            }
        }
    }

    public static final class d implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanAlterationOfVehicle f20549e;

        d(VahanAlterationOfVehicle vahanAlterationOfVehicle) {
            this.f20549e = vahanAlterationOfVehicle;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String valueOf = String.valueOf(charSequence);
            Locale locale = Locale.getDefault();
            cm.l.e(locale, "getDefault(...)");
            String upperCase = valueOf.toUpperCase(locale);
            cm.l.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (!cm.l.a(valueOf, upperCase)) {
                Locale locale2 = Locale.getDefault();
                cm.l.e(locale2, "getDefault(...)");
                String upperCase2 = valueOf.toUpperCase(locale2);
                cm.l.e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                this.f20549e.C1().f29024i.setText(upperCase2);
                this.f20549e.C1().f29024i.setSelection(this.f20549e.C1().f29024i.length());
            }
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanAlterationOfVehicle f20550e;

        e(VahanAlterationOfVehicle vahanAlterationOfVehicle) {
            this.f20550e = vahanAlterationOfVehicle;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            VahanAlterationOfVehicle vahanAlterationOfVehicle = this.f20550e;
            vahanAlterationOfVehicle.z2(vahanAlterationOfVehicle.C1().f29028m.getSelectedItem().toString());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanAlterationOfVehicle f20551e;

        f(VahanAlterationOfVehicle vahanAlterationOfVehicle) {
            this.f20551e = vahanAlterationOfVehicle;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            VahanAlterationOfVehicle vahanAlterationOfVehicle = this.f20551e;
            vahanAlterationOfVehicle.m2(String.valueOf(vahanAlterationOfVehicle.C1().f29017b.getSelectedItem().toString().charAt(0)));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class g implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanAlterationOfVehicle f20552e;

        g(VahanAlterationOfVehicle vahanAlterationOfVehicle) {
            this.f20552e = vahanAlterationOfVehicle;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            VahanAlterationOfVehicle vahanAlterationOfVehicle = this.f20552e;
            vahanAlterationOfVehicle.r2(String.valueOf(vahanAlterationOfVehicle.C1().f29019d.getSelectedItem().toString().charAt(0)));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class h implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanAlterationOfVehicle f20553e;

        h(VahanAlterationOfVehicle vahanAlterationOfVehicle) {
            this.f20553e = vahanAlterationOfVehicle;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            VahanAlterationOfVehicle vahanAlterationOfVehicle = this.f20553e;
            vahanAlterationOfVehicle.S2(String.valueOf(vahanAlterationOfVehicle.C1().N.getSelectedItem().toString().charAt(0)));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class i extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanAlterationOfVehicle f20554e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(VahanAlterationOfVehicle vahanAlterationOfVehicle) {
            super(1);
            this.f20554e = vahanAlterationOfVehicle;
        }

        public final void b(AOVSaveToDraftReponse aOVSaveToDraftReponse) {
            this.f20554e.S1().dismiss();
            com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.ApiMessage apiMessage = aOVSaveToDraftReponse.getApiMessage();
            String str = null;
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                VahanAlterationOfVehicle vahanAlterationOfVehicle = this.f20554e;
                com.nic.mparivahan.VahanServices.AlterationOfVehicle.AOVSaveToDraftModel.ApiMessage apiMessage2 = aOVSaveToDraftReponse.getApiMessage();
                if (apiMessage2 != null) {
                    str = apiMessage2.getDeveloperMessage();
                }
                vahanAlterationOfVehicle.V2(str);
                return;
            }
            Intent intent = new Intent(this.f20554e, VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.ALTERATION_CODE);
            intent.putExtra(VContant.ALTERATION_CODE, aOVSaveToDraftReponse.getData());
            Data data = aOVSaveToDraftReponse.getData();
            if (data != null) {
                str = data.getApplNo();
            }
            intent.putExtra(VContant.APP_NO, str);
            intent.putExtra("state_code", this.f20554e.U1().getState_cd());
            intent.putExtra("rc_number", this.f20554e.T1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.ALTERATION_PURPOSE_CODE);
            intent.putExtra("off_code", this.f20554e.Q1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this.f20554e.f2());
            intent.putExtra("RC", this.f20554e.T1());
            intent.putExtra("RcDetails", this.f20554e.U1());
            intent.putExtra(VContant.NEXGEN_addahar_name, this.f20554e.v1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this.f20554e.u1());
            this.f20554e.startActivity(intent);
            this.f20554e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AOVSaveToDraftReponse) obj);
            return x.f30437a;
        }
    }

    static final class j extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanAlterationOfVehicle f20555e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(VahanAlterationOfVehicle vahanAlterationOfVehicle) {
            super(1);
            this.f20555e = vahanAlterationOfVehicle;
        }

        public final void b(String str) {
            this.f20555e.S1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class k implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f20556a;

        k(l lVar) {
            cm.l.f(lVar, "function");
            this.f20556a = lVar;
        }

        public final pl.c a() {
            return this.f20556a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20556a.invoke(obj);
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
    public final void V2(String str) {
        Dialog dialog = new Dialog(this);
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
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new xd.d(dialog));
        textView2.setOnClickListener(new xd.e(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void W2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void X2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void g2(VahanAlterationOfVehicle vahanAlterationOfVehicle, View view) {
        cm.l.f(vahanAlterationOfVehicle, "this$0");
        Intent intent = new Intent(vahanAlterationOfVehicle, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanAlterationOfVehicle.T1());
        intent.putExtra("RcDetails", vahanAlterationOfVehicle.U1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanAlterationOfVehicle.f20543r0);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanAlterationOfVehicle.v1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanAlterationOfVehicle.u1());
        vahanAlterationOfVehicle.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void h2(VahanAlterationOfVehicle vahanAlterationOfVehicle, View view) {
        cm.l.f(vahanAlterationOfVehicle, "this$0");
        VUtility.Companion.v(vahanAlterationOfVehicle, vahanAlterationOfVehicle.N1().b("are_you_sure_you_want_to_leave", vahanAlterationOfVehicle.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void i2(VahanAlterationOfVehicle vahanAlterationOfVehicle, View view) {
        ld.c N1;
        String string;
        String str;
        VahanAlterationOfVehicle vahanAlterationOfVehicle2 = vahanAlterationOfVehicle;
        cm.l.f(vahanAlterationOfVehicle2, "this$0");
        Editable text = vahanAlterationOfVehicle.C1().f29021f.getText();
        cm.l.e(text, "getText(...)");
        if (text.length() == 0) {
            N1 = vahanAlterationOfVehicle.N1();
            string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterbodyType);
            str = "altVh_PlsEnterbodyType";
        } else {
            Editable text2 = vahanAlterationOfVehicle.C1().C.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                N1 = vahanAlterationOfVehicle.N1();
                string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterseatCap);
                str = "altVh_PlsEnterseatCap";
            } else {
                Editable text3 = vahanAlterationOfVehicle.C1().G.getText();
                cm.l.e(text3, "getText(...)");
                if (text3.length() == 0) {
                    N1 = vahanAlterationOfVehicle.N1();
                    string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterstandCap);
                    str = "altVh_PlsEnterstandCap";
                } else {
                    Editable text4 = vahanAlterationOfVehicle.C1().E.getText();
                    cm.l.e(text4, "getText(...)");
                    if (text4.length() == 0) {
                        N1 = vahanAlterationOfVehicle.N1();
                        string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlssleeperCap);
                        str = "altVh_PlssleeperCap";
                    } else {
                        Editable text5 = vahanAlterationOfVehicle.C1().f29038w.getText();
                        cm.l.e(text5, "getText(...)");
                        if (text5.length() == 0) {
                            N1 = vahanAlterationOfVehicle.N1();
                            string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnternoCylnd);
                            str = "altVh_PlsEnternoCylnd";
                        } else {
                            Editable text6 = vahanAlterationOfVehicle.C1().J.getText();
                            cm.l.e(text6, "getText(...)");
                            if (text6.length() == 0) {
                                N1 = vahanAlterationOfVehicle.N1();
                                string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterUnladenWght);
                                str = "altVh_PlsEnterUnladenWght";
                            } else {
                                Editable text7 = vahanAlterationOfVehicle.C1().f29034s.getText();
                                cm.l.e(text7, "getText(...)");
                                if (text7.length() == 0) {
                                    N1 = vahanAlterationOfVehicle.N1();
                                    string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterLadenWght);
                                    str = "altVh_PlsEnterLadenWght";
                                } else {
                                    Editable text8 = vahanAlterationOfVehicle.C1().f29032q.getText();
                                    cm.l.e(text8, "getText(...)");
                                    if (text8.length() == 0) {
                                        N1 = vahanAlterationOfVehicle.N1();
                                        string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterHorsePower);
                                        str = "altVh_PlsEnterHorsePower";
                                    } else if (vahanAlterationOfVehicle.C1().f29028m.getSelectedItemPosition() == 0) {
                                        N1 = vahanAlterationOfVehicle.N1();
                                        string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterFuel);
                                        str = "altVh_PlsEnterFuel";
                                    } else {
                                        Editable text9 = vahanAlterationOfVehicle.C1().f29024i.getText();
                                        cm.l.e(text9, "getText(...)");
                                        if (text9.length() == 0) {
                                            N1 = vahanAlterationOfVehicle.N1();
                                            string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterColor);
                                            str = "altVh_PlsEnterColor";
                                        } else {
                                            Editable text10 = vahanAlterationOfVehicle.C1().P.getText();
                                            cm.l.e(text10, "getText(...)");
                                            if (text10.length() == 0) {
                                                N1 = vahanAlterationOfVehicle.N1();
                                                string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterWhlbase);
                                                str = "altVh_PlsEnterWhlbase";
                                            } else {
                                                Editable text11 = vahanAlterationOfVehicle.C1().f29026k.getText();
                                                cm.l.e(text11, "getText(...)");
                                                if (text11.length() == 0) {
                                                    N1 = vahanAlterationOfVehicle.N1();
                                                    string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterCubicCap);
                                                    str = "altVh_PlsEnterCubicCap";
                                                } else if (vahanAlterationOfVehicle.C1().f29017b.getSelectedItemPosition() == 0) {
                                                    N1 = vahanAlterationOfVehicle.N1();
                                                    string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterAcFitted);
                                                    str = "altVh_PlsEnterAcFitted";
                                                } else if (vahanAlterationOfVehicle.C1().f29019d.getSelectedItemPosition() == 0) {
                                                    N1 = vahanAlterationOfVehicle.N1();
                                                    string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterAudioFitted);
                                                    str = "altVh_PlsEnterAudioFitted";
                                                } else if (vahanAlterationOfVehicle.C1().N.getSelectedItemPosition() == 0) {
                                                    N1 = vahanAlterationOfVehicle.N1();
                                                    string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterVideoFitted);
                                                    str = "altVh_PlsEnterVideoFitted";
                                                } else {
                                                    Editable text12 = vahanAlterationOfVehicle.C1().f29030o.getText();
                                                    cm.l.e(text12, "getText(...)");
                                                    if (text12.length() == 0) {
                                                        N1 = vahanAlterationOfVehicle.N1();
                                                        string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterHeigthmm);
                                                        str = "altVh_PlsEnterHeigthmm";
                                                    } else {
                                                        Editable text13 = vahanAlterationOfVehicle.C1().f29036u.getText();
                                                        cm.l.e(text13, "getText(...)");
                                                        if (text13.length() == 0) {
                                                            N1 = vahanAlterationOfVehicle.N1();
                                                            string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterLengthmm);
                                                            str = "altVh_PlsEnterLengthmm";
                                                        } else {
                                                            Editable text14 = vahanAlterationOfVehicle.C1().R.getText();
                                                            cm.l.e(text14, "getText(...)");
                                                            if (text14.length() == 0) {
                                                                N1 = vahanAlterationOfVehicle.N1();
                                                                string = vahanAlterationOfVehicle2.getString(R.string.altVh_PlsEnterWidthmm);
                                                                str = "altVh_PlsEnterWidthmm";
                                                            } else {
                                                                vahanAlterationOfVehicle2.M2(vahanAlterationOfVehicle.C1().C.getText().toString());
                                                                vahanAlterationOfVehicle2.O2(vahanAlterationOfVehicle.C1().G.getText().toString());
                                                                vahanAlterationOfVehicle2.N2(vahanAlterationOfVehicle.C1().E.getText().toString());
                                                                vahanAlterationOfVehicle2.G2(vahanAlterationOfVehicle.C1().f29038w.getText().toString());
                                                                vahanAlterationOfVehicle2.P2(vahanAlterationOfVehicle.C1().J.getText().toString());
                                                                vahanAlterationOfVehicle2.D2(vahanAlterationOfVehicle.C1().f29034s.getText().toString());
                                                                vahanAlterationOfVehicle2.C2(vahanAlterationOfVehicle.C1().f29032q.getText().toString());
                                                                vahanAlterationOfVehicle2.u2(vahanAlterationOfVehicle.C1().f29024i.getText().toString());
                                                                vahanAlterationOfVehicle2.T2(vahanAlterationOfVehicle.C1().P.getText().toString());
                                                                vahanAlterationOfVehicle2.v2(vahanAlterationOfVehicle.C1().f29026k.getText().toString());
                                                                vahanAlterationOfVehicle2.m2(String.valueOf(vahanAlterationOfVehicle.C1().f29017b.getSelectedItem().toString().charAt(0)));
                                                                vahanAlterationOfVehicle2.r2(String.valueOf(vahanAlterationOfVehicle.C1().f29019d.getSelectedItem().toString().charAt(0)));
                                                                vahanAlterationOfVehicle2.S2(String.valueOf(vahanAlterationOfVehicle.C1().N.getSelectedItem().toString().charAt(0)));
                                                                vahanAlterationOfVehicle2.B2(vahanAlterationOfVehicle.C1().f29030o.getText().toString());
                                                                vahanAlterationOfVehicle2.F2(vahanAlterationOfVehicle.C1().f29036u.getText().toString());
                                                                vahanAlterationOfVehicle2.U2(vahanAlterationOfVehicle.C1().R.getText().toString());
                                                                vahanAlterationOfVehicle2.t2(vahanAlterationOfVehicle.C1().f29021f.getText().toString());
                                                                vahanAlterationOfVehicle.C1().f29028m.setOnItemSelectedListener(new e(vahanAlterationOfVehicle2));
                                                                vahanAlterationOfVehicle.C1().f29017b.setOnItemSelectedListener(new f(vahanAlterationOfVehicle2));
                                                                vahanAlterationOfVehicle.C1().f29019d.setOnItemSelectedListener(new g(vahanAlterationOfVehicle2));
                                                                vahanAlterationOfVehicle.C1().N.setOnItemSelectedListener(new h(vahanAlterationOfVehicle2));
                                                                try {
                                                                    AOVSaveToDraftRequest aOVSaveToDraftRequest = new AOVSaveToDraftRequest(vahanAlterationOfVehicle.w1().toString(), "", vahanAlterationOfVehicle.B1().toString(), vahanAlterationOfVehicle.D1(), String.valueOf(vahanAlterationOfVehicle.U1().getRc_chasi_no()), vahanAlterationOfVehicle.E1(), Double.parseDouble(vahanAlterationOfVehicle.F1()), String.valueOf(vahanAlterationOfVehicle.U1().getRc_eng_no()), vahanAlterationOfVehicle.G1(), Double.parseDouble(vahanAlterationOfVehicle.H1()), Double.parseDouble(vahanAlterationOfVehicle.I1()), Double.parseDouble(vahanAlterationOfVehicle.J1()), Double.parseDouble(vahanAlterationOfVehicle.K1()), Double.parseDouble(vahanAlterationOfVehicle.L1()), Double.parseDouble(vahanAlterationOfVehicle.M1()), Double.parseDouble(vahanAlterationOfVehicle.O1()), Double.parseDouble(vahanAlterationOfVehicle.P1()), Integer.parseInt(vahanAlterationOfVehicle.Q1()), vahanAlterationOfVehicle.R1(), String.valueOf(vahanAlterationOfVehicle.U1().getRc_regn_no()), Double.parseDouble(vahanAlterationOfVehicle.V1()), Double.parseDouble(vahanAlterationOfVehicle.W1()), Double.parseDouble(vahanAlterationOfVehicle.X1()), String.valueOf(vahanAlterationOfVehicle.U1().getState_cd()), (int) Double.parseDouble(vahanAlterationOfVehicle.Y1()), vahanAlterationOfVehicle.a2(), Integer.parseInt(vahanAlterationOfVehicle.b2()), vahanAlterationOfVehicle.c2(), Double.parseDouble(vahanAlterationOfVehicle.d2()), Double.parseDouble(vahanAlterationOfVehicle.e2()));
                                                                    vahanAlterationOfVehicle.S1().show();
                                                                    vahanAlterationOfVehicle.A1().g(aOVSaveToDraftRequest);
                                                                    return;
                                                                } catch (Exception unused) {
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Toast.makeText(vahanAlterationOfVehicle2, N1.b(str, string), 1).show();
    }

    /* access modifiers changed from: private */
    public final int j2(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        arrayList.add(0, "Y");
        arrayList.add(1, "N");
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11++;
            if (((String) it.next()).equals(str)) {
                i10 = i11;
            }
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public final String q1(String str) {
        return (str.equals("null") || str.equals("nul")) ? "" : str;
    }

    /* access modifiers changed from: private */
    public final String r1(String str) {
        return (str.equals("null") || str.equals("nul") || ka.c.f13158a.m(str)) ? "0" : str;
    }

    /* access modifiers changed from: private */
    public final String s1(String str) {
        return (str.equals("null") || str.equals("nul")) ? "0" : str;
    }

    /* access modifiers changed from: private */
    public final int t1(List list, Integer num) {
        Iterator it = list.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            VmFuel vmFuel = (VmFuel) it.next();
            i11++;
            this.f20544s0.add(Integer.valueOf(vmFuel.getCode()));
            this.f20545t0.add(vmFuel.getDescr());
            if (Integer.valueOf(vmFuel.getCode()).equals(num)) {
                y2(String.valueOf(vmFuel.getCode()));
                i10 = i11;
            }
        }
        return i10;
    }

    public final ae.a A1() {
        ae.a aVar = this.J;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("aovSaveToDraftViewModel");
        return null;
    }

    public final void A2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20534i0 = str;
    }

    public final String B1() {
        String str = this.f20526a0;
        if (str != null) {
            return str;
        }
        cm.l.v("audio_fitted_spinner");
        return null;
    }

    public final void B2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20528c0 = str;
    }

    public final v8 C1() {
        v8 v8Var = this.G;
        if (v8Var != null) {
            return v8Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final void C2(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final String D1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("body_type");
        return null;
    }

    public final void D2(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final String E1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("color");
        return null;
    }

    public final void E2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final String F1() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        cm.l.v("cubic_capacity");
        return null;
    }

    public final void F2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20529d0 = str;
    }

    public final String G1() {
        String str = this.f20532g0;
        if (str != null) {
            return str;
        }
        cm.l.v("fitupto");
        return null;
    }

    public final void G2(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final String H1() {
        String str = this.f20533h0;
        if (str != null) {
            return str;
        }
        cm.l.v("floorArea");
        return null;
    }

    public final void H2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20540o0 = str;
    }

    public final String I1() {
        String str = this.f20531f0;
        if (str != null) {
            return str;
        }
        cm.l.v("fuelCode");
        return null;
    }

    public final void I2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20535j0 = str;
    }

    public final String J1() {
        String str = this.f20534i0;
        if (str != null) {
            return str;
        }
        cm.l.v("gcw");
        return null;
    }

    public final void J2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.M = progressDialog;
    }

    public final String K1() {
        String str = this.f20528c0;
        if (str != null) {
            return str;
        }
        cm.l.v("height");
        return null;
    }

    public final void K2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20538m0 = str;
    }

    public final String L1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("horse_power");
        return null;
    }

    public final void L2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.f20539n0 = nrvDetails;
    }

    public final String M1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("laden_weight");
        return null;
    }

    public final void M2(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final ld.c N1() {
        ld.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final void N2(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final String O1() {
        String str = this.f20529d0;
        if (str != null) {
            return str;
        }
        cm.l.v("length");
        return null;
    }

    public final void O2(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final String P1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("no_of_cylinders");
        return null;
    }

    public final void P2(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final String Q1() {
        String str = this.f20540o0;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final void Q2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20536k0 = str;
    }

    public final String R1() {
        String str = this.f20535j0;
        if (str != null) {
            return str;
        }
        cm.l.v("opdt");
        return null;
    }

    public final void R2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20537l0 = str;
    }

    public final ProgressDialog S1() {
        ProgressDialog progressDialog = this.M;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void S2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20527b0 = str;
    }

    public final String T1() {
        String str = this.f20538m0;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final void T2(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final NrvDetails U1() {
        NrvDetails nrvDetails = this.f20539n0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final void U2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20530e0 = str;
    }

    public final String V1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("seating_capacity");
        return null;
    }

    public final String W1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("sleeper_capacity");
        return null;
    }

    public final String X1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("standing_capacity");
        return null;
    }

    public final String Y1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("unladen_weight");
        return null;
    }

    public final ArrayList Z1() {
        return this.f20545t0;
    }

    public final String a2() {
        String str = this.f20536k0;
        if (str != null) {
            return str;
        }
        cm.l.v("vchCat");
        return null;
    }

    public final String b2() {
        String str = this.f20537l0;
        if (str != null) {
            return str;
        }
        cm.l.v("vchClass");
        return null;
    }

    public final String c2() {
        String str = this.f20527b0;
        if (str != null) {
            return str;
        }
        cm.l.v("video_fitted_spinner");
        return null;
    }

    public final String d2() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        cm.l.v("wheelbase");
        return null;
    }

    public final String e2() {
        String str = this.f20530e0;
        if (str != null) {
            return str;
        }
        cm.l.v("width");
        return null;
    }

    public final boolean f2() {
        return this.f20543r0;
    }

    public final void k2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20542q0 = str;
    }

    public final void l2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20541p0 = str;
    }

    public final void m2(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void n2(AOVServices aOVServices) {
        cm.l.f(aOVServices, "<set-?>");
        this.I = aOVServices;
    }

    public final void o2(ae.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.H = bVar;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, N1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v8 c10 = v8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        s2(c10);
        setContentView((View) C1().b());
        getWindow().addFlags(128);
        v9.e.f17509a.C(this, C1());
        n2(AOVServices.f20522a.b(this));
        p2(AOVSaveToDraftService.f20519a.b(this));
        J2(new ProgressDialog(this));
        S1().setCancelable(false);
        S1().setCanceledOnTouchOutside(false);
        E2(new ld.c(this));
        S1().setMessage(N1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        H2(String.valueOf(getIntent().getStringExtra("off_code")));
        this.f20543r0 = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        l2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        k2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        K2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        L2((NrvDetails) serializableExtra);
        TextView textView = C1().L;
        textView.setText(N1().b("vehicle_no", "Vehicle No.:") + ' ' + T1());
        C1().M.setText(N1().b("view_vehicle_details", "View Vehicle Details"));
        C1().M.setPaintFlags(C1().M.getPaintFlags() | 8);
        C1().M.setOnClickListener(new xd.a(this));
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, "Yes");
        arrayList.add(1, "No");
        new ArrayList();
        arrayList.add(0, "Y");
        arrayList.add(1, "N");
        E2(new ld.c(this));
        N1().b("altVh_ServiceName", getString(R.string.alteration_of_vehicle));
        C1().I.f28308i.setText(N1().b("altVh_ServiceName", getString(R.string.alteration_of_vehicle)));
        C1().I.f28305f.setOnClickListener(new xd.b(this));
        o2((ae.b) new u0((x0) this, (u0.b) new zd.a(new yd.a(x1()))).a(ae.b.class));
        q2((ae.a) new u0((x0) this, (u0.b) new zd.b(new yd.b(z1()))).a(ae.a.class));
        try {
            S1().show();
            y1().i(T1(), Q1(), VContant.ALTERATION_PURPOSE_CODE, String.valueOf(U1().getState_cd()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        y1().h().g(this, new k(new a(this)));
        y1().g().g(this, new k(b.f20547e));
        C1().f29021f.addTextChangedListener(new c(this));
        C1().f29024i.addTextChangedListener(new d(this));
        C1().f29023h.setOnClickListener(new xd.c(this));
        A1().i().g(this, new k(new i(this)));
        A1().h().g(this, new k(new j(this)));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        cm.l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        VUtility.Companion.v(this, N1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final void p2(AOVSaveToDraftService aOVSaveToDraftService) {
        cm.l.f(aOVSaveToDraftService, "<set-?>");
        this.K = aOVSaveToDraftService;
    }

    public final void q2(ae.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.J = aVar;
    }

    public final void r2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20526a0 = str;
    }

    public final void s2(v8 v8Var) {
        cm.l.f(v8Var, "<set-?>");
        this.G = v8Var;
    }

    public final void t2(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final String u1() {
        String str = this.f20542q0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final void u2(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final String v1() {
        String str = this.f20541p0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final void v2(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final String w1() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        cm.l.v("ac_fitted_spinner");
        return null;
    }

    public final void w2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20532g0 = str;
    }

    public final AOVServices x1() {
        AOVServices aOVServices = this.I;
        if (aOVServices != null) {
            return aOVServices;
        }
        cm.l.v("aovDataService");
        return null;
    }

    public final void x2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20533h0 = str;
    }

    public final ae.b y1() {
        ae.b bVar = this.H;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("aovDataViewModel");
        return null;
    }

    public final void y2(String str) {
        cm.l.f(str, "<set-?>");
        this.f20531f0 = str;
    }

    public final AOVSaveToDraftService z1() {
        AOVSaveToDraftService aOVSaveToDraftService = this.K;
        if (aOVSaveToDraftService != null) {
            return aOVSaveToDraftService;
        }
        cm.l.v("aovSaveToDraftService");
        return null;
    }

    public final void z2(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }
}
