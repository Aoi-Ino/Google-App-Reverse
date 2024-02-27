package org.xmlpull.mxp1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MXParser implements XmlPullParser {
    protected static final String FEATURE_NAMES_INTERNED = "http://xmlpull.org/v1/doc/features.html#names-interned";
    protected static final String FEATURE_XML_ROUNDTRIP = "http://xmlpull.org/v1/doc/features.html#xml-roundtrip";
    protected static final int LOOKUP_MAX = 1024;
    protected static final char LOOKUP_MAX_CHAR = 'Ѐ';
    protected static final char[] NCODING = {'n', 'c', 'o', 'd', 'i', 'n', 'g'};
    protected static final char[] NO = {'n', 'o'};
    protected static final String PROPERTY_XMLDECL_CONTENT = "http://xmlpull.org/v1/doc/properties.html#xmldecl-content";
    protected static final String PROPERTY_XMLDECL_STANDALONE = "http://xmlpull.org/v1/doc/properties.html#xmldecl-standalone";
    protected static final String PROPERTY_XMLDECL_VERSION = "http://xmlpull.org/v1/doc/properties.html#xmldecl-version";
    protected static final int READ_CHUNK_SIZE = 8192;
    protected static final char[] TANDALONE = {'t', 'a', 'n', 'd', 'a', 'l', 'o', 'n', 'e'};
    private static final boolean TRACE_SIZING = false;
    protected static final char[] VERSION = {'v', 'e', 'r', 's', 'i', 'o', 'n'};
    protected static final String XMLNS_URI = "http://www.w3.org/2000/xmlns/";
    protected static final String XML_URI = "http://www.w3.org/XML/1998/namespace";
    protected static final char[] YES = {'y', 'e', 's'};
    protected static boolean[] lookupNameChar = new boolean[LOOKUP_MAX];
    protected static boolean[] lookupNameStartChar = new boolean[LOOKUP_MAX];
    protected boolean allStringsInterned;
    protected int attributeCount;
    protected String[] attributeName;
    protected int[] attributeNameHash;
    protected String[] attributePrefix;
    protected String[] attributeUri;
    protected String[] attributeValue;
    protected char[] buf;
    protected int bufAbsoluteStart;
    protected int bufEnd;
    protected int bufLoadFactor = 95;
    protected int bufSoftLimit;
    protected int bufStart;
    protected char[] charRefOneCharBuf;
    protected int columnNumber;
    protected int depth;
    protected String[] elName;
    protected int[] elNamespaceCount;
    protected String[] elPrefix;
    protected char[][] elRawName;
    protected int[] elRawNameEnd;
    protected int[] elRawNameLine;
    protected String[] elUri;
    protected boolean emptyElementTag;
    protected int entityEnd;
    protected String[] entityName;
    protected char[][] entityNameBuf;
    protected int[] entityNameHash;
    protected String entityRefName;
    protected String[] entityReplacement;
    protected char[][] entityReplacementBuf;
    protected int eventType;
    protected String inputEncoding;
    protected int lineNumber;
    protected int namespaceEnd;
    protected String[] namespacePrefix;
    protected int[] namespacePrefixHash;
    protected String[] namespaceUri;
    protected boolean pastEndTag;

    /* renamed from: pc  reason: collision with root package name */
    protected char[] f30349pc;
    protected int pcEnd;
    protected int pcStart;
    protected int pos;
    protected int posEnd;
    protected int posStart;
    protected boolean preventBufferCompaction;
    protected boolean processNamespaces;
    protected boolean reachedEnd;
    protected Reader reader;
    protected boolean roundtripSupported;
    protected boolean seenAmpersand;
    protected boolean seenDocdecl;
    protected boolean seenEndTag;
    protected boolean seenMarkup;
    protected boolean seenRoot;
    protected boolean seenStartTag;
    protected String text;
    protected boolean tokenize;
    protected boolean usePC;
    protected String xmlDeclContent;
    protected Boolean xmlDeclStandalone;
    protected String xmlDeclVersion;

    static {
        setNameStart(':');
        for (char c10 = 'A'; c10 <= 'Z'; c10 = (char) (c10 + 1)) {
            setNameStart(c10);
        }
        setNameStart('_');
        for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
            setNameStart(c11);
        }
        for (char c12 = 192; c12 <= 767; c12 = (char) (c12 + 1)) {
            setNameStart(c12);
        }
        for (char c13 = 880; c13 <= 893; c13 = (char) (c13 + 1)) {
            setNameStart(c13);
        }
        for (char c14 = 895; c14 < LOOKUP_MAX; c14 = (char) (c14 + 1)) {
            setNameStart(c14);
        }
        setName('-');
        setName('.');
        for (char c15 = '0'; c15 <= '9'; c15 = (char) (c15 + 1)) {
            setName(c15);
        }
        setName(183);
        for (char c16 = 768; c16 <= 879; c16 = (char) (c16 + 1)) {
            setName(c16);
        }
    }

    public MXParser() {
        int i10 = (Runtime.getRuntime().freeMemory() > 1000000 ? 1 : (Runtime.getRuntime().freeMemory() == 1000000 ? 0 : -1));
        int i11 = READ_CHUNK_SIZE;
        char[] cArr = new char[(i10 > 0 ? READ_CHUNK_SIZE : 256)];
        this.buf = cArr;
        this.bufSoftLimit = (this.bufLoadFactor * cArr.length) / 100;
        this.f30349pc = new char[(Runtime.getRuntime().freeMemory() <= 1000000 ? 64 : i11)];
        this.charRefOneCharBuf = new char[1];
    }

    protected static final int fastHash(char[] cArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = (cArr[i10] << 7) + cArr[(i10 + i11) - 1];
        if (i11 > 16) {
            i12 = (i12 << 7) + cArr[(i11 / 4) + i10];
        }
        return i11 > 8 ? (i12 << 7) + cArr[i10 + (i11 / 2)] : i12;
    }

    private static int findFragment(int i10, char[] cArr, int i11, int i12) {
        if (i11 < i10) {
            return i10 > i12 ? i12 : i10;
        }
        if (i12 - i11 > 65) {
            i11 = i12 - 10;
        }
        int i13 = i11 + 1;
        while (true) {
            i13--;
            if (i13 > i10 && i12 - i13 <= 65 && (cArr[i13] != '<' || i11 - i13 <= 10)) {
            }
        }
        return i13;
    }

    private static final void setName(char c10) {
        lookupNameChar[c10] = true;
    }

    private static final void setNameStart(char c10) {
        lookupNameStartChar[c10] = true;
        setName(c10);
    }

    public void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        ensureEntityCapacity();
        this.entityName[this.entityEnd] = newString(str.toCharArray(), 0, str.length());
        this.entityNameBuf[this.entityEnd] = str.toCharArray();
        String[] strArr = this.entityReplacement;
        int i10 = this.entityEnd;
        strArr[i10] = str2;
        this.entityReplacementBuf[i10] = str2.toCharArray();
        if (!this.allStringsInterned) {
            int[] iArr = this.entityNameHash;
            int i11 = this.entityEnd;
            char[] cArr = this.entityNameBuf[i11];
            iArr[i11] = fastHash(cArr, 0, cArr.length);
        }
        this.entityEnd++;
    }

    /* access modifiers changed from: protected */
    public void ensureAttributesCapacity(int i10) {
        String[] strArr = this.attributeName;
        int length = strArr != null ? strArr.length : 0;
        if (i10 >= length) {
            int i11 = i10 > 7 ? i10 * 2 : 8;
            boolean z10 = length > 0;
            String[] strArr2 = new String[i11];
            if (z10) {
                System.arraycopy(strArr, 0, strArr2, 0, length);
            }
            this.attributeName = strArr2;
            String[] strArr3 = new String[i11];
            if (z10) {
                System.arraycopy(this.attributePrefix, 0, strArr3, 0, length);
            }
            this.attributePrefix = strArr3;
            String[] strArr4 = new String[i11];
            if (z10) {
                System.arraycopy(this.attributeUri, 0, strArr4, 0, length);
            }
            this.attributeUri = strArr4;
            String[] strArr5 = new String[i11];
            if (z10) {
                System.arraycopy(this.attributeValue, 0, strArr5, 0, length);
            }
            this.attributeValue = strArr5;
            if (!this.allStringsInterned) {
                int[] iArr = new int[i11];
                if (z10) {
                    System.arraycopy(this.attributeNameHash, 0, iArr, 0, length);
                }
                this.attributeNameHash = iArr;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void ensureElementsCapacity() {
        String[] strArr = this.elName;
        int length = strArr != null ? strArr.length : 0;
        int i10 = this.depth;
        if (i10 + 1 >= length) {
            int i11 = (i10 >= 7 ? i10 * 2 : 8) + 2;
            boolean z10 = length > 0;
            String[] strArr2 = new String[i11];
            if (z10) {
                System.arraycopy(strArr, 0, strArr2, 0, length);
            }
            this.elName = strArr2;
            String[] strArr3 = new String[i11];
            if (z10) {
                System.arraycopy(this.elPrefix, 0, strArr3, 0, length);
            }
            this.elPrefix = strArr3;
            String[] strArr4 = new String[i11];
            if (z10) {
                System.arraycopy(this.elUri, 0, strArr4, 0, length);
            }
            this.elUri = strArr4;
            int[] iArr = new int[i11];
            if (z10) {
                System.arraycopy(this.elNamespaceCount, 0, iArr, 0, length);
            } else {
                iArr[0] = 0;
            }
            this.elNamespaceCount = iArr;
            int[] iArr2 = new int[i11];
            if (z10) {
                System.arraycopy(this.elRawNameEnd, 0, iArr2, 0, length);
            }
            this.elRawNameEnd = iArr2;
            int[] iArr3 = new int[i11];
            if (z10) {
                System.arraycopy(this.elRawNameLine, 0, iArr3, 0, length);
            }
            this.elRawNameLine = iArr3;
            char[][] cArr = new char[i11][];
            if (z10) {
                System.arraycopy(this.elRawName, 0, cArr, 0, length);
            }
            this.elRawName = cArr;
        }
    }

    /* access modifiers changed from: protected */
    public void ensureEntityCapacity() {
        char[][] cArr = this.entityReplacementBuf;
        int length = cArr != null ? cArr.length : 0;
        int i10 = this.entityEnd;
        if (i10 >= length) {
            int i11 = i10 > 7 ? i10 * 2 : 8;
            String[] strArr = new String[i11];
            char[][] cArr2 = new char[i11][];
            String[] strArr2 = new String[i11];
            char[][] cArr3 = new char[i11][];
            String[] strArr3 = this.entityName;
            if (strArr3 != null) {
                System.arraycopy(strArr3, 0, strArr, 0, i10);
                System.arraycopy(this.entityReplacementBuf, 0, strArr2, 0, this.entityEnd);
                System.arraycopy(this.entityReplacement, 0, strArr2, 0, this.entityEnd);
                System.arraycopy(this.entityReplacementBuf, 0, cArr3, 0, this.entityEnd);
            }
            this.entityName = strArr;
            this.entityNameBuf = cArr2;
            this.entityReplacement = strArr2;
            this.entityReplacementBuf = cArr3;
            if (!this.allStringsInterned) {
                int[] iArr = new int[i11];
                int[] iArr2 = this.entityNameHash;
                if (iArr2 != null) {
                    System.arraycopy(iArr2, 0, iArr, 0, this.entityEnd);
                }
                this.entityNameHash = iArr;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void ensureNamespacesCapacity(int i10) {
        String[] strArr = this.namespacePrefix;
        if (i10 >= (strArr != null ? strArr.length : 0)) {
            int i11 = i10 > 7 ? i10 * 2 : 8;
            String[] strArr2 = new String[i11];
            String[] strArr3 = new String[i11];
            if (strArr != null) {
                System.arraycopy(strArr, 0, strArr2, 0, this.namespaceEnd);
                System.arraycopy(this.namespaceUri, 0, strArr3, 0, this.namespaceEnd);
            }
            this.namespacePrefix = strArr2;
            this.namespaceUri = strArr3;
            if (!this.allStringsInterned) {
                int[] iArr = new int[i11];
                int[] iArr2 = this.namespacePrefixHash;
                if (iArr2 != null) {
                    System.arraycopy(iArr2, 0, iArr, 0, this.namespaceEnd);
                }
                this.namespacePrefixHash = iArr;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void ensurePC(int i10) {
        char[] cArr = new char[(i10 > READ_CHUNK_SIZE ? i10 * 2 : 16384)];
        System.arraycopy(this.f30349pc, 0, cArr, 0, this.pcEnd);
        this.f30349pc = cArr;
    }

    /* access modifiers changed from: protected */
    public void fillBuf() throws IOException, XmlPullParserException {
        boolean z10;
        if (this.reader != null) {
            int i10 = this.bufEnd;
            int i11 = this.bufSoftLimit;
            if (i10 > i11) {
                int i12 = this.bufStart;
                boolean z11 = i12 > i11;
                if (this.preventBufferCompaction) {
                    z10 = true;
                    z11 = false;
                } else {
                    if (!z11) {
                        if (i12 < this.buf.length / 2) {
                            z10 = true;
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = false;
                }
                if (z11) {
                    char[] cArr = this.buf;
                    System.arraycopy(cArr, i12, cArr, 0, i10 - i12);
                } else if (z10) {
                    char[] cArr2 = this.buf;
                    char[] cArr3 = new char[(cArr2.length * 2)];
                    System.arraycopy(cArr2, i12, cArr3, 0, i10 - i12);
                    this.buf = cArr3;
                    int i13 = this.bufLoadFactor;
                    if (i13 > 0) {
                        this.bufSoftLimit = (i13 * cArr3.length) / 100;
                    }
                } else {
                    throw new XmlPullParserException("internal error in fillBuffer()");
                }
                int i14 = this.bufEnd;
                int i15 = this.bufStart;
                this.bufEnd = i14 - i15;
                this.pos -= i15;
                this.posStart -= i15;
                this.posEnd -= i15;
                this.bufAbsoluteStart += i15;
                this.bufStart = 0;
            }
            char[] cArr4 = this.buf;
            int length = cArr4.length;
            int i16 = this.bufEnd;
            int i17 = length - i16;
            int i18 = READ_CHUNK_SIZE;
            if (i17 <= READ_CHUNK_SIZE) {
                i18 = cArr4.length - i16;
            }
            int read = this.reader.read(cArr4, i16, i18);
            if (read > 0) {
                this.bufEnd += read;
            } else if (read != -1) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("error reading input, returned ");
                stringBuffer.append(read);
                throw new IOException(stringBuffer.toString());
            } else if (this.bufAbsoluteStart == 0 && this.pos == 0) {
                throw new EOFException("input contained no data");
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                if (this.depth > 0) {
                    stringBuffer2.append(" - expected end tag");
                    if (this.depth > 1) {
                        stringBuffer2.append("s");
                    }
                    stringBuffer2.append(" ");
                    for (int i19 = this.depth; i19 > 0; i19--) {
                        String str = new String(this.elRawName[i19], 0, this.elRawNameEnd[i19]);
                        stringBuffer2.append("</");
                        stringBuffer2.append(str);
                        stringBuffer2.append('>');
                    }
                    stringBuffer2.append(" to close");
                    for (int i20 = this.depth; i20 > 0; i20--) {
                        if (i20 != this.depth) {
                            stringBuffer2.append(" and");
                        }
                        String str2 = new String(this.elRawName[i20], 0, this.elRawNameEnd[i20]);
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append(" start tag <");
                        stringBuffer3.append(str2);
                        stringBuffer3.append(">");
                        stringBuffer2.append(stringBuffer3.toString());
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append(" from line ");
                        stringBuffer4.append(this.elRawNameLine[i20]);
                        stringBuffer2.append(stringBuffer4.toString());
                    }
                    stringBuffer2.append(", parser stopped on");
                }
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("no more data available");
                stringBuffer5.append(stringBuffer2.toString());
                stringBuffer5.append(getPositionDescription());
                throw new EOFException(stringBuffer5.toString());
            }
        } else {
            throw new XmlPullParserException("reader must be set before parsing is started");
        }
    }

    public int getAttributeCount() {
        if (this.eventType != 2) {
            return -1;
        }
        return this.attributeCount;
    }

    public String getAttributeName(int i10) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        } else if (i10 >= 0 && i10 < this.attributeCount) {
            return this.attributeName[i10];
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute position must be 0..");
            stringBuffer.append(this.attributeCount - 1);
            stringBuffer.append(" and not ");
            stringBuffer.append(i10);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
    }

    public String getAttributeNamespace(int i10) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        } else if (!this.processNamespaces) {
            return "";
        } else {
            if (i10 >= 0 && i10 < this.attributeCount) {
                return this.attributeUri[i10];
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute position must be 0..");
            stringBuffer.append(this.attributeCount - 1);
            stringBuffer.append(" and not ");
            stringBuffer.append(i10);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
    }

    public String getAttributePrefix(int i10) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        } else if (!this.processNamespaces) {
            return null;
        } else {
            if (i10 >= 0 && i10 < this.attributeCount) {
                return this.attributePrefix[i10];
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute position must be 0..");
            stringBuffer.append(this.attributeCount - 1);
            stringBuffer.append(" and not ");
            stringBuffer.append(i10);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
    }

    public String getAttributeType(int i10) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        } else if (i10 >= 0 && i10 < this.attributeCount) {
            return "CDATA";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute position must be 0..");
            stringBuffer.append(this.attributeCount - 1);
            stringBuffer.append(" and not ");
            stringBuffer.append(i10);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
    }

    public String getAttributeValue(int i10) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        } else if (i10 >= 0 && i10 < this.attributeCount) {
            return this.attributeValue[i10];
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute position must be 0..");
            stringBuffer.append(this.attributeCount - 1);
            stringBuffer.append(" and not ");
            stringBuffer.append(i10);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
    }

    public int getColumnNumber() {
        return this.columnNumber;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getEventType() throws XmlPullParserException {
        return this.eventType;
    }

    public boolean getFeature(String str) {
        if (str != null) {
            return XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str) ? this.processNamespaces : (!FEATURE_NAMES_INTERNED.equals(str) && !XmlPullParser.FEATURE_PROCESS_DOCDECL.equals(str) && FEATURE_XML_ROUNDTRIP.equals(str)) ? this.roundtripSupported : TRACE_SIZING;
        }
        throw new IllegalArgumentException("feature name should not be nulll");
    }

    public String getInputEncoding() {
        return this.inputEncoding;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public String getName() {
        int i10 = this.eventType;
        if (i10 == 2) {
            return this.elName[this.depth];
        }
        if (i10 == 3) {
            return this.elName[this.depth];
        }
        if (i10 != 6) {
            return null;
        }
        if (this.entityRefName == null) {
            char[] cArr = this.buf;
            int i11 = this.posStart;
            this.entityRefName = newString(cArr, i11, this.posEnd - i11);
        }
        return this.entityRefName;
    }

    public String getNamespace() {
        int i10 = this.eventType;
        if (i10 == 2) {
            return this.processNamespaces ? this.elUri[this.depth] : "";
        }
        if (i10 == 3) {
            return this.processNamespaces ? this.elUri[this.depth] : "";
        }
        return null;
    }

    public int getNamespaceCount(int i10) throws XmlPullParserException {
        if (!this.processNamespaces || i10 == 0) {
            return 0;
        }
        if (i10 >= 0 && i10 <= this.depth) {
            return this.elNamespaceCount[i10];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("napespace count mayt be for depth 0..");
        stringBuffer.append(this.depth);
        stringBuffer.append(" not ");
        stringBuffer.append(i10);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public String getNamespacePrefix(int i10) throws XmlPullParserException {
        if (i10 < this.namespaceEnd) {
            return this.namespacePrefix[i10];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("position ");
        stringBuffer.append(i10);
        stringBuffer.append(" exceeded number of available namespaces ");
        stringBuffer.append(this.namespaceEnd);
        throw new XmlPullParserException(stringBuffer.toString());
    }

    public String getNamespaceUri(int i10) throws XmlPullParserException {
        if (i10 < this.namespaceEnd) {
            return this.namespaceUri[i10];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("position ");
        stringBuffer.append(i10);
        stringBuffer.append(" exceedded number of available namespaces ");
        stringBuffer.append(this.namespaceEnd);
        throw new XmlPullParserException(stringBuffer.toString());
    }

    public String getPositionDescription() {
        String str;
        int i10 = this.posStart;
        int i11 = this.pos;
        String str2 = null;
        if (i10 <= i11) {
            int findFragment = findFragment(0, this.buf, i10, i11);
            int i12 = this.pos;
            if (findFragment < i12) {
                str2 = new String(this.buf, findFragment, i12 - findFragment);
            }
            if (this.bufAbsoluteStart > 0 || findFragment > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("...");
                stringBuffer.append(str2);
                str2 = stringBuffer.toString();
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(" ");
        stringBuffer2.append(XmlPullParser.TYPES[this.eventType]);
        if (str2 != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(" seen ");
            stringBuffer3.append(printable(str2));
            stringBuffer3.append("...");
            str = stringBuffer3.toString();
        } else {
            str = "";
        }
        stringBuffer2.append(str);
        stringBuffer2.append(" @");
        stringBuffer2.append(getLineNumber());
        stringBuffer2.append(":");
        stringBuffer2.append(getColumnNumber());
        return stringBuffer2.toString();
    }

    public String getPrefix() {
        int i10 = this.eventType;
        if (i10 == 2) {
            return this.elPrefix[this.depth];
        }
        if (i10 == 3) {
            return this.elPrefix[this.depth];
        }
        return null;
    }

    public Object getProperty(String str) {
        if (str == null) {
            throw new IllegalArgumentException("property name should not be nulll");
        } else if (PROPERTY_XMLDECL_VERSION.equals(str)) {
            return this.xmlDeclVersion;
        } else {
            if (PROPERTY_XMLDECL_STANDALONE.equals(str)) {
                return this.xmlDeclStandalone;
            }
            if (PROPERTY_XMLDECL_CONTENT.equals(str)) {
                return this.xmlDeclContent;
            }
            return null;
        }
    }

    public String getText() {
        String str;
        int i10 = this.eventType;
        if (i10 == 0 || i10 == 1) {
            return null;
        }
        if (i10 == 6) {
            return this.text;
        }
        if (this.text == null) {
            if (!this.usePC || i10 == 2 || i10 == 3) {
                char[] cArr = this.buf;
                int i11 = this.posStart;
                str = new String(cArr, i11, this.posEnd - i11);
            } else {
                char[] cArr2 = this.f30349pc;
                int i12 = this.pcStart;
                str = new String(cArr2, i12, this.pcEnd - i12);
            }
            this.text = str;
        }
        return this.text;
    }

    public char[] getTextCharacters(int[] iArr) {
        int i10 = this.eventType;
        if (i10 == 4) {
            if (this.usePC) {
                int i11 = this.pcStart;
                iArr[0] = i11;
                iArr[1] = this.pcEnd - i11;
                return this.f30349pc;
            }
            int i12 = this.posStart;
            iArr[0] = i12;
            iArr[1] = this.posEnd - i12;
            return this.buf;
        } else if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 9 || i10 == 6 || i10 == 8 || i10 == 7 || i10 == 10) {
            int i13 = this.posStart;
            iArr[0] = i13;
            iArr[1] = this.posEnd - i13;
            return this.buf;
        } else if (i10 == 0 || i10 == 1) {
            iArr[1] = -1;
            iArr[0] = -1;
            return null;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("unknown text eventType: ");
            stringBuffer.append(this.eventType);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public boolean isAttributeDefault(int i10) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        } else if (i10 >= 0 && i10 < this.attributeCount) {
            return TRACE_SIZING;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute position must be 0..");
            stringBuffer.append(this.attributeCount - 1);
            stringBuffer.append(" and not ");
            stringBuffer.append(i10);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
    }

    public boolean isEmptyElementTag() throws XmlPullParserException {
        if (this.eventType == 2) {
            return this.emptyElementTag;
        }
        throw new XmlPullParserException("parser must be on START_TAG to check for empty element", this, (Throwable) null);
    }

    /* access modifiers changed from: protected */
    public boolean isNameChar(char c10) {
        if ((c10 >= LOOKUP_MAX || !lookupNameChar[c10]) && ((c10 < LOOKUP_MAX || c10 > 8231) && ((c10 < 8234 || c10 > 8591) && (c10 < 10240 || c10 > 65519)))) {
            return TRACE_SIZING;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isNameStartChar(char c10) {
        if ((c10 >= LOOKUP_MAX || !lookupNameStartChar[c10]) && ((c10 < LOOKUP_MAX || c10 > 8231) && ((c10 < 8234 || c10 > 8591) && (c10 < 10240 || c10 > 65519)))) {
            return TRACE_SIZING;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isS(char c10) {
        if (c10 == ' ' || c10 == 10 || c10 == 13 || c10 == 9) {
            return true;
        }
        return TRACE_SIZING;
    }

    public boolean isWhitespace() throws XmlPullParserException {
        int i10 = this.eventType;
        if (i10 == 4 || i10 == 5) {
            if (this.usePC) {
                for (int i11 = this.pcStart; i11 < this.pcEnd; i11++) {
                    if (!isS(this.f30349pc[i11])) {
                        return TRACE_SIZING;
                    }
                }
                return true;
            }
            for (int i12 = this.posStart; i12 < this.posEnd; i12++) {
                if (!isS(this.buf[i12])) {
                    return TRACE_SIZING;
                }
            }
            return true;
        } else if (i10 == 7) {
            return true;
        } else {
            throw new XmlPullParserException("no content available to check for whitespaces");
        }
    }

    /* access modifiers changed from: protected */
    public void joinPC() {
        int i10 = this.posEnd - this.posStart;
        int i11 = this.pcEnd + i10 + 1;
        if (i11 >= this.f30349pc.length) {
            ensurePC(i11);
        }
        System.arraycopy(this.buf, this.posStart, this.f30349pc, this.pcEnd, i10);
        this.pcEnd += i10;
        this.usePC = true;
    }

    /* access modifiers changed from: protected */
    public char[] lookuEntityReplacement(int i10) throws XmlPullParserException, IOException {
        if (!this.allStringsInterned) {
            char[] cArr = this.buf;
            int i11 = this.posStart;
            int fastHash = fastHash(cArr, i11, this.posEnd - i11);
            for (int i12 = this.entityEnd - 1; i12 >= 0; i12--) {
                if (fastHash == this.entityNameHash[i12]) {
                    char[] cArr2 = this.entityNameBuf[i12];
                    if (i10 == cArr2.length) {
                        int i13 = 0;
                        while (i13 < i10) {
                            if (this.buf[this.posStart + i13] == cArr2[i13]) {
                                i13++;
                            }
                        }
                        if (this.tokenize) {
                            this.text = this.entityReplacement[i12];
                        }
                        return this.entityReplacementBuf[i12];
                    }
                    continue;
                }
            }
            return null;
        }
        char[] cArr3 = this.buf;
        int i14 = this.posStart;
        this.entityRefName = newString(cArr3, i14, this.posEnd - i14);
        for (int i15 = this.entityEnd - 1; i15 >= 0; i15--) {
            if (this.entityRefName == this.entityName[i15]) {
                if (this.tokenize) {
                    this.text = this.entityReplacement[i15];
                }
                return this.entityReplacementBuf[i15];
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public char more() throws IOException, XmlPullParserException {
        if (this.pos >= this.bufEnd) {
            fillBuf();
        }
        char[] cArr = this.buf;
        int i10 = this.pos;
        this.pos = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == 10) {
            this.lineNumber++;
            this.columnNumber = 1;
        } else {
            this.columnNumber++;
        }
        return c10;
    }

    /* access modifiers changed from: protected */
    public String newString(char[] cArr, int i10, int i11) {
        return new String(cArr, i10, i11);
    }

    /* access modifiers changed from: protected */
    public String newStringIntern(char[] cArr, int i10, int i11) {
        return new String(cArr, i10, i11).intern();
    }

    public int next() throws XmlPullParserException, IOException {
        this.tokenize = TRACE_SIZING;
        return nextImpl();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        r12.eventType = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        return 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a0, code lost:
        if (r6 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f4, code lost:
        if (r6 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int nextImpl() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            r0 = 0
            r12.text = r0
            r1 = 0
            r12.pcStart = r1
            r12.pcEnd = r1
            r12.usePC = r1
            int r2 = r12.posEnd
            r12.bufStart = r2
            boolean r2 = r12.pastEndTag
            r3 = 1
            if (r2 == 0) goto L_0x0020
            r12.pastEndTag = r1
            int r2 = r12.depth
            int r2 = r2 - r3
            r12.depth = r2
            int[] r4 = r12.elNamespaceCount
            r2 = r4[r2]
            r12.namespaceEnd = r2
        L_0x0020:
            boolean r2 = r12.emptyElementTag
            if (r2 == 0) goto L_0x002c
            r12.emptyElementTag = r1
            r12.pastEndTag = r3
            r0 = 3
        L_0x0029:
            r12.eventType = r0
            return r0
        L_0x002c:
            int r2 = r12.depth
            if (r2 <= 0) goto L_0x0241
            boolean r2 = r12.seenStartTag
            if (r2 == 0) goto L_0x003b
            r12.seenStartTag = r1
        L_0x0036:
            int r0 = r12.parseStartTag()
            goto L_0x0029
        L_0x003b:
            boolean r2 = r12.seenEndTag
            if (r2 == 0) goto L_0x0046
            r12.seenEndTag = r1
        L_0x0041:
            int r0 = r12.parseEndTag()
            goto L_0x0029
        L_0x0046:
            boolean r2 = r12.seenMarkup
            r4 = 38
            r5 = 60
            if (r2 == 0) goto L_0x0052
            r12.seenMarkup = r1
            r2 = r5
            goto L_0x005e
        L_0x0052:
            boolean r2 = r12.seenAmpersand
            if (r2 == 0) goto L_0x005a
            r12.seenAmpersand = r1
            r2 = r4
            goto L_0x005e
        L_0x005a:
            char r2 = r12.more()
        L_0x005e:
            int r6 = r12.pos
            int r6 = r6 - r3
            r12.posStart = r6
            r6 = r1
            r7 = r6
        L_0x0065:
            r8 = 4
            if (r2 != r5) goto L_0x0120
            if (r6 == 0) goto L_0x0073
            boolean r2 = r12.tokenize
            if (r2 == 0) goto L_0x0073
            r12.seenMarkup = r3
        L_0x0070:
            r12.eventType = r8
            return r8
        L_0x0073:
            char r2 = r12.more()
            r9 = 47
            if (r2 != r9) goto L_0x0084
            boolean r0 = r12.tokenize
            if (r0 != 0) goto L_0x0041
            if (r6 == 0) goto L_0x0041
            r12.seenEndTag = r3
            goto L_0x0070
        L_0x0084:
            r9 = 33
            java.lang.String r10 = "unexpected character in markup "
            if (r2 != r9) goto L_0x00e1
            char r2 = r12.more()
            r8 = 45
            if (r2 != r8) goto L_0x00ab
            r12.parseComment()
            boolean r2 = r12.tokenize
            if (r2 == 0) goto L_0x009c
            r0 = 9
            goto L_0x0029
        L_0x009c:
            boolean r2 = r12.usePC
            if (r2 != 0) goto L_0x00a5
            if (r6 == 0) goto L_0x00a5
        L_0x00a2:
            r7 = r3
            goto L_0x0193
        L_0x00a5:
            int r2 = r12.pos
            r12.posStart = r2
            goto L_0x0193
        L_0x00ab:
            r8 = 91
            if (r2 != r8) goto L_0x00c8
            r12.parseCDSect(r6)
            boolean r2 = r12.tokenize
            if (r2 == 0) goto L_0x00b9
            r0 = 5
            goto L_0x0029
        L_0x00b9:
            int r2 = r12.posStart
            int r8 = r12.posEnd
            int r8 = r8 - r2
            if (r8 <= 0) goto L_0x0193
            boolean r2 = r12.usePC
            if (r2 != 0) goto L_0x0193
            r6 = r3
            r7 = r6
            goto L_0x0193
        L_0x00c8:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r10)
            java.lang.String r2 = r12.printable((char) r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r12, r0)
            throw r1
        L_0x00e1:
            r9 = 63
            if (r2 != r9) goto L_0x00f7
            r12.parsePI()
            boolean r2 = r12.tokenize
            if (r2 == 0) goto L_0x00f0
            r0 = 8
            goto L_0x0029
        L_0x00f0:
            boolean r2 = r12.usePC
            if (r2 != 0) goto L_0x00a5
            if (r6 == 0) goto L_0x00a5
            goto L_0x00a2
        L_0x00f7:
            boolean r1 = r12.isNameStartChar(r2)
            if (r1 == 0) goto L_0x0107
            boolean r0 = r12.tokenize
            if (r0 != 0) goto L_0x0036
            if (r6 == 0) goto L_0x0036
            r12.seenStartTag = r3
            goto L_0x0070
        L_0x0107:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r10)
            java.lang.String r2 = r12.printable((char) r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r12, r0)
            throw r1
        L_0x0120:
            if (r2 != r4) goto L_0x01b2
            boolean r2 = r12.tokenize
            if (r2 == 0) goto L_0x012c
            if (r6 == 0) goto L_0x012c
            r12.seenAmpersand = r3
            goto L_0x0070
        L_0x012c:
            int r2 = r12.posStart
            int r8 = r12.bufAbsoluteStart
            int r2 = r2 + r8
            int r9 = r12.posEnd
            int r9 = r9 + r8
            char[] r8 = r12.parseEntityRef()
            boolean r10 = r12.tokenize
            if (r10 == 0) goto L_0x013f
            r0 = 6
            goto L_0x0029
        L_0x013f:
            if (r8 != 0) goto L_0x0174
            java.lang.String r1 = r12.entityRefName
            if (r1 != 0) goto L_0x0152
            char[] r1 = r12.buf
            int r2 = r12.posStart
            int r3 = r12.posEnd
            int r3 = r3 - r2
            java.lang.String r1 = r12.newString(r1, r2, r3)
            r12.entityRefName = r1
        L_0x0152:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "could not resolve entity named '"
            r2.append(r3)
            java.lang.String r3 = r12.entityRefName
            java.lang.String r3 = r12.printable((java.lang.String) r3)
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r12, r0)
            throw r1
        L_0x0174:
            int r10 = r12.bufAbsoluteStart
            int r2 = r2 - r10
            r12.posStart = r2
            int r9 = r9 - r10
            r12.posEnd = r9
            boolean r2 = r12.usePC
            if (r2 != 0) goto L_0x018d
            if (r6 == 0) goto L_0x0187
            r12.joinPC()
            r9 = r1
            goto L_0x018e
        L_0x0187:
            r12.usePC = r3
            r12.pcEnd = r1
            r12.pcStart = r1
        L_0x018d:
            r9 = r7
        L_0x018e:
            r2 = r1
        L_0x018f:
            int r7 = r8.length
            if (r2 < r7) goto L_0x0199
            r7 = r9
        L_0x0193:
            char r2 = r12.more()
            goto L_0x0065
        L_0x0199:
            int r7 = r12.pcEnd
            char[] r10 = r12.f30349pc
            int r10 = r10.length
            if (r7 < r10) goto L_0x01a3
            r12.ensurePC(r7)
        L_0x01a3:
            char[] r7 = r12.f30349pc
            int r10 = r12.pcEnd
            int r11 = r10 + 1
            r12.pcEnd = r11
            char r11 = r8[r2]
            r7[r10] = r11
            int r2 = r2 + 1
            goto L_0x018f
        L_0x01b2:
            if (r7 == 0) goto L_0x01b8
            r12.joinPC()
            r7 = r1
        L_0x01b8:
            boolean r6 = r12.tokenize
            if (r6 == 0) goto L_0x01c3
            boolean r6 = r12.roundtripSupported
            if (r6 != 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r6 = r1
            goto L_0x01c4
        L_0x01c3:
            r6 = r3
        L_0x01c4:
            r8 = r1
        L_0x01c5:
            if (r6 == 0) goto L_0x0231
            r9 = 13
            r10 = 10
            if (r2 != r9) goto L_0x01fa
            int r2 = r12.pos
            int r2 = r2 - r3
            r12.posEnd = r2
            boolean r8 = r12.usePC
            if (r8 != 0) goto L_0x01e4
            int r8 = r12.posStart
            if (r2 <= r8) goto L_0x01de
            r12.joinPC()
            goto L_0x01e4
        L_0x01de:
            r12.usePC = r3
            r12.pcEnd = r1
            r12.pcStart = r1
        L_0x01e4:
            int r2 = r12.pcEnd
            char[] r8 = r12.f30349pc
            int r8 = r8.length
            if (r2 < r8) goto L_0x01ee
            r12.ensurePC(r2)
        L_0x01ee:
            char[] r2 = r12.f30349pc
            int r8 = r12.pcEnd
            int r9 = r8 + 1
            r12.pcEnd = r9
            r2[r8] = r10
            r8 = r3
            goto L_0x0231
        L_0x01fa:
            if (r2 != r10) goto L_0x0218
            if (r8 != 0) goto L_0x0216
            boolean r2 = r12.usePC
            if (r2 == 0) goto L_0x0216
            int r2 = r12.pcEnd
            char[] r8 = r12.f30349pc
            int r8 = r8.length
            if (r2 < r8) goto L_0x020c
            r12.ensurePC(r2)
        L_0x020c:
            char[] r2 = r12.f30349pc
            int r8 = r12.pcEnd
            int r9 = r8 + 1
            r12.pcEnd = r9
            r2[r8] = r10
        L_0x0216:
            r8 = r1
            goto L_0x0231
        L_0x0218:
            boolean r8 = r12.usePC
            if (r8 == 0) goto L_0x0216
            int r8 = r12.pcEnd
            char[] r9 = r12.f30349pc
            int r9 = r9.length
            if (r8 < r9) goto L_0x0226
            r12.ensurePC(r8)
        L_0x0226:
            char[] r8 = r12.f30349pc
            int r9 = r12.pcEnd
            int r10 = r9 + 1
            r12.pcEnd = r10
            r8[r9] = r2
            goto L_0x0216
        L_0x0231:
            char r2 = r12.more()
            if (r2 == r5) goto L_0x0239
            if (r2 != r4) goto L_0x01c5
        L_0x0239:
            int r6 = r12.pos
            int r6 = r6 - r3
            r12.posEnd = r6
            r6 = r3
            goto L_0x0065
        L_0x0241:
            boolean r0 = r12.seenRoot
            if (r0 == 0) goto L_0x024a
            int r0 = r12.parseEpilog()
            return r0
        L_0x024a:
            int r0 = r12.parseProlog()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.mxp1.MXParser.nextImpl():int");
    }

    public int nextTag() throws XmlPullParserException, IOException {
        next();
        if (this.eventType == 4 && isWhitespace()) {
            next();
        }
        int i10 = this.eventType;
        if (i10 == 2 || i10 == 3) {
            return i10;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("expected START_TAG or END_TAG not ");
        stringBuffer.append(XmlPullParser.TYPES[getEventType()]);
        throw new XmlPullParserException(stringBuffer.toString(), this, (Throwable) null);
    }

    public String nextText() throws XmlPullParserException, IOException {
        if (getEventType() == 2) {
            int next = next();
            if (next == 4) {
                String text2 = getText();
                if (next() == 3) {
                    return text2;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("TEXT must be immediately followed by END_TAG and not ");
                stringBuffer.append(XmlPullParser.TYPES[getEventType()]);
                throw new XmlPullParserException(stringBuffer.toString(), this, (Throwable) null);
            } else if (next == 3) {
                return "";
            } else {
                throw new XmlPullParserException("parser must be on START_TAG or TEXT to read text", this, (Throwable) null);
            }
        } else {
            throw new XmlPullParserException("parser must be on START_TAG to read next text", this, (Throwable) null);
        }
    }

    public int nextToken() throws XmlPullParserException, IOException {
        this.tokenize = true;
        return nextImpl();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x032d, code lost:
        if (r7 != 'm') goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0335, code lost:
        if (r7 != 'l') goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x033d, code lost:
        if (r7 != 'n') goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0344, code lost:
        if (r7 != 's') goto L_0x032f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char parseAttribute() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.posStart
            int r2 = r0.bufAbsoluteStart
            int r1 = r1 + r2
            int r3 = r0.pos
            int r4 = r3 + -1
            int r4 = r4 + r2
            char[] r2 = r0.buf
            r5 = 1
            int r3 = r3 - r5
            char r2 = r2[r3]
            r3 = 0
            r6 = 58
            if (r2 != r6) goto L_0x0024
            boolean r7 = r0.processNamespaces
            if (r7 != 0) goto L_0x001c
            goto L_0x0024
        L_0x001c:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "when namespaces processing enabled colon can not be at attribute name start"
            r1.<init>(r2, r0, r3)
            throw r1
        L_0x0024:
            boolean r7 = r0.processNamespaces
            r8 = 0
            if (r7 == 0) goto L_0x002f
            r7 = 120(0x78, float:1.68E-43)
            if (r2 != r7) goto L_0x002f
            r2 = r5
            goto L_0x0030
        L_0x002f:
            r2 = r8
        L_0x0030:
            char r7 = r17.more()
            r9 = -1
            r10 = r8
            r11 = r9
        L_0x0037:
            boolean r12 = r0.isNameChar(r7)
            r13 = 4
            r14 = 2
            if (r12 != 0) goto L_0x031e
            int r6 = r0.attributeCount
            r0.ensureAttributesCapacity(r6)
            boolean r6 = r0.processNamespaces
            if (r6 == 0) goto L_0x00c2
            if (r10 >= r13) goto L_0x004b
            r2 = r8
        L_0x004b:
            if (r2 == 0) goto L_0x006f
            if (r11 == r9) goto L_0x006c
            int r4 = r0.pos
            int r4 = r4 - r14
            int r6 = r0.bufAbsoluteStart
            int r10 = r11 - r6
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0064
            char[] r10 = r0.buf
            int r6 = r11 - r6
            int r6 = r6 + r5
            java.lang.String r4 = r0.newString(r10, r6, r4)
            goto L_0x00e5
        L_0x0064:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "namespace prefix is required after xmlns:  when namespaces are enabled"
            r1.<init>(r2, r0, r3)
            throw r1
        L_0x006c:
            r4 = r3
            goto L_0x00e5
        L_0x006f:
            if (r11 == r9) goto L_0x009a
            int r6 = r11 - r4
            java.lang.String[] r10 = r0.attributePrefix
            int r12 = r0.attributeCount
            char[] r13 = r0.buf
            int r15 = r0.bufAbsoluteStart
            int r4 = r4 - r15
            java.lang.String r4 = r0.newString(r13, r4, r6)
            r10[r12] = r4
            int r4 = r0.pos
            int r4 = r4 - r14
            int r6 = r0.bufAbsoluteStart
            int r10 = r11 - r6
            int r4 = r4 - r10
            java.lang.String[] r10 = r0.attributeName
            int r12 = r0.attributeCount
            char[] r13 = r0.buf
            int r6 = r11 - r6
            int r6 = r6 + r5
            java.lang.String r4 = r0.newString(r13, r6, r4)
            r10[r12] = r4
            goto L_0x00b3
        L_0x009a:
            java.lang.String[] r6 = r0.attributePrefix
            int r10 = r0.attributeCount
            r6[r10] = r3
            java.lang.String[] r6 = r0.attributeName
            char[] r12 = r0.buf
            int r13 = r0.bufAbsoluteStart
            int r14 = r4 - r13
            int r15 = r0.pos
            int r15 = r15 - r5
            int r4 = r4 - r13
            int r15 = r15 - r4
            java.lang.String r4 = r0.newString(r12, r14, r15)
            r6[r10] = r4
        L_0x00b3:
            boolean r6 = r0.allStringsInterned
            if (r6 != 0) goto L_0x00e5
            int[] r6 = r0.attributeNameHash
            int r10 = r0.attributeCount
            int r12 = r4.hashCode()
            r6[r10] = r12
            goto L_0x00e5
        L_0x00c2:
            java.lang.String[] r6 = r0.attributeName
            int r10 = r0.attributeCount
            char[] r12 = r0.buf
            int r13 = r0.bufAbsoluteStart
            int r14 = r4 - r13
            int r15 = r0.pos
            int r15 = r15 - r5
            int r4 = r4 - r13
            int r15 = r15 - r4
            java.lang.String r4 = r0.newString(r12, r14, r15)
            r6[r10] = r4
            boolean r6 = r0.allStringsInterned
            if (r6 != 0) goto L_0x00e5
            int[] r6 = r0.attributeNameHash
            int r10 = r0.attributeCount
            int r12 = r4.hashCode()
            r6[r10] = r12
        L_0x00e5:
            boolean r6 = r0.isS(r7)
            if (r6 != 0) goto L_0x0317
            r6 = 61
            if (r7 != r6) goto L_0x030f
            char r6 = r17.more()
        L_0x00f3:
            boolean r7 = r0.isS(r6)
            if (r7 != 0) goto L_0x0308
            r7 = 34
            if (r6 == r7) goto L_0x011d
            r7 = 39
            if (r6 != r7) goto L_0x0102
            goto L_0x011d
        L_0x0102:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r4 = "attribute value must start with quotation or apostrophe not "
            r2.append(r4)
            java.lang.String r4 = r0.printable((char) r6)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0, r3)
            throw r1
        L_0x011d:
            r0.usePC = r8
            int r7 = r0.pcEnd
            r0.pcStart = r7
            int r7 = r0.pos
            r0.posStart = r7
            r7 = r8
        L_0x0128:
            char r10 = r17.more()
            java.lang.String r12 = "'"
            if (r10 != r6) goto L_0x022b
            boolean r6 = r0.processNamespaces
            if (r6 == 0) goto L_0x01f6
            if (r2 == 0) goto L_0x01f6
            boolean r2 = r0.usePC
            if (r2 != 0) goto L_0x0147
            char[] r2 = r0.buf
            int r6 = r0.posStart
            int r7 = r0.pos
            int r7 = r7 - r5
            int r7 = r7 - r6
            java.lang.String r2 = r0.newStringIntern(r2, r6, r7)
            goto L_0x0152
        L_0x0147:
            char[] r2 = r0.f30349pc
            int r6 = r0.pcStart
            int r7 = r0.pcEnd
            int r7 = r7 - r6
            java.lang.String r2 = r0.newStringIntern(r2, r6, r7)
        L_0x0152:
            int r6 = r0.namespaceEnd
            r0.ensureNamespacesCapacity(r6)
            if (r11 == r9) goto L_0x017a
            int r6 = r2.length()
            if (r6 == 0) goto L_0x0172
            java.lang.String[] r6 = r0.namespacePrefix
            int r7 = r0.namespaceEnd
            r6[r7] = r4
            boolean r6 = r0.allStringsInterned
            if (r6 != 0) goto L_0x0188
            int[] r6 = r0.namespacePrefixHash
            int r9 = r4.hashCode()
            r6[r7] = r9
            goto L_0x0188
        L_0x0172:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "non-default namespace can not be declared to be empty string"
            r1.<init>(r2, r0, r3)
            throw r1
        L_0x017a:
            java.lang.String[] r6 = r0.namespacePrefix
            int r7 = r0.namespaceEnd
            r6[r7] = r3
            boolean r6 = r0.allStringsInterned
            if (r6 != 0) goto L_0x0188
            int[] r6 = r0.namespacePrefixHash
            r6[r7] = r9
        L_0x0188:
            java.lang.String[] r6 = r0.namespaceUri
            int r7 = r0.namespaceEnd
            r6[r7] = r2
            int[] r2 = r0.elNamespaceCount
            int r6 = r0.depth
            int r6 = r6 - r5
            r2 = r2[r6]
            int r7 = r7 - r5
        L_0x0196:
            if (r7 >= r2) goto L_0x019f
            int r2 = r0.namespaceEnd
            int r2 = r2 + r5
            r0.namespaceEnd = r2
            goto L_0x0225
        L_0x019f:
            boolean r6 = r0.allStringsInterned
            if (r6 != 0) goto L_0x01a5
            if (r4 != 0) goto L_0x01ab
        L_0x01a5:
            java.lang.String[] r8 = r0.namespacePrefix
            r8 = r8[r7]
            if (r8 == r4) goto L_0x01c3
        L_0x01ab:
            if (r6 != 0) goto L_0x01c0
            if (r4 == 0) goto L_0x01c0
            int[] r6 = r0.namespacePrefixHash
            r6 = r6[r7]
            if (r6 != r9) goto L_0x01c0
            java.lang.String[] r6 = r0.namespacePrefix
            r6 = r6[r7]
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x01c0
            goto L_0x01c3
        L_0x01c0:
            int r7 = r7 + -1
            goto L_0x0196
        L_0x01c3:
            if (r4 != 0) goto L_0x01c8
            java.lang.String r1 = "default"
            goto L_0x01da
        L_0x01c8:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r12)
            r1.append(r4)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
        L_0x01da:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r5 = "duplicated namespace declaration for "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " prefix"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1, r0, r3)
            throw r2
        L_0x01f6:
            boolean r2 = r0.usePC
            if (r2 != 0) goto L_0x020e
            java.lang.String[] r2 = r0.attributeValue
            int r3 = r0.attributeCount
            java.lang.String r4 = new java.lang.String
            char[] r6 = r0.buf
            int r7 = r0.posStart
            int r8 = r0.pos
            int r8 = r8 - r5
            int r8 = r8 - r7
            r4.<init>(r6, r7, r8)
            r2[r3] = r4
            goto L_0x0220
        L_0x020e:
            java.lang.String[] r2 = r0.attributeValue
            int r3 = r0.attributeCount
            java.lang.String r4 = new java.lang.String
            char[] r6 = r0.f30349pc
            int r7 = r0.pcStart
            int r8 = r0.pcEnd
            int r8 = r8 - r7
            r4.<init>(r6, r7, r8)
            r2[r3] = r4
        L_0x0220:
            int r2 = r0.attributeCount
            int r2 = r2 + r5
            r0.attributeCount = r2
        L_0x0225:
            int r2 = r0.bufAbsoluteStart
            int r1 = r1 - r2
            r0.posStart = r1
            return r10
        L_0x022b:
            r13 = 60
            if (r10 == r13) goto L_0x0300
            r13 = 38
            r14 = 13
            if (r10 != r13) goto L_0x02a3
            int r7 = r0.pos
            int r7 = r7 - r5
            r0.posEnd = r7
            boolean r13 = r0.usePC
            if (r13 != 0) goto L_0x024c
            int r13 = r0.posStart
            if (r7 <= r13) goto L_0x0246
            r17.joinPC()
            goto L_0x024c
        L_0x0246:
            r0.usePC = r5
            r0.pcEnd = r8
            r0.pcStart = r8
        L_0x024c:
            char[] r13 = r17.parseEntityRef()
            if (r13 != 0) goto L_0x0283
            java.lang.String r1 = r0.entityRefName
            if (r1 != 0) goto L_0x0263
            char[] r1 = r0.buf
            int r2 = r0.posStart
            int r4 = r0.posEnd
            int r4 = r4 - r2
            java.lang.String r1 = r0.newString(r1, r2, r4)
            r0.entityRefName = r1
        L_0x0263:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r4 = "could not resolve entity named '"
            r2.append(r4)
            java.lang.String r4 = r0.entityRefName
            java.lang.String r4 = r0.printable((java.lang.String) r4)
            r2.append(r4)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0, r3)
            throw r1
        L_0x0283:
            r7 = r8
        L_0x0284:
            int r12 = r13.length
            if (r7 < r12) goto L_0x0289
            goto L_0x02f8
        L_0x0289:
            int r12 = r0.pcEnd
            char[] r15 = r0.f30349pc
            int r15 = r15.length
            if (r12 < r15) goto L_0x0293
            r0.ensurePC(r12)
        L_0x0293:
            char[] r12 = r0.f30349pc
            int r15 = r0.pcEnd
            int r9 = r15 + 1
            r0.pcEnd = r9
            char r9 = r13[r7]
            r12[r15] = r9
            int r7 = r7 + 1
            r9 = -1
            goto L_0x0284
        L_0x02a3:
            r9 = 9
            r12 = 10
            if (r10 == r9) goto L_0x02c7
            if (r10 == r12) goto L_0x02c7
            if (r10 != r14) goto L_0x02ae
            goto L_0x02c7
        L_0x02ae:
            boolean r7 = r0.usePC
            if (r7 == 0) goto L_0x02f8
            int r7 = r0.pcEnd
            char[] r9 = r0.f30349pc
            int r9 = r9.length
            if (r7 < r9) goto L_0x02bc
            r0.ensurePC(r7)
        L_0x02bc:
            char[] r7 = r0.f30349pc
            int r9 = r0.pcEnd
            int r12 = r9 + 1
            r0.pcEnd = r12
            r7[r9] = r10
            goto L_0x02f8
        L_0x02c7:
            boolean r9 = r0.usePC
            if (r9 != 0) goto L_0x02de
            int r9 = r0.pos
            int r9 = r9 - r5
            r0.posEnd = r9
            int r13 = r0.posStart
            if (r9 <= r13) goto L_0x02d8
            r17.joinPC()
            goto L_0x02de
        L_0x02d8:
            r0.usePC = r5
            r0.pcStart = r8
            r0.pcEnd = r8
        L_0x02de:
            int r9 = r0.pcEnd
            char[] r13 = r0.f30349pc
            int r13 = r13.length
            if (r9 < r13) goto L_0x02e8
            r0.ensurePC(r9)
        L_0x02e8:
            if (r10 != r12) goto L_0x02ec
            if (r7 != 0) goto L_0x02f8
        L_0x02ec:
            char[] r7 = r0.f30349pc
            int r9 = r0.pcEnd
            int r12 = r9 + 1
            r0.pcEnd = r12
            r12 = 32
            r7[r9] = r12
        L_0x02f8:
            if (r10 != r14) goto L_0x02fc
            r7 = r5
            goto L_0x02fd
        L_0x02fc:
            r7 = r8
        L_0x02fd:
            r9 = -1
            goto L_0x0128
        L_0x0300:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "markup not allowed inside attribute value - illegal < "
            r1.<init>(r2, r0, r3)
            throw r1
        L_0x0308:
            char r6 = r17.more()
            r9 = -1
            goto L_0x00f3
        L_0x030f:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "expected = after attribute name"
            r1.<init>(r2, r0, r3)
            throw r1
        L_0x0317:
            char r7 = r17.more()
            r9 = -1
            goto L_0x00e5
        L_0x031e:
            boolean r9 = r0.processNamespaces
            if (r9 == 0) goto L_0x0368
            if (r2 == 0) goto L_0x0354
            r9 = 5
            if (r10 >= r9) goto L_0x0354
            int r10 = r10 + 1
            if (r10 != r5) goto L_0x0331
            r9 = 109(0x6d, float:1.53E-43)
            if (r7 == r9) goto L_0x0354
        L_0x032f:
            r2 = r8
            goto L_0x0354
        L_0x0331:
            if (r10 != r14) goto L_0x0338
            r9 = 108(0x6c, float:1.51E-43)
            if (r7 == r9) goto L_0x0354
            goto L_0x032f
        L_0x0338:
            r12 = 3
            if (r10 != r12) goto L_0x0340
            r9 = 110(0x6e, float:1.54E-43)
            if (r7 == r9) goto L_0x0354
            goto L_0x032f
        L_0x0340:
            if (r10 != r13) goto L_0x0347
            r9 = 115(0x73, float:1.61E-43)
            if (r7 == r9) goto L_0x0354
            goto L_0x032f
        L_0x0347:
            if (r10 != r9) goto L_0x0354
            if (r7 != r6) goto L_0x034c
            goto L_0x0354
        L_0x034c:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "after xmlns in attribute name must be colonwhen namespaces are enabled"
            r1.<init>(r2, r0, r3)
            throw r1
        L_0x0354:
            if (r7 != r6) goto L_0x0368
            r7 = -1
            if (r11 != r7) goto L_0x0360
            int r9 = r0.pos
            int r9 = r9 - r5
            int r11 = r0.bufAbsoluteStart
            int r11 = r11 + r9
            goto L_0x0369
        L_0x0360:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "only one colon is allowed in attribute name when namespaces are enabled"
            r1.<init>(r2, r0, r3)
            throw r1
        L_0x0368:
            r7 = -1
        L_0x0369:
            char r9 = r17.more()
            r16 = r9
            r9 = r7
            r7 = r16
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.mxp1.MXParser.parseAttribute():char");
    }

    /* access modifiers changed from: protected */
    public void parseCDSect(boolean z10) throws XmlPullParserException, IOException {
        if (more() != 'C') {
            throw new XmlPullParserException("expected <[CDATA[ for comment start", this, (Throwable) null);
        } else if (more() != 'D') {
            throw new XmlPullParserException("expected <[CDATA[ for comment start", this, (Throwable) null);
        } else if (more() != 'A') {
            throw new XmlPullParserException("expected <[CDATA[ for comment start", this, (Throwable) null);
        } else if (more() != 'T') {
            throw new XmlPullParserException("expected <[CDATA[ for comment start", this, (Throwable) null);
        } else if (more() != 'A') {
            throw new XmlPullParserException("expected <[CDATA[ for comment start", this, (Throwable) null);
        } else if (more() == '[') {
            int i10 = this.pos + this.bufAbsoluteStart;
            int i11 = this.lineNumber;
            int i12 = this.columnNumber;
            boolean z11 = !this.tokenize || !this.roundtripSupported;
            if (z11 && z10) {
                try {
                    if (!this.usePC) {
                        if (this.posEnd > this.posStart) {
                            joinPC();
                        } else {
                            this.usePC = true;
                            this.pcEnd = 0;
                            this.pcStart = 0;
                        }
                    }
                } catch (EOFException e10) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("CDATA section started on line ");
                    stringBuffer.append(i11);
                    stringBuffer.append(" and column ");
                    stringBuffer.append(i12);
                    stringBuffer.append(" was not closed");
                    throw new XmlPullParserException(stringBuffer.toString(), this, e10);
                }
            }
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            while (true) {
                char more = more();
                if (more == ']') {
                    if (!z12) {
                        z12 = true;
                    } else {
                        z13 = true;
                    }
                } else if (more != '>') {
                    z12 = false;
                } else if (z13) {
                    break;
                } else {
                    z12 = false;
                    z13 = false;
                }
                if (z11) {
                    if (more == 13) {
                        int i13 = i10 - this.bufAbsoluteStart;
                        this.posStart = i13;
                        int i14 = this.pos;
                        this.posEnd = i14;
                        if (!this.usePC) {
                            if (i14 > i13) {
                                joinPC();
                            } else {
                                this.usePC = true;
                                this.pcEnd = 0;
                                this.pcStart = 0;
                            }
                        }
                        int i15 = this.pcEnd;
                        if (i15 >= this.f30349pc.length) {
                            ensurePC(i15);
                        }
                        char[] cArr = this.f30349pc;
                        int i16 = this.pcEnd;
                        this.pcEnd = i16 + 1;
                        cArr[i16] = 10;
                        z14 = true;
                    } else {
                        if (more == 10) {
                            if (!z14 && this.usePC) {
                                int i17 = this.pcEnd;
                                if (i17 >= this.f30349pc.length) {
                                    ensurePC(i17);
                                }
                                char[] cArr2 = this.f30349pc;
                                int i18 = this.pcEnd;
                                this.pcEnd = i18 + 1;
                                cArr2[i18] = 10;
                            }
                        } else if (this.usePC) {
                            int i19 = this.pcEnd;
                            if (i19 >= this.f30349pc.length) {
                                ensurePC(i19);
                            }
                            char[] cArr3 = this.f30349pc;
                            int i20 = this.pcEnd;
                            this.pcEnd = i20 + 1;
                            cArr3[i20] = more;
                        }
                        z14 = false;
                    }
                }
            }
            if (z11 && this.usePC) {
                this.pcEnd -= 2;
            }
            this.posStart = i10 - this.bufAbsoluteStart;
            this.posEnd = this.pos - 3;
        } else {
            throw new XmlPullParserException("expected <[CDATA[ for comment start", this, (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e A[Catch:{ EOFException -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0026 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void parseComment() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r13 = this;
            char r0 = r13.more()
            r1 = 0
            r2 = 45
            if (r0 != r2) goto L_0x0101
            boolean r0 = r13.tokenize
            if (r0 == 0) goto L_0x0011
            int r3 = r13.pos
            r13.posStart = r3
        L_0x0011:
            int r3 = r13.lineNumber
            int r4 = r13.columnNumber
            r5 = 1
            r6 = 0
            if (r0 != r5) goto L_0x0022
            boolean r0 = r13.roundtripSupported     // Catch:{ EOFException -> 0x001f }
            if (r0 != 0) goto L_0x0022
            r0 = r5
            goto L_0x0023
        L_0x001f:
            r0 = move-exception
            goto L_0x00dd
        L_0x0022:
            r0 = r6
        L_0x0023:
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0026:
            char r10 = r13.more()     // Catch:{ EOFException -> 0x001f }
            r11 = 62
            if (r7 == 0) goto L_0x004c
            if (r10 != r11) goto L_0x0031
            goto L_0x004c
        L_0x0031:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ EOFException -> 0x001f }
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ EOFException -> 0x001f }
            r2.<init>()     // Catch:{ EOFException -> 0x001f }
            java.lang.String r5 = "in comment after two dashes (--) next character must be > not "
            r2.append(r5)     // Catch:{ EOFException -> 0x001f }
            java.lang.String r5 = r13.printable((char) r10)     // Catch:{ EOFException -> 0x001f }
            r2.append(r5)     // Catch:{ EOFException -> 0x001f }
            java.lang.String r2 = r2.toString()     // Catch:{ EOFException -> 0x001f }
            r0.<init>(r2, r13, r1)     // Catch:{ EOFException -> 0x001f }
            throw r0     // Catch:{ EOFException -> 0x001f }
        L_0x004c:
            if (r10 != r2) goto L_0x0055
            if (r8 != 0) goto L_0x0052
            r8 = r5
            goto L_0x0070
        L_0x0052:
            r7 = r5
        L_0x0053:
            r8 = r6
            goto L_0x0070
        L_0x0055:
            if (r10 != r11) goto L_0x0053
            if (r7 == 0) goto L_0x006e
            boolean r0 = r13.tokenize
            if (r0 == 0) goto L_0x006d
            int r0 = r13.pos
            int r0 = r0 + -3
            r13.posEnd = r0
            boolean r0 = r13.usePC
            if (r0 == 0) goto L_0x006d
            int r0 = r13.pcEnd
            int r0 = r0 + -2
            r13.pcEnd = r0
        L_0x006d:
            return
        L_0x006e:
            r7 = r6
            r8 = r7
        L_0x0070:
            if (r0 == 0) goto L_0x0026
            r11 = 13
            r12 = 10
            if (r10 != r11) goto L_0x00a5
            boolean r9 = r13.usePC     // Catch:{ EOFException -> 0x001f }
            if (r9 != 0) goto L_0x008f
            int r9 = r13.pos     // Catch:{ EOFException -> 0x001f }
            int r9 = r9 - r5
            r13.posEnd = r9     // Catch:{ EOFException -> 0x001f }
            int r10 = r13.posStart     // Catch:{ EOFException -> 0x001f }
            if (r9 <= r10) goto L_0x0089
            r13.joinPC()     // Catch:{ EOFException -> 0x001f }
            goto L_0x008f
        L_0x0089:
            r13.usePC = r5     // Catch:{ EOFException -> 0x001f }
            r13.pcEnd = r6     // Catch:{ EOFException -> 0x001f }
            r13.pcStart = r6     // Catch:{ EOFException -> 0x001f }
        L_0x008f:
            int r9 = r13.pcEnd     // Catch:{ EOFException -> 0x001f }
            char[] r10 = r13.f30349pc     // Catch:{ EOFException -> 0x001f }
            int r10 = r10.length     // Catch:{ EOFException -> 0x001f }
            if (r9 < r10) goto L_0x0099
            r13.ensurePC(r9)     // Catch:{ EOFException -> 0x001f }
        L_0x0099:
            char[] r9 = r13.f30349pc     // Catch:{ EOFException -> 0x001f }
            int r10 = r13.pcEnd     // Catch:{ EOFException -> 0x001f }
            int r11 = r10 + 1
            r13.pcEnd = r11     // Catch:{ EOFException -> 0x001f }
            r9[r10] = r12     // Catch:{ EOFException -> 0x001f }
            r9 = r5
            goto L_0x0026
        L_0x00a5:
            if (r10 != r12) goto L_0x00c4
            if (r9 != 0) goto L_0x00c1
            boolean r9 = r13.usePC     // Catch:{ EOFException -> 0x001f }
            if (r9 == 0) goto L_0x00c1
            int r9 = r13.pcEnd     // Catch:{ EOFException -> 0x001f }
            char[] r10 = r13.f30349pc     // Catch:{ EOFException -> 0x001f }
            int r10 = r10.length     // Catch:{ EOFException -> 0x001f }
            if (r9 < r10) goto L_0x00b7
            r13.ensurePC(r9)     // Catch:{ EOFException -> 0x001f }
        L_0x00b7:
            char[] r9 = r13.f30349pc     // Catch:{ EOFException -> 0x001f }
            int r10 = r13.pcEnd     // Catch:{ EOFException -> 0x001f }
            int r11 = r10 + 1
            r13.pcEnd = r11     // Catch:{ EOFException -> 0x001f }
            r9[r10] = r12     // Catch:{ EOFException -> 0x001f }
        L_0x00c1:
            r9 = r6
            goto L_0x0026
        L_0x00c4:
            boolean r9 = r13.usePC     // Catch:{ EOFException -> 0x001f }
            if (r9 == 0) goto L_0x00c1
            int r9 = r13.pcEnd     // Catch:{ EOFException -> 0x001f }
            char[] r11 = r13.f30349pc     // Catch:{ EOFException -> 0x001f }
            int r11 = r11.length     // Catch:{ EOFException -> 0x001f }
            if (r9 < r11) goto L_0x00d2
            r13.ensurePC(r9)     // Catch:{ EOFException -> 0x001f }
        L_0x00d2:
            char[] r9 = r13.f30349pc     // Catch:{ EOFException -> 0x001f }
            int r11 = r13.pcEnd     // Catch:{ EOFException -> 0x001f }
            int r12 = r11 + 1
            r13.pcEnd = r12     // Catch:{ EOFException -> 0x001f }
            r9[r11] = r10     // Catch:{ EOFException -> 0x001f }
            goto L_0x00c1
        L_0x00dd:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r5 = "comment started on line "
            r2.append(r5)
            r2.append(r3)
            java.lang.String r3 = " and column "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " was not closed"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r13, r0)
            throw r1
        L_0x0101:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "expected <!-- for comment start"
            r0.<init>(r2, r13, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.mxp1.MXParser.parseComment():void");
    }

    /* access modifiers changed from: protected */
    public void parseDocdecl() throws XmlPullParserException, IOException {
        if (more() != 'O') {
            throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
        } else if (more() != 'C') {
            throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
        } else if (more() != 'T') {
            throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
        } else if (more() != 'Y') {
            throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
        } else if (more() != 'P') {
            throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
        } else if (more() == 'E') {
            this.posStart = this.pos;
            boolean z10 = this.tokenize && !this.roundtripSupported;
            int i10 = 0;
            boolean z11 = false;
            while (true) {
                char more = more();
                if (more == '[') {
                    i10++;
                }
                if (more == ']') {
                    i10--;
                }
                if (more == '>' && i10 == 0) {
                    this.posEnd = this.pos - 1;
                    return;
                } else if (z10) {
                    if (more == 13) {
                        if (!this.usePC) {
                            int i11 = this.pos - 1;
                            this.posEnd = i11;
                            if (i11 > this.posStart) {
                                joinPC();
                            } else {
                                this.usePC = true;
                                this.pcEnd = 0;
                                this.pcStart = 0;
                            }
                        }
                        int i12 = this.pcEnd;
                        if (i12 >= this.f30349pc.length) {
                            ensurePC(i12);
                        }
                        char[] cArr = this.f30349pc;
                        int i13 = this.pcEnd;
                        this.pcEnd = i13 + 1;
                        cArr[i13] = 10;
                        z11 = true;
                    } else {
                        if (more == 10) {
                            if (!z11 && this.usePC) {
                                int i14 = this.pcEnd;
                                if (i14 >= this.f30349pc.length) {
                                    ensurePC(i14);
                                }
                                char[] cArr2 = this.f30349pc;
                                int i15 = this.pcEnd;
                                this.pcEnd = i15 + 1;
                                cArr2[i15] = 10;
                            }
                        } else if (this.usePC) {
                            int i16 = this.pcEnd;
                            if (i16 >= this.f30349pc.length) {
                                ensurePC(i16);
                            }
                            char[] cArr3 = this.f30349pc;
                            int i17 = this.pcEnd;
                            this.pcEnd = i17 + 1;
                            cArr3[i17] = more;
                        }
                        z11 = false;
                    }
                }
            }
        } else {
            throw new XmlPullParserException("expected <!DOCTYPE", this, (Throwable) null);
        }
    }

    public int parseEndTag() throws XmlPullParserException, IOException {
        char more;
        char more2 = more();
        if (isNameStartChar(more2)) {
            int i10 = this.pos;
            this.posStart = i10 - 3;
            int i11 = this.bufAbsoluteStart + (i10 - 1);
            do {
                more = more();
            } while (isNameChar(more));
            int i12 = i11 - this.bufAbsoluteStart;
            int i13 = (this.pos - 1) - i12;
            char[][] cArr = this.elRawName;
            int i14 = this.depth;
            char[] cArr2 = cArr[i14];
            int i15 = this.elRawNameEnd[i14];
            if (i15 == i13) {
                int i16 = 0;
                while (i16 < i13) {
                    int i17 = i12 + 1;
                    if (this.buf[i12] == cArr2[i16]) {
                        i16++;
                        i12 = i17;
                    } else {
                        String str = new String(cArr2, 0, i13);
                        String str2 = new String(this.buf, (i17 - i16) - 1, i13);
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("end tag name </");
                        stringBuffer.append(str2);
                        stringBuffer.append("> must be the same as start tag <");
                        stringBuffer.append(str);
                        stringBuffer.append(">");
                        stringBuffer.append(" from line ");
                        stringBuffer.append(this.elRawNameLine[this.depth]);
                        throw new XmlPullParserException(stringBuffer.toString(), this, (Throwable) null);
                    }
                }
                while (isS(more)) {
                    more = more();
                }
                if (more == '>') {
                    this.posEnd = this.pos;
                    this.pastEndTag = true;
                    this.eventType = 3;
                    return 3;
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("expected > to finsh end tag not ");
                stringBuffer2.append(printable(more));
                stringBuffer2.append(" from line ");
                stringBuffer2.append(this.elRawNameLine[this.depth]);
                throw new XmlPullParserException(stringBuffer2.toString(), this, (Throwable) null);
            }
            String str3 = new String(cArr2, 0, i15);
            String str4 = new String(this.buf, i12, i13);
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("end tag name </");
            stringBuffer3.append(str4);
            stringBuffer3.append("> must match start tag name <");
            stringBuffer3.append(str3);
            stringBuffer3.append(">");
            stringBuffer3.append(" from line ");
            stringBuffer3.append(this.elRawNameLine[this.depth]);
            throw new XmlPullParserException(stringBuffer3.toString(), this, (Throwable) null);
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("expected name start and not ");
        stringBuffer4.append(printable(more2));
        throw new XmlPullParserException(stringBuffer4.toString(), this, (Throwable) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] parseEntityRef() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            r0 = 0
            r12.entityRefName = r0
            int r1 = r12.pos
            r12.posStart = r1
            char r1 = r12.more()
            r2 = 35
            r3 = 59
            r4 = 97
            r5 = 1
            r6 = 0
            if (r1 != r2) goto L_0x00ab
            char r1 = r12.more()
            r2 = 120(0x78, float:1.68E-43)
            r7 = 57
            r8 = 48
            if (r1 != r2) goto L_0x0067
            r1 = r6
        L_0x0022:
            char r2 = r12.more()
            if (r2 < r8) goto L_0x0031
            if (r2 > r7) goto L_0x0031
            int r1 = r1 * 16
            int r2 = r2 + -48
        L_0x002e:
            int r1 = r1 + r2
            char r1 = (char) r1
            goto L_0x0022
        L_0x0031:
            if (r2 < r4) goto L_0x003c
            r9 = 102(0x66, float:1.43E-43)
            if (r2 > r9) goto L_0x003c
            int r1 = r1 * 16
            int r2 = r2 + -87
            goto L_0x002e
        L_0x003c:
            r9 = 65
            if (r2 < r9) goto L_0x0049
            r9 = 70
            if (r2 > r9) goto L_0x0049
            int r1 = r1 * 16
            int r2 = r2 + -55
            goto L_0x002e
        L_0x0049:
            if (r2 != r3) goto L_0x004c
            goto L_0x007a
        L_0x004c:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "character reference (with hex value) may not contain "
            r3.append(r4)
            java.lang.String r2 = r12.printable((char) r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r12, r0)
            throw r1
        L_0x0067:
            r2 = r6
        L_0x0068:
            if (r1 < r8) goto L_0x0077
            if (r1 > r7) goto L_0x0077
            int r2 = r2 * 10
            int r1 = r1 + -48
            int r2 = r2 + r1
            char r2 = (char) r2
            char r1 = r12.more()
            goto L_0x0068
        L_0x0077:
            if (r1 != r3) goto L_0x0090
            r1 = r2
        L_0x007a:
            int r0 = r12.pos
            int r0 = r0 - r5
            r12.posEnd = r0
            char[] r0 = r12.charRefOneCharBuf
            r0[r6] = r1
            boolean r1 = r12.tokenize
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = r12.newString(r0, r6, r5)
            r12.text = r0
        L_0x008d:
            char[] r0 = r12.charRefOneCharBuf
            return r0
        L_0x0090:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = "character reference (with decimal value) may not contain "
            r3.append(r4)
            java.lang.String r1 = r12.printable((char) r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r12, r0)
            throw r2
        L_0x00ab:
            char r1 = r12.more()
            if (r1 != r3) goto L_0x00ab
            int r1 = r12.pos
            int r1 = r1 - r5
            r12.posEnd = r1
            int r2 = r12.posStart
            int r1 = r1 - r2
            r3 = 116(0x74, float:1.63E-43)
            r5 = 2
            if (r1 != r5) goto L_0x00db
            char[] r7 = r12.buf
            char r8 = r7[r2]
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 != r9) goto L_0x00db
            int r8 = r2 + 1
            char r7 = r7[r8]
            if (r7 != r3) goto L_0x00db
            boolean r0 = r12.tokenize
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "<"
            r12.text = r0
        L_0x00d4:
            char[] r0 = r12.charRefOneCharBuf
            r1 = 60
            r0[r6] = r1
            return r0
        L_0x00db:
            r7 = 112(0x70, float:1.57E-43)
            r8 = 3
            if (r1 != r8) goto L_0x0103
            char[] r9 = r12.buf
            char r10 = r9[r2]
            if (r10 != r4) goto L_0x0103
            int r10 = r2 + 1
            char r10 = r9[r10]
            r11 = 109(0x6d, float:1.53E-43)
            if (r10 != r11) goto L_0x0103
            int r10 = r2 + 2
            char r9 = r9[r10]
            if (r9 != r7) goto L_0x0103
            boolean r0 = r12.tokenize
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = "&"
            r12.text = r0
        L_0x00fc:
            char[] r0 = r12.charRefOneCharBuf
            r1 = 38
            r0[r6] = r1
            return r0
        L_0x0103:
            if (r1 != r5) goto L_0x0122
            char[] r5 = r12.buf
            char r9 = r5[r2]
            r10 = 103(0x67, float:1.44E-43)
            if (r9 != r10) goto L_0x0122
            int r9 = r2 + 1
            char r5 = r5[r9]
            if (r5 != r3) goto L_0x0122
            boolean r0 = r12.tokenize
            if (r0 == 0) goto L_0x011b
            java.lang.String r0 = ">"
            r12.text = r0
        L_0x011b:
            char[] r0 = r12.charRefOneCharBuf
            r1 = 62
            r0[r6] = r1
            return r0
        L_0x0122:
            r5 = 111(0x6f, float:1.56E-43)
            r9 = 4
            if (r1 != r9) goto L_0x0150
            char[] r10 = r12.buf
            char r11 = r10[r2]
            if (r11 != r4) goto L_0x0150
            int r4 = r2 + 1
            char r4 = r10[r4]
            if (r4 != r7) goto L_0x0150
            int r4 = r2 + 2
            char r4 = r10[r4]
            if (r4 != r5) goto L_0x0150
            int r4 = r2 + 3
            char r4 = r10[r4]
            r7 = 115(0x73, float:1.61E-43)
            if (r4 != r7) goto L_0x0150
            boolean r0 = r12.tokenize
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = "'"
            r12.text = r0
        L_0x0149:
            char[] r0 = r12.charRefOneCharBuf
            r1 = 39
            r0[r6] = r1
            return r0
        L_0x0150:
            if (r1 != r9) goto L_0x017c
            char[] r4 = r12.buf
            char r7 = r4[r2]
            r9 = 113(0x71, float:1.58E-43)
            if (r7 != r9) goto L_0x017c
            int r7 = r2 + 1
            char r7 = r4[r7]
            r9 = 117(0x75, float:1.64E-43)
            if (r7 != r9) goto L_0x017c
            int r7 = r2 + 2
            char r7 = r4[r7]
            if (r7 != r5) goto L_0x017c
            int r2 = r2 + r8
            char r2 = r4[r2]
            if (r2 != r3) goto L_0x017c
            boolean r0 = r12.tokenize
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = "\""
            r12.text = r0
        L_0x0175:
            char[] r0 = r12.charRefOneCharBuf
            r1 = 34
            r0[r6] = r1
            return r0
        L_0x017c:
            char[] r1 = r12.lookuEntityReplacement(r1)
            if (r1 == 0) goto L_0x0183
            return r1
        L_0x0183:
            boolean r1 = r12.tokenize
            if (r1 == 0) goto L_0x0189
            r12.text = r0
        L_0x0189:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.mxp1.MXParser.parseEntityRef():char[]");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0199 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int parseEpilog() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r10 = this;
            int r0 = r10.eventType
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x01a5
            boolean r0 = r10.reachedEnd
            if (r0 == 0) goto L_0x000d
            r10.eventType = r2
            return r2
        L_0x000d:
            boolean r0 = r10.tokenize
            r3 = 0
            if (r0 != r2) goto L_0x0018
            boolean r0 = r10.roundtripSupported
            if (r0 != 0) goto L_0x0018
            r0 = r2
            goto L_0x0019
        L_0x0018:
            r0 = r3
        L_0x0019:
            r4 = 7
            boolean r5 = r10.seenMarkup     // Catch:{ EOFException -> 0x0193 }
            if (r5 == 0) goto L_0x0026
            char[] r5 = r10.buf     // Catch:{ EOFException -> 0x0193 }
            int r6 = r10.pos     // Catch:{ EOFException -> 0x0193 }
            int r6 = r6 - r2
            char r5 = r5[r6]     // Catch:{ EOFException -> 0x0193 }
            goto L_0x002a
        L_0x0026:
            char r5 = r10.more()     // Catch:{ EOFException -> 0x0193 }
        L_0x002a:
            r10.seenMarkup = r3     // Catch:{ EOFException -> 0x0193 }
            int r6 = r10.pos     // Catch:{ EOFException -> 0x0193 }
            int r6 = r6 - r2
            r10.posStart = r6     // Catch:{ EOFException -> 0x0193 }
            r6 = r3
            r7 = r6
        L_0x0033:
            r8 = 60
            r9 = 10
            if (r5 != r8) goto L_0x00fc
            if (r6 == 0) goto L_0x004c
            boolean r5 = r10.tokenize     // Catch:{ EOFException -> 0x0049 }
            if (r5 == 0) goto L_0x004c
            int r0 = r10.pos     // Catch:{ EOFException -> 0x0049 }
            int r0 = r0 - r2
            r10.posEnd = r0     // Catch:{ EOFException -> 0x0049 }
            r10.seenMarkup = r2     // Catch:{ EOFException -> 0x0049 }
            r10.eventType = r4     // Catch:{ EOFException -> 0x0049 }
            return r4
        L_0x0049:
            r3 = r6
            goto L_0x0193
        L_0x004c:
            char r5 = r10.more()     // Catch:{ EOFException -> 0x0049 }
            r8 = 63
            if (r5 != r8) goto L_0x0060
            r10.parsePI()     // Catch:{ EOFException -> 0x0049 }
            boolean r5 = r10.tokenize     // Catch:{ EOFException -> 0x0049 }
            if (r5 == 0) goto L_0x0172
            r0 = 8
            r10.eventType = r0     // Catch:{ EOFException -> 0x0049 }
            return r0
        L_0x0060:
            r8 = 33
            if (r5 != r8) goto L_0x00a1
            char r5 = r10.more()     // Catch:{ EOFException -> 0x0049 }
            r8 = 68
            if (r5 != r8) goto L_0x0076
            r10.parseDocdecl()     // Catch:{ EOFException -> 0x0049 }
            boolean r5 = r10.tokenize     // Catch:{ EOFException -> 0x0049 }
            if (r5 == 0) goto L_0x0172
            r10.eventType = r9     // Catch:{ EOFException -> 0x0049 }
            return r9
        L_0x0076:
            r8 = 45
            if (r5 != r8) goto L_0x0086
            r10.parseComment()     // Catch:{ EOFException -> 0x0049 }
            boolean r5 = r10.tokenize     // Catch:{ EOFException -> 0x0049 }
            if (r5 == 0) goto L_0x0172
            r0 = 9
            r10.eventType = r0     // Catch:{ EOFException -> 0x0049 }
            return r0
        L_0x0086:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ EOFException -> 0x0049 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ EOFException -> 0x0049 }
            r3.<init>()     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r7 = "unexpected markup <!"
            r3.append(r7)     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r5 = r10.printable((char) r5)     // Catch:{ EOFException -> 0x0049 }
            r3.append(r5)     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r3 = r3.toString()     // Catch:{ EOFException -> 0x0049 }
            r0.<init>(r3, r10, r1)     // Catch:{ EOFException -> 0x0049 }
            throw r0     // Catch:{ EOFException -> 0x0049 }
        L_0x00a1:
            r0 = 47
            if (r5 == r0) goto L_0x00e1
            boolean r0 = r10.isNameStartChar(r5)     // Catch:{ EOFException -> 0x0049 }
            if (r0 == 0) goto L_0x00c6
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ EOFException -> 0x0049 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ EOFException -> 0x0049 }
            r3.<init>()     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r7 = "start tag not allowed in epilog but got "
            r3.append(r7)     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r5 = r10.printable((char) r5)     // Catch:{ EOFException -> 0x0049 }
            r3.append(r5)     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r3 = r3.toString()     // Catch:{ EOFException -> 0x0049 }
            r0.<init>(r3, r10, r1)     // Catch:{ EOFException -> 0x0049 }
            throw r0     // Catch:{ EOFException -> 0x0049 }
        L_0x00c6:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ EOFException -> 0x0049 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ EOFException -> 0x0049 }
            r3.<init>()     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r7 = "in epilog expected ignorable content and not "
            r3.append(r7)     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r5 = r10.printable((char) r5)     // Catch:{ EOFException -> 0x0049 }
            r3.append(r5)     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r3 = r3.toString()     // Catch:{ EOFException -> 0x0049 }
            r0.<init>(r3, r10, r1)     // Catch:{ EOFException -> 0x0049 }
            throw r0     // Catch:{ EOFException -> 0x0049 }
        L_0x00e1:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ EOFException -> 0x0049 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ EOFException -> 0x0049 }
            r3.<init>()     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r7 = "end tag not allowed in epilog but got "
            r3.append(r7)     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r5 = r10.printable((char) r5)     // Catch:{ EOFException -> 0x0049 }
            r3.append(r5)     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r3 = r3.toString()     // Catch:{ EOFException -> 0x0049 }
            r0.<init>(r3, r10, r1)     // Catch:{ EOFException -> 0x0049 }
            throw r0     // Catch:{ EOFException -> 0x0049 }
        L_0x00fc:
            boolean r8 = r10.isS(r5)     // Catch:{ EOFException -> 0x0049 }
            if (r8 == 0) goto L_0x0178
            if (r0 == 0) goto L_0x0171
            r6 = 13
            if (r5 != r6) goto L_0x0139
            boolean r5 = r10.usePC     // Catch:{ EOFException -> 0x0119 }
            if (r5 != 0) goto L_0x0122
            int r5 = r10.pos     // Catch:{ EOFException -> 0x0119 }
            int r5 = r5 - r2
            r10.posEnd = r5     // Catch:{ EOFException -> 0x0119 }
            int r6 = r10.posStart     // Catch:{ EOFException -> 0x0119 }
            if (r5 <= r6) goto L_0x011c
            r10.joinPC()     // Catch:{ EOFException -> 0x0119 }
            goto L_0x0122
        L_0x0119:
            r3 = r2
            goto L_0x0193
        L_0x011c:
            r10.usePC = r2     // Catch:{ EOFException -> 0x0119 }
            r10.pcEnd = r3     // Catch:{ EOFException -> 0x0119 }
            r10.pcStart = r3     // Catch:{ EOFException -> 0x0119 }
        L_0x0122:
            int r5 = r10.pcEnd     // Catch:{ EOFException -> 0x0119 }
            char[] r6 = r10.f30349pc     // Catch:{ EOFException -> 0x0119 }
            int r6 = r6.length     // Catch:{ EOFException -> 0x0119 }
            if (r5 < r6) goto L_0x012c
            r10.ensurePC(r5)     // Catch:{ EOFException -> 0x0119 }
        L_0x012c:
            char[] r5 = r10.f30349pc     // Catch:{ EOFException -> 0x0119 }
            int r6 = r10.pcEnd     // Catch:{ EOFException -> 0x0119 }
            int r7 = r6 + 1
            r10.pcEnd = r7     // Catch:{ EOFException -> 0x0119 }
            r5[r6] = r9     // Catch:{ EOFException -> 0x0119 }
            r6 = r2
            r7 = r6
            goto L_0x0172
        L_0x0139:
            if (r5 != r9) goto L_0x0158
            if (r7 != 0) goto L_0x0155
            boolean r5 = r10.usePC     // Catch:{ EOFException -> 0x0119 }
            if (r5 == 0) goto L_0x0155
            int r5 = r10.pcEnd     // Catch:{ EOFException -> 0x0119 }
            char[] r6 = r10.f30349pc     // Catch:{ EOFException -> 0x0119 }
            int r6 = r6.length     // Catch:{ EOFException -> 0x0119 }
            if (r5 < r6) goto L_0x014b
            r10.ensurePC(r5)     // Catch:{ EOFException -> 0x0119 }
        L_0x014b:
            char[] r5 = r10.f30349pc     // Catch:{ EOFException -> 0x0119 }
            int r6 = r10.pcEnd     // Catch:{ EOFException -> 0x0119 }
            int r7 = r6 + 1
            r10.pcEnd = r7     // Catch:{ EOFException -> 0x0119 }
            r5[r6] = r9     // Catch:{ EOFException -> 0x0119 }
        L_0x0155:
            r6 = r2
            r7 = r3
            goto L_0x0172
        L_0x0158:
            boolean r6 = r10.usePC     // Catch:{ EOFException -> 0x0119 }
            if (r6 == 0) goto L_0x0155
            int r6 = r10.pcEnd     // Catch:{ EOFException -> 0x0119 }
            char[] r7 = r10.f30349pc     // Catch:{ EOFException -> 0x0119 }
            int r7 = r7.length     // Catch:{ EOFException -> 0x0119 }
            if (r6 < r7) goto L_0x0166
            r10.ensurePC(r6)     // Catch:{ EOFException -> 0x0119 }
        L_0x0166:
            char[] r6 = r10.f30349pc     // Catch:{ EOFException -> 0x0119 }
            int r7 = r10.pcEnd     // Catch:{ EOFException -> 0x0119 }
            int r8 = r7 + 1
            r10.pcEnd = r8     // Catch:{ EOFException -> 0x0119 }
            r6[r7] = r5     // Catch:{ EOFException -> 0x0119 }
            goto L_0x0155
        L_0x0171:
            r6 = r2
        L_0x0172:
            char r5 = r10.more()     // Catch:{ EOFException -> 0x0049 }
            goto L_0x0033
        L_0x0178:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ EOFException -> 0x0049 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ EOFException -> 0x0049 }
            r3.<init>()     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r7 = "in epilog non whitespace content is not allowed but got "
            r3.append(r7)     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r5 = r10.printable((char) r5)     // Catch:{ EOFException -> 0x0049 }
            r3.append(r5)     // Catch:{ EOFException -> 0x0049 }
            java.lang.String r3 = r3.toString()     // Catch:{ EOFException -> 0x0049 }
            r0.<init>(r3, r10, r1)     // Catch:{ EOFException -> 0x0049 }
            throw r0     // Catch:{ EOFException -> 0x0049 }
        L_0x0193:
            r10.reachedEnd = r2
            boolean r0 = r10.tokenize
            if (r0 == 0) goto L_0x01a2
            if (r3 == 0) goto L_0x01a2
            int r0 = r10.pos
            r10.posEnd = r0
            r10.eventType = r4
            return r4
        L_0x01a2:
            r10.eventType = r2
            return r2
        L_0x01a5:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "already reached end of XML input"
            r0.<init>(r2, r10, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.mxp1.MXParser.parseEpilog():int");
    }

    /* access modifiers changed from: protected */
    public boolean parsePI() throws XmlPullParserException, IOException {
        char more;
        boolean z10;
        char[] cArr;
        char c10;
        char c11;
        char c12;
        boolean z11 = this.tokenize;
        if (z11) {
            this.posStart = this.pos;
        }
        int i10 = this.lineNumber;
        int i11 = this.columnNumber;
        int i12 = this.pos + this.bufAbsoluteStart;
        boolean z12 = true;
        boolean z13 = (!z11 || this.roundtripSupported) ? TRACE_SIZING : true;
        int i13 = -1;
        int i14 = -1;
        boolean z14 = TRACE_SIZING;
        boolean z15 = TRACE_SIZING;
        while (true) {
            try {
                more = more();
                if (more == '?') {
                    z14 = z12;
                } else {
                    if (more == '>') {
                        if (z14) {
                            if (this.tokenize) {
                                this.posEnd = this.pos - 2;
                                if (z13) {
                                    this.pcEnd -= z12;
                                }
                            }
                            return z12;
                        }
                    } else if (i14 == i13) {
                        if (isS(more)) {
                            i14 = (this.pos - (z12 ? 1 : 0)) + this.bufAbsoluteStart;
                            if (i14 - i12 == 3 && (((c10 = (cArr = this.buf)[i12]) == 'x' || c10 == 'X') && (((c11 = cArr[i12 + 1]) == 'm' || c11 == 'M') && ((c12 = cArr[i12 + 2]) == 'l' || c12 == 'L')))) {
                            }
                        }
                    }
                    z14 = TRACE_SIZING;
                }
                if (!z13) {
                    z12 = true;
                } else if (more == 13) {
                    if (!this.usePC) {
                        z10 = true;
                        int i15 = this.pos - 1;
                        this.posEnd = i15;
                        if (i15 > this.posStart) {
                            joinPC();
                        } else {
                            this.usePC = true;
                            this.pcEnd = 0;
                            this.pcStart = 0;
                        }
                    } else {
                        z10 = true;
                    }
                    int i16 = this.pcEnd;
                    if (i16 >= this.f30349pc.length) {
                        ensurePC(i16);
                    }
                    char[] cArr2 = this.f30349pc;
                    int i17 = this.pcEnd;
                    this.pcEnd = i17 + 1;
                    cArr2[i17] = 10;
                    z12 = z10;
                    z15 = z12;
                } else {
                    if (more == 10) {
                        if (!z15 && this.usePC) {
                            int i18 = this.pcEnd;
                            if (i18 >= this.f30349pc.length) {
                                ensurePC(i18);
                            }
                            char[] cArr3 = this.f30349pc;
                            int i19 = this.pcEnd;
                            this.pcEnd = i19 + 1;
                            cArr3[i19] = 10;
                        }
                    } else if (this.usePC) {
                        int i20 = this.pcEnd;
                        if (i20 >= this.f30349pc.length) {
                            ensurePC(i20);
                        }
                        char[] cArr4 = this.f30349pc;
                        int i21 = this.pcEnd;
                        this.pcEnd = i21 + 1;
                        cArr4[i21] = more;
                    }
                    z15 = false;
                    z12 = true;
                }
                i13 = -1;
            } catch (EOFException e10) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("processing instruction started on line ");
                stringBuffer.append(i10);
                stringBuffer.append(" and column ");
                stringBuffer.append(i11);
                stringBuffer.append(" was not closed");
                throw new XmlPullParserException(stringBuffer.toString(), this, e10);
            }
        }
        if (i12 <= 3) {
            if (!(c10 == 'x' || c11 == 'm')) {
                if (c12 != 'l') {
                    throw new XmlPullParserException("XMLDecl must have xml name in lowercase", this, (Throwable) null);
                }
            }
            parseXmlDecl(more);
            if (this.tokenize) {
                this.posEnd = this.pos - 2;
            }
            int i22 = (i12 - this.bufAbsoluteStart) + 3;
            this.xmlDeclContent = newString(this.buf, i22, (this.pos - 2) - i22);
            return TRACE_SIZING;
        }
        throw new XmlPullParserException("processing instruction can not have PITarget with reserveld xml name", this, (Throwable) null);
    }

    /* access modifiers changed from: protected */
    public int parseProlog() throws XmlPullParserException, IOException {
        char more = this.seenMarkup ? this.buf[this.pos - 1] : more();
        if (this.eventType == 0) {
            if (more == 65534) {
                throw new XmlPullParserException("first character in input was UNICODE noncharacter (0xFFFE)- input requires int swapping", this, (Throwable) null);
            } else if (more == 65279) {
                more = more();
            }
        }
        this.seenMarkup = TRACE_SIZING;
        this.posStart = this.pos - 1;
        boolean z10 = this.tokenize && !this.roundtripSupported;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            if (more == '<') {
                if (!z11 || !this.tokenize) {
                    char more2 = more();
                    if (more2 == '?') {
                        if (!parsePI()) {
                            this.posStart = this.pos;
                            z11 = false;
                        } else if (this.tokenize) {
                            this.eventType = 8;
                            return 8;
                        }
                    } else if (more2 == '!') {
                        char more3 = more();
                        if (more3 == 'D') {
                            if (!this.seenDocdecl) {
                                this.seenDocdecl = true;
                                parseDocdecl();
                                if (this.tokenize) {
                                    this.eventType = 10;
                                    return 10;
                                }
                            } else {
                                throw new XmlPullParserException("only one docdecl allowed in XML document", this, (Throwable) null);
                            }
                        } else if (more3 == '-') {
                            parseComment();
                            if (this.tokenize) {
                                this.eventType = 9;
                                return 9;
                            }
                        } else {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("unexpected markup <!");
                            stringBuffer.append(printable(more3));
                            throw new XmlPullParserException(stringBuffer.toString(), this, (Throwable) null);
                        }
                    } else if (more2 == '/') {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("expected start tag name and not ");
                        stringBuffer2.append(printable(more2));
                        throw new XmlPullParserException(stringBuffer2.toString(), this, (Throwable) null);
                    } else if (isNameStartChar(more2)) {
                        this.seenRoot = true;
                        return parseStartTag();
                    } else {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("expected start tag name and not ");
                        stringBuffer3.append(printable(more2));
                        throw new XmlPullParserException(stringBuffer3.toString(), this, (Throwable) null);
                    }
                } else {
                    this.posEnd = this.pos - 1;
                    this.seenMarkup = true;
                    this.eventType = 7;
                    return 7;
                }
            } else if (!isS(more)) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("only whitespace content allowed before start tag and not ");
                stringBuffer4.append(printable(more));
                throw new XmlPullParserException(stringBuffer4.toString(), this, (Throwable) null);
            } else if (!z10) {
                z11 = true;
            } else if (more == 13) {
                if (!this.usePC) {
                    int i10 = this.pos - 1;
                    this.posEnd = i10;
                    if (i10 > this.posStart) {
                        joinPC();
                    } else {
                        this.usePC = true;
                        this.pcEnd = 0;
                        this.pcStart = 0;
                    }
                }
                int i11 = this.pcEnd;
                if (i11 >= this.f30349pc.length) {
                    ensurePC(i11);
                }
                char[] cArr = this.f30349pc;
                int i12 = this.pcEnd;
                this.pcEnd = i12 + 1;
                cArr[i12] = 10;
                z11 = true;
                z12 = true;
            } else {
                if (more == 10) {
                    if (!z12 && this.usePC) {
                        int i13 = this.pcEnd;
                        if (i13 >= this.f30349pc.length) {
                            ensurePC(i13);
                        }
                        char[] cArr2 = this.f30349pc;
                        int i14 = this.pcEnd;
                        this.pcEnd = i14 + 1;
                        cArr2[i14] = 10;
                    }
                } else if (this.usePC) {
                    int i15 = this.pcEnd;
                    if (i15 >= this.f30349pc.length) {
                        ensurePC(i15);
                    }
                    char[] cArr3 = this.f30349pc;
                    int i16 = this.pcEnd;
                    this.pcEnd = i16 + 1;
                    cArr3[i16] = more;
                }
                z11 = true;
                z12 = false;
            }
            more = more();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x026a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d8 A[LOOP:5: B:78:0x01d8->B:84:0x01ee, LOOP_START, PHI: r1 
      PHI: (r1v2 int) = (r1v0 int), (r1v3 int) binds: [B:32:0x00da, B:84:0x01ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int parseStartTag() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r13 = this;
            int r0 = r13.depth
            r1 = 1
            int r0 = r0 + r1
            r13.depth = r0
            int r0 = r13.pos
            int r2 = r0 + -2
            r13.posStart = r2
            r2 = 0
            r13.emptyElementTag = r2
            r13.attributeCount = r2
            int r3 = r0 + -1
            int r4 = r13.bufAbsoluteStart
            int r3 = r3 + r4
            char[] r4 = r13.buf
            int r0 = r0 - r1
            char r0 = r4[r0]
            r4 = 0
            r5 = 58
            if (r0 != r5) goto L_0x002d
            boolean r0 = r13.processNamespaces
            if (r0 != 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "when namespaces processing enabled colon can not be at element name start"
            r0.<init>(r1, r13, r4)
            throw r0
        L_0x002d:
            r0 = -1
            r6 = r0
        L_0x002f:
            char r7 = r13.more()
            boolean r8 = r13.isNameChar(r7)
            if (r8 != 0) goto L_0x028b
            r13.ensureElementsCapacity()
            int r5 = r13.pos
            int r5 = r5 - r1
            int r8 = r13.bufAbsoluteStart
            int r9 = r3 - r8
            int r5 = r5 - r9
            char[][] r9 = r13.elRawName
            int r10 = r13.depth
            r11 = r9[r10]
            if (r11 == 0) goto L_0x004f
            int r11 = r11.length
            if (r11 >= r5) goto L_0x0055
        L_0x004f:
            int r11 = r5 * 2
            char[] r11 = new char[r11]
            r9[r10] = r11
        L_0x0055:
            char[] r11 = r13.buf
            int r8 = r3 - r8
            r9 = r9[r10]
            java.lang.System.arraycopy(r11, r8, r9, r2, r5)
            int[] r8 = r13.elRawNameEnd
            int r9 = r13.depth
            r8[r9] = r5
            int[] r8 = r13.elRawNameLine
            int r10 = r13.lineNumber
            r8[r9] = r10
            boolean r8 = r13.processNamespaces
            r10 = 2
            if (r8 == 0) goto L_0x00ab
            if (r6 == r0) goto L_0x0098
            java.lang.String[] r0 = r13.elPrefix
            char[] r5 = r13.buf
            int r8 = r13.bufAbsoluteStart
            int r8 = r3 - r8
            int r3 = r6 - r3
            java.lang.String r3 = r13.newString(r5, r8, r3)
            r0[r9] = r3
            java.lang.String[] r0 = r13.elName
            int r5 = r13.depth
            char[] r8 = r13.buf
            int r9 = r6 + 1
            int r11 = r13.bufAbsoluteStart
            int r9 = r9 - r11
            int r12 = r13.pos
            int r12 = r12 - r10
            int r6 = r6 - r11
            int r12 = r12 - r6
            java.lang.String r6 = r13.newString(r8, r9, r12)
            r0[r5] = r6
            goto L_0x00b9
        L_0x0098:
            java.lang.String[] r0 = r13.elPrefix
            r0[r9] = r4
            java.lang.String[] r0 = r13.elName
            char[] r6 = r13.buf
            int r8 = r13.bufAbsoluteStart
            int r3 = r3 - r8
            java.lang.String r3 = r13.newString(r6, r3, r5)
            r0[r9] = r3
        L_0x00a9:
            r3 = r4
            goto L_0x00b9
        L_0x00ab:
            java.lang.String[] r0 = r13.elName
            char[] r6 = r13.buf
            int r8 = r13.bufAbsoluteStart
            int r3 = r3 - r8
            java.lang.String r3 = r13.newString(r6, r3, r5)
            r0[r9] = r3
            goto L_0x00a9
        L_0x00b9:
            boolean r0 = r13.isS(r7)
            if (r0 != 0) goto L_0x026a
            r0 = 62
            if (r7 != r0) goto L_0x00c4
            goto L_0x00d4
        L_0x00c4:
            r5 = 47
            if (r7 != r5) goto L_0x0261
            boolean r5 = r13.emptyElementTag
            if (r5 != 0) goto L_0x0259
            r13.emptyElementTag = r1
            char r5 = r13.more()
            if (r5 != r0) goto L_0x023e
        L_0x00d4:
            boolean r0 = r13.processNamespaces
            java.lang.String r6 = " and "
            java.lang.String r7 = "duplicated attributes "
            if (r0 == 0) goto L_0x01d8
            java.lang.String r0 = r13.getNamespace(r3)
            java.lang.String r5 = ""
            if (r0 != 0) goto L_0x00ff
            if (r3 != 0) goto L_0x00e8
            r0 = r5
            goto L_0x00ff
        L_0x00e8:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "could not determine namespace bound to element prefix "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r13, r4)
            throw r0
        L_0x00ff:
            java.lang.String[] r3 = r13.elUri
            int r8 = r13.depth
            r3[r8] = r0
            r0 = r2
        L_0x0106:
            int r3 = r13.attributeCount
            if (r0 < r3) goto L_0x01a8
            r3 = r1
        L_0x010b:
            int r0 = r13.attributeCount
            if (r3 < r0) goto L_0x0111
            goto L_0x01dc
        L_0x0111:
            r0 = r2
        L_0x0112:
            if (r0 < r3) goto L_0x0117
            int r3 = r3 + 1
            goto L_0x010b
        L_0x0117:
            java.lang.String[] r1 = r13.attributeUri
            r5 = r1[r0]
            r1 = r1[r3]
            if (r5 != r1) goto L_0x01a4
            boolean r1 = r13.allStringsInterned
            if (r1 == 0) goto L_0x012f
            java.lang.String[] r1 = r13.attributeName
            r5 = r1[r0]
            r1 = r1[r3]
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x0147
        L_0x012f:
            boolean r1 = r13.allStringsInterned
            if (r1 != 0) goto L_0x01a4
            int[] r1 = r13.attributeNameHash
            r5 = r1[r0]
            r1 = r1[r3]
            if (r5 != r1) goto L_0x01a4
            java.lang.String[] r1 = r13.attributeName
            r5 = r1[r0]
            r1 = r1[r3]
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x01a4
        L_0x0147:
            java.lang.String[] r1 = r13.attributeName
            r1 = r1[r0]
            java.lang.String[] r2 = r13.attributeUri
            r2 = r2[r0]
            java.lang.String r5 = ":"
            if (r2 == 0) goto L_0x0169
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String[] r8 = r13.attributeUri
            r0 = r8[r0]
            r2.append(r0)
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x0169:
            java.lang.String[] r0 = r13.attributeName
            r0 = r0[r3]
            java.lang.String[] r2 = r13.attributeUri
            r2 = r2[r3]
            if (r2 == 0) goto L_0x0189
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String[] r8 = r13.attributeUri
            r3 = r8[r3]
            r2.append(r3)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x0189:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r7)
            r3.append(r1)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0, r13, r4)
            throw r2
        L_0x01a4:
            int r0 = r0 + 1
            goto L_0x0112
        L_0x01a8:
            java.lang.String[] r3 = r13.attributePrefix
            r3 = r3[r0]
            if (r3 == 0) goto L_0x01d0
            java.lang.String r8 = r13.getNamespace(r3)
            if (r8 == 0) goto L_0x01b9
            java.lang.String[] r3 = r13.attributeUri
            r3[r0] = r8
            goto L_0x01d4
        L_0x01b9:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "could not determine namespace bound to attribute prefix "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r13, r4)
            throw r0
        L_0x01d0:
            java.lang.String[] r3 = r13.attributeUri
            r3[r0] = r5
        L_0x01d4:
            int r0 = r0 + 1
            goto L_0x0106
        L_0x01d8:
            int r0 = r13.attributeCount
            if (r1 < r0) goto L_0x01eb
        L_0x01dc:
            int[] r0 = r13.elNamespaceCount
            int r1 = r13.depth
            int r2 = r13.namespaceEnd
            r0[r1] = r2
            int r0 = r13.pos
            r13.posEnd = r0
            r13.eventType = r10
            return r10
        L_0x01eb:
            r0 = r2
        L_0x01ec:
            if (r0 < r1) goto L_0x01f1
            int r1 = r1 + 1
            goto L_0x01d8
        L_0x01f1:
            boolean r3 = r13.allStringsInterned
            if (r3 == 0) goto L_0x0201
            java.lang.String[] r3 = r13.attributeName
            r5 = r3[r0]
            r3 = r3[r1]
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x021a
        L_0x0201:
            boolean r3 = r13.allStringsInterned
            if (r3 != 0) goto L_0x023b
            int[] r3 = r13.attributeNameHash
            r5 = r3[r0]
            r3 = r3[r1]
            if (r5 != r3) goto L_0x023b
            java.lang.String[] r3 = r13.attributeName
            r5 = r3[r0]
            r3 = r3[r1]
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x021a
            goto L_0x023b
        L_0x021a:
            java.lang.String[] r2 = r13.attributeName
            r0 = r2[r0]
            r1 = r2[r1]
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r7)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0, r13, r4)
            throw r2
        L_0x023b:
            int r0 = r0 + 1
            goto L_0x01ec
        L_0x023e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "expected > to end empty tag not "
            r1.append(r2)
            java.lang.String r2 = r13.printable((char) r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r13, r4)
            throw r0
        L_0x0259:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "repeated / in tag declaration"
            r0.<init>(r1, r13, r4)
            throw r0
        L_0x0261:
            boolean r0 = r13.isNameStartChar(r7)
            if (r0 == 0) goto L_0x0270
            r13.parseAttribute()
        L_0x026a:
            char r7 = r13.more()
            goto L_0x00b9
        L_0x0270:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "start tag unexpected character "
            r1.append(r2)
            java.lang.String r2 = r13.printable((char) r7)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r13, r4)
            throw r0
        L_0x028b:
            if (r7 != r5) goto L_0x002f
            boolean r7 = r13.processNamespaces
            if (r7 == 0) goto L_0x002f
            if (r6 != r0) goto L_0x029b
            int r6 = r13.pos
            int r6 = r6 - r1
            int r7 = r13.bufAbsoluteStart
            int r6 = r6 + r7
            goto L_0x002f
        L_0x029b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "only one colon is allowed in name of element when namespaces are enabled"
            r0.<init>(r1, r13, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.mxp1.MXParser.parseStartTag():int");
    }

    /* access modifiers changed from: protected */
    public void parseXmlDecl(char c10) throws XmlPullParserException, IOException {
        this.preventBufferCompaction = true;
        this.bufStart = 0;
        char skipS = skipS(requireInput(skipS(c10), VERSION));
        if (skipS == '=') {
            char skipS2 = skipS(more());
            if (skipS2 == '\'' || skipS2 == '\"') {
                int i10 = this.pos;
                while (true) {
                    char more = more();
                    if (more == skipS2) {
                        parseXmlDeclWithVersion(i10, this.pos - 1);
                        this.preventBufferCompaction = TRACE_SIZING;
                        return;
                    } else if ((more < 'a' || more > 'z') && ((more < 'A' || more > 'Z') && !((more >= '0' && more <= '9') || more == '_' || more == '.' || more == ':' || more == '-'))) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("<?xml version value expected to be in ([a-zA-Z0-9_.:] | '-') not ");
                        stringBuffer.append(printable(more));
                        throw new XmlPullParserException(stringBuffer.toString(), this, (Throwable) null);
                    }
                }
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("expected apostrophe (') or quotation mark (\") after version and not ");
                stringBuffer2.append(printable(skipS2));
                throw new XmlPullParserException(stringBuffer2.toString(), this, (Throwable) null);
            }
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("expected equals sign (=) after version and not ");
            stringBuffer3.append(printable(skipS));
            throw new XmlPullParserException(stringBuffer3.toString(), this, (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    public void parseXmlDeclWithVersion(int i10, int i11) throws XmlPullParserException, IOException {
        char requireInput;
        Boolean bool;
        int i12 = i10;
        int i13 = i11 - i12;
        if (i13 == 3) {
            char[] cArr = this.buf;
            if (cArr[i12] == '1' && cArr[i12 + 1] == '.') {
                char c10 = '0';
                if (cArr[i12 + 2] == '0') {
                    this.xmlDeclVersion = newString(cArr, i12, i13);
                    char skipS = skipS(more());
                    if (skipS == 'e') {
                        char skipS2 = skipS(requireInput(more(), NCODING));
                        if (skipS2 == '=') {
                            char skipS3 = skipS(more());
                            if (skipS3 == '\'' || skipS3 == '\"') {
                                int i14 = this.pos;
                                char more = more();
                                if ((more < 'a' || more > 'z') && (more < 'A' || more > 'Z')) {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append("<?xml encoding name expected to start with [A-Za-z] not ");
                                    stringBuffer.append(printable(more));
                                    throw new XmlPullParserException(stringBuffer.toString(), this, (Throwable) null);
                                }
                                char more2 = more();
                                while (more2 != skipS3) {
                                    if ((more2 < 'a' || more2 > 'z') && ((more2 < 'A' || more2 > 'Z') && !((more2 >= c10 && more2 <= '9') || more2 == '.' || more2 == '_' || more2 == '-'))) {
                                        StringBuffer stringBuffer2 = new StringBuffer();
                                        stringBuffer2.append("<?xml encoding value expected to be in ([A-Za-z0-9._] | '-') not ");
                                        stringBuffer2.append(printable(more2));
                                        throw new XmlPullParserException(stringBuffer2.toString(), this, (Throwable) null);
                                    }
                                    more2 = more();
                                    c10 = '0';
                                }
                                this.inputEncoding = newString(this.buf, i14, (this.pos - 1) - i14);
                                skipS = more();
                            } else {
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("expected apostrophe (') or quotation mark (\") after encoding and not ");
                                stringBuffer3.append(printable(skipS3));
                                throw new XmlPullParserException(stringBuffer3.toString(), this, (Throwable) null);
                            }
                        } else {
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append("expected equals sign (=) after encoding and not ");
                            stringBuffer4.append(printable(skipS2));
                            throw new XmlPullParserException(stringBuffer4.toString(), this, (Throwable) null);
                        }
                    }
                    char skipS4 = skipS(skipS);
                    if (skipS4 == 's') {
                        char skipS5 = skipS(requireInput(more(), TANDALONE));
                        if (skipS5 == '=') {
                            char skipS6 = skipS(more());
                            if (skipS6 == '\'' || skipS6 == '\"') {
                                char more3 = more();
                                if (more3 == 'y') {
                                    requireInput = requireInput(more3, YES);
                                    bool = new Boolean(true);
                                } else if (more3 == 'n') {
                                    requireInput = requireInput(more3, NO);
                                    bool = new Boolean(TRACE_SIZING);
                                } else {
                                    StringBuffer stringBuffer5 = new StringBuffer();
                                    stringBuffer5.append("expected 'yes' or 'no' after standalone and not ");
                                    stringBuffer5.append(printable(more3));
                                    throw new XmlPullParserException(stringBuffer5.toString(), this, (Throwable) null);
                                }
                                this.xmlDeclStandalone = bool;
                                if (requireInput == skipS6) {
                                    skipS4 = more();
                                } else {
                                    StringBuffer stringBuffer6 = new StringBuffer();
                                    stringBuffer6.append("expected ");
                                    stringBuffer6.append(skipS6);
                                    stringBuffer6.append(" after standalone value not ");
                                    stringBuffer6.append(printable(requireInput));
                                    throw new XmlPullParserException(stringBuffer6.toString(), this, (Throwable) null);
                                }
                            } else {
                                StringBuffer stringBuffer7 = new StringBuffer();
                                stringBuffer7.append("expected apostrophe (') or quotation mark (\") after encoding and not ");
                                stringBuffer7.append(printable(skipS6));
                                throw new XmlPullParserException(stringBuffer7.toString(), this, (Throwable) null);
                            }
                        } else {
                            StringBuffer stringBuffer8 = new StringBuffer();
                            stringBuffer8.append("expected equals sign (=) after standalone and not ");
                            stringBuffer8.append(printable(skipS5));
                            throw new XmlPullParserException(stringBuffer8.toString(), this, (Throwable) null);
                        }
                    }
                    char skipS7 = skipS(skipS4);
                    if (skipS7 == '?') {
                        char more4 = more();
                        if (more4 != '>') {
                            StringBuffer stringBuffer9 = new StringBuffer();
                            stringBuffer9.append("expected ?> as last part of <?xml not ");
                            stringBuffer9.append(printable(more4));
                            throw new XmlPullParserException(stringBuffer9.toString(), this, (Throwable) null);
                        }
                        return;
                    }
                    StringBuffer stringBuffer10 = new StringBuffer();
                    stringBuffer10.append("expected ?> as last part of <?xml not ");
                    stringBuffer10.append(printable(skipS7));
                    throw new XmlPullParserException(stringBuffer10.toString(), this, (Throwable) null);
                }
            }
        }
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append("only 1.0 is supported as <?xml version not '");
        stringBuffer11.append(printable(new String(this.buf, i12, i13)));
        stringBuffer11.append("'");
        throw new XmlPullParserException(stringBuffer11.toString(), this, (Throwable) null);
    }

    /* access modifiers changed from: protected */
    public String printable(char c10) {
        StringBuffer stringBuffer;
        if (c10 == 10) {
            return "\\n";
        }
        if (c10 == 13) {
            return "\\r";
        }
        if (c10 == 9) {
            return "\\t";
        }
        if (c10 == '\'') {
            return "\\'";
        }
        if (c10 > 127 || c10 < ' ') {
            stringBuffer = new StringBuffer();
            stringBuffer.append("\\u");
            stringBuffer.append(Integer.toHexString(c10));
        } else {
            stringBuffer = new StringBuffer();
            stringBuffer.append("");
            stringBuffer.append(c10);
        }
        return stringBuffer.toString();
    }

    public void require(int i10, String str, String str2) throws XmlPullParserException, IOException {
        String str3;
        String str4;
        String str5;
        String str6;
        if (!this.processNamespaces && str != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("processing namespaces must be enabled on parser (or factory) to have possible namespaces delcared on elements");
            stringBuffer.append(" (postion:");
            stringBuffer.append(getPositionDescription());
            stringBuffer.append(")");
            throw new XmlPullParserException(stringBuffer.toString());
        } else if (i10 != getEventType() || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("expected event ");
            String[] strArr = XmlPullParser.TYPES;
            stringBuffer2.append(strArr[i10]);
            String str7 = "";
            if (str2 != null) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(" with name '");
                stringBuffer3.append(str2);
                stringBuffer3.append("'");
                str3 = stringBuffer3.toString();
            } else {
                str3 = str7;
            }
            stringBuffer2.append(str3);
            String str8 = " and";
            stringBuffer2.append((str == null || str2 == null) ? str7 : str8);
            if (str != null) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(" with namespace '");
                stringBuffer4.append(str);
                stringBuffer4.append("'");
                str4 = stringBuffer4.toString();
            } else {
                str4 = str7;
            }
            stringBuffer2.append(str4);
            stringBuffer2.append(" but got");
            if (i10 != getEventType()) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(" ");
                stringBuffer5.append(strArr[getEventType()]);
                str5 = stringBuffer5.toString();
            } else {
                str5 = str7;
            }
            stringBuffer2.append(str5);
            if (str2 == null || getName() == null || str2.equals(getName())) {
                str6 = str7;
            } else {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append(" name '");
                stringBuffer6.append(getName());
                stringBuffer6.append("'");
                str6 = stringBuffer6.toString();
            }
            stringBuffer2.append(str6);
            if (str == null || str2 == null || getName() == null || str2.equals(getName()) || getNamespace() == null || str.equals(getNamespace())) {
                str8 = str7;
            }
            stringBuffer2.append(str8);
            if (!(str == null || getNamespace() == null || str.equals(getNamespace()))) {
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append(" namespace '");
                stringBuffer7.append(getNamespace());
                stringBuffer7.append("'");
                str7 = stringBuffer7.toString();
            }
            stringBuffer2.append(str7);
            stringBuffer2.append(" (postion:");
            stringBuffer2.append(getPositionDescription());
            stringBuffer2.append(")");
            throw new XmlPullParserException(stringBuffer2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public char requireInput(char c10, char[] cArr) throws XmlPullParserException, IOException {
        int i10 = 0;
        while (i10 < cArr.length) {
            if (c10 == cArr[i10]) {
                c10 = more();
                i10++;
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("expected ");
                stringBuffer.append(printable(cArr[i10]));
                stringBuffer.append(" in ");
                stringBuffer.append(new String(cArr));
                stringBuffer.append(" and not ");
                stringBuffer.append(printable(c10));
                throw new XmlPullParserException(stringBuffer.toString(), this, (Throwable) null);
            }
        }
        return c10;
    }

    /* access modifiers changed from: protected */
    public char requireNextS() throws XmlPullParserException, IOException {
        char more = more();
        if (isS(more)) {
            return skipS(more);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("white space is required and not ");
        stringBuffer.append(printable(more));
        throw new XmlPullParserException(stringBuffer.toString(), this, (Throwable) null);
    }

    /* access modifiers changed from: protected */
    public void reset() {
        this.lineNumber = 1;
        this.columnNumber = 0;
        this.seenRoot = TRACE_SIZING;
        this.reachedEnd = TRACE_SIZING;
        this.eventType = 0;
        this.emptyElementTag = TRACE_SIZING;
        this.depth = 0;
        this.attributeCount = 0;
        this.namespaceEnd = 0;
        this.entityEnd = 0;
        this.reader = null;
        this.inputEncoding = null;
        this.preventBufferCompaction = TRACE_SIZING;
        this.bufAbsoluteStart = 0;
        this.bufStart = 0;
        this.bufEnd = 0;
        this.posEnd = 0;
        this.posStart = 0;
        this.pos = 0;
        this.pcStart = 0;
        this.pcEnd = 0;
        this.usePC = TRACE_SIZING;
        this.seenStartTag = TRACE_SIZING;
        this.seenEndTag = TRACE_SIZING;
        this.pastEndTag = TRACE_SIZING;
        this.seenAmpersand = TRACE_SIZING;
        this.seenMarkup = TRACE_SIZING;
        this.seenDocdecl = TRACE_SIZING;
        this.xmlDeclVersion = null;
        this.xmlDeclStandalone = null;
        this.xmlDeclContent = null;
        resetStringCache();
    }

    /* access modifiers changed from: protected */
    public void resetStringCache() {
    }

    public void setFeature(String str, boolean z10) throws XmlPullParserException {
        if (str == null) {
            throw new IllegalArgumentException("feature name should not be null");
        } else if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            if (this.eventType == 0) {
                this.processNamespaces = z10;
                return;
            }
            throw new XmlPullParserException("namespace processing feature can only be changed before parsing", this, (Throwable) null);
        } else if (FEATURE_NAMES_INTERNED.equals(str)) {
            if (z10) {
                throw new XmlPullParserException("interning names in this implementation is not supported");
            }
        } else if (XmlPullParser.FEATURE_PROCESS_DOCDECL.equals(str)) {
            if (z10) {
                throw new XmlPullParserException("processing DOCDECL is not supported");
            }
        } else if (FEATURE_XML_ROUNDTRIP.equals(str)) {
            this.roundtripSupported = z10;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("unsupporte feature ");
            stringBuffer.append(str);
            throw new XmlPullParserException(stringBuffer.toString());
        }
    }

    public void setInput(InputStream inputStream, String str) throws XmlPullParserException {
        InputStreamReader inputStreamReader;
        if (inputStream != null) {
            if (str != null) {
                try {
                    inputStreamReader = new InputStreamReader(inputStream, str);
                } catch (UnsupportedEncodingException e10) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("could not create reader for encoding ");
                    stringBuffer.append(str);
                    stringBuffer.append(" : ");
                    stringBuffer.append(e10);
                    throw new XmlPullParserException(stringBuffer.toString(), this, e10);
                }
            } else {
                inputStreamReader = new InputStreamReader(inputStream);
            }
            setInput(inputStreamReader);
            this.inputEncoding = str;
            return;
        }
        throw new IllegalArgumentException("input stream can not be null");
    }

    public void setProperty(String str, Object obj) throws XmlPullParserException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unsupported property: '");
        stringBuffer.append(str);
        stringBuffer.append("'");
        throw new XmlPullParserException(stringBuffer.toString());
    }

    /* access modifiers changed from: protected */
    public char skipS(char c10) throws XmlPullParserException, IOException {
        while (isS(c10)) {
            c10 = more();
        }
        return c10;
    }

    public String getAttributeValue(String str, String str2) {
        if (this.eventType != 2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("only START_TAG can have attributes");
            stringBuffer.append(getPositionDescription());
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        } else if (str2 != null) {
            int i10 = 0;
            if (this.processNamespaces) {
                if (str == null) {
                    str = "";
                }
                String str3 = str;
                while (i10 < this.attributeCount) {
                    String str4 = this.attributeUri[i10];
                    if ((str3 == str4 || str3.equals(str4)) && str2.equals(this.attributeName[i10])) {
                        return this.attributeValue[i10];
                    }
                    i10++;
                }
            } else {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str == null) {
                    while (i10 < this.attributeCount) {
                        if (str2.equals(this.attributeName[i10])) {
                            return this.attributeValue[i10];
                        }
                        i10++;
                    }
                } else {
                    throw new IllegalArgumentException("when namespaces processing is disabled attribute namespace must be null");
                }
            }
            return null;
        } else {
            throw new IllegalArgumentException("attribute name can not be null");
        }
    }

    public String getNamespace(String str) {
        if (str != null) {
            for (int i10 = this.namespaceEnd - 1; i10 >= 0; i10--) {
                if (str.equals(this.namespacePrefix[i10])) {
                    return this.namespaceUri[i10];
                }
            }
            if ("xml".equals(str)) {
                return XML_URI;
            }
            if ("xmlns".equals(str)) {
                return XMLNS_URI;
            }
            return null;
        }
        for (int i11 = this.namespaceEnd - 1; i11 >= 0; i11--) {
            if (this.namespacePrefix[i11] == null) {
                return this.namespaceUri[i11];
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String printable(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 10);
        for (int i10 = 0; i10 < length; i10++) {
            stringBuffer.append(printable(str.charAt(i10)));
        }
        return stringBuffer.toString();
    }

    public void setInput(Reader reader2) throws XmlPullParserException {
        reset();
        this.reader = reader2;
    }
}
