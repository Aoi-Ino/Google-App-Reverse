package org.xmlpull.v1.sax2;

import java.io.IOException;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class Driver implements Locator, XMLReader, Attributes {
    protected static final String APACHE_DYNAMIC_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/dynamic";
    protected static final String APACHE_SCHEMA_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/schema";
    protected static final String DECLARATION_HANDLER_PROPERTY = "http://xml.org/sax/properties/declaration-handler";
    protected static final String LEXICAL_HANDLER_PROPERTY = "http://xml.org/sax/properties/lexical-handler";
    protected static final String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
    protected static final String NAMESPACE_PREFIXES_FEATURE = "http://xml.org/sax/features/namespace-prefixes";
    protected static final String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
    protected ContentHandler contentHandler = new DefaultHandler();
    protected ErrorHandler errorHandler = new DefaultHandler();
    protected XmlPullParser pp;
    protected String systemId;

    public Driver() throws XmlPullParserException {
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        this.pp = newInstance.newPullParser();
    }

    public int getColumnNumber() {
        return this.pp.getColumnNumber();
    }

    public ContentHandler getContentHandler() {
        return this.contentHandler;
    }

    public DTDHandler getDTDHandler() {
        return null;
    }

    public EntityResolver getEntityResolver() {
        return null;
    }

    public ErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public boolean getFeature(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        return NAMESPACES_FEATURE.equals(str) ? this.pp.getFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES) : NAMESPACE_PREFIXES_FEATURE.equals(str) ? this.pp.getFeature(XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES) : VALIDATION_FEATURE.equals(str) ? this.pp.getFeature(XmlPullParser.FEATURE_VALIDATION) : this.pp.getFeature(str);
    }

    public int getIndex(String str) {
        for (int i10 = 0; i10 < this.pp.getAttributeCount(); i10++) {
            if (this.pp.getAttributeName(i10).equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public int getLength() {
        return this.pp.getAttributeCount();
    }

    public int getLineNumber() {
        return this.pp.getLineNumber();
    }

    public String getLocalName(int i10) {
        return this.pp.getAttributeName(i10);
    }

    public Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (!DECLARATION_HANDLER_PROPERTY.equals(str) && !LEXICAL_HANDLER_PROPERTY.equals(str)) {
            return this.pp.getProperty(str);
        }
        return null;
    }

    public String getPublicId() {
        return null;
    }

    public String getQName(int i10) {
        String attributePrefix = this.pp.getAttributePrefix(i10);
        if (attributePrefix == null) {
            return this.pp.getAttributeName(i10);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(attributePrefix);
        stringBuffer.append(':');
        stringBuffer.append(this.pp.getAttributeName(i10));
        return stringBuffer.toString();
    }

    public String getSystemId() {
        return this.systemId;
    }

    public String getType(int i10) {
        return this.pp.getAttributeType(i10);
    }

    public String getURI(int i10) {
        return this.pp.getAttributeNamespace(i10);
    }

    public String getValue(int i10) {
        return this.pp.getAttributeValue(i10);
    }

    public void parse(String str) throws SAXException, IOException {
        parse(new InputSource(str));
    }

    public void parseSubTree(XmlPullParser xmlPullParser) throws SAXException, IOException {
        this.pp = xmlPullParser;
        boolean feature = xmlPullParser.getFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES);
        try {
            if (xmlPullParser.getEventType() == 2) {
                int[] iArr = new int[2];
                StringBuffer stringBuffer = new StringBuffer(16);
                int depth = xmlPullParser.getDepth() - 1;
                int i10 = 2;
                while (i10 != 1) {
                    int i11 = 0;
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                this.contentHandler.characters(xmlPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                            }
                        } else if (feature) {
                            String name = xmlPullParser.getName();
                            String prefix = xmlPullParser.getPrefix();
                            if (prefix != null) {
                                stringBuffer.setLength(0);
                                stringBuffer.append(prefix);
                                stringBuffer.append(':');
                                stringBuffer.append(name);
                            }
                            this.contentHandler.endElement(xmlPullParser.getNamespace(), name, prefix != null ? name : stringBuffer.toString());
                            if (depth > xmlPullParser.getDepth()) {
                                i11 = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth());
                            }
                            for (int namespaceCount = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth() - 1) - 1; namespaceCount >= i11; namespaceCount--) {
                                this.contentHandler.endPrefixMapping(xmlPullParser.getNamespacePrefix(namespaceCount));
                            }
                        } else {
                            this.contentHandler.endElement(xmlPullParser.getNamespace(), xmlPullParser.getName(), xmlPullParser.getName());
                        }
                    } else if (feature) {
                        int depth2 = xmlPullParser.getDepth();
                        int i12 = depth2 - 1;
                        int namespaceCount2 = xmlPullParser.getNamespaceCount(depth2);
                        for (int namespaceCount3 = depth > i12 ? xmlPullParser.getNamespaceCount(i12) : 0; namespaceCount3 < namespaceCount2; namespaceCount3++) {
                            this.contentHandler.startPrefixMapping(xmlPullParser.getNamespacePrefix(namespaceCount3), xmlPullParser.getNamespaceUri(namespaceCount3));
                        }
                        String name2 = xmlPullParser.getName();
                        String prefix2 = xmlPullParser.getPrefix();
                        if (prefix2 != null) {
                            stringBuffer.setLength(0);
                            stringBuffer.append(prefix2);
                            stringBuffer.append(':');
                            stringBuffer.append(name2);
                        }
                        startElement(xmlPullParser.getNamespace(), name2, prefix2 != null ? name2 : stringBuffer.toString());
                    } else {
                        startElement(xmlPullParser.getNamespace(), xmlPullParser.getName(), xmlPullParser.getName());
                    }
                    i10 = xmlPullParser.next();
                    if (xmlPullParser.getDepth() <= depth) {
                        return;
                    }
                }
                return;
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("start tag must be read before skiping subtree");
            stringBuffer2.append(xmlPullParser.getPositionDescription());
            throw new SAXException(stringBuffer2.toString());
        } catch (XmlPullParserException e10) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("parsing error: ");
            stringBuffer3.append(e10);
            SAXParseException sAXParseException = new SAXParseException(stringBuffer3.toString(), this, e10);
            e10.printStackTrace();
            this.errorHandler.fatalError(sAXParseException);
        }
    }

    public void setContentHandler(ContentHandler contentHandler2) {
        this.contentHandler = contentHandler2;
    }

    public void setDTDHandler(DTDHandler dTDHandler) {
    }

    public void setEntityResolver(EntityResolver entityResolver) {
    }

    public void setErrorHandler(ErrorHandler errorHandler2) {
        this.errorHandler = errorHandler2;
    }

    public void setFeature(String str, boolean z10) throws SAXNotRecognizedException, SAXNotSupportedException {
        XmlPullParser xmlPullParser;
        String str2;
        try {
            if (NAMESPACES_FEATURE.equals(str)) {
                xmlPullParser = this.pp;
                str2 = XmlPullParser.FEATURE_PROCESS_NAMESPACES;
            } else if (NAMESPACE_PREFIXES_FEATURE.equals(str)) {
                if (this.pp.getFeature(XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES) != z10) {
                    this.pp.setFeature(XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES, z10);
                    return;
                }
                return;
            } else if (VALIDATION_FEATURE.equals(str)) {
                xmlPullParser = this.pp;
                str2 = XmlPullParser.FEATURE_VALIDATION;
            } else {
                this.pp.setFeature(str, z10);
                return;
            }
            xmlPullParser.setFeature(str2, z10);
        } catch (XmlPullParserException e10) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("problem with setting feature ");
            stringBuffer.append(str);
            stringBuffer.append(": ");
            stringBuffer.append(e10);
            throw new SAXNotSupportedException(stringBuffer.toString());
        }
    }

    public void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (DECLARATION_HANDLER_PROPERTY.equals(str)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("not supported setting property ");
            stringBuffer.append(str);
            throw new SAXNotSupportedException(stringBuffer.toString());
        } else if (!LEXICAL_HANDLER_PROPERTY.equals(str)) {
            try {
                this.pp.setProperty(str, obj);
            } catch (XmlPullParserException e10) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("not supported set property ");
                stringBuffer2.append(str);
                stringBuffer2.append(": ");
                stringBuffer2.append(e10);
                throw new SAXNotSupportedException(stringBuffer2.toString());
            }
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("not supported setting property ");
            stringBuffer3.append(str);
            throw new SAXNotSupportedException(stringBuffer3.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void startElement(String str, String str2, String str3) throws SAXException {
        this.contentHandler.startElement(str, str2, str3, this);
    }

    public Driver(XmlPullParser xmlPullParser) throws XmlPullParserException {
        this.pp = xmlPullParser;
    }

    public int getIndex(String str, String str2) {
        for (int i10 = 0; i10 < this.pp.getAttributeCount(); i10++) {
            if (this.pp.getAttributeNamespace(i10).equals(str) && this.pp.getAttributeName(i10).equals(str2)) {
                return i10;
            }
        }
        return -1;
    }

    public String getType(String str) {
        for (int i10 = 0; i10 < this.pp.getAttributeCount(); i10++) {
            if (this.pp.getAttributeName(i10).equals(str)) {
                return this.pp.getAttributeType(i10);
            }
        }
        return null;
    }

    public String getValue(String str) {
        return this.pp.getAttributeValue((String) null, str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = new java.io.FileInputStream(r4.systemId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = new java.lang.StringBuffer();
        r2.append("could not open file with systemId ");
        r2.append(r4.systemId);
        r4.errorHandler.fatalError(new org.xml.sax.SAXParseException(r2.toString(), r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void parse(org.xml.sax.InputSource r5) throws org.xml.sax.SAXException, java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = r5.getSystemId()
            r4.systemId = r0
            org.xml.sax.ContentHandler r0 = r4.contentHandler
            r0.setDocumentLocator(r4)
            java.io.Reader r0 = r5.getCharacterStream()
            java.lang.String r1 = "parsing initialization error: "
            if (r0 != 0) goto L_0x006e
            java.io.InputStream r0 = r5.getByteStream()     // Catch:{ XmlPullParserException -> 0x0032 }
            java.lang.String r2 = r5.getEncoding()     // Catch:{ XmlPullParserException -> 0x0032 }
            if (r0 != 0) goto L_0x0068
            java.lang.String r5 = r5.getSystemId()     // Catch:{ XmlPullParserException -> 0x0032 }
            r4.systemId = r5     // Catch:{ XmlPullParserException -> 0x0032 }
            if (r5 != 0) goto L_0x0035
            org.xml.sax.SAXParseException r5 = new org.xml.sax.SAXParseException     // Catch:{ XmlPullParserException -> 0x0032 }
            java.lang.String r0 = "null source systemId"
            r5.<init>(r0, r4)     // Catch:{ XmlPullParserException -> 0x0032 }
            org.xml.sax.ErrorHandler r0 = r4.errorHandler     // Catch:{ XmlPullParserException -> 0x0032 }
            r0.fatalError(r5)     // Catch:{ XmlPullParserException -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            goto L_0x00cf
        L_0x0035:
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0041 }
            java.lang.String r0 = r4.systemId     // Catch:{ MalformedURLException -> 0x0041 }
            r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x0041 }
            java.io.InputStream r0 = r5.openStream()     // Catch:{ MalformedURLException -> 0x0041 }
            goto L_0x0068
        L_0x0041:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0049 }
            java.lang.String r5 = r4.systemId     // Catch:{ FileNotFoundException -> 0x0049 }
            r0.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0049 }
            goto L_0x0068
        L_0x0049:
            r5 = move-exception
            org.xml.sax.SAXParseException r0 = new org.xml.sax.SAXParseException     // Catch:{ XmlPullParserException -> 0x0032 }
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ XmlPullParserException -> 0x0032 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0032 }
            java.lang.String r3 = "could not open file with systemId "
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x0032 }
            java.lang.String r3 = r4.systemId     // Catch:{ XmlPullParserException -> 0x0032 }
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x0032 }
            java.lang.String r2 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0032 }
            r0.<init>(r2, r4, r5)     // Catch:{ XmlPullParserException -> 0x0032 }
            org.xml.sax.ErrorHandler r5 = r4.errorHandler     // Catch:{ XmlPullParserException -> 0x0032 }
            r5.fatalError(r0)     // Catch:{ XmlPullParserException -> 0x0032 }
            return
        L_0x0068:
            org.xmlpull.v1.XmlPullParser r5 = r4.pp     // Catch:{ XmlPullParserException -> 0x0032 }
            r5.setInput(r0, r2)     // Catch:{ XmlPullParserException -> 0x0032 }
            goto L_0x0073
        L_0x006e:
            org.xmlpull.v1.XmlPullParser r5 = r4.pp     // Catch:{ XmlPullParserException -> 0x0032 }
            r5.setInput(r0)     // Catch:{ XmlPullParserException -> 0x0032 }
        L_0x0073:
            org.xml.sax.ContentHandler r5 = r4.contentHandler     // Catch:{ XmlPullParserException -> 0x00a8 }
            r5.startDocument()     // Catch:{ XmlPullParserException -> 0x00a8 }
            org.xmlpull.v1.XmlPullParser r5 = r4.pp     // Catch:{ XmlPullParserException -> 0x00a8 }
            r5.next()     // Catch:{ XmlPullParserException -> 0x00a8 }
            org.xmlpull.v1.XmlPullParser r5 = r4.pp     // Catch:{ XmlPullParserException -> 0x00a8 }
            int r5 = r5.getEventType()     // Catch:{ XmlPullParserException -> 0x00a8 }
            r0 = 2
            if (r5 == r0) goto L_0x00aa
            org.xml.sax.SAXParseException r5 = new org.xml.sax.SAXParseException     // Catch:{ XmlPullParserException -> 0x00a8 }
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ XmlPullParserException -> 0x00a8 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x00a8 }
            java.lang.String r2 = "expected start tag not"
            r0.append(r2)     // Catch:{ XmlPullParserException -> 0x00a8 }
            org.xmlpull.v1.XmlPullParser r2 = r4.pp     // Catch:{ XmlPullParserException -> 0x00a8 }
            java.lang.String r2 = r2.getPositionDescription()     // Catch:{ XmlPullParserException -> 0x00a8 }
            r0.append(r2)     // Catch:{ XmlPullParserException -> 0x00a8 }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x00a8 }
            r5.<init>(r0, r4)     // Catch:{ XmlPullParserException -> 0x00a8 }
            org.xml.sax.ErrorHandler r0 = r4.errorHandler     // Catch:{ XmlPullParserException -> 0x00a8 }
            r0.fatalError(r5)     // Catch:{ XmlPullParserException -> 0x00a8 }
            return
        L_0x00a8:
            r5 = move-exception
            goto L_0x00b5
        L_0x00aa:
            org.xmlpull.v1.XmlPullParser r5 = r4.pp
            r4.parseSubTree(r5)
            org.xml.sax.ContentHandler r5 = r4.contentHandler
            r5.endDocument()
            return
        L_0x00b5:
            org.xml.sax.SAXParseException r0 = new org.xml.sax.SAXParseException
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r4, r5)
            org.xml.sax.ErrorHandler r5 = r4.errorHandler
            r5.fatalError(r0)
            return
        L_0x00cf:
            org.xml.sax.SAXParseException r0 = new org.xml.sax.SAXParseException
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r4, r5)
            org.xml.sax.ErrorHandler r5 = r4.errorHandler
            r5.fatalError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.v1.sax2.Driver.parse(org.xml.sax.InputSource):void");
    }

    public String getType(String str, String str2) {
        for (int i10 = 0; i10 < this.pp.getAttributeCount(); i10++) {
            if (this.pp.getAttributeNamespace(i10).equals(str) && this.pp.getAttributeName(i10).equals(str2)) {
                return this.pp.getAttributeType(i10);
            }
        }
        return null;
    }

    public String getValue(String str, String str2) {
        return this.pp.getAttributeValue(str, str2);
    }
}
