package org.xmlpull.mxp1_serializer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.xmlpull.v1.XmlSerializer;

public class MXSerializer implements XmlSerializer {
    private static final boolean TRACE_SIZING = false;
    protected static final String XMLNS_URI = "http://www.w3.org/2000/xmlns/";
    protected static final String XML_URI = "http://www.w3.org/XML/1998/namespace";
    protected static final String[] precomputedPrefixes = new String[32];
    protected final String FEATURE_NAMES_INTERNED = "http://xmlpull.org/v1/doc/features.html#names-interned";
    protected final String FEATURE_SERIALIZER_ATTVALUE_USE_APOSTROPHE = "http://xmlpull.org/v1/doc/features.html#serializer-attvalue-use-apostrophe";
    protected final String PROPERTY_SERIALIZER_INDENTATION = "http://xmlpull.org/v1/doc/properties.html#serializer-indentation";
    protected final String PROPERTY_SERIALIZER_LINE_SEPARATOR = "http://xmlpull.org/v1/doc/properties.html#serializer-line-separator";
    protected boolean attributeUseApostrophe;
    protected int autoDeclaredPrefixes;
    private boolean checkNamesInterned;
    protected int depth = 0;
    protected boolean doIndent;
    protected String[] elName;
    protected String[] elNamespace;
    protected int[] elNamespaceCount;
    protected boolean finished;
    protected char[] indentationBuf;
    protected int indentationJump;
    protected String indentationString = null;
    protected String lineSeparator = "\n";
    protected int maxIndentLevel;
    protected boolean namesInterned;
    protected int namespaceEnd;
    protected String[] namespacePrefix;
    protected String[] namespaceUri;
    protected int offsetNewLine;
    protected Writer out;
    protected boolean pastRoot;
    protected boolean seenTag;
    protected boolean setPrefixCalled;
    protected boolean startTagIncomplete;
    protected boolean writeIndentation;
    protected boolean writeLineSepartor;

