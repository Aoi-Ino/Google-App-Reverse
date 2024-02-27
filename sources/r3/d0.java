package r3;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import d4.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import o.a;

public final class d0 extends Fragment implements f {

    /* renamed from: h  reason: collision with root package name */
    private static final WeakHashMap f15555h = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map f15556e = Collections.synchronizedMap(new a());
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f15557f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Bundle f15558g;

    public static d0 f(Activity activity) {
        d0 d0Var;
        WeakHashMap weakHashMap = f15555h;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (d0Var = (d0) weakReference.get()) != null) {
            return d0Var;
        }
        try {
            d0 d0Var2 = (d0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (d0Var2 == null || d0Var2.isRemoving()) {
                d0Var2 = new d0();
                activity.getFragmentManager().beginTransaction().add(d0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(d0Var2));
            return d0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f15556e.containsKey(str)) {
            this.f15556e.put(str, lifecycleCallback);
            if (this.f15557f > 0) {
                new e(Looper.getMainLooper()).post(new c0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    public final LifecycleCallback c(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f15556e.get(str));
    }

    public final Activity d() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a10 : this.f15556e.values()) {
            a10.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback e10 : this.f15556e.values()) {
            e10.e(i10, i11, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15557f = 1;
        this.f15558g = bundle;
        for (Map.Entry entry : this.f15556e.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f15557f = 5;
        for (LifecycleCallback g10 : this.f15556e.values()) {
            g10.g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f15557f = 3;
        for (LifecycleCallback h10 : this.f15556e.values()) {
            h10.h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f15556e.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f15557f = 2;
        for (LifecycleCallback j10 : this.f15556e.values()) {
            j10.j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f15557f = 4;
        for (LifecycleCallback k10 : this.f15556e.values()) {
            k10.k();
        }
    }
}
