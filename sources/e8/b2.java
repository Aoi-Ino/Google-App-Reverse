package e8;

import java.util.ArrayList;

public class b2 {

    /* renamed from: a  reason: collision with root package name */
    ArrayList f10176a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private String f10177b;

    /* renamed from: c  reason: collision with root package name */
    private Float f10178c;

    public b2() {
    }

    private void d(Object obj) {
        ArrayList arrayList = this.f10176a;
        arrayList.set(arrayList.size() - 1, obj);
    }

    public void a(float f10) {
        if (f10 != 0.0f) {
            Float f11 = this.f10178c;
            if (f11 != null) {
                Float f12 = new Float(f10 + f11.floatValue());
                this.f10178c = f12;
                if (f12.floatValue() != 0.0f) {
                    d(this.f10178c);
                } else {
                    ArrayList arrayList = this.f10176a;
                    arrayList.remove(arrayList.size() - 1);
                }
            } else {
                Float f13 = new Float(f10);
                this.f10178c = f13;
                this.f10176a.add(f13);
            }
            this.f10177b = null;
        }
    }

    public void b(String str) {
        if (str.length() > 0) {
            if (this.f10177b != null) {
                String str2 = this.f10177b + str;
                this.f10177b = str2;
                d(str2);
            } else {
                this.f10177b = str;
                this.f10176a.add(str);
            }
            this.f10178c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList c() {
        return this.f10176a;
    }

    public b2(String str) {
        b(str);
    }
}
