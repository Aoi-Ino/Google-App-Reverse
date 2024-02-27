package i5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import i5.k;
import i5.l;
import i5.m;
import java.util.BitSet;
import z4.e;

public class g extends Drawable implements n {
    private static final String B = "g";
    private static final Paint C;
    private boolean A;

    /* renamed from: e  reason: collision with root package name */
    private c f12357e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final m.g[] f12358f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final m.g[] f12359g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final BitSet f12360h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f12361i;

    /* renamed from: j  reason: collision with root package name */
    private final Matrix f12362j;

    /* renamed from: k  reason: collision with root package name */
    private final Path f12363k;

    /* renamed from: l  reason: collision with root package name */
    private final Path f12364l;

    /* renamed from: m  reason: collision with root package name */
    private final RectF f12365m;

    /* renamed from: n  reason: collision with root package name */
    private final RectF f12366n;

    /* renamed from: o  reason: collision with root package name */
    private final Region f12367o;

    /* renamed from: p  reason: collision with root package name */
    private final Region f12368p;

    /* renamed from: q  reason: collision with root package name */
    private k f12369q;

    /* renamed from: r  reason: collision with root package name */
    private final Paint f12370r;

    /* renamed from: s  reason: collision with root package name */
    private final Paint f12371s;

    /* renamed from: t  reason: collision with root package name */
    private final h5.a f12372t;

    /* renamed from: u  reason: collision with root package name */
    private final l.b f12373u;

    /* renamed from: v  reason: collision with root package name */
    private final l f12374v;

    /* renamed from: w  reason: collision with root package name */
    private PorterDuffColorFilter f12375w;

    /* renamed from: x  reason: collision with root package name */
    private PorterDuffColorFilter f12376x;

    /* renamed from: y  reason: collision with root package name */
    private int f12377y;

    /* renamed from: z  reason: collision with root package name */
    private final RectF f12378z;

    class a implements l.b {
        a() {
        }

        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f12360h.set(i10 + 4, mVar.e());
            g.this.f12359g[i10] = mVar.f(matrix);
        }

        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f12360h.set(i10, mVar.e());
            g.this.f12358f[i10] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f12380a;

        b(float f10) {
            this.f12380a = f10;
        }

