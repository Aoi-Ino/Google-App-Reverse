package e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import cm.l;
import e.a;

public class b extends a {
    /* renamed from: d */
    public Intent a(Context context, String str) {
        l.f(context, "context");
        l.f(str, "input");
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
        l.e(type, "Intent(Intent.ACTION_GET…          .setType(input)");
        return type;
    }

    /* renamed from: e */
    public final a.C0134a b(Context context, String str) {
        l.f(context, "context");
        l.f(str, "input");
        return null;
    }

    /* renamed from: f */
    public final Uri c(int i10, Intent intent) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
