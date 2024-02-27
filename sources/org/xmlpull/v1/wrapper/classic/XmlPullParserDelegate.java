package org.xmlpull.v1.wrapper.classic;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class XmlPullParserDelegate implements XmlPullParser {
    protected XmlPullParser pp;

    public XmlPullParserDelegate(XmlPullParser xmlPullParser) {
        this.pp = xmlPullParser;
    }

    public void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        this.pp.defineEntityReplacementText(str, str2);
    }

    public int getAttributeCount() {
        return this.pp.getAttributeCount();
    }

    public String getAttributeName(int i10) {
        return this.pp.getAttributeName(i10);
    }

    public String getAttributeNamespace(int i10) {
        return this.pp.getAttributeNamespace(i10);
    }

    public String getAttributePrefix(int i10) {
        return this.pp.getAttributePrefix(i10);
    }

    public String getAttributeType(int i10) {
        return this.pp.getAttributeType(i10);
    }

    public String getAttributeValue(int i10) {
        return this.pp.getAttributeValue(i10);
    }

    public int getColumnNumber() {
        return this.pp.getColumnNumber();
    }

    public int getDepth() {
        return this.pp.getDepth();
    }

    public int getEventType() throws XmlPullParserException {
        return this.pp.getEventType();
    }

    public boolean getFeature(String str) {
        return this.pp.getFeature(str);
    }

    public String getInputEncoding() {
        return this.pp.getInputEncoding();
    }

    public int getLineNumber() {
        return this.pp.getLineNumber();
    }

    public String getName() {
        return this.pp.getName();
    }

    public String getNamespace() {
        return this.pp.getNamespace();
    }

    public int getNamespaceCount(int i10) throws XmlPullParserException {
        return this.pp.getNamespaceCount(i10);
    }

    public String getNamespacePrefix(int i10) throws XmlPullParserException {
        return this.pp.getNamespacePrefix(i10);
    }

    public String getNamespaceUri(int i10) throws XmlPullParserException {
        return this.pp.getNamespaceUri(i10);
    }

    public String getPositionDescription() {
        return this.pp.getPositionDescription();
    }

    public String getPrefix() {
        return this.pp.getPrefix();
    }

    public Object getProperty(String str) {
        return this.pp.getProperty(str);
    }

    public String getText() {
        return this.pp.getText();
    }

    public char[] getTextCharacters(int[] iArr) {
        return this.pp.getTextCharacters(iArr);
    }

    public boolean isAttributeDefault(int i10) {
        return this.pp.isAttributeDefault(i10);
    }

    public boolean isEmptyElementTag() throws XmlPullParserException {
        return this.pp.isEmptyElementTag();
    }

    public boolean isWhitespace() throws XmlPullParserException {
        return this.pp.isWhitespace();
    }

    public int next() throws XmlPullParserException, IOException {
        return this.pp.next();
    }

    public int nextTag() throws XmlPullParserException, IOException {
        return this.pp.nextTag();
    }

    public String nextText() throws XmlPullParserException, IOException {
        return this.pp.nextText();
    }

    public int nextToken() throws XmlPullParserException, IOException {
        return this.pp.nextToken();
    }

    public void require(int i10, String str, String str2) throws XmlPullParserException, IOException {
        this.pp.require(i10, str, str2);
    }

    public void setFeature(String str, boolean z10) throws XmlPullParserException {
        this.pp.setFeature(str, z10);
    }

    public void setInput(InputStream inputStream, String str) throws XmlPullParserException {
        this.pp.setInput(inputStream, str);
    }

    public void setProperty(String str, Object obj) throws XmlPullParserException {
        this.pp.setProperty(str, obj);
    }

    public String getAttributeValue(String str, String str2) {
        return this.pp.getAttributeValue(str, str2);
    }

    public String getNamespace(String str) {
        return this.pp.getNamespace(str);
    }

    public void setInput(Reader reader) throws XmlPullParserException {
        this.pp.setInput(reader);
    }
}
