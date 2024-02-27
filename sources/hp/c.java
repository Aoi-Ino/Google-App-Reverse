package hp;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private x f24219a;

    /* renamed from: b  reason: collision with root package name */
    private a0 f24220b;

    /* renamed from: c  reason: collision with root package name */
    private f f24221c;

    private static class b extends h {
        private b() {
        }

        public boolean b0() {
            return true;
        }
    }

    /* renamed from: hp.c$c  reason: collision with other inner class name */
    private static class C0305c extends d {

        /* renamed from: a  reason: collision with root package name */
        private final Node f24222a;

        public C0305c(Node node) {
            this.f24222a = node;
        }

        public Object a() {
            return this.f24222a;
        }

        public String b() {
            return this.f24222a.getNamespaceURI();
        }

        public boolean c() {
            String prefix = getPrefix();
            return prefix != null ? prefix.startsWith("xml") : getName().startsWith("xml");
        }

        public String getName() {
            return this.f24222a.getLocalName();
        }

        public String getPrefix() {
            return this.f24222a.getPrefix();
        }

        public String getValue() {
            return this.f24222a.getNodeValue();
        }
    }

    private static class d extends e {

        /* renamed from: e  reason: collision with root package name */
        private final Element f24223e;

        public d(Node node) {
            this.f24223e = (Element) node;
        }

        public String getName() {
            return this.f24223e.getLocalName();
        }

        public NamedNodeMap r() {
            return this.f24223e.getAttributes();
        }
    }

    private static class e extends h {

        /* renamed from: e  reason: collision with root package name */
        private final Node f24224e;

        public e(Node node) {
            this.f24224e = node;
        }

        public String getValue() {
            return this.f24224e.getNodeValue();
        }

        public boolean h() {
            return true;
        }
    }

    public c(Document document) {
        this.f24219a = new x(document);
        a0 a0Var = new a0();
        this.f24220b = a0Var;
        a0Var.r(document);
    }

    private C0305c a(Node node) {
        return new C0305c(node);
    }

    private d b(d dVar) {
        NamedNodeMap r10 = dVar.r();
        int length = r10.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            C0305c a10 = a(r10.item(i10));
            if (!a10.c()) {
                dVar.add(a10);
            }
        }
        return dVar;
    }

    private f c(Node node) {
        if (node.getNodeType() != 1) {
            return h(node);
        }
        this.f24220b.r(node);
        return g(node);
    }

    private b d() {
        return new b();
    }

    private f e() {
        Node node = (Node) this.f24219a.peek();
        return node == null ? d() : f(node);
    }

    private f f(Node node) {
        Node parentNode = node.getParentNode();
        Node node2 = (Node) this.f24220b.v();
        if (parentNode != node2) {
            if (node2 != null) {
                this.f24220b.pop();
            }
            return d();
        }
        this.f24219a.poll();
        return c(node);
    }

    private d g(Node node) {
        d dVar = new d(node);
        return dVar.isEmpty() ? b(dVar) : dVar;
    }

    private e h(Node node) {
        return new e(node);
    }

    public f next() {
        f fVar = this.f24221c;
        if (fVar == null) {
            return e();
        }
        this.f24221c = null;
        return fVar;
    }

    public f peek() {
        if (this.f24221c == null) {
            this.f24221c = next();
        }
        return this.f24221c;
    }
}
