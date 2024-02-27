package e8;

public abstract class g {

    /* renamed from: p  reason: collision with root package name */
    static final String[] f10673p = {"version", "Notice", "FullName", "FamilyName", "Weight", "FontBBox", "BlueValues", "OtherBlues", "FamilyBlues", "FamilyOtherBlues", "StdHW", "StdVW", "UNKNOWN_12", "UniqueID", "XUID", "charset", "Encoding", "CharStrings", "Private", "Subrs", "defaultWidthX", "nominalWidthX", "UNKNOWN_22", "UNKNOWN_23", "UNKNOWN_24", "UNKNOWN_25", "UNKNOWN_26", "UNKNOWN_27", "UNKNOWN_28", "UNKNOWN_29", "UNKNOWN_30", "UNKNOWN_31", "Copyright", "isFixedPitch", "ItalicAngle", "UnderlinePosition", "UnderlineThickness", "PaintType", "CharstringType", "FontMatrix", "StrokeWidth", "BlueScale", "BlueShift", "BlueFuzz", "StemSnapH", "StemSnapV", "ForceBold", "UNKNOWN_12_15", "UNKNOWN_12_16", "LanguageGroup", "ExpansionFactor", "initialRandomSeed", "SyntheticBase", "PostScript", "BaseFontName", "BaseFontBlend", "UNKNOWN_12_24", "UNKNOWN_12_25", "UNKNOWN_12_26", "UNKNOWN_12_27", "UNKNOWN_12_28", "UNKNOWN_12_29", "ROS", "CIDFontVersion", "CIDFontRevision", "CIDFontType", "CIDCount", "UIDBase", "FDArray", "FDSelect", "FontName"};

