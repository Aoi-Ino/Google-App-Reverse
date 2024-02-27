package c6;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import f6.c0;
import f6.t;
import g6.o;
import java.io.IOException;
import y5.l;

public final class e implements l {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences.Editor f4767a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4768b;

    public e(Context context, String str, String str2) {
        if (str != null) {
            this.f4768b = str;
            Context applicationContext = context.getApplicationContext();
            this.f4767a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public void a(t tVar) {
        if (!this.f4767a.putString(this.f4768b, o.b(tVar.d())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public void b(c0 c0Var) {
        if (!this.f4767a.putString(this.f4768b, o.b(c0Var.d())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
