package e8;

import b8.a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class c1 extends i1 implements Comparable {
    public static final c1 A = new c1("AHx");
    public static final c1 A0 = new c1("CA");
    public static final c1 A1 = new c1("Crypt");
    public static final c1 A2 = new c1("Embedded");
    public static final c1 A3 = new c1("FontFile3");
    public static final c1 A4 = new c1("Image");
    public static final c1 A5 = new c1("Matrix");
    public static final c1 A6 = new c1("OFF");
    public static final c1 A7 = new c1("Presentation");
    public static final c1 A8 = new c1("Rotate");
    public static final c1 A9 = new c1("Symbol");
    public static final c1 Aa = new c1("Underline");
    public static final c1 Ab = new c1("XRef");
    public static final c1 B = new c1("AIS");
    public static final c1 B0 = new c1("ca");
    public static final c1 B1 = new c1("CS");
    public static final c1 B2 = new c1("EmbeddedFile");
    public static final c1 B3 = new c1("FontMatrix");
    public static final c1 B4 = new c1("ImageB");
    public static final c1 B5 = new c1("MacExpertEncoding");
    public static final c1 B6 = new c1("ON");
    public static final c1 B7 = new c1("PreserveRB");
    public static final c1 B8 = new c1("Rows");
    public static final c1 B9 = new c1("T");
    public static final c1 Ba = new c1("UR");
    public static final c1 Bb = new c1("XRefStm");
    public static final c1 C = new c1("AllPages");
    public static final c1 C0 = new c1("CalGray");
    public static final c1 C1 = new c1("CuePoint");
    public static final c1 C2 = new c1("EmbeddedFiles");
    public static final c1 C3 = new c1("FontName");
    public static final c1 C4 = new c1("ImageC");
    public static final c1 C5 = new c1("MacRomanEncoding");
    public static final c1 C6 = new c1("OneColumn");
    public static final c1 C7 = new c1("Prev");
    public static final c1 C8 = new c1("Ruby");
    public static final c1 C9 = new c1("TA");
    public static final c1 Ca = new c1("UR3");
    public static final c1 Cb = new c1("XYZ");
    public static final c1 D = new c1("Alt");
    public static final c1 D0 = new c1("CalRGB");
    public static final c1 D1 = new c1("CuePoints");
    public static final c1 D2 = new c1("Encode");
    public static final c1 D3 = new c1("Foreground");
    public static final c1 D4 = new c1("ImageI");
    public static final c1 D5 = new c1("Marked");
    public static final c1 D6 = new c1("Open");
    public static final c1 D7 = new c1("PrevPage");
    public static final c1 D8 = new c1("RunLengthDecode");
    public static final c1 D9 = new c1("Table");
    public static final c1 Da = new c1("URI");
    public static final c1 Db = new c1("YStep");
    public static final c1 E = new c1("Alternate");
    public static final c1 E0 = new c1("CapHeight");
    public static final c1 E1 = new c1("D");
    public static final c1 E2 = new c1("EncodedByteAlign");
    public static final c1 E3 = new c1("Form");
    public static final c1 E4 = new c1("ImageMask");
    public static final c1 E5 = new c1("MarkInfo");
    public static final c1 E6 = new c1("OpenAction");
    public static final c1 E7 = new c1("Print");
    public static final c1 E8 = new c1("RV");
    public static final c1 E9 = new c1("Tabs");
    public static final c1 Ea = new c1("URL");
    public static final c1 Eb = new c1("ZaDb");
    public static final c1 F = new c1("And");
    public static final c1 F0 = new c1("Caption");
    public static final c1 F1 = new c1("DA");
    public static final c1 F2 = new c1("Encoding");
    public static final c1 F3 = new c1("FormType");
    public static final c1 F4 = new c1("Ind");
    public static final c1 F5 = new c1("Mask");
    public static final c1 F6 = new c1("OP");
    public static final c1 F7 = new c1("PrintArea");
    public static final c1 F8 = new c1("S");
    public static final c1 F9 = new c1("TBody");
    public static final c1 Fa = new c1("Usage");
    public static final c1 Fb = new c1("ZapfDingbats");
    public static final c1 G = new c1("Animation");
    public static final c1 G0 = new c1("Catalog");
    public static final c1 G1 = new c1("Data");
    public static final c1 G2 = new c1("Encrypt");
    public static final c1 G3 = new c1("Formula");
    public static final c1 G4 = new c1("Index");
    public static final c1 G5 = new c1("max");
    public static final c1 G6 = new c1("op");
    public static final c1 G7 = new c1("PrintClip");
    public static final c1 G8 = new c1("Saturation");
    public static final c1 G9 = new c1("TD");
    public static final c1 Ga = new c1("UseAttachments");
    public static final c1 Gb = new c1("Zoom");
    public static final c1 H = new c1("Annot");
    public static final c1 H0 = new c1("Category");
    public static final c1 H1 = new c1("DC");
    public static final c1 H2 = new c1("EncryptMetadata");
    public static final c1 H3 = new c1("FreeText");
    public static final c1 H4 = new c1("Indexed");
    public static final c1 H5 = new c1("Max");
    public static final c1 H6 = new c1("OPM");
    public static final c1 H7 = new c1("PrintPageRange");
    public static final c1 H8 = new c1("Schema");
    public static final c1 H9 = new c1("Text");
    public static final c1 Ha = new c1("UseNone");
    public static Map Hb;
    public static final c1 I = new c1("Annots");
    public static final c1 I0 = new c1("CCITTFaxDecode");
    public static final c1 I1 = new c1("DCTDecode");
    public static final c1 I2 = new c1("EndOfBlock");
    public static final c1 I3 = new c1("FRM");
    public static final c1 I4 = new c1("Info");
    public static final c1 I5 = new c1("MaxLen");
    public static final c1 I6 = new c1("Opt");
    public static final c1 I7 = new c1("PrintScaling");
    public static final c1 I8 = new c1("Screen");
    public static final c1 I9 = new c1("TFoot");
    public static final c1 Ia = new c1("UseOC");
    public static final c1 J = new c1("AntiAlias");
    public static final c1 J0 = new c1("Center");
    public static final c1 J1 = new c1("Deactivation");
    public static final c1 J2 = new c1("EndOfLine");
    public static final c1 J3 = new c1("FS");
    public static final c1 J4 = new c1("Ink");
    public static final c1 J5 = new c1("MediaBox");
    public static final c1 J6 = new c1("Or");
    public static final c1 J7 = new c1("PrintState");
    public static final c1 J8 = new c1("Scripts");
    public static final c1 J9 = new c1("TH");
    public static final c1 Ja = new c1("UseOutlines");
    public static final c1 K = new c1("AP");
    public static final c1 K0 = new c1("CenterWindow");
    public static final c1 K1 = new c1("Decode");
    public static final c1 K2 = new c1("Extend");
    public static final c1 K3 = new c1("FT");
    public static final c1 K4 = new c1("InkList");
    public static final c1 K5 = new c1("MCID");
    public static final c1 K6 = new c1("Order");
    public static final c1 K7 = new c1("Private");
    public static final c1 K8 = new c1("Sect");
    public static final c1 K9 = new c1("THead");
    public static final c1 Ka = new c1("User");
    public static final c1 L = new c1("AppDefault");
    public static final c1 L0 = new c1("Cert");
    public static final c1 L1 = new c1("DecodeParms");
    public static final c1 L2 = new c1("Extensions");
    public static final c1 L3 = new c1("FullScreen");
    public static final c1 L4 = new c1("Instances");
    public static final c1 L5 = new c1("MCR");
    public static final c1 L6 = new c1("Ordering");
    public static final c1 L7 = new c1("ProcSet");
    public static final c1 L8 = new c1("Separation");
    public static final c1 L9 = new c1("Thumb");
    public static final c1 La = new c1("UserProperties");
    public static final c1 M = new c1("Art");
    public static final c1 M0 = new c1("CF");
    public static final c1 M1 = new c1("Default");
    public static final c1 M2 = new c1("ExtensionLevel");
    public static final c1 M3 = new c1("Function");
    public static final c1 M4 = new c1("ImportData");
    public static final c1 M5 = new c1("Metadata");
    public static final c1 M6 = new c1("Org");
    public static final c1 M7 = new c1("Producer");
    public static final c1 M8 = new c1("SetOCGState");
    public static final c1 M9 = new c1("Threads");
    public static final c1 Ma = new c1("UserUnit");
    public static final c1 N = new c1("ArtBox");
    public static final c1 N0 = new c1("CFM");
    public static final c1 N1 = new c1("DefaultCryptFilter");
    public static final c1 N2 = new c1("ExtGState");
    public static final c1 N3 = new c1("Functions");
    public static final c1 N4 = new c1("Intent");
    public static final c1 N5 = new c1("min");
    public static final c1 N6 = new c1("Oscillating");
    public static final c1 N7 = new c1("Properties");
    public static final c1 N8 = new c1("Settings");
    public static final c1 N9 = new c1("TI");
    public static final c1 Na = new c1("UseThumbs");
    public static final c1 O = new c1("Ascent");
    public static final c1 O0 = new c1("Ch");
    public static final c1 O1 = new c1("DefaultCMYK");
    public static final c1 O2 = new c1("Export");
    public static final c1 O3 = new c1("FunctionType");
    public static final c1 O4 = new c1("Interpolate");
    public static final c1 O5 = new c1("Min");
    public static final c1 O6 = new c1("Outlines");
    public static final c1 O7 = new c1("PS");
    public static final c1 O8 = new c1("Shading");
    public static final c1 O9 = new c1("Time");
    public static final c1 Oa = new c1("V");
    public static final c1 P = new c1("AS");
    public static final c1 P0 = new c1("CharProcs");
    public static final c1 P1 = new c1("DefaultGray");
    public static final c1 P2 = new c1("ExportState");
    public static final c1 P3 = new c1("Gamma");
    public static final c1 P4 = new c1("IsMap");
    public static final c1 P5 = new c1("MK");
    public static final c1 P6 = new c1("OutputCondition");
    public static final c1 P7 = new c1("Adobe.PubSec");
    public static final c1 P8 = new c1("ShadingType");
    public static final c1 P9 = new c1("TilingType");
    public static final c1 Pa = new c1("V2");
    public static final c1 Q = new c1("ASCII85Decode");
    public static final c1 Q0 = new c1("CheckSum");
    public static final c1 Q1 = new c1("DefaultRGB");
    public static final c1 Q2 = new c1("Event");
    public static final c1 Q3 = new c1("GBK");
    public static final c1 Q4 = new c1("IRT");
    public static final c1 Q5 = new c1("MMType1");
    public static final c1 Q6 = new c1("OutputConditionIdentifier");
    public static final c1 Q7 = new c1("PV");
    public static final c1 Q8 = new c1("Shift-JIS");
    public static final c1 Q9 = new c1("Times-Roman");
    public static final c1 Qa = new c1("VAlign");
    public static final c1 R = new c1("ASCIIHexDecode");
    public static final c1 R0 = new c1("CI");
    public static final c1 R1 = new c1("Desc");
    public static final c1 R2 = new c1("F");
    public static final c1 R3 = new c1("Glitter");
    public static final c1 R4 = new c1("ItalicAngle");
    public static final c1 R5 = new c1("ModDate");
    public static final c1 R6 = new c1("OutputIntent");
    public static final c1 R7 = new c1("Q");
    public static final c1 R8 = new c1("Sig");
    public static final c1 R9 = new c1("Times-Bold");
    public static final c1 Ra = new c1("VE");
    public static final c1 S = new c1("Asset");
    public static final c1 S0 = new c1("CIDFontType0");
    public static final c1 S1 = new c1("DescendantFonts");
    public static final c1 S2 = new c1("Far");
    public static final c1 S3 = new c1("GoTo");
    public static final c1 S4 = new c1("ITXT");
    public static final c1 S5 = new c1("N");
    public static final c1 S6 = new c1("OutputIntents");
    public static final c1 S7 = new c1("QuadPoints");
    public static final c1 S8 = new c1("SigFlags");
    public static final c1 S9 = new c1("Times-Italic");
    public static final c1 Sa = new c1("VeriSign.PPKVS");
    public static final c1 T = new c1("Assets");
    public static final c1 T0 = new c1("CIDFontType2");
    public static final c1 T1 = new c1("Descent");
    public static final c1 T2 = new c1("FB");
    public static final c1 T3 = new c1("GoToE");
    public static final c1 T4 = new c1("IX");
    public static final c1 T5 = new c1("n0");
    public static final c1 T6 = new c1("P");
    public static final c1 T7 = new c1("Quote");
    public static final c1 T8 = new c1("SigRef");
    public static final c1 T9 = new c1("Times-BoldItalic");
    public static final c1 Ta = new c1("Version");
    public static final c1 U = new c1("AuthEvent");
    public static final c1 U0 = new c1("CIDSet");
    public static final c1 U1 = new c1("Dest");
    public static final c1 U2 = new c1("FDecodeParms");
    public static final c1 U3 = new c1("GoToR");
    public static final c1 U4 = new c1("JavaScript");
    public static final c1 U5 = new c1("n1");
    public static final c1 U6 = new c1("Page");
    public static final c1 U7 = new c1("R");
    public static final c1 U8 = new c1("Simplex");
    public static final c1 U9 = new c1("Title");
    public static final c1 Ua = new c1("Vertices");
    public static final c1 V = new c1("Author");
    public static final c1 V0 = new c1("CIDSystemInfo");
    public static final c1 V1 = new c1("DestOutputProfile");
    public static final c1 V2 = new c1("FDF");
    public static final c1 V3 = new c1("Group");
    public static final c1 V4 = new c1("JBIG2Decode");
    public static final c1 V5 = new c1("n2");
    public static final c1 V6 = new c1("PageElement");
    public static final c1 V7 = new c1("R2L");
    public static final c1 V8 = new c1("SinglePage");
    public static final c1 V9 = new c1("TK");
    public static final c1 Va = new c1("Video");
    public static final c1 W = new c1("B");
    public static final c1 W0 = new c1("CIDToGIDMap");
    public static final c1 W1 = new c1("Dests");
    public static final c1 W2 = new c1("Ff");
    public static final c1 W3 = new c1("GTS_PDFA1");
    public static final c1 W4 = new c1("JBIG2Globals");
    public static final c1 W5 = new c1("n3");
    public static final c1 W6 = new c1("PageLabels");
    public static final c1 W7 = new c1("Range");
    public static final c1 W8 = new c1("Size");
    public static final c1 W9 = new c1("TM");
    public static final c1 Wa = new c1("View");
    public static final c1 X = new c1("Background");
    public static final c1 X0 = new c1("Circle");
    public static final c1 X1 = new c1("DeviceGray");
    public static final c1 X2 = new c1("FFilter");
    public static final c1 X3 = new c1("GTS_PDFX");
    public static final c1 X4 = new c1("JPXDecode");
    public static final c1 X5 = new c1("n4");
    public static final c1 X6 = new c1("PageLayout");
    public static final c1 X7 = new c1("RC");
    public static final c1 X8 = new c1("SMask");
    public static final c1 X9 = new c1("TOC");
    public static final c1 Xa = new c1("Views");
    public static final c1 Y = new c1("BaseEncoding");
    public static final c1 Y0 = new c1("CMD");
    public static final c1 Y1 = new c1("DeviceRGB");
    public static final c1 Y2 = new c1("FG");
    public static final c1 Y3 = new c1("GTS_PDFXVersion");
    public static final c1 Y4 = new c1("JS");
    public static final c1 Y5 = new c1("Name");
    public static final c1 Y6 = new c1("PageMode");
    public static final c1 Y7 = new c1("RBGroups");
    public static final c1 Y8 = new c1("Sort");
    public static final c1 Y9 = new c1("TOCI");
    public static final c1 Ya = new c1("ViewArea");
    public static final c1 Z = new c1("BaseFont");
    public static final c1 Z0 = new c1("CO");
    public static final c1 Z1 = new c1("DeviceCMYK");
    public static final c1 Z2 = new c1("Fields");
    public static final c1 Z3 = new c1("H");
    public static final c1 Z4 = new c1("K");
    public static final c1 Z5 = new c1("Named");
    public static final c1 Z6 = new c1("Pages");
    public static final c1 Z7 = new c1("Reason");
    public static final c1 Z8 = new c1("Sound");
    public static final c1 Z9 = new c1("Toggle");
    public static final c1 Za = new c1("ViewClip");

    /* renamed from: a0  reason: collision with root package name */
    public static final c1 f10203a0 = new c1("BaseVersion");

    /* renamed from: a1  reason: collision with root package name */
    public static final c1 f10204a1 = new c1("Code");

    /* renamed from: a2  reason: collision with root package name */
    public static final c1 f10205a2 = new c1("Di");

    /* renamed from: a3  reason: collision with root package name */
    public static final c1 f10206a3 = new c1("Figure");

    /* renamed from: a4  reason: collision with root package name */
    public static final c1 f10207a4 = new c1("H1");

    /* renamed from: a5  reason: collision with root package name */
    public static final c1 f10208a5 = new c1("Keywords");

    /* renamed from: a6  reason: collision with root package name */
    public static final c1 f10209a6 = new c1("Names");

    /* renamed from: a7  reason: collision with root package name */
    public static final c1 f10210a7 = new c1("PaintType");

    /* renamed from: a8  reason: collision with root package name */
    public static final c1 f10211a8 = new c1("Recipients");

    /* renamed from: a9  reason: collision with root package name */
    public static final c1 f10212a9 = new c1("Span");

    /* renamed from: aa  reason: collision with root package name */
    public static final c1 f10213aa = new c1("Toolbar");

    /* renamed from: ab  reason: collision with root package name */
    public static final c1 f10214ab = new c1("ViewerPreferences");

    /* renamed from: b0  reason: collision with root package name */
    public static final c1 f10215b0 = new c1("BBox");

    /* renamed from: b1  reason: collision with root package name */
    public static final c1 f10216b1 = new c1("Colors");

    /* renamed from: b2  reason: collision with root package name */
    public static final c1 f10217b2 = new c1("Differences");

    /* renamed from: b3  reason: collision with root package name */
    public static final c1 f10218b3 = new c1("FileAttachment");

    /* renamed from: b4  reason: collision with root package name */
    public static final c1 f10219b4 = new c1("H2");

    /* renamed from: b5  reason: collision with root package name */
    public static final c1 f10220b5 = new c1("Kids");

    /* renamed from: b6  reason: collision with root package name */
    public static final c1 f10221b6 = new c1("Navigation");

    /* renamed from: b7  reason: collision with root package name */
    public static final c1 f10222b7 = new c1("Panose");

    /* renamed from: b8  reason: collision with root package name */
    public static final c1 f10223b8 = new c1("Rect");

    /* renamed from: b9  reason: collision with root package name */
    public static final c1 f10224b9 = new c1("Speed");

    /* renamed from: ba  reason: collision with root package name */
    public static final c1 f10225ba = new c1("ToUnicode");

    /* renamed from: bb  reason: collision with root package name */
    public static final c1 f10226bb = new c1("ViewState");

    /* renamed from: c0  reason: collision with root package name */
    public static final c1 f10227c0 = new c1("BC");

    /* renamed from: c1  reason: collision with root package name */
    public static final c1 f10228c1 = new c1("ColorSpace");

    /* renamed from: c2  reason: collision with root package name */
    public static final c1 f10229c2 = new c1("Dissolve");

    /* renamed from: c3  reason: collision with root package name */
    public static final c1 f10230c3 = new c1("Filespec");

    /* renamed from: c4  reason: collision with root package name */
    public static final c1 f10231c4 = new c1("H3");

    /* renamed from: c5  reason: collision with root package name */
    public static final c1 f10232c5 = new c1("L");

    /* renamed from: c6  reason: collision with root package name */
    public static final c1 f10233c6 = new c1("NavigationPane");

    /* renamed from: c7  reason: collision with root package name */
    public static final c1 f10234c7 = new c1("Params");

    /* renamed from: c8  reason: collision with root package name */
    public static final c1 f10235c8 = new c1("Reference");

    /* renamed from: c9  reason: collision with root package name */
    public static final c1 f10236c9 = new c1("Split");

    /* renamed from: ca  reason: collision with root package name */
    public static final c1 f10237ca = new c1("TP");

    /* renamed from: cb  reason: collision with root package name */
    public static final c1 f10238cb = new c1("VisiblePages");

    /* renamed from: d0  reason: collision with root package name */
    public static final c1 f10239d0 = new c1("BG");

    /* renamed from: d1  reason: collision with root package name */
    public static final c1 f10240d1 = new c1("Collection");

    /* renamed from: d2  reason: collision with root package name */
    public static final c1 f10241d2 = new c1("Direction");

    /* renamed from: d3  reason: collision with root package name */
    public static final c1 f10242d3 = new c1("Filter");

    /* renamed from: d4  reason: collision with root package name */
    public static final c1 f10243d4 = new c1("H4");

    /* renamed from: d5  reason: collision with root package name */
    public static final c1 f10244d5 = new c1("L2R");

    /* renamed from: d6  reason: collision with root package name */
    public static final c1 f10245d6 = new c1("Near");

    /* renamed from: d7  reason: collision with root package name */
    public static final c1 f10246d7 = new c1("Parent");

    /* renamed from: d8  reason: collision with root package name */
    public static final c1 f10247d8 = new c1("Registry");

    /* renamed from: d9  reason: collision with root package name */
    public static final c1 f10248d9 = new c1("Square");

    /* renamed from: da  reason: collision with root package name */
    public static final c1 f10249da = new c1("TR");

    /* renamed from: db  reason: collision with root package name */
    public static final c1 f10250db = new c1("VOffset");

    /* renamed from: e0  reason: collision with root package name */
    public static final c1 f10251e0 = new c1("BibEntry");

    /* renamed from: e1  reason: collision with root package name */
    public static final c1 f10252e1 = new c1("CollectionField");

    /* renamed from: e2  reason: collision with root package name */
    public static final c1 f10253e2 = new c1("DisplayDocTitle");

    /* renamed from: e3  reason: collision with root package name */
    public static final c1 f10254e3 = new c1("First");

    /* renamed from: e4  reason: collision with root package name */
    public static final c1 f10255e4 = new c1("H5");

    /* renamed from: e5  reason: collision with root package name */
    public static final c1 f10256e5 = new c1("Lang");

    /* renamed from: e6  reason: collision with root package name */
    public static final c1 f10257e6 = new c1("NeedAppearances");

    /* renamed from: e7  reason: collision with root package name */
    public static final c1 f10258e7 = new c1("ParentTree");

    /* renamed from: e8  reason: collision with root package name */
    public static final c1 f10259e8 = new c1("RegistryName");

    /* renamed from: e9  reason: collision with root package name */
    public static final c1 f10260e9 = new c1("Squiggly");

    /* renamed from: ea  reason: collision with root package name */
    public static final c1 f10261ea = new c1("Trans");

    /* renamed from: eb  reason: collision with root package name */
    public static final c1 f10262eb = new c1("W");

    /* renamed from: f0  reason: collision with root package name */
    public static final c1 f10263f0 = new c1("BigFive");

    /* renamed from: f1  reason: collision with root package name */
    public static final c1 f10264f1 = new c1("CollectionItem");

    /* renamed from: f2  reason: collision with root package name */
    public static final c1 f10265f2 = new c1("Div");

    /* renamed from: f3  reason: collision with root package name */
    public static final c1 f10266f3 = new c1("FirstChar");

    /* renamed from: f4  reason: collision with root package name */
    public static final c1 f10267f4 = new c1("H6");

    /* renamed from: f5  reason: collision with root package name */
    public static final c1 f10268f5 = new c1("Language");

    /* renamed from: f6  reason: collision with root package name */
    public static final c1 f10269f6 = new c1("NewWindow");

    /* renamed from: f7  reason: collision with root package name */
    public static final c1 f10270f7 = new c1("ParentTreeNextKey");

    /* renamed from: f8  reason: collision with root package name */
    public static final c1 f10271f8 = new c1("RelativeColorimetric");

    /* renamed from: f9  reason: collision with root package name */
    public static final c1 f10272f9 = new c1("St");

    /* renamed from: fa  reason: collision with root package name */
    public static final c1 f10273fa = new c1("TransformParams");

    /* renamed from: fb  reason: collision with root package name */
    public static final c1 f10274fb = new c1("W2");

    /* renamed from: g0  reason: collision with root package name */
    public static final c1 f10275g0 = new c1("Binding");

    /* renamed from: g1  reason: collision with root package name */
    public static final c1 f10276g1 = new c1("CollectionSchema");

    /* renamed from: g2  reason: collision with root package name */
    public static final c1 f10277g2 = new c1("DL");

    /* renamed from: g3  reason: collision with root package name */
    public static final c1 f10278g3 = new c1("FirstPage");

    /* renamed from: g4  reason: collision with root package name */
    public static final c1 f10279g4 = new c1("HAlign");

    /* renamed from: g5  reason: collision with root package name */
    public static final c1 f10280g5 = new c1("Last");

    /* renamed from: g6  reason: collision with root package name */
    public static final c1 f10281g6 = new c1("Next");

    /* renamed from: g7  reason: collision with root package name */
    public static final c1 f10282g7 = new c1("Part");

    /* renamed from: g8  reason: collision with root package name */
    public static final c1 f10283g8 = new c1("Rendition");

    /* renamed from: g9  reason: collision with root package name */
    public static final c1 f10284g9 = new c1("Stamp");

    /* renamed from: ga  reason: collision with root package name */
    public static final c1 f10285ga = new c1("TransformMethod");

    /* renamed from: gb  reason: collision with root package name */
    public static final c1 f10286gb = new c1("Warichu");

    /* renamed from: h  reason: collision with root package name */
    public static final c1 f10287h = new c1("3D");

    /* renamed from: h0  reason: collision with root package name */
    public static final c1 f10288h0 = new c1("BindingMaterialName");

    /* renamed from: h1  reason: collision with root package name */
    public static final c1 f10289h1 = new c1("CollectionSort");

    /* renamed from: h2  reason: collision with root package name */
    public static final c1 f10290h2 = new c1("Dm");

    /* renamed from: h3  reason: collision with root package name */
    public static final c1 f10291h3 = new c1("Fit");

    /* renamed from: h4  reason: collision with root package name */
    public static final c1 f10292h4 = new c1("Height");

    /* renamed from: h5  reason: collision with root package name */
    public static final c1 f10293h5 = new c1("LastChar");

    /* renamed from: h6  reason: collision with root package name */
    public static final c1 f10294h6 = new c1("NextPage");

    /* renamed from: h7  reason: collision with root package name */
    public static final c1 f10295h7 = new c1("PassContextClick");

    /* renamed from: h8  reason: collision with root package name */
    public static final c1 f10296h8 = new c1("ResetForm");

    /* renamed from: h9  reason: collision with root package name */
    public static final c1 f10297h9 = new c1("Standard");

    /* renamed from: ha  reason: collision with root package name */
    public static final c1 f10298ha = new c1("Transparency");

    /* renamed from: hb  reason: collision with root package name */
    public static final c1 f10299hb = new c1("WC");

    /* renamed from: i  reason: collision with root package name */
    public static final c1 f10300i = new c1("A");

    /* renamed from: i0  reason: collision with root package name */
    public static final c1 f10301i0 = new c1("BitsPerComponent");

    /* renamed from: i1  reason: collision with root package name */
    public static final c1 f10302i1 = new c1("CollectionSubitem");

    /* renamed from: i2  reason: collision with root package name */
    public static final c1 f10303i2 = new c1("DocMDP");

    /* renamed from: i3  reason: collision with root package name */
    public static final c1 f10304i3 = new c1("FitH");

    /* renamed from: i4  reason: collision with root package name */
    public static final c1 f10305i4 = new c1("Helv");

    /* renamed from: i5  reason: collision with root package name */
    public static final c1 f10306i5 = new c1("LastPage");

    /* renamed from: i6  reason: collision with root package name */
    public static final c1 f10307i6 = new c1("NM");

    /* renamed from: i7  reason: collision with root package name */
    public static final c1 f10308i7 = new c1("Pattern");

    /* renamed from: i8  reason: collision with root package name */
    public static final c1 f10309i8 = new c1("Resources");

    /* renamed from: i9  reason: collision with root package name */
    public static final c1 f10310i9 = new c1("State");

    /* renamed from: ia  reason: collision with root package name */
    public static final c1 f10311ia = new c1("Transparent");

    /* renamed from: ib  reason: collision with root package name */
    public static final c1 f10312ib = new c1("Widget");

    /* renamed from: j  reason: collision with root package name */
    public static final c1 f10313j = new c1("A85");

    /* renamed from: j0  reason: collision with root package name */
    public static final c1 f10314j0 = new c1("BitsPerSample");

    /* renamed from: j1  reason: collision with root package name */
    public static final c1 f10315j1 = new c1("Columns");

    /* renamed from: j2  reason: collision with root package name */
    public static final c1 f10316j2 = new c1("DocOpen");

    /* renamed from: j3  reason: collision with root package name */
    public static final c1 f10317j3 = new c1("FitV");

    /* renamed from: j4  reason: collision with root package name */
    public static final c1 f10318j4 = new c1("Helvetica");

    /* renamed from: j5  reason: collision with root package name */
    public static final c1 f10319j5 = new c1("Launch");

    /* renamed from: j6  reason: collision with root package name */
    public static final c1 f10320j6 = new c1("None");

    /* renamed from: j7  reason: collision with root package name */
    public static final c1 f10321j7 = new c1("PatternType");

    /* renamed from: j8  reason: collision with root package name */
    public static final c1 f10322j8 = new c1("RI");

    /* renamed from: j9  reason: collision with root package name */
    public static final c1 f10323j9 = new c1("StdCF");

    /* renamed from: ja  reason: collision with root package name */
    public static final c1 f10324ja = new c1("Trapped");

    /* renamed from: jb  reason: collision with root package name */
    public static final c1 f10325jb = new c1("Width");

    /* renamed from: k  reason: collision with root package name */
    public static final c1 f10326k = new c1("AA");

    /* renamed from: k0  reason: collision with root package name */
    public static final c1 f10327k0 = new c1("Bl");

    /* renamed from: k1  reason: collision with root package name */
    public static final c1 f10328k1 = new c1("Condition");

    /* renamed from: k2  reason: collision with root package name */
    public static final c1 f10329k2 = new c1("Document");

    /* renamed from: k3  reason: collision with root package name */
    public static final c1 f10330k3 = new c1("FitR");

    /* renamed from: k4  reason: collision with root package name */
    public static final c1 f10331k4 = new c1("Helvetica-Bold");

    /* renamed from: k5  reason: collision with root package name */
    public static final c1 f10332k5 = new c1("Lbl");

    /* renamed from: k6  reason: collision with root package name */
    public static final c1 f10333k6 = new c1("NonFullScreenPageMode");

    /* renamed from: k7  reason: collision with root package name */
    public static final c1 f10334k7 = new c1("PC");

    /* renamed from: k8  reason: collision with root package name */
    public static final c1 f10335k8 = new c1("RichMedia");

    /* renamed from: k9  reason: collision with root package name */
    public static final c1 f10336k9 = new c1("StemV");

    /* renamed from: ka  reason: collision with root package name */
    public static final c1 f10337ka = new c1("TrimBox");

    /* renamed from: kb  reason: collision with root package name */
    public static final c1 f10338kb = new c1("Widths");

    /* renamed from: l  reason: collision with root package name */
    public static final c1 f10339l = new c1("AbsoluteColorimetric");

    /* renamed from: l0  reason: collision with root package name */
    public static final c1 f10340l0 = new c1("BlackIs1");

    /* renamed from: l1  reason: collision with root package name */
    public static final c1 f10341l1 = new c1("Configuration");

    /* renamed from: l2  reason: collision with root package name */
    public static final c1 f10342l2 = new c1("Domain");

    /* renamed from: l3  reason: collision with root package name */
    public static final c1 f10343l3 = new c1("FitB");

    /* renamed from: l4  reason: collision with root package name */
    public static final c1 f10344l4 = new c1("Helvetica-Oblique");

    /* renamed from: l5  reason: collision with root package name */
    public static final c1 f10345l5 = new c1("LBody");

    /* renamed from: l6  reason: collision with root package name */
    public static final c1 f10346l6 = new c1("NonStruct");

    /* renamed from: l7  reason: collision with root package name */
    public static final c1 f10347l7 = new c1("PDF");

    /* renamed from: l8  reason: collision with root package name */
    public static final c1 f10348l8 = new c1("RichMediaActivation");

    /* renamed from: l9  reason: collision with root package name */
    public static final c1 f10349l9 = new c1("StmF");

    /* renamed from: la  reason: collision with root package name */
    public static final c1 f10350la = new c1("TrueType");

    /* renamed from: lb  reason: collision with root package name */
    public static final c1 f10351lb = new c1("Win");

    /* renamed from: m  reason: collision with root package name */
    public static final c1 f10352m = new c1("AC");

    /* renamed from: m0  reason: collision with root package name */
    public static final c1 f10353m0 = new c1("BlackPoint");

    /* renamed from: m1  reason: collision with root package name */
    public static final c1 f10354m1 = new c1("Configurations");

    /* renamed from: m2  reason: collision with root package name */
    public static final c1 f10355m2 = new c1("DP");

    /* renamed from: m3  reason: collision with root package name */
    public static final c1 f10356m3 = new c1("FitBH");

    /* renamed from: m4  reason: collision with root package name */
    public static final c1 f10357m4 = new c1("Helvetica-BoldOblique");

    /* renamed from: m5  reason: collision with root package name */
    public static final c1 f10358m5 = new c1("Length");

    /* renamed from: m6  reason: collision with root package name */
    public static final c1 f10359m6 = new c1("Not");

    /* renamed from: m7  reason: collision with root package name */
    public static final c1 f10360m7 = new c1("PDFDocEncoding");

    /* renamed from: m8  reason: collision with root package name */
    public static final c1 f10361m8 = new c1("RichMediaAnimation");

    /* renamed from: m9  reason: collision with root package name */
    public static final c1 f10362m9 = new c1("StrF");

    /* renamed from: ma  reason: collision with root package name */
    public static final c1 f10363ma = new c1("Ttl");

    /* renamed from: mb  reason: collision with root package name */
    public static final c1 f10364mb = new c1("WinAnsiEncoding");

    /* renamed from: n  reason: collision with root package name */
    public static final c1 f10365n = new c1("AcroForm");

    /* renamed from: n0  reason: collision with root package name */
    public static final c1 f10366n0 = new c1("BlockQuote");

    /* renamed from: n1  reason: collision with root package name */
    public static final c1 f10367n1 = new c1("ContactInfo");

    /* renamed from: n2  reason: collision with root package name */
    public static final c1 f10368n2 = new c1("DR");

    /* renamed from: n3  reason: collision with root package name */
    public static final c1 f10369n3 = new c1("FitBV");

    /* renamed from: n4  reason: collision with root package name */
    public static final c1 f10370n4 = new c1("HF");

    /* renamed from: n5  reason: collision with root package name */
    public static final c1 f10371n5 = new c1("Length1");

    /* renamed from: n6  reason: collision with root package name */
    public static final c1 f10372n6 = new c1("Note");

    /* renamed from: n7  reason: collision with root package name */
    public static final c1 f10373n7 = new c1("Perceptual");

    /* renamed from: n8  reason: collision with root package name */
    public static final c1 f10374n8 = new c1("RichMediaCommand");

    /* renamed from: n9  reason: collision with root package name */
    public static final c1 f10375n9 = new c1("StrikeOut");

    /* renamed from: na  reason: collision with root package name */
    public static final c1 f10376na = new c1("TU");

    /* renamed from: nb  reason: collision with root package name */
    public static final c1 f10377nb = new c1("Window");

    /* renamed from: o  reason: collision with root package name */
    public static final c1 f10378o = new c1("Action");

    /* renamed from: o0  reason: collision with root package name */
    public static final c1 f10379o0 = new c1("BleedBox");

    /* renamed from: o1  reason: collision with root package name */
    public static final c1 f10380o1 = new c1("Content");

    /* renamed from: o2  reason: collision with root package name */
    public static final c1 f10381o2 = new c1("DS");

    /* renamed from: o3  reason: collision with root package name */
    public static final c1 f10382o3 = new c1("FitWindow");

    /* renamed from: o4  reason: collision with root package name */
    public static final c1 f10383o4 = new c1("Hid");

    /* renamed from: o5  reason: collision with root package name */
    public static final c1 f10384o5 = new c1("LI");

    /* renamed from: o6  reason: collision with root package name */
    public static final c1 f10385o6 = new c1("NumCopies");

    /* renamed from: o7  reason: collision with root package name */
    public static final c1 f10386o7 = new c1("Perms");

    /* renamed from: o8  reason: collision with root package name */
    public static final c1 f10387o8 = new c1("RichMediaConfiguration");

    /* renamed from: o9  reason: collision with root package name */
    public static final c1 f10388o9 = new c1("StructElem");

    /* renamed from: oa  reason: collision with root package name */
    public static final c1 f10389oa = new c1("TwoColumnLeft");

    /* renamed from: ob  reason: collision with root package name */
    public static final c1 f10390ob = new c1("Windowed");

    /* renamed from: p  reason: collision with root package name */
    public static final c1 f10391p = new c1("Activation");

    /* renamed from: p0  reason: collision with root package name */
    public static final c1 f10392p0 = new c1("Blinds");

    /* renamed from: p1  reason: collision with root package name */
    public static final c1 f10393p1 = new c1("Contents");

    /* renamed from: p2  reason: collision with root package name */
    public static final c1 f10394p2 = new c1("Dur");

    /* renamed from: p3  reason: collision with root package name */
    public static final c1 f10395p3 = new c1("Fl");

    /* renamed from: p4  reason: collision with root package name */
    public static final c1 f10396p4 = new c1("Hide");

    /* renamed from: p5  reason: collision with root package name */
    public static final c1 f10397p5 = new c1("Limits");

    /* renamed from: p6  reason: collision with root package name */
    public static final c1 f10398p6 = new c1("Nums");

    /* renamed from: p7  reason: collision with root package name */
    public static final c1 f10399p7 = new c1("Pg");

    /* renamed from: p8  reason: collision with root package name */
    public static final c1 f10400p8 = new c1("RichMediaContent");

    /* renamed from: p9  reason: collision with root package name */
    public static final c1 f10401p9 = new c1("StructParent");

    /* renamed from: pa  reason: collision with root package name */
    public static final c1 f10402pa = new c1("TwoColumnRight");

    /* renamed from: pb  reason: collision with root package name */
    public static final c1 f10403pb = new c1("Wipe");

    /* renamed from: q  reason: collision with root package name */
    public static final c1 f10404q = new c1("ADBE");

    /* renamed from: q0  reason: collision with root package name */
    public static final c1 f10405q0 = new c1("BM");

    /* renamed from: q1  reason: collision with root package name */
    public static final c1 f10406q1 = new c1("Coords");

    /* renamed from: q2  reason: collision with root package name */
    public static final c1 f10407q2 = new c1("Duplex");

    /* renamed from: q3  reason: collision with root package name */
    public static final c1 f10408q3 = new c1("Flags");

    /* renamed from: q4  reason: collision with root package name */
    public static final c1 f10409q4 = new c1("HideMenubar");

    /* renamed from: q5  reason: collision with root package name */
    public static final c1 f10410q5 = new c1("Line");

    /* renamed from: q6  reason: collision with root package name */
    public static final c1 f10411q6 = new c1("O");

    /* renamed from: q7  reason: collision with root package name */
    public static final c1 f10412q7 = new c1("PI");

    /* renamed from: q8  reason: collision with root package name */
    public static final c1 f10413q8 = new c1("RichMediaDeactivation");

    /* renamed from: q9  reason: collision with root package name */
    public static final c1 f10414q9 = new c1("StructParents");

    /* renamed from: qa  reason: collision with root package name */
    public static final c1 f10415qa = new c1("TwoPageLeft");

    /* renamed from: qb  reason: collision with root package name */
    public static final c1 f10416qb = new c1("WhitePoint");

    /* renamed from: r  reason: collision with root package name */
    public static final c1 f10417r = new c1("ActualText");

    /* renamed from: r0  reason: collision with root package name */
    public static final c1 f10418r0 = new c1("Border");

    /* renamed from: r1  reason: collision with root package name */
    public static final c1 f10419r1 = new c1("Count");

    /* renamed from: r2  reason: collision with root package name */
    public static final c1 f10420r2 = new c1("DuplexFlipShortEdge");

    /* renamed from: r3  reason: collision with root package name */
    public static final c1 f10421r3 = new c1("Flash");

    /* renamed from: r4  reason: collision with root package name */
    public static final c1 f10422r4 = new c1("HideToolbar");

    /* renamed from: r5  reason: collision with root package name */
    public static final c1 f10423r5 = new c1("Linear");

    /* renamed from: r6  reason: collision with root package name */
    public static final c1 f10424r6 = new c1("Obj");

    /* renamed from: r7  reason: collision with root package name */
    public static final c1 f10425r7 = new c1("PickTrayByPDFSize");

    /* renamed from: r8  reason: collision with root package name */
    public static final c1 f10426r8 = new c1("RichMediaExecute");

    /* renamed from: r9  reason: collision with root package name */
    public static final c1 f10427r9 = new c1("StructTreeRoot");

    /* renamed from: ra  reason: collision with root package name */
    public static final c1 f10428ra = new c1("TwoPageRight");

    /* renamed from: rb  reason: collision with root package name */
    public static final c1 f10429rb = new c1("WP");

    /* renamed from: s  reason: collision with root package name */
    public static final c1 f10430s = new c1("adbe.pkcs7.detached");

    /* renamed from: s0  reason: collision with root package name */
    public static final c1 f10431s0 = new c1("Bounds");

    /* renamed from: s1  reason: collision with root package name */
    public static final c1 f10432s1 = new c1("Courier");

    /* renamed from: s2  reason: collision with root package name */
    public static final c1 f10433s2 = new c1("DuplexFlipLongEdge");

    /* renamed from: s3  reason: collision with root package name */
    public static final c1 f10434s3 = new c1("FlashVars");

    /* renamed from: s4  reason: collision with root package name */
    public static final c1 f10435s4 = new c1("HideWindowUI");

    /* renamed from: s5  reason: collision with root package name */
    public static final c1 f10436s5 = new c1("Link");

    /* renamed from: s6  reason: collision with root package name */
    public static final c1 f10437s6 = new c1("OBJR");

    /* renamed from: s7  reason: collision with root package name */
    public static final c1 f10438s7 = new c1("PlayCount");

    /* renamed from: s8  reason: collision with root package name */
    public static final c1 f10439s8 = new c1("RichMediaInstance");

    /* renamed from: s9  reason: collision with root package name */
    public static final c1 f10440s9 = new c1("Style");

    /* renamed from: sa  reason: collision with root package name */
    public static final c1 f10441sa = new c1("Tx");

    /* renamed from: sb  reason: collision with root package name */
    public static final c1 f10442sb = new c1("WS");

    /* renamed from: t  reason: collision with root package name */
    public static final c1 f10443t = new c1("adbe.pkcs7.s4");

    /* renamed from: t0  reason: collision with root package name */
    public static final c1 f10444t0 = new c1("Box");

    /* renamed from: t1  reason: collision with root package name */
    public static final c1 f10445t1 = new c1("Courier-Bold");

    /* renamed from: t2  reason: collision with root package name */
    public static final c1 f10446t2 = new c1("DV");

    /* renamed from: t3  reason: collision with root package name */
    public static final c1 f10447t3 = new c1("FlateDecode");

    /* renamed from: t4  reason: collision with root package name */
    public static final c1 f10448t4 = new c1("Highlight");

    /* renamed from: t5  reason: collision with root package name */
    public static final c1 f10449t5 = new c1("ListMode");

    /* renamed from: t6  reason: collision with root package name */
    public static final c1 f10450t6 = new c1("ObjStm");

    /* renamed from: t7  reason: collision with root package name */
    public static final c1 f10451t7 = new c1("PO");

    /* renamed from: t8  reason: collision with root package name */
    public static final c1 f10452t8 = new c1("RichMediaParams");

    /* renamed from: t9  reason: collision with root package name */
    public static final c1 f10453t9 = new c1("SubFilter");

    /* renamed from: ta  reason: collision with root package name */
    public static final c1 f10454ta = new c1("Type");

    /* renamed from: tb  reason: collision with root package name */
    public static final c1 f10455tb = new c1("X");

    /* renamed from: u  reason: collision with root package name */
    public static final c1 f10456u = new c1("adbe.pkcs7.s5");

    /* renamed from: u0  reason: collision with root package name */
    public static final c1 f10457u0 = new c1("BS");

    /* renamed from: u1  reason: collision with root package name */
    public static final c1 f10458u1 = new c1("Courier-Oblique");

    /* renamed from: u2  reason: collision with root package name */
    public static final c1 f10459u2 = new c1("DW");

    /* renamed from: u3  reason: collision with root package name */
    public static final c1 f10460u3 = new c1("Fo");

    /* renamed from: u4  reason: collision with root package name */
    public static final c1 f10461u4 = new c1("HOffset");

    /* renamed from: u5  reason: collision with root package name */
    public static final c1 f10462u5 = new c1("Location");

    /* renamed from: u6  reason: collision with root package name */
    public static final c1 f10463u6 = new c1("OC");

    /* renamed from: u7  reason: collision with root package name */
    public static final c1 f10464u7 = new c1("Polygon");

    /* renamed from: u8  reason: collision with root package name */
    public static final c1 f10465u8 = new c1("RichMediaPosition");

    /* renamed from: u9  reason: collision with root package name */
    public static final c1 f10466u9 = new c1("Subject");

    /* renamed from: ua  reason: collision with root package name */
    public static final c1 f10467ua = new c1("Type0");

    /* renamed from: ub  reason: collision with root package name */
    public static final c1 f10468ub = new c1("XA");

    /* renamed from: v  reason: collision with root package name */
    public static final c1 f10469v = new c1("adbe.pkcs7.sha1");

    /* renamed from: v0  reason: collision with root package name */
    public static final c1 f10470v0 = new c1("Btn");

    /* renamed from: v1  reason: collision with root package name */
    public static final c1 f10471v1 = new c1("Courier-BoldOblique");

    /* renamed from: v2  reason: collision with root package name */
    public static final c1 f10472v2 = new c1("E");

    /* renamed from: v3  reason: collision with root package name */
    public static final c1 f10473v3 = new c1("Font");

    /* renamed from: v4  reason: collision with root package name */
    public static final c1 f10474v4 = new c1("I");

    /* renamed from: v5  reason: collision with root package name */
    public static final c1 f10475v5 = new c1("Lock");

    /* renamed from: v6  reason: collision with root package name */
    public static final c1 f10476v6 = new c1("OCG");

    /* renamed from: v7  reason: collision with root package name */
    public static final c1 f10477v7 = new c1("Polyline");

    /* renamed from: v8  reason: collision with root package name */
    public static final c1 f10478v8 = new c1("RichMediaPresentation");

    /* renamed from: v9  reason: collision with root package name */
    public static final c1 f10479v9 = new c1("SubmitForm");

    /* renamed from: va  reason: collision with root package name */
    public static final c1 f10480va = new c1("Type1");

    /* renamed from: vb  reason: collision with root package name */
    public static final c1 f10481vb = new c1("XD");

    /* renamed from: w  reason: collision with root package name */
    public static final c1 f10482w = new c1("adbe.x509.rsa_sha1");

    /* renamed from: w0  reason: collision with root package name */
    public static final c1 f10483w0 = new c1("ByteRange");

    /* renamed from: w1  reason: collision with root package name */
    public static final c1 f10484w1 = new c1("CreationDate");

    /* renamed from: w2  reason: collision with root package name */
    public static final c1 f10485w2 = new c1("EarlyChange");

    /* renamed from: w3  reason: collision with root package name */
    public static final c1 f10486w3 = new c1("FontBBox");

    /* renamed from: w4  reason: collision with root package name */
    public static final c1 f10487w4 = new c1("ICCBased");

    /* renamed from: w5  reason: collision with root package name */
    public static final c1 f10488w5 = new c1("Locked");

    /* renamed from: w6  reason: collision with root package name */
    public static final c1 f10489w6 = new c1("OCGs");

    /* renamed from: w7  reason: collision with root package name */
    public static final c1 f10490w7 = new c1("Popup");

    /* renamed from: w8  reason: collision with root package name */
    public static final c1 f10491w8 = new c1("RichMediaSettings");

    /* renamed from: w9  reason: collision with root package name */
    public static final c1 f10492w9 = new c1("Subtype");

    /* renamed from: wa  reason: collision with root package name */
    public static final c1 f10493wa = new c1("Type3");

    /* renamed from: wb  reason: collision with root package name */
    public static final c1 f10494wb = new c1("XFA");

    /* renamed from: x  reason: collision with root package name */
    public static final c1 f10495x = new c1("Adobe.PPKLite");

    /* renamed from: x0  reason: collision with root package name */
    public static final c1 f10496x0 = new c1("C");

    /* renamed from: x1  reason: collision with root package name */
    public static final c1 f10497x1 = new c1("Creator");

    /* renamed from: x2  reason: collision with root package name */
    public static final c1 f10498x2 = new c1("EF");

    /* renamed from: x3  reason: collision with root package name */
    public static final c1 f10499x3 = new c1("FontDescriptor");

    /* renamed from: x4  reason: collision with root package name */
    public static final c1 f10500x4 = new c1("ID");

    /* renamed from: x5  reason: collision with root package name */
    public static final c1 f10501x5 = new c1("LZWDecode");

    /* renamed from: x6  reason: collision with root package name */
    public static final c1 f10502x6 = new c1("OCMD");

    /* renamed from: x7  reason: collision with root package name */
    public static final c1 f10503x7 = new c1("Position");

    /* renamed from: x8  reason: collision with root package name */
    public static final c1 f10504x8 = new c1("RichMediaWindow");

    /* renamed from: x9  reason: collision with root package name */
    public static final c1 f10505x9 = new c1("Supplement");

    /* renamed from: xa  reason: collision with root package name */
    public static final c1 f10506xa = new c1("U");

    /* renamed from: xb  reason: collision with root package name */
    public static final c1 f10507xb = new c1("XML");

    /* renamed from: y  reason: collision with root package name */
    public static final c1 f10508y = new c1("Adobe.PPKMS");

    /* renamed from: y0  reason: collision with root package name */
    public static final c1 f10509y0 = new c1("C0");

    /* renamed from: y1  reason: collision with root package name */
    public static final c1 f10510y1 = new c1("CreatorInfo");

    /* renamed from: y2  reason: collision with root package name */
    public static final c1 f10511y2 = new c1("EFF");

    /* renamed from: y3  reason: collision with root package name */
    public static final c1 f10512y3 = new c1("FontFile");

    /* renamed from: y4  reason: collision with root package name */
    public static final c1 f10513y4 = new c1("Identity");

    /* renamed from: y5  reason: collision with root package name */
    public static final c1 f10514y5 = new c1("M");

    /* renamed from: y6  reason: collision with root package name */
    public static final c1 f10515y6 = new c1("OCProperties");

    /* renamed from: y7  reason: collision with root package name */
    public static final c1 f10516y7 = new c1("Predictor");

    /* renamed from: y8  reason: collision with root package name */
    public static final c1 f10517y8 = new c1("RoleMap");

    /* renamed from: y9  reason: collision with root package name */
    public static final c1 f10518y9 = new c1("SV");

    /* renamed from: ya  reason: collision with root package name */
    public static final c1 f10519ya = new c1("UF");

    /* renamed from: yb  reason: collision with root package name */
    public static final c1 f10520yb = new c1("XObject");

    /* renamed from: z  reason: collision with root package name */
    public static final c1 f10521z = new c1("AESV2");

    /* renamed from: z0  reason: collision with root package name */
    public static final c1 f10522z0 = new c1("C1");

    /* renamed from: z1  reason: collision with root package name */
    public static final c1 f10523z1 = new c1("CropBox");

    /* renamed from: z2  reason: collision with root package name */
    public static final c1 f10524z2 = new c1("EFOpen");

    /* renamed from: z3  reason: collision with root package name */
    public static final c1 f10525z3 = new c1("FontFile2");

    /* renamed from: z4  reason: collision with root package name */
    public static final c1 f10526z4 = new c1("IF");

    /* renamed from: z5  reason: collision with root package name */
    public static final c1 f10527z5 = new c1("Material");

    /* renamed from: z6  reason: collision with root package name */
    public static final c1 f10528z6 = new c1("Off");

    /* renamed from: z7  reason: collision with root package name */
    public static final c1 f10529z7 = new c1("Preferred");

    /* renamed from: z8  reason: collision with root package name */
    public static final c1 f10530z8 = new c1("Root");

    /* renamed from: z9  reason: collision with root package name */
    public static final c1 f10531z9 = new c1("SW");

    /* renamed from: za  reason: collision with root package name */
    public static final c1 f10532za = new c1("UHC");

    /* renamed from: zb  reason: collision with root package name */
    public static final c1 f10533zb = new c1("XStep");

    /* renamed from: g  reason: collision with root package name */
    private int f10534g;

    static {
        Class<c1> cls = c1.class;
        Field[] declaredFields = cls.getDeclaredFields();
        Hb = new HashMap(declaredFields.length);
        int i10 = 0;
        while (i10 < declaredFields.length) {
            try {
                Field field = declaredFields[i10];
                if ((field.getModifiers() & 25) == 25 && field.getType().equals(cls)) {
                    c1 c1Var = (c1) field.get((Object) null);
                    Hb.put(n(c1Var.toString()), c1Var);
                }
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }

    public c1(String str) {
        this(str, true);
    }

    public static String n(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            int length = str.length();
            int i10 = 1;
            while (i10 < length) {
                char charAt = str.charAt(i10);
                if (charAt == '#') {
                    char charAt2 = str.charAt(i10 + 1);
                    i10 += 2;
                    charAt = (char) ((w.a(charAt2) << 4) + w.a(str.charAt(i10)));
                }
                stringBuffer.append(charAt);
                i10++;
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        return stringBuffer.toString();
    }

    public static byte[] o(String str) {
        int length = str.length();
        f fVar = new f(length + 20);
        fVar.e('/');
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (charArray[i10] & 255);
            if (c10 == ' ' || c10 == '#' || c10 == '%' || c10 == '/' || c10 == '<' || c10 == '>' || c10 == '[' || c10 == ']' || c10 == '{' || c10 == '}' || c10 == '(' || c10 == ')') {
                fVar.e('#');
            } else if (c10 < ' ' || c10 > '~') {
                fVar.e('#');
                if (c10 < 16) {
                    fVar.e('0');
                }
            } else {
                fVar.e(c10);
            }
            fVar.n(Integer.toString(c10, 16));
        }
        return fVar.Z();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c1) {
            return compareTo((c1) obj) == 0;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f10534g;
        if (i10 == 0) {
            int length = this.f10819e.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                i10 = (i10 * 31) + (this.f10819e[i12] & 255);
                i11++;
                i12++;
            }
            this.f10534g = i10;
        }
        return i10;
    }

    /* renamed from: m */
    public int compareTo(c1 c1Var) {
        byte[] bArr = this.f10819e;
        byte[] bArr2 = c1Var.f10819e;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 > b11) {
                return 1;
            }
            if (b10 < b11) {
                return -1;
            }
        }
        if (bArr.length < bArr2.length) {
            return -1;
        }
        return bArr.length > bArr2.length ? 1 : 0;
    }

    public c1(String str, boolean z10) {
        super(4);
        this.f10534g = 0;
        int length = str.length();
        if (!z10 || length <= 127) {
            this.f10819e = o(str);
            return;
        }
        throw new IllegalArgumentException(a.b("the.name.1.is.too.long.2.characters", str, String.valueOf(length)));
    }
}
