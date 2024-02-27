package m;

import java.util.Arrays;

class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f13558a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f13559b;

    c(int i10, CharSequence charSequence) {
        this.f13558a = i10;
        this.f13559b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean d(CharSequence charSequence) {
        String a10 = a(this.f13559b);
        String a11 = a(charSequence);
        return (a10 == null && a11 == null) || (a10 != null && a10.equals(a11));
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f13558a;
    }

    /* access modifiers changed from: package-private */
    public CharSequence c() {
        return this.f13559b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13558a == cVar.f13558a && d(cVar.f13559b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13558a), a(this.f13559b)});
    }
}
