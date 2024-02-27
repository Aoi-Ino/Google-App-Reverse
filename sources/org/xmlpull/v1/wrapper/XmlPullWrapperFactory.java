package org.xmlpull.v1.wrapper;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import org.xmlpull.v1.wrapper.classic.StaticXmlPullParserWrapper;
import org.xmlpull.v1.wrapper.classic.StaticXmlSerializerWrapper;

public class XmlPullWrapperFactory {
    private static final boolean DEBUG = false;

    /* renamed from: f  reason: collision with root package name */
    protected XmlPullParserFactory f30350f;

    protected XmlPullWrapperFactory(XmlPullParserFactory xmlPullParserFactory) throws XmlPullParserException {
        this.f30350f = xmlPullParserFactory == null ? XmlPullParserFactory.newInstance() : xmlPullParserFactory;
    }

    public static XmlPullWrapperFactory newInstance() throws XmlPullParserException {
        return new XmlPullWrapperFactory((XmlPullParserFactory) null);
    }

    public XmlPullParserFactory getFactory() throws XmlPullParserException {
        return this.f30350f;
    }

    public boolean getFeature(String str) {
        return this.f30350f.getFeature(str);
    }

    public boolean isNamespaceAware() {
        return this.f30350f.isNamespaceAware();
    }

    public boolean isValidating() {
        return this.f30350f.isValidating();
    }

    public XmlPullParserWrapper newPullParserWrapper() throws XmlPullParserException {
        return new StaticXmlPullParserWrapper(this.f30350f.newPullParser());
    }

    public XmlSerializerWrapper newSerializerWrapper() throws XmlPullParserException {
        return new StaticXmlSerializerWrapper(this.f30350f.newSerializer(), this);
    }

    public void setFeature(String str, boolean z10) throws XmlPullParserException {
        this.f30350f.setFeature(str, z10);
    }

    public void setNamespaceAware(boolean z10) {
        this.f30350f.setNamespaceAware(z10);
    }

    public void setValidating(boolean z10) {
        this.f30350f.setValidating(z10);
    }

    public static XmlPullWrapperFactory newInstance(String str, Class cls) throws XmlPullParserException {
        return new XmlPullWrapperFactory(XmlPullParserFactory.newInstance(str, cls));
    }

    public XmlPullParserWrapper newPullParserWrapper(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return new StaticXmlPullParserWrapper(xmlPullParser);
    }

    public XmlSerializerWrapper newSerializerWrapper(XmlSerializer xmlSerializer) throws XmlPullParserException {
        return new StaticXmlSerializerWrapper(xmlSerializer, this);
    }

    public static XmlPullWrapperFactory newInstance(XmlPullParserFactory xmlPullParserFactory) throws XmlPullParserException {
        return new XmlPullWrapperFactory(xmlPullParserFactory);
    }
}
