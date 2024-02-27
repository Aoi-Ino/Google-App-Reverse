package q5;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import t5.a;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f15215a = new HashSet(Arrays.asList(new String[]{"app_update", "review"}));

    /* renamed from: b  reason: collision with root package name */
    private static final Set f15216b = new HashSet(Arrays.asList(new String[]{"native", "unity"}));

    /* renamed from: c  reason: collision with root package name */
    private static final Map f15217c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final a f15218d = new a("PlayCoreVersion");

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        Map b10 = b(str);
        bundle.putInt("playcore_version_code", ((Integer) b10.get("java")).intValue());
        if (b10.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b10.get("native")).intValue());
        }
        if (b10.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b10.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b(String str) {
        Map map;
        synchronized (c.class) {
            try {
                Map map2 = f15217c;
                if (!map2.containsKey(str)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("java", 11003);
                    map2.put(str, hashMap);
                }
                map = (Map) map2.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }
}