    /* renamed from: q  reason: collision with root package name */
    static final String[] f10674q = {".notdef", "space", "exclam", "quotedbl", "numbersign", "dollar", "percent", "ampersand", "quoteright", "parenleft", "parenright", "asterisk", "plus", "comma", "hyphen", "period", "slash", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "colon", "semicolon", "less", "equal", "greater", "question", "at", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "bracketleft", "backslash", "bracketright", "asciicircum", "underscore", "quoteleft", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "braceleft", "bar", "braceright", "asciitilde", "exclamdown", "cent", "sterling", "fraction", "yen", "florin", "section", "currency", "quotesingle", "quotedblleft", "guillemotleft", "guilsinglleft", "guilsinglright", "fi", "fl", "endash", "dagger", "daggerdbl", "periodcentered", "paragraph", "bullet", "quotesinglbase", "quotedblbase", "quotedblright", "guillemotright", "ellipsis", "perthousand", "questiondown", "grave", "acute", "circumflex", "tilde", "macron", "breve", "dotaccent", "dieresis", "ring", "cedilla", "hungarumlaut", "ogonek", "caron", "emdash", "AE", "ordfeminine", "Lslash", "Oslash", "OE", "ordmasculine", "ae", "dotlessi", "lslash", "oslash", "oe", "germandbls", "onesuperior", "logicalnot", "mu", "trademark", "Eth", "onehalf", "plusminus", "Thorn", "onequarter", "divide", "brokenbar", "degree", "thorn", "threequarters", "twosuperior", "registered", "minus", "eth", "multiply", "threesuperior", "copyright", "Aacute", "Acircumflex", "Adieresis", "Agrave", "Aring", "Atilde", "Ccedilla", "Eacute", "Ecircumflex", "Edieresis", "Egrave", "Iacute", "Icircumflex", "Idieresis", "Igrave", "Ntilde", "Oacute", "Ocircumflex", "Odieresis", "Ograve", "Otilde", "Scaron", "Uacute", "Ucircumflex", "Udieresis", "Ugrave", "Yacute", "Ydieresis", "Zcaron", "aacute", "acircumflex", "adieresis", "agrave", "aring", "atilde", "ccedilla", "eacute", "ecircumflex", "edieresis", "egrave", "iacute", "icircumflex", "idieresis", "igrave", "ntilde", "oacute", "ocircumflex", "odieresis", "ograve", "otilde", "scaron", "uacute", "ucircumflex", "udieresis", "ugrave", "yacute", "ydieresis", "zcaron", "exclamsmall", "Hungarumlautsmall", "dollaroldstyle", "dollarsuperior", "ampersandsmall", "Acutesmall", "parenleftsuperior", "parenrightsuperior", "twodotenleader", "onedotenleader", "zerooldstyle", "oneoldstyle", "twooldstyle", "threeoldstyle", "fouroldstyle", "fiveoldstyle", "sixoldstyle", "sevenoldstyle", "eightoldstyle", "nineoldstyle", "commasuperior", "threequartersemdash", "periodsuperior", "questionsmall", "asuperior", "bsuperior", "centsuperior", "dsuperior", "esuperior", "isuperior", "lsuperior", "msuperior", "nsuperior", "osuperior", "rsuperior", "ssuperior", "tsuperior", "ff", "ffi", "ffl", "parenleftinferior", "parenrightinferior", "Circumflexsmall", "hyphensuperior", "Gravesmall", "Asmall", "Bsmall", "Csmall", "Dsmall", "Esmall", "Fsmall", "Gsmall", "Hsmall", "Ismall", "Jsmall", "Ksmall", "Lsmall", "Msmall", "Nsmall", "Osmall", "Psmall", "Qsmall", "Rsmall", "Ssmall", "Tsmall", "Usmall", "Vsmall", "Wsmall", "Xsmall", "Ysmall", "Zsmall", "colonmonetary", "onefitted", "rupiah", "Tildesmall", "exclamdownsmall", "centoldstyle", "Lslashsmall", "Scaronsmall", "Zcaronsmall", "Dieresissmall", "Brevesmall", "Caronsmall", "Dotaccentsmall", "Macronsmall", "figuredash", "hypheninferior", "Ogoneksmall", "Ringsmall", "Cedillasmall", "questiondownsmall", "oneeighth", "threeeighths", "fiveeighths", "seveneighths", "onethird", "twothirds", "zerosuperior", "foursuperior", "fivesuperior", "sixsuperior", "sevensuperior", "eightsuperior", "ninesuperior", "zeroinferior", "oneinferior", "twoinferior", "threeinferior", "fourinferior", "fiveinferior", "sixinferior", "seveninferior", "eightinferior", "nineinferior", "centinferior", "dollarinferior", "periodinferior", "commainferior", "Agravesmall", "Aacutesmall", "Acircumflexsmall", "Atildesmall", "Adieresissmall", "Aringsmall", "AEsmall", "Ccedillasmall", "Egravesmall", "Eacutesmall", "Ecircumflexsmall", "Edieresissmall", "Igravesmall", "Iacutesmall", "Icircumflexsmall", "Idieresissmall", "Ethsmall", "Ntildesmall", "Ogravesmall", "Oacutesmall", "Ocircumflexsmall", "Otildesmall", "Odieresissmall", "OEsmall", "Oslashsmall", "Ugravesmall", "Uacutesmall", "Ucircumflexsmall", "Udieresissmall", "Yacutesmall", "Thornsmall", "Ydieresissmall", "001.000", "001.001", "001.002", "001.003", "Black", "Bold", "Book", "Light", "Medium", "Regular", "Roman", "Semibold"};

    /* renamed from: a  reason: collision with root package name */
    int f10675a;

    /* renamed from: b  reason: collision with root package name */
    protected String f10676b;

    /* renamed from: c  reason: collision with root package name */
    protected Object[] f10677c = new Object[48];

    /* renamed from: d  reason: collision with root package name */
    protected int f10678d = 0;

    /* renamed from: e  reason: collision with root package name */
    protected f2 f10679e;

    /* renamed from: f  reason: collision with root package name */
    private int f10680f;

    /* renamed from: g  reason: collision with root package name */
    protected int f10681g;

    /* renamed from: h  reason: collision with root package name */
    protected int f10682h;

    /* renamed from: i  reason: collision with root package name */
    protected int f10683i;

    /* renamed from: j  reason: collision with root package name */
    protected int f10684j;

    /* renamed from: k  reason: collision with root package name */
    protected int[] f10685k;

    /* renamed from: l  reason: collision with root package name */
    protected int[] f10686l;

    /* renamed from: m  reason: collision with root package name */
    protected int[] f10687m;

    /* renamed from: n  reason: collision with root package name */
    protected int[] f10688n;

    /* renamed from: o  reason: collision with root package name */
    protected c[] f10689o;

    protected static final class a extends C0141g {

