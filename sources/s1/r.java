package s1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.a;
import cm.l;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import m1.m;
import m1.y;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final String f15849a;

    static {
        String i10 = m.i("ProcessUtils");
        l.e(i10, "tagWithPrefix(\"ProcessUtils\")");
        f15849a = i10;
    }

    private static final String a(Context context) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f15813a.a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, y.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            l.c(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th2) {
            m.e().b(f15849a, "Unable to check ActivityThread for processName", th2);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        l.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean b(Context context, a aVar) {
        l.f(context, "context");
        l.f(aVar, "configuration");
        String a10 = a(context);
        String c10 = aVar.c();
        return l.a(a10, (c10 == null || c10.length() == 0) ? context.getApplicationInfo().processName : aVar.c());
    }
}
