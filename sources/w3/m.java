package w3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import s3.o;
import y3.d;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static final int f17871a = Process.myUid();

    /* renamed from: b  reason: collision with root package name */
    private static final Method f17872b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f17873c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f17874d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f17875e;

    /* renamed from: f  reason: collision with root package name */
    private static final Method f17876f;

    /* renamed from: g  reason: collision with root package name */
    private static final Method f17877g;

    /* renamed from: h  reason: collision with root package name */
    private static final Method f17878h;

    /* renamed from: i  reason: collision with root package name */
    private static final Method f17879i;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056 A[SYNTHETIC, Splitter:B:23:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00aa  */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            f17871a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0018 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0018 }
            r5[r3] = r6     // Catch:{ Exception -> 0x0018 }
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r5 = r4
        L_0x0019:
            f17872b = r5
            boolean r5 = w3.j.c()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L_0x0031
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0031 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0031 }
            r5[r3] = r8     // Catch:{ Exception -> 0x0031 }
            r5[r2] = r6     // Catch:{ Exception -> 0x0031 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0032
        L_0x0031:
            r0 = r4
        L_0x0032:
            f17873c = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x003d }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x003d }
            goto L_0x003e
        L_0x003d:
            r0 = r4
        L_0x003e:
            f17874d = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x004d }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x004d }
            r0[r3] = r5     // Catch:{ Exception -> 0x004d }
            java.lang.String r5 = "get"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch:{ Exception -> 0x004d }
            goto L_0x004e
        L_0x004d:
            r0 = r4
        L_0x004e:
            f17875e = r0
            boolean r0 = w3.j.c()
            if (r0 == 0) goto L_0x0063
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0063 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0063 }
            r0[r3] = r5     // Catch:{ Exception -> 0x0063 }
            java.lang.String r5 = "getName"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0064
        L_0x0063:
            r0 = r4
        L_0x0064:
            f17876f = r0
            boolean r0 = w3.j.h()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0077 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch:{ Exception -> 0x0077 }
            goto L_0x007e
        L_0x0077:
            r0 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r8, r0)
        L_0x007d:
            r0 = r4
        L_0x007e:
            f17877g = r0
            boolean r0 = w3.j.h()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x009b }
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x009b }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x009b }
            r7[r3] = r8     // Catch:{ Exception -> 0x009b }
            r7[r2] = r6     // Catch:{ Exception -> 0x009b }
            java.lang.String r6 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch:{ Exception -> 0x009b }
            goto L_0x00a2
        L_0x009b:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain class"
            android.util.Log.w(r5, r6, r0)
        L_0x00a1:
            r0 = r4
        L_0x00a2:
            f17878h = r0
            boolean r0 = w3.j.h()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00b5 }
            java.lang.reflect.Method r4 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x00b5 }
            r4.setAccessible(r2)     // Catch:{ Exception -> 0x00b5 }
        L_0x00b5:
            f17879i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.m.<clinit>():void");
    }

    public static void a(WorkSource workSource, int i10, String str) {
        Method method = f17873c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i10), str});
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        } else {
            Method method2 = f17872b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i10)});
                } catch (Exception e11) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                }
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        String str2;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            ApplicationInfo b10 = d.a(context).b(str, 0);
            if (b10 == null) {
                str2 = "Could not get applicationInfo from package: ";
                Log.e("WorkSourceUtil", str2.concat(str));
                return null;
            }
            int i10 = b10.uid;
            WorkSource workSource = new WorkSource();
            a(workSource, i10, str);
            return workSource;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Could not find package: ";
        }
    }

    public static boolean c(Context context) {
        return (context == null || context.getPackageManager() == null || d.a(context).a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    public static boolean d(WorkSource workSource) {
        Method method = f17879i;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                o.i(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        return e(workSource) == 0;
    }

    public static int e(WorkSource workSource) {
        Method method = f17874d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                o.i(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }
}
