package x1;

import cm.g;
import cm.l;
import java.util.List;
import v1.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private e f18171a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f18172b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f18173c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18174d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18175e;

    /* renamed from: f  reason: collision with root package name */
    private Double f18176f;

    /* renamed from: g  reason: collision with root package name */
    private Double f18177g;

    /* renamed from: h  reason: collision with root package name */
    private List f18178h;

    public b(e eVar, boolean z10, Integer num, boolean z11, boolean z12, Double d10, Double d11, List list) {
        l.f(eVar, "quality");
        l.f(list, "videoNames");
        this.f18171a = eVar;
        this.f18172b = z10;
        this.f18173c = num;
        this.f18174d = z11;
        this.f18175e = z12;
        this.f18176f = d10;
        this.f18177g = d11;
        this.f18178h = list;
    }

    public final boolean a() {
        return this.f18174d;
    }

    public final boolean b() {
        return this.f18175e;
    }

    public final e c() {
        return this.f18171a;
    }

    public final Integer d() {
        return this.f18173c;
    }

    public final Double e() {
        return this.f18176f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18171a == bVar.f18171a && this.f18172b == bVar.f18172b && l.a(this.f18173c, bVar.f18173c) && this.f18174d == bVar.f18174d && this.f18175e == bVar.f18175e && l.a(this.f18176f, bVar.f18176f) && l.a(this.f18177g, bVar.f18177g) && l.a(this.f18178h, bVar.f18178h);
    }

    public final List f() {
        return this.f18178h;
    }

    public final Double g() {
        return this.f18177g;
    }

    public final boolean h() {
        return this.f18172b;
    }

    public int hashCode() {
        int hashCode = this.f18171a.hashCode() * 31;
        boolean z10 = this.f18172b;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
        Integer num = this.f18173c;
        int i11 = 0;
        int hashCode2 = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z12 = this.f18174d;
        if (z12) {
            z12 = true;
        }
        int i12 = (hashCode2 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f18175e;
        if (!z13) {
            z11 = z13;
        }
        int i13 = (i12 + (z11 ? 1 : 0)) * 31;
        Double d10 = this.f18176f;
        int hashCode3 = (i13 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f18177g;
        if (d11 != null) {
            i11 = d11.hashCode();
        }
        return ((hashCode3 + i11) * 31) + this.f18178h.hashCode();
    }

    public String toString() {
        return "Configuration(quality=" + this.f18171a + ", isMinBitrateCheckEnabled=" + this.f18172b + ", videoBitrateInMbps=" + this.f18173c + ", disableAudio=" + this.f18174d + ", keepOriginalResolution=" + this.f18175e + ", videoHeight=" + this.f18176f + ", videoWidth=" + this.f18177g + ", videoNames=" + this.f18178h + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, boolean z10, Integer num, boolean z11, boolean z12, Double d10, Double d11, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? e.MEDIUM : eVar, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? null : d10, (i10 & 64) != 0 ? null : d11, list);
    }
}
