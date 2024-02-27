package s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p.c;
import p.i;
import t.o;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private HashSet f15659a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f15660b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15661c;

    /* renamed from: d  reason: collision with root package name */
    public final e f15662d;

    /* renamed from: e  reason: collision with root package name */
    public final b f15663e;

    /* renamed from: f  reason: collision with root package name */
    public d f15664f;

    /* renamed from: g  reason: collision with root package name */
    public int f15665g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f15666h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    i f15667i;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15668a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                s.d$b[] r0 = s.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15668a = r0
                s.d$b r1 = s.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15668a     // Catch:{ NoSuchFieldError -> 0x001d }
                s.d$b r1 = s.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15668a     // Catch:{ NoSuchFieldError -> 0x0028 }
                s.d$b r1 = s.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15668a     // Catch:{ NoSuchFieldError -> 0x0033 }
                s.d$b r1 = s.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15668a     // Catch:{ NoSuchFieldError -> 0x003e }
                s.d$b r1 = s.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15668a     // Catch:{ NoSuchFieldError -> 0x0049 }
                s.d$b r1 = s.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f15668a     // Catch:{ NoSuchFieldError -> 0x0054 }
                s.d$b r1 = s.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f15668a     // Catch:{ NoSuchFieldError -> 0x0060 }
                s.d$b r1 = s.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f15668a     // Catch:{ NoSuchFieldError -> 0x006c }
                s.d$b r1 = s.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s.d.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f15662d = eVar;
        this.f15663e = bVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            q();
            return true;
        } else if (!z10 && !p(dVar)) {
            return false;
        } else {
            this.f15664f = dVar;
            if (dVar.f15659a == null) {
                dVar.f15659a = new HashSet();
            }
            HashSet hashSet = this.f15664f.f15659a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f15665g = i10;
            this.f15666h = i11;
            return true;
        }
    }

    public void c(int i10, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f15659a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                t.i.a(((d) it.next()).f15662d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet d() {
        return this.f15659a;
    }

    public int e() {
        if (!this.f15661c) {
            return 0;
        }
        return this.f15660b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = r3.f15664f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f() {
        /*
            r3 = this;
            s.e r0 = r3.f15662d
            int r0 = r0.V()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.f15666h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x0021
            s.d r0 = r3.f15664f
            if (r0 == 0) goto L_0x0021
            s.e r0 = r0.f15662d
            int r0 = r0.V()
            if (r0 != r1) goto L_0x0021
            int r0 = r3.f15666h
            return r0
        L_0x0021:
            int r0 = r3.f15665g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.f():int");
    }

    public final d g() {
        switch (a.f15668a[this.f15663e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f15662d.Q;
            case 3:
                return this.f15662d.O;
            case 4:
                return this.f15662d.R;
            case 5:
                return this.f15662d.P;
            default:
                throw new AssertionError(this.f15663e.name());
        }
    }

    public e h() {
        return this.f15662d;
    }

    public i i() {
        return this.f15667i;
    }

    public d j() {
        return this.f15664f;
    }

    public b k() {
        return this.f15663e;
    }

    public boolean l() {
        HashSet hashSet = this.f15659a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f15659a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f15661c;
    }

    public boolean o() {
        return this.f15664f != null;
    }

    public boolean p(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return false;
        }
        b k10 = dVar.k();
        b bVar = this.f15663e;
        if (k10 == bVar) {
            return bVar != b.BASELINE || (dVar.h().Z() && h().Z());
        }
        switch (a.f15668a[bVar.ordinal()]) {
            case 1:
                return (k10 == b.BASELINE || k10 == b.CENTER_X || k10 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z11 = k10 == b.LEFT || k10 == b.RIGHT;
                if (!(dVar.h() instanceof h)) {
                    return z11;
                }
                if (z11 || k10 == b.CENTER_X) {
                    z10 = true;
                }
                return z10;
            case 4:
            case 5:
                boolean z12 = k10 == b.TOP || k10 == b.BOTTOM;
                if (!(dVar.h() instanceof h)) {
                    return z12;
                }
                if (z12 || k10 == b.CENTER_Y) {
                    z10 = true;
                }
                return z10;
            case 6:
                return (k10 == b.LEFT || k10 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f15663e.name());
        }
    }

    public void q() {
        HashSet hashSet;
        d dVar = this.f15664f;
        if (!(dVar == null || (hashSet = dVar.f15659a) == null)) {
            hashSet.remove(this);
            if (this.f15664f.f15659a.size() == 0) {
                this.f15664f.f15659a = null;
            }
        }
        this.f15659a = null;
        this.f15664f = null;
        this.f15665g = 0;
        this.f15666h = Integer.MIN_VALUE;
        this.f15661c = false;
        this.f15660b = 0;
    }

    public void r() {
        this.f15661c = false;
        this.f15660b = 0;
    }

    public void s(c cVar) {
        i iVar = this.f15667i;
        if (iVar == null) {
            this.f15667i = new i(i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.e();
        }
    }

    public void t(int i10) {
        this.f15660b = i10;
        this.f15661c = true;
    }

    public String toString() {
        return this.f15662d.t() + ":" + this.f15663e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f15666h = i10;
        }
    }
}
