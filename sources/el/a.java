package el;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.smarteist.autoimageslider.d;

public class a extends l1.a {

    /* renamed from: c  reason: collision with root package name */
    private d f23052c;

    public a(d dVar) {
        this.f23052c = dVar;
    }

    public void a(ViewGroup viewGroup, int i10, Object obj) {
        if (t() < 1) {
            this.f23052c.a(viewGroup, 0, obj);
        } else {
            this.f23052c.a(viewGroup, u(i10), obj);
        }
    }

    public void c(ViewGroup viewGroup) {
        this.f23052c.c(viewGroup);
    }

    public int d() {
        if (t() < 1) {
            return 0;
        }
        return t() * 32400;
    }

    public int e(Object obj) {
        return this.f23052c.e(obj);
    }

    public float f(int i10) {
        return this.f23052c.f(i10);
    }

    public Object g(ViewGroup viewGroup, int i10) {
        return t() < 1 ? this.f23052c.g(viewGroup, 0) : this.f23052c.g(viewGroup, u(i10));
    }

    public boolean h(View view, Object obj) {
        return this.f23052c.h(view, obj);
    }

    public void i(DataSetObserver dataSetObserver) {
        this.f23052c.i(dataSetObserver);
    }

    public void j(Parcelable parcelable, ClassLoader classLoader) {
        this.f23052c.j(parcelable, classLoader);
    }

    public Parcelable k() {
        return this.f23052c.k();
    }

    public void m(ViewGroup viewGroup, int i10, Object obj) {
        this.f23052c.m(viewGroup, i10, obj);
    }

    public void p(ViewGroup viewGroup) {
        this.f23052c.p(viewGroup);
    }

    public void q(DataSetObserver dataSetObserver) {
        this.f23052c.q(dataSetObserver);
    }

    public int r(int i10) {
        return i10 + (Math.max(0, t()) * 16200);
    }

    public l1.a s() {
        return this.f23052c;
    }

    public int t() {
        try {
            return s().d();
        } catch (Exception unused) {
            return 0;
        }
    }

    public int u(int i10) {
        if (t() > 0) {
            return i10 % t();
        }
        return 0;
    }
}
