package r3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.i;
import androidx.fragment.app.j;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import d4.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import o.a;

public final class f0 extends i implements f {

    /* renamed from: k0  reason: collision with root package name */
    private static final WeakHashMap f15563k0 = new WeakHashMap();

    /* renamed from: h0  reason: collision with root package name */
    private final Map f15564h0 = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public int f15565i0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public Bundle f15566j0;

    public static f0 X1(j jVar) {
        f0 f0Var;
        WeakHashMap weakHashMap = f15563k0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(jVar);
        if (weakReference != null && (f0Var = (f0) weakReference.get()) != null) {
            return f0Var;
        }
        try {
            f0 f0Var2 = (f0) jVar.F0().h0("SupportLifecycleFragmentImpl");
            if (f0Var2 == null || f0Var2.s0()) {
                f0Var2 = new f0();
                jVar.F0().n().e(f0Var2, "SupportLifecycleFragmentImpl").i();
            }
            weakHashMap.put(jVar, new WeakReference(f0Var2));
            return f0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    public final void C0(Bundle bundle) {
        super.C0(bundle);
        this.f15565i0 = 1;
        this.f15566j0 = bundle;
        for (Map.Entry entry : this.f15564h0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void H0() {
        super.H0();
        this.f15565i0 = 5;
        for (LifecycleCallback g10 : this.f15564h0.values()) {
            g10.g();
        }
    }

    public final void X0() {
        super.X0();
        this.f15565i0 = 3;
        for (LifecycleCallback h10 : this.f15564h0.values()) {
            h10.h();
        }
    }

    public final void Y0(Bundle bundle) {
        super.Y0(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f15564h0.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void Z0() {
        super.Z0();
        this.f15565i0 = 2;
        for (LifecycleCallback j10 : this.f15564h0.values()) {
            j10.j();
        }
    }

    public final void a1() {
        super.a1();
        this.f15565i0 = 4;
        for (LifecycleCallback k10 : this.f15564h0.values()) {
            k10.k();
        }
    }

    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f15564h0.containsKey(str)) {
            this.f15564h0.put(str, lifecycleCallback);
            if (this.f15565i0 > 0) {
                new e(Looper.getMainLooper()).post(new e0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final LifecycleCallback c(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f15564h0.get(str));
    }

    public final /* synthetic */ Activity d() {
        return q();
    }

    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.j(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a10 : this.f15564h0.values()) {
            a10.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void x0(int i10, int i11, Intent intent) {
        super.x0(i10, i11, intent);
        for (LifecycleCallback e10 : this.f15564h0.values()) {
            e10.e(i10, i11, intent);
        }
    }
}
