package com.nic.mparivahan.Sos;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Notifications.LocationNotiication;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import ic.e;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import ld.g;
import md.o;
import md.p;
import md.q;
import md.r;
import md.s;
import md.t;
import md.u;
import md.v;
import md.w;
import ni.k8;
import pl.x;
import v9.e;

public final class SosHomeScreen extends d {
    private k8 G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    private final int K = 24;
    public LinearLayout L;
    private final int M = 23;
    public String N;
    public e O;
    public LocationNotiication P;
    public g Q;
    public ld.c R;
    public ProgressDialog S;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SosHomeScreen f9618e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SosHomeScreen sosHomeScreen) {
            super(1);
            this.f9618e = sosHomeScreen;
        }

        public final void b(ic.c cVar) {
            try {
                this.f9618e.y1().dismiss();
                throw null;
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((ic.c) null);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SosHomeScreen f9619e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SosHomeScreen sosHomeScreen) {
            super(1);
            this.f9619e = sosHomeScreen;
        }

        public final void b(String str) {
            try {
                this.f9619e.y1().dismiss();
                SosHomeScreen sosHomeScreen = this.f9619e;
                sosHomeScreen.L1(sosHomeScreen.z1().b("label_not_find_location", "Not able to find your location\\nTry after some time"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9620a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f9620a = lVar;
        }

        public final pl.c a() {
            return this.f9620a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9620a.invoke(obj);
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

    private final boolean C1() {
        return androidx.core.content.a.a(this, "android.permission.CALL_PHONE") == 0;
    }

    private final boolean D1() {
        return androidx.core.content.a.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    private final void E1() {
        androidx.core.app.b.u(this, "android.permission.ACCESS_FINE_LOCATION");
        androidx.core.app.b.s(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, this.M);
    }

    /* access modifiers changed from: private */
    public static final void F1(SosHomeScreen sosHomeScreen, View view) {
        cm.l.f(sosHomeScreen, "this$0");
        sosHomeScreen.startActivity(new Intent(sosHomeScreen, AddContactScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void G1(SosHomeScreen sosHomeScreen, View view) {
        cm.l.f(sosHomeScreen, "this$0");
        sosHomeScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void H1(SosHomeScreen sosHomeScreen, View view) {
        cm.l.f(sosHomeScreen, "this$0");
        if (sosHomeScreen.C1()) {
            sosHomeScreen.p1();
        } else {
            sosHomeScreen.q1();
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(SosHomeScreen sosHomeScreen, View view) {
        String b10;
        cm.l.f(sosHomeScreen, "this$0");
        try {
            sosHomeScreen.y1().show();
            Object systemService = sosHomeScreen.getSystemService("location");
            cm.l.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (!((LocationManager) systemService).isProviderEnabled("gps")) {
                sosHomeScreen.y1().dismiss();
                sosHomeScreen.Q1(sosHomeScreen.z1().b("label_turn_on_your_loc", "Your location is off\nPlease turn on your location"));
            } else if (sosHomeScreen.D1()) {
                new j9.a(sosHomeScreen);
                if (sosHomeScreen.w1() == null) {
                    sosHomeScreen.y1().dismiss();
                    b10 = sosHomeScreen.z1().b("label_not_find_location", "Not able to find your location\\nTry after some time");
                } else if (cm.l.a(sosHomeScreen.w1(), sosHomeScreen.getResources().getString(R.string.location_not_find))) {
                    sosHomeScreen.y1().dismiss();
                    b10 = sosHomeScreen.w1();
                } else {
                    sosHomeScreen.v1().i(Integer.parseInt(sosHomeScreen.A1().k()), sosHomeScreen.w1());
                    return;
                }
                sosHomeScreen.L1(b10);
            } else {
                sosHomeScreen.y1().dismiss();
                sosHomeScreen.N1(sosHomeScreen.z1().b("label_location", "Location"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void J1(String str) {
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
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(z1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(z1().b("btn_ok", "Ok"));
        textView.setOnClickListener(new p(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void K1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void L1(String str) {
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
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        textView.setText(z1().b("btn_ok", "Ok"));
        ((TextView) findViewById3).setText(z1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setOnClickListener(new w(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void M1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void N1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.informlocation);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.accept);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.deny);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setOnClickListener(new u(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new v(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void O1(Dialog dialog, SosHomeScreen sosHomeScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(sosHomeScreen, "this$0");
        dialog.dismiss();
        sosHomeScreen.E1();
    }

    /* access modifiers changed from: private */
    public static final void P1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void Q1(String str) {
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
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(z1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(z1().b("btn_ok", "Ok"));
        textView.setOnClickListener(new o(this, dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void R1(SosHomeScreen sosHomeScreen, Dialog dialog, View view) {
        cm.l.f(sosHomeScreen, "this$0");
        cm.l.f(dialog, "$d");
        sosHomeScreen.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        dialog.dismiss();
    }

    private final void q1() {
        androidx.core.app.b.u(this, "android.permission.CALL_PHONE");
        androidx.core.app.b.s(this, new String[]{"android.permission.CALL_PHONE"}, this.K);
    }

    public final g A1() {
        g gVar = this.Q;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final LinearLayout B1() {
        LinearLayout linearLayout = this.L;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("tapNotify");
        return null;
    }

    public final void S1(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.H = linearLayout;
    }

    public final void T1(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.J = linearLayout;
    }

    public final void U1(LocationNotiication locationNotiication) {
        cm.l.f(locationNotiication, "<set-?>");
        this.P = locationNotiication;
    }

    public final void V1(e eVar) {
        cm.l.f(eVar, "<set-?>");
        this.O = eVar;
    }

    public final void W1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void X1(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.I = linearLayout;
    }

    public final void Y1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.S = progressDialog;
    }

    public final void Z1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.R = cVar;
    }

    public final void a2(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.Q = gVar;
    }

    public final void b2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.L = linearLayout;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k8 c10 = k8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        k8 k8Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        Z1(new ld.c(this));
        Y1(new ProgressDialog(this));
        y1().setMessage(z1().b("label_challan_please_wait", "Please wait..."));
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        e.a aVar = v9.e.f17509a;
        k8 k8Var2 = this.G;
        if (k8Var2 == null) {
            cm.l.v("binding");
        } else {
            k8Var = k8Var2;
        }
        aVar.T1(this, k8Var);
        a2(new g(this));
        U1(LocationNotiication.f9362a.a(this));
        V1((ic.e) new u0((x0) this, (u0.b) new ic.a(new ic.b(u1()))).a(ic.e.class));
        View findViewById = findViewById(R.id.addcontactdetails);
        cm.l.e(findViewById, "findViewById(...)");
        S1((LinearLayout) findViewById);
        View findViewById2 = findViewById(R.id.contact_amblunce);
        cm.l.e(findViewById2, "findViewById(...)");
        T1((LinearLayout) findViewById2);
        View findViewById3 = findViewById(R.id.nexgenarrow);
        cm.l.e(findViewById3, "findViewById(...)");
        X1((LinearLayout) findViewById3);
        View findViewById4 = findViewById(R.id.tap_notify);
        cm.l.e(findViewById4, "findViewById(...)");
        b2((LinearLayout) findViewById4);
        r1().setOnClickListener(new q(this));
        x1().setOnClickListener(new r(this));
        s1().setOnClickListener(new s(this));
        v1().h().g(this, new c(new a(this)));
        v1().g().g(this, new c(new b(this)));
        B1().setOnClickListener(new t(this));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.M) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                Q1(z1().b("label_loc_permission_required", "Location permission Required\nAllow mParivahan App to detect your location"));
            }
        } else if (i10 == this.K) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                J1(z1().b("label_phone_permission_required_to_call", "Phone permission Required to make call"));
            } else {
                p1();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (com.nic.mparivahan.a.f9624a.a(this)) {
                NaxpToKenService.f9438k.a(this);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        j9.a aVar = new j9.a(this);
        t1(aVar.f12765j, aVar.f12766k);
    }

    public final void p1() {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:" + "102"));
        startActivity(intent);
    }

    public final LinearLayout r1() {
        LinearLayout linearLayout = this.H;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("addcontactdetails");
        return null;
    }

    public final LinearLayout s1() {
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("contact_amblunce");
        return null;
    }

    public final void t1(double d10, double d11) {
        String addressLine;
        try {
            List<Address> fromLocation = new Geocoder(this, Locale.getDefault()).getFromLocation(d10, d11, 1);
            cm.l.d(fromLocation, "null cannot be cast to non-null type kotlin.collections.List<android.location.Address>");
            if (fromLocation.isEmpty()) {
                addressLine = String.valueOf(z1().b("label_not_find_location", getResources().getString(R.string.location_not_find)));
            } else {
                addressLine = fromLocation.get(0).getAddressLine(0);
                cm.l.e(addressLine, "getAddressLine(...)");
            }
            W1(addressLine);
        } catch (IOException e10) {
            W1(String.valueOf(z1().b("label_not_find_location", getResources().getString(R.string.location_not_find))));
            e10.printStackTrace();
        }
    }

    public final LocationNotiication u1() {
        LocationNotiication locationNotiication = this.P;
        if (locationNotiication != null) {
            return locationNotiication;
        }
        cm.l.v("mLocationNotification");
        return null;
    }

    public final ic.e v1() {
        ic.e eVar = this.O;
        if (eVar != null) {
            return eVar;
        }
        cm.l.v("mLocationViewModel");
        return null;
    }

    public final String w1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("myLocation");
        return null;
    }

    public final LinearLayout x1() {
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("nexgenarrow");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.S;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final ld.c z1() {
        ld.c cVar = this.R;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }
}
