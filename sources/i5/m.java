package i5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public float f12449a;

    /* renamed from: b  reason: collision with root package name */
    public float f12450b;

    /* renamed from: c  reason: collision with root package name */
    public float f12451c;

    /* renamed from: d  reason: collision with root package name */
    public float f12452d;

    /* renamed from: e  reason: collision with root package name */
    public float f12453e;

    /* renamed from: f  reason: collision with root package name */
    public float f12454f;

    /* renamed from: g  reason: collision with root package name */
    private final List f12455g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List f12456h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f12457i;

    class a extends g {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f12458c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Matrix f12459d;

        a(List list, Matrix matrix) {
            this.f12458c = list;
            this.f12459d = matrix;
        }

        public void a(Matrix matrix, h5.a aVar, int i10, Canvas canvas) {
            for (g a10 : this.f12458c) {
                a10.a(this.f12459d, aVar, i10, canvas);
            }
        }
    }

    static class b extends g {

        /* renamed from: c  reason: collision with root package name */
        private final d f12461c;

        public b(d dVar) {
            this.f12461c = dVar;
        }

        public void a(Matrix matrix, h5.a aVar, int i10, Canvas canvas) {
            float h10 = this.f12461c.m();
            float i11 = this.f12461c.n();
            aVar.a(canvas, matrix, new RectF(this.f12461c.k(), this.f12461c.o(), this.f12461c.l(), this.f12461c.j()), i10, h10, i11);
        }
    }

    static class c extends g {

        /* renamed from: c  reason: collision with root package name */
        private final e f12462c;

        /* renamed from: d  reason: collision with root package name */
        private final float f12463d;

        /* renamed from: e  reason: collision with root package name */
        private final float f12464e;

        public c(e eVar, float f10, float f11) {
            this.f12462c = eVar;
            this.f12463d = f10;
            this.f12464e = f11;
        }

        public void a(Matrix matrix, h5.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f12462c.f12473c - this.f12464e), (double) (this.f12462c.f12472b - this.f12463d)), 0.0f);
            this.f12476a.set(matrix);
            this.f12476a.preTranslate(this.f12463d, this.f12464e);
            this.f12476a.preRotate(c());
            aVar.b(canvas, this.f12476a, rectF, i10);
        }

        /* access modifiers changed from: package-private */
        public float c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f12462c.f12473c - this.f12464e) / (this.f12462c.f12472b - this.f12463d))));
        }
    }

    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f12465h = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public float f12466b;

        /* renamed from: c  reason: collision with root package name */
        public float f12467c;

        /* renamed from: d  reason: collision with root package name */
        public float f12468d;

        /* renamed from: e  reason: collision with root package name */
        public float f12469e;

        /* renamed from: f  reason: collision with root package name */
        public float f12470f;

        /* renamed from: g  reason: collision with root package name */
        public float f12471g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* access modifiers changed from: private */
        public float j() {
            return this.f12469e;
        }

        /* access modifiers changed from: private */
        public float k() {
            return this.f12466b;
        }

        /* access modifiers changed from: private */
        public float l() {
            return this.f12468d;
        }

        /* access modifiers changed from: private */
        public float m() {
            return this.f12470f;
        }

        /* access modifiers changed from: private */
        public float n() {
            return this.f12471g;
        }

        /* access modifiers changed from: private */
        public float o() {
            return this.f12467c;
        }

        private void p(float f10) {
            this.f12469e = f10;
        }

        private void q(float f10) {
            this.f12466b = f10;
        }

        private void r(float f10) {
            this.f12468d = f10;
        }

        /* access modifiers changed from: private */
        public void s(float f10) {
            this.f12470f = f10;
        }

        /* access modifiers changed from: private */
        public void t(float f10) {
            this.f12471g = f10;
        }

        private void u(float f10) {
            this.f12467c = f10;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f12474a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f12465h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f12472b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public float f12473c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f12474a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f12472b, this.f12473c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f12474a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* renamed from: b  reason: collision with root package name */
        static final Matrix f12475b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        final Matrix f12476a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, h5.a aVar, int i10, Canvas canvas);

        public final void b(h5.a aVar, int i10, Canvas canvas) {
            a(f12475b, aVar, i10, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() != f10) {
            float g10 = ((f10 - g()) + 360.0f) % 360.0f;
            if (g10 <= 180.0f) {
                d dVar = new d(i(), j(), i(), j());
                dVar.s(g());
                dVar.t(g10);
                this.f12456h.add(new b(dVar));
                p(f10);
            }
        }
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f12456h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f12453e;
    }

    private float h() {
        return this.f12454f;
    }

    private void p(float f10) {
        this.f12453e = f10;
    }

    private void q(float f10) {
        this.f12454f = f10;
    }

    private void r(float f10) {
        this.f12451c = f10;
    }

    private void s(float f10) {
        this.f12452d = f10;
    }

    private void t(float f10) {
        this.f12449a = f10;
    }

    private void u(float f10) {
        this.f12450b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f12455g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = (double) f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f12455g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f12455g.get(i10)).a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f12457i;
    }

    /* access modifiers changed from: package-private */
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f12456h), new Matrix(matrix));
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f12451c;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f12452d;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f12449a;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f12450b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        float unused = eVar.f12472b = f10;
        float unused2 = eVar.f12473c = f11;
        this.f12455g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f12455g.clear();
        this.f12456h.clear();
        this.f12457i = false;
    }
}
