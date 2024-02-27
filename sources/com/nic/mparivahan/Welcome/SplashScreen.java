package com.nic.mparivahan.Welcome;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import com.nic.mparivahan.Account.View.SignInDashBoard;
import com.nic.mparivahan.Account.View.SignInScreen;
import com.nic.mparivahan.PushNotification.BannerServices;
import com.nic.mparivahan.PushNotification.DownLoadLangService;
import com.nic.mparivahan.PushNotification.StateMaseterService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.nic.mparivahan.Welcome.Model.Version;
import hi.g;
import ii.f;
import ii.h;
import ii.j;
import ii.k;
import java.text.SimpleDateFormat;
import java.util.Date;
import ld.g;
import li.c;
import li.e;
import v9.d;
import v9.i;

public final class SplashScreen extends d {
    private ProgressBar G;
    public e H;
    private VersionService I;
    public c J;
    private final NapixService K = NapixService.f21647a.c();
    public g L;
    public hi.g M;

    public static final class a implements g.c {
        a() {
        }

        public void a(int i10) {
        }

        public void b(int i10) {
        }
    }

    public static final class b implements g.b {
        b() {
        }

        public void a(long j10, long j11) {
        }
    }

    private final void m1() {
        hi.g a10 = hi.g.f24105l.a(this);
        l.c(a10);
        z1(a10.H(1));
        n1().L();
        n1().v(new a());
        n1().u(new b());
    }

