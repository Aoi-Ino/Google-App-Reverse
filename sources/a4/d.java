package a4;

import android.os.Looper;
import android.util.Log;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ClassLoader f204a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile Thread f205b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (d.class) {
            try {
                if (f204a == null) {
                    f204a = b();
                }
                classLoader = f204a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return classLoader;
    }

    private static synchronized ClassLoader b() {
        synchronized (d.class) {
            ClassLoader classLoader = null;
            if (f205b == null) {
                f205b = c();
                if (f205b == null) {
                    return null;
                }
            }
            synchronized (f205b) {
                try {
                    classLoader = f205b.getContextClassLoader();
                } catch (SecurityException e10) {
                    String message = e10.getMessage();
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + message);
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread c() {
        c cVar;
        SecurityException e10;
        c cVar2;
        ThreadGroup threadGroup;
        synchronized (d.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i11];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i11++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i10 >= activeCount) {
                            cVar = null;
                            break;
                        }
                        cVar = threadArr[i10];
                        if ("GmsDynamite".equals(cVar.getName())) {
                            break;
                        }
                        i10++;
                    }
                    if (cVar == null) {
                        try {
                            cVar2 = new c(threadGroup, "GmsDynamite");
                        } catch (SecurityException e11) {
                            e10 = e11;
                            cVar2 = cVar;
                            try {
                                Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                                cVar = cVar2;
                                return cVar;
                            } catch (Throwable th2) {
                                while (true) {
                                }
                                throw th2;
                            }
                        }
                        try {
                            cVar2.setContextClassLoader((ClassLoader) null);
                            cVar2.start();
                        } catch (SecurityException e12) {
                            e10 = e12;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                            cVar = cVar2;
                            return cVar;
                        }
                        cVar = cVar2;
                    }
                } catch (SecurityException e13) {
                    e10 = e13;
                    cVar2 = null;
                    Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                    cVar = cVar2;
                    return cVar;
                }
            }
            return cVar;
        }
    }
}