        /* renamed from: b  reason: collision with root package name */
        public final int f10690b;

        /* renamed from: c  reason: collision with root package name */
        public int f10691c = 5;

        public a(int i10) {
            this.f10690b = i10;
        }

        public void a(byte[] bArr) {
            if (this.f10691c == 5) {
                int i10 = this.f10722a;
                bArr[i10] = 29;
                int i11 = this.f10690b;
                bArr[i10 + 1] = (byte) ((i11 >>> 24) & 255);
                bArr[i10 + 2] = (byte) ((i11 >>> 16) & 255);
                bArr[i10 + 3] = (byte) ((i11 >>> 8) & 255);
                bArr[i10 + 4] = (byte) (i11 & 255);
            }
        }

        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + this.f10691c;
        }
    }

    protected static final class b extends i {

        /* renamed from: c  reason: collision with root package name */
        public final int f10692c = 5;

        public void a(byte[] bArr) {
            if (this.f10692c == 5) {
                int i10 = this.f10722a;
                bArr[i10] = 29;
                int i11 = this.f10724b;
                bArr[i10 + 1] = (byte) ((i11 >>> 24) & 255);
                bArr[i10 + 2] = (byte) ((i11 >>> 16) & 255);
                bArr[i10 + 3] = (byte) ((i11 >>> 8) & 255);
                bArr[i10 + 4] = (byte) (i11 & 255);
            }
        }

        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + this.f10692c;
        }
    }

    protected final class c {
        public int[] A;

        /* renamed from: a  reason: collision with root package name */
        public String f10693a;

        /* renamed from: b  reason: collision with root package name */
        public String f10694b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10695c = false;

        /* renamed from: d  reason: collision with root package name */
        public int f10696d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f10697e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f10698f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f10699g = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f10700h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f10701i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f10702j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f10703k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int[] f10704l;

        /* renamed from: m  reason: collision with root package name */
        public int[] f10705m;

        /* renamed from: n  reason: collision with root package name */
        public int f10706n;

        /* renamed from: o  reason: collision with root package name */
        public int f10707o;

        /* renamed from: p  reason: collision with root package name */
        public int f10708p;

        /* renamed from: q  reason: collision with root package name */
        public int[] f10709q;

        /* renamed from: r  reason: collision with root package name */
        public int[] f10710r;

        /* renamed from: s  reason: collision with root package name */
        public int f10711s;

        /* renamed from: t  reason: collision with root package name */
        public int f10712t;

        /* renamed from: u  reason: collision with root package name */
        public int f10713u = 2;

        /* renamed from: v  reason: collision with root package name */
        public int f10714v;

        /* renamed from: w  reason: collision with root package name */
        public int f10715w;

        /* renamed from: x  reason: collision with root package name */
        public int[] f10716x;

        /* renamed from: y  reason: collision with root package name */
        public int[] f10717y;

        /* renamed from: z  reason: collision with root package name */
        public int[][] f10718z;

        protected c() {
        }
    }

    protected static final class d extends C0141g {
    }

    protected static final class e extends C0141g {

        /* renamed from: b  reason: collision with root package name */
        private i f10719b;

        /* renamed from: c  reason: collision with root package name */
        private d f10720c;

        public e(i iVar, d dVar) {
            this.f10719b = iVar;
            this.f10720c = dVar;
        }

        public void c() {
            this.f10719b.d((this.f10722a - this.f10720c.f10722a) + 1);
        }
    }

    protected static final class f extends i {

        /* renamed from: c  reason: collision with root package name */
        public final int f10721c;

        public f(int i10) {
            this.f10721c = i10;
        }

        public void a(byte[] bArr) {
            int i10 = this.f10721c;
            int i11 = 0;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            bArr[this.f10722a] = (byte) ((this.f10724b >>> 24) & 255);
                            i11 = 1;
                        } else {
                            return;
                        }
                    }
                    bArr[this.f10722a + i11] = (byte) ((this.f10724b >>> 16) & 255);
                    i11++;
                }
                bArr[this.f10722a + i11] = (byte) ((this.f10724b >>> 8) & 255);
                i11++;
            }
            bArr[this.f10722a + i11] = (byte) (this.f10724b & 255);
        }

        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + this.f10721c;
        }

        public f(int i10, int i11) {
            this.f10721c = i10;
            this.f10724b = i11;
        }
    }

    /* renamed from: e8.g$g  reason: collision with other inner class name */
    protected static abstract class C0141g {

        /* renamed from: a  reason: collision with root package name */
        protected int f10722a = -1;

        protected C0141g() {
        }

        public void a(byte[] bArr) {
        }

        public void b(int[] iArr) {
            this.f10722a = iArr[0];
        }

        public void c() {
        }
    }

    protected static final class h extends C0141g {

        /* renamed from: b  reason: collision with root package name */
        i f10723b;

        public h(i iVar) {
            this.f10723b = iVar;
        }

        public void c() {
            this.f10723b.d(this.f10722a);
        }
    }

    protected static abstract class i extends C0141g {

        /* renamed from: b  reason: collision with root package name */
        public int f10724b;

        protected i() {
        }

        public void d(int i10) {
            this.f10724b = i10;
        }
    }

    protected static final class j extends C0141g {

        /* renamed from: b  reason: collision with root package name */
        public int f10725b;

        /* renamed from: c  reason: collision with root package name */
        public int f10726c;

        /* renamed from: d  reason: collision with root package name */
        private f2 f10727d;

        public j(f2 f2Var, int i10, int i11) {
            this.f10725b = i10;
            this.f10726c = i11;
            this.f10727d = f2Var;
        }

        public void a(byte[] bArr) {
            try {
                this.f10727d.j(this.f10725b);
                for (int i10 = this.f10722a; i10 < this.f10722a + this.f10726c; i10++) {
                    bArr[i10] = this.f10727d.readByte();
                }
            } catch (Exception e10) {
                throw new a8.j(e10);
            }
        }

        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + this.f10726c;
        }
    }

    protected static final class k extends C0141g {

        /* renamed from: b  reason: collision with root package name */
        public String f10728b;

        public k(String str) {
            this.f10728b = str;
        }

        public void a(byte[] bArr) {
            for (int i10 = 0; i10 < this.f10728b.length(); i10++) {
                bArr[this.f10722a + i10] = (byte) (this.f10728b.charAt(i10) & 255);
            }
        }

        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + this.f10728b.length();
        }
    }

    protected static final class l extends C0141g {

        /* renamed from: b  reason: collision with root package name */
        private i f10729b;

        /* renamed from: c  reason: collision with root package name */
        private d f10730c;

        public l(i iVar, d dVar) {
            this.f10729b = iVar;
            this.f10730c = dVar;
        }

        public void c() {
            this.f10729b.d(this.f10722a - this.f10730c.f10722a);
        }
    }

    protected static final class m extends C0141g {

        /* renamed from: b  reason: collision with root package name */
        public char f10731b;

        public m(char c10) {
            this.f10731b = c10;
        }

        public void a(byte[] bArr) {
            int i10 = this.f10722a;
            char c10 = this.f10731b;
            bArr[i10] = (byte) ((c10 >>> 8) & 255);
            bArr[i10 + 1] = (byte) (c10 & 255);
        }

        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + 2;
        }
    }

    protected static final class n extends C0141g {

        /* renamed from: b  reason: collision with root package name */
        public int f10732b;

        public n(int i10) {
            this.f10732b = i10;
        }

        public void a(byte[] bArr) {
            int i10 = this.f10722a;
            int i11 = this.f10732b;
            bArr[i10] = (byte) ((i11 >>> 16) & 255);
            bArr[i10 + 1] = (byte) ((i11 >>> 8) & 255);
            bArr[i10 + 2] = (byte) (i11 & 255);
        }

        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + 3;
        }
    }

    protected static final class o extends C0141g {

        /* renamed from: b  reason: collision with root package name */
        public int f10733b;

        public o(int i10) {
            this.f10733b = i10;
        }

        public void a(byte[] bArr) {
            int i10 = this.f10722a;
            int i11 = this.f10733b;
            bArr[i10] = (byte) ((i11 >>> 24) & 255);
            bArr[i10 + 1] = (byte) ((i11 >>> 16) & 255);
            bArr[i10 + 2] = (byte) ((i11 >>> 8) & 255);
            bArr[i10 + 3] = (byte) (i11 & 255);
        }

        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + 4;
        }
    }

    protected static final class p extends C0141g {

        /* renamed from: b  reason: collision with root package name */
        public char f10734b;

        public p(char c10) {
            this.f10734b = c10;
        }

        public void a(byte[] bArr) {
            bArr[this.f10722a] = (byte) (this.f10734b & 255);
        }

        public void b(int[] iArr) {
            super.b(iArr);
            iArr[0] = iArr[0] + 1;
        }
    }

    public g(f2 f2Var) {
        int i10;
        int i11;
        int i12;
        this.f10679e = f2Var;
        m(0);
        c();
        c();
        char c10 = c();
        this.f10680f = c();
        this.f10681g = c10;
        int[] f10 = f(c10);
        this.f10685k = f10;
        int i13 = f10[f10.length - 1];
        this.f10682h = i13;
        int[] f11 = f(i13);
        this.f10686l = f11;
        int i14 = f11[f11.length - 1];
        this.f10683i = i14;
        int[] f12 = f(i14);
        this.f10687m = f12;
        int i15 = f12[f12.length - 1];
        this.f10684j = i15;
        this.f10688n = f(i15);
        this.f10689o = new c[(this.f10685k.length - 1)];
        int i16 = 0;
        while (i16 < this.f10685k.length - 1) {
            this.f10689o[i16] = new c();
            m(this.f10685k[i16]);
            this.f10689o[i16].f10693a = "";
            int i17 = this.f10685k[i16];
            while (true) {
                i12 = i16 + 1;
                if (i17 >= this.f10685k[i12]) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                c cVar = this.f10689o[i16];
                sb2.append(cVar.f10693a);
                sb2.append(c());
                cVar.f10693a = sb2.toString();
                i17++;
            }
            i16 = i12;
        }
        int i18 = 0;
        while (true) {
            int[] iArr = this.f10686l;
            if (i18 < iArr.length - 1) {
                int i19 = iArr[i18];
                while (true) {
                    m(i19);
                    while (true) {
                        i10 = i18 + 1;
                        if (j() >= this.f10686l[i10]) {
                            break;
                        }
                        d();
                        String str = this.f10676b;
                        if (str == "FullName") {
                            this.f10689o[i18].f10694b = l((char) ((Integer) this.f10677c[0]).intValue());
                        } else if (str == "ROS") {
                            this.f10689o[i18].f10695c = true;
                        } else if (str == "Private") {
                            this.f10689o[i18].f10697e = ((Integer) this.f10677c[0]).intValue();
                            this.f10689o[i18].f10696d = ((Integer) this.f10677c[1]).intValue();
                        } else if (str == "charset") {
                            this.f10689o[i18].f10701i = ((Integer) this.f10677c[0]).intValue();
                        } else if (str == "Encoding") {
                            this.f10689o[i18].f10700h = ((Integer) this.f10677c[0]).intValue();
                            a(this.f10689o[i18].f10700h);
                        } else if (str == "CharStrings") {
                            break;
                        } else if (str == "FDArray") {
                            this.f10689o[i18].f10702j = ((Integer) this.f10677c[0]).intValue();
                        } else if (str == "FDSelect") {
                            this.f10689o[i18].f10703k = ((Integer) this.f10677c[0]).intValue();
                        } else if (str == "CharstringType") {
                            this.f10689o[i18].f10713u = ((Integer) this.f10677c[0]).intValue();
                        }
                    }
                    this.f10689o[i18].f10699g = ((Integer) this.f10677c[0]).intValue();
                    i19 = j();
                    c cVar2 = this.f10689o[i18];
                    cVar2.f10709q = f(cVar2.f10699g);
                }
                int i20 = this.f10689o[i18].f10696d;
                if (i20 >= 0) {
                    m(i20);
                    while (true) {
                        int j10 = j();
                        c cVar3 = this.f10689o[i18];
                        if (j10 >= cVar3.f10696d + cVar3.f10697e) {
                            break;
                        }
                        d();
                        if (this.f10676b == "Subrs") {
                            this.f10689o[i18].f10698f = ((Integer) this.f10677c[0]).intValue() + this.f10689o[i18].f10696d;
                        }
                    }
                }
                int i21 = this.f10689o[i18].f10702j;
                if (i21 >= 0) {
                    int[] f13 = f(i21);
                    c cVar4 = this.f10689o[i18];
                    cVar4.f10704l = new int[(f13.length - 1)];
                    cVar4.f10705m = new int[(f13.length - 1)];
                    int i22 = 0;
                    while (i22 < f13.length - 1) {
                        m(f13[i22]);
                        while (true) {
                            i11 = i22 + 1;
                            if (j() >= f13[i11]) {
                                break;
                            }
                            d();
                        }
                        if (this.f10676b == "Private") {
                            this.f10689o[i18].f10705m[i22] = ((Integer) this.f10677c[0]).intValue();
                            this.f10689o[i18].f10704l[i22] = ((Integer) this.f10677c[1]).intValue();
                        }
                        i22 = i11;
                    }
                }
                i18 = i10;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i10) {
        m(i10);
        c();
    }

    /* access modifiers changed from: package-private */
    public char b() {
        try {
            return this.f10679e.readChar();
        } catch (Exception e10) {
            throw new a8.j(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public char c() {
        try {
            return (char) (this.f10679e.readByte() & 255);
        } catch (Exception e10) {
            throw new a8.j(e10);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        r2.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00df, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r9.f10678d
            r3 = 0
            if (r1 >= r2) goto L_0x000e
            java.lang.Object[] r2 = r9.f10677c
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x0002
        L_0x000e:
            r9.f10678d = r0
            r9.f10676b = r3
            r1 = r0
        L_0x0013:
            if (r1 != 0) goto L_0x0115
            char r2 = r9.c()
            r3 = 29
            r4 = 1
            if (r2 != r3) goto L_0x0032
            int r2 = r9.g()
            java.lang.Object[] r3 = r9.f10677c
            int r5 = r9.f10678d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r5] = r2
        L_0x002c:
            int r2 = r9.f10678d
            int r2 = r2 + r4
            r9.f10678d = r2
            goto L_0x0013
        L_0x0032:
            r3 = 28
            if (r2 != r3) goto L_0x0045
            short r2 = r9.k()
            java.lang.Object[] r3 = r9.f10677c
            int r5 = r9.f10678d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r5] = r2
            goto L_0x002c
        L_0x0045:
            r3 = 32
            if (r2 < r3) goto L_0x005b
            r5 = 246(0xf6, float:3.45E-43)
            if (r2 > r5) goto L_0x005b
            int r2 = r2 + -139
            byte r2 = (byte) r2
            java.lang.Object[] r3 = r9.f10677c
            int r5 = r9.f10678d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r5] = r2
            goto L_0x002c
        L_0x005b:
            r5 = 247(0xf7, float:3.46E-43)
            if (r2 < r5) goto L_0x007a
            r5 = 250(0xfa, float:3.5E-43)
            if (r2 > r5) goto L_0x007a
            char r3 = r9.c()
            int r2 = r2 + -247
            int r2 = r2 * 256
            int r2 = r2 + r3
            int r2 = r2 + 108
            short r2 = (short) r2
            java.lang.Object[] r3 = r9.f10677c
            int r5 = r9.f10678d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r5] = r2
            goto L_0x002c
        L_0x007a:
            r5 = 251(0xfb, float:3.52E-43)
            if (r2 < r5) goto L_0x009a
            r5 = 254(0xfe, float:3.56E-43)
            if (r2 > r5) goto L_0x009a
            char r3 = r9.c()
            int r2 = r2 + -251
            int r2 = -r2
            int r2 = r2 * 256
            int r2 = r2 - r3
            int r2 = r2 + -108
            short r2 = (short) r2
            java.lang.Object[] r3 = r9.f10677c
            int r5 = r9.f10678d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r5] = r2
            goto L_0x002c
        L_0x009a:
            r5 = 30
            if (r2 != r5) goto L_0x00f9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            r3 = r0
            r5 = r3
            r6 = r5
            r7 = r6
        L_0x00a9:
            if (r3 != 0) goto L_0x00ed
            r8 = 2
            if (r5 != 0) goto L_0x00b3
            char r6 = r9.c()
            r5 = r8
        L_0x00b3:
            if (r5 != r4) goto L_0x00ba
            int r7 = r6 / 16
            int r5 = r5 + -1
            byte r5 = (byte) r5
        L_0x00ba:
            if (r5 != r8) goto L_0x00c1
            int r7 = r6 % 16
            int r5 = r5 + -1
            byte r5 = (byte) r5
        L_0x00c1:
            switch(r7) {
                case 10: goto L_0x00ea;
                case 11: goto L_0x00e7;
                case 12: goto L_0x00e4;
                case 13: goto L_0x00c4;
                case 14: goto L_0x00e1;
                case 15: goto L_0x00df;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            if (r7 < 0) goto L_0x00d2
            r8 = 9
            if (r7 > r8) goto L_0x00d2
            java.lang.String r8 = java.lang.String.valueOf(r7)
        L_0x00ce:
            r2.append(r8)
            goto L_0x00a9
        L_0x00d2:
            java.lang.String r3 = "<NIBBLE ERROR: "
            r2.append(r3)
            r2.append(r7)
            r3 = 62
            r2.append(r3)
        L_0x00df:
            r3 = r4
            goto L_0x00a9
        L_0x00e1:
            java.lang.String r8 = "-"
            goto L_0x00ce
        L_0x00e4:
            java.lang.String r8 = "E-"
            goto L_0x00ce
        L_0x00e7:
            java.lang.String r8 = "E"
            goto L_0x00ce
        L_0x00ea:
            java.lang.String r8 = "."
            goto L_0x00ce
        L_0x00ed:
            java.lang.Object[] r3 = r9.f10677c
            int r5 = r9.f10678d
            java.lang.String r2 = r2.toString()
            r3[r5] = r2
            goto L_0x002c
        L_0x00f9:
            r5 = 21
            if (r2 > r5) goto L_0x0013
            r1 = 12
            if (r2 == r1) goto L_0x0108
            java.lang.String[] r1 = f10673p
            r1 = r1[r2]
        L_0x0105:
            r9.f10676b = r1
            goto L_0x0112
        L_0x0108:
            java.lang.String[] r1 = f10673p
            char r2 = r9.c()
            int r2 = r2 + r3
            r1 = r1[r2]
            goto L_0x0105
        L_0x0112:
            r1 = r4
            goto L_0x0013
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.g.d():void");
    }

    /* access modifiers changed from: protected */
    public j e(int i10) {
        m(i10);
        char b10 = b();
        if (b10 == 0) {
            return new j(this.f10679e, i10, 2);
        }
        char c10 = c();
        m(i10 + 3 + (b10 * c10));
        return new j(this.f10679e, i10, ((b10 + 1) * c10) + 3 + (i(c10) - 1));
    }

    /* access modifiers changed from: package-private */
    public int[] f(int i10) {
        m(i10);
        char b10 = b();
        int i11 = b10 + 1;
        int[] iArr = new int[i11];
        if (b10 == 0) {
            iArr[0] = -1;
            return iArr;
        }
        char c10 = c();
        for (int i12 = 0; i12 <= b10; i12++) {
            iArr[i12] = (((i10 + 3) + (i11 * c10)) - 1) + i(c10);
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        try {
            return this.f10679e.readInt();
        } catch (Exception e10) {
            throw new a8.j(e10);
        }
    }

    public String[] h() {
        String[] strArr = new String[this.f10689o.length];
        int i10 = 0;
        while (true) {
            c[] cVarArr = this.f10689o;
            if (i10 >= cVarArr.length) {
                return strArr;
            }
            strArr[i10] = cVarArr[i10].f10693a;
            i10++;
        }
    }

    /* access modifiers changed from: package-private */
    public int i(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 256) + c();
        }
        return i11;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        try {
            return this.f10679e.c();
        } catch (Exception e10) {
            throw new a8.j(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public short k() {
        try {
            return this.f10679e.readShort();
        } catch (Exception e10) {
            throw new a8.j(e10);
        }
    }

    public String l(char c10) {
        String[] strArr = f10674q;
        if (c10 < strArr.length) {
            return strArr[c10];
        }
        if (c10 >= (strArr.length + this.f10687m.length) - 1) {
            return null;
        }
        int length = c10 - strArr.length;
        int j10 = j();
        m(this.f10687m[length]);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = this.f10687m[length]; i10 < this.f10687m[length + 1]; i10++) {
            stringBuffer.append(c());
        }
        m(j10);
        return stringBuffer.toString();
    }

    /* access modifiers changed from: package-private */
    public void m(int i10) {
        try {
            this.f10679e.j(i10);
        } catch (Exception e10) {
            throw new a8.j(e10);
        }
    }
}
