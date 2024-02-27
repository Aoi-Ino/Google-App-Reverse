package g6;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

public final class s implements e6.a {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal f11703a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f11704b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Key f11705c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11706d;

    class a extends ThreadLocal {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac mac = (Mac) m.f11691g.a(s.this.f11704b);
                mac.init(s.this.f11705c);
                return mac;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public s(String str, Key key) {
        int i10;
        a aVar = new a();
        this.f11703a = aVar;
        this.f11704b = str;
        this.f11705c = key;
        if (key.getEncoded().length >= 16) {
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = 20;
                    break;
                case 1:
                    i10 = 32;
                    break;
                case 2:
                    i10 = 48;
                    break;
                case 3:
                    i10 = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
            }
            this.f11706d = i10;
            aVar.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    public byte[] a(byte[] bArr, int i10) {
        if (i10 <= this.f11706d) {
            ((Mac) this.f11703a.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.f11703a.get()).doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
