package i1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map f12221a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f12222b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList f12223c = new ArrayList();

    public s(View view) {
        this.f12222b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f12222b == sVar.f12222b && this.f12221a.equals(sVar.f12221a);
    }

    public int hashCode() {
        return (this.f12222b.hashCode() * 31) + this.f12221a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f12222b + "\n") + "    values:";
        for (String str2 : this.f12221a.keySet()) {
            str = str + "    " + str2 + ": " + this.f12221a.get(str2) + "\n";
        }
        return str;
    }
}
