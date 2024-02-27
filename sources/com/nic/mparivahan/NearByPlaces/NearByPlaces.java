package com.nic.mparivahan.NearByPlaces;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.d;
import bc.a;
import bc.b;
import bc.c;
import bc.e;
import cm.l;
import com.nic.mparivahan.R;
import ni.g6;
import v9.e;

public final class NearByPlaces extends d {
    public RelativeLayout G;
    public RelativeLayout H;
    public RelativeLayout I;
    public RelativeLayout J;
    public ImageView K;
    public Context L;
    private g6 M;

    private final void m1() {
        View findViewById = findViewById(R.id.mvvm_Back);
        l.e(findViewById, "findViewById(...)");
        y1((ImageView) findViewById);
        s1().setOnClickListener(new a(this));
        View findViewById2 = findViewById(R.id.nearestPollutionRl);
        l.e(findViewById2, "findViewById(...)");
        B1((RelativeLayout) findViewById2);
        View findViewById3 = findViewById(R.id.nearestRTORl);
        l.e(findViewById3, "findViewById(...)");
        C1((RelativeLayout) findViewById3);
        View findViewById4 = findViewById(R.id.nearestfuelPumpRl);
        l.e(findViewById4, "findViewById(...)");
        z1((RelativeLayout) findViewById4);
        View findViewById5 = findViewById(R.id.nearHospitalRl);
        l.e(findViewById5, "findViewById(...)");
        A1((RelativeLayout) findViewById5);
        v1().setOnClickListener(new b(this));
        w1().setOnClickListener(new c(this));
        t1().setOnClickListener(new bc.d(this));
        u1().setOnClickListener(new e(this));
    }

    /* access modifiers changed from: private */
    public static final void n1(NearByPlaces nearByPlaces, View view) {
        l.f(nearByPlaces, "this$0");
        nearByPlaces.finish();
    }

    /* access modifiers changed from: private */
    public static final void o1(NearByPlaces nearByPlaces, View view) {
        l.f(nearByPlaces, "this$0");
        if (nearByPlaces.k1("com.google.android.apps.maps", nearByPlaces.l1())) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode("Nearest Pollution Checking Center")));
            intent.setPackage("com.google.android.apps.maps");
            nearByPlaces.l1().startActivity(intent);
            Context l12 = nearByPlaces.l1();
            l.d(l12, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) l12).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            return;
        }
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps"));
            Context l13 = nearByPlaces.l1();
            l.d(l13, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) l13).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            nearByPlaces.l1().startActivity(intent2);
        } catch (Exception e10) {
            Toast.makeText(nearByPlaces.l1(), "Unable to Connect Try Again...", 1).show();
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void p1(NearByPlaces nearByPlaces, View view) {
        l.f(nearByPlaces, "this$0");
        if (nearByPlaces.k1("com.google.android.apps.maps", nearByPlaces.l1())) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode("Nearest RTO office")));
            intent.setPackage("com.google.android.apps.maps");
            nearByPlaces.l1().startActivity(intent);
            Context l12 = nearByPlaces.l1();
            l.d(l12, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) l12).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            return;
        }
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps"));
            Context l13 = nearByPlaces.l1();
            l.d(l13, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) l13).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            nearByPlaces.l1().startActivity(intent2);
        } catch (Exception e10) {
            Toast.makeText(nearByPlaces.l1(), "Unable to Connect Try Again...", 1).show();
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void q1(NearByPlaces nearByPlaces, View view) {
        l.f(nearByPlaces, "this$0");
        if (nearByPlaces.k1("com.google.android.apps.maps", nearByPlaces.l1())) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode("Fuel Pump")));
            intent.setPackage("com.google.android.apps.maps");
            nearByPlaces.l1().startActivity(intent);
            Context l12 = nearByPlaces.l1();
            l.d(l12, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) l12).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            return;
        }
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps"));
            Context l13 = nearByPlaces.l1();
            l.d(l13, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) l13).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            nearByPlaces.l1().startActivity(intent2);
        } catch (Exception e10) {
            Toast.makeText(nearByPlaces.l1(), "Unable to Connect Try Again...", 1).show();
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void r1(NearByPlaces nearByPlaces, View view) {
        l.f(nearByPlaces, "this$0");
        if (nearByPlaces.k1("com.google.android.apps.maps", nearByPlaces.l1())) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + Uri.encode("Hospital")));
            intent.setPackage("com.google.android.apps.maps");
            nearByPlaces.l1().startActivity(intent);
            Context l12 = nearByPlaces.l1();
            l.d(l12, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) l12).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            return;
        }
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps"));
            Context l13 = nearByPlaces.l1();
            l.d(l13, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) l13).overridePendingTransition(R.anim.activity_back_in, R.anim.activity_back_out);
            nearByPlaces.l1().startActivity(intent2);
        } catch (Exception e10) {
            Toast.makeText(nearByPlaces.l1(), "Unable to Connect Try Again...", 1).show();
            e10.printStackTrace();
        }
    }

    public final void A1(RelativeLayout relativeLayout) {
        l.f(relativeLayout, "<set-?>");
        this.J = relativeLayout;
    }

    public final void B1(RelativeLayout relativeLayout) {
        l.f(relativeLayout, "<set-?>");
        this.H = relativeLayout;
    }

    public final void C1(RelativeLayout relativeLayout) {
        l.f(relativeLayout, "<set-?>");
        this.G = relativeLayout;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        l.f(context, "newBase");
        super.attachBaseContext(context);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.fontScale = 1.0f;
        applyOverrideConfiguration(configuration);
    }

    public final boolean k1(String str, Context context) {
        l.f(context, "context");
        PackageManager packageManager = context.getPackageManager();
        try {
            l.c(str);
            packageManager.getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final Context l1() {
        Context context = this.L;
        if (context != null) {
            return context;
        }
        l.v("context");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g6 c10 = g6.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.M = c10;
        g6 g6Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        x1(this);
        e.a aVar = v9.e.f17509a;
        Context l12 = l1();
        g6 g6Var2 = this.M;
        if (g6Var2 == null) {
            l.v("binding");
        } else {
            g6Var = g6Var2;
        }
        aVar.r1(l12, g6Var);
        m1();
    }

    public final ImageView s1() {
        ImageView imageView = this.K;
        if (imageView != null) {
            return imageView;
        }
        l.v("mvvm_back");
        return null;
    }

    public final RelativeLayout t1() {
        RelativeLayout relativeLayout = this.I;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        l.v("nearFuelPump");
        return null;
    }

    public final RelativeLayout u1() {
        RelativeLayout relativeLayout = this.J;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        l.v("nearHospital");
        return null;
    }

    public final RelativeLayout v1() {
        RelativeLayout relativeLayout = this.H;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        l.v("nearPUCC");
        return null;
    }

    public final RelativeLayout w1() {
        RelativeLayout relativeLayout = this.G;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        l.v("nearRTO");
        return null;
    }

    public final void x1(Context context) {
        l.f(context, "<set-?>");
        this.L = context;
    }

    public final void y1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.K = imageView;
    }

    public final void z1(RelativeLayout relativeLayout) {
        l.f(relativeLayout, "<set-?>");
        this.I = relativeLayout;
    }
}
