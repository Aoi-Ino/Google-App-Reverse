package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.profileinstaller.g;
import java.util.concurrent.Executor;
import p4.i;
import p4.l;
import w3.j;

public class n {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f7525c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static i1 f7526d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f7527a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7528b = new g();

    public n(Context context) {
        this.f7527a = context;
    }

    private static i e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        i1 f10 = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return f10.c(intent).f(new g(), new m());
        }
        if (s0.b().e(context)) {
            d1.f(context, f10, intent);
        } else {
            f10.c(intent);
        }
        return l.e(-1);
    }

    private static i1 f(Context context, String str) {
        i1 i1Var;
        synchronized (f7525c) {
            try {
                if (f7526d == null) {
                    f7526d = new i1(context, str);
                }
                i1Var = f7526d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i1Var;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer g(i iVar) {
        return -1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer i(i iVar) {
        return 403;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i j(Context context, Intent intent, boolean z10, i iVar) {
        return (!j.g() || ((Integer) iVar.i()).intValue() != 402) ? iVar : e(context, intent, z10).f(new g(), new l());
    }

    public i k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f7527a, intent);
    }

    public i l(Context context, Intent intent) {
        boolean z10 = false;
        boolean z11 = j.g() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z10 = true;
        }
        return (!z11 || z10) ? l.c(this.f7528b, new j(context, intent)).g(this.f7528b, new k(context, intent, z10)) : e(context, intent, z10);
    }
}
