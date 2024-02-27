package e;

import android.content.Context;
import android.content.Intent;
import cm.g;
import cm.l;
import e.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import pl.o;
import pl.t;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9966a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            l.f(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            l.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        l.f(context, "context");
        l.f(strArr, "input");
        return f9966a.a(strArr);
    }

    /* renamed from: e */
    public a.C0134a b(Context context, String[] strArr) {
        l.f(context, "context");
        l.f(strArr, "input");
        if (strArr.length == 0) {
            return new a.C0134a(i0.g());
        }
        for (String a10 : strArr) {
            if (androidx.core.content.a.a(context, a10) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.b(h0.d(strArr.length), 16));
        for (String a11 : strArr) {
            o a12 = t.a(a11, Boolean.TRUE);
            linkedHashMap.put(a12.c(), a12.d());
        }
        return new a.C0134a(linkedHashMap);
    }

    /* renamed from: f */
    public Map c(int i10, Intent intent) {
        if (i10 != -1) {
            return i0.g();
        }
        if (intent == null) {
            return i0.g();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return i0.g();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i11] == 0));
        }
        return i0.n(y.A0(m.u(stringArrayExtra), arrayList));
    }
}
