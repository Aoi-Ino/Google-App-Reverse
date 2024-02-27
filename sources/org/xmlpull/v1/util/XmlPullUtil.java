package org.xmlpull.v1.util;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class XmlPullUtil {
    public static final String XSI_NS = "http://www.w3.org/2001/XMLSchema-instance";

    private XmlPullUtil() {
    }

    public static String getAttributeValue(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("", str);
    }

    public static String getPIData(XmlPullParser xmlPullParser) throws IllegalStateException {
        try {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 8) {
                String text = xmlPullParser.getText();
                int i10 = -1;
                for (int i11 = 0; i11 < text.length(); i11++) {
                    if (isS(text.charAt(i11))) {
                        i10 = i11;
                    } else if (i10 > 0) {
                        return text.substring(i11);
                    }
                }
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("parser must be on processing instruction and not ");
            stringBuffer.append(XmlPullParser.TYPES[eventType]);
            stringBuffer.append(xmlPullParser.getPositionDescription());
            throw new IllegalStateException(stringBuffer.toString());
        } catch (XmlPullParserException e10) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("could not determine parser state: ");
            stringBuffer2.append(e10);
            stringBuffer2.append(xmlPullParser.getPositionDescription());
            throw new IllegalStateException(stringBuffer2.toString());
        }
    }

    public static String getPITarget(XmlPullParser xmlPullParser) throws IllegalStateException {
        try {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 8) {
                String text = xmlPullParser.getText();
                for (int i10 = 0; i10 < text.length(); i10++) {
                    if (isS(text.charAt(i10))) {
                        return text.substring(0, i10);
                    }
                }
                return text;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("parser must be on processing instruction and not ");
            stringBuffer.append(XmlPullParser.TYPES[eventType]);
            stringBuffer.append(xmlPullParser.getPositionDescription());
            throw new IllegalStateException(stringBuffer.toString());
        } catch (XmlPullParserException e10) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("could not determine parser state: ");
            stringBuffer2.append(e10);
            stringBuffer2.append(xmlPullParser.getPositionDescription());
            throw new IllegalStateException(stringBuffer2.toString());
        }
    }

    public static String getRequiredAttributeValue(XmlPullParser xmlPullParser, String str, String str2) throws IOException, XmlPullParserException {
        String attributeValue = xmlPullParser.getAttributeValue(str, str2);
        if (attributeValue != null) {
            return attributeValue;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("required attribute ");
        stringBuffer.append(str2);
        stringBuffer.append(" is not present");
        throw new XmlPullParserException(stringBuffer.toString());
    }

    private static boolean isS(char c10) {
        return c10 == ' ' || c10 == 10 || c10 == 13 || c10 == 9;
    }

    public static boolean matches(XmlPullParser xmlPullParser, int i10, String str, String str2) throws XmlPullParserException {
        return i10 == xmlPullParser.getEventType() && (str == null || str.equals(xmlPullParser.getNamespace())) && (str2 == null || str2.equals(xmlPullParser.getName()));
    }

    public static void nextEndTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.nextTag() != 3) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected END_TAG and not");
            stringBuffer.append(xmlPullParser.getPositionDescription());
            throw new XmlPullParserException(stringBuffer.toString());
        }
    }

    public static void nextStartTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.nextTag() != 2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected START_TAG and not ");
            stringBuffer.append(xmlPullParser.getPositionDescription());
            throw new XmlPullParserException(stringBuffer.toString());
        }
    }

    public static String nextText(XmlPullParser xmlPullParser, String str, String str2) throws IOException, XmlPullParserException {
        if (str2 != null) {
            xmlPullParser.require(2, str, str2);
            return xmlPullParser.nextText();
        }
        throw new XmlPullParserException("name for element can not be null");
    }

    public static void skipSubTree(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, (String) null);
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 3) {
                i10--;
            } else if (next == 2) {
                i10++;
            }
        }
    }

    public static void writeSimpleElement(XmlSerializer xmlSerializer, String str, String str2, String str3) throws IOException, XmlPullParserException {
        if (str2 != null) {
            xmlSerializer.startTag(str, str2);
            if (str3 == null) {
                xmlSerializer.attribute("http://www.w3.org/2001/XMLSchema-instance", "nil", "true");
            } else {
                xmlSerializer.text(str3);
            }
            xmlSerializer.endTag(str, str2);
            return;
        }
        throw new XmlPullParserException("name for element can not be null");
    }

    public static void nextEndTag(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        xmlPullParser.nextTag();
        xmlPullParser.require(3, str, str2);
    }

    public static void nextStartTag(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        xmlPullParser.nextTag();
        xmlPullParser.require(2, (String) null, str);
    }

    public static void nextStartTag(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        xmlPullParser.nextTag();
        xmlPullParser.require(2, str, str2);
    }
}
