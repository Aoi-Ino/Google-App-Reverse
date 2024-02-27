package fp;

import java.util.Map;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private b f23686a;

    /* renamed from: b  reason: collision with root package name */
    private Map f23687b;

    public c(Map map) {
        this(map, (b) null);
    }

    public String a(String str) {
        Map map = this.f23687b;
        Object obj = map != null ? map.get(str) : null;
        if (obj != null) {
            return obj.toString();
        }
        b bVar = this.f23686a;
        if (bVar != null) {
            return bVar.a(str);
        }
        return null;
    }

    public c(Map map, b bVar) {
        this.f23686a = bVar;
        this.f23687b = map;
    }
}
