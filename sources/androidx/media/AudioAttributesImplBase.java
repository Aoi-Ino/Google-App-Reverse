package androidx.media;

import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    int f3406a = 0;

    /* renamed from: b  reason: collision with root package name */
    int f3407b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f3408c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f3409d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        return this.f3407b;
    }

    public int b() {
        int i10 = this.f3408c;
        int c10 = c();
        if (c10 == 6) {
            i10 |= 4;
        } else if (c10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f3409d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f3408c, this.f3406a);
    }

    public int d() {
        return this.f3406a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f3407b == audioAttributesImplBase.a() && this.f3408c == audioAttributesImplBase.b() && this.f3406a == audioAttributesImplBase.d() && this.f3409d == audioAttributesImplBase.f3409d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3407b), Integer.valueOf(this.f3408c), Integer.valueOf(this.f3406a), Integer.valueOf(this.f3409d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f3409d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f3409d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f3406a));
        sb2.append(" content=");
        sb2.append(this.f3407b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f3408c).toUpperCase());
        return sb2.toString();
    }
}
