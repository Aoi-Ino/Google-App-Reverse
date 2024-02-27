package c6;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.shaded.protobuf.p;
import f6.c0;
import f6.t;
import g6.o;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import y5.k;

public final class d implements k {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f4765a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4766b;

    public d(Context context, String str, String str2) {
        if (str != null) {
            this.f4766b = str;
            Context applicationContext = context.getApplicationContext();
            this.f4765a = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    private byte[] b() {
        try {
            String string = this.f4765a.getString(this.f4766b, (String) null);
            if (string != null) {
                return o.a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.f4766b}));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.f4766b}));
        }
    }

    public t a() {
        return t.Q(b(), p.b());
    }

    public c0 read() {
        return c0.V(b(), p.b());
    }
}
