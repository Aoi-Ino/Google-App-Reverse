package k2;

import e2.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    String f12929a;

    /* renamed from: b  reason: collision with root package name */
    String f12930b;

    /* renamed from: c  reason: collision with root package name */
    String f12931c;

    /* renamed from: d  reason: collision with root package name */
    h f12932d = h.MEDIUM;

    /* renamed from: e  reason: collision with root package name */
    Object f12933e;

    /* renamed from: f  reason: collision with root package name */
    int f12934f;

    /* renamed from: g  reason: collision with root package name */
    int f12935g;

    /* renamed from: h  reason: collision with root package name */
    String f12936h;

    /* renamed from: i  reason: collision with root package name */
    HashMap f12937i;

    public b(String str, String str2, String str3) {
        this.f12929a = str;
        this.f12930b = str2;
        this.f12931c = str3;
    }

    public a a() {
        return new a(this);
    }

    public b b(String str, String str2) {
        if (this.f12937i == null) {
            this.f12937i = new HashMap();
        }
        List list = (List) this.f12937i.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f12937i.put(str, list);
        }
        if (!list.contains(str2)) {
            list.add(str2);
        }
        return this;
    }
}
