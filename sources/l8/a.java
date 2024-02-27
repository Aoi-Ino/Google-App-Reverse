package l8;

import f.j;
import java.nio.ByteBuffer;
import java.util.List;
import mn.a;
import pn.b;
import w7.e;

public final class a extends w7.a {
    private static final /* synthetic */ a.C0323a A = null;
    private static final /* synthetic */ a.C0323a B = null;
    private static final /* synthetic */ a.C0323a C = null;
    private static final /* synthetic */ a.C0323a D = null;
    private static final /* synthetic */ a.C0323a E = null;
    private static final /* synthetic */ a.C0323a F = null;
    private static final /* synthetic */ a.C0323a G = null;
    private static final /* synthetic */ a.C0323a H = null;
    private static final /* synthetic */ a.C0323a I = null;
    private static final /* synthetic */ a.C0323a J = null;
    private static final /* synthetic */ a.C0323a K = null;
    private static final /* synthetic */ a.C0323a L = null;
    private static final /* synthetic */ a.C0323a M = null;
    private static final /* synthetic */ a.C0323a N = null;
    private static final /* synthetic */ a.C0323a O = null;
    private static final /* synthetic */ a.C0323a P = null;
    private static final /* synthetic */ a.C0323a Q = null;
    private static final /* synthetic */ a.C0323a R = null;

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13416o = null;

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13417p = null;

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13418q = null;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13419r = null;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13420s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13421t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13422u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13423v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13424w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13425x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13426y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f13427z = null;

    /* renamed from: n  reason: collision with root package name */
    public b f13428n = new b();

    static {
        n();
    }

    public a() {
        super("avcC");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("AvcConfigurationBox.java", a.class);
        f13416o = bVar.f("method-execution", bVar.e("1", "getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        f13417p = bVar.f("method-execution", bVar.e("1", "getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 48);
        f13426y = bVar.f("method-execution", bVar.e("1", "setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 84);
        f13427z = bVar.f("method-execution", bVar.e("1", "setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 88);
        A = bVar.f("method-execution", bVar.e("1", "setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 92);
        B = bVar.f("method-execution", bVar.e("1", "setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        C = bVar.f("method-execution", bVar.e("1", "getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        D = bVar.f("method-execution", bVar.e("1", "setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        E = bVar.f("method-execution", bVar.e("1", "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        F = bVar.f("method-execution", bVar.e("1", "setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 112);
        G = bVar.f("method-execution", bVar.e("1", "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 116);
        H = bVar.f("method-execution", bVar.e("1", "setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        f13418q = bVar.f("method-execution", bVar.e("1", "getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        I = bVar.f("method-execution", bVar.e("1", "getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), j.K0);
        J = bVar.f("method-execution", bVar.e("1", "setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        K = bVar.f("method-execution", bVar.e("1", "hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "boolean"), 132);
        L = bVar.f("method-execution", bVar.e("1", "setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 136);
        M = bVar.f("method-execution", bVar.e("1", "getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "long"), 147);
        N = bVar.f("method-execution", bVar.e("1", "getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        O = bVar.f("method-execution", bVar.e("1", "getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 158);
        P = bVar.f("method-execution", bVar.e("1", "getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 162);
        Q = bVar.f("method-execution", bVar.e("1", "getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 167);
        R = bVar.f("method-execution", bVar.e("1", "toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), 172);
        f13419r = bVar.f("method-execution", bVar.e("1", "getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 56);
        f13420s = bVar.f("method-execution", bVar.e("1", "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        f13421t = bVar.f("method-execution", bVar.e("1", "getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 64);
        f13422u = bVar.f("method-execution", bVar.e("1", "getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 68);
        f13423v = bVar.f("method-execution", bVar.e("1", "setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 72);
        f13424w = bVar.f("method-execution", bVar.e("1", "setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 76);
        f13425x = bVar.f("method-execution", bVar.e("1", "setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 80);
    }

    public void a(ByteBuffer byteBuffer) {
        this.f13428n = new b(byteBuffer);
    }

    public void b(ByteBuffer byteBuffer) {
        e.b().c(b.d(N, this, this, byteBuffer));
        this.f13428n.a(byteBuffer);
    }

    public long c() {
        e.b().c(b.c(M, this, this));
        return this.f13428n.b();
    }

    public void o(int i10) {
        e.b().c(b.d(f13426y, this, this, on.a.d(i10)));
        this.f13428n.f13432d = i10;
    }

    public void p(int i10) {
        e.b().c(b.d(f13424w, this, this, on.a.d(i10)));
        this.f13428n.f13430b = i10;
    }

    public void q(int i10) {
        e.b().c(b.d(H, this, this, on.a.d(i10)));
        this.f13428n.f13439k = i10;
    }

    public void r(int i10) {
        e.b().c(b.d(F, this, this, on.a.d(i10)));
        this.f13428n.f13438j = i10;
    }

    public void s(int i10) {
        e.b().c(b.d(D, this, this, on.a.d(i10)));
        this.f13428n.f13437i = i10;
    }

    public void t(int i10) {
        e.b().c(b.d(f13423v, this, this, on.a.d(i10)));
        this.f13428n.f13429a = i10;
    }

    public String toString() {
        e.b().c(b.c(R, this, this));
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.f13428n + '}';
    }

    public void u(int i10) {
        e.b().c(b.d(f13427z, this, this, on.a.d(i10)));
        this.f13428n.f13433e = i10;
    }

    public void v(List list) {
        e.b().c(b.d(B, this, this, list));
        this.f13428n.f13435g = list;
    }

    public void w(int i10) {
        e.b().c(b.d(f13425x, this, this, on.a.d(i10)));
        this.f13428n.f13431c = i10;
    }

    public void x(List list) {
        e.b().c(b.d(A, this, this, list));
        this.f13428n.f13434f = list;
    }
}
