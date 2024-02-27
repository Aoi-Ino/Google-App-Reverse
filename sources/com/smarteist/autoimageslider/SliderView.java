package com.smarteist.autoimageslider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.m0;
import com.smarteist.autoimageslider.c;
import com.smarteist.autoimageslider.d;
import fl.f;
import fl.g;
import fl.h;
import fl.i;
import fl.j;
import fl.k;
import fl.l;
import fl.m;
import fl.n;
import fl.o;
import fl.p;
import fl.q;
import fl.r;
import fl.s;
import fl.t;
import fl.u;
import fl.v;
import xk.e;
import zk.b;

public class SliderView extends FrameLayout implements Runnable, View.OnTouchListener, d.a, c.j {

    /* renamed from: e  reason: collision with root package name */
    private final Handler f22488e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    private boolean f22489f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f22490g;

    /* renamed from: h  reason: collision with root package name */
    private int f22491h;

    /* renamed from: i  reason: collision with root package name */
    private int f22492i;

    /* renamed from: j  reason: collision with root package name */
    private sk.b f22493j;

    /* renamed from: k  reason: collision with root package name */
    private d f22494k;

    /* renamed from: l  reason: collision with root package name */
    private c f22495l;

    /* renamed from: m  reason: collision with root package name */
    private el.a f22496m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f22497n = true;

    /* renamed from: o  reason: collision with root package name */
    private boolean f22498o = true;

    /* renamed from: p  reason: collision with root package name */
    private int f22499p = -1;

    class a implements Runnable {
        a() {
        }

        public void run() {
            SliderView.this.k();
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22501a;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smarteist.autoimageslider.b[] r0 = com.smarteist.autoimageslider.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22501a = r0
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.ANTICLOCKSPINTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.CLOCK_SPINTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.CUBEINDEPTHTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.CUBEINROTATIONTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.CUBEINSCALINGTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.CUBEOUTDEPTHTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.CUBEOUTROTATIONTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.CUBEOUTSCALINGTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.DEPTHTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.FADETRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.FANTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.FIDGETSPINTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.GATETRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.HINGETRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.HORIZONTALFLIPTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.POPTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.SPINNERTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.TOSSTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.VERTICALFLIPTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.VERTICALSHUTTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f22501a     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.smarteist.autoimageslider.b r1 = com.smarteist.autoimageslider.b.ZOOMOUTTRANSFORMATION     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smarteist.autoimageslider.SliderView.b.<clinit>():void");
        }
    }

    public interface c {
    }

