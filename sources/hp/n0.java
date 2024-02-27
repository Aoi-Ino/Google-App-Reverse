package hp;

import java.io.Reader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

class n0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f24290a;

    public n0() {
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        this.f24290a = newInstance;
        newInstance.setNamespaceAware(true);
    }

    public g a(Reader reader) {
        XmlPullParser newPullParser = this.f24290a.newPullParser();
        if (reader != null) {
            newPullParser.setInput(reader);
        }
        return new o0(newPullParser);
    }
}
