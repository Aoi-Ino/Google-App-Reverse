package org.xmlpull.v1.wrapper.classic;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import org.xmlpull.v1.wrapper.XmlPullParserWrapper;
import org.xmlpull.v1.wrapper.XmlPullWrapperFactory;
import org.xmlpull.v1.wrapper.XmlSerializerWrapper;

public class StaticXmlSerializerWrapper extends XmlSerializerDelegate implements XmlSerializerWrapper {
    private static final String PROPERTY_XMLDECL_STANDALONE = "http://xmlpull.org/v1/doc/features.html#xmldecl-standalone";
    private static final boolean TRACE_SIZING = false;
    protected String currentNs;
    protected XmlPullParserWrapper fragmentParser;
    protected int[] namespaceDepth;
    protected int namespaceEnd = 0;
    protected String[] namespacePrefix;
    protected String[] namespaceUri;

    /* renamed from: wf  reason: collision with root package name */
    protected XmlPullWrapperFactory f30351wf;

    public StaticXmlSerializerWrapper(XmlSerializer xmlSerializer, XmlPullWrapperFactory xmlPullWrapperFactory) {
        super(xmlSerializer);
        String[] strArr = new String[8];
        this.namespacePrefix = strArr;
        this.namespaceUri = new String[strArr.length];
        this.namespaceDepth = new int[strArr.length];
        this.f30351wf = xmlPullWrapperFactory;
    }

    private void ensureNamespacesCapacity() {
        int i10 = this.namespaceEnd;
        int i11 = i10 > 7 ? i10 * 2 : 8;
        String[] strArr = new String[i11];
        String[] strArr2 = new String[i11];
        int[] iArr = new int[i11];
        String[] strArr3 = this.namespacePrefix;
        if (strArr3 != null) {
            System.arraycopy(strArr3, 0, strArr, 0, i10);
            System.arraycopy(this.namespaceUri, 0, strArr2, 0, this.namespaceEnd);
            System.arraycopy(this.namespaceDepth, 0, iArr, 0, this.namespaceEnd);
        }
        this.namespacePrefix = strArr;
        this.namespaceUri = strArr2;
        this.namespaceDepth = iArr;
    }

