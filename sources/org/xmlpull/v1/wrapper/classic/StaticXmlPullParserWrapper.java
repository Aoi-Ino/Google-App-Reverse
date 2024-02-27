package org.xmlpull.v1.wrapper.classic;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.util.XmlPullUtil;
import org.xmlpull.v1.wrapper.XmlPullParserWrapper;

public class StaticXmlPullParserWrapper extends XmlPullParserDelegate implements XmlPullParserWrapper {
    public StaticXmlPullParserWrapper(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public String getAttributeValue(String str) {
        return XmlPullUtil.getAttributeValue(this.pp, str);
    }

    public String getPIData() throws IllegalStateException {
        return XmlPullUtil.getPIData(this.pp);
    }

    public String getPITarget() throws IllegalStateException {
        return XmlPullUtil.getPITarget(this.pp);
    }

    public String getRequiredAttributeValue(String str) throws IOException, XmlPullParserException {
        return XmlPullUtil.getRequiredAttributeValue(this.pp, (String) null, str);
    }

    public String getRequiredElementText(String str, String str2) throws IOException, XmlPullParserException {
        String str3;
        if (str2 != null) {
            nextStartTag(str, str2);
            if (isNil()) {
                nextEndTag(str, str2);
                str3 = null;
            } else {
                str3 = this.pp.nextText();
            }
            this.pp.require(3, str, str2);
            return str3;
        }
        throw new XmlPullParserException("name for element can not be null");
    }

    public boolean isNil() throws IOException, XmlPullParserException {
        return "true".equals(this.pp.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil"));
    }

    public boolean matches(int i10, String str, String str2) throws XmlPullParserException {
        return XmlPullUtil.matches(this.pp, i10, str, str2);
    }

    public void nextEndTag() throws XmlPullParserException, IOException {
        XmlPullUtil.nextEndTag(this.pp);
    }

    public void nextStartTag() throws XmlPullParserException, IOException {
        if (this.pp.nextTag() != 2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected START_TAG and not ");
            stringBuffer.append(this.pp.getPositionDescription());
            throw new XmlPullParserException(stringBuffer.toString());
        }
    }

    public String nextText(String str, String str2) throws IOException, XmlPullParserException {
        return XmlPullUtil.nextText(this.pp, str, str2);
    }

    public double readDouble() throws XmlPullParserException, IOException {
        String nextText = this.pp.nextText();
        try {
            return Double.parseDouble(nextText);
        } catch (NumberFormatException e10) {
            if (nextText.equals("INF") || nextText.toLowerCase().equals("infinity")) {
                return Double.POSITIVE_INFINITY;
            }
            if (nextText.equals("-INF") || nextText.toLowerCase().equals("-infinity")) {
                return Double.NEGATIVE_INFINITY;
            }
            if (nextText.equals("NaN")) {
                return Double.NaN;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("can't parse double value '");
            stringBuffer.append(nextText);
            stringBuffer.append("'");
            throw new XmlPullParserException(stringBuffer.toString(), this, e10);
        }
    }

    public double readDoubleElement(String str, String str2) throws XmlPullParserException, IOException {
        this.pp.require(2, str, str2);
        return readDouble();
    }

    public float readFloat() throws XmlPullParserException, IOException {
        String nextText = this.pp.nextText();
        try {
            return Float.parseFloat(nextText);
        } catch (NumberFormatException e10) {
            if (nextText.equals("INF") || nextText.toLowerCase().equals("infinity")) {
                return Float.POSITIVE_INFINITY;
            }
            if (nextText.equals("-INF") || nextText.toLowerCase().equals("-infinity")) {
                return Float.NEGATIVE_INFINITY;
            }
            if (nextText.equals("NaN")) {
                return Float.NaN;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("can't parse float value '");
            stringBuffer.append(nextText);
            stringBuffer.append("'");
            throw new XmlPullParserException(stringBuffer.toString(), this, e10);
        }
    }

    public float readFloatElement(String str, String str2) throws XmlPullParserException, IOException {
        this.pp.require(2, str, str2);
        return readFloat();
    }

    public int readInt() throws XmlPullParserException, IOException {
        try {
            return Integer.parseInt(this.pp.nextText());
        } catch (NumberFormatException e10) {
            throw new XmlPullParserException("can't parse int value", this, e10);
        }
    }

    public int readIntElement(String str, String str2) throws XmlPullParserException, IOException {
        this.pp.require(2, str, str2);
        return readInt();
    }

    public String readString() throws XmlPullParserException, IOException {
        return this.pp.nextText();
    }

    public String readStringElemet(String str, String str2) throws XmlPullParserException, IOException {
        this.pp.require(2, str, str2);
        return readString();
    }

    public void skipSubTree() throws XmlPullParserException, IOException {
        XmlPullUtil.skipSubTree(this.pp);
    }

    public String getRequiredAttributeValue(String str, String str2) throws IOException, XmlPullParserException {
        return XmlPullUtil.getRequiredAttributeValue(this.pp, str, str2);
    }

    public void nextEndTag(String str) throws XmlPullParserException, IOException {
        XmlPullUtil.nextEndTag(this.pp, (String) null, str);
    }

    public void nextStartTag(String str) throws XmlPullParserException, IOException {
        this.pp.nextTag();
        this.pp.require(2, (String) null, str);
    }

    public void nextEndTag(String str, String str2) throws XmlPullParserException, IOException {
        XmlPullUtil.nextEndTag(this.pp, str, str2);
    }

    public void nextStartTag(String str, String str2) throws XmlPullParserException, IOException {
        this.pp.nextTag();
        this.pp.require(2, str, str2);
    }
}