package c2;

import b2.d;
import b2.e;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mn.a;
import pn.b;
import w7.c;

public class i extends c {
    private static final /* synthetic */ a.C0323a A = null;
    private static final /* synthetic */ a.C0323a B = null;
    private static final /* synthetic */ a.C0323a C = null;
    private static final /* synthetic */ a.C0323a D = null;
    private static final /* synthetic */ a.C0323a E = null;

    /* renamed from: y  reason: collision with root package name */
    public static final Map f4656y;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4657z = null;

    /* renamed from: r  reason: collision with root package name */
    private String f4658r;

    /* renamed from: s  reason: collision with root package name */
    private String f4659s = null;

    /* renamed from: t  reason: collision with root package name */
    private long f4660t;

    /* renamed from: u  reason: collision with root package name */
    private long f4661u;

    /* renamed from: v  reason: collision with root package name */
    private long f4662v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f4663w = true;

    /* renamed from: x  reason: collision with root package name */
    private long f4664x;

    static {
        n();
        HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        f4656y = Collections.unmodifiableMap(hashMap);
    }

    public i() {
        super("hdlr");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("HandlerBox.java", i.class);
        f4657z = bVar.f("method-execution", bVar.e("1", "getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 78);
        A = bVar.f("method-execution", bVar.e("1", "setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "", "void"), 87);
        B = bVar.f("method-execution", bVar.e("1", "setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "", "void"), 91);
        C = bVar.f("method-execution", bVar.e("1", "getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 95);
        D = bVar.f("method-execution", bVar.e("1", "getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 99);
        E = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f4664x = b2.c.j(byteBuffer);
        this.f4658r = b2.c.b(byteBuffer);
        this.f4660t = b2.c.j(byteBuffer);
        this.f4661u = b2.c.j(byteBuffer);
        this.f4662v = b2.c.j(byteBuffer);
        if (byteBuffer.remaining() > 0) {
            String g10 = b2.c.g(byteBuffer, byteBuffer.remaining());
            this.f4659s = g10;
            if (g10.endsWith("\u0000")) {
                String str = this.f4659s;
                this.f4659s = str.substring(0, str.length() - 1);
                this.f4663w = true;
                return;
            }
        }
        this.f4663w = false;
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        d.g(byteBuffer, this.f4664x);
        byteBuffer.put(b2.b.y(this.f4658r));
        d.g(byteBuffer, this.f4660t);
        d.g(byteBuffer, this.f4661u);
        d.g(byteBuffer, this.f4662v);
        String str = this.f4659s;
        if (str != null) {
            byteBuffer.put(e.b(str));
        }
        if (this.f4663w) {
            byteBuffer.put((byte) 0);
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) (this.f4663w ? e.c(this.f4659s) + 25 : e.c(this.f4659s) + 24);
    }

    public String toString() {
        w7.e.b().c(b.c(E, this, this));
        return "HandlerBox[handlerType=" + u() + ";name=" + v() + "]";
    }

    public String u() {
        w7.e.b().c(b.c(f4657z, this, this));
        return this.f4658r;
    }

    public String v() {
        w7.e.b().c(b.c(C, this, this));
        return this.f4659s;
    }

    public void w(String str) {
        w7.e.b().c(b.d(B, this, this, str));
        this.f4658r = str;
    }

    public void x(String str) {
        w7.e.b().c(b.d(A, this, this, str));
        this.f4659s = str;
    }
}
