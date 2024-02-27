package hp;

import java.io.Reader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.InputSource;

class b implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private final DocumentBuilderFactory f24214a;

    public b() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        this.f24214a = newInstance;
        newInstance.setNamespaceAware(true);
    }

    private g b(InputSource inputSource) {
        return new c(this.f24214a.newDocumentBuilder().parse(inputSource));
    }

    public g a(Reader reader) {
        return b(new InputSource(reader));
    }
}
