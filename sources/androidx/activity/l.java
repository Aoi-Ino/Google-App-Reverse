package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.y0;
import b1.d;
import b1.e;
import b1.f;
import b1.g;

public class l extends Dialog implements s, s, f {

    /* renamed from: e  reason: collision with root package name */
    private u f503e;

    /* renamed from: f  reason: collision with root package name */
    private final e f504f = e.f4403d.a(this);

    /* renamed from: g  reason: collision with root package name */
    private final q f505g = new q(new k(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context, int i10) {
        super(context, i10);
        cm.l.f(context, "context");
    }

    private final u b() {
        u uVar = this.f503e;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        this.f503e = uVar2;
        return uVar2;
    }

    /* access modifiers changed from: private */
    public static final void d(l lVar) {
        cm.l.f(lVar, "this$0");
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        cm.l.f(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        cm.l.c(window);
        View decorView = window.getDecorView();
        cm.l.e(decorView, "window!!.decorView");
        y0.a(decorView, this);
        Window window2 = getWindow();
        cm.l.c(window2);
        View decorView2 = window2.getDecorView();
        cm.l.e(decorView2, "window!!.decorView");
        v.a(decorView2, this);
        Window window3 = getWindow();
        cm.l.c(window3);
        View decorView3 = window3.getDecorView();
        cm.l.e(decorView3, "window!!.decorView");
        g.a(decorView3, this);
    }

    public k d0() {
        return b();
    }

    public final q k() {
        return this.f505g;
    }

    public d l() {
        return this.f504f.b();
    }

    public void onBackPressed() {
        this.f505g.k();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            q qVar = this.f505g;
            OnBackInvokedDispatcher a10 = getOnBackInvokedDispatcher();
            cm.l.e(a10, "onBackInvokedDispatcher");
            qVar.n(a10);
        }
        this.f504f.d(bundle);
        b().i(k.a.ON_CREATE);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        cm.l.e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f504f.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        b().i(k.a.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        b().i(k.a.ON_DESTROY);
        this.f503e = null;
        super.onStop();
    }

    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    public void setContentView(View view) {
        cm.l.f(view, "view");
        c();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        cm.l.f(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
