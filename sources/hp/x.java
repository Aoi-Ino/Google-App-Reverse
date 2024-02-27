package hp;

import java.util.LinkedList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class x extends LinkedList {
    public x(Document document) {
        r(document);
    }

    private void r(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement != null) {
            offer(documentElement);
            v(documentElement);
        }
    }

    private void v(Node node) {
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node item = childNodes.item(i10);
            if (item.getNodeType() != 8) {
                offer(item);
                v(item);
            }
        }
    }
}
