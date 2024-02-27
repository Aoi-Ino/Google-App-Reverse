package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final n f2478d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f2479e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f2480f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    static final a f2481g;

    /* renamed from: h  reason: collision with root package name */
    static final a f2482h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2483a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2484b;

    /* renamed from: c  reason: collision with root package name */
    private final n f2485c;

    /* renamed from: androidx.core.text.a$a  reason: collision with other inner class name */
    public static final class C0035a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2486a;

        /* renamed from: b  reason: collision with root package name */
        private int f2487b;

        /* renamed from: c  reason: collision with root package name */
        private n f2488c;

        public C0035a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f2482h : a.f2481g;
        }

        private void c(boolean z10) {
            this.f2486a = z10;
            this.f2488c = a.f2478d;
            this.f2487b = 2;
        }

        public a a() {
            return (this.f2487b == 2 && this.f2488c == a.f2478d) ? b(this.f2486a) : new a(this.f2486a, this.f2487b, this.f2488c);
        }
    }

    private static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f2489f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f2490a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f2491b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2492c;

        /* renamed from: d  reason: collision with root package name */
        private int f2493d;

        /* renamed from: e  reason: collision with root package name */
        private char f2494e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f2489f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f2490a = charSequence;
            this.f2491b = z10;
            this.f2492c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f2489f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char charAt;
            int i10 = this.f2493d;
            do {
                int i11 = this.f2493d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2490a;
                int i12 = i11 - 1;
                this.f2493d = i12;
                charAt = charSequence.charAt(i12);
                this.f2494e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f2493d = i10;
            this.f2494e = ';';
            return 13;
        }

        private byte g() {
            char charAt;
            do {
                int i10 = this.f2493d;
                if (i10 >= this.f2492c) {
                    return 12;
                }
                CharSequence charSequence = this.f2490a;
                this.f2493d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f2494e = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte h() {
            char charAt;
            int i10 = this.f2493d;
            while (true) {
                int i11 = this.f2493d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2490a;
                int i12 = i11 - 1;
                this.f2493d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f2494e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f2493d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f2490a;
                        int i14 = i13 - 1;
                        this.f2493d = i14;
                        charAt = charSequence2.charAt(i14);
                        this.f2494e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f2493d = i10;
            this.f2494e = '>';
            return 13;
        }

        private byte i() {
            char charAt;
            int i10 = this.f2493d;
            while (true) {
                int i11 = this.f2493d;
                if (i11 < this.f2492c) {
                    CharSequence charSequence = this.f2490a;
                    this.f2493d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f2494e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f2493d;
                            if (i12 >= this.f2492c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f2490a;
                            this.f2493d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f2494e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f2493d = i10;
                    this.f2494e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            char charAt = this.f2490a.charAt(this.f2493d - 1);
            this.f2494e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2490a, this.f2493d);
                this.f2493d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2493d--;
            byte c10 = c(this.f2494e);
            if (!this.f2491b) {
                return c10;
            }
            char c11 = this.f2494e;
            if (c11 == '>') {
                return h();
            }
            return c11 == ';' ? f() : c10;
        }

        /* access modifiers changed from: package-private */
        public byte b() {
            char charAt = this.f2490a.charAt(this.f2493d);
            this.f2494e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f2490a, this.f2493d);
                this.f2493d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2493d++;
            byte c10 = c(this.f2494e);
            if (!this.f2491b) {
                return c10;
            }
            char c11 = this.f2494e;
            if (c11 == '<') {
                return i();
            }
            return c11 == '&' ? g() : c10;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            this.f2493d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f2493d < this.f2492c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f2493d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public int e() {
            this.f2493d = this.f2492c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f2493d > 0) {
                    byte a10 = a();
                    if (a10 != 0) {
                        if (a10 == 1 || a10 == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                            }
                        } else if (a10 != 9) {
                            switch (a10) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            i10--;
                        } else {
                            continue;
                        }
                    } else if (i10 == 0) {
                        return -1;
                    } else {
                        if (i11 == 0) {
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        n nVar = o.f2506c;
        f2478d = nVar;
        f2481g = new a(false, 2, nVar);
        f2482h = new a(true, 2, nVar);
    }

    a(boolean z10, int i10, n nVar) {
        this.f2483a = z10;
        this.f2484b = i10;
        this.f2485c = nVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0035a().a();
    }

    static boolean e(Locale locale) {
        return p.a(locale) == 1;
    }

    private String f(CharSequence charSequence, n nVar) {
        boolean a10 = nVar.a(charSequence, 0, charSequence.length());
        if (!this.f2483a && (a10 || b(charSequence) == 1)) {
            return f2479e;
        }
        if (this.f2483a) {
            return (!a10 || b(charSequence) == -1) ? f2480f : "";
        }
        return "";
    }

    private String g(CharSequence charSequence, n nVar) {
        boolean a10 = nVar.a(charSequence, 0, charSequence.length());
        if (!this.f2483a && (a10 || a(charSequence) == 1)) {
            return f2479e;
        }
        if (this.f2483a) {
            return (!a10 || a(charSequence) == -1) ? f2480f : "";
        }
        return "";
    }

    public boolean d() {
        return (this.f2484b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f2485c, true);
    }

    public CharSequence i(CharSequence charSequence, n nVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean a10 = nVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append(g(charSequence, a10 ? o.f2505b : o.f2504a));
        }
        if (a10 != this.f2483a) {
            spannableStringBuilder.append(a10 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append(f(charSequence, a10 ? o.f2505b : o.f2504a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f2485c, true);
    }

    public String k(String str, n nVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, nVar, z10).toString();
    }
}