    /* access modifiers changed from: private */
    public static final void r1(SplashScreen splashScreen, NapixTokenModel napixTokenModel) {
        l.f(splashScreen, "this$0");
        new ld.g(splashScreen).D(napixTokenModel.getAccess_token());
        StateMaseterService.f9446k.a(splashScreen);
        BannerServices.f9423k.a(splashScreen);
        if (!ka.c.f13158a.m(napixTokenModel.getAccess_token())) {
            try {
                if (!new SimpleDateFormat("dd-MM-yyyy").format(new Date()).equals(new ld.a(splashScreen).c())) {
                    DownLoadLangService.f9427k.a(splashScreen);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void s1(SplashScreen splashScreen, String str) {
        Intent intent;
        l.f(splashScreen, "this$0");
        if (splashScreen.p1().t()) {
            intent = new Intent(splashScreen, SignInScreen.class);
            d.a aVar = v9.d.f17494a;
            intent.putExtra(aVar.o(), aVar.p());
        } else {
            intent = new Intent(splashScreen, SignInDashBoard.class);
        }
        splashScreen.startActivity(intent);
        splashScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void t1(SplashScreen splashScreen, Version version) {
        Intent intent;
        l.f(splashScreen, "this$0");
        Class<SignInDashBoard> cls = SignInDashBoard.class;
        Class<SignInScreen> cls2 = SignInScreen.class;
        if (p.o(version.getStatusCode(), "VER001", true)) {
            ProgressBar progressBar = splashScreen.G;
            l.c(progressBar);
            progressBar.setVisibility(8);
            if (splashScreen.p1().t()) {
                intent = new Intent(splashScreen, cls2);
            } else {
                intent = new Intent(splashScreen, cls);
                splashScreen.startActivity(intent);
                splashScreen.finish();
            }
        } else {
            ProgressBar progressBar2 = splashScreen.G;
            l.c(progressBar2);
            progressBar2.setVisibility(8);
            if (splashScreen.p1().t()) {
                intent = new Intent(splashScreen, cls2);
            } else {
                intent = new Intent(splashScreen, cls);
                splashScreen.startActivity(intent);
                splashScreen.finish();
            }
        }
        d.a aVar = v9.d.f17494a;
        intent.putExtra(aVar.o(), aVar.p());
        splashScreen.startActivity(intent);
        splashScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void u1(SplashScreen splashScreen, String str) {
        Intent intent;
        l.f(splashScreen, "this$0");
        ProgressBar progressBar = splashScreen.G;
        l.c(progressBar);
        progressBar.setVisibility(8);
        if (splashScreen.p1().t()) {
            intent = new Intent(splashScreen, SignInScreen.class);
            d.a aVar = v9.d.f17494a;
            intent.putExtra(aVar.o(), aVar.p());
        } else {
            intent = new Intent(splashScreen, SignInDashBoard.class);
        }
        splashScreen.startActivity(intent);
        splashScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void v1(SplashScreen splashScreen) {
        l.f(splashScreen, "this$0");
        try {
            if (!t8.a.b()) {
                i.a aVar = i.f17578a;
                Context baseContext = splashScreen.getBaseContext();
                l.e(baseContext, "getBaseContext(...)");
                if (!aVar.a(baseContext)) {
                    d.a aVar2 = v9.d.f17494a;
                    if (aVar2.A(splashScreen)) {
                        return;
                    }
                    if (com.nic.mparivahan.a.f9624a.a(splashScreen)) {
                        splashScreen.q1().n();
                        return;
                    }
                    if (splashScreen.p1().t()) {
                        Intent intent = new Intent(splashScreen, SignInScreen.class);
                        intent.putExtra(aVar2.o(), aVar2.p());
                        splashScreen.startActivity(intent);
                    } else {
                        splashScreen.startActivity(new Intent(splashScreen, SignInDashBoard.class));
                    }
                    splashScreen.finish();
                }
            }
        } catch (Exception unused) {
            ProgressBar progressBar = splashScreen.G;
            l.c(progressBar);
            progressBar.setVisibility(8);
        }
    }

    private final void w1() {
        AlertDialog.Builder builder;
        AlertDialog.Builder cancelable;
        DialogInterface.OnClickListener fVar;
        if (t8.a.b()) {
            builder = new AlertDialog.Builder(this);
            cancelable = builder.setMessage("It seems device is virtual, Please proceed with real device.").setCancelable(false);
            fVar = new ii.e(this);
        } else {
            i.a aVar = i.f17578a;
            Context baseContext = getBaseContext();
            l.e(baseContext, "getBaseContext(...)");
            if (aVar.a(baseContext)) {
                builder = new AlertDialog.Builder(this);
                cancelable = builder.setMessage("It seems device don't pass basic integrity & uncertified by Google").setCancelable(false);
                fVar = new f(this);
            } else {
                d.a aVar2 = v9.d.f17494a;
                if (aVar2.A(this)) {
                    aVar2.e(this, getString(R.string.usbdebug));
                    return;
                } else {
                    o1().h();
                    return;
                }
            }
        }
        cancelable.setPositiveButton("Okay", fVar);
        AlertDialog create = builder.create();
        create.setTitle("Information");
        create.show();
    }

    /* access modifiers changed from: private */
    public static final void x1(SplashScreen splashScreen, DialogInterface dialogInterface, int i10) {
        l.f(splashScreen, "this$0");
        splashScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void y1(SplashScreen splashScreen, DialogInterface dialogInterface, int i10) {
        l.f(splashScreen, "this$0");
        splashScreen.finish();
    }

    public final void A1(c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void B1(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.L = gVar;
    }

    public final void C1(e eVar) {
        l.f(eVar, "<set-?>");
        this.H = eVar;
    }

    public final hi.g n1() {
        hi.g gVar = this.M;
        if (gVar != null) {
            return gVar;
        }
        l.v("mUpdateManager");
        return null;
    }

    public final c o1() {
        c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("napixViewModel");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.mvvm_splash);
        getWindow().addFlags(128);
        View findViewById = findViewById(R.id.progress_bar);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.ProgressBar");
        this.G = (ProgressBar) findViewById;
        B1(new ld.g(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        o1().g().g(this, new ii.g(this));
        o1().i().g(this, new h(this));
        q1().r().g(this, new ii.i(this));
        q1().k().g(this, new j(this));
        new Handler(Looper.getMainLooper()).postDelayed(new k(this), 1000);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.I = VersionService.f21650a.c(this);
        A1((c) new u0((x0) this, (u0.b) new li.d(new ji.b(this.K))).a(c.class));
        VersionService versionService = this.I;
        if (versionService == null) {
            l.v("retrofitService");
            versionService = null;
        }
        C1((e) new u0((x0) this, (u0.b) new li.b(new ji.c(versionService))).a(e.class));
        try {
            if (com.nic.mparivahan.a.f9624a.a(this)) {
                m1();
                w1();
            }
        } catch (Exception unused) {
        }
    }

    public final ld.g p1() {
        ld.g gVar = this.L;
        if (gVar != null) {
            return gVar;
        }
        l.v("session_manger");
        return null;
    }

    public final e q1() {
        e eVar = this.H;
        if (eVar != null) {
            return eVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void z1(hi.g gVar) {
        l.f(gVar, "<set-?>");
        this.M = gVar;
    }
}
