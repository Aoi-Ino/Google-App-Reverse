package com.google.android.gms.dynamite;

import a4.f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p3.j;
import s3.n;
import s3.o;

public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static final b f5365b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final b f5366c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final b f5367d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final b f5368e = new g();

    /* renamed from: f  reason: collision with root package name */
    public static final b f5369f = new h();

    /* renamed from: g  reason: collision with root package name */
    public static final b f5370g = new i();

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f5371h = null;

    /* renamed from: i  reason: collision with root package name */
    private static String f5372i = null;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f5373j = false;

    /* renamed from: k  reason: collision with root package name */
    private static int f5374k = -1;

    /* renamed from: l  reason: collision with root package name */
    private static Boolean f5375l;

    /* renamed from: m  reason: collision with root package name */
    private static final ThreadLocal f5376m = new ThreadLocal();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadLocal f5377n = new b();

    /* renamed from: o  reason: collision with root package name */
    private static final b.a f5378o = new c();

    /* renamed from: p  reason: collision with root package name */
    public static final b f5379p = new j();

    /* renamed from: q  reason: collision with root package name */
    private static m f5380q;

    /* renamed from: r  reason: collision with root package name */
    private static n f5381r;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5382a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, f fVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th2, f fVar) {
            super(str, th2);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z10);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public static class C0097b {

            /* renamed from: a  reason: collision with root package name */
            public int f5383a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f5384b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f5385c = 0;
        }

        C0097b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        o.i(context);
        this.f5382a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (n.a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:165:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0304  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule c(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.b r19, java.lang.String r20) {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.ThreadLocal r0 = f5376m
            java.lang.Object r4 = r0.get()
            com.google.android.gms.dynamite.k r4 = (com.google.android.gms.dynamite.k) r4
            com.google.android.gms.dynamite.k r5 = new com.google.android.gms.dynamite.k
            r6 = 0
            r5.<init>(r6)
            r0.set(r5)
            java.lang.ThreadLocal r7 = f5377n
            java.lang.Object r8 = r7.get()
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            r10 = 0
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0235 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0235 }
            r7.set(r12)     // Catch:{ all -> 0x0235 }
            com.google.android.gms.dynamite.DynamiteModule$b$a r12 = f5378o     // Catch:{ all -> 0x0235 }
            com.google.android.gms.dynamite.DynamiteModule$b$b r12 = r2.a(r1, r3, r12)     // Catch:{ all -> 0x0235 }
            int r13 = r12.f5383a     // Catch:{ all -> 0x0235 }
            int r14 = r12.f5384b     // Catch:{ all -> 0x0235 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0235 }
            r15.<init>()     // Catch:{ all -> 0x0235 }
            java.lang.String r6 = "Considering local module "
            r15.append(r6)     // Catch:{ all -> 0x0235 }
            r15.append(r3)     // Catch:{ all -> 0x0235 }
            java.lang.String r6 = ":"
            r15.append(r6)     // Catch:{ all -> 0x0235 }
            r15.append(r13)     // Catch:{ all -> 0x0235 }
            java.lang.String r6 = " and remote module "
            r15.append(r6)     // Catch:{ all -> 0x0235 }
            r15.append(r3)     // Catch:{ all -> 0x0235 }
            java.lang.String r6 = ":"
            r15.append(r6)     // Catch:{ all -> 0x0235 }
            r15.append(r14)     // Catch:{ all -> 0x0235 }
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r13 = r15.toString()     // Catch:{ all -> 0x0235 }
            android.util.Log.i(r6, r13)     // Catch:{ all -> 0x0235 }
            int r6 = r12.f5385c     // Catch:{ all -> 0x0235 }
            if (r6 == 0) goto L_0x02bc
            r13 = -1
            if (r6 != r13) goto L_0x0079
            int r6 = r12.f5383a     // Catch:{ all -> 0x0075 }
            if (r6 == 0) goto L_0x02bc
            r6 = r13
            goto L_0x0079
        L_0x0075:
            r0 = move-exception
            r1 = r10
            goto L_0x02ed
        L_0x0079:
            r14 = 1
            if (r6 != r14) goto L_0x0080
            int r15 = r12.f5384b     // Catch:{ all -> 0x0075 }
            if (r15 == 0) goto L_0x02bc
        L_0x0080:
            if (r6 != r13) goto L_0x00a0
            com.google.android.gms.dynamite.DynamiteModule r1 = f(r1, r3)     // Catch:{ all -> 0x0075 }
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x008e
            r7.remove()
            goto L_0x0095
        L_0x008e:
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r7.set(r2)
        L_0x0095:
            android.database.Cursor r2 = r5.f5386a
            if (r2 == 0) goto L_0x009c
            r2.close()
        L_0x009c:
            r0.set(r4)
            return r1
        L_0x00a0:
            if (r6 != r14) goto L_0x02a4
            int r15 = r12.f5384b     // Catch:{ a -> 0x023a }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r16 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r16)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            boolean r17 = i(r18)     // Catch:{ all -> 0x021c }
            if (r17 == 0) goto L_0x021e
            java.lang.Boolean r17 = f5371h     // Catch:{ all -> 0x021c }
            monitor-exit(r16)     // Catch:{ all -> 0x021c }
            if (r17 == 0) goto L_0x0213
            boolean r16 = r17.booleanValue()     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            r14 = 2
            if (r16 == 0) goto L_0x016c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            r13.<init>()     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r6 = "Selected remote version of "
            r13.append(r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            r13.append(r3)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r6 = ", version >= "
            r13.append(r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            r13.append(r15)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r13 = r13.toString()     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            android.util.Log.i(r6, r13)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r6 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            com.google.android.gms.dynamite.n r13 = f5381r     // Catch:{ all -> 0x0169 }
            monitor-exit(r6)     // Catch:{ all -> 0x0169 }
            if (r13 == 0) goto L_0x0160
            java.lang.Object r6 = r0.get()     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            com.google.android.gms.dynamite.k r6 = (com.google.android.gms.dynamite.k) r6     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            if (r6 == 0) goto L_0x0157
            android.database.Cursor r10 = r6.f5386a     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            if (r10 == 0) goto L_0x0157
            android.content.Context r10 = r18.getApplicationContext()     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            android.database.Cursor r6 = r6.f5386a     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            r11 = 0
            z3.d.l0(r11)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r11 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r11)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            int r2 = f5374k     // Catch:{ all -> 0x0154 }
            if (r2 < r14) goto L_0x00fe
            r14 = 1
            goto L_0x00ff
        L_0x00fe:
            r14 = 0
        L_0x00ff:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x0154 }
            monitor-exit(r11)     // Catch:{ all -> 0x0154 }
            boolean r2 = r2.booleanValue()     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            if (r2 == 0) goto L_0x0127
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r11 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r2, r11)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r2 = z3.d.l0(r10)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r6 = z3.d.l0(r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r2 = r13.l0(r2, r3, r15, r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            goto L_0x013a
        L_0x011e:
            r0 = move-exception
            goto L_0x0229
        L_0x0121:
            r0 = move-exception
            goto L_0x023c
        L_0x0124:
            r0 = move-exception
            goto L_0x023d
        L_0x0127:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r11 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r2, r11)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r2 = z3.d.l0(r10)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r6 = z3.d.l0(r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r2 = r13.j(r2, r3, r15, r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x013a:
            java.lang.Object r2 = z3.d.j(r2)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            if (r2 == 0) goto L_0x014b
            com.google.android.gms.dynamite.DynamiteModule r6 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x0147:
            r1 = 0
            goto L_0x01e7
        L_0x014b:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r2 = "Failed to get module context"
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            throw r0     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x0154:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0154 }
            throw r0     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x0157:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r2 = "No result cursor"
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            throw r0     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x0160:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r2 = "DynamiteLoaderV2 was not cached."
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            throw r0     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x0169:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0169 }
            throw r0     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x016c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            r2.<init>()     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r6 = "Selected remote version of "
            r2.append(r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            r2.append(r3)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r6 = ", version >= "
            r2.append(r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            r2.append(r15)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r2 = r2.toString()     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            android.util.Log.i(r6, r2)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            com.google.android.gms.dynamite.m r2 = j(r18)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            if (r2 == 0) goto L_0x020a
            int r6 = r2.j()     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            r10 = 3
            if (r6 < r10) goto L_0x01b7
            java.lang.Object r6 = r0.get()     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            com.google.android.gms.dynamite.k r6 = (com.google.android.gms.dynamite.k) r6     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            if (r6 == 0) goto L_0x01ae
            z3.b r10 = z3.d.l0(r18)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            android.database.Cursor r6 = r6.f5386a     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r6 = z3.d.l0(r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r2 = r2.o0(r10, r3, r15, r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            goto L_0x01d8
        L_0x01ae:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r2 = "No cached result cursor holder"
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            throw r0     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x01b7:
            if (r6 != r14) goto L_0x01c9
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r10 = "IDynamite loader version = 2"
            android.util.Log.w(r6, r10)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r6 = z3.d.l0(r18)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r2 = r2.p0(r6, r3, r15)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            goto L_0x01d8
        L_0x01c9:
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r10 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r6, r10)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r6 = z3.d.l0(r18)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            z3.b r2 = r2.n0(r6, r3, r15)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x01d8:
            java.lang.Object r2 = z3.d.j(r2)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            if (r2 == 0) goto L_0x0201
            com.google.android.gms.dynamite.DynamiteModule r6 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            goto L_0x0147
        L_0x01e7:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x01ef
            r7.remove()
            goto L_0x01f6
        L_0x01ef:
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r7.set(r1)
        L_0x01f6:
            android.database.Cursor r1 = r5.f5386a
            if (r1 == 0) goto L_0x01fd
            r1.close()
        L_0x01fd:
            r0.set(r4)
            return r6
        L_0x0201:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r2 = "Failed to load remote module."
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            throw r0     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x020a:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r2 = "Failed to create IDynamiteLoader."
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            throw r0     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x0213:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            java.lang.String r2 = "Failed to determine which loading route to use."
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
            throw r0     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x021c:
            r0 = move-exception
            goto L_0x0227
        L_0x021e:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x021c }
            java.lang.String r2 = "Remote loading disabled"
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x0227:
            monitor-exit(r16)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ RemoteException -> 0x0124, a -> 0x0121, all -> 0x011e }
        L_0x0229:
            w3.e.a(r1, r0)     // Catch:{ a -> 0x023a }
            com.google.android.gms.dynamite.DynamiteModule$a r2 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x023a }
            java.lang.String r6 = "Failed to load remote module."
            r7 = 0
            r2.<init>(r6, r0, r7)     // Catch:{ a -> 0x023a }
            throw r2     // Catch:{ a -> 0x023a }
        L_0x0235:
            r0 = move-exception
            r1 = 0
            goto L_0x02ed
        L_0x023a:
            r0 = move-exception
            goto L_0x0246
        L_0x023c:
            throw r0     // Catch:{ a -> 0x023a }
        L_0x023d:
            com.google.android.gms.dynamite.DynamiteModule$a r2 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ a -> 0x023a }
            java.lang.String r6 = "Failed to load remote module."
            r7 = 0
            r2.<init>(r6, r0, r7)     // Catch:{ a -> 0x023a }
            throw r2     // Catch:{ a -> 0x023a }
        L_0x0246:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x0235 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0235 }
            r6.<init>()     // Catch:{ all -> 0x0235 }
            java.lang.String r7 = "Failed to load remote module: "
            r6.append(r7)     // Catch:{ all -> 0x0235 }
            r6.append(r2)     // Catch:{ all -> 0x0235 }
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0235 }
            android.util.Log.w(r2, r6)     // Catch:{ all -> 0x0235 }
            int r2 = r12.f5383a     // Catch:{ all -> 0x0235 }
            if (r2 == 0) goto L_0x029b
            com.google.android.gms.dynamite.l r6 = new com.google.android.gms.dynamite.l     // Catch:{ all -> 0x0235 }
            r7 = 0
            r6.<init>(r2, r7)     // Catch:{ all -> 0x0235 }
            r2 = r19
            com.google.android.gms.dynamite.DynamiteModule$b$b r2 = r2.a(r1, r3, r6)     // Catch:{ all -> 0x0235 }
            int r2 = r2.f5385c     // Catch:{ all -> 0x0235 }
            r6 = -1
            if (r2 != r6) goto L_0x029b
            com.google.android.gms.dynamite.DynamiteModule r0 = f(r1, r3)     // Catch:{ all -> 0x0235 }
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0285
            java.lang.ThreadLocal r1 = f5377n
            r1.remove()
            goto L_0x028e
        L_0x0285:
            java.lang.ThreadLocal r1 = f5377n
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x028e:
            android.database.Cursor r1 = r5.f5386a
            if (r1 == 0) goto L_0x0295
            r1.close()
        L_0x0295:
            java.lang.ThreadLocal r1 = f5376m
            r1.set(r4)
            return r0
        L_0x029b:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0235 }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x0235 }
            throw r1     // Catch:{ all -> 0x0235 }
        L_0x02a4:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0235 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0235 }
            r1.<init>()     // Catch:{ all -> 0x0235 }
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.append(r2)     // Catch:{ all -> 0x0235 }
            r1.append(r6)     // Catch:{ all -> 0x0235 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0235 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0235 }
            throw r0     // Catch:{ all -> 0x0235 }
        L_0x02bc:
            com.google.android.gms.dynamite.DynamiteModule$a r0 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x0235 }
            int r1 = r12.f5383a     // Catch:{ all -> 0x0235 }
            int r2 = r12.f5384b     // Catch:{ all -> 0x0235 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0235 }
            r6.<init>()     // Catch:{ all -> 0x0235 }
            java.lang.String r7 = "No acceptable module "
            r6.append(r7)     // Catch:{ all -> 0x0235 }
            r6.append(r3)     // Catch:{ all -> 0x0235 }
            java.lang.String r3 = " found. Local version is "
            r6.append(r3)     // Catch:{ all -> 0x0235 }
            r6.append(r1)     // Catch:{ all -> 0x0235 }
            java.lang.String r1 = " and remote version is "
            r6.append(r1)     // Catch:{ all -> 0x0235 }
            r6.append(r2)     // Catch:{ all -> 0x0235 }
            java.lang.String r1 = "."
            r6.append(r1)     // Catch:{ all -> 0x0235 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0235 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0235 }
            throw r0     // Catch:{ all -> 0x0235 }
        L_0x02ed:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x02f7
            java.lang.ThreadLocal r1 = f5377n
            r1.remove()
            goto L_0x0300
        L_0x02f7:
            java.lang.ThreadLocal r1 = f5377n
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x0300:
            android.database.Cursor r1 = r5.f5386a
            if (r1 == 0) goto L_0x0307
            r1.close()
        L_0x0307:
            java.lang.ThreadLocal r1 = f5376m
            r1.set(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:52:0x00a2=Splitter:B:52:0x00a2, B:33:0x005c=Splitter:B:33:0x005c, B:18:0x003e=Splitter:B:18:0x003e} */
    public static int d(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00e9 }
            java.lang.Boolean r1 = f5371h     // Catch:{ all -> 0x004b }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00dd
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00be, IllegalAccessException -> 0x00bc, NoSuchFieldException -> 0x00ba }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00be, IllegalAccessException -> 0x00bc, NoSuchFieldException -> 0x00ba }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00be, IllegalAccessException -> 0x00bc, NoSuchFieldException -> 0x00ba }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00be, IllegalAccessException -> 0x00bc, NoSuchFieldException -> 0x00ba }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00be, IllegalAccessException -> 0x00bc, NoSuchFieldException -> 0x00ba }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00be, IllegalAccessException -> 0x00bc, NoSuchFieldException -> 0x00ba }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00be, IllegalAccessException -> 0x00bc, NoSuchFieldException -> 0x00ba }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x0036 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x0036 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0036 }
            if (r5 != r6) goto L_0x0039
        L_0x0032:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0036 }
            goto L_0x00b6
        L_0x0036:
            r1 = move-exception
            goto L_0x00b8
        L_0x0039:
            if (r5 == 0) goto L_0x0042
            g(r5)     // Catch:{ a -> 0x003e }
        L_0x003e:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0036 }
            goto L_0x00b6
        L_0x0042:
            boolean r5 = i(r10)     // Catch:{ all -> 0x0036 }
            if (r5 != 0) goto L_0x004e
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return r3
        L_0x004b:
            r11 = move-exception
            goto L_0x01cb
        L_0x004e:
            boolean r5 = f5373j     // Catch:{ all -> 0x0036 }
            if (r5 != 0) goto L_0x00ad
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0036 }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x0036 }
            if (r6 == 0) goto L_0x005b
            goto L_0x00ad
        L_0x005b:
            r6 = 1
            int r6 = e(r10, r11, r12, r6)     // Catch:{ a -> 0x00a5 }
            java.lang.String r7 = f5372i     // Catch:{ a -> 0x00a5 }
            if (r7 == 0) goto L_0x00a2
            boolean r7 = r7.isEmpty()     // Catch:{ a -> 0x00a5 }
            if (r7 == 0) goto L_0x006b
            goto L_0x00a2
        L_0x006b:
            java.lang.ClassLoader r7 = a4.d.a()     // Catch:{ a -> 0x00a5 }
            if (r7 == 0) goto L_0x0072
            goto L_0x0097
        L_0x0072:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x00a5 }
            r8 = 29
            if (r7 < r8) goto L_0x0089
            a4.b.a()     // Catch:{ a -> 0x00a5 }
            java.lang.String r7 = f5372i     // Catch:{ a -> 0x00a5 }
            s3.o.i(r7)     // Catch:{ a -> 0x00a5 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x00a5 }
            dalvik.system.DelegateLastClassLoader r7 = a4.a.a(r7, r8)     // Catch:{ a -> 0x00a5 }
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.dynamite.a r7 = new com.google.android.gms.dynamite.a     // Catch:{ a -> 0x00a5 }
            java.lang.String r8 = f5372i     // Catch:{ a -> 0x00a5 }
            s3.o.i(r8)     // Catch:{ a -> 0x00a5 }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x00a5 }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x00a5 }
        L_0x0097:
            g(r7)     // Catch:{ a -> 0x00a5 }
            r1.set(r2, r7)     // Catch:{ a -> 0x00a5 }
            f5371h = r5     // Catch:{ a -> 0x00a5 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return r6
        L_0x00a2:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return r6
        L_0x00a5:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0036 }
            r1.set(r2, r5)     // Catch:{ all -> 0x0036 }
            goto L_0x0032
        L_0x00ad:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0036 }
            r1.set(r2, r5)     // Catch:{ all -> 0x0036 }
            goto L_0x0032
        L_0x00b6:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            goto L_0x00db
        L_0x00b8:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00be, IllegalAccessException -> 0x00bc, NoSuchFieldException -> 0x00ba }
        L_0x00ba:
            r1 = move-exception
            goto L_0x00bf
        L_0x00bc:
            r1 = move-exception
            goto L_0x00bf
        L_0x00be:
            r1 = move-exception
        L_0x00bf:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            r4.<init>()     // Catch:{ all -> 0x004b }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x004b }
            r4.append(r1)     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x004b }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x004b }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004b }
        L_0x00db:
            f5371h = r1     // Catch:{ all -> 0x004b }
        L_0x00dd:
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x0108
            int r10 = e(r10, r11, r12, r3)     // Catch:{ a -> 0x00ec }
            return r10
        L_0x00e9:
            r11 = move-exception
            goto L_0x01cd
        L_0x00ec:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00e9 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            r12.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x00e9 }
            r12.append(r11)     // Catch:{ all -> 0x00e9 }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00e9 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x00e9 }
            return r3
        L_0x0108:
            com.google.android.gms.dynamite.m r4 = j(r10)     // Catch:{ all -> 0x00e9 }
            if (r4 != 0) goto L_0x0110
            goto L_0x01c2
        L_0x0110:
            int r0 = r4.j()     // Catch:{ RemoteException -> 0x012b }
            r1 = 3
            if (r0 < r1) goto L_0x017d
            java.lang.ThreadLocal r0 = f5376m     // Catch:{ RemoteException -> 0x012b }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x012b }
            com.google.android.gms.dynamite.k r0 = (com.google.android.gms.dynamite.k) r0     // Catch:{ RemoteException -> 0x012b }
            if (r0 == 0) goto L_0x012e
            android.database.Cursor r0 = r0.f5386a     // Catch:{ RemoteException -> 0x012b }
            if (r0 == 0) goto L_0x012e
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x012b }
            goto L_0x01c2
        L_0x012b:
            r11 = move-exception
            goto L_0x01a2
        L_0x012e:
            z3.b r5 = z3.d.l0(r10)     // Catch:{ RemoteException -> 0x012b }
            java.lang.ThreadLocal r0 = f5377n     // Catch:{ RemoteException -> 0x012b }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x012b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x012b }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x012b }
            r6 = r11
            r7 = r12
            z3.b r11 = r4.q0(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x012b }
            java.lang.Object r11 = z3.d.j(r11)     // Catch:{ RemoteException -> 0x012b }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x012b }
            if (r11 == 0) goto L_0x016c
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x0162, all -> 0x0160 }
            if (r12 != 0) goto L_0x0153
            goto L_0x016c
        L_0x0153:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x0162, all -> 0x0160 }
            if (r12 <= 0) goto L_0x0164
            boolean r0 = h(r11)     // Catch:{ RemoteException -> 0x0162, all -> 0x0160 }
            if (r0 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0160:
            r12 = move-exception
            goto L_0x0179
        L_0x0162:
            r12 = move-exception
            goto L_0x017b
        L_0x0164:
            r2 = r11
        L_0x0165:
            if (r2 == 0) goto L_0x016a
            r2.close()     // Catch:{ all -> 0x00e9 }
        L_0x016a:
            r3 = r12
            goto L_0x01c2
        L_0x016c:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch:{ RemoteException -> 0x0162, all -> 0x0160 }
            if (r11 == 0) goto L_0x01c2
            r11.close()     // Catch:{ all -> 0x00e9 }
            goto L_0x01c2
        L_0x0179:
            r2 = r11
            goto L_0x01c5
        L_0x017b:
            r2 = r11
            goto L_0x01a3
        L_0x017d:
            r1 = 2
            if (r0 != r1) goto L_0x0190
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x012b }
            z3.b r0 = z3.d.l0(r10)     // Catch:{ RemoteException -> 0x012b }
            int r3 = r4.m0(r0, r11, r12)     // Catch:{ RemoteException -> 0x012b }
            goto L_0x01c2
        L_0x0190:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x012b }
            z3.b r0 = z3.d.l0(r10)     // Catch:{ RemoteException -> 0x012b }
            int r3 = r4.l0(r0, r11, r12)     // Catch:{ RemoteException -> 0x012b }
            goto L_0x01c2
        L_0x01a0:
            r12 = r11
            goto L_0x01c5
        L_0x01a2:
            r12 = r11
        L_0x01a3:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r12.<init>()     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x01c3 }
            r12.append(r11)     // Catch:{ all -> 0x01c3 }
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x01c3 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01c3 }
            if (r2 == 0) goto L_0x01c2
            r2.close()     // Catch:{ all -> 0x00e9 }
        L_0x01c2:
            return r3
        L_0x01c3:
            r11 = move-exception
            goto L_0x01a0
        L_0x01c5:
            if (r2 == 0) goto L_0x01ca
            r2.close()     // Catch:{ all -> 0x00e9 }
        L_0x01ca:
            throw r12     // Catch:{ all -> 0x00e9 }
        L_0x01cb:
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r11     // Catch:{ all -> 0x00e9 }
        L_0x01cd:
            w3.e.a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c2 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c3 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int e(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f5377n     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            r12.<init>()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            if (r10 == 0) goto L_0x00a9
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009f }
            if (r11 == 0) goto L_0x00a9
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009f }
            if (r12 <= 0) goto L_0x0090
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009f }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x0070 }
            f5372i = r2     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x0070 }
            if (r2 < 0) goto L_0x0072
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x0070 }
            f5374k = r2     // Catch:{ all -> 0x0070 }
            goto L_0x0072
        L_0x0070:
            r11 = move-exception
            goto L_0x008e
        L_0x0072:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x0070 }
            if (r2 < 0) goto L_0x0085
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r9 = r11
        L_0x0082:
            f5373j = r9     // Catch:{ all -> 0x0070 }
            r11 = r9
        L_0x0085:
            monitor-exit(r1)     // Catch:{ all -> 0x0070 }
            boolean r1 = h(r10)     // Catch:{ Exception -> 0x009f }
            if (r1 == 0) goto L_0x0090
            r10 = r0
            goto L_0x0090
        L_0x008e:
            monitor-exit(r1)     // Catch:{ all -> 0x0070 }
            throw r11     // Catch:{ Exception -> 0x009f }
        L_0x0090:
            if (r13 == 0) goto L_0x00a3
            if (r11 != 0) goto L_0x0095
            goto L_0x00a3
        L_0x0095:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009f }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009f }
            throw r11     // Catch:{ Exception -> 0x009f }
        L_0x009d:
            r11 = move-exception
            goto L_0x00a1
        L_0x009f:
            r11 = move-exception
            goto L_0x00be
        L_0x00a1:
            r0 = r10
            goto L_0x00cb
        L_0x00a3:
            if (r10 == 0) goto L_0x00a8
            r10.close()
        L_0x00a8:
            return r12
        L_0x00a9:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009f }
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009f }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009f }
            throw r11     // Catch:{ Exception -> 0x009f }
        L_0x00b8:
            r10 = move-exception
            r11 = r10
            goto L_0x00cb
        L_0x00bb:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00be:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x009d }
            if (r12 == 0) goto L_0x00c3
            throw r11     // Catch:{ all -> 0x009d }
        L_0x00c3:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x009d }
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x009d }
            throw r12     // Catch:{ all -> 0x009d }
        L_0x00cb:
            if (r0 == 0) goto L_0x00d0
            r0.close()
        L_0x00d0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void g(ClassLoader classLoader) {
        n nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder);
            }
            f5381r = nVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, (f) null);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, (f) null);
        } catch (InstantiationException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, (f) null);
        } catch (InvocationTargetException e13) {
            e = e13;
            throw new a("Failed to instantiate dynamite loader", e, (f) null);
        } catch (NoSuchMethodException e14) {
            e = e14;
            throw new a("Failed to instantiate dynamite loader", e, (f) null);
        }
    }

    private static boolean h(Cursor cursor) {
        k kVar = (k) f5376m.get();
        if (kVar == null || kVar.f5386a != null) {
            return false;
        }
        kVar.f5386a = cursor;
        return true;
    }

    private static boolean i(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f5375l)) {
            return true;
        }
        boolean z10 = false;
        if (f5375l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (j.e().g(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f5375l = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f5373j = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    private static m j(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f5380q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f5380q = mVar;
                    return mVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
        }
        return null;
    }

    public Context b() {
        return this.f5382a;
    }
}
