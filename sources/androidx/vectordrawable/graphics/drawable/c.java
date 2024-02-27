package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.res.h;
import androidx.core.content.res.k;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class c extends e implements Animatable {

    /* renamed from: f  reason: collision with root package name */
    private C0068c f3947f;

    /* renamed from: g  reason: collision with root package name */
    private Context f3948g;

    /* renamed from: h  reason: collision with root package name */
    private ArgbEvaluator f3949h;

    /* renamed from: i  reason: collision with root package name */
    d f3950i;

    /* renamed from: j  reason: collision with root package name */
    private Animator.AnimatorListener f3951j;

    /* renamed from: k  reason: collision with root package name */
    ArrayList f3952k;

    /* renamed from: l  reason: collision with root package name */
    final Drawable.Callback f3953l;

    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f3952k);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) arrayList.get(i10)).b(c.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f3952k);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c  reason: collision with other inner class name */
    private static class C0068c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f3956a;

        /* renamed from: b  reason: collision with root package name */
        f f3957b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f3958c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList f3959d;

        /* renamed from: e  reason: collision with root package name */
        o.a f3960e;

        public C0068c(Context context, C0068c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f3956a = cVar.f3956a;
                f fVar = cVar.f3957b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    this.f3957b = (f) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    f fVar2 = (f) this.f3957b.mutate();
                    this.f3957b = fVar2;
                    fVar2.setCallback(callback);
                    this.f3957b.setBounds(cVar.f3957b.getBounds());
                    this.f3957b.g(false);
                }
                ArrayList arrayList = cVar.f3959d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3959d = new ArrayList(size);
                    this.f3960e = new o.a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) cVar.f3959d.get(i10);
                        Animator clone = animator.clone();
                        String str = (String) cVar.f3960e.get(animator);
                        clone.setTarget(this.f3957b.c(str));
                        this.f3959d.add(clone);
                        this.f3960e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f3958c == null) {
                this.f3958c = new AnimatorSet();
            }
            this.f3958c.playTogether(this.f3959d);
        }

        public int getChangingConfigurations() {
            return this.f3956a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class d extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f3961a;

        public d(Drawable.ConstantState constantState) {
            this.f3961a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3961a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3961a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f3961a.newDrawable();
            cVar.f3962e = newDrawable;
            newDrawable.setCallback(cVar.f3953l);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f3961a.newDrawable(resources);
            cVar.f3962e = newDrawable;
            newDrawable.setCallback(cVar.f3953l);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f3961a.newDrawable(resources, theme);
            cVar.f3962e = newDrawable;
            newDrawable.setCallback(cVar.f3953l);
            return cVar;
        }
    }

    c() {
        this((Context) null, (C0068c) null, (Resources) null);
    }

    public static c a(Context context, int i10) {
        c cVar = new c(context);
        Drawable e10 = h.e(context.getResources(), i10, context.getTheme());
        cVar.f3962e = e10;
        e10.setCallback(cVar.f3953l);
        cVar.f3950i = new d(cVar.f3962e.getConstantState());
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f3951j;
        if (animatorListener != null) {
            this.f3947f.f3958c.removeListener(animatorListener);
            this.f3951j = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f3947f.f3957b.c(str));
        C0068c cVar = this.f3947f;
        if (cVar.f3959d == null) {
            cVar.f3959d = new ArrayList();
            this.f3947f.f3960e = new o.a();
        }
        this.f3947f.f3959d.add(animator);
        this.f3947f.f3960e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public void b(b bVar) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
        } else if (bVar != null) {
            if (this.f3952k == null) {
                this.f3952k = new ArrayList();
            }
            if (!this.f3952k.contains(bVar)) {
                this.f3952k.add(bVar);
                if (this.f3951j == null) {
                    this.f3951j = new b();
                }
                this.f3947f.f3958c.addListener(this.f3951j);
            }
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
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
        this.f3947f.f3957b.draw(canvas);
        if (this.f3947f.f3958c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(b bVar) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f3952k;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(bVar);
        if (this.f3952k.size() == 0) {
            d();
        }
        return remove;
    }

    public int getAlpha() {
        Drawable drawable = this.f3962e;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3947f.f3957b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3962e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3947f.f3956a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3962e;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f3947f.f3957b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3962e != null) {
            return new d(this.f3962e.getConstantState());
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3962e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3947f.f3957b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3962e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3947f.f3957b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3962e;
        return drawable != null ? drawable.getOpacity() : this.f3947f.f3957b.getOpacity();
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

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3962e;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f3947f.f3957b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f3962e;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3947f.f3958c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f3962e;
        return drawable != null ? drawable.isStateful() : this.f3947f.f3957b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3947f.f3957b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f3962e;
        return drawable != null ? drawable.setLevel(i10) : this.f3947f.f3957b.setLevel(i10);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3962e;
        return drawable != null ? drawable.setState(iArr) : this.f3947f.f3957b.setState(iArr);
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f3947f.f3957b.setAlpha(i10);
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f3947f.f3957b.setAutoMirrored(z10);
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
            this.f3947f.f3957b.setTint(i10);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f3947f.f3957b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f3947f.f3957b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f3947f.f3957b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    public void start() {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f3947f.f3958c.isStarted()) {
            this.f3947f.f3958c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3947f.f3958c.end();
        }
    }

    private c(Context context) {
        this(context, (C0068c) null, (Resources) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = k.i(resources, theme, attributeSet, a.f3937e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f b10 = f.b(resources, resourceId, theme);
                        b10.g(false);
                        b10.setCallback(this.f3953l);
                        f fVar = this.f3947f.f3957b;
                        if (fVar != null) {
                            fVar.setCallback((Drawable.Callback) null);
                        }
                        this.f3947f.f3957b = b10;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, a.f3938f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3948g;
                        if (context != null) {
                            e(string, d.a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f3947f.a();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3962e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3947f.f3957b.setColorFilter(colorFilter);
        }
    }

    private c(Context context, C0068c cVar, Resources resources) {
        this.f3949h = null;
        this.f3951j = null;
        this.f3952k = null;
        a aVar = new a();
        this.f3953l = aVar;
        this.f3948g = context;
        if (cVar != null) {
            this.f3947f = cVar;
        } else {
            this.f3947f = new C0068c(context, cVar, aVar, resources);
        }
    }
}
