package hp;

class m implements o {

    /* renamed from: a  reason: collision with root package name */
    private o f24280a;

    /* renamed from: b  reason: collision with root package name */
    private String f24281b;

    /* renamed from: c  reason: collision with root package name */
    private String f24282c;

    /* renamed from: d  reason: collision with root package name */
    private String f24283d;

    /* renamed from: e  reason: collision with root package name */
    private String f24284e;

    /* renamed from: f  reason: collision with root package name */
    private Object f24285f;

    public m(o oVar, a aVar) {
        this.f24281b = aVar.b();
        this.f24282c = aVar.getPrefix();
        this.f24285f = aVar.a();
        this.f24284e = aVar.getValue();
        this.f24283d = aVar.getName();
        this.f24280a = oVar;
    }

    public o a(String str) {
        return null;
    }

    public boolean b() {
        return false;
    }

    public y c() {
        return new p(this);
    }

    public String getName() {
        return this.f24283d;
    }

    public j0 getPosition() {
        return this.f24280a.getPosition();
    }

    public String getValue() {
        return this.f24284e;
    }

    public o l() {
        return null;
    }

    public void n() {
    }

    public String toString() {
        return String.format("attribute %s='%s'", new Object[]{this.f24283d, this.f24284e});
    }

    public m(o oVar, String str, String str2) {
        this.f24280a = oVar;
        this.f24284e = str2;
        this.f24283d = str;
    }
}
