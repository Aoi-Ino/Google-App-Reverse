package y7;

import b2.c;
import b2.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class h extends b {

    /* renamed from: q  reason: collision with root package name */
    private static Logger f18599q = Logger.getLogger(h.class.getName());

    /* renamed from: d  reason: collision with root package name */
    int f18600d;

    /* renamed from: e  reason: collision with root package name */
    int f18601e;

    /* renamed from: f  reason: collision with root package name */
    int f18602f;

    /* renamed from: g  reason: collision with root package name */
    int f18603g;

    /* renamed from: h  reason: collision with root package name */
    int f18604h;

    /* renamed from: i  reason: collision with root package name */
    int f18605i = 0;

    /* renamed from: j  reason: collision with root package name */
    String f18606j;

    /* renamed from: k  reason: collision with root package name */
    int f18607k;

    /* renamed from: l  reason: collision with root package name */
    int f18608l;

    /* renamed from: m  reason: collision with root package name */
    int f18609m;

    /* renamed from: n  reason: collision with root package name */
    e f18610n;

    /* renamed from: o  reason: collision with root package name */
    n f18611o;

    /* renamed from: p  reason: collision with root package name */
    List f18612p = new ArrayList();

    public void e(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        this.f18600d = c.h(byteBuffer);
        int l10 = c.l(byteBuffer);
        int i12 = l10 >>> 7;
        this.f18601e = i12;
        this.f18602f = (l10 >>> 6) & 1;
        this.f18603g = (l10 >>> 5) & 1;
        this.f18604h = l10 & 31;
        if (i12 == 1) {
            this.f18608l = c.h(byteBuffer);
        }
        if (this.f18602f == 1) {
            int l11 = c.l(byteBuffer);
            this.f18605i = l11;
            this.f18606j = c.g(byteBuffer, l11);
        }
        if (this.f18603g == 1) {
            this.f18609m = c.h(byteBuffer);
        }
        int i13 = 0;
        int b10 = b() + 4 + (this.f18601e == 1 ? 2 : 0) + (this.f18602f == 1 ? this.f18605i + 1 : 0);
        if (this.f18603g == 1) {
            i13 = 2;
        }
        int i14 = b10 + i13;
        int position = byteBuffer.position();
        if (a() > i14 + 2) {
            b a10 = l.a(-1, byteBuffer);
            long position2 = (long) (byteBuffer.position() - position);
            Logger logger = f18599q;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a10);
            sb2.append(" - ESDescriptor1 read: ");
            sb2.append(position2);
            sb2.append(", size: ");
            sb2.append(a10 != null ? Integer.valueOf(a10.a()) : null);
            logger.finer(sb2.toString());
            if (a10 != null) {
                int a11 = a10.a();
                byteBuffer.position(position + a11);
                i14 += a11;
            } else {
                i14 = (int) (((long) i14) + position2);
            }
            if (a10 instanceof e) {
                this.f18610n = (e) a10;
            }
        }
        int position3 = byteBuffer.position();
        if (a() > i14 + 2) {
            b a12 = l.a(-1, byteBuffer);
            long position4 = (long) (byteBuffer.position() - position3);
            Logger logger2 = f18599q;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a12);
            sb3.append(" - ESDescriptor2 read: ");
            sb3.append(position4);
            sb3.append(", size: ");
            sb3.append(a12 != null ? Integer.valueOf(a12.a()) : null);
            logger2.finer(sb3.toString());
            if (a12 != null) {
                int a13 = a12.a();
                byteBuffer.position(position3 + a13);
                i11 = i14 + a13;
            } else {
                i11 = (int) (((long) i14) + position4);
            }
            if (a12 instanceof n) {
                this.f18611o = (n) a12;
            }
        } else {
            f18599q.warning("SLConfigDescriptor is missing!");
        }
        while (a() - i14 > 2) {
            int position5 = byteBuffer.position();
            b a14 = l.a(-1, byteBuffer);
            long position6 = (long) (byteBuffer.position() - position5);
            Logger logger3 = f18599q;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a14);
            sb4.append(" - ESDescriptor3 read: ");
            sb4.append(position6);
            sb4.append(", size: ");
            sb4.append(a14 != null ? Integer.valueOf(a14.a()) : null);
            logger3.finer(sb4.toString());
            if (a14 != null) {
                int a15 = a14.a();
                byteBuffer.position(position5 + a15);
                i10 = i14 + a15;
            } else {
                i10 = (int) (((long) i14) + position6);
            }
            this.f18612p.add(a14);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f18602f != hVar.f18602f || this.f18605i != hVar.f18605i || this.f18608l != hVar.f18608l || this.f18600d != hVar.f18600d || this.f18609m != hVar.f18609m || this.f18603g != hVar.f18603g || this.f18607k != hVar.f18607k || this.f18601e != hVar.f18601e || this.f18604h != hVar.f18604h) {
            return false;
        }
        String str = this.f18606j;
        if (str == null ? hVar.f18606j != null : !str.equals(hVar.f18606j)) {
            return false;
        }
        e eVar = this.f18610n;
        if (eVar == null ? hVar.f18610n != null : !eVar.equals(hVar.f18610n)) {
            return false;
        }
        List list = this.f18612p;
        if (list == null ? hVar.f18612p != null : !list.equals(hVar.f18612p)) {
            return false;
        }
        n nVar = this.f18611o;
        n nVar2 = hVar.f18611o;
        return nVar == null ? nVar2 == null : nVar.equals(nVar2);
    }

    public ByteBuffer f() {
        ByteBuffer allocate = ByteBuffer.allocate(g());
        d.i(allocate, 3);
        d.i(allocate, g() - 2);
        d.e(allocate, this.f18600d);
        d.i(allocate, (this.f18601e << 7) | (this.f18602f << 6) | (this.f18603g << 5) | (this.f18604h & 31));
        if (this.f18601e > 0) {
            d.e(allocate, this.f18608l);
        }
        if (this.f18602f > 0) {
            d.i(allocate, this.f18605i);
            d.j(allocate, this.f18606j);
        }
        if (this.f18603g > 0) {
            d.e(allocate, this.f18609m);
        }
        ByteBuffer f10 = this.f18610n.f();
        ByteBuffer f11 = this.f18611o.f();
        allocate.put(f10.array());
        allocate.put(f11.array());
        return allocate;
    }

    public int g() {
        int i10 = this.f18601e > 0 ? 7 : 5;
        if (this.f18602f > 0) {
            i10 += this.f18605i + 1;
        }
        if (this.f18603g > 0) {
            i10 += 2;
        }
        return i10 + this.f18610n.g() + this.f18611o.g();
    }

    public void h(e eVar) {
        this.f18610n = eVar;
    }

    public int hashCode() {
        int i10 = ((((((((((this.f18600d * 31) + this.f18601e) * 31) + this.f18602f) * 31) + this.f18603g) * 31) + this.f18604h) * 31) + this.f18605i) * 31;
        String str = this.f18606j;
        int i11 = 0;
        int hashCode = (((((((i10 + (str != null ? str.hashCode() : 0)) * 31) + this.f18607k) * 31) + this.f18608l) * 31) + this.f18609m) * 31;
        e eVar = this.f18610n;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        n nVar = this.f18611o;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        List list = this.f18612p;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode3 + i11;
    }

    public void i(int i10) {
        this.f18600d = i10;
    }

    public void j(n nVar) {
        this.f18611o = nVar;
    }

    public String toString() {
        return "ESDescriptor" + "{esId=" + this.f18600d + ", streamDependenceFlag=" + this.f18601e + ", URLFlag=" + this.f18602f + ", oCRstreamFlag=" + this.f18603g + ", streamPriority=" + this.f18604h + ", URLLength=" + this.f18605i + ", URLString='" + this.f18606j + '\'' + ", remoteODFlag=" + this.f18607k + ", dependsOnEsId=" + this.f18608l + ", oCREsId=" + this.f18609m + ", decoderConfigDescriptor=" + this.f18610n + ", slConfigDescriptor=" + this.f18611o + '}';
    }
}
