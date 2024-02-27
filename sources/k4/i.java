package k4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import j4.d;
import l4.f;
import p3.k;
import p3.l;
import s3.o;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12940a = "i";

    /* renamed from: b  reason: collision with root package name */
    private static Context f12941b;

    /* renamed from: c  reason: collision with root package name */
    private static k f12942c;

    public static k a(Context context, d.a aVar) {
        o.i(context);
        Log.d(f12940a, "preferredRenderer: ".concat(String.valueOf(aVar)));
        k kVar = f12942c;
        if (kVar != null) {
            return kVar;
        }
        int d10 = l.d(context, 13400000);
        if (d10 == 0) {
            k d11 = d(context, aVar);
            f12942c = d11;
            try {
                if (d11.b() == 2) {
                    try {
                        f12942c.b0(z3.d.l0(c(context, aVar)));
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w(f12940a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                        f12941b = null;
                        f12942c = d(context, d.a.LEGACY);
                    } catch (RemoteException e10) {
                        throw new f(e10);
                    }
                }
                try {
                    k kVar2 = f12942c;
                    Context c10 = c(context, aVar);
                    c10.getClass();
                    kVar2.m(z3.d.l0(c10.getResources()), 18020000);
                    return f12942c;
                } catch (RemoteException e11) {
                    throw new f(e11);
                }
            } catch (RemoteException e12) {
                throw new f(e12);
            }
        } else {
            throw new k(d10);
        }
    }

    private static Context b(Exception exc, Context context) {
        Log.e(f12940a, "Failed to load maps module, use pre-Chimera", exc);
        return l.b(context);
    }

    private static Context c(Context context, d.a aVar) {
        Context context2;
        Context context3 = f12941b;
        if (context3 != null) {
            return context3;
        }
        String str = aVar == d.a.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            context2 = DynamiteModule.c(context, DynamiteModule.f5365b, str).b();
        } catch (Exception e10) {
            if (!str.equals("com.google.android.gms.maps_dynamite")) {
                try {
                    Log.d(f12940a, "Attempting to load maps_dynamite again.");
                    context2 = DynamiteModule.c(context, DynamiteModule.f5365b, "com.google.android.gms.maps_dynamite").b();
                } catch (Exception e11) {
                    context2 = b(e11, context);
                }
            } else {
                context2 = b(e10, context);
            }
        }
        f12941b = context2;
        return context2;
    }

    private static k d(Context context, d.a aVar) {
        Log.i(f12940a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) e(((ClassLoader) o.i(c(context, aVar).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return queryLocalInterface instanceof k ? (k) queryLocalInterface : new j(iBinder);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e10);
        }
    }

    private static Object e(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e10) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e10);
        } catch (IllegalAccessException e11) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e11);
        }
    }
}
