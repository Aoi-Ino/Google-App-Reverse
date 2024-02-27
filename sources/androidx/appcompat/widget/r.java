package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.b;

class r {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1526c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    private final ProgressBar f1527a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f1528b;

    private static class a {
        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i10) {
            layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
            layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
            layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
            layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
            layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
            layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
            layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
            layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
            layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
        }
    }

    r(ProgressBar progressBar) {
        this.f1527a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i10 = 0; i10 < numberOfFrames; i10++) {
            Drawable d10 = d(animationDrawable.getFrame(i10), true);
            d10.setLevel(10000);
            animationDrawable2.addFrame(d10, animationDrawable.getDuration(i10));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* access modifiers changed from: package-private */
    public Bitmap b() {
        return this.f1528b;
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        v0 v10 = v0.v(this.f1527a.getContext(), attributeSet, f1526c, i10, 0);
        Drawable h10 = v10.h(0);
        if (h10 != null) {
            this.f1527a.setIndeterminateDrawable(e(h10));
        }
        Drawable h11 = v10.h(1);
        if (h11 != null) {
            this.f1527a.setProgressDrawable(d(h11, false));
        }
        v10.w();
    }

    /* access modifiers changed from: package-private */
    public Drawable d(Drawable drawable, boolean z10) {
        if (drawable instanceof b) {
            b bVar = (b) drawable;
            Drawable b10 = bVar.b();
            if (b10 != null) {
                bVar.a(d(b10, z10));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                int id2 = layerDrawable.getId(i10);
                drawableArr[i10] = d(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                layerDrawable2.setId(i11, layerDrawable.getId(i11));
                a.a(layerDrawable, layerDrawable2, i11);
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1528b == null) {
                this.f1528b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
