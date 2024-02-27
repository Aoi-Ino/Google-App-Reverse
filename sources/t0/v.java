package t0;

import cm.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16454a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16455b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16456c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f16457d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f16458e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16459f;

    /* renamed from: g  reason: collision with root package name */
    private final int f16460g;

    /* renamed from: h  reason: collision with root package name */
    private final int f16461h;

    /* renamed from: i  reason: collision with root package name */
    private final int f16462i;

    /* renamed from: j  reason: collision with root package name */
    private String f16463j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f16464a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f16465b;

        /* renamed from: c  reason: collision with root package name */
        private int f16466c = -1;

        /* renamed from: d  reason: collision with root package name */
        private String f16467d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f16468e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f16469f;

        /* renamed from: g  reason: collision with root package name */
        private int f16470g = -1;

        /* renamed from: h  reason: collision with root package name */
        private int f16471h = -1;

        /* renamed from: i  reason: collision with root package name */
        private int f16472i = -1;

        /* renamed from: j  reason: collision with root package name */
        private int f16473j = -1;

        public static /* synthetic */ a i(a aVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return aVar.g(i10, z10, z11);
        }

        public final v a() {
            v vVar;
            String str = this.f16467d;
            if (str != null) {
                boolean z10 = this.f16464a;
                boolean z11 = this.f16465b;
                boolean z12 = this.f16468e;
                boolean z13 = this.f16469f;
                int i10 = this.f16470g;
                int i11 = this.f16471h;
                int i12 = this.f16472i;
                int i13 = this.f16473j;
            } else {
                new v(this.f16464a, this.f16465b, this.f16466c, this.f16468e, this.f16469f, this.f16470g, this.f16471h, this.f16472i, this.f16473j);
            }
            return vVar;
        }

        public final a b(int i10) {
            this.f16470g = i10;
            return this;
        }

        public final a c(int i10) {
            this.f16471h = i10;
            return this;
        }

        public final a d(boolean z10) {
            this.f16464a = z10;
            return this;
        }

        public final a e(int i10) {
            this.f16472i = i10;
            return this;
        }

        public final a f(int i10) {
            this.f16473j = i10;
            return this;
        }

        public final a g(int i10, boolean z10, boolean z11) {
            this.f16466c = i10;
            this.f16467d = null;
            this.f16468e = z10;
            this.f16469f = z11;
            return this;
        }

        public final a h(String str, boolean z10, boolean z11) {
            this.f16467d = str;
            this.f16466c = -1;
            this.f16468e = z10;
            this.f16469f = z11;
            return this;
        }

        public final a j(boolean z10) {
            this.f16465b = z10;
            return this;
        }
    }

    public v(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.f16454a = z10;
        this.f16455b = z11;
        this.f16456c = i10;
        this.f16457d = z12;
        this.f16458e = z13;
        this.f16459f = i11;
        this.f16460g = i12;
        this.f16461h = i13;
        this.f16462i = i14;
    }

    public final int a() {
        return this.f16459f;
    }

    public final int b() {
        return this.f16460g;
    }

    public final int c() {
        return this.f16461h;
    }

    public final int d() {
        return this.f16462i;
    }

    public final int e() {
        return this.f16456c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f16454a == vVar.f16454a && this.f16455b == vVar.f16455b && this.f16456c == vVar.f16456c && l.a(this.f16463j, vVar.f16463j) && this.f16457d == vVar.f16457d && this.f16458e == vVar.f16458e && this.f16459f == vVar.f16459f && this.f16460g == vVar.f16460g && this.f16461h == vVar.f16461h && this.f16462i == vVar.f16462i;
    }

    public final String f() {
        return this.f16463j;
    }

    public final boolean g() {
        return this.f16457d;
    }

    public final boolean h() {
        return this.f16454a;
    }

    public int hashCode() {
        int i10 = (((((h() ? 1 : 0) * true) + (j() ? 1 : 0)) * 31) + this.f16456c) * 31;
        String str = this.f16463j;
        return ((((((((((((i10 + (str != null ? str.hashCode() : 0)) * 31) + (g() ? 1 : 0)) * 31) + (i() ? 1 : 0)) * 31) + this.f16459f) * 31) + this.f16460g) * 31) + this.f16461h) * 31) + this.f16462i;
    }

    public final boolean i() {
        return this.f16458e;
    }

    public final boolean j() {
        return this.f16455b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v.class.getSimpleName());
        sb2.append("(");
        if (this.f16454a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f16455b) {
            sb2.append("restoreState ");
        }
        String str = this.f16463j;
        if (!((str == null && this.f16456c == -1) || str == null)) {
            sb2.append("popUpTo(");
            String str2 = this.f16463j;
            if (str2 == null) {
                sb2.append("0x");
                str2 = Integer.toHexString(this.f16456c);
            }
            sb2.append(str2);
            if (this.f16457d) {
                sb2.append(" inclusive");
            }
            if (this.f16458e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        if (!(this.f16459f == -1 && this.f16460g == -1 && this.f16461h == -1 && this.f16462i == -1)) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(this.f16459f));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(this.f16460g));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(this.f16461h));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(this.f16462i));
            sb2.append(")");
        }
        String sb3 = sb2.toString();
        l.e(sb3, "sb.toString()");
        return sb3;
    }

    public v(boolean z10, boolean z11, String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, p.f16420n.a(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.f16463j = str;
    }
}
