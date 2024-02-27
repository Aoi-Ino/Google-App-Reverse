package en;

import android.util.Log;
import cm.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import um.z;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArraySet f23057a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f23058b;

    /* renamed from: c  reason: collision with root package name */
    public static final e f23059c = new e();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<z> cls = z.class;
        Package packageR = cls.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = cls.getName();
        l.e(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = cn.e.class.getName();
        l.e(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = ym.e.class.getName();
        l.e(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f23058b = i0.p(linkedHashMap);
    }

    private e() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f23057a.add(logger)) {
            l.e(logger, "logger");
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(f.f23060a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f23058b.get(str);
        return str2 != null ? str2 : s.E0(str, 23);
    }

    public final void a(String str, int i10, String str2, Throwable th2) {
        int min;
        l.f(str, "loggerName");
        l.f(str2, "message");
        String d10 = d(str);
        if (Log.isLoggable(d10, i10)) {
            if (th2 != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th2);
            }
            int length = str2.length();
            int i11 = 0;
            while (i11 < length) {
                int P = q.P(str2, 10, i11, false, 4, (Object) null);
                if (P == -1) {
                    P = length;
                }
                while (true) {
                    min = Math.min(P, i11 + 4000);
                    String substring = str2.substring(i11, min);
                    l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i10, d10, substring);
                    if (min >= P) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f23058b.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
