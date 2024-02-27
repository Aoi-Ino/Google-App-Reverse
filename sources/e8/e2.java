package e8;

import androidx.constraintlayout.widget.i;
import b8.a;
import f.j;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public final class e2 {
    private short A;
    private int B;
    private int C;
    private int D;
    private int E;
    private short F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private short M;
    private short N;
    private short O;
    private short P;
    private boolean Q;
    private int[] R = {0, 0, 0, 0, 197, 198, 199, 0, 202, 0, 205, 206, 207, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 33, 34, 35, 36, 37, 38, 169, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 193, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, i.f1939d3, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, j.K0, j.L0, j.M0, 127, 128, 0, 184, 166, 185, 188, 178, 179, 195, 189, 0, 172, 234, 0, 0, 0, 0, 96, 0, 170, 186, 183, 177, 208, 196, 0, 0, 173, 250, 0, 0, 0, 0, 161, 162, 163, 168, 165, 0, 167, 200, 0, 227, 171, 0, 0, 0, 197, 0, 0, 0, 0, 194, 0, 182, 180, 203, 0, 235, 187, 0, 0, 0, 191, 0, 0, 0, 0, 0, 0, 225, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 233, 0, 0, 0, 0, 0, 0, 251, 0, 0, 0, 0, 0, 0, 241, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 249, 0, 0, 0, 0, 0, 0, 0};
    private int[] S = {0, 0, 0, 0, 2, 2, 2, 0, 2, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 0, 0, 2, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    private String[] T = {"W00", "W01", "W02", "W03", "macron", "breve", "dotaccent", "W07", "ring", "W09", "W0a", "W0b", "W0c", "W0d", "W0e", "W0f", "hungarumlaut", "ogonek", "caron", "W13", "W14", "W15", "W16", "W17", "W18", "W19", "W1a", "W1b", "W1c", "W1d", "W1e", "W1f", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quotesingle", "parenleft", "parenright", "asterisk", "plus", "comma", "hyphen", "period", "slash", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon", "less", "equal", "greater", "question", "at", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "bracketleft", "backslash", "bracketright", "asciicircum", "underscore", "grave", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "braceleft", "bar", "braceright", "asciitilde", "W7f", "euro", "W81", "quotesinglbase", "florin", "quotedblbase", "ellipsis", "dagger", "daggerdbl", "circumflex", "perthousand", "Scaron", "guilsinglleft", "OE", "W8d", "Zcaron", "W8f", "W90", "quoteleft", "quoteright", "quotedblleft", "quotedblright", "bullet", "endash", "emdash", "tilde", "trademark", "scaron", "guilsinglright", "oe", "W9d", "zcaron", "Ydieresis", "reqspace", "exclamdown", "cent", "sterling", "currency", "yen", "brokenbar", "section", "dieresis", "copyright", "ordfeminine", "guillemotleft", "logicalnot", "syllable", "registered", "macron", "degree", "plusminus", "twosuperior", "threesuperior", "acute", "mu", "paragraph", "periodcentered", "cedilla", "onesuperior", "ordmasculine", "guillemotright", "onequarter", "onehalf", "threequarters", "questiondown", "Agrave", "Aacute", "Acircumflex", "Atilde", "Adieresis", "Aring", "AE", "Ccedilla", "Egrave", "Eacute", "Ecircumflex", "Edieresis", "Igrave", "Iacute", "Icircumflex", "Idieresis", "Eth", "Ntilde", "Ograve", "Oacute", "Ocircumflex", "Otilde", "Odieresis", "multiply", "Oslash", "Ugrave", "Uacute", "Ucircumflex", "Udieresis", "Yacute", "Thorn", "germandbls", "agrave", "aacute", "acircumflex", "atilde", "adieresis", "aring", "ae", "ccedilla", "egrave", "eacute", "ecircumflex", "edieresis", "igrave", "iacute", "icircumflex", "idieresis", "eth", "ntilde", "ograve", "oacute", "ocircumflex", "otilde", "odieresis", "divide", "oslash", "ugrave", "uacute", "ucircumflex", "udieresis", "yacute", "thorn", "ydieresis"};

    /* renamed from: a  reason: collision with root package name */
    private f2 f10629a;

    /* renamed from: b  reason: collision with root package name */
    private PrintWriter f10630b;

    /* renamed from: c  reason: collision with root package name */
    private short f10631c;

    /* renamed from: d  reason: collision with root package name */
    private int f10632d;

    /* renamed from: e  reason: collision with root package name */
    private String f10633e;

    /* renamed from: f  reason: collision with root package name */
    private short f10634f;

    /* renamed from: g  reason: collision with root package name */
    private short f10635g;

    /* renamed from: h  reason: collision with root package name */
    private short f10636h;

    /* renamed from: i  reason: collision with root package name */
    private short f10637i;

    /* renamed from: j  reason: collision with root package name */
    private short f10638j;

    /* renamed from: k  reason: collision with root package name */
    private short f10639k;

    /* renamed from: l  reason: collision with root package name */
    private short f10640l;

    /* renamed from: m  reason: collision with root package name */
    private byte f10641m;

    /* renamed from: n  reason: collision with root package name */
    private byte f10642n;

    /* renamed from: o  reason: collision with root package name */
    private byte f10643o;

    /* renamed from: p  reason: collision with root package name */
    private short f10644p;

    /* renamed from: q  reason: collision with root package name */
    private byte f10645q;

    /* renamed from: r  reason: collision with root package name */
    private short f10646r;

    /* renamed from: s  reason: collision with root package name */
    private short f10647s;

    /* renamed from: t  reason: collision with root package name */
    private byte f10648t;

    /* renamed from: u  reason: collision with root package name */
    private short f10649u;

    /* renamed from: v  reason: collision with root package name */
    private short f10650v;

    /* renamed from: w  reason: collision with root package name */
    private int f10651w;

    /* renamed from: x  reason: collision with root package name */
    private int f10652x;

    /* renamed from: y  reason: collision with root package name */
    private byte f10653y;

    /* renamed from: z  reason: collision with root package name */
    private byte f10654z;

    private e2(f2 f2Var, OutputStream outputStream) {
        this.f10629a = f2Var;
        this.f10630b = new PrintWriter(new OutputStreamWriter(outputStream, "ISO-8859-1"));
    }

    public static void a(f2 f2Var, OutputStream outputStream) {
        e2 e2Var = new e2(f2Var, outputStream);
        e2Var.b();
        e2Var.f();
        e2Var.e();
        e2Var.g();
        e2Var.h();
        e2Var.f10630b.flush();
    }

    private void b() {
        int i10;
        this.f10629a.j(0);
        this.f10631c = this.f10629a.h();
        this.f10632d = this.f10629a.g();
        this.f10633e = j(60);
        this.f10634f = this.f10629a.h();
        this.f10635g = this.f10629a.h();
        this.f10636h = this.f10629a.h();
        this.f10637i = this.f10629a.h();
        this.f10638j = this.f10629a.h();
        this.f10639k = this.f10629a.h();
        this.f10640l = this.f10629a.h();
        this.f10641m = (byte) this.f10629a.read();
        this.f10642n = (byte) this.f10629a.read();
        this.f10643o = (byte) this.f10629a.read();
        this.f10644p = this.f10629a.h();
        this.f10645q = (byte) this.f10629a.read();
        this.f10646r = this.f10629a.h();
        this.f10647s = this.f10629a.h();
        this.f10648t = (byte) this.f10629a.read();
        this.f10649u = this.f10629a.h();
        this.f10650v = this.f10629a.h();
        this.f10651w = this.f10629a.read();
        this.f10652x = this.f10629a.read();
        this.f10653y = (byte) this.f10629a.read();
        this.f10654z = (byte) this.f10629a.read();
        this.A = this.f10629a.h();
        this.B = this.f10629a.g();
        this.C = this.f10629a.g();
        this.D = this.f10629a.g();
        this.E = this.f10629a.g();
        this.F = this.f10629a.h();
        this.G = this.f10629a.g();
        this.H = this.f10629a.g();
        this.I = this.f10629a.g();
        this.J = this.f10629a.g();
        this.K = this.f10629a.g();
        this.L = this.f10629a.g();
        if (this.f10632d != this.f10629a.e() || this.F != 30 || (i10 = this.L) < 75 || i10 > 512) {
            throw new IOException(a.b("not.a.valid.pfm.file", new Object[0]));
        }
        this.f10629a.j(this.G + 14);
        this.M = this.f10629a.h();
        this.N = this.f10629a.h();
        this.O = this.f10629a.h();
        this.P = this.f10629a.h();
    }

    private void c(int i10, int i11, String str) {
        this.f10630b.print("C ");
        d(i10);
        this.f10630b.print(" ; WX ");
        d(i11);
        if (str != null) {
            this.f10630b.print(" ; N ");
            this.f10630b.print(str);
        }
        this.f10630b.print(" ;\n");
    }

    private void d(int i10) {
        this.f10630b.print(' ');
        this.f10630b.print(i10);
    }

    private void e() {
        int i10 = (this.f10652x - this.f10651w) + 1;
        int[] iArr = new int[i10];
        this.f10629a.j(this.H);
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = this.f10629a.i();
        }
        int[] iArr2 = new int[256];
        if (this.f10645q == 0) {
            for (int i12 = this.f10651w; i12 <= this.f10652x; i12++) {
                int i13 = this.R[i12];
                if (i13 != 0) {
                    iArr2[i13] = i12;
                }
            }
        }
        this.f10630b.print("StartCharMetrics");
        d(i10);
        this.f10630b.print(10);
        if (this.f10645q != 0) {
            for (int i14 = this.f10651w; i14 <= this.f10652x; i14++) {
                int i15 = this.f10651w;
                if (iArr[i14 - i15] != 0) {
                    c(i14, iArr[i14 - i15], (String) null);
                }
            }
        } else {
            for (int i16 = 0; i16 < 256; i16++) {
                int i17 = iArr2[i16];
                if (i17 != 0) {
                    c(i16, iArr[i17 - this.f10651w], this.T[i17]);
                    iArr[i17 - this.f10651w] = 0;
                }
            }
            for (int i18 = this.f10651w; i18 <= this.f10652x; i18++) {
                int i19 = this.f10651w;
                if (iArr[i18 - i19] != 0) {
                    c(-1, iArr[i18 - i19], this.T[i18]);
                }
            }
        }
        this.f10630b.print("EndCharMetrics\n");
    }

    private void f() {
        PrintWriter printWriter;
        String str;
        PrintWriter printWriter2;
        String str2;
        PrintWriter printWriter3;
        String str3;
        this.f10630b.print("StartFontMetrics 2.0\n");
        if (this.f10633e.length() > 0) {
            PrintWriter printWriter4 = this.f10630b;
            printWriter4.print("Comment " + this.f10633e + 10);
        }
        this.f10630b.print("FontName ");
        this.f10629a.j(this.L);
        String i10 = i();
        this.f10630b.print(i10);
        this.f10630b.print("\nEncodingScheme ");
        if (this.f10645q != 0) {
            printWriter = this.f10630b;
            str = "FontSpecific\n";
        } else {
            printWriter = this.f10630b;
            str = "AdobeStandardEncoding\n";
        }
        printWriter.print(str);
        PrintWriter printWriter5 = this.f10630b;
        printWriter5.print("FullName " + i10.replace('-', ' '));
        int i11 = this.C;
        if (i11 != 0) {
            this.f10629a.j(i11);
            PrintWriter printWriter6 = this.f10630b;
            printWriter6.print("\nFamilyName " + i());
        }
        this.f10630b.print("\nWeight ");
        if (this.f10644p > 475 || i10.toLowerCase().indexOf("bold") >= 0) {
            printWriter2 = this.f10630b;
            str2 = "Bold";
        } else {
            short s10 = this.f10644p;
            if ((s10 < 325 && s10 != 0) || i10.toLowerCase().indexOf("light") >= 0) {
                printWriter2 = this.f10630b;
                str2 = "Light";
            } else if (i10.toLowerCase().indexOf("black") >= 0) {
                printWriter2 = this.f10630b;
                str2 = "Black";
            } else {
                printWriter2 = this.f10630b;
                str2 = "Medium";
            }
        }
        printWriter2.print(str2);
        this.f10630b.print("\nItalicAngle ");
        if (this.f10641m != 0 || i10.toLowerCase().indexOf("italic") >= 0) {
            printWriter3 = this.f10630b;
            str3 = "-12.00";
        } else {
            printWriter3 = this.f10630b;
            str3 = "0";
        }
        printWriter3.print(str3);
        this.f10630b.print("\nIsFixedPitch ");
        if ((this.f10648t & 1) == 0 || this.f10649u == this.f10650v) {
            this.f10630b.print("true");
            this.Q = true;
        } else {
            this.f10630b.print("false");
            this.Q = false;
        }
        this.f10630b.print("\nFontBBox");
        d(this.Q ? -20 : -100);
        d(-(this.P + 5));
        d(this.f10650v + 10);
        d(this.f10638j + 5);
        this.f10630b.print("\nCapHeight");
        d(this.M);
        this.f10630b.print("\nXHeight");
        d(this.N);
        this.f10630b.print("\nDescender");
        d(-this.P);
        this.f10630b.print("\nAscender");
        d(this.O);
        this.f10630b.print(10);
    }

    private void g() {
        int i10 = this.J;
        if (i10 != 0) {
            this.f10629a.j(i10);
            int i11 = this.f10629a.i() * 3;
            int[] iArr = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                iArr[i12] = this.f10629a.read();
                int i14 = i12 + 2;
                iArr[i12 + 1] = this.f10629a.read();
                i12 += 3;
                int h10 = this.f10629a.h();
                iArr[i14] = h10;
                if (h10 != 0) {
                    i13++;
                }
            }
            if (i13 != 0) {
                this.f10630b.print("StartKernData\nStartKernPairs");
                d(i13);
                this.f10630b.print(10);
                for (int i15 = 0; i15 < i11; i15 += 3) {
                    int i16 = i15 + 2;
                    if (iArr[i16] != 0) {
                        this.f10630b.print("KPX ");
                        this.f10630b.print(this.T[iArr[i15]]);
                        this.f10630b.print(' ');
                        this.f10630b.print(this.T[iArr[i15 + 1]]);
                        d(iArr[i16]);
                        this.f10630b.print(10);
                    }
                }
                this.f10630b.print("EndKernPairs\nEndKernData\n");
            }
        }
    }

    private void h() {
        this.f10630b.print("EndFontMetrics\n");
    }

    private String i() {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int read = this.f10629a.read();
            if (read <= 0) {
                return stringBuffer.toString();
            }
            stringBuffer.append((char) read);
        }
    }

    private String j(int i10) {
        byte[] bArr = new byte[i10];
        this.f10629a.readFully(bArr);
        int i11 = 0;
        while (i11 < i10 && bArr[i11] != 0) {
            i11++;
        }
        return new String(bArr, 0, i11, "ISO-8859-1");
    }
}
