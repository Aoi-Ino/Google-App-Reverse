package o3;

import android.os.Bundle;
import android.util.Log;
import p4.j;

abstract class x {

    /* renamed from: a  reason: collision with root package name */
    final int f14413a;

    /* renamed from: b  reason: collision with root package name */
    final j f14414b = new j();

    /* renamed from: c  reason: collision with root package name */
    final int f14415c;

    /* renamed from: d  reason: collision with root package name */
    final Bundle f14416d;

    x(int i10, int i11, Bundle bundle) {
        this.f14413a = i10;
        this.f14415c = i11;
        this.f14416d = bundle;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public final void c(y yVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj = toString();
            String obj2 = yVar.toString();
            Log.d("MessengerIpcClient", "Failing " + obj + " with " + obj2);
        }
        this.f14414b.b(yVar);
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj2 = toString();
            String valueOf = String.valueOf(obj);
            Log.d("MessengerIpcClient", "Finishing " + obj2 + " with " + valueOf);
        }
        this.f14414b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f14415c + " id=" + this.f14413a + " oneWay=" + b() + "}";
    }
}
