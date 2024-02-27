package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class j extends o {

    /* renamed from: b  reason: collision with root package name */
    private static Class f2385b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor f2386c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2387d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f2388e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f2389f = false;

    j() {
    }

    private static boolean h(Object obj, String str, int i10, boolean z10) {
        k();
        try {
            return ((Boolean) f2387d.invoke(obj, new Object[]{str, Integer.valueOf(i10), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object newInstance = Array.newInstance(f2385b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2388e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        Method method2;
        if (!f2389f) {
            f2389f = true;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                constructor = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            } catch (ClassNotFoundException | NoSuchMethodException e10) {
                Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
                cls = null;
                method2 = null;
                constructor = null;
                method = null;
            }
            f2386c = constructor;
            f2385b = cls;
            f2387d = method;
            f2388e = method2;
        }
    }

    private static Object l() {
        k();
        try {
            return f2386c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        Object l10 = l();
        e.d[] a10 = cVar.a();
        int length = a10.length;
        int i11 = 0;
        while (i11 < length) {
            e.d dVar = a10[i11];
            File e10 = p.e(context);
            if (e10 == null) {
                return null;
            }
            try {
                if (!p.c(e10, resources, dVar.b())) {
                    e10.delete();
                    return null;
                } else if (!h(l10, e10.getPath(), dVar.e(), dVar.f())) {
                    return null;
                } else {
                    i11++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e10.delete();
            }
        }
        return i(l10);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        g.b g10 = g(bVarArr, i10);
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(g10.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File j10 = j(openFileDescriptor);
            if (j10 != null) {
                if (j10.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(j10);
                    openFileDescriptor.close();
                    return createFromFile;
                }
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c10 = super.c(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return c10;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
        throw th;
    }
}
