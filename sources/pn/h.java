package pn;

import java.lang.reflect.Modifier;

class h {

    /* renamed from: j  reason: collision with root package name */
    static h f30510j;

    /* renamed from: k  reason: collision with root package name */
    static h f30511k;

    /* renamed from: l  reason: collision with root package name */
    static h f30512l;

    /* renamed from: a  reason: collision with root package name */
    boolean f30513a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f30514b = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f30515c = false;

    /* renamed from: d  reason: collision with root package name */
    boolean f30516d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f30517e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f30518f = true;

    /* renamed from: g  reason: collision with root package name */
    boolean f30519g = true;

    /* renamed from: h  reason: collision with root package name */
    boolean f30520h = true;

    /* renamed from: i  reason: collision with root package name */
    int f30521i;

    static {
        h hVar = new h();
        f30510j = hVar;
        hVar.f30513a = true;
        hVar.f30514b = false;
        hVar.f30515c = false;
        hVar.f30516d = false;
        hVar.f30517e = true;
        hVar.f30518f = false;
        hVar.f30519g = false;
        hVar.f30521i = 0;
        h hVar2 = new h();
        f30511k = hVar2;
        hVar2.f30513a = true;
        hVar2.f30514b = true;
        hVar2.f30515c = false;
        hVar2.f30516d = false;
        hVar2.f30517e = false;
        f30510j.f30521i = 1;
        h hVar3 = new h();
        f30512l = hVar3;
        hVar3.f30513a = false;
        hVar3.f30514b = true;
        hVar3.f30515c = false;
        hVar3.f30516d = true;
        hVar3.f30517e = false;
        hVar3.f30520h = false;
        hVar3.f30521i = 2;
    }

    h() {
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        String str;
        if (clsArr != null) {
            if (!this.f30514b) {
                str = clsArr.length == 0 ? "()" : "(..)";
            } else {
                stringBuffer.append("(");
                c(stringBuffer, clsArr);
                str = ")";
            }
            stringBuffer.append(str);
        }
    }

    public void b(StringBuffer stringBuffer, Class[] clsArr) {
        if (this.f30515c && clsArr != null && clsArr.length != 0) {
            stringBuffer.append(" throws ");
            c(stringBuffer, clsArr);
        }
    }

    public void c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(g(clsArr[i10]));
        }
    }

    /* access modifiers changed from: package-private */
    public String d(String str) {
        int lastIndexOf = str.lastIndexOf(45);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    /* access modifiers changed from: package-private */
    public String e(int i10) {
        if (!this.f30516d) {
            return "";
        }
        String modifier = Modifier.toString(i10);
        if (modifier.length() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(modifier);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public String f(Class cls, String str) {
        return h(cls, str, this.f30517e);
    }

    public String g(Class cls) {
        return h(cls, cls.getName(), this.f30513a);
    }

    /* access modifiers changed from: package-private */
    public String h(Class cls, String str, boolean z10) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return z10 ? i(str).replace('$', '.') : str.replace('$', '.');
        }
        Class<?> componentType = cls.getComponentType();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(componentType, componentType.getName(), z10));
        stringBuffer.append("[]");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: package-private */
    public String i(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }
}
