package zk;

import android.graphics.Canvas;
import android.view.MotionEvent;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private vk.a f33221a;

    /* renamed from: b  reason: collision with root package name */
    private bl.a f33222b;

    /* renamed from: c  reason: collision with root package name */
    private al.a f33223c;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33224a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                xk.e[] r0 = xk.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33224a = r0
                xk.e r1 = xk.e.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33224a     // Catch:{ NoSuchFieldError -> 0x001d }
                xk.e r1 = xk.e.COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33224a     // Catch:{ NoSuchFieldError -> 0x0028 }
                xk.e r1 = xk.e.SCALE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33224a     // Catch:{ NoSuchFieldError -> 0x0033 }
                xk.e r1 = xk.e.WORM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33224a     // Catch:{ NoSuchFieldError -> 0x003e }
                xk.e r1 = xk.e.SLIDE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33224a     // Catch:{ NoSuchFieldError -> 0x0049 }
                xk.e r1 = xk.e.FILL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f33224a     // Catch:{ NoSuchFieldError -> 0x0054 }
                xk.e r1 = xk.e.THIN_WORM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f33224a     // Catch:{ NoSuchFieldError -> 0x0060 }
                xk.e r1 = xk.e.DROP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f33224a     // Catch:{ NoSuchFieldError -> 0x006c }
                xk.e r1 = xk.e.SWAP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f33224a     // Catch:{ NoSuchFieldError -> 0x0078 }
                xk.e r1 = xk.e.SCALE_DOWN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zk.b.a.<clinit>():void");
        }
    }

    /* renamed from: zk.b$b  reason: collision with other inner class name */
    public interface C0389b {
    }

    public b(al.a aVar) {
        this.f33223c = aVar;
        this.f33222b = new bl.a(aVar);
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        boolean v10 = this.f33223c.v();
        int o10 = this.f33223c.o();
        int p10 = this.f33223c.p();
        boolean z10 = false;
        boolean z11 = !v10 && (i10 == o10 || i10 == this.f33223c.d());
        if (v10 && (i10 == o10 || i10 == p10)) {
            z10 = true;
        }
        boolean z12 = z11 | z10;
        this.f33222b.k(i10, i11, i12);
        if (this.f33221a == null || !z12) {
            this.f33222b.a(canvas, z12);
        } else {
            c(canvas);
        }
    }

    private void c(Canvas canvas) {
        switch (a.f33224a[this.f33223c.b().ordinal()]) {
            case 1:
                this.f33222b.a(canvas, true);
                return;
            case 2:
                this.f33222b.b(canvas, this.f33221a);
                return;
            case 3:
                this.f33222b.e(canvas, this.f33221a);
                return;
            case 4:
                this.f33222b.j(canvas, this.f33221a);
                return;
            case 5:
                this.f33222b.g(canvas, this.f33221a);
                return;
            case 6:
                this.f33222b.d(canvas, this.f33221a);
                return;
            case 7:
                this.f33222b.i(canvas, this.f33221a);
                return;
            case 8:
                this.f33222b.c(canvas, this.f33221a);
                return;
            case 9:
                this.f33222b.h(canvas, this.f33221a);
                return;
            case 10:
                this.f33222b.f(canvas, this.f33221a);
                return;
            default:
                return;
        }
    }

    private void d(float f10, float f11) {
    }

    public void a(Canvas canvas) {
        int c10 = this.f33223c.c();
        for (int i10 = 0; i10 < c10; i10++) {
            b(canvas, i10, dl.a.e(this.f33223c, i10), dl.a.f(this.f33223c, i10));
        }
    }

    public void e(C0389b bVar) {
    }

    public void f(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            d(motionEvent.getX(), motionEvent.getY());
        }
    }

    public void g(vk.a aVar) {
        this.f33221a = aVar;
    }
}
