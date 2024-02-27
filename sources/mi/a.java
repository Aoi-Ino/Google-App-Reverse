package mi;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.Language.Modle.GetLanguageStrings;
import com.nic.mparivahan.Language.Modle.LanguageModle;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import km.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final ji.a f25092d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f25093e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f25094f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f25095g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f25096h = new a0();

    /* renamed from: mi.a$a  reason: collision with other inner class name */
    public static final class C0322a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f25097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f25098b;

        C0322a(String str, a aVar) {
            this.f25097a = str;
            this.f25098b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f25098b.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f25098b.g().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            int i10 = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = this.f25097a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f25097a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            int length = valueOf.length() / 1000;
            if (length >= 0) {
                while (true) {
                    int i11 = i10 * 1000;
                    int i12 = i10 + 1;
                    int i13 = i12 * 1000;
                    if (i13 > valueOf.length()) {
                        i13 = valueOf.length();
                    }
                    String substring = valueOf.substring(i11, i13);
                    l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.v("lang_val", substring);
                    if (i10 == length) {
                        break;
                    }
                    i10 = i12;
                }
            }
            Object j10 = new i7.d().j(valueOf, LanguageModle.class);
            l.e(j10, "fromJson(...)");
            this.f25098b.h().k((LanguageModle) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f25099a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f25100b;

        b(String str, a aVar) {
            this.f25099a = str;
            this.f25100b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f25100b.g().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f25100b.k().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = this.f25099a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f25099a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), GetLanguageStrings.class);
            l.e(j10, "fromJson(...)");
            this.f25100b.l().k((GetLanguageStrings) j10);
        }
    }

    public a(ji.a aVar) {
        l.f(aVar, "repository");
        this.f25092d = aVar;
    }

    public final a0 g() {
        return this.f25094f;
    }

    public final a0 h() {
        return this.f25093e;
    }

    public final void i() {
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = mb.c.f13994a.b().toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f25092d.a(f10, valueOf).enqueue(new C0322a(valueOf, this));
    }

    public final void j(String str) {
        l.f(str, "langCode");
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = mb.c.f13994a.c(str).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f25092d.b(f10, valueOf).enqueue(new b(valueOf, this));
    }

    public final a0 k() {
        return this.f25096h;
    }

    public final a0 l() {
        return this.f25095g;
    }
}