        public c a(c cVar) {
            return cVar instanceof i ? cVar : new b(this.f12380a, cVar);
        }
    }

    protected static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        k f12382a;

        /* renamed from: b  reason: collision with root package name */
        a5.a f12383b;

        /* renamed from: c  reason: collision with root package name */
        ColorFilter f12384c;

        /* renamed from: d  reason: collision with root package name */
        ColorStateList f12385d = null;

        /* renamed from: e  reason: collision with root package name */
        ColorStateList f12386e = null;

        /* renamed from: f  reason: collision with root package name */
        ColorStateList f12387f = null;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f12388g = null;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f12389h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i  reason: collision with root package name */
        Rect f12390i = null;

        /* renamed from: j  reason: collision with root package name */
        float f12391j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f12392k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        float f12393l;

        /* renamed from: m  reason: collision with root package name */
        int f12394m = 255;

        /* renamed from: n  reason: collision with root package name */
        float f12395n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        float f12396o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        float f12397p = 0.0f;

        /* renamed from: q  reason: collision with root package name */
        int f12398q = 0;

        /* renamed from: r  reason: collision with root package name */
        int f12399r = 0;

        /* renamed from: s  reason: collision with root package name */
        int f12400s = 0;

        /* renamed from: t  reason: collision with root package name */
        int f12401t = 0;

        /* renamed from: u  reason: collision with root package name */
        boolean f12402u = false;

        /* renamed from: v  reason: collision with root package name */
        Paint.Style f12403v = Paint.Style.FILL_AND_STROKE;

        public c(c cVar) {
            this.f12382a = cVar.f12382a;
            this.f12383b = cVar.f12383b;
            this.f12393l = cVar.f12393l;
            this.f12384c = cVar.f12384c;
            this.f12385d = cVar.f12385d;
            this.f12386e = cVar.f12386e;
            this.f12389h = cVar.f12389h;
            this.f12388g = cVar.f12388g;
            this.f12394m = cVar.f12394m;
            this.f12391j = cVar.f12391j;
            this.f12400s = cVar.f12400s;
            this.f12398q = cVar.f12398q;
            this.f12402u = cVar.f12402u;
            this.f12392k = cVar.f12392k;
            this.f12395n = cVar.f12395n;
            this.f12396o = cVar.f12396o;
            this.f12397p = cVar.f12397p;
            this.f12399r = cVar.f12399r;
            this.f12401t = cVar.f12401t;
            this.f12387f = cVar.f12387f;
            this.f12403v = cVar.f12403v;
            if (cVar.f12390i != null) {
                this.f12390i = new Rect(cVar.f12390i);
            }
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            g gVar = new g(this);
            boolean unused = gVar.f12361i = true;
            return gVar;
        }

        public c(k kVar, a5.a aVar) {
            this.f12382a = kVar;
            this.f12383b = aVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        C = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    private float E() {
        if (L()) {
            return this.f12371s.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean J() {
        c cVar = this.f12357e;
        int i10 = cVar.f12398q;
        return i10 != 1 && cVar.f12399r > 0 && (i10 == 2 || T());
    }

    private boolean K() {
        Paint.Style style = this.f12357e.f12403v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean L() {
        Paint.Style style = this.f12357e.f12403v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f12371s.getStrokeWidth() > 0.0f;
    }

    private void N() {
        super.invalidateSelf();
    }

    private void Q(Canvas canvas) {
        if (J()) {
            canvas.save();
            S(canvas);
            if (!this.A) {
                n(canvas);
            } else {
                int width = (int) (this.f12378z.width() - ((float) getBounds().width()));
                int height = (int) (this.f12378z.height() - ((float) getBounds().height()));
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f12378z.width()) + (this.f12357e.f12399r * 2) + width, ((int) this.f12378z.height()) + (this.f12357e.f12399r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f10 = (float) ((getBounds().left - this.f12357e.f12399r) - width);
                float f11 = (float) ((getBounds().top - this.f12357e.f12399r) - height);
                canvas2.translate(-f10, -f11);
                n(canvas2);
                canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
                createBitmap.recycle();
            }
            canvas.restore();
        }
    }

    private static int R(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void S(Canvas canvas) {
        canvas.translate((float) B(), (float) C());
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int l10 = l(color);
        this.f12377y = l10;
        if (l10 != color) {
            return new PorterDuffColorFilter(l10, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f12357e.f12391j != 1.0f) {
            this.f12362j.reset();
            Matrix matrix = this.f12362j;
            float f10 = this.f12357e.f12391j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f12362j);
        }
        path.computeBounds(this.f12378z, true);
    }

    private boolean g0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f12357e.f12385d == null || (color2 = this.f12370r.getColor()) == (colorForState2 = this.f12357e.f12385d.getColorForState(iArr, color2))) {
            z10 = false;
        } else {
            this.f12370r.setColor(colorForState2);
            z10 = true;
        }
        if (this.f12357e.f12386e == null || (color = this.f12371s.getColor()) == (colorForState = this.f12357e.f12386e.getColorForState(iArr, color))) {
            return z10;
        }
        this.f12371s.setColor(colorForState);
        return true;
    }

    private boolean h0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f12375w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f12376x;
        c cVar = this.f12357e;
        this.f12375w = k(cVar.f12388g, cVar.f12389h, this.f12370r, true);
        c cVar2 = this.f12357e;
        this.f12376x = k(cVar2.f12387f, cVar2.f12389h, this.f12371s, false);
        c cVar3 = this.f12357e;
        if (cVar3.f12402u) {
            this.f12372t.d(cVar3.f12388g.getColorForState(getState(), 0));
        }
        return !androidx.core.util.c.a(porterDuffColorFilter, this.f12375w) || !androidx.core.util.c.a(porterDuffColorFilter2, this.f12376x);
    }

    private void i() {
        k y10 = D().y(new b(-E()));
        this.f12369q = y10;
        this.f12374v.d(y10, this.f12357e.f12392k, v(), this.f12364l);
    }

    private void i0() {
        float I = I();
        this.f12357e.f12399r = (int) Math.ceil((double) (0.75f * I));
        this.f12357e.f12400s = (int) Math.ceil((double) (I * 0.25f));
        h0();
        N();
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f12377y = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public static g m(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(x4.a.c(context, q4.b.colorSurface, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.M(context);
        gVar.W(colorStateList);
        gVar.V(f10);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f12360h.cardinality() > 0) {
            Log.w(B, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f12357e.f12400s != 0) {
            canvas.drawPath(this.f12363k, this.f12372t.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f12358f[i10].b(this.f12372t, this.f12357e.f12399r, canvas);
            this.f12359g[i10].b(this.f12372t, this.f12357e.f12399r, canvas);
        }
        if (this.A) {
            int B2 = B();
            int C2 = C();
            canvas.translate((float) (-B2), (float) (-C2));
            canvas.drawPath(this.f12363k, C);
            canvas.translate((float) B2, (float) C2);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.f12370r, this.f12363k, this.f12357e.f12382a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a10 = kVar.t().a(rectF) * this.f12357e.f12392k;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private RectF v() {
        this.f12366n.set(u());
        float E = E();
        this.f12366n.inset(E, E);
        return this.f12366n;
    }

    public int A() {
        return this.f12377y;
    }

    public int B() {
        c cVar = this.f12357e;
        return (int) (((double) cVar.f12400s) * Math.sin(Math.toRadians((double) cVar.f12401t)));
    }

    public int C() {
        c cVar = this.f12357e;
        return (int) (((double) cVar.f12400s) * Math.cos(Math.toRadians((double) cVar.f12401t)));
    }

    public k D() {
        return this.f12357e.f12382a;
    }

    public float F() {
        return this.f12357e.f12382a.r().a(u());
    }

    public float G() {
        return this.f12357e.f12382a.t().a(u());
    }

    public float H() {
        return this.f12357e.f12397p;
    }

    public float I() {
        return w() + H();
    }

    public void M(Context context) {
        this.f12357e.f12383b = new a5.a(context);
        i0();
    }

    public boolean O() {
        a5.a aVar = this.f12357e.f12383b;
        return aVar != null && aVar.d();
    }

    public boolean P() {
        return this.f12357e.f12382a.u(u());
    }

    public boolean T() {
        return !P() && !this.f12363k.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public void U(c cVar) {
        setShapeAppearanceModel(this.f12357e.f12382a.x(cVar));
    }

    public void V(float f10) {
        c cVar = this.f12357e;
        if (cVar.f12396o != f10) {
            cVar.f12396o = f10;
            i0();
        }
    }

    public void W(ColorStateList colorStateList) {
        c cVar = this.f12357e;
        if (cVar.f12385d != colorStateList) {
            cVar.f12385d = colorStateList;
            onStateChange(getState());
        }
    }

    public void X(float f10) {
        c cVar = this.f12357e;
        if (cVar.f12392k != f10) {
            cVar.f12392k = f10;
            this.f12361i = true;
            invalidateSelf();
        }
    }

    public void Y(int i10, int i11, int i12, int i13) {
        c cVar = this.f12357e;
        if (cVar.f12390i == null) {
            cVar.f12390i = new Rect();
        }
        this.f12357e.f12390i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void Z(float f10) {
        c cVar = this.f12357e;
        if (cVar.f12395n != f10) {
            cVar.f12395n = f10;
            i0();
        }
    }

    public void a0(boolean z10) {
        this.A = z10;
    }

    public void b0(int i10) {
        this.f12372t.d(i10);
        this.f12357e.f12402u = false;
        N();
    }

    public void c0(float f10, int i10) {
        f0(f10);
        e0(ColorStateList.valueOf(i10));
    }

    public void d0(float f10, ColorStateList colorStateList) {
        f0(f10);
        e0(colorStateList);
    }

    public void draw(Canvas canvas) {
        this.f12370r.setColorFilter(this.f12375w);
        int alpha = this.f12370r.getAlpha();
        this.f12370r.setAlpha(R(alpha, this.f12357e.f12394m));
        this.f12371s.setColorFilter(this.f12376x);
        this.f12371s.setStrokeWidth(this.f12357e.f12393l);
        int alpha2 = this.f12371s.getAlpha();
        this.f12371s.setAlpha(R(alpha2, this.f12357e.f12394m));
        if (this.f12361i) {
            i();
            g(u(), this.f12363k);
            this.f12361i = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        this.f12370r.setAlpha(alpha);
        this.f12371s.setAlpha(alpha2);
    }

    public void e0(ColorStateList colorStateList) {
        c cVar = this.f12357e;
        if (cVar.f12386e != colorStateList) {
            cVar.f12386e = colorStateList;
            onStateChange(getState());
        }
    }

    public void f0(float f10) {
        this.f12357e.f12393l = f10;
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f12357e.f12394m;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f12357e;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f12357e.f12398q != 2) {
            if (P()) {
                outline.setRoundRect(getBounds(), F() * this.f12357e.f12392k);
                return;
            }
            g(u(), this.f12363k);
            e.i(outline, this.f12363k);
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f12357e.f12390i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f12367o.set(getBounds());
        g(u(), this.f12363k);
        this.f12368p.setPath(this.f12363k, this.f12367o);
        this.f12367o.op(this.f12368p, Region.Op.DIFFERENCE);
        return this.f12367o;
    }

    /* access modifiers changed from: protected */
    public final void h(RectF rectF, Path path) {
        l lVar = this.f12374v;
        c cVar = this.f12357e;
        k kVar = cVar.f12382a;
        float f10 = cVar.f12392k;
        lVar.e(kVar, f10, rectF, this.f12373u, path);
    }

    public void invalidateSelf() {
        this.f12361i = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f12357e.f12386e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f12357e.f12385d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f12357e.f12388g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f12357e.f12387f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            i5.g$c r0 = r1.f12357e
            android.content.res.ColorStateList r0 = r0.f12388g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            i5.g$c r0 = r1.f12357e
            android.content.res.ColorStateList r0 = r0.f12387f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            i5.g$c r0 = r1.f12357e
            android.content.res.ColorStateList r0 = r0.f12386e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            i5.g$c r0 = r1.f12357e
            android.content.res.ColorStateList r0 = r0.f12385d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.g.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public int l(int i10) {
        float I = I() + z();
        a5.a aVar = this.f12357e.f12383b;
        return aVar != null ? aVar.c(i10, I) : i10;
    }

    public Drawable mutate() {
        this.f12357e = new c(this.f12357e);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f12361i = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z10 = g0(iArr) || h0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    /* access modifiers changed from: protected */
    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f12357e.f12382a, rectF);
    }

    /* access modifiers changed from: protected */
    public void r(Canvas canvas) {
        q(canvas, this.f12371s, this.f12364l, this.f12369q, v());
    }

    public float s() {
        return this.f12357e.f12382a.j().a(u());
    }

    public void setAlpha(int i10) {
        c cVar = this.f12357e;
        if (cVar.f12394m != i10) {
            cVar.f12394m = i10;
            N();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f12357e.f12384c = colorFilter;
        N();
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f12357e.f12382a = kVar;
        invalidateSelf();
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f12357e.f12388g = colorStateList;
        h0();
        N();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f12357e;
        if (cVar.f12389h != mode) {
            cVar.f12389h = mode;
            h0();
            N();
        }
    }

    public float t() {
        return this.f12357e.f12382a.l().a(u());
    }

    /* access modifiers changed from: protected */
    public RectF u() {
        this.f12365m.set(getBounds());
        return this.f12365m;
    }

    public float w() {
        return this.f12357e.f12396o;
    }

    public ColorStateList x() {
        return this.f12357e.f12385d;
    }

    public float y() {
        return this.f12357e.f12392k;
    }

    public float z() {
        return this.f12357e.f12395n;
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    protected g(c cVar) {
        this.f12358f = new m.g[4];
        this.f12359g = new m.g[4];
        this.f12360h = new BitSet(8);
        this.f12362j = new Matrix();
        this.f12363k = new Path();
        this.f12364l = new Path();
        this.f12365m = new RectF();
        this.f12366n = new RectF();
        this.f12367o = new Region();
        this.f12368p = new Region();
        Paint paint = new Paint(1);
        this.f12370r = paint;
        Paint paint2 = new Paint(1);
        this.f12371s = paint2;
        this.f12372t = new h5.a();
        this.f12374v = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.f12378z = new RectF();
        this.A = true;
        this.f12357e = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        h0();
        g0(getState());
        this.f12373u = new a();
    }

    public g(k kVar) {
        this(new c(kVar, (a5.a) null));
    }
}