    public SliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupSlideView(context);
        i(context, attributeSet);
    }

    private void d() {
        if (this.f22493j == null) {
            this.f22493j = new sk.b(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 81;
            layoutParams.setMargins(20, 20, 20, 20);
            addView(this.f22493j, 1, layoutParams);
        }
        this.f22493j.setViewPager(this.f22495l);
        this.f22493j.setDynamicCount(true);
    }

    private int getAdapterItemsCount() {
        try {
            return getSliderAdapter().d();
        } catch (NullPointerException unused) {
            Log.e("Slider View : ", "getAdapterItemsCount: Slider Adapter is null so, it can't get count of items");
            return 0;
        }
    }

    private void i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.Y, 0, 0);
        boolean z10 = obtainStyledAttributes.getBoolean(a.f22509d0, true);
        int i10 = obtainStyledAttributes.getInt(a.Z, 250);
        int i11 = obtainStyledAttributes.getInt(a.f22535q0, 2);
        boolean z11 = obtainStyledAttributes.getBoolean(a.f22505b0, true);
        boolean z12 = obtainStyledAttributes.getBoolean(a.f22537r0, false);
        int i12 = obtainStyledAttributes.getInt(a.f22503a0, 0);
        setSliderAnimationDuration(i10);
        setScrollTimeInSec(i11);
        setAutoCycle(z11);
        setAutoCycleDirection(i12);
        setAutoCycle(z12);
        setIndicatorEnabled(z10);
        if (this.f22498o) {
            d();
            int i13 = a.f22523k0;
            al.b bVar = al.b.HORIZONTAL;
            if (obtainStyledAttributes.getInt(i13, bVar.ordinal()) != 0) {
                bVar = al.b.VERTICAL;
            }
            int dimension = (int) obtainStyledAttributes.getDimension(a.f22517h0, (float) dl.b.a(12));
            int dimension2 = (int) obtainStyledAttributes.getDimension(a.f22521j0, (float) dl.b.a(12));
            int dimension3 = (int) obtainStyledAttributes.getDimension(a.f22519i0, (float) dl.b.a(12));
            int dimension4 = (int) obtainStyledAttributes.getDimension(a.f22515g0, (float) dl.b.a(12));
            int i14 = obtainStyledAttributes.getInt(a.f22511e0, 81);
            int color = obtainStyledAttributes.getColor(a.f22533p0, Color.parseColor("#33ffffff"));
            int color2 = obtainStyledAttributes.getColor(a.f22531o0, Color.parseColor("#ffffff"));
            int i15 = obtainStyledAttributes.getInt(a.f22507c0, 350);
            al.d b10 = zk.a.b(obtainStyledAttributes.getInt(a.f22529n0, al.d.Off.ordinal()));
            setIndicatorOrientation(bVar);
            setIndicatorRadius((int) obtainStyledAttributes.getDimension(a.f22527m0, (float) dl.b.a(2)));
            setIndicatorPadding((int) obtainStyledAttributes.getDimension(a.f22525l0, (float) dl.b.a(3)));
            setIndicatorMargin((int) obtainStyledAttributes.getDimension(a.f22513f0, (float) dl.b.a(12)));
            f(dimension, dimension2, dimension3, dimension4);
            setIndicatorGravity(i14);
            g(dimension, dimension2, dimension3, dimension4);
            setIndicatorUnselectedColor(color);
            setIndicatorSelectedColor(color2);
            setIndicatorAnimationDuration((long) i15);
            setIndicatorRtlMode(b10);
        }
        obtainStyledAttributes.recycle();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setupSlideView(Context context) {
        c cVar = new c(context);
        this.f22495l = cVar;
        cVar.setOverScrollMode(1);
        this.f22495l.setId(m0.k());
        addView(this.f22495l, 0, new FrameLayout.LayoutParams(-1, -1));
        this.f22495l.setOnTouchListener(this);
        this.f22495l.d(this);
    }

    public void a(int i10, float f10, int i11) {
    }

    public void b(int i10) {
    }

    public void c(int i10) {
    }

    public boolean e() {
        return this.f22490g;
    }

    public void f(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22493j.getLayoutParams();
        layoutParams.setMargins(i10, i11, i12, i13);
        this.f22493j.setLayoutParams(layoutParams);
    }

    public void g(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22493j.getLayoutParams();
        layoutParams.setMargins(i10, i11, i12, i13);
        this.f22493j.setLayoutParams(layoutParams);
    }

    public int getAutoCycleDirection() {
        return this.f22491h;
    }

    public int getCurrentPagePosition() {
        if (getSliderAdapter() != null) {
            return getSliderPager().getCurrentItem();
        }
        throw new NullPointerException("Adapter not set");
    }

    public int getIndicatorRadius() {
        return this.f22493j.getRadius();
    }

    public int getIndicatorSelectedColor() {
        return this.f22493j.getSelectedColor();
    }

    public int getIndicatorUnselectedColor() {
        return this.f22493j.getUnselectedColor();
    }

    public sk.b getPagerIndicator() {
        return this.f22493j;
    }

    public int getScrollTimeInMillis() {
        return this.f22492i;
    }

    public int getScrollTimeInSec() {
        return this.f22492i / 1000;
    }

    public l1.a getSliderAdapter() {
        return this.f22494k;
    }

    public c getSliderPager() {
        return this.f22495l;
    }

    public void h(d dVar, boolean z10) {
        this.f22497n = z10;
        if (!z10) {
            this.f22494k = dVar;
            this.f22495l.setAdapter(dVar);
            return;
        }
        setSliderAdapter(dVar);
    }

    public void j() {
        c cVar;
        int i10;
        int currentItem = this.f22495l.getCurrentItem();
        int adapterItemsCount = getAdapterItemsCount();
        if (adapterItemsCount > 1) {
            if (this.f22491h == 2) {
                if (!(currentItem % (adapterItemsCount - 1) != 0 || this.f22499p == getAdapterItemsCount() - 1 || this.f22499p == 0)) {
                    this.f22489f = !this.f22489f;
                }
                if (this.f22489f) {
                    cVar = this.f22495l;
                    i10 = currentItem + 1;
                } else {
                    cVar = this.f22495l;
                    i10 = currentItem - 1;
                }
                cVar.M(i10, true);
            }
            if (this.f22491h == 1) {
                this.f22495l.M(currentItem - 1, true);
            }
            if (this.f22491h == 0) {
                this.f22495l.M(currentItem + 1, true);
            }
        }
        this.f22499p = currentItem;
    }

    public void k() {
        this.f22488e.removeCallbacks(this);
        this.f22488e.postDelayed(this, (long) this.f22492i);
    }

    public void l() {
        this.f22488e.removeCallbacks(this);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!e()) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            l();
            return false;
        } else if (motionEvent.getAction() != 1) {
            return false;
        } else {
            this.f22488e.postDelayed(new a(), 2000);
            return false;
        }
    }

    public void run() {
        try {
            j();
        } finally {
            if (this.f22490g) {
                this.f22488e.postDelayed(this, (long) this.f22492i);
            }
        }
    }

    public void setAutoCycle(boolean z10) {
        this.f22490g = z10;
    }

    public void setAutoCycleDirection(int i10) {
        this.f22491h = i10;
    }

    public void setCurrentPageListener(c cVar) {
    }

    public void setCurrentPagePosition(int i10) {
        this.f22495l.M(i10, true);
    }

    public void setCustomSliderTransformAnimation(c.l lVar) {
        this.f22495l.P(false, lVar);
    }

    public void setIndicatorAnimation(e eVar) {
        this.f22493j.setAnimationType(eVar);
    }

    public void setIndicatorAnimationDuration(long j10) {
        this.f22493j.setAnimationDuration(j10);
    }

    public void setIndicatorEnabled(boolean z10) {
        this.f22498o = z10;
        if (this.f22493j == null && z10) {
            d();
        }
    }

    public void setIndicatorGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22493j.getLayoutParams();
        layoutParams.gravity = i10;
        this.f22493j.setLayoutParams(layoutParams);
    }

    public void setIndicatorMargin(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22493j.getLayoutParams();
        layoutParams.setMargins(i10, i10, i10, i10);
        this.f22493j.setLayoutParams(layoutParams);
    }

    public void setIndicatorOrientation(al.b bVar) {
        this.f22493j.setOrientation(bVar);
    }

    public void setIndicatorPadding(int i10) {
        this.f22493j.setPadding(i10);
    }

    public void setIndicatorRadius(int i10) {
        this.f22493j.setRadius(i10);
    }

    public void setIndicatorRtlMode(al.d dVar) {
        this.f22493j.setRtlMode(dVar);
    }

    public void setIndicatorSelectedColor(int i10) {
        this.f22493j.setSelectedColor(i10);
    }

    public void setIndicatorUnselectedColor(int i10) {
        this.f22493j.setUnselectedColor(i10);
    }

    public void setIndicatorVisibility(boolean z10) {
        sk.b bVar;
        int i10;
        if (z10) {
            bVar = this.f22493j;
            i10 = 0;
        } else {
            bVar = this.f22493j;
            i10 = 8;
        }
        bVar.setVisibility(i10);
    }

    public void setInfiniteAdapterEnabled(boolean z10) {
        d dVar = this.f22494k;
        if (dVar != null) {
            h(dVar, z10);
        }
    }

    public void setOffscreenPageLimit(int i10) {
        this.f22495l.setOffscreenPageLimit(i10);
    }

    public void setOnIndicatorClickListener(b.C0389b bVar) {
        this.f22493j.setClickListener(bVar);
    }

    public void setPageIndicatorView(sk.b bVar) {
        this.f22493j = bVar;
        d();
    }

    public void setScrollTimeInMillis(int i10) {
        this.f22492i = i10;
    }

    public void setScrollTimeInSec(int i10) {
        this.f22492i = i10 * 1000;
    }

    public void setSliderAdapter(d dVar) {
        this.f22494k = dVar;
        el.a aVar = new el.a(dVar);
        this.f22496m = aVar;
        this.f22495l.setAdapter(aVar);
        this.f22494k.r(this);
        setCurrentPagePosition(0);
    }

    public void setSliderAnimationDuration(int i10) {
        this.f22495l.setScrollDuration(i10);
    }

    public void setSliderTransformAnimation(b bVar) {
        c cVar;
        c.l aVar;
        switch (b.f22501a[bVar.ordinal()]) {
            case 1:
                cVar = this.f22495l;
                aVar = new fl.a();
                break;
            case 2:
                cVar = this.f22495l;
                aVar = new fl.b();
                break;
            case 3:
                cVar = this.f22495l;
                aVar = new fl.c();
                break;
            case 4:
                cVar = this.f22495l;
                aVar = new fl.d();
                break;
            case 5:
                cVar = this.f22495l;
                aVar = new fl.e();
                break;
            case 6:
                cVar = this.f22495l;
                aVar = new f();
                break;
            case 7:
                cVar = this.f22495l;
                aVar = new g();
                break;
            case 8:
                cVar = this.f22495l;
                aVar = new h();
                break;
            case 9:
                cVar = this.f22495l;
                aVar = new i();
                break;
            case 10:
                cVar = this.f22495l;
                aVar = new j();
                break;
            case 11:
                cVar = this.f22495l;
                aVar = new k();
                break;
            case 12:
                cVar = this.f22495l;
                aVar = new l();
                break;
            case 13:
                cVar = this.f22495l;
                aVar = new m();
                break;
            case 14:
                cVar = this.f22495l;
                aVar = new n();
                break;
            case 15:
                cVar = this.f22495l;
                aVar = new o();
                break;
            case 16:
                cVar = this.f22495l;
                aVar = new p();
                break;
            case 17:
                cVar = this.f22495l;
                aVar = new r();
                break;
            case 18:
                cVar = this.f22495l;
                aVar = new s();
                break;
            case 19:
                cVar = this.f22495l;
                aVar = new t();
                break;
            case 20:
                cVar = this.f22495l;
                aVar = new u();
                break;
            case 21:
                cVar = this.f22495l;
                aVar = new v();
                break;
            default:
                cVar = this.f22495l;
                aVar = new q();
                break;
        }
        cVar.P(false, aVar);
    }
}
