package com.google.android.play.core.assetpacks;

import android.content.Context;
import o5.a;
import o5.f;
import t5.p;

public abstract class r1 {

    /* renamed from: a  reason: collision with root package name */
    private static a f6864a;

    static synchronized a a(Context context) {
        a aVar;
        synchronized (r1.class) {
            try {
                if (f6864a == null) {
                    v0 v0Var = new v0((f) null);
                    v0Var.b(new n3(p.a(context)));
                    f6864a = v0Var.a();
                }
                aVar = f6864a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }
}
