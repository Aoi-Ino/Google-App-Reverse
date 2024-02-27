package m3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import s3.o;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f13730c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static a f13731d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f13732a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f13733b;

    a(Context context) {
        this.f13733b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        o.i(context);
        Lock lock = f13730c;
        lock.lock();
        try {
            if (f13731d == null) {
                f13731d = new a(context.getApplicationContext());
            }
            a aVar = f13731d;
            lock.unlock();
            return aVar;
        } catch (Throwable th2) {
            f13730c.unlock();
            throw th2;
        }
    }

    private static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String c10;
        String c11 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c11) || (c10 = c(d("googleSignInAccount", c11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m(c10);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        this.f13732a.lock();
        try {
            return this.f13733b.getString(str, (String) null);
        } finally {
            this.f13732a.unlock();
        }
    }
}
