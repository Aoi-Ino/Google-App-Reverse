package a8;

import android.support.v4.media.session.b;
import e8.r;
import java.util.ArrayList;
import java.util.HashMap;

public class c implements h {

    /* renamed from: h  reason: collision with root package name */
    public static final c f254h = new c("\n");

    /* renamed from: i  reason: collision with root package name */
    public static final c f255i;

    /* renamed from: e  reason: collision with root package name */
    protected StringBuffer f256e;

    /* renamed from: f  reason: collision with root package name */
    protected k f257f;

    /* renamed from: g  reason: collision with root package name */
    protected HashMap f258g;

    static {
        c cVar = new c("");
        f255i = cVar;
        cVar.n();
    }

    public c(String str) {
        this(str, new k());
    }

    private c k(String str, Object obj) {
        if (this.f258g == null) {
            this.f258g = new HashMap();
        }
        this.f258g.put(str, obj);
        return this;
    }

    public int F() {
        return 10;
    }

    public boolean T() {
        return true;
    }

    public StringBuffer a(String str) {
        StringBuffer stringBuffer = this.f256e;
        stringBuffer.append(str);
        return stringBuffer;
    }

    public HashMap b() {
        return this.f258g;
    }

    public String c() {
        return this.f256e.toString();
    }

    public k d() {
        return this.f257f;
    }

    public float e() {
        Float f10;
        HashMap hashMap = this.f258g;
        if (hashMap == null || (f10 = (Float) hashMap.get("HSCALE")) == null) {
            return 1.0f;
        }
        return f10.floatValue();
    }

    public ArrayList e0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        return arrayList;
    }

    public r f() {
        HashMap hashMap = this.f258g;
        if (hashMap == null) {
            return null;
        }
        b.a(hashMap.get("HYPHENATION"));
        return null;
    }

    public n g() {
        Object[] objArr;
        HashMap hashMap = this.f258g;
        if (hashMap == null || (objArr = (Object[]) hashMap.get("IMAGE")) == null) {
            return null;
        }
        b.a(objArr[0]);
        return null;
    }

    public float h() {
        g();
        return this.f257f.d(true).x(c(), this.f257f.f()) * e();
    }

    public boolean i() {
        return this.f258g != null;
    }

    public boolean j() {
        return this.f256e.toString().trim().length() == 0 && this.f256e.toString().indexOf("\n") == -1 && this.f258g == null;
    }

    public void l(HashMap hashMap) {
        this.f258g = hashMap;
    }

    public void m(k kVar) {
        this.f257f = kVar;
    }

    public c n() {
        return k("NEWPAGE", (Object) null);
    }

    public boolean r(i iVar) {
        try {
            return iVar.b(this);
        } catch (g unused) {
            return false;
        }
    }

    public String toString() {
        return c();
    }

    public c(String str, k kVar) {
        this.f256e = null;
        this.f257f = null;
        this.f258g = null;
        this.f256e = new StringBuffer(str);
        this.f257f = kVar;
    }
}
