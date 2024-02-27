package l1;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final DataSetObservable f13266a = new DataSetObservable();

    /* renamed from: b  reason: collision with root package name */
    private DataSetObserver f13267b;

    public abstract void a(ViewGroup viewGroup, int i10, Object obj);

    public void b(View view) {
    }

    public void c(ViewGroup viewGroup) {
        b(viewGroup);
    }

    public abstract int d();

    public abstract int e(Object obj);

    public float f(int i10) {
        return 1.0f;
    }

    public abstract Object g(ViewGroup viewGroup, int i10);

    public abstract boolean h(View view, Object obj);

    public void i(DataSetObserver dataSetObserver) {
        this.f13266a.registerObserver(dataSetObserver);
    }

    public void j(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable k() {
        return null;
    }

    public void l(View view, int i10, Object obj) {
    }

    public void m(ViewGroup viewGroup, int i10, Object obj) {
        l(viewGroup, i10, obj);
    }

    /* access modifiers changed from: package-private */
    public void n(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f13267b = dataSetObserver;
        }
    }

    public void o(View view) {
    }

    public void p(ViewGroup viewGroup) {
        o(viewGroup);
    }

    public void q(DataSetObserver dataSetObserver) {
        this.f13266a.unregisterObserver(dataSetObserver);
    }
}
