package s1;

import android.content.Context;
import android.os.PowerManager;
import cm.l;
import java.util.LinkedHashMap;
import java.util.Map;
import m1.m;
import pl.x;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private static final String f15863a;

    static {
        String i10 = m.i("WakeLocks");
        l.e(i10, "tagWithPrefix(\"WakeLocks\")");
        f15863a = i10;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        x xVar = x.f15864a;
        synchronized (xVar) {
            linkedHashMap.putAll(xVar.a());
            x xVar2 = x.f30437a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                m e10 = m.e();
                String str2 = f15863a;
                e10.k(str2, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String str) {
        l.f(context, "context");
        l.f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        l.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        x xVar = x.f15864a;
        synchronized (xVar) {
            String str3 = (String) xVar.a().put(newWakeLock, str2);
        }
        l.e(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
