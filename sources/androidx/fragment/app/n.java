package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.content.a;
import androidx.core.util.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import n0.k;

public abstract class n extends k {

    /* renamed from: e  reason: collision with root package name */
    private final Activity f3107e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f3108f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f3109g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3110h;

    /* renamed from: i  reason: collision with root package name */
    final q f3111i;

    n(Activity activity, Context context, Handler handler, int i10) {
        this.f3111i = new r();
        this.f3107e = activity;
        this.f3108f = (Context) g.h(context, "context == null");
        this.f3109g = (Handler) g.h(handler, "handler == null");
        this.f3110h = i10;
    }

    /* access modifiers changed from: package-private */
    public Activity e() {
        return this.f3107e;
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f3108f;
    }

    public Handler g() {
        return this.f3109g;
    }

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object i();

    public abstract LayoutInflater j();

    public void m(i iVar, String[] strArr, int i10) {
    }

    public abstract boolean n(String str);

    public void p(i iVar, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            a.m(this.f3108f, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public abstract void q();

    n(j jVar) {
        this(jVar, jVar, new Handler(), 0);
    }
}
