package f5;

import android.graphics.Typeface;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f11328a;

    /* renamed from: b  reason: collision with root package name */
    private final C0144a f11329b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11330c;

    /* renamed from: f5.a$a  reason: collision with other inner class name */
    public interface C0144a {
        void a(Typeface typeface);
    }

    public a(C0144a aVar, Typeface typeface) {
        this.f11328a = typeface;
        this.f11329b = aVar;
    }

    private void d(Typeface typeface) {
        if (!this.f11330c) {
            this.f11329b.a(typeface);
        }
    }

    public void a(int i10) {
        d(this.f11328a);
    }

    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f11330c = true;
    }
}
