package a8;

import java.util.ArrayList;

public class r implements h {

    /* renamed from: e  reason: collision with root package name */
    private int f319e;

    /* renamed from: f  reason: collision with root package name */
    private StringBuffer f320f;

    r(int i10, String str) {
        this.f319e = i10;
        this.f320f = new StringBuffer(str);
    }

    public int F() {
        return this.f319e;
    }

    public boolean T() {
        return false;
    }

    public String a() {
        return this.f320f.toString();
    }

    public String b() {
        switch (this.f319e) {
            case 1:
                return "title";
            case 2:
                return "subject";
            case 3:
                return "keywords";
            case 4:
                return "author";
            case 5:
                return "producer";
            case 6:
                return "creationdate";
            default:
                return "unknown";
        }
    }

    public ArrayList e0() {
        return new ArrayList();
    }

    public boolean r(i iVar) {
        try {
            return iVar.b(this);
        } catch (g unused) {
            return false;
        }
    }
}