    private void writeStartTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (!xmlPullParser.getFeature(XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES)) {
            int namespaceCount = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth());
            for (int namespaceCount2 = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth() - 1); namespaceCount2 < namespaceCount; namespaceCount2++) {
                setPrefix(xmlPullParser.getNamespacePrefix(namespaceCount2), xmlPullParser.getNamespaceUri(namespaceCount2));
            }
        }
        startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
        }
    }

    public XmlSerializerWrapper attribute(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        this.xs.attribute((String) null, str, str2);
        return this;
    }

    public XmlSerializerWrapper element(String str, String str2) throws IOException, XmlPullParserException {
        return element(this.currentNs, str, str2);
    }

    public XmlSerializerWrapper endTag(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        endTag(this.currentNs, str);
        return this;
    }

    public String escapeAttributeValue(String str) {
        String str2;
        int indexOf = str.indexOf(60);
        int indexOf2 = str.indexOf(38);
        int indexOf3 = str.indexOf(34);
        int indexOf4 = str.indexOf(39);
        if (indexOf == -1 && indexOf2 == -1 && indexOf3 == -1 && indexOf4 == -1) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 10);
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\"') {
                str2 = "&quot;";
            } else if (charAt == '<') {
                str2 = "&lt;";
            } else if (charAt == '&') {
                str2 = "&amp;";
            } else if (charAt != '\'') {
                stringBuffer.append(charAt);
            } else {
                str2 = "&apos;";
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    public String escapeText(String str) {
        int indexOf = str.indexOf(60);
        int indexOf2 = str.indexOf(38);
        if (indexOf == -1 && indexOf2 == -1) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 10);
        int i10 = 0;
        while (true) {
            if (indexOf == -1 && indexOf2 == -1) {
                stringBuffer.append(str.substring(i10));
                return stringBuffer.toString();
            } else if (indexOf == -1 || !(indexOf == -1 || indexOf2 == -1 || indexOf2 >= indexOf)) {
                if (i10 < indexOf2) {
                    stringBuffer.append(str.substring(i10, indexOf2));
                }
                stringBuffer.append("&amp;");
                i10 = indexOf2 + 1;
                indexOf2 = str.indexOf(38, i10);
            } else if (indexOf2 == -1 || !(indexOf == -1 || indexOf2 == -1 || indexOf >= indexOf2)) {
                if (i10 < indexOf) {
                    stringBuffer.append(str.substring(i10, indexOf));
                }
                stringBuffer.append("&lt;");
                i10 = indexOf + 1;
                indexOf = str.indexOf(60, i10);
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("wrong state posLt=");
        stringBuffer2.append(indexOf);
        stringBuffer2.append(" posAmp=");
        stringBuffer2.append(indexOf2);
        stringBuffer2.append(" for ");
        stringBuffer2.append(str);
        throw new IllegalStateException(stringBuffer2.toString());
    }

    public void event(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        switch (xmlPullParser.getEventType()) {
            case 0:
                startDocument(xmlPullParser.getInputEncoding(), (Boolean) xmlPullParser.getProperty(PROPERTY_XMLDECL_STANDALONE));
                return;
            case 1:
                endDocument();
                return;
            case 2:
                writeStartTag(xmlPullParser);
                return;
            case 3:
                endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                return;
            case 4:
                if (xmlPullParser.getDepth() > 0) {
                    text(xmlPullParser.getText());
                    return;
                }
                break;
            case 5:
                cdsect(xmlPullParser.getText());
                return;
            case 6:
                entityRef(xmlPullParser.getName());
                return;
            case 7:
                break;
            case 8:
                processingInstruction(xmlPullParser.getText());
                return;
            case 9:
                comment(xmlPullParser.getText());
                return;
            case 10:
                docdecl(xmlPullParser.getText());
                return;
            default:
                return;
        }
        ignorableWhitespace(xmlPullParser.getText());
    }

    public void fragment(String str) throws IOException, IllegalArgumentException, IllegalStateException, XmlPullParserException {
        StringBuffer stringBuffer = new StringBuffer(str.length() + (this.namespaceEnd * 30));
        stringBuffer.append("<fragment");
        for (int i10 = this.namespaceEnd - 1; i10 >= 0; i10--) {
            String str2 = this.namespacePrefix[i10];
            int i11 = this.namespaceEnd - 1;
            while (true) {
                if (i11 <= i10) {
                    stringBuffer.append(" xmlns");
                    if (str2.length() > 0) {
                        stringBuffer.append(':');
                        stringBuffer.append(str2);
                    }
                    stringBuffer.append("='");
                    stringBuffer.append(escapeAttributeValue(this.namespaceUri[i10]));
                    stringBuffer.append("'");
                } else if (str2.equals(this.namespacePrefix[i11])) {
                    break;
                } else {
                    i11--;
                }
            }
        }
        stringBuffer.append(">");
        stringBuffer.append(str);
        stringBuffer.append("</fragment>");
        if (this.fragmentParser == null) {
            this.fragmentParser = this.f30351wf.newPullParserWrapper();
        }
        this.fragmentParser.setInput(new StringReader(stringBuffer.toString()));
        this.fragmentParser.nextTag();
        this.fragmentParser.require(2, (String) null, "fragment");
        while (true) {
            this.fragmentParser.nextToken();
            if (this.fragmentParser.getDepth() == 1 && this.fragmentParser.getEventType() == 3) {
                this.fragmentParser.require(3, (String) null, "fragment");
                return;
            }
            event(this.fragmentParser);
        }
    }

    public String getCurrentNamespaceForElements() {
        return this.currentNs;
    }

    public String setCurrentNamespaceForElements(String str) {
        String str2 = this.currentNs;
        this.currentNs = str;
        return str2;
    }

    public void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        this.xs.setPrefix(str, str2);
        int depth = getDepth();
        int i10 = this.namespaceEnd - 1;
        while (i10 >= 0 && this.namespaceDepth[i10] > depth) {
            this.namespaceEnd--;
            i10--;
        }
        if (this.namespaceEnd >= this.namespacePrefix.length) {
            ensureNamespacesCapacity();
        }
        String[] strArr = this.namespacePrefix;
        int i11 = this.namespaceEnd;
        strArr[i11] = str;
        this.namespaceUri[i11] = str2;
        this.namespaceEnd = i11 + 1;
    }

    public XmlSerializerWrapper startTag(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        this.xs.startTag(this.currentNs, str);
        return this;
    }

    public void wiriteStringElement(String str, String str2, String str3) throws XmlPullParserException, IOException, IllegalArgumentException {
        this.xs.startTag(str, str2);
        writeString(str3);
        this.xs.endTag(str, str2);
    }

    public void writeDouble(double d10) throws XmlPullParserException, IOException, IllegalArgumentException {
        XmlSerializer xmlSerializer;
        String str;
        if (d10 == Double.POSITIVE_INFINITY) {
            xmlSerializer = this.xs;
            str = "INF";
        } else if (d10 == Double.NEGATIVE_INFINITY) {
            xmlSerializer = this.xs;
            str = "-INF";
        } else {
            this.xs.text(Double.toString(d10));
            return;
        }
        xmlSerializer.text(str);
    }

    public void writeDoubleElement(String str, String str2, double d10) throws XmlPullParserException, IOException, IllegalArgumentException {
        this.xs.startTag(str, str2);
        writeDouble(d10);
        this.xs.endTag(str, str2);
    }

    public void writeFloat(float f10) throws XmlPullParserException, IOException, IllegalArgumentException {
        XmlSerializer xmlSerializer;
        String str;
        if (f10 == Float.POSITIVE_INFINITY) {
            xmlSerializer = this.xs;
            str = "INF";
        } else if (f10 == Float.NEGATIVE_INFINITY) {
            xmlSerializer = this.xs;
            str = "-INF";
        } else {
            this.xs.text(Float.toString(f10));
            return;
        }
        xmlSerializer.text(str);
    }

    public void writeFloatElement(String str, String str2, float f10) throws XmlPullParserException, IOException, IllegalArgumentException {
        this.xs.startTag(str, str2);
        writeFloat(f10);
        this.xs.endTag(str, str2);
    }

    public void writeInt(int i10) throws XmlPullParserException, IOException, IllegalArgumentException {
        this.xs.text(Integer.toString(i10));
    }

    public void writeIntElement(String str, String str2, int i10) throws XmlPullParserException, IOException, IllegalArgumentException {
        this.xs.startTag(str, str2);
        writeInt(i10);
        this.xs.endTag(str, str2);
    }

    public void writeString(String str) throws XmlPullParserException, IOException, IllegalArgumentException {
        if (str != null) {
            this.xs.text(str);
            return;
        }
        throw new IllegalArgumentException("null string can not be written");
    }

    public XmlSerializerWrapper element(String str, String str2, String str3) throws IOException, XmlPullParserException {
        if (str2 != null) {
            this.xs.startTag(str, str2);
            if (str3 == null) {
                this.xs.attribute("http://www.w3.org/2001/XMLSchema-instance", "nil", "true");
            } else {
                this.xs.text(str3);
            }
            this.xs.endTag(str, str2);
            return this;
        }
        throw new XmlPullParserException("name for element can not be null");
    }
}
