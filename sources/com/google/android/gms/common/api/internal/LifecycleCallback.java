package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import r3.d0;
import r3.e;
import r3.f;
import r3.f0;
import s3.o;

public class LifecycleCallback {

    /* renamed from: e  reason: collision with root package name */
    protected final f f5245e;

    protected LifecycleCallback(f fVar) {
        this.f5245e = fVar;
    }

    public static f c(Activity activity) {
        return d(new e(activity));
    }

    protected static f d(e eVar) {
        if (eVar.d()) {
            return f0.X1(eVar.b());
        }
        if (eVar.c()) {
            return d0.f(eVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static f getChimeraLifecycleFragmentImpl(e eVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity d10 = this.f5245e.d();
        o.i(d10);
        return d10;
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
