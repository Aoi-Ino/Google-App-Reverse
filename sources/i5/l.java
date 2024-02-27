package i5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f12431a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f12432b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f12433c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f12434d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final Path f12435e = new Path();

    /* renamed from: f  reason: collision with root package name */
    private final Path f12436f = new Path();

    /* renamed from: g  reason: collision with root package name */
    private final m f12437g = new m();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f12438h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    private final float[] f12439i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    private final Path f12440j = new Path();

    /* renamed from: k  reason: collision with root package name */
    private final Path f12441k = new Path();

    /* renamed from: l  reason: collision with root package name */
    private boolean f12442l = true;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final l f12443a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final k f12444a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f12445b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f12446c;

        /* renamed from: d  reason: collision with root package name */
        public final b f12447d;

        /* renamed from: e  reason: collision with root package name */
        public final float f12448e;

        c(k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f12447d = bVar;
            this.f12444a = kVar;
            this.f12448e = f10;
            this.f12446c = rectF;
            this.f12445b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f12431a[i10] = new m();
            this.f12432b[i10] = new Matrix();
            this.f12433c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return (float) (((i10 + 1) % 4) * 90);
    }

    private void b(c cVar, int i10) {
        this.f12438h[0] = this.f12431a[i10].k();
        this.f12438h[1] = this.f12431a[i10].l();
        this.f12432b[i10].mapPoints(this.f12438h);
        Path path = cVar.f12445b;
        float[] fArr = this.f12438h;
        if (i10 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f12431a[i10].d(this.f12432b[i10], cVar.f12445b);
        b bVar = cVar.f12447d;
        if (bVar != null) {
            bVar.b(this.f12431a[i10], this.f12432b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        m mVar;
        Matrix matrix;
        Path path;
        int i11 = (i10 + 1) % 4;
        this.f12438h[0] = this.f12431a[i10].i();
        this.f12438h[1] = this.f12431a[i10].j();
        this.f12432b[i10].mapPoints(this.f12438h);
        this.f12439i[0] = this.f12431a[i11].k();
        this.f12439i[1] = this.f12431a[i11].l();
        this.f12432b[i11].mapPoints(this.f12439i);
        float[] fArr = this.f12438h;
        float f10 = fArr[0];
        float[] fArr2 = this.f12439i;
        float max = Math.max(((float) Math.hypot((double) (f10 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i12 = i(cVar.f12446c, i10);
        this.f12437g.n(0.0f, 0.0f);
        f j10 = j(i10, cVar.f12444a);
        j10.b(max, i12, cVar.f12448e, this.f12437g);
        this.f12440j.reset();
        this.f12437g.d(this.f12433c[i10], this.f12440j);
        if (!this.f12442l || (!j10.a() && !l(this.f12440j, i10) && !l(this.f12440j, i11))) {
            mVar = this.f12437g;
            matrix = this.f12433c[i10];
            path = cVar.f12445b;
        } else {
            Path path2 = this.f12440j;
            path2.op(path2, this.f12436f, Path.Op.DIFFERENCE);
            this.f12438h[0] = this.f12437g.k();
            this.f12438h[1] = this.f12437g.l();
            this.f12433c[i10].mapPoints(this.f12438h);
            Path path3 = this.f12435e;
            float[] fArr3 = this.f12438h;
            path3.moveTo(fArr3[0], fArr3[1]);
            mVar = this.f12437g;
            matrix = this.f12433c[i10];
            path = this.f12435e;
        }
        mVar.d(matrix, path);
        b bVar = cVar.f12447d;
        if (bVar != null) {
            bVar.a(this.f12437g, this.f12433c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        float f10;
        float f11;
        float f12;
        if (i10 == 1) {
            f10 = rectF.right;
            f12 = rectF.bottom;
        } else if (i10 != 2) {
            f11 = i10 != 3 ? rectF.right : rectF.left;
            f12 = rectF.top;
        } else {
            f10 = rectF.left;
            f12 = rectF.bottom;
        }
        pointF.set(f11, f12);
    }

    private c g(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.l();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.t() : kVar.r();
        }
        return kVar.j();
    }

    private d h(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.k();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.s() : kVar.q();
        }
        return kVar.i();
    }

    private float i(RectF rectF, int i10) {
        float centerX;
        float f10;
        float[] fArr = this.f12438h;
        m mVar = this.f12431a[i10];
        fArr[0] = mVar.f12451c;
        fArr[1] = mVar.f12452d;
        this.f12432b[i10].mapPoints(fArr);
        if (i10 == 1 || i10 == 3) {
            centerX = rectF.centerX();
            f10 = this.f12438h[0];
        } else {
            centerX = rectF.centerY();
            f10 = this.f12438h[1];
        }
        return Math.abs(centerX - f10);
    }

    private f j(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.h();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.o() : kVar.p();
        }
        return kVar.n();
    }

    public static l k() {
        return a.f12443a;
    }

    private boolean l(Path path, int i10) {
        this.f12441k.reset();
        this.f12431a[i10].d(this.f12432b[i10], this.f12441k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f12441k.computeBounds(rectF, true);
        path.op(this.f12441k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f12444a).b(this.f12431a[i10], 90.0f, cVar.f12448e, cVar.f12446c, g(i10, cVar.f12444a));
        float a10 = a(i10);
        this.f12432b[i10].reset();
        f(i10, cVar.f12446c, this.f12434d);
        Matrix matrix = this.f12432b[i10];
        PointF pointF = this.f12434d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f12432b[i10].preRotate(a10);
    }

    private void n(int i10) {
        this.f12438h[0] = this.f12431a[i10].i();
        this.f12438h[1] = this.f12431a[i10].j();
        this.f12432b[i10].mapPoints(this.f12438h);
        float a10 = a(i10);
        this.f12433c[i10].reset();
        Matrix matrix = this.f12433c[i10];
        float[] fArr = this.f12438h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f12433c[i10].preRotate(a10);
    }

    public void d(k kVar, float f10, RectF rectF, Path path) {
        e(kVar, f10, rectF, (b) null, path);
    }

    public void e(k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f12435e.rewind();
        this.f12436f.rewind();
        this.f12436f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f12435e.close();
        if (!this.f12435e.isEmpty()) {
            path.op(this.f12435e, Path.Op.UNION);
        }
    }
}
