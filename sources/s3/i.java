package s3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static int f15983a = 4225;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f15984b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static h1 f15985c = null;

    /* renamed from: d  reason: collision with root package name */
    static HandlerThread f15986d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f15987e = false;

    public static int a() {
        return f15983a;
    }

    public static i b(Context context) {
        synchronized (f15984b) {
            try {
                if (f15985c == null) {
                    f15985c = new h1(context.getApplicationContext(), f15987e ? c().getLooper() : context.getMainLooper());
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f15985c;
    }

    public static HandlerThread c() {
        synchronized (f15984b) {
            try {
                HandlerThread handlerThread = f15986d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f15986d = handlerThread2;
                handlerThread2.start();
                HandlerThread handlerThread3 = f15986d;
                return handlerThread3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d(c1 c1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        d(new c1(str, str2, i10, z10), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    public abstract boolean f(c1 c1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
