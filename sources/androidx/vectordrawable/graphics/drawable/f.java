package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.core.graphics.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class f extends e {

    /* renamed from: o  reason: collision with root package name */
    static final PorterDuff.Mode f3963o = PorterDuff.Mode.SRC_IN;

    /* renamed from: f  reason: collision with root package name */
    private h f3964f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuffColorFilter f3965g;

    /* renamed from: h  reason: collision with root package name */
    private ColorFilter f3966h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3967i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3968j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable.ConstantState f3969k;

    /* renamed from: l  reason: collision with root package name */
    private final float[] f3970l;

    /* renamed from: m  reason: collision with root package name */
    private final Matrix f3971m;

    /* renamed from: n  reason: collision with root package name */
    private final Rect f3972n;

    private static class b extends C0069f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3999b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3998a = androidx.core.graphics.h.d(string2);
            }
            this.f4000c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.h(xmlPullParser, "pathData")) {
                TypedArray i10 = k.i(resources, theme, attributeSet, a.f3936d);
                f(i10, xmlPullParser);
                i10.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static class c extends C0069f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f3973e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.res.d f3974f;

        /* renamed from: g  reason: collision with root package name */
        float f3975g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.res.d f3976h;

        /* renamed from: i  reason: collision with root package name */
        float f3977i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        float f3978j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f3979k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        float f3980l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        float f3981m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f3982n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f3983o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        float f3984p = 4.0f;

        c() {
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3973e = null;
            if (k.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3999b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f3998a = androidx.core.graphics.h.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f3976h = k.e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f3978j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f3978j);
                this.f3982n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f3982n);
                this.f3983o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f3983o);
                this.f3984p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3984p);
                this.f3974f = k.e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f3977i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3977i);
                this.f3975g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f3975g);
                this.f3980l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3980l);
                this.f3981m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3981m);
                this.f3979k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f3979k);
                this.f4000c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f4000c);
            }
        }

        public boolean a() {
            return this.f3976h.i() || this.f3974f.i();
        }

        public boolean b(int[] iArr) {
            return this.f3974f.j(iArr) | this.f3976h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray i10 = k.i(resources, theme, attributeSet, a.f3935c);
            h(i10, xmlPullParser, theme);
            i10.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f3978j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f3976h.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f3977i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f3974f.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f3975g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f3980l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f3981m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f3979k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f10) {
            this.f3978j = f10;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i10) {
            this.f3976h.k(i10);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f10) {
            this.f3977i = f10;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i10) {
            this.f3974f.k(i10);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f10) {
            this.f3975g = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f10) {
            this.f3980l = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f10) {
            this.f3981m = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f10) {
            this.f3979k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f3973e = cVar.f3973e;
            this.f3974f = cVar.f3974f;
            this.f3975g = cVar.f3975g;
            this.f3977i = cVar.f3977i;
            this.f3976h = cVar.f3976h;
            this.f4000c = cVar.f4000c;
            this.f3978j = cVar.f3978j;
            this.f3979k = cVar.f3979k;
            this.f3980l = cVar.f3980l;
            this.f3981m = cVar.f3981m;
            this.f3982n = cVar.f3982n;
            this.f3983o = cVar.f3983o;
            this.f3984p = cVar.f3984p;
        }
    }

    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f3985a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList f3986b;

        /* renamed from: c  reason: collision with root package name */
        float f3987c;

        /* renamed from: d  reason: collision with root package name */
        private float f3988d;

        /* renamed from: e  reason: collision with root package name */
        private float f3989e;

        /* renamed from: f  reason: collision with root package name */
        private float f3990f;

        /* renamed from: g  reason: collision with root package name */
        private float f3991g;

        /* renamed from: h  reason: collision with root package name */
        private float f3992h;

        /* renamed from: i  reason: collision with root package name */
        private float f3993i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f3994j;

        /* renamed from: k  reason: collision with root package name */
        int f3995k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f3996l;

        /* renamed from: m  reason: collision with root package name */
        private String f3997m;

        public d() {
            super();
            this.f3985a = new Matrix();
            this.f3986b = new ArrayList();
            this.f3987c = 0.0f;
            this.f3988d = 0.0f;
            this.f3989e = 0.0f;
            this.f3990f = 1.0f;
            this.f3991g = 1.0f;
            this.f3992h = 0.0f;
            this.f3993i = 0.0f;
            this.f3994j = new Matrix();
            this.f3997m = null;
        }

        private void d() {
            this.f3994j.reset();
            this.f3994j.postTranslate(-this.f3988d, -this.f3989e);
            this.f3994j.postScale(this.f3990f, this.f3991g);
            this.f3994j.postRotate(this.f3987c, 0.0f, 0.0f);
            this.f3994j.postTranslate(this.f3992h + this.f3988d, this.f3993i + this.f3989e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3996l = null;
            this.f3987c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f3987c);
            this.f3988d = typedArray.getFloat(1, this.f3988d);
            this.f3989e = typedArray.getFloat(2, this.f3989e);
            this.f3990f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f3990f);
            this.f3991g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f3991g);
            this.f3992h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f3992h);
            this.f3993i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f3993i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3997m = string;
            }
            d();
        }

        public boolean a() {
            for (int i10 = 0; i10 < this.f3986b.size(); i10++) {
                if (((e) this.f3986b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f3986b.size(); i10++) {
                z10 |= ((e) this.f3986b.get(i10)).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray i10 = k.i(resources, theme, attributeSet, a.f3934b);
            e(i10, xmlPullParser);
            i10.recycle();
        }

        public String getGroupName() {
            return this.f3997m;
        }

        public Matrix getLocalMatrix() {
            return this.f3994j;
        }

        public float getPivotX() {
            return this.f3988d;
        }

        public float getPivotY() {
            return this.f3989e;
        }

        public float getRotation() {
            return this.f3987c;
        }

        public float getScaleX() {
            return this.f3990f;
        }

        public float getScaleY() {
            return this.f3991g;
        }

        public float getTranslateX() {
            return this.f3992h;
        }

        public float getTranslateY() {
            return this.f3993i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f3988d) {
                this.f3988d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f3989e) {
                this.f3989e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f3987c) {
                this.f3987c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f3990f) {
                this.f3990f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f3991g) {
                this.f3991g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f3992h) {
                this.f3992h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f3993i) {
                this.f3993i = f10;
                d();
            }
        }

        public d(d dVar, o.a aVar) {
            super();
            C0069f fVar;
            this.f3985a = new Matrix();
            this.f3986b = new ArrayList();
            this.f3987c = 0.0f;
            this.f3988d = 0.0f;
            this.f3989e = 0.0f;
            this.f3990f = 1.0f;
            this.f3991g = 1.0f;
            this.f3992h = 0.0f;
            this.f3993i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3994j = matrix;
            this.f3997m = null;
            this.f3987c = dVar.f3987c;
            this.f3988d = dVar.f3988d;
            this.f3989e = dVar.f3989e;
            this.f3990f = dVar.f3990f;
            this.f3991g = dVar.f3991g;
            this.f3992h = dVar.f3992h;
            this.f3993i = dVar.f3993i;
            this.f3996l = dVar.f3996l;
            String str = dVar.f3997m;
            this.f3997m = str;
            this.f3995k = dVar.f3995k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f3994j);
            ArrayList arrayList = dVar.f3986b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f3986b.add(new d((d) obj, aVar));
                } else {
                    if (obj instanceof c) {
                        fVar = new c((c) obj);
                    } else if (obj instanceof b) {
                        fVar = new b((b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f3986b.add(fVar);
                    String str2 = fVar.f3999b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$f  reason: collision with other inner class name */
    private static abstract class C0069f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected h.b[] f3998a = null;

        /* renamed from: b  reason: collision with root package name */
        String f3999b;

        /* renamed from: c  reason: collision with root package name */
        int f4000c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f4001d;

        public C0069f() {
            super();
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            h.b[] bVarArr = this.f3998a;
            if (bVarArr != null) {
                h.b.d(bVarArr, path);
            }
        }

        public h.b[] getPathData() {
            return this.f3998a;
        }

        public String getPathName() {
            return this.f3999b;
        }

        public void setPathData(h.b[] bVarArr) {
            if (!androidx.core.graphics.h.b(this.f3998a, bVarArr)) {
                this.f3998a = androidx.core.graphics.h.f(bVarArr);
            } else {
                androidx.core.graphics.h.j(this.f3998a, bVarArr);
            }
        }

        public C0069f(C0069f fVar) {
            super();
            this.f3999b = fVar.f3999b;
            this.f4001d = fVar.f4001d;
            this.f3998a = androidx.core.graphics.h.f(fVar.f3998a);
        }
    }

    private static class g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f4002q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f4003a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f4004b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f4005c;

        /* renamed from: d  reason: collision with root package name */
        Paint f4006d;

        /* renamed from: e  reason: collision with root package name */
        Paint f4007e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f4008f;

        /* renamed from: g  reason: collision with root package name */
        private int f4009g;

        /* renamed from: h  reason: collision with root package name */
        final d f4010h;

        /* renamed from: i  reason: collision with root package name */
        float f4011i;

        /* renamed from: j  reason: collision with root package name */
        float f4012j;

        /* renamed from: k  reason: collision with root package name */
        float f4013k;

        /* renamed from: l  reason: collision with root package name */
        float f4014l;

        /* renamed from: m  reason: collision with root package name */
        int f4015m;

        /* renamed from: n  reason: collision with root package name */
        String f4016n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f4017o;

        /* renamed from: p  reason: collision with root package name */
        final o.a f4018p;

        public g() {
            this.f4005c = new Matrix();
            this.f4011i = 0.0f;
            this.f4012j = 0.0f;
            this.f4013k = 0.0f;
            this.f4014l = 0.0f;
            this.f4015m = 255;
            this.f4016n = null;
            this.f4017o = null;
            this.f4018p = new o.a();
            this.f4010h = new d();
            this.f4003a = new Path();
            this.f4004b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f3985a.set(matrix);
            dVar.f3985a.preConcat(dVar.f3994j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f3986b.size(); i12++) {
                e eVar = (e) dVar.f3986b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f3985a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof C0069f) {
                    d(dVar, (C0069f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, C0069f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = ((float) i10) / this.f4013k;
            float f11 = ((float) i11) / this.f4014l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f3985a;
            this.f4005c.set(matrix);
            this.f4005c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 != 0.0f) {
                fVar.d(this.f4003a);
                Path path = this.f4003a;
                this.f4004b.reset();
                if (fVar.c()) {
                    this.f4004b.setFillType(fVar.f4000c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f4004b.addPath(path, this.f4005c);
                    canvas.clipPath(this.f4004b);
                    return;
                }
                c cVar = (c) fVar;
                float f12 = cVar.f3979k;
                if (!(f12 == 0.0f && cVar.f3980l == 1.0f)) {
                    float f13 = cVar.f3981m;
                    float f14 = (f12 + f13) % 1.0f;
                    float f15 = (cVar.f3980l + f13) % 1.0f;
                    if (this.f4008f == null) {
                        this.f4008f = new PathMeasure();
                    }
                    this.f4008f.setPath(this.f4003a, false);
                    float length = this.f4008f.getLength();
                    float f16 = f14 * length;
                    float f17 = f15 * length;
                    path.reset();
                    if (f16 > f17) {
                        this.f4008f.getSegment(f16, length, path, true);
                        this.f4008f.getSegment(0.0f, f17, path, true);
                    } else {
                        this.f4008f.getSegment(f16, f17, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f4004b.addPath(path, this.f4005c);
                if (cVar.f3976h.l()) {
                    androidx.core.content.res.d dVar2 = cVar.f3976h;
                    if (this.f4007e == null) {
                        Paint paint = new Paint(1);
                        this.f4007e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f4007e;
                    if (dVar2.h()) {
                        Shader f18 = dVar2.f();
                        f18.setLocalMatrix(this.f4005c);
                        paint2.setShader(f18);
                        paint2.setAlpha(Math.round(cVar.f3978j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(f.a(dVar2.e(), cVar.f3978j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f4004b.setFillType(cVar.f4000c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f4004b, paint2);
                }
                if (cVar.f3974f.l()) {
                    androidx.core.content.res.d dVar3 = cVar.f3974f;
                    if (this.f4006d == null) {
                        Paint paint3 = new Paint(1);
                        this.f4006d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f4006d;
                    Paint.Join join = cVar.f3983o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f3982n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f3984p);
                    if (dVar3.h()) {
                        Shader f19 = dVar3.f();
                        f19.setLocalMatrix(this.f4005c);
                        paint4.setShader(f19);
                        paint4.setAlpha(Math.round(cVar.f3977i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(f.a(dVar3.e(), cVar.f3977i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f3975g * min * e10);
                    canvas.drawPath(this.f4004b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f4010h, f4002q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f4017o == null) {
                this.f4017o = Boolean.valueOf(this.f4010h.a());
            }
            return this.f4017o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f4010h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4015m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f4015m = i10;
        }

        public g(g gVar) {
            this.f4005c = new Matrix();
            this.f4011i = 0.0f;
            this.f4012j = 0.0f;
            this.f4013k = 0.0f;
            this.f4014l = 0.0f;
            this.f4015m = 255;
            this.f4016n = null;
            this.f4017o = null;
            o.a aVar = new o.a();
            this.f4018p = aVar;
            this.f4010h = new d(gVar.f4010h, aVar);
            this.f4003a = new Path(gVar.f4003a);
            this.f4004b = new Path(gVar.f4004b);
            this.f4011i = gVar.f4011i;
            this.f4012j = gVar.f4012j;
            this.f4013k = gVar.f4013k;
            this.f4014l = gVar.f4014l;
            this.f4009g = gVar.f4009g;
            this.f4015m = gVar.f4015m;
            this.f4016n = gVar.f4016n;
            String str = gVar.f4016n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4017o = gVar.f4017o;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f4019a;

        /* renamed from: b  reason: collision with root package name */
        g f4020b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f4021c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f4022d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4023e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f4024f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f4025g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f4026h;

        /* renamed from: i  reason: collision with root package name */
        int f4027i;

        /* renamed from: j  reason: collision with root package name */
        boolean f4028j;

        /* renamed from: k  reason: collision with root package name */
        boolean f4029k;

        /* renamed from: l  reason: collision with root package name */
        Paint f4030l;

        public h() {
            this.f4021c = null;
            this.f4022d = f.f3963o;
            this.f4020b = new g();
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f4024f.getWidth() && i11 == this.f4024f.getHeight();
        }

        public boolean b() {
            return !this.f4029k && this.f4025g == this.f4021c && this.f4026h == this.f4022d && this.f4028j == this.f4023e && this.f4027i == this.f4020b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f4024f == null || !a(i10, i11)) {
                this.f4024f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f4029k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4024f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f4030l == null) {
                Paint paint = new Paint();
                this.f4030l = paint;
                paint.setFilterBitmap(true);
            }
            this.f4030l.setAlpha(this.f4020b.getRootAlpha());
            this.f4030l.setColorFilter(colorFilter);
            return this.f4030l;
        }

        public boolean f() {
            return this.f4020b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f4020b.f();
        }

        public int getChangingConfigurations() {
            return this.f4019a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f4020b.g(iArr);
            this.f4029k |= g10;
            return g10;
        }

        public void i() {
            this.f4025g = this.f4021c;
            this.f4026h = this.f4022d;
            this.f4027i = this.f4020b.getRootAlpha();
            this.f4028j = this.f4023e;
            this.f4029k = false;
        }

        public void j(int i10, int i11) {
            this.f4024f.eraseColor(0);
            this.f4020b.b(new Canvas(this.f4024f), i10, i11, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new f(this);
        }

        public h(h hVar) {
            this.f4021c = null;
            this.f4022d = f.f3963o;
            if (hVar != null) {
                this.f4019a = hVar.f4019a;
                g gVar = new g(hVar.f4020b);
                this.f4020b = gVar;
                if (hVar.f4020b.f4007e != null) {
                    gVar.f4007e = new Paint(hVar.f4020b.f4007e);
                }
                if (hVar.f4020b.f4006d != null) {
                    this.f4020b.f4006d = new Paint(hVar.f4020b.f4006d);
                }
                this.f4021c = hVar.f4021c;
                this.f4022d = hVar.f4022d;
                this.f4023e = hVar.f4023e;
            }
        }

        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f4031a;

        public i(Drawable.ConstantState constantState) {
            this.f4031a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4031a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4031a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f3962e = (VectorDrawable) this.f4031a.newDrawable();
            return fVar;
        }

        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f3962e = (VectorDrawable) this.f4031a.newDrawable(resources);
            return fVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f3962e = (VectorDrawable) this.f4031a.newDrawable(resources, theme);
            return fVar;
        }
    }

    f() {
        this.f3968j = true;
        this.f3970l = new float[9];
        this.f3971m = new Matrix();
        this.f3972n = new Rect();
        this.f3964f = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (((float) Color.alpha(i10)) * f10)) << 24);
    }

    public static f b(Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f3962e = androidx.core.content.res.h.e(resources, i10, theme);
        fVar.f3969k = new i(fVar.f3962e.getConstantState());
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i10;
        int i11;
        h hVar = this.f3964f;
        g gVar = hVar.f4020b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f4010h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3986b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f4018p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f4019a = cVar.f4001d | hVar.f4019a;
                    z10 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        b bVar = new b();
                        bVar.e(resources, attributeSet, theme, xmlPullParser);
                        dVar.f3986b.add(bVar);
                        if (bVar.getPathName() != null) {
                            gVar.f4018p.put(bVar.getPathName(), bVar);
                        }
                        i10 = hVar.f4019a;
                        i11 = bVar.f4001d;
                    } else if ("group".equals(name)) {
                        d dVar2 = new d();
                        dVar2.c(resources, attributeSet, theme, xmlPullParser);
                        dVar.f3986b.add(dVar2);
                        arrayDeque.push(dVar2);
                        if (dVar2.getGroupName() != null) {
                            gVar.f4018p.put(dVar2.getGroupName(), dVar2);
                        }
                        i10 = hVar.f4019a;
                        i11 = dVar2.f3995k;
                    }
                    hVar.f4019a = i11 | i10;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f3964f;
        g gVar = hVar.f4020b;
        hVar.f4022d = f(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            hVar.f4021c = c10;
        }
        hVar.f4023e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f4023e);
        gVar.f4013k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f4013k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f4014l);
        gVar.f4014l = f10;
        if (gVar.f4013k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 > 0.0f) {
            gVar.f4011i = typedArray.getDimension(3, gVar.f4011i);
            float dimension = typedArray.getDimension(2, gVar.f4012j);
            gVar.f4012j = dimension;
            if (gVar.f4011i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f4016n = string;
                    gVar.f4018p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* access modifiers changed from: package-private */
    public Object c(String str) {
        return this.f3964f.f4020b.f4018p.get(str);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3962e;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3972n);
        if (this.f3972n.width() > 0 && this.f3972n.height() > 0) {
            ColorFilter colorFilter = this.f3966h;
            if (colorFilter == null) {
                colorFilter = this.f3965g;
            }
            canvas.getMatrix(this.f3971m);
            this.f3971m.getValues(this.f3970l);
            float abs = Math.abs(this.f3970l[0]);
            float abs2 = Math.abs(this.f3970l[4]);
            float abs3 = Math.abs(this.f3970l[1]);
            float abs4 = Math.abs(this.f3970l[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f3972n.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f3972n.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f3972n;
                canvas.translate((float) rect.left, (float) rect.top);
                if (e()) {
                    canvas.translate((float) this.f3972n.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f3972n.offsetTo(0, 0);
                this.f3964f.c(min, min2);
                if (!this.f3968j) {
                    this.f3964f.j(min, min2);
                } else if (!this.f3964f.b()) {
                    this.f3964f.j(min, min2);
                    this.f3964f.i();
                }
                this.f3964f.d(canvas, colorFilter, this.f3972n);
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z10) {
        this.f3968j = z10;
    }

    public int getAlpha() {
        Drawable drawable = this.f3962e;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3964f.f4020b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3962e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3964f.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3962e;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f3966h;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3962e != null) {
            return new i(this.f3962e.getConstantState());
        }
        this.f3964f.f4019a = getChangingConfigurations();
        return this.f3964f;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3962e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3964f.f4020b.f4012j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3962e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3964f.f4020b.f4011i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3962e;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f3964f.f4023e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f3964f.f4021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f3964f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3962e
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.f$h r0 = r1.f3964f
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.f$h r0 = r1.f3964f
            android.content.res.ColorStateList r0 = r0.f4021c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.f.isStateful():boolean");
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3967i && super.mutate() == this) {
            this.f3964f = new h(this.f3964f);
            this.f3967i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f3964f;
        ColorStateList colorStateList = hVar.f4021c;
        if (colorStateList == null || (mode = hVar.f4022d) == null) {
            z10 = false;
        } else {
            this.f3965g = i(this.f3965g, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f3964f.f4020b.getRootAlpha() != i10) {
            this.f3964f.f4020b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f3964f.f4023e = z10;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i10) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f3964f;
        if (hVar.f4021c != colorStateList) {
            hVar.f4021c = colorStateList;
            this.f3965g = i(this.f3965g, colorStateList, hVar.f4022d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.f3964f;
        if (hVar.f4022d != mode) {
            hVar.f4022d = mode;
            this.f3965g = i(this.f3965g, hVar.f4021c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f3962e;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    f(h hVar) {
        this.f3968j = true;
        this.f3970l = new float[9];
        this.f3971m = new Matrix();
        this.f3972n = new Rect();
        this.f3964f = hVar;
        this.f3965g = i(this.f3965g, hVar.f4021c, hVar.f4022d);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f3964f;
        hVar.f4020b = new g();
        TypedArray i10 = k.i(resources, theme, attributeSet, a.f3933a);
        h(i10, xmlPullParser, theme);
        i10.recycle();
        hVar.f4019a = getChangingConfigurations();
        hVar.f4029k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f3965g = i(this.f3965g, hVar.f4021c, hVar.f4022d);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f3966h = colorFilter;
        invalidateSelf();
    }
}
