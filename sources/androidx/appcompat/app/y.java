package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private static Field f770a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f771b;

    /* renamed from: c  reason: collision with root package name */
    private static Class f772c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f773d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f774e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f775f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f776g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f777h;

    static class a {
        static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT < 28) {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f777h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f776g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f777h = true;
        }
        Field field = f776g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                obj = null;
            }
            if (obj != null) {
                if (!f771b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f770a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e12) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                    }
                    f771b = true;
                }
                Field field2 = f770a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e13) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                    }
                }
                if (obj2 != null) {
                    c(obj2);
                }
            }
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f773d) {
            try {
                f772c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f773d = true;
        }
        Class cls = f772c;
        if (cls != null) {
            if (!f775f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f774e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f775f = true;
            }
            Field field = f774e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e12) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    a.a(longSparseArray);
                }
            }
        }
    }
}
