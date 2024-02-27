package y7;

import b2.d;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class a extends b {
    public static Map V = new HashMap();
    public static Map W = new HashMap();
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;

    /* renamed from: d  reason: collision with root package name */
    byte[] f18534d;

    /* renamed from: e  reason: collision with root package name */
    public C0245a f18535e;

    /* renamed from: f  reason: collision with root package name */
    public int f18536f;

    /* renamed from: g  reason: collision with root package name */
    public int f18537g;

    /* renamed from: h  reason: collision with root package name */
    public int f18538h;

    /* renamed from: i  reason: collision with root package name */
    public int f18539i;

    /* renamed from: j  reason: collision with root package name */
    public int f18540j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f18541k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18542l;

    /* renamed from: m  reason: collision with root package name */
    public int f18543m;

    /* renamed from: n  reason: collision with root package name */
    public int f18544n;

    /* renamed from: o  reason: collision with root package name */
    public int f18545o;

    /* renamed from: p  reason: collision with root package name */
    public int f18546p;

    /* renamed from: q  reason: collision with root package name */
    public int f18547q;

    /* renamed from: r  reason: collision with root package name */
    public int f18548r;

    /* renamed from: s  reason: collision with root package name */
    public int f18549s;

    /* renamed from: t  reason: collision with root package name */
    public int f18550t;

    /* renamed from: u  reason: collision with root package name */
    public int f18551u;

    /* renamed from: v  reason: collision with root package name */
    public int f18552v;

    /* renamed from: w  reason: collision with root package name */
    public int f18553w;

    /* renamed from: x  reason: collision with root package name */
    public int f18554x;

    /* renamed from: y  reason: collision with root package name */
    public int f18555y;

    /* renamed from: z  reason: collision with root package name */
    public int f18556z;

    /* renamed from: y7.a$a  reason: collision with other inner class name */
    public class C0245a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f18557a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f18558b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f18559c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f18560d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f18561e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f18562f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f18563g;

        public C0245a(int i10, c cVar) {
            int i11;
            this.f18557a = cVar.b();
            this.f18558b = cVar.b();
            this.f18559c = cVar.b();
            this.f18560d = cVar.b();
            boolean b10 = cVar.b();
            this.f18561e = b10;
            if (b10) {
                this.f18562f = cVar.b();
                this.f18563g = cVar.b();
                a(i10, cVar);
            }
            while (cVar.a(4) != 0) {
                int a10 = cVar.a(4);
                if (a10 == 15) {
                    i11 = cVar.a(8);
                    a10 += i11;
                } else {
                    i11 = 0;
                }
                if (i11 == 255) {
                    a10 += cVar.a(16);
                }
                for (int i12 = 0; i12 < a10; i12++) {
                    cVar.a(8);
                }
            }
        }

        public void a(int i10, c cVar) {
            int i11;
            switch (i10) {
                case 1:
                case 2:
                    i11 = 1;
                    break;
                case 3:
                    i11 = 2;
                    break;
                case 4:
                case 5:
                case 6:
                    i11 = 3;
                    break;
                case 7:
                    i11 = 4;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                new b(cVar);
            }
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f18565a;

        /* renamed from: b  reason: collision with root package name */
        public int f18566b;

        /* renamed from: c  reason: collision with root package name */
        public int f18567c;

        /* renamed from: d  reason: collision with root package name */
        public int f18568d;

        /* renamed from: e  reason: collision with root package name */
        public int f18569e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f18570f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f18571g;

        /* renamed from: h  reason: collision with root package name */
        public int f18572h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f18573i;

        /* renamed from: j  reason: collision with root package name */
        public int f18574j;

        /* renamed from: k  reason: collision with root package name */
        public int f18575k;

        /* renamed from: l  reason: collision with root package name */
        public int f18576l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f18577m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f18578n;

        public b(c cVar) {
            this.f18565a = cVar.b();
            this.f18566b = cVar.a(4);
            this.f18567c = cVar.a(4);
            this.f18568d = cVar.a(3);
            this.f18569e = cVar.a(2);
            this.f18570f = cVar.b();
            this.f18571g = cVar.b();
            if (this.f18570f) {
                this.f18572h = cVar.a(2);
                this.f18573i = cVar.b();
                this.f18574j = cVar.a(2);
            }
            if (this.f18571g) {
                this.f18575k = cVar.a(2);
                this.f18576l = cVar.a(2);
                this.f18577m = cVar.b();
            }
            this.f18578n = cVar.b();
        }
    }

    static {
        V.put(0, 96000);
        V.put(1, 88200);
        V.put(2, 64000);
        V.put(3, 48000);
        V.put(4, 44100);
        V.put(5, 32000);
        V.put(6, 24000);
        V.put(7, 22050);
        V.put(8, 16000);
        V.put(9, 12000);
        V.put(10, 11025);
        V.put(11, 8000);
        W.put(1, "AAC main");
        W.put(2, "AAC LC");
        W.put(3, "AAC SSR");
        W.put(4, "AAC LTP");
        W.put(5, "SBR");
        W.put(6, "AAC Scalable");
        W.put(7, "TwinVQ");
        W.put(8, "CELP");
        W.put(9, "HVXC");
        W.put(10, "(reserved)");
        W.put(11, "(reserved)");
        W.put(12, "TTSI");
        W.put(13, "Main synthetic");
        W.put(14, "Wavetable synthesis");
        W.put(15, "General MIDI");
        W.put(16, "Algorithmic Synthesis and Audio FX");
        W.put(17, "ER AAC LC");
        W.put(18, "(reserved)");
        W.put(19, "ER AAC LTP");
        W.put(20, "ER AAC Scalable");
        W.put(21, "ER TwinVQ");
        W.put(22, "ER BSAC");
        W.put(23, "ER AAC LD");
        W.put(24, "ER CELP");
        W.put(25, "ER HVXC");
        W.put(26, "ER HILN");
        W.put(27, "ER Parametric");
        W.put(28, "SSC");
        W.put(29, "PS");
        W.put(30, "MPEG Surround");
        W.put(31, "(escape)");
        W.put(32, "Layer-1");
        W.put(33, "Layer-2");
        W.put(34, "Layer-3");
        W.put(35, "DST");
        W.put(36, "ALS");
        W.put(37, "SLS");
        W.put(38, "SLS non-core");
        W.put(39, "ER AAC ELD");
        W.put(40, "SMR Simple");
        W.put(41, "SMR Main");
    }

    private int f() {
        return 0;
    }

    private int g(c cVar) {
        int a10 = cVar.a(5);
        return a10 == 31 ? cVar.a(6) + 32 : a10;
    }

    private void h(int i10, int i11, int i12, c cVar) {
        this.J = cVar.a(1);
        this.K = cVar.a(2);
        int a10 = cVar.a(1);
        this.L = a10;
        if (a10 == 1) {
            this.M = cVar.a(1);
        }
    }

    private void i(int i10, int i11, int i12, c cVar) {
        this.f18551u = cVar.a(1);
        int a10 = cVar.a(1);
        this.f18552v = a10;
        if (a10 == 1) {
            this.f18553w = cVar.a(14);
        }
        this.f18554x = cVar.a(1);
        if (i11 != 0) {
            if (i12 == 6 || i12 == 20) {
                this.f18555y = cVar.a(3);
            }
            if (this.f18554x == 1) {
                if (i12 == 22) {
                    this.f18556z = cVar.a(5);
                    this.A = cVar.a(11);
                }
                if (i12 == 17 || i12 == 19 || i12 == 20 || i12 == 23) {
                    this.B = cVar.b();
                    this.C = cVar.b();
                    this.D = cVar.b();
                }
                this.E = cVar.a(1);
            }
            this.F = true;
            return;
        }
        throw new UnsupportedOperationException("can't parse program_config_element yet");
    }

    private void j(int i10, int i11, int i12, c cVar) {
        this.N = cVar.a(1);
        this.O = cVar.a(8);
        this.P = cVar.a(4);
        this.Q = cVar.a(12);
        this.R = cVar.a(2);
    }

    private void k(int i10, int i11, int i12, c cVar) {
        int a10 = cVar.a(1);
        this.S = a10;
        if (a10 == 1) {
            this.T = cVar.a(2);
        }
    }

    private void l(int i10, int i11, int i12, c cVar) {
        int a10 = cVar.a(2);
        this.H = a10;
        if (a10 != 1) {
            h(i10, i11, i12, cVar);
        }
        if (this.H != 0) {
            j(i10, i11, i12, cVar);
        }
        this.I = cVar.a(1);
        this.U = true;
    }

    private void m(int i10, int i11, int i12, c cVar) {
        int a10 = cVar.a(1);
        this.G = a10;
        if (a10 == 1) {
            l(i10, i11, i12, cVar);
        } else {
            k(i10, i11, i12, cVar);
        }
    }

    public void e(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f18581b);
        byteBuffer.position(byteBuffer.position() + this.f18581b);
        byte[] bArr = new byte[this.f18581b];
        this.f18534d = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(slice);
        this.f18536f = g(cVar);
        int a10 = cVar.a(4);
        this.f18537g = a10;
        if (a10 == 15) {
            this.f18538h = cVar.a(24);
        }
        this.f18539i = cVar.a(4);
        int i10 = this.f18536f;
        if (i10 == 5 || i10 == 29) {
            this.f18540j = 5;
            this.f18541k = true;
            if (i10 == 29) {
                this.f18542l = true;
            }
            int a11 = cVar.a(4);
            this.f18543m = a11;
            if (a11 == 15) {
                this.f18544n = cVar.a(24);
            }
            int g10 = g(cVar);
            this.f18536f = g10;
            if (g10 == 22) {
                this.f18545o = cVar.a(4);
            }
        } else {
            this.f18540j = 0;
        }
        int i11 = this.f18536f;
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i(this.f18537g, this.f18539i, i11, cVar);
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                m(this.f18537g, this.f18539i, i11, cVar);
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f18546p = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f18547q = cVar.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                this.f18535e = new C0245a(this.f18539i, cVar);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i12 = this.f18536f;
        if (!(i12 == 17 || i12 == 39)) {
            switch (i12) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
            }
        }
        int a12 = cVar.a(2);
        this.f18548r = a12;
        if (a12 == 2 || a12 == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (a12 == 3) {
            int a13 = cVar.a(1);
            this.f18549s = a13;
            if (a13 == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.f18540j != 5 && cVar.c() >= 16) {
            int a14 = cVar.a(11);
            this.f18550t = a14;
            if (a14 == 695) {
                int g11 = g(cVar);
                this.f18540j = g11;
                if (g11 == 5) {
                    boolean b10 = cVar.b();
                    this.f18541k = b10;
                    if (b10) {
                        int a15 = cVar.a(4);
                        this.f18543m = a15;
                        if (a15 == 15) {
                            this.f18544n = cVar.a(24);
                        }
                        if (cVar.c() >= 12) {
                            int a16 = cVar.a(11);
                            this.f18550t = a16;
                            if (a16 == 1352) {
                                this.f18542l = cVar.b();
                            }
                        }
                    }
                }
                if (this.f18540j == 22) {
                    boolean b11 = cVar.b();
                    this.f18541k = b11;
                    if (b11) {
                        int a17 = cVar.a(4);
                        this.f18543m = a17;
                        if (a17 == 15) {
                            this.f18544n = cVar.a(24);
                        }
                    }
                    this.f18545o = cVar.a(4);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.C == aVar.C && this.B == aVar.B && this.D == aVar.D && this.f18536f == aVar.f18536f && this.f18539i == aVar.f18539i && this.f18553w == aVar.f18553w && this.f18552v == aVar.f18552v && this.f18549s == aVar.f18549s && this.f18548r == aVar.f18548r && this.L == aVar.L && this.f18540j == aVar.f18540j && this.f18545o == aVar.f18545o && this.f18554x == aVar.f18554x && this.E == aVar.E && this.f18544n == aVar.f18544n && this.f18543m == aVar.f18543m && this.f18547q == aVar.f18547q && this.f18551u == aVar.f18551u && this.F == aVar.F && this.R == aVar.R && this.S == aVar.S && this.T == aVar.T && this.Q == aVar.Q && this.O == aVar.O && this.N == aVar.N && this.P == aVar.P && this.K == aVar.K && this.J == aVar.J && this.G == aVar.G && this.f18555y == aVar.f18555y && this.A == aVar.A && this.f18556z == aVar.f18556z && this.I == aVar.I && this.H == aVar.H && this.U == aVar.U && this.f18542l == aVar.f18542l && this.f18546p == aVar.f18546p && this.f18538h == aVar.f18538h && this.f18537g == aVar.f18537g && this.f18541k == aVar.f18541k && this.f18550t == aVar.f18550t && this.M == aVar.M && Arrays.equals(this.f18534d, aVar.f18534d);
    }

    public int hashCode() {
        byte[] bArr = this.f18534d;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.f18536f) * 31) + this.f18537g) * 31) + this.f18538h) * 31) + this.f18539i) * 31) + this.f18540j) * 31) + (this.f18541k ? 1 : 0)) * 31) + (this.f18542l ? 1 : 0)) * 31) + this.f18543m) * 31) + this.f18544n) * 31) + this.f18545o) * 31) + this.f18546p) * 31) + this.f18547q) * 31) + this.f18548r) * 31) + this.f18549s) * 31) + this.f18550t) * 31) + this.f18551u) * 31) + this.f18552v) * 31) + this.f18553w) * 31) + this.f18554x) * 31) + this.f18555y) * 31) + this.f18556z) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + this.E) * 31) + (this.F ? 1 : 0)) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + (this.U ? 1 : 0);
    }

    public ByteBuffer n() {
        ByteBuffer allocate = ByteBuffer.allocate(o());
        d.i(allocate, 5);
        d.i(allocate, o() - 2);
        d dVar = new d(allocate);
        dVar.a(this.f18536f, 5);
        dVar.a(this.f18537g, 4);
        if (this.f18537g != 15) {
            dVar.a(this.f18539i, 4);
            return allocate;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public int o() {
        if (this.f18536f == 2) {
            return f() + 4;
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public void p(int i10) {
        this.f18536f = i10;
    }

    public void q(int i10) {
        this.f18539i = i10;
    }

    public void r(int i10) {
        this.f18537g = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioSpecificConfig");
        sb2.append("{configBytes=");
        sb2.append(b2.a.a(this.f18534d));
        sb2.append(", audioObjectType=");
        sb2.append(this.f18536f);
        sb2.append(" (");
        sb2.append((String) W.get(Integer.valueOf(this.f18536f)));
        sb2.append(")");
        sb2.append(", samplingFrequencyIndex=");
        sb2.append(this.f18537g);
        sb2.append(" (");
        sb2.append(V.get(Integer.valueOf(this.f18537g)));
        sb2.append(")");
        sb2.append(", samplingFrequency=");
        sb2.append(this.f18538h);
        sb2.append(", channelConfiguration=");
        sb2.append(this.f18539i);
        if (this.f18540j > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f18540j);
            sb2.append(" (");
            sb2.append((String) W.get(Integer.valueOf(this.f18540j)));
            sb2.append(")");
            sb2.append(", sbrPresentFlag=");
            sb2.append(this.f18541k);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f18542l);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f18543m);
            sb2.append(" (");
            sb2.append(V.get(Integer.valueOf(this.f18543m)));
            sb2.append(")");
            sb2.append(", extensionSamplingFrequency=");
            sb2.append(this.f18544n);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f18545o);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f18550t);
        if (this.F) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f18551u);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f18552v);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.f18553w);
            sb2.append(", extensionFlag=");
            sb2.append(this.f18554x);
            sb2.append(", layerNr=");
            sb2.append(this.f18555y);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f18556z);
            sb2.append(", layer_length=");
            sb2.append(this.A);
            sb2.append(", aacSectionDataResilienceFlag=");
            sb2.append(this.B);
            sb2.append(", aacScalefactorDataResilienceFlag=");
            sb2.append(this.C);
            sb2.append(", aacSpectralDataResilienceFlag=");
            sb2.append(this.D);
            sb2.append(", extensionFlag3=");
            sb2.append(this.E);
        }
        if (this.U) {
            sb2.append(", isBaseLayer=");
            sb2.append(this.G);
            sb2.append(", paraMode=");
            sb2.append(this.H);
            sb2.append(", paraExtensionFlag=");
            sb2.append(this.I);
            sb2.append(", hvxcVarMode=");
            sb2.append(this.J);
            sb2.append(", hvxcRateMode=");
            sb2.append(this.K);
            sb2.append(", erHvxcExtensionFlag=");
            sb2.append(this.L);
            sb2.append(", var_ScalableFlag=");
            sb2.append(this.M);
            sb2.append(", hilnQuantMode=");
            sb2.append(this.N);
            sb2.append(", hilnMaxNumLine=");
            sb2.append(this.O);
            sb2.append(", hilnSampleRateCode=");
            sb2.append(this.P);
            sb2.append(", hilnFrameLength=");
            sb2.append(this.Q);
            sb2.append(", hilnContMode=");
            sb2.append(this.R);
            sb2.append(", hilnEnhaLayer=");
            sb2.append(this.S);
            sb2.append(", hilnEnhaQuantMode=");
            sb2.append(this.T);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
