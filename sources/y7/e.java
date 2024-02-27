package y7;

import b2.a;
import b2.c;
import b2.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class e extends b {

    /* renamed from: m  reason: collision with root package name */
    private static Logger f18589m = Logger.getLogger(e.class.getName());

    /* renamed from: d  reason: collision with root package name */
    int f18590d;

    /* renamed from: e  reason: collision with root package name */
    int f18591e;

    /* renamed from: f  reason: collision with root package name */
    int f18592f;

    /* renamed from: g  reason: collision with root package name */
    int f18593g;

    /* renamed from: h  reason: collision with root package name */
    long f18594h;

    /* renamed from: i  reason: collision with root package name */
    long f18595i;

    /* renamed from: j  reason: collision with root package name */
    a f18596j;

    /* renamed from: k  reason: collision with root package name */
    List f18597k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    byte[] f18598l;

    public void e(ByteBuffer byteBuffer) {
        int a10;
        this.f18590d = c.l(byteBuffer);
        int l10 = c.l(byteBuffer);
        this.f18591e = l10 >>> 2;
        this.f18592f = (l10 >> 1) & 1;
        this.f18593g = c.i(byteBuffer);
        this.f18594h = c.j(byteBuffer);
        this.f18595i = c.j(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            b a11 = l.a(this.f18590d, byteBuffer);
            int position2 = byteBuffer.position() - position;
            Logger logger = f18589m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a11);
            sb2.append(" - DecoderConfigDescr1 read: ");
            sb2.append(position2);
            sb2.append(", size: ");
            sb2.append(a11 != null ? Integer.valueOf(a11.a()) : null);
            logger.finer(sb2.toString());
            if (a11 != null && position2 < (a10 = a11.a())) {
                byte[] bArr = new byte[(a10 - position2)];
                this.f18598l = bArr;
                byteBuffer.get(bArr);
            }
            if (a11 instanceof a) {
                this.f18596j = (a) a11;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = (long) byteBuffer.position();
            b a12 = l.a(this.f18590d, byteBuffer);
            long position4 = ((long) byteBuffer.position()) - position3;
            Logger logger2 = f18589m;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a12);
            sb3.append(" - DecoderConfigDescr2 read: ");
            sb3.append(position4);
            sb3.append(", size: ");
            sb3.append(a12 != null ? Integer.valueOf(a12.a()) : null);
            logger2.finer(sb3.toString());
        }
    }

    public ByteBuffer f() {
        ByteBuffer allocate = ByteBuffer.allocate(g());
        d.i(allocate, 4);
        d.i(allocate, g() - 2);
        d.i(allocate, this.f18590d);
        d.i(allocate, (this.f18591e << 2) | (this.f18592f << 1) | 1);
        d.f(allocate, this.f18593g);
        d.g(allocate, this.f18594h);
        d.g(allocate, this.f18595i);
        a aVar = this.f18596j;
        if (aVar != null) {
            allocate.put(aVar.n().array());
        }
        return allocate;
    }

    public int g() {
        a aVar = this.f18596j;
        return (aVar == null ? 0 : aVar.o()) + 15;
    }

    public void h(a aVar) {
        this.f18596j = aVar;
    }

    public void i(long j10) {
        this.f18595i = j10;
    }

    public void j(int i10) {
        this.f18593g = i10;
    }

    public void k(long j10) {
        this.f18594h = j10;
    }

    public void l(int i10) {
        this.f18590d = i10;
    }

    public void m(int i10) {
        this.f18591e = i10;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DecoderConfigDescriptor");
        sb2.append("{objectTypeIndication=");
        sb2.append(this.f18590d);
        sb2.append(", streamType=");
        sb2.append(this.f18591e);
        sb2.append(", upStream=");
        sb2.append(this.f18592f);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.f18593g);
        sb2.append(", maxBitRate=");
        sb2.append(this.f18594h);
        sb2.append(", avgBitRate=");
        sb2.append(this.f18595i);
        sb2.append(", decoderSpecificInfo=");
        sb2.append((Object) null);
        sb2.append(", audioSpecificInfo=");
        sb2.append(this.f18596j);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f18598l;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(a.a(bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        List list = this.f18597k;
        if (list == null) {
            str = "null";
        } else {
            str = Arrays.asList(new List[]{list}).toString();
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