    static {
        int i10 = 0;
        while (true) {
            String[] strArr = precomputedPrefixes;
            if (i10 < strArr.length) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("n");
                stringBuffer.append(i10);
                strArr[i10] = stringBuffer.toString().intern();
                i10++;
            } else {
                return;
            }
        }
    }

    public MXSerializer() {
        String[] strArr = new String[2];
        this.elNamespace = strArr;
        this.elName = new String[strArr.length];
        this.elNamespaceCount = new int[strArr.length];
        this.namespaceEnd = 0;
        String[] strArr2 = new String[8];
        this.namespacePrefix = strArr2;
        this.namespaceUri = new String[strArr2.length];
        this.checkNamesInterned = TRACE_SIZING;
    }

    private static void addPrintable(StringBuffer stringBuffer, char c10) {
        String str;
        if (c10 == 12) {
            str = "\\f";
        } else if (c10 == 13) {
            str = "\\r";
        } else if (c10 == '\"') {
            str = "\\\"";
        } else if (c10 == '\'') {
            str = "\\'";
        } else if (c10 != '\\') {
            switch (c10) {
                case 8:
                    str = "\\b";
                    break;
                case 9:
                    str = "\\t";
                    break;
                case 10:
                    str = "\\n";
                    break;
                default:
                    if (c10 < ' ' || c10 > '~') {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("0000");
                        stringBuffer2.append(Integer.toString(c10, 16));
                        String stringBuffer3 = stringBuffer2.toString();
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("\\u");
                        stringBuffer4.append(stringBuffer3.substring(stringBuffer3.length() - 4, stringBuffer3.length()));
                        str = stringBuffer4.toString();
                        break;
                    } else {
                        stringBuffer.append(c10);
                        return;
                    }
            }
        } else {
            str = "\\\\";
        }
        stringBuffer.append(str);
    }

    private void checkInterning(String str) {
        if (this.namesInterned && str != str.intern()) {
            throw new IllegalArgumentException("all names passed as arguments must be internedwhen NAMES INTERNED feature is enabled");
        }
    }

    private String generatePrefix(String str) {
        String str2;
        int i10 = this.autoDeclaredPrefixes + 1;
        this.autoDeclaredPrefixes = i10;
        String[] strArr = precomputedPrefixes;
        if (i10 < strArr.length) {
            str2 = strArr[i10];
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("n");
            stringBuffer.append(this.autoDeclaredPrefixes);
            str2 = stringBuffer.toString().intern();
        }
        for (int i11 = this.namespaceEnd - 1; i11 >= 0; i11--) {
            String str3 = this.namespacePrefix[i11];
        }
        if (this.namespaceEnd >= this.namespacePrefix.length) {
            ensureNamespacesCapacity();
        }
        String[] strArr2 = this.namespacePrefix;
        int i12 = this.namespaceEnd;
        strArr2[i12] = str2;
        this.namespaceUri[i12] = str;
        this.namespaceEnd = i12 + 1;
        return str2;
    }

    protected static final String printable(char c10) {
        StringBuffer stringBuffer = new StringBuffer();
        addPrintable(stringBuffer, c10);
        return stringBuffer.toString();
    }

    private void writeNamespaceDeclarations() throws IOException {
        for (int i10 = this.elNamespaceCount[this.depth - 1]; i10 < this.namespaceEnd; i10++) {
            if (this.namespacePrefix[i10] != "") {
                this.out.write(" xmlns:");
                this.out.write(this.namespacePrefix[i10]);
                this.out.write(61);
            } else {
                this.out.write(" xmlns=");
            }
            int i11 = 34;
            this.out.write(this.attributeUseApostrophe ? 39 : 34);
            writeAttributeValue(this.namespaceUri[i10], this.out);
            Writer writer = this.out;
            if (this.attributeUseApostrophe) {
                i11 = 39;
            }
            writer.write(i11);
        }
    }

    public XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (this.startTagIncomplete) {
            this.out.write(32);
            if (str != null && str.length() > 0) {
                if (!this.namesInterned) {
                    str = str.intern();
                } else if (this.checkNamesInterned) {
                    checkInterning(str);
                }
                String lookupOrDeclarePrefix = lookupOrDeclarePrefix(str);
                if (lookupOrDeclarePrefix.length() == 0) {
                    lookupOrDeclarePrefix = generatePrefix(str);
                }
                this.out.write(lookupOrDeclarePrefix);
                this.out.write(58);
            }
            this.out.write(str2);
            this.out.write(61);
            int i10 = 34;
            this.out.write(this.attributeUseApostrophe ? 39 : 34);
            writeAttributeValue(str3, this.out);
            Writer writer = this.out;
            if (this.attributeUseApostrophe) {
                i10 = 39;
            }
            writer.write(i10);
            return this;
        }
        throw new IllegalArgumentException("startTag() must be called before attribute()");
    }

    public void cdsect(String str) throws IOException {
        if (this.startTagIncomplete || this.setPrefixCalled) {
            closeStartTag();
        }
        if (this.doIndent && this.seenTag) {
            this.seenTag = TRACE_SIZING;
        }
        this.out.write("<![CDATA[");
        this.out.write(str);
        this.out.write("]]>");
    }

    /* access modifiers changed from: protected */
    public void closeStartTag() throws IOException {
        if (this.finished) {
            throw new IllegalArgumentException("trying to write past already finished output");
        } else if (this.setPrefixCalled) {
            throw new IllegalArgumentException("startTag() must be called immediately after setPrefix()");
        } else if (this.startTagIncomplete) {
            writeNamespaceDeclarations();
            this.out.write(62);
            this.elNamespaceCount[this.depth] = this.namespaceEnd;
            this.startTagIncomplete = TRACE_SIZING;
        } else {
            throw new IllegalArgumentException("trying to close start tag that is not opened");
        }
    }

    public void comment(String str) throws IOException {
        if (this.startTagIncomplete || this.setPrefixCalled) {
            closeStartTag();
        }
        if (this.doIndent && this.seenTag) {
            this.seenTag = TRACE_SIZING;
        }
        this.out.write("<!--");
        this.out.write(str);
        this.out.write("-->");
    }

    public void docdecl(String str) throws IOException {
        if (this.startTagIncomplete || this.setPrefixCalled) {
            closeStartTag();
        }
        if (this.doIndent && this.seenTag) {
            this.seenTag = TRACE_SIZING;
        }
        this.out.write("<!DOCTYPE");
        this.out.write(str);
        this.out.write(">");
    }

    public void endDocument() throws IOException {
        while (true) {
            int i10 = this.depth;
            if (i10 <= 0) {
                this.startTagIncomplete = true;
                this.pastRoot = true;
                this.finished = true;
                this.out.flush();
                return;
            }
            endTag(this.elNamespace[i10], this.elName[i10]);
        }
    }

    public XmlSerializer endTag(String str, String str2) throws IOException {
        if (str != null) {
            if (!this.namesInterned) {
                str = str.intern();
            } else if (this.checkNamesInterned) {
                checkInterning(str);
            }
        }
        if (str != this.elNamespace[this.depth]) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected namespace ");
            stringBuffer.append(printable(this.elNamespace[this.depth]));
            stringBuffer.append(" and not ");
            stringBuffer.append(printable(str));
            throw new IllegalArgumentException(stringBuffer.toString());
        } else if (str2 != null) {
            if (this.checkNamesInterned && this.namesInterned) {
                checkInterning(str2);
            }
            if ((this.namesInterned || str2.equals(this.elName[this.depth])) && (!this.namesInterned || str2 == this.elName[this.depth])) {
                if (this.startTagIncomplete) {
                    writeNamespaceDeclarations();
                    this.out.write(" />");
                    this.depth--;
                } else {
                    this.depth--;
                    if (this.doIndent && this.seenTag) {
                        writeIndent();
                    }
                    this.out.write("</");
                    if (str != null && str.length() > 0) {
                        String lookupOrDeclarePrefix = lookupOrDeclarePrefix(str);
                        if (lookupOrDeclarePrefix.length() > 0) {
                            this.out.write(lookupOrDeclarePrefix);
                            this.out.write(58);
                        }
                    }
                    this.out.write(str2);
                    this.out.write(62);
                }
                this.namespaceEnd = this.elNamespaceCount[this.depth];
                this.startTagIncomplete = TRACE_SIZING;
                this.seenTag = true;
                return this;
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("expected element name ");
            stringBuffer2.append(printable(this.elName[this.depth]));
            stringBuffer2.append(" and not ");
            stringBuffer2.append(printable(str2));
            throw new IllegalArgumentException(stringBuffer2.toString());
        } else {
            throw new IllegalArgumentException("end tag name can not be null");
        }
    }

    /* access modifiers changed from: protected */
    public void ensureElementsCapacity() {
        String[] strArr = this.elName;
        int length = strArr.length;
        int i10 = this.depth;
        int i11 = (i10 >= 7 ? i10 * 2 : 8) + 2;
        boolean z10 = length > 0;
        String[] strArr2 = new String[i11];
        if (z10) {
            System.arraycopy(strArr, 0, strArr2, 0, length);
        }
        this.elName = strArr2;
        String[] strArr3 = new String[i11];
        if (z10) {
            System.arraycopy(this.elNamespace, 0, strArr3, 0, length);
        }
        this.elNamespace = strArr3;
        int[] iArr = new int[i11];
        if (z10) {
            System.arraycopy(this.elNamespaceCount, 0, iArr, 0, length);
        } else {
            iArr[0] = 0;
        }
        this.elNamespaceCount = iArr;
    }

    /* access modifiers changed from: protected */
    public void ensureNamespacesCapacity() {
        int i10 = this.namespaceEnd;
        int i11 = i10 > 7 ? i10 * 2 : 8;
        String[] strArr = new String[i11];
        String[] strArr2 = new String[i11];
        String[] strArr3 = this.namespacePrefix;
        if (strArr3 != null) {
            System.arraycopy(strArr3, 0, strArr, 0, i10);
            System.arraycopy(this.namespaceUri, 0, strArr2, 0, this.namespaceEnd);
        }
        this.namespacePrefix = strArr;
        this.namespaceUri = strArr2;
    }

    public void entityRef(String str) throws IOException {
        if (this.startTagIncomplete || this.setPrefixCalled) {
            closeStartTag();
        }
        if (this.doIndent && this.seenTag) {
            this.seenTag = TRACE_SIZING;
        }
        this.out.write(38);
        this.out.write(str);
        this.out.write(59);
    }

    public void flush() throws IOException {
        if (this.startTagIncomplete) {
            closeStartTag();
        }
        this.out.flush();
    }

    public int getDepth() {
        return this.depth;
    }

    public boolean getFeature(String str) throws IllegalArgumentException {
        if (str != null) {
            return "http://xmlpull.org/v1/doc/features.html#names-interned".equals(str) ? this.namesInterned : "http://xmlpull.org/v1/doc/features.html#serializer-attvalue-use-apostrophe".equals(str) ? this.attributeUseApostrophe : TRACE_SIZING;
        }
        throw new IllegalArgumentException("feature name can not be null");
    }

    public String getName() {
        return this.elName[this.depth];
    }

    public String getNamespace() {
        return this.elNamespace[this.depth];
    }

    public String getPrefix(String str, boolean z10) {
        if (!this.namesInterned) {
            str = str.intern();
        } else if (this.checkNamesInterned) {
            checkInterning(str);
        } else if (str == null) {
            throw new IllegalArgumentException("namespace must be not null");
        }
        for (int i10 = this.namespaceEnd - 1; i10 >= 0; i10--) {
            if (str == this.namespaceUri[i10]) {
                String str2 = this.namespacePrefix[i10];
                for (int i11 = this.namespaceEnd - 1; i11 > i10; i11--) {
                    String str3 = this.namespacePrefix[i11];
                }
                return str2;
            }
        }
        if (!z10) {
            return null;
        }
        return generatePrefix(str);
    }

    public Object getProperty(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("property name can not be null");
        } else if ("http://xmlpull.org/v1/doc/properties.html#serializer-indentation".equals(str)) {
            return this.indentationString;
        } else {
            if ("http://xmlpull.org/v1/doc/properties.html#serializer-line-separator".equals(str)) {
                return this.lineSeparator;
            }
            return null;
        }
    }

    public void ignorableWhitespace(String str) throws IOException {
        if (this.startTagIncomplete || this.setPrefixCalled) {
            closeStartTag();
        }
        if (this.doIndent && this.seenTag) {
            this.seenTag = TRACE_SIZING;
        }
        this.out.write(str);
    }

    /* access modifiers changed from: protected */
    public String lookupOrDeclarePrefix(String str) {
        return getPrefix(str, true);
    }

    public void processingInstruction(String str) throws IOException {
        if (this.startTagIncomplete || this.setPrefixCalled) {
            closeStartTag();
        }
        if (this.doIndent && this.seenTag) {
            this.seenTag = TRACE_SIZING;
        }
        this.out.write("<?");
        this.out.write(str);
        this.out.write("?>");
    }

    /* access modifiers changed from: protected */
    public void rebuildIndentationBuf() {
        int i10;
        int i11;
        if (this.doIndent) {
            this.offsetNewLine = 0;
            if (this.writeLineSepartor) {
                i10 = this.lineSeparator.length();
                this.offsetNewLine = i10;
            } else {
                i10 = 0;
            }
            this.maxIndentLevel = 0;
            if (this.writeIndentation) {
                int length = this.indentationString.length();
                this.indentationJump = length;
                int i12 = 65 / length;
                this.maxIndentLevel = i12;
                i10 += i12 * length;
            }
            char[] cArr = this.indentationBuf;
            if (cArr == null || cArr.length < i10) {
                this.indentationBuf = new char[(i10 + 8)];
            }
            if (this.writeLineSepartor) {
                int i13 = 0;
                i11 = 0;
                while (i13 < this.lineSeparator.length()) {
                    this.indentationBuf[i11] = this.lineSeparator.charAt(i13);
                    i13++;
                    i11++;
                }
            } else {
                i11 = 0;
            }
            if (this.writeIndentation) {
                for (int i14 = 0; i14 < this.maxIndentLevel; i14++) {
                    int i15 = 0;
                    while (i15 < this.indentationString.length()) {
                        this.indentationBuf[i11] = this.indentationString.charAt(i15);
                        i15++;
                        i11++;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void reset() {
        this.out = null;
        this.autoDeclaredPrefixes = 0;
        this.depth = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.elNamespaceCount;
            if (i10 >= iArr.length) {
                String[] strArr = this.namespacePrefix;
                strArr[0] = "xmlns";
                String[] strArr2 = this.namespaceUri;
                strArr2[0] = XMLNS_URI;
                strArr[1] = "xml";
                strArr2[1] = XML_URI;
                this.namespaceEnd = 1 + 1;
                this.finished = TRACE_SIZING;
                this.pastRoot = TRACE_SIZING;
                this.setPrefixCalled = TRACE_SIZING;
                this.startTagIncomplete = TRACE_SIZING;
                this.seenTag = TRACE_SIZING;
                return;
            }
            this.elName[i10] = null;
            this.elNamespace[i10] = null;
            iArr[i10] = 2;
            i10++;
        }
    }

    public void setFeature(String str, boolean z10) throws IllegalArgumentException, IllegalStateException {
        if (str == null) {
            throw new IllegalArgumentException("feature name can not be null");
        } else if ("http://xmlpull.org/v1/doc/features.html#names-interned".equals(str)) {
            this.namesInterned = z10;
        } else if ("http://xmlpull.org/v1/doc/features.html#serializer-attvalue-use-apostrophe".equals(str)) {
            this.attributeUseApostrophe = z10;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("unsupported feature ");
            stringBuffer.append(str);
            throw new IllegalStateException(stringBuffer.toString());
        }
    }

    public void setOutput(OutputStream outputStream, String str) throws IOException {
        if (outputStream != null) {
            reset();
            if (str != null) {
                this.out = new OutputStreamWriter(outputStream, str);
            } else {
                this.out = new OutputStreamWriter(outputStream);
            }
        } else {
            throw new IllegalArgumentException("output stream can not be null");
        }
    }

    public void setPrefix(String str, String str2) throws IOException {
        if (this.startTagIncomplete) {
            closeStartTag();
        }
        if (str == null) {
            str = "";
        }
        if (!this.namesInterned) {
            str = str.intern();
        } else if (this.checkNamesInterned) {
            checkInterning(str);
        }
        int i10 = this.elNamespaceCount[this.depth];
        while (i10 < this.namespaceEnd) {
            if (str != this.namespacePrefix[i10]) {
                i10++;
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("duplicated prefix ");
                stringBuffer.append(printable(str));
                throw new IllegalStateException(stringBuffer.toString());
            }
        }
        if (!this.namesInterned) {
            str2 = str2.intern();
        } else if (this.checkNamesInterned) {
            checkInterning(str2);
        } else if (str2 == null) {
            throw new IllegalArgumentException("namespace must be not null");
        }
        if (this.namespaceEnd >= this.namespacePrefix.length) {
            ensureNamespacesCapacity();
        }
        String[] strArr = this.namespacePrefix;
        int i11 = this.namespaceEnd;
        strArr[i11] = str;
        this.namespaceUri[i11] = str2;
        this.namespaceEnd = i11 + 1;
        this.setPrefixCalled = true;
    }

    public void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        if (str != null) {
            if ("http://xmlpull.org/v1/doc/properties.html#serializer-indentation".equals(str)) {
                this.indentationString = (String) obj;
            } else if ("http://xmlpull.org/v1/doc/properties.html#serializer-line-separator".equals(str)) {
                this.lineSeparator = (String) obj;
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("unsupported property ");
                stringBuffer.append(str);
                throw new IllegalStateException(stringBuffer.toString());
            }
            String str2 = this.lineSeparator;
            boolean z10 = true;
            this.writeLineSepartor = str2 != null && str2.length() > 0;
            String str3 = this.indentationString;
            boolean z11 = str3 != null && str3.length() > 0;
            this.writeIndentation = z11;
            if (this.indentationString == null || (!this.writeLineSepartor && !z11)) {
                z10 = false;
            }
            this.doIndent = z10;
            rebuildIndentationBuf();
            this.seenTag = TRACE_SIZING;
            return;
        }
        throw new IllegalArgumentException("property name can not be null");
    }

    public void startDocument(String str, Boolean bool) throws IOException {
        Writer writer;
        String str2;
        this.out.write("<?xml version=\"1.0\"");
        if (str != null) {
            this.out.write(" encoding='");
            this.out.write(str);
            this.out.write(39);
        }
        if (bool != null) {
            if (bool.booleanValue()) {
                writer = this.out;
                str2 = " standalone='yes'";
            } else {
                writer = this.out;
                str2 = " standalone='no'";
            }
            writer.write(str2);
        }
        this.out.write("?>");
    }

    public XmlSerializer startTag(String str, String str2) throws IOException {
        if (this.startTagIncomplete) {
            closeStartTag();
        }
        if (this.doIndent && this.depth > 0 && this.seenTag) {
            writeIndent();
        }
        this.seenTag = true;
        this.setPrefixCalled = TRACE_SIZING;
        this.startTagIncomplete = true;
        int i10 = this.depth;
        this.depth = i10 + 1;
        if (i10 + 2 >= this.elName.length) {
            ensureElementsCapacity();
        }
        if (this.checkNamesInterned && this.namesInterned) {
            checkInterning(str);
        }
        this.elNamespace[this.depth] = (this.namesInterned || str == null) ? str : str.intern();
        if (this.checkNamesInterned && this.namesInterned) {
            checkInterning(str2);
        }
        this.elName[this.depth] = (this.namesInterned || str2 == null) ? str2 : str2.intern();
        this.out.write(60);
        if (str != null) {
            if (str.length() <= 0) {
                int i11 = this.namespaceEnd - 1;
                while (true) {
                    if (i11 < 0) {
                        break;
                    } else if (this.namespacePrefix[i11] == "") {
                        String str3 = this.namespaceUri[i11];
                        if (str3 == null) {
                            setPrefix("", "");
                        } else if (str3.length() > 0) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("start tag can not be written in empty default namespace as default namespace is currently bound to '");
                            stringBuffer.append(str3);
                            stringBuffer.append("'");
                            throw new IllegalStateException(stringBuffer.toString());
                        }
                    } else {
                        i11--;
                    }
                }
            } else {
                String lookupOrDeclarePrefix = lookupOrDeclarePrefix(str);
                if (lookupOrDeclarePrefix.length() > 0) {
                    this.out.write(lookupOrDeclarePrefix);
                    this.out.write(58);
                }
            }
        }
        this.out.write(str2);
        return this;
    }

    public XmlSerializer text(String str) throws IOException {
        if (this.startTagIncomplete || this.setPrefixCalled) {
            closeStartTag();
        }
        if (this.doIndent && this.seenTag) {
            this.seenTag = TRACE_SIZING;
        }
        writeElementContent(str, this.out);
        return this;
    }

    /* access modifiers changed from: protected */
    public void writeAttributeValue(String str, Writer writer) throws IOException {
        boolean z10 = this.attributeUseApostrophe;
        int i10 = z10 ? 39 : 34;
        String str2 = z10 ? "&apos;" : "&quot;";
        int indexOf = str.indexOf(60);
        int indexOf2 = str.indexOf(38);
        int indexOf3 = str.indexOf(i10);
        int i11 = 0;
        while (true) {
            if (indexOf == -1 && indexOf2 == -1 && indexOf3 == -1) {
                if (i11 > 0) {
                    str = str.substring(i11);
                }
                writer.write(str);
                return;
            } else if (indexOf3 != -1 && ((indexOf2 == -1 || (indexOf2 != -1 && indexOf3 < indexOf2)) && (indexOf == -1 || (indexOf != -1 && indexOf3 < indexOf)))) {
                if (i11 < indexOf3) {
                    writer.write(str.substring(i11, indexOf3));
                }
                writer.write(str2);
                i11 = indexOf3 + 1;
                indexOf3 = str.indexOf(i10, i11);
            } else if (indexOf2 != -1 && ((indexOf3 == -1 || (indexOf3 != -1 && indexOf2 < indexOf3)) && (indexOf == -1 || (indexOf != -1 && indexOf2 < indexOf)))) {
                if (i11 < indexOf2) {
                    writer.write(str.substring(i11, indexOf2));
                }
                writer.write("&amp;");
                i11 = indexOf2 + 1;
                indexOf2 = str.indexOf(38, i11);
            } else if (indexOf == -1 || ((indexOf3 != -1 && (indexOf3 == -1 || indexOf >= indexOf3)) || (indexOf2 != -1 && (indexOf2 == -1 || indexOf >= indexOf2)))) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("wrong state #1 posLt=");
                stringBuffer.append(indexOf);
                stringBuffer.append(" posAmp=");
                stringBuffer.append(indexOf2);
                stringBuffer.append(" posQuot=");
                stringBuffer.append(indexOf3);
                stringBuffer.append(" for ");
                stringBuffer.append(str);
            } else {
                if (i11 < indexOf) {
                    writer.write(str.substring(i11, indexOf));
                }
                writer.write("&lt;");
                i11 = indexOf + 1;
                indexOf = str.indexOf(60, i11);
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("wrong state #1 posLt=");
        stringBuffer2.append(indexOf);
        stringBuffer2.append(" posAmp=");
        stringBuffer2.append(indexOf2);
        stringBuffer2.append(" posQuot=");
        stringBuffer2.append(indexOf3);
        stringBuffer2.append(" for ");
        stringBuffer2.append(str);
        throw new IllegalStateException(stringBuffer2.toString());
    }

    /* access modifiers changed from: protected */
    public void writeElementContent(String str, Writer writer) throws IOException {
        int indexOf = str.indexOf(60);
        int indexOf2 = str.indexOf(38);
        int i10 = 0;
        while (true) {
            if (indexOf == -1 && indexOf2 == -1) {
                writer.write(str.substring(i10));
                return;
            } else if (indexOf == -1 || !(indexOf == -1 || indexOf2 == -1 || indexOf2 >= indexOf)) {
                if (i10 < indexOf2) {
                    writer.write(str.substring(i10, indexOf2));
                }
                writer.write("&amp;");
                i10 = indexOf2 + 1;
                indexOf2 = str.indexOf(38, i10);
            } else if (indexOf2 == -1 || !(indexOf == -1 || indexOf2 == -1 || indexOf >= indexOf2)) {
                if (i10 < indexOf) {
                    writer.write(str.substring(i10, indexOf));
                }
                writer.write("&lt;");
                i10 = indexOf + 1;
                indexOf = str.indexOf(60, i10);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("wrong state posLt=");
        stringBuffer.append(indexOf);
        stringBuffer.append(" posAmp=");
        stringBuffer.append(indexOf2);
        stringBuffer.append(" for ");
        stringBuffer.append(str);
        throw new IllegalStateException(stringBuffer.toString());
    }

    /* access modifiers changed from: protected */
    public void writeIndent() throws IOException {
        int i10 = this.writeLineSepartor ? 0 : this.offsetNewLine;
        int i11 = this.depth;
        int i12 = this.maxIndentLevel;
        if (i11 > i12) {
            i11 = i12;
        }
        this.out.write(this.indentationBuf, i10, (i11 * this.indentationJump) + this.offsetNewLine);
    }

    protected static final String printable(String str) {
        if (str == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 16);
        stringBuffer.append("'");
        for (int i10 = 0; i10 < str.length(); i10++) {
            addPrintable(stringBuffer, str.charAt(i10));
        }
        stringBuffer.append("'");
        return stringBuffer.toString();
    }

    public void setOutput(Writer writer) {
        reset();
        this.out = writer;
    }

    public XmlSerializer text(char[] cArr, int i10, int i11) throws IOException {
        if (this.startTagIncomplete || this.setPrefixCalled) {
            closeStartTag();
        }
        if (this.doIndent && this.seenTag) {
            this.seenTag = TRACE_SIZING;
        }
        writeElementContent(cArr, i10, i11, this.out);
        return this;
    }

    /* access modifiers changed from: protected */
    public void writeElementContent(char[] cArr, int i10, int i11, Writer writer) throws IOException {
        String str;
        int i12 = i11 + i10;
        int i13 = i10;
        while (i10 < i12) {
            char c10 = cArr[i10];
            if (c10 == '&') {
                if (i10 > i13) {
                    writer.write(cArr, i13, i10 - i13);
                }
                str = "&amp;";
            } else if (c10 != '<') {
                i10++;
            } else {
                if (i10 > i13) {
                    writer.write(cArr, i13, i10 - i13);
                }
                str = "&lt;";
            }
            writer.write(str);
            i13 = i10 + 1;
            i10++;
        }
        if (i12 > i13) {
            writer.write(cArr, i13, i12 - i13);
        }
    }
}
