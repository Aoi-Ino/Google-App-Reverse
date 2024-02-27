package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends d {

    /* renamed from: a  reason: collision with root package name */
    private Set f2766a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private List f2767b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List f2768c = new CopyOnWriteArrayList();

    private boolean e() {
        StringBuilder sb2;
        boolean z10 = false;
        for (String str : this.f2768c) {
            try {
                Class<?> cls = Class.forName(str);
                if (d.class.isAssignableFrom(cls)) {
                    d((d) cls.newInstance());
                    this.f2768c.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                e = e10;
                sb2 = new StringBuilder();
                sb2.append("unable to add feature mapper for ");
                sb2.append(str);
                Log.e("MergedDataBinderMapper", sb2.toString(), e);
            } catch (InstantiationException e11) {
                e = e11;
                sb2 = new StringBuilder();
                sb2.append("unable to add feature mapper for ");
                sb2.append(str);
                Log.e("MergedDataBinderMapper", sb2.toString(), e);
            }
        }
        return z10;
    }

    public h b(e eVar, View view, int i10) {
        for (d b10 : this.f2767b) {
            h b11 = b10.b(eVar, view, i10);
            if (b11 != null) {
                return b11;
            }
        }
        if (e()) {
            return b(eVar, view, i10);
        }
        return null;
    }

    public h c(e eVar, View[] viewArr, int i10) {
        for (d c10 : this.f2767b) {
            h c11 = c10.c(eVar, viewArr, i10);
            if (c11 != null) {
                return c11;
            }
        }
        if (e()) {
            return c(eVar, viewArr, i10);
        }
        return null;
    }

    public void d(d dVar) {
        if (this.f2766a.add(dVar.getClass())) {
            this.f2767b.add(dVar);
            for (d d10 : dVar.a()) {
                d(d10);
            }
        }
    }
}
