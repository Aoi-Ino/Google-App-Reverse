package org.xmlpull.v1;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class XmlPullParserFactory {
    public static final String PROPERTY_NAME = "org.xmlpull.v1.XmlPullParserFactory";
    private static final String RESOURCE_NAME = "/META-INF/services/org.xmlpull.v1.XmlPullParserFactory";
    static final Class referenceContextClass = XmlPullParserFactory.class;
    protected String classNamesLocation;
    protected Hashtable features = new Hashtable();
    protected Vector parserClasses;
    protected Vector serializerClasses;

    static {
        new XmlPullParserFactory();
    }

    protected XmlPullParserFactory() {
    }

    public static XmlPullParserFactory newInstance() throws XmlPullParserException {
        return newInstance((String) null, (Class) null);
    }

    public boolean getFeature(String str) {
        Boolean bool = (Boolean) this.features.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public boolean isNamespaceAware() {
        return getFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES);
    }

    public boolean isValidating() {
        return getFeature(XmlPullParser.FEATURE_VALIDATION);
    }

    public XmlPullParser newPullParser() throws XmlPullParserException {
        Vector vector = this.parserClasses;
        if (vector == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Factory initialization was incomplete - has not tried ");
            stringBuffer.append(this.classNamesLocation);
            throw new XmlPullParserException(stringBuffer.toString());
        } else if (vector.size() != 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            int i10 = 0;
            while (i10 < this.parserClasses.size()) {
                Class cls = (Class) this.parserClasses.elementAt(i10);
                try {
                    XmlPullParser xmlPullParser = (XmlPullParser) cls.newInstance();
                    Enumeration keys = this.features.keys();
                    while (keys.hasMoreElements()) {
                        String str = (String) keys.nextElement();
                        Boolean bool = (Boolean) this.features.get(str);
                        if (bool != null && bool.booleanValue()) {
                            xmlPullParser.setFeature(str, true);
                        }
                    }
                    return xmlPullParser;
                } catch (Exception e10) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(cls.getName());
                    stringBuffer3.append(": ");
                    stringBuffer3.append(e10.toString());
                    stringBuffer3.append("; ");
                    stringBuffer2.append(stringBuffer3.toString());
                    i10++;
                }
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("could not create parser: ");
            stringBuffer4.append(stringBuffer2);
            throw new XmlPullParserException(stringBuffer4.toString());
        } else {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("No valid parser classes found in ");
            stringBuffer5.append(this.classNamesLocation);
            throw new XmlPullParserException(stringBuffer5.toString());
        }
    }

    public XmlSerializer newSerializer() throws XmlPullParserException {
        Vector vector = this.serializerClasses;
        if (vector == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Factory initialization incomplete - has not tried ");
            stringBuffer.append(this.classNamesLocation);
            throw new XmlPullParserException(stringBuffer.toString());
        } else if (vector.size() != 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            int i10 = 0;
            while (i10 < this.serializerClasses.size()) {
                Class cls = (Class) this.serializerClasses.elementAt(i10);
                try {
                    return (XmlSerializer) cls.newInstance();
                } catch (Exception e10) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(cls.getName());
                    stringBuffer3.append(": ");
                    stringBuffer3.append(e10.toString());
                    stringBuffer3.append("; ");
                    stringBuffer2.append(stringBuffer3.toString());
                    i10++;
                }
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("could not create serializer: ");
            stringBuffer4.append(stringBuffer2);
            throw new XmlPullParserException(stringBuffer4.toString());
        } else {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("No valid serializer classes found in ");
            stringBuffer5.append(this.classNamesLocation);
            throw new XmlPullParserException(stringBuffer5.toString());
        }
    }

    public void setFeature(String str, boolean z10) throws XmlPullParserException {
        this.features.put(str, new Boolean(z10));
    }

    public void setNamespaceAware(boolean z10) {
        this.features.put(XmlPullParser.FEATURE_PROCESS_NAMESPACES, new Boolean(z10));
    }

    public void setValidating(boolean z10) {
        this.features.put(XmlPullParser.FEATURE_VALIDATION, new Boolean(z10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.xmlpull.v1.XmlPullParserFactory newInstance(java.lang.String r12, java.lang.Class r13) throws org.xmlpull.v1.XmlPullParserException {
        /*
            if (r13 != 0) goto L_0x0004
            java.lang.Class r13 = referenceContextClass
        L_0x0004:
            java.lang.String r0 = "'"
            r1 = 0
            if (r12 == 0) goto L_0x002d
            int r2 = r12.length()
            if (r2 == 0) goto L_0x002d
            java.lang.String r2 = "DEFAULT"
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x0018
            goto L_0x002d
        L_0x0018:
            java.lang.StringBuffer r13 = new java.lang.StringBuffer
            r13.<init>()
            java.lang.String r2 = "parameter classNames to newInstance() that contained '"
        L_0x001f:
            r13.append(r2)
            r13.append(r12)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            goto L_0x004f
        L_0x002d:
            java.lang.String r12 = "/META-INF/services/org.xmlpull.v1.XmlPullParserFactory"
            java.io.InputStream r12 = r13.getResourceAsStream(r12)     // Catch:{ Exception -> 0x00c9 }
            if (r12 == 0) goto L_0x00d5
            java.lang.StringBuffer r13 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00c9 }
            r13.<init>()     // Catch:{ Exception -> 0x00c9 }
        L_0x003a:
            int r2 = r12.read()     // Catch:{ Exception -> 0x00c9 }
            if (r2 >= 0) goto L_0x00cb
            r12.close()     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r12 = r13.toString()     // Catch:{ Exception -> 0x00c9 }
            java.lang.StringBuffer r13 = new java.lang.StringBuffer
            r13.<init>()
            java.lang.String r2 = "resource /META-INF/services/org.xmlpull.v1.XmlPullParserFactory that contained '"
            goto L_0x001f
        L_0x004f:
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            r3 = 0
            r5 = r1
            r4 = r3
        L_0x005c:
            int r6 = r12.length()
            if (r4 < r6) goto L_0x0070
            if (r5 != 0) goto L_0x0069
            org.xmlpull.v1.XmlPullParserFactory r5 = new org.xmlpull.v1.XmlPullParserFactory
            r5.<init>()
        L_0x0069:
            r5.parserClasses = r0
            r5.serializerClasses = r2
            r5.classNamesLocation = r13
            return r5
        L_0x0070:
            r6 = 44
            int r6 = r12.indexOf(r6, r4)
            r7 = -1
            if (r6 != r7) goto L_0x007d
            int r6 = r12.length()
        L_0x007d:
            java.lang.String r4 = r12.substring(r4, r6)
            java.lang.Class r7 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x008a }
            java.lang.Object r8 = r7.newInstance()     // Catch:{ Exception -> 0x008b }
            goto L_0x008c
        L_0x008a:
            r7 = r1
        L_0x008b:
            r8 = r1
        L_0x008c:
            if (r7 == 0) goto L_0x00c6
            boolean r9 = r8 instanceof org.xmlpull.v1.XmlPullParser
            r10 = 1
            if (r9 == 0) goto L_0x0098
            r0.addElement(r7)
            r9 = r10
            goto L_0x0099
        L_0x0098:
            r9 = r3
        L_0x0099:
            boolean r11 = r8 instanceof org.xmlpull.v1.XmlSerializer
            if (r11 == 0) goto L_0x00a1
            r2.addElement(r7)
            r9 = r10
        L_0x00a1:
            boolean r7 = r8 instanceof org.xmlpull.v1.XmlPullParserFactory
            if (r7 == 0) goto L_0x00ab
            if (r5 != 0) goto L_0x00ac
            r5 = r8
            org.xmlpull.v1.XmlPullParserFactory r5 = (org.xmlpull.v1.XmlPullParserFactory) r5
            goto L_0x00ac
        L_0x00ab:
            r10 = r9
        L_0x00ac:
            if (r10 == 0) goto L_0x00af
            goto L_0x00c6
        L_0x00af:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r13 = new java.lang.StringBuffer
            r13.<init>()
            java.lang.String r0 = "incompatible class: "
            r13.append(r0)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x00c6:
            int r4 = r6 + 1
            goto L_0x005c
        L_0x00c9:
            r12 = move-exception
            goto L_0x00dd
        L_0x00cb:
            r3 = 32
            if (r2 <= r3) goto L_0x003a
            char r2 = (char) r2
            r13.append(r2)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x003a
        L_0x00d5:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r13 = "resource not found: /META-INF/services/org.xmlpull.v1.XmlPullParserFactory make sure that parser implementing XmlPull API is available"
            r12.<init>(r13)     // Catch:{ Exception -> 0x00c9 }
            throw r12     // Catch:{ Exception -> 0x00c9 }
        L_0x00dd:
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            r13.<init>(r1, r1, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.v1.XmlPullParserFactory.newInstance(java.lang.String, java.lang.Class):org.xmlpull.v1.XmlPullParserFactory");
    }
}
