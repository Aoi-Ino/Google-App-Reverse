package qk;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.pdfview.subsamplincscaleimageview.decoder.SkiaImageDecoder;
import com.pdfview.subsamplincscaleimageview.decoder.SkiaImageRegionDecoder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class c extends View {
    private static final List A0 = Arrays.asList(new Integer[]{0, 90, 180, 270, -1});
    private static final List B0 = Arrays.asList(new Integer[]{1, 2, 3});
    /* access modifiers changed from: private */
    public static final List C0 = Arrays.asList(new Integer[]{2, 1});
    private static final List D0 = Arrays.asList(new Integer[]{1, 2, 3});
    private static final List E0 = Arrays.asList(new Integer[]{2, 1, 3, 4});
    private static Bitmap.Config F0 = null;
    /* access modifiers changed from: private */

    /* renamed from: z0  reason: collision with root package name */
    public static final String f30650z0 = "c";
    private int A = 1;
    private int B = 500;
    /* access modifiers changed from: private */
    public float C;
    /* access modifiers changed from: private */
    public float D;
    /* access modifiers changed from: private */
    public PointF E;
    /* access modifiers changed from: private */
    public PointF F;
    private PointF G;
    private Float H;
    private PointF I;
    private PointF J;
    private int K;
    private int L;
    private int M;
    /* access modifiers changed from: private */
    public Rect N;
    private Rect O;
    /* access modifiers changed from: private */
    public boolean P;
    private boolean Q;
    /* access modifiers changed from: private */
    public boolean R;
    /* access modifiers changed from: private */
    public int S;
    private GestureDetector T;
    private GestureDetector U;
    private rk.d V;
    /* access modifiers changed from: private */
    public final ReadWriteLock W = new ReentrantReadWriteLock(true);

    /* renamed from: a0  reason: collision with root package name */
    private rk.b f30651a0 = new rk.a(SkiaImageDecoder.class);

    /* renamed from: b0  reason: collision with root package name */
    private rk.b f30652b0 = new rk.a(SkiaImageRegionDecoder.class);
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public PointF f30653c0;

    /* renamed from: d0  reason: collision with root package name */
    private float f30654d0;

    /* renamed from: e  reason: collision with root package name */
    private Bitmap f30655e;

    /* renamed from: e0  reason: collision with root package name */
    private final float f30656e0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f30657f;
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public float f30658f0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f30659g;
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public boolean f30660g0;

    /* renamed from: h  reason: collision with root package name */
    private Uri f30661h;
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public PointF f30662h0;

    /* renamed from: i  reason: collision with root package name */
    private int f30663i;
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public PointF f30664i0;

    /* renamed from: j  reason: collision with root package name */
    private boolean f30665j = true;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public PointF f30666j0;

    /* renamed from: k  reason: collision with root package name */
    private Map f30667k;
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public d f30668k0;

    /* renamed from: l  reason: collision with root package name */
    private boolean f30669l;
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public boolean f30670l0;

    /* renamed from: m  reason: collision with root package name */
    private int f30671m = 0;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f30672m0;

    /* renamed from: n  reason: collision with root package name */
    private float f30673n = 2.0f;
    /* access modifiers changed from: private */

    /* renamed from: n0  reason: collision with root package name */
    public View.OnLongClickListener f30674n0;

    /* renamed from: o  reason: collision with root package name */
    private float f30675o = m0();

    /* renamed from: o0  reason: collision with root package name */
    private final Handler f30676o0;

    /* renamed from: p  reason: collision with root package name */
    private int f30677p = -1;

    /* renamed from: p0  reason: collision with root package name */
    private Paint f30678p0;

    /* renamed from: q  reason: collision with root package name */
    private int f30679q = 1;

    /* renamed from: q0  reason: collision with root package name */
    private Paint f30680q0;

    /* renamed from: r  reason: collision with root package name */
    private int f30681r = 1;

    /* renamed from: r0  reason: collision with root package name */
    private Paint f30682r0;

    /* renamed from: s  reason: collision with root package name */
    private int f30683s = Integer.MAX_VALUE;

    /* renamed from: s0  reason: collision with root package name */
    private Paint f30684s0;

    /* renamed from: t  reason: collision with root package name */
    private int f30685t = Integer.MAX_VALUE;

    /* renamed from: t0  reason: collision with root package name */
    private j f30686t0;

    /* renamed from: u  reason: collision with root package name */
    private Executor f30687u = AsyncTask.THREAD_POOL_EXECUTOR;

    /* renamed from: u0  reason: collision with root package name */
    private Matrix f30688u0;

    /* renamed from: v  reason: collision with root package name */
    private boolean f30689v = true;

    /* renamed from: v0  reason: collision with root package name */
    private RectF f30690v0;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f30691w = true;

    /* renamed from: w0  reason: collision with root package name */
    private final float[] f30692w0 = new float[8];
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public boolean f30693x = true;

    /* renamed from: x0  reason: collision with root package name */
    private final float[] f30694x0 = new float[8];
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public boolean f30695y = true;

    /* renamed from: y0  reason: collision with root package name */
    private final float f30696y0 = getResources().getDisplayMetrics().density;

    /* renamed from: z  reason: collision with root package name */
    private float f30697z = 1.0f;

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what == 1 && c.this.f30674n0 != null) {
                int unused = c.this.S = 0;
                c cVar = c.this;
                c.super.setOnLongClickListener(cVar.f30674n0);
                c.this.performLongClick();
                c.super.setOnLongClickListener((View.OnLongClickListener) null);
            }
            return true;
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f30699e;

        b(Context context) {
            this.f30699e = context;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!c.this.f30693x || !c.this.f30670l0 || c.this.E == null) {
                return super.onDoubleTapEvent(motionEvent);
            }
            c.this.setGestureDetector(this.f30699e);
            if (c.this.f30695y) {
                PointF unused = c.this.f30653c0 = new PointF(motionEvent.getX(), motionEvent.getY());
                PointF unused2 = c.this.F = new PointF(c.this.E.x, c.this.E.y);
                c cVar = c.this;
                float unused3 = cVar.D = cVar.C;
                boolean unused4 = c.this.R = true;
                boolean unused5 = c.this.P = true;
                float unused6 = c.this.f30658f0 = -1.0f;
                c cVar2 = c.this;
                PointF unused7 = cVar2.f30664i0 = cVar2.Q0(cVar2.f30653c0);
                PointF unused8 = c.this.f30666j0 = new PointF(motionEvent.getX(), motionEvent.getY());
                PointF unused9 = c.this.f30662h0 = new PointF(c.this.f30664i0.x, c.this.f30664i0.y);
                boolean unused10 = c.this.f30660g0 = false;
                return false;
            }
            c cVar3 = c.this;
            cVar3.W(cVar3.Q0(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (!c.this.f30691w || !c.this.f30670l0 || c.this.E == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f10) <= 500.0f && Math.abs(f11) <= 500.0f) || c.this.P))) {
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            }
            PointF pointF = new PointF(c.this.E.x + (f10 * 0.25f), c.this.E.y + (f11 * 0.25f));
            new e(c.this, new PointF((((float) (c.this.getWidth() / 2)) - pointF.x) / c.this.C, (((float) (c.this.getHeight() / 2)) - pointF.y) / c.this.C), (a) null).e(1).h(false).g(3).c();
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            c.this.performClick();
            return true;
        }
    }

    /* renamed from: qk.c$c  reason: collision with other inner class name */
    class C0340c extends GestureDetector.SimpleOnGestureListener {
        C0340c() {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            c.this.performClick();
            return true;
        }
    }

    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public float f30702a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f30703b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public PointF f30704c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public PointF f30705d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public PointF f30706e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public PointF f30707f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public PointF f30708g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public long f30709h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public boolean f30710i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f30711j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f30712k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public long f30713l;

        private d() {
            this.f30709h = 500;
            this.f30710i = true;
            this.f30711j = 2;
            this.f30712k = 1;
            this.f30713l = System.currentTimeMillis();
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    public final class e {

        /* renamed from: a  reason: collision with root package name */
        private final float f30714a;

        /* renamed from: b  reason: collision with root package name */
        private final PointF f30715b;

        /* renamed from: c  reason: collision with root package name */
        private final PointF f30716c;

        /* renamed from: d  reason: collision with root package name */
        private long f30717d;

        /* renamed from: e  reason: collision with root package name */
        private int f30718e;

        /* renamed from: f  reason: collision with root package name */
        private int f30719f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f30720g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f30721h;

        private e(float f10, PointF pointF) {
            this.f30717d = 500;
            this.f30718e = 2;
            this.f30719f = 1;
            this.f30720g = true;
            this.f30721h = true;
            this.f30714a = f10;
            this.f30715b = pointF;
            this.f30716c = null;
        }

        /* access modifiers changed from: private */
        public e g(int i10) {
            this.f30719f = i10;
            return this;
        }

        /* access modifiers changed from: private */
        public e h(boolean z10) {
            this.f30721h = z10;
            return this;
        }

        public void c() {
            PointF pointF;
            if (c.this.f30668k0 != null) {
                g unused = c.this.f30668k0.getClass();
            }
            int paddingLeft = c.this.getPaddingLeft() + (((c.this.getWidth() - c.this.getPaddingRight()) - c.this.getPaddingLeft()) / 2);
            int paddingTop = c.this.getPaddingTop() + (((c.this.getHeight() - c.this.getPaddingBottom()) - c.this.getPaddingTop()) / 2);
            float J = c.this.l0(this.f30714a);
            if (this.f30721h) {
                c cVar = c.this;
                PointF pointF2 = this.f30715b;
                pointF = cVar.k0(pointF2.x, pointF2.y, J, new PointF());
            } else {
                pointF = this.f30715b;
            }
            d unused2 = c.this.f30668k0 = new d((a) null);
            float unused3 = c.this.f30668k0.f30702a = c.this.C;
            float unused4 = c.this.f30668k0.f30703b = J;
            long unused5 = c.this.f30668k0.f30713l = System.currentTimeMillis();
            PointF unused6 = c.this.f30668k0.f30706e = pointF;
            PointF unused7 = c.this.f30668k0.f30704c = c.this.getCenter();
            PointF unused8 = c.this.f30668k0.f30705d = pointF;
            PointF unused9 = c.this.f30668k0.f30707f = c.this.I0(pointF);
            PointF unused10 = c.this.f30668k0.f30708g = new PointF((float) paddingLeft, (float) paddingTop);
            long unused11 = c.this.f30668k0.f30709h = this.f30717d;
            boolean unused12 = c.this.f30668k0.f30710i = this.f30720g;
            int unused13 = c.this.f30668k0.f30711j = this.f30718e;
            int unused14 = c.this.f30668k0.f30712k = this.f30719f;
            long unused15 = c.this.f30668k0.f30713l = System.currentTimeMillis();
            g unused16 = c.this.f30668k0.getClass();
            PointF pointF3 = this.f30716c;
            if (pointF3 != null) {
                float f10 = pointF3.x - (c.this.f30668k0.f30704c.x * J);
                float f11 = this.f30716c.y - (c.this.f30668k0.f30704c.y * J);
                j jVar = new j(J, new PointF(f10, f11), (a) null);
                c.this.d0(true, jVar);
                PointF unused17 = c.this.f30668k0.f30708g = new PointF(this.f30716c.x + (jVar.f30731b.x - f10), this.f30716c.y + (jVar.f30731b.y - f11));
            }
            c.this.invalidate();
        }

        public e d(long j10) {
            this.f30717d = j10;
            return this;
        }

        public e e(int i10) {
            if (c.C0.contains(Integer.valueOf(i10))) {
                this.f30718e = i10;
                return this;
            }
            throw new IllegalArgumentException("Unknown easing type: " + i10);
        }

        public e f(boolean z10) {
            this.f30720g = z10;
            return this;
        }

        private e(float f10, PointF pointF, PointF pointF2) {
            this.f30717d = 500;
            this.f30718e = 2;
            this.f30719f = 1;
            this.f30720g = true;
            this.f30721h = true;
            this.f30714a = f10;
            this.f30715b = pointF;
            this.f30716c = pointF2;
        }

        /* synthetic */ e(c cVar, float f10, PointF pointF, PointF pointF2, a aVar) {
            this(f10, pointF, pointF2);
        }

        /* synthetic */ e(c cVar, float f10, PointF pointF, a aVar) {
            this(f10, pointF);
        }

        private e(PointF pointF) {
            this.f30717d = 500;
            this.f30718e = 2;
            this.f30719f = 1;
            this.f30720g = true;
            this.f30721h = true;
            this.f30714a = c.this.C;
            this.f30715b = pointF;
            this.f30716c = null;
        }

        /* synthetic */ e(c cVar, PointF pointF, a aVar) {
            this(pointF);
        }
    }

    private static class f extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f30723a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference f30724b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference f30725c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f30726d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f30727e;

        /* renamed from: f  reason: collision with root package name */
        private Bitmap f30728f;

        /* renamed from: g  reason: collision with root package name */
        private Exception f30729g;

        f(c cVar, Context context, rk.b bVar, Uri uri, boolean z10) {
            this.f30723a = new WeakReference(cVar);
            this.f30724b = new WeakReference(context);
            this.f30725c = new WeakReference(bVar);
            this.f30726d = uri;
            this.f30727e = z10;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            try {
                String uri = this.f30726d.toString();
                Context context = (Context) this.f30724b.get();
                rk.b bVar = (rk.b) this.f30725c.get();
                c cVar = (c) this.f30723a.get();
                if (context == null || bVar == null || cVar == null) {
                    return null;
                }
                cVar.U("BitmapLoadTask.doInBackground", new Object[0]);
                this.f30728f = ((rk.c) bVar.a()).a(context, this.f30726d);
                return Integer.valueOf(cVar.e0(context, uri));
            } catch (Exception e10) {
                Log.e(c.f30650z0, "Failed to load bitmap", e10);
                this.f30729g = e10;
                return null;
            } catch (OutOfMemoryError e11) {
                Log.e(c.f30650z0, "Failed to load bitmap - OutOfMemoryError", e11);
                this.f30729g = new RuntimeException(e11);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            c cVar = (c) this.f30723a.get();
            if (cVar != null) {
                Bitmap bitmap = this.f30728f;
                if (bitmap == null || num == null) {
                    if (this.f30729g != null) {
                        h unused = cVar.getClass();
                    }
                } else if (this.f30727e) {
                    cVar.p0(bitmap);
                } else {
                    cVar.o0(bitmap, num.intValue(), false);
                }
            }
        }
    }

    public interface g {
    }

    public interface h {
    }

    public interface i {
    }

    private static class j {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public float f30730a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final PointF f30731b;

        private j(float f10, PointF pointF) {
            this.f30730a = f10;
            this.f30731b = pointF;
        }

        /* synthetic */ j(float f10, PointF pointF, a aVar) {
            this(f10, pointF);
        }
    }

    private static class k {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Rect f30732a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f30733b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Bitmap f30734c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f30735d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f30736e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public Rect f30737f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Rect f30738g;

        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    private static class l extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f30739a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference f30740b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference f30741c;

        /* renamed from: d  reason: collision with root package name */
        private Exception f30742d;

        l(c cVar, rk.d dVar, k kVar) {
            this.f30739a = new WeakReference(cVar);
            this.f30740b = new WeakReference(dVar);
            this.f30741c = new WeakReference(kVar);
            boolean unused = kVar.f30735d = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            c cVar;
            try {
                cVar = (c) this.f30739a.get();
                rk.d dVar = (rk.d) this.f30740b.get();
                k kVar = (k) this.f30741c.get();
                if (dVar != null && kVar != null && cVar != null && dVar.a() && kVar.f30736e) {
                    cVar.U("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", kVar.f30732a, Integer.valueOf(kVar.f30733b));
                    cVar.W.readLock().lock();
                    if (dVar.a()) {
                        cVar.b0(kVar.f30732a, kVar.f30738g);
                        if (cVar.N != null) {
                            kVar.f30738g.offset(cVar.N.left, cVar.N.top);
                        }
                        Bitmap b10 = dVar.b(kVar.f30738g, kVar.f30733b);
                        cVar.W.readLock().unlock();
                        return b10;
                    }
                    boolean unused = kVar.f30735d = false;
                    cVar.W.readLock().unlock();
                    return null;
                } else if (kVar == null) {
                    return null;
                } else {
                    boolean unused2 = kVar.f30735d = false;
                    return null;
                }
            } catch (Exception e10) {
                Log.e(c.f30650z0, "Failed to decode tile", e10);
                this.f30742d = e10;
                return null;
            } catch (OutOfMemoryError e11) {
                Log.e(c.f30650z0, "Failed to decode tile - OutOfMemoryError", e11);
                this.f30742d = new RuntimeException(e11);
                return null;
            } catch (Throwable th2) {
                cVar.W.readLock().unlock();
                throw th2;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            c cVar = (c) this.f30739a.get();
            k kVar = (k) this.f30741c.get();
            if (cVar != null && kVar != null) {
                if (bitmap != null) {
                    Bitmap unused = kVar.f30734c = bitmap;
                    boolean unused2 = kVar.f30735d = false;
                    cVar.r0();
                } else if (this.f30742d != null) {
                    h unused3 = cVar.getClass();
                }
            }
        }
    }

    private static class m extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f30743a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference f30744b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference f30745c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f30746d;

        /* renamed from: e  reason: collision with root package name */
        private rk.d f30747e;

        /* renamed from: f  reason: collision with root package name */
        private Exception f30748f;

        m(c cVar, Context context, rk.b bVar, Uri uri) {
            this.f30743a = new WeakReference(cVar);
            this.f30744b = new WeakReference(context);
            this.f30745c = new WeakReference(bVar);
            this.f30746d = uri;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int[] doInBackground(Void... voidArr) {
            try {
                String uri = this.f30746d.toString();
                Context context = (Context) this.f30744b.get();
                rk.b bVar = (rk.b) this.f30745c.get();
                c cVar = (c) this.f30743a.get();
                if (context == null || bVar == null || cVar == null) {
                    return null;
                }
                cVar.U("TilesInitTask.doInBackground", new Object[0]);
                rk.d dVar = (rk.d) bVar.a();
                this.f30747e = dVar;
                Point d10 = dVar.d(context, this.f30746d);
                int i10 = d10.x;
                int i11 = d10.y;
                int v10 = cVar.e0(context, uri);
                if (cVar.N != null) {
                    cVar.N.left = Math.max(0, cVar.N.left);
                    cVar.N.top = Math.max(0, cVar.N.top);
                    cVar.N.right = Math.min(i10, cVar.N.right);
                    cVar.N.bottom = Math.min(i11, cVar.N.bottom);
                    i10 = cVar.N.width();
                    i11 = cVar.N.height();
                }
                return new int[]{i10, i11, v10};
            } catch (Exception e10) {
                Log.e(c.f30650z0, "Failed to initialise bitmap decoder", e10);
                this.f30748f = e10;
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(int[] iArr) {
            c cVar = (c) this.f30743a.get();
            if (cVar != null) {
                rk.d dVar = this.f30747e;
                if (dVar != null && iArr != null && iArr.length == 3) {
                    cVar.s0(dVar, iArr[0], iArr[1], iArr[2]);
                } else if (this.f30748f != null) {
                    h unused = cVar.getClass();
                }
            }
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.f30676o0 = new Handler(new a());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pk.a.f30404a);
            int i10 = pk.a.f30405b;
            if (obtainStyledAttributes.hasValue(i10) && (string = obtainStyledAttributes.getString(i10)) != null && string.length() > 0) {
                setImage(a.a(string).l());
            }
            int i11 = pk.a.f30408e;
            if (obtainStyledAttributes.hasValue(i11) && (resourceId = obtainStyledAttributes.getResourceId(i11, 0)) > 0) {
                setImage(a.j(resourceId).l());
            }
            int i12 = pk.a.f30406c;
            if (obtainStyledAttributes.hasValue(i12)) {
                setPanEnabled(obtainStyledAttributes.getBoolean(i12, true));
            }
            int i13 = pk.a.f30410g;
            if (obtainStyledAttributes.hasValue(i13)) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(i13, true));
            }
            int i14 = pk.a.f30407d;
            if (obtainStyledAttributes.hasValue(i14)) {
                setQuickScaleEnabled(obtainStyledAttributes.getBoolean(i14, true));
            }
            int i15 = pk.a.f30409f;
            if (obtainStyledAttributes.hasValue(i15)) {
                setTileBackgroundColor(obtainStyledAttributes.getColor(i15, Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.f30656e0 = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    private void A0(b bVar) {
        if (bVar != null && A0.contains(Integer.valueOf(bVar.b()))) {
            this.f30671m = bVar.b();
            this.H = Float.valueOf(bVar.c());
            this.I = bVar.a();
            invalidate();
        }
    }

    private int B0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.K : this.L;
    }

    private int C0() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.L : this.K;
    }

    private void D0(float f10, PointF pointF, int i10) {
    }

    private void F0(float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
    }

    private void J0(Rect rect, Rect rect2) {
        rect2.set((int) K0((float) rect.left), (int) L0((float) rect.top), (int) K0((float) rect.right), (int) L0((float) rect.bottom));
    }

    private float K0(float f10) {
        PointF pointF = this.E;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f10 * this.C) + pointF.x;
    }

    private float L0(float f10) {
        PointF pointF = this.E;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f10 * this.C) + pointF.y;
    }

    private boolean M0(k kVar) {
        return R0(0.0f) <= ((float) kVar.f30732a.right) && ((float) kVar.f30732a.left) <= R0((float) getWidth()) && S0(0.0f) <= ((float) kVar.f30732a.bottom) && ((float) kVar.f30732a.top) <= S0((float) getHeight());
    }

    private PointF N0(float f10, float f11, float f12) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.f30686t0 == null) {
            this.f30686t0 = new j(0.0f, new PointF(0.0f, 0.0f), (a) null);
        }
        float unused = this.f30686t0.f30730a = f12;
        this.f30686t0.f30731b.set(((float) paddingLeft) - (f10 * f12), ((float) paddingTop) - (f11 * f12));
        d0(true, this.f30686t0);
        return this.f30686t0.f30731b;
    }

    private int Q(float f10) {
        int i10;
        if (this.f30677p > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f10 *= ((float) this.f30677p) / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int C02 = (int) (((float) C0()) * f10);
        int B02 = (int) (((float) B0()) * f10);
        if (C02 == 0 || B02 == 0) {
            return 32;
        }
        int i11 = 1;
        if (B0() > B02 || C0() > C02) {
            i10 = Math.round(((float) B0()) / ((float) B02));
            int round = Math.round(((float) C0()) / ((float) C02));
            if (i10 >= round) {
                i10 = round;
            }
        } else {
            i10 = 1;
        }
        while (true) {
            int i12 = i11 * 2;
            if (i12 >= i10) {
                return i11;
            }
            i11 = i12;
        }
    }

    private boolean R() {
        boolean i02 = i0();
        if (!this.f30672m0 && i02) {
            u0();
            this.f30672m0 = true;
            n0();
        }
        return i02;
    }

    private float R0(float f10) {
        PointF pointF = this.E;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f10 - pointF.x) / this.C;
    }

    private boolean S() {
        boolean z10 = getWidth() > 0 && getHeight() > 0 && this.K > 0 && this.L > 0 && (this.f30655e != null || i0());
        if (!this.f30670l0 && z10) {
            u0();
            this.f30670l0 = true;
            q0();
        }
        return z10;
    }

    private float S0(float f10) {
        PointF pointF = this.E;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f10 - pointF.y) / this.C;
    }

    private void T() {
        if (this.f30678p0 == null) {
            Paint paint = new Paint();
            this.f30678p0 = paint;
            paint.setAntiAlias(true);
            this.f30678p0.setFilterBitmap(true);
            this.f30678p0.setDither(true);
        }
        if ((this.f30680q0 == null || this.f30682r0 == null) && this.f30669l) {
            Paint paint2 = new Paint();
            this.f30680q0 = paint2;
            paint2.setTextSize((float) v0(12));
            this.f30680q0.setColor(-65281);
            this.f30680q0.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.f30682r0 = paint3;
            paint3.setColor(-65281);
            this.f30682r0.setStyle(Paint.Style.STROKE);
            this.f30682r0.setStrokeWidth((float) v0(1));
        }
    }

    /* access modifiers changed from: private */
    public void U(String str, Object... objArr) {
        if (this.f30669l) {
            Log.d(f30650z0, String.format(str, objArr));
        }
    }

    private float V(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f11;
        float f15 = f12 - f13;
        return (float) Math.sqrt((double) ((f14 * f14) + (f15 * f15)));
    }

    /* access modifiers changed from: private */
    public void W(PointF pointF, PointF pointF2) {
        e f10;
        float B02;
        if (!this.f30691w) {
            PointF pointF3 = this.J;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                B02 = pointF3.y;
            } else {
                pointF.x = (float) (C0() / 2);
                B02 = (float) (B0() / 2);
            }
            pointF.y = B02;
        }
        float min = Math.min(this.f30673n, this.f30697z);
        float f11 = this.C;
        boolean z10 = ((double) f11) <= ((double) min) * 0.9d || f11 == this.f30675o;
        if (!z10) {
            min = m0();
        }
        float f12 = min;
        int i10 = this.A;
        if (i10 == 3) {
            G0(f12, pointF);
        } else {
            if (i10 == 2 || !z10 || !this.f30691w) {
                f10 = new e(this, f12, pointF, (a) null).f(false);
            } else if (i10 == 1) {
                f10 = new e(this, f12, pointF, pointF2, (a) null).f(false);
            }
            f10.d((long) this.B).g(4).c();
        }
        invalidate();
    }

    private float X(int i10, long j10, float f10, float f11, long j11) {
        if (i10 == 1) {
            return Z(j10, f10, f11, j11);
        }
        if (i10 == 2) {
            return Y(j10, f10, f11, j11);
        }
        throw new IllegalStateException("Unexpected easing type: " + i10);
    }

    private float Y(long j10, float f10, float f11, long j11) {
        float f12;
        float f13 = ((float) j10) / (((float) j11) / 2.0f);
        if (f13 < 1.0f) {
            f12 = (f11 / 2.0f) * f13;
        } else {
            float f14 = f13 - 1.0f;
            f12 = (-f11) / 2.0f;
            f13 = (f14 * (f14 - 2.0f)) - 1.0f;
        }
        return (f12 * f13) + f10;
    }

    private float Z(long j10, float f10, float f11, long j11) {
        float f12 = ((float) j10) / ((float) j11);
        return ((-f11) * f12 * (f12 - 2.0f)) + f10;
    }

    private void a0(AsyncTask asyncTask) {
        asyncTask.executeOnExecutor(this.f30687u, new Void[0]);
    }

    /* access modifiers changed from: private */
    public void b0(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
        } else if (getRequiredRotation() == 90) {
            int i10 = rect.top;
            int i11 = this.L;
            rect2.set(i10, i11 - rect.right, rect.bottom, i11 - rect.left);
        } else if (getRequiredRotation() == 180) {
            int i12 = this.K;
            int i13 = this.L;
            rect2.set(i12 - rect.right, i13 - rect.bottom, i12 - rect.left, i13 - rect.top);
        } else {
            int i14 = this.K;
            rect2.set(i14 - rect.bottom, rect.left, i14 - rect.top, rect.right);
        }
    }

    private void c0(boolean z10) {
        boolean z11;
        if (this.E == null) {
            this.E = new PointF(0.0f, 0.0f);
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f30686t0 == null) {
            this.f30686t0 = new j(0.0f, new PointF(0.0f, 0.0f), (a) null);
        }
        float unused = this.f30686t0.f30730a = this.C;
        this.f30686t0.f30731b.set(this.E);
        d0(z10, this.f30686t0);
        this.C = this.f30686t0.f30730a;
        this.E.set(this.f30686t0.f30731b);
        if (z11 && this.f30681r != 4) {
            this.E.set(N0((float) (C0() / 2), (float) (B0() / 2), this.C));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d0(boolean r12, qk.c.j r13) {
        /*
            r11 = this;
            int r0 = r11.f30679q
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r0 = r11.j0()
            if (r0 == 0) goto L_0x000d
            r12 = r1
        L_0x000d:
            android.graphics.PointF r0 = r13.f30731b
            float r3 = r13.f30730a
            float r3 = r11.l0(r3)
            int r4 = r11.C0()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r5 = r11.B0()
            float r5 = (float) r5
            float r5 = r5 * r3
            int r6 = r11.f30679q
            r7 = 3
            if (r6 != r7) goto L_0x004f
            boolean r6 = r11.j0()
            if (r6 == 0) goto L_0x004f
            float r6 = r0.x
            int r8 = r11.getWidth()
            int r8 = r8 / r2
            float r8 = (float) r8
            float r8 = r8 - r4
            float r6 = java.lang.Math.max(r6, r8)
            r0.x = r6
            float r6 = r0.y
            int r8 = r11.getHeight()
            int r8 = r8 / r2
        L_0x0046:
            float r8 = (float) r8
            float r8 = r8 - r5
        L_0x0048:
            float r6 = java.lang.Math.max(r6, r8)
            r0.y = r6
            goto L_0x0071
        L_0x004f:
            float r6 = r0.x
            if (r12 == 0) goto L_0x0066
            int r8 = r11.getWidth()
            float r8 = (float) r8
            float r8 = r8 - r4
            float r6 = java.lang.Math.max(r6, r8)
            r0.x = r6
            float r6 = r0.y
            int r8 = r11.getHeight()
            goto L_0x0046
        L_0x0066:
            float r8 = -r4
            float r6 = java.lang.Math.max(r6, r8)
            r0.x = r6
            float r6 = r0.y
            float r8 = -r5
            goto L_0x0048
        L_0x0071:
            int r6 = r11.getPaddingLeft()
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r6 > 0) goto L_0x0082
            int r6 = r11.getPaddingRight()
            if (r6 <= 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r6 = r8
            goto L_0x0092
        L_0x0082:
            int r6 = r11.getPaddingLeft()
            float r6 = (float) r6
            int r9 = r11.getPaddingLeft()
            int r10 = r11.getPaddingRight()
            int r9 = r9 + r10
            float r9 = (float) r9
            float r6 = r6 / r9
        L_0x0092:
            int r9 = r11.getPaddingTop()
            if (r9 > 0) goto L_0x009e
            int r9 = r11.getPaddingBottom()
            if (r9 <= 0) goto L_0x00ae
        L_0x009e:
            int r8 = r11.getPaddingTop()
            float r8 = (float) r8
            int r9 = r11.getPaddingTop()
            int r10 = r11.getPaddingBottom()
            int r9 = r9 + r10
            float r9 = (float) r9
            float r8 = r8 / r9
        L_0x00ae:
            int r9 = r11.f30679q
            if (r9 != r7) goto L_0x00cd
            boolean r7 = r11.j0()
            if (r7 == 0) goto L_0x00cd
            int r12 = r11.getWidth()
            int r12 = r12 / r2
            int r12 = java.lang.Math.max(r1, r12)
            float r12 = (float) r12
            int r4 = r11.getHeight()
            int r4 = r4 / r2
            int r1 = java.lang.Math.max(r1, r4)
        L_0x00cb:
            float r1 = (float) r1
            goto L_0x00f9
        L_0x00cd:
            if (r12 == 0) goto L_0x00e7
            int r12 = r11.getWidth()
            float r12 = (float) r12
            float r12 = r12 - r4
            float r12 = r12 * r6
            r1 = 0
            float r12 = java.lang.Math.max(r1, r12)
            int r2 = r11.getHeight()
            float r2 = (float) r2
            float r2 = r2 - r5
            float r2 = r2 * r8
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x00f9
        L_0x00e7:
            int r12 = r11.getWidth()
            int r12 = java.lang.Math.max(r1, r12)
            float r12 = (float) r12
            int r2 = r11.getHeight()
            int r1 = java.lang.Math.max(r1, r2)
            goto L_0x00cb
        L_0x00f9:
            float r2 = r0.x
            float r12 = java.lang.Math.min(r2, r12)
            r0.x = r12
            float r12 = r0.y
            float r12 = java.lang.Math.min(r12, r1)
            r0.y = r12
            float unused = r13.f30730a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.c.d0(boolean, qk.c$j):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r2 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        android.util.Log.w(f30650z0, "Could not get orientation of image from media store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r2 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r2 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        throw r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int e0(android.content.Context r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0054 }
            java.lang.String r0 = "orientation"
            r5[r1] = r0     // Catch:{ Exception -> 0x0054 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x0054 }
            android.net.Uri r4 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x0054 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0054 }
            if (r2 == 0) goto L_0x004e
            boolean r10 = r2.moveToFirst()     // Catch:{ Exception -> 0x0054 }
            if (r10 == 0) goto L_0x004e
            int r10 = r2.getInt(r1)     // Catch:{ Exception -> 0x0054 }
            java.util.List r11 = A0     // Catch:{ Exception -> 0x0054 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0054 }
            boolean r11 = r11.contains(r0)     // Catch:{ Exception -> 0x0054 }
            if (r11 == 0) goto L_0x0035
            r11 = -1
            if (r10 == r11) goto L_0x0035
            r1 = r10
            goto L_0x004e
        L_0x0035:
            java.lang.String r11 = f30650z0     // Catch:{ Exception -> 0x0054 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0054 }
            r0.<init>()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r3 = "Unsupported orientation: "
            r0.append(r3)     // Catch:{ Exception -> 0x0054 }
            r0.append(r10)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x0054 }
            android.util.Log.w(r11, r10)     // Catch:{ Exception -> 0x0054 }
            goto L_0x004e
        L_0x004c:
            r10 = move-exception
            goto L_0x005f
        L_0x004e:
            if (r2 == 0) goto L_0x005e
        L_0x0050:
            r2.close()
            goto L_0x005e
        L_0x0054:
            java.lang.String r10 = f30650z0     // Catch:{ all -> 0x004c }
            java.lang.String r11 = "Could not get orientation of image from media store"
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x005e
            goto L_0x0050
        L_0x005e:
            return r1
        L_0x005f:
            if (r2 == 0) goto L_0x0064
            r2.close()
        L_0x0064:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.c.e0(android.content.Context, java.lang.String):int");
    }

    private Point f0(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), this.f30683s), Math.min(canvas.getMaximumBitmapHeight(), this.f30685t));
    }

    private synchronized void g0(Point point) {
        try {
            U("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
            j jVar = new j(0.0f, new PointF(0.0f, 0.0f), (a) null);
            this.f30686t0 = jVar;
            d0(true, jVar);
            int Q2 = Q(this.f30686t0.f30730a);
            this.f30663i = Q2;
            if (Q2 > 1) {
                this.f30663i = Q2 / 2;
            }
            if (this.f30663i != 1 || this.N != null || C0() >= point.x || B0() >= point.y) {
                h0(point);
                List<k> list = (List) this.f30667k.get(Integer.valueOf(this.f30663i));
                if (this.f30665j) {
                    for (k lVar : list) {
                        a0(new l(this, this.V, lVar));
                    }
                    x0(true);
                } else {
                    a0(new l(this, this.V, (k) list.get(0)));
                }
            } else {
                this.V.c();
                this.V = null;
                a0(new f(this, getContext(), this.f30651a0, this.f30661h, false));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return F0;
    }

    private int getRequiredRotation() {
        int i10 = this.f30671m;
        return i10 == -1 ? this.M : i10;
    }

    private void h0(Point point) {
        Point point2 = point;
        U("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point2.x), Integer.valueOf(point2.y));
        this.f30667k = new LinkedHashMap();
        int i10 = this.f30663i;
        boolean z10 = true;
        int i11 = 1;
        int i12 = 1;
        while (true) {
            int C02 = C0() / i11;
            int B02 = B0() / i12;
            int i13 = C02 / i10;
            int i14 = B02 / i10;
            while (true) {
                if (i13 + i11 + (z10 ? 1 : 0) > point2.x || (((double) i13) > ((double) getWidth()) * 1.25d && i10 < this.f30663i)) {
                    i11++;
                    C02 = C0() / i11;
                    i13 = C02 / i10;
                }
            }
            while (true) {
                if (i14 + i12 + z10 > point2.y || (((double) i14) > ((double) getHeight()) * 1.25d && i10 < this.f30663i)) {
                    i12++;
                    B02 = B0() / i12;
                    i14 = B02 / i10;
                }
            }
            ArrayList arrayList = new ArrayList(i11 * i12);
            int i15 = 0;
            while (i15 < i11) {
                int i16 = 0;
                while (i16 < i12) {
                    k kVar = new k((a) null);
                    int unused = kVar.f30733b = i10;
                    boolean unused2 = kVar.f30736e = i10 == this.f30663i ? z10 : false;
                    Rect unused3 = kVar.f30732a = new Rect(i15 * C02, i16 * B02, i15 == i11 + -1 ? C0() : (i15 + 1) * C02, i16 == i12 + -1 ? B0() : (i16 + 1) * B02);
                    Rect unused4 = kVar.f30737f = new Rect(0, 0, 0, 0);
                    Rect unused5 = kVar.f30738g = new Rect(kVar.f30732a);
                    arrayList.add(kVar);
                    i16++;
                    z10 = true;
                }
                i15++;
                z10 = true;
            }
            this.f30667k.put(Integer.valueOf(i10), arrayList);
            z10 = true;
            if (i10 != 1) {
                i10 /= 2;
            } else {
                return;
            }
        }
    }

    private boolean i0() {
        boolean z10 = true;
        if (!this.f30665j || (this.f30655e != null && !this.f30657f)) {
            return true;
        }
        Map map = this.f30667k;
        if (map == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getKey()).intValue() == this.f30663i) {
                for (k kVar : (List) entry.getValue()) {
                    if (kVar.f30735d || kVar.f30734c == null) {
                        z10 = false;
                    }
                }
            }
        }
        return z10;
    }

    /* access modifiers changed from: private */
    public PointF k0(float f10, float f11, float f12, PointF pointF) {
        PointF N0 = N0(f10, f11, f12);
        pointF.set((((float) (getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2))) - N0.x) / f12, (((float) (getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2))) - N0.y) / f12);
        return pointF;
    }

    /* access modifiers changed from: private */
    public float l0(float f10) {
        return Math.min(this.f30673n, Math.max(m0(), f10));
    }

    private float m0() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i10 = this.f30681r;
        if (i10 == 2 || i10 == 4) {
            return Math.max(((float) (getWidth() - paddingLeft)) / ((float) C0()), ((float) (getHeight() - paddingBottom)) / ((float) B0()));
        }
        if (i10 == 3) {
            float f10 = this.f30675o;
            if (f10 > 0.0f) {
                return f10;
            }
        }
        return Math.min(((float) (getWidth() - paddingLeft)) / ((float) C0()), ((float) (getHeight() - paddingBottom)) / ((float) B0()));
    }

    /* access modifiers changed from: private */
    public synchronized void o0(Bitmap bitmap, int i10, boolean z10) {
        try {
            U("onImageLoaded", new Object[0]);
            int i11 = this.K;
            if (i11 > 0 && this.L > 0) {
                if (i11 == bitmap.getWidth()) {
                    if (this.L != bitmap.getHeight()) {
                    }
                }
                z0(false);
            }
            Bitmap bitmap2 = this.f30655e;
            if (bitmap2 != null && !this.f30659g) {
                bitmap2.recycle();
            }
            this.f30657f = false;
            this.f30659g = z10;
            this.f30655e = bitmap;
            this.K = bitmap.getWidth();
            this.L = bitmap.getHeight();
            this.M = i10;
            boolean S2 = S();
            boolean R2 = R();
            if (S2 || R2) {
                invalidate();
                requestLayout();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void p0(android.graphics.Bitmap r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "onPreviewLoaded"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x002b }
            r4.U(r0, r1)     // Catch:{ all -> 0x002b }
            android.graphics.Bitmap r0 = r4.f30655e     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x003e
            boolean r0 = r4.f30672m0     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0012
            goto L_0x003e
        L_0x0012:
            android.graphics.Rect r0 = r4.O     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0028
            int r1 = r0.left     // Catch:{ all -> 0x002b }
            int r2 = r0.top     // Catch:{ all -> 0x002b }
            int r0 = r0.width()     // Catch:{ all -> 0x002b }
            android.graphics.Rect r3 = r4.O     // Catch:{ all -> 0x002b }
            int r3 = r3.height()     // Catch:{ all -> 0x002b }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r1, r2, r0, r3)     // Catch:{ all -> 0x002b }
        L_0x0028:
            r4.f30655e = r5     // Catch:{ all -> 0x002b }
            goto L_0x002d
        L_0x002b:
            r5 = move-exception
            goto L_0x0043
        L_0x002d:
            r5 = 1
            r4.f30657f = r5     // Catch:{ all -> 0x002b }
            boolean r5 = r4.S()     // Catch:{ all -> 0x002b }
            if (r5 == 0) goto L_0x003c
            r4.invalidate()     // Catch:{ all -> 0x002b }
            r4.requestLayout()     // Catch:{ all -> 0x002b }
        L_0x003c:
            monitor-exit(r4)
            return
        L_0x003e:
            r5.recycle()     // Catch:{ all -> 0x002b }
            monitor-exit(r4)
            return
        L_0x0043:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.c.p0(android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: private */
    public synchronized void r0() {
        Bitmap bitmap;
        try {
            U("onTileLoaded", new Object[0]);
            S();
            R();
            if (i0() && (bitmap = this.f30655e) != null) {
                if (!this.f30659g) {
                    bitmap.recycle();
                }
                this.f30655e = null;
                this.f30657f = false;
                this.f30659g = false;
            }
            invalidate();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public synchronized void s0(rk.d dVar, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        try {
            U("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(this.f30671m));
            int i16 = this.K;
            if (i16 > 0 && (i15 = this.L) > 0 && !(i16 == i10 && i15 == i11)) {
                z0(false);
                Bitmap bitmap = this.f30655e;
                if (bitmap != null) {
                    if (!this.f30659g) {
                        bitmap.recycle();
                    }
                    this.f30655e = null;
                    this.f30657f = false;
                    this.f30659g = false;
                }
            }
            this.V = dVar;
            this.K = i10;
            this.L = i11;
            this.M = i12;
            S();
            if (!R() && (i13 = this.f30683s) > 0 && i13 != Integer.MAX_VALUE && (i14 = this.f30685t) > 0 && i14 != Integer.MAX_VALUE && getWidth() > 0 && getHeight() > 0) {
                g0(new Point(this.f30683s, this.f30685t));
            }
            invalidate();
            requestLayout();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.T = new GestureDetector(context, new b(context));
        this.U = new GestureDetector(context, new C0340c());
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        F0 = config;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1 != 262) goto L_0x0393;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean t0(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getPointerCount()
            int r1 = r12.getAction()
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x03fe
            if (r1 == r5) goto L_0x0394
            if (r1 == r3) goto L_0x0023
            r6 = 5
            if (r1 == r6) goto L_0x03fe
            r6 = 6
            if (r1 == r6) goto L_0x0394
            r6 = 261(0x105, float:3.66E-43)
            if (r1 == r6) goto L_0x03fe
            r2 = 262(0x106, float:3.67E-43)
            if (r1 == r2) goto L_0x0394
            goto L_0x0393
        L_0x0023:
            int r1 = r11.S
            if (r1 <= 0) goto L_0x0393
            r1 = 1084227584(0x40a00000, float:5.0)
            if (r0 < r3) goto L_0x017c
            float r0 = r12.getX(r4)
            float r6 = r12.getX(r5)
            float r7 = r12.getY(r4)
            float r8 = r12.getY(r5)
            float r0 = r11.V(r0, r6, r7, r8)
            float r6 = r12.getX(r4)
            float r7 = r12.getX(r5)
            float r6 = r6 + r7
            float r6 = r6 / r2
            float r7 = r12.getY(r4)
            float r12 = r12.getY(r5)
            float r7 = r7 + r12
            float r7 = r7 / r2
            boolean r12 = r11.f30693x
            if (r12 == 0) goto L_0x0393
            android.graphics.PointF r12 = r11.f30653c0
            float r2 = r12.x
            float r12 = r12.y
            float r12 = r11.V(r2, r6, r12, r7)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0075
            float r12 = r11.f30654d0
            float r12 = r0 - r12
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0075
            boolean r12 = r11.Q
            if (r12 == 0) goto L_0x0393
        L_0x0075:
            r11.P = r5
            r11.Q = r5
            float r12 = r11.C
            double r1 = (double) r12
            float r12 = r11.f30673n
            float r4 = r11.f30654d0
            float r4 = r0 / r4
            float r8 = r11.D
            float r4 = r4 * r8
            float r12 = java.lang.Math.min(r12, r4)
            r11.C = r12
            float r4 = r11.m0()
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 > 0) goto L_0x00a9
            r11.f30654d0 = r0
            float r12 = r11.m0()
            r11.D = r12
            android.graphics.PointF r12 = r11.f30653c0
            r12.set(r6, r7)
            android.graphics.PointF r12 = r11.F
            android.graphics.PointF r0 = r11.E
            r12.set(r0)
            goto L_0x0172
        L_0x00a9:
            boolean r12 = r11.f30691w
            if (r12 == 0) goto L_0x0124
            android.graphics.PointF r12 = r11.f30653c0
            float r3 = r12.x
            android.graphics.PointF r4 = r11.F
            float r8 = r4.x
            float r3 = r3 - r8
            float r12 = r12.y
            float r4 = r4.y
            float r12 = r12 - r4
            float r4 = r11.C
            float r8 = r11.D
            float r9 = r4 / r8
            float r3 = r3 * r9
            float r4 = r4 / r8
            float r12 = r12 * r4
            android.graphics.PointF r4 = r11.E
            float r3 = r6 - r3
            r4.x = r3
            float r12 = r7 - r12
            r4.y = r12
            int r12 = r11.B0()
            double r3 = (double) r12
            double r3 = r3 * r1
            int r12 = r11.getHeight()
            double r8 = (double) r12
            int r12 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x00ee
            float r12 = r11.C
            int r3 = r11.B0()
            float r3 = (float) r3
            float r12 = r12 * r3
            int r3 = r11.getHeight()
            float r3 = (float) r3
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 >= 0) goto L_0x010e
        L_0x00ee:
            int r12 = r11.C0()
            double r3 = (double) r12
            double r1 = r1 * r3
            int r12 = r11.getWidth()
            double r3 = (double) r12
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 >= 0) goto L_0x0172
            float r12 = r11.C
            int r1 = r11.C0()
            float r1 = (float) r1
            float r12 = r12 * r1
            int r1 = r11.getWidth()
            float r1 = (float) r1
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 < 0) goto L_0x0172
        L_0x010e:
            r11.c0(r5)
            android.graphics.PointF r12 = r11.f30653c0
            r12.set(r6, r7)
            android.graphics.PointF r12 = r11.F
            android.graphics.PointF r1 = r11.E
            r12.set(r1)
            float r12 = r11.C
            r11.D = r12
            r11.f30654d0 = r0
            goto L_0x0172
        L_0x0124:
            android.graphics.PointF r12 = r11.J
            if (r12 == 0) goto L_0x014d
            android.graphics.PointF r12 = r11.E
            int r0 = r11.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            float r1 = r11.C
            android.graphics.PointF r2 = r11.J
            float r2 = r2.x
            float r1 = r1 * r2
            float r0 = r0 - r1
            r12.x = r0
            android.graphics.PointF r12 = r11.E
            int r0 = r11.getHeight()
            int r0 = r0 / r3
            float r0 = (float) r0
            float r1 = r11.C
            android.graphics.PointF r2 = r11.J
            float r2 = r2.y
        L_0x0148:
            float r1 = r1 * r2
            float r0 = r0 - r1
            r12.y = r0
            goto L_0x0172
        L_0x014d:
            android.graphics.PointF r12 = r11.E
            int r0 = r11.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            float r1 = r11.C
            int r2 = r11.C0()
            int r2 = r2 / r3
            float r2 = (float) r2
            float r1 = r1 * r2
            float r0 = r0 - r1
            r12.x = r0
            android.graphics.PointF r12 = r11.E
            int r0 = r11.getHeight()
            int r0 = r0 / r3
            float r0 = (float) r0
            float r1 = r11.C
            int r2 = r11.B0()
            int r2 = r2 / r3
            float r2 = (float) r2
            goto L_0x0148
        L_0x0172:
            r11.c0(r5)
        L_0x0175:
            boolean r12 = r11.f30689v
            r11.x0(r12)
            goto L_0x038a
        L_0x017c:
            boolean r0 = r11.R
            if (r0 == 0) goto L_0x02be
            android.graphics.PointF r0 = r11.f30666j0
            float r0 = r0.y
            float r1 = r12.getY()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 * r2
            float r1 = r11.f30656e0
            float r0 = r0 + r1
            float r1 = r11.f30658f0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x019b
            r11.f30658f0 = r0
        L_0x019b:
            float r1 = r12.getY()
            android.graphics.PointF r2 = r11.f30662h0
            float r6 = r2.y
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x01a8
            r4 = r5
        L_0x01a8:
            float r12 = r12.getY()
            r1 = 0
            r2.set(r1, r12)
            float r12 = r11.f30658f0
            float r12 = r0 / r12
            r2 = 1065353216(0x3f800000, float:1.0)
            float r12 = r2 - r12
            float r12 = java.lang.Math.abs(r12)
            r6 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r6
            r6 = 1022739087(0x3cf5c28f, float:0.03)
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x01ca
            boolean r6 = r11.f30660g0
            if (r6 == 0) goto L_0x02ba
        L_0x01ca:
            r11.f30660g0 = r5
            float r6 = r11.f30658f0
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x01d8
            if (r4 == 0) goto L_0x01d7
            float r12 = r12 + r2
            r2 = r12
            goto L_0x01d8
        L_0x01d7:
            float r2 = r2 - r12
        L_0x01d8:
            float r12 = r11.C
            double r6 = (double) r12
            float r12 = r11.m0()
            float r4 = r11.f30673n
            float r8 = r11.C
            float r8 = r8 * r2
            float r2 = java.lang.Math.min(r4, r8)
            float r12 = java.lang.Math.max(r12, r2)
            r11.C = r12
            boolean r2 = r11.f30691w
            if (r2 == 0) goto L_0x026c
            android.graphics.PointF r2 = r11.f30653c0
            float r3 = r2.x
            android.graphics.PointF r4 = r11.F
            float r8 = r4.x
            float r8 = r3 - r8
            float r2 = r2.y
            float r4 = r4.y
            float r4 = r2 - r4
            float r9 = r11.D
            float r10 = r12 / r9
            float r8 = r8 * r10
            float r12 = r12 / r9
            float r4 = r4 * r12
            android.graphics.PointF r12 = r11.E
            float r3 = r3 - r8
            r12.x = r3
            float r2 = r2 - r4
            r12.y = r2
            int r12 = r11.B0()
            double r2 = (double) r12
            double r2 = r2 * r6
            int r12 = r11.getHeight()
            double r8 = (double) r12
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x0231
            float r12 = r11.C
            int r2 = r11.B0()
            float r2 = (float) r2
            float r12 = r12 * r2
            int r2 = r11.getHeight()
            float r2 = (float) r2
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0251
        L_0x0231:
            int r12 = r11.C0()
            double r2 = (double) r12
            double r6 = r6 * r2
            int r12 = r11.getWidth()
            double r2 = (double) r12
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x02ba
            float r12 = r11.C
            int r2 = r11.C0()
            float r2 = (float) r2
            float r12 = r12 * r2
            int r2 = r11.getWidth()
            float r2 = (float) r2
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 < 0) goto L_0x02ba
        L_0x0251:
            r11.c0(r5)
            android.graphics.PointF r12 = r11.f30653c0
            android.graphics.PointF r0 = r11.f30664i0
            android.graphics.PointF r0 = r11.I0(r0)
            r12.set(r0)
            android.graphics.PointF r12 = r11.F
            android.graphics.PointF r0 = r11.E
            r12.set(r0)
            float r12 = r11.C
            r11.D = r12
            r0 = r1
            goto L_0x02ba
        L_0x026c:
            android.graphics.PointF r12 = r11.J
            if (r12 == 0) goto L_0x0295
            android.graphics.PointF r12 = r11.E
            int r1 = r11.getWidth()
            int r1 = r1 / r3
            float r1 = (float) r1
            float r2 = r11.C
            android.graphics.PointF r4 = r11.J
            float r4 = r4.x
            float r2 = r2 * r4
            float r1 = r1 - r2
            r12.x = r1
            android.graphics.PointF r12 = r11.E
            int r1 = r11.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            float r2 = r11.C
            android.graphics.PointF r3 = r11.J
            float r3 = r3.y
        L_0x0290:
            float r2 = r2 * r3
            float r1 = r1 - r2
            r12.y = r1
            goto L_0x02ba
        L_0x0295:
            android.graphics.PointF r12 = r11.E
            int r1 = r11.getWidth()
            int r1 = r1 / r3
            float r1 = (float) r1
            float r2 = r11.C
            int r4 = r11.C0()
            int r4 = r4 / r3
            float r4 = (float) r4
            float r2 = r2 * r4
            float r1 = r1 - r2
            r12.x = r1
            android.graphics.PointF r12 = r11.E
            int r1 = r11.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            float r2 = r11.C
            int r4 = r11.B0()
            int r4 = r4 / r3
            float r3 = (float) r4
            goto L_0x0290
        L_0x02ba:
            r11.f30658f0 = r0
            goto L_0x0172
        L_0x02be:
            boolean r0 = r11.P
            if (r0 != 0) goto L_0x0393
            float r0 = r12.getX()
            android.graphics.PointF r2 = r11.f30653c0
            float r2 = r2.x
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = r12.getY()
            android.graphics.PointF r3 = r11.f30653c0
            float r3 = r3.y
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            float r3 = r11.f30696y0
            float r3 = r3 * r1
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x02eb
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x02eb
            boolean r6 = r11.Q
            if (r6 == 0) goto L_0x0393
        L_0x02eb:
            android.graphics.PointF r6 = r11.E
            android.graphics.PointF r7 = r11.F
            float r7 = r7.x
            float r8 = r12.getX()
            android.graphics.PointF r9 = r11.f30653c0
            float r9 = r9.x
            float r8 = r8 - r9
            float r7 = r7 + r8
            r6.x = r7
            android.graphics.PointF r6 = r11.E
            android.graphics.PointF r7 = r11.F
            float r7 = r7.y
            float r12 = r12.getY()
            android.graphics.PointF r8 = r11.f30653c0
            float r8 = r8.y
            float r12 = r12 - r8
            float r7 = r7 + r12
            r6.y = r7
            android.graphics.PointF r12 = r11.E
            float r6 = r12.x
            float r12 = r12.y
            r11.c0(r5)
            android.graphics.PointF r7 = r11.E
            float r8 = r7.x
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0322
            r6 = r5
            goto L_0x0323
        L_0x0322:
            r6 = r4
        L_0x0323:
            float r7 = r7.y
            int r8 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x032b
            r8 = r5
            goto L_0x032c
        L_0x032b:
            r8 = r4
        L_0x032c:
            if (r6 == 0) goto L_0x0338
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0338
            boolean r9 = r11.Q
            if (r9 != 0) goto L_0x0338
            r9 = r5
            goto L_0x0339
        L_0x0338:
            r9 = r4
        L_0x0339:
            if (r8 == 0) goto L_0x0345
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0345
            boolean r0 = r11.Q
            if (r0 != 0) goto L_0x0345
            r0 = r5
            goto L_0x0346
        L_0x0345:
            r0 = r4
        L_0x0346:
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x0353
            r12 = 1077936128(0x40400000, float:3.0)
            float r12 = r12 * r3
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0353
            r12 = r5
            goto L_0x0354
        L_0x0353:
            r12 = r4
        L_0x0354:
            if (r9 != 0) goto L_0x0365
            if (r0 != 0) goto L_0x0365
            if (r6 == 0) goto L_0x0362
            if (r8 == 0) goto L_0x0362
            if (r12 != 0) goto L_0x0362
            boolean r12 = r11.Q
            if (r12 == 0) goto L_0x0365
        L_0x0362:
            r11.Q = r5
            goto L_0x0375
        L_0x0365:
            if (r1 > 0) goto L_0x036b
            int r12 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x0375
        L_0x036b:
            r11.S = r4
            android.os.Handler r12 = r11.f30676o0
            r12.removeMessages(r5)
            r11.y0(r4)
        L_0x0375:
            boolean r12 = r11.f30691w
            if (r12 != 0) goto L_0x0175
            android.graphics.PointF r12 = r11.E
            android.graphics.PointF r0 = r11.F
            float r1 = r0.x
            r12.x = r1
            float r0 = r0.y
            r12.y = r0
            r11.y0(r4)
            goto L_0x0175
        L_0x038a:
            android.os.Handler r12 = r11.f30676o0
            r12.removeMessages(r5)
            r11.invalidate()
            return r5
        L_0x0393:
            return r4
        L_0x0394:
            android.os.Handler r1 = r11.f30676o0
            r1.removeMessages(r5)
            boolean r1 = r11.R
            if (r1 == 0) goto L_0x03aa
            r11.R = r4
            boolean r1 = r11.f30660g0
            if (r1 != 0) goto L_0x03aa
            android.graphics.PointF r1 = r11.f30664i0
            android.graphics.PointF r2 = r11.f30653c0
            r11.W(r1, r2)
        L_0x03aa:
            int r1 = r11.S
            if (r1 <= 0) goto L_0x03f5
            boolean r1 = r11.P
            if (r1 != 0) goto L_0x03b6
            boolean r2 = r11.Q
            if (r2 == 0) goto L_0x03f5
        L_0x03b6:
            if (r1 == 0) goto L_0x03e6
            if (r0 != r3) goto L_0x03e6
            r11.Q = r5
            android.graphics.PointF r1 = r11.F
            android.graphics.PointF r2 = r11.E
            float r6 = r2.x
            float r2 = r2.y
            r1.set(r6, r2)
            int r1 = r12.getActionIndex()
            if (r1 != r5) goto L_0x03db
            android.graphics.PointF r1 = r11.f30653c0
            float r2 = r12.getX(r4)
            float r12 = r12.getY(r4)
        L_0x03d7:
            r1.set(r2, r12)
            goto L_0x03e6
        L_0x03db:
            android.graphics.PointF r1 = r11.f30653c0
            float r2 = r12.getX(r5)
            float r12 = r12.getY(r5)
            goto L_0x03d7
        L_0x03e6:
            r12 = 3
            if (r0 >= r12) goto L_0x03eb
            r11.P = r4
        L_0x03eb:
            if (r0 >= r3) goto L_0x03f1
            r11.Q = r4
            r11.S = r4
        L_0x03f1:
            r11.x0(r5)
            return r5
        L_0x03f5:
            if (r0 != r5) goto L_0x03fd
            r11.P = r4
            r11.Q = r4
            r11.S = r4
        L_0x03fd:
            return r5
        L_0x03fe:
            r1 = 0
            r11.f30668k0 = r1
            r11.y0(r5)
            int r1 = r11.S
            int r1 = java.lang.Math.max(r1, r0)
            r11.S = r1
            if (r0 < r3) goto L_0x0459
            boolean r0 = r11.f30693x
            if (r0 == 0) goto L_0x0451
            float r0 = r12.getX(r4)
            float r1 = r12.getX(r5)
            float r3 = r12.getY(r4)
            float r6 = r12.getY(r5)
            float r0 = r11.V(r0, r1, r3, r6)
            float r1 = r11.C
            r11.D = r1
            r11.f30654d0 = r0
            android.graphics.PointF r0 = r11.F
            android.graphics.PointF r1 = r11.E
            float r3 = r1.x
            float r1 = r1.y
            r0.set(r3, r1)
            android.graphics.PointF r0 = r11.f30653c0
            float r1 = r12.getX(r4)
            float r3 = r12.getX(r5)
            float r1 = r1 + r3
            float r1 = r1 / r2
            float r3 = r12.getY(r4)
            float r12 = r12.getY(r5)
            float r3 = r3 + r12
            float r3 = r3 / r2
            r0.set(r1, r3)
            goto L_0x0453
        L_0x0451:
            r11.S = r4
        L_0x0453:
            android.os.Handler r12 = r11.f30676o0
            r12.removeMessages(r5)
            goto L_0x047c
        L_0x0459:
            boolean r0 = r11.R
            if (r0 != 0) goto L_0x047c
            android.graphics.PointF r0 = r11.F
            android.graphics.PointF r1 = r11.E
            float r2 = r1.x
            float r1 = r1.y
            r0.set(r2, r1)
            android.graphics.PointF r0 = r11.f30653c0
            float r1 = r12.getX()
            float r12 = r12.getY()
            r0.set(r1, r12)
            android.os.Handler r12 = r11.f30676o0
            r0 = 600(0x258, double:2.964E-321)
            r12.sendEmptyMessageDelayed(r5, r0)
        L_0x047c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.c.t0(android.view.MotionEvent):boolean");
    }

    private void u0() {
        Float f10;
        if (getWidth() != 0 && getHeight() != 0 && this.K > 0 && this.L > 0) {
            if (!(this.I == null || (f10 = this.H) == null)) {
                this.C = f10.floatValue();
                if (this.E == null) {
                    this.E = new PointF();
                }
                this.E.x = ((float) (getWidth() / 2)) - (this.C * this.I.x);
                this.E.y = ((float) (getHeight() / 2)) - (this.C * this.I.y);
                this.I = null;
                this.H = null;
                c0(true);
                x0(true);
            }
            c0(false);
        }
    }

    private int v0(int i10) {
        return (int) (this.f30696y0 * ((float) i10));
    }

    private void x0(boolean z10) {
        if (this.V != null && this.f30667k != null) {
            int min = Math.min(this.f30663i, Q(this.C));
            for (Map.Entry value : this.f30667k.entrySet()) {
                for (k kVar : (List) value.getValue()) {
                    if (kVar.f30733b < min || (kVar.f30733b > min && kVar.f30733b != this.f30663i)) {
                        boolean unused = kVar.f30736e = false;
                        if (kVar.f30734c != null) {
                            kVar.f30734c.recycle();
                            Bitmap unused2 = kVar.f30734c = null;
                        }
                    }
                    if (kVar.f30733b == min) {
                        if (M0(kVar)) {
                            boolean unused3 = kVar.f30736e = true;
                            if (!kVar.f30735d && kVar.f30734c == null && z10) {
                                a0(new l(this, this.V, kVar));
                            }
                        } else if (kVar.f30733b != this.f30663i || !this.f30665j) {
                            boolean unused4 = kVar.f30736e = false;
                            if (kVar.f30734c != null) {
                                kVar.f30734c.recycle();
                                Bitmap unused5 = kVar.f30734c = null;
                            }
                        }
                    } else if (kVar.f30733b == this.f30663i) {
                        boolean unused6 = kVar.f30736e = true;
                    }
                }
            }
        }
    }

    private void y0(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    /* JADX INFO: finally extract failed */
    private void z0(boolean z10) {
        U("reset newImage=" + z10, new Object[0]);
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = Float.valueOf(0.0f);
        this.I = null;
        this.J = null;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = 0;
        this.f30663i = 0;
        this.f30653c0 = null;
        this.f30654d0 = 0.0f;
        this.f30658f0 = 0.0f;
        this.f30660g0 = false;
        this.f30664i0 = null;
        this.f30662h0 = null;
        this.f30666j0 = null;
        this.f30668k0 = null;
        this.f30686t0 = null;
        this.f30688u0 = null;
        this.f30690v0 = null;
        if (z10) {
            this.f30661h = null;
            this.W.writeLock().lock();
            try {
                rk.d dVar = this.V;
                if (dVar != null) {
                    dVar.c();
                    this.V = null;
                }
                this.W.writeLock().unlock();
                Bitmap bitmap = this.f30655e;
                if (bitmap != null && !this.f30659g) {
                    bitmap.recycle();
                }
                this.K = 0;
                this.L = 0;
                this.M = 0;
                this.N = null;
                this.O = null;
                this.f30670l0 = false;
                this.f30672m0 = false;
                this.f30655e = null;
                this.f30657f = false;
                this.f30659g = false;
            } catch (Throwable th2) {
                this.W.writeLock().unlock();
                throw th2;
            }
        }
        Map map = this.f30667k;
        if (map != null) {
            for (Map.Entry value : map.entrySet()) {
                for (k kVar : (List) value.getValue()) {
                    boolean unused = kVar.f30736e = false;
                    if (kVar.f30734c != null) {
                        kVar.f30734c.recycle();
                        Bitmap unused2 = kVar.f30734c = null;
                    }
                }
            }
            this.f30667k = null;
        }
        setGestureDetector(getContext());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: qk.c$m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: qk.c$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: qk.c$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: qk.c$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E0(qk.a r9, qk.a r10, qk.b r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x014e
            r0 = 1
            r8.z0(r0)
            if (r11 == 0) goto L_0x000b
            r8.A0(r11)
        L_0x000b:
            java.lang.String r11 = "/"
            java.lang.String r0 = "android.resource://"
            if (r10 == 0) goto L_0x009d
            android.graphics.Bitmap r1 = r9.b()
            if (r1 != 0) goto L_0x0095
            int r1 = r9.f()
            if (r1 <= 0) goto L_0x008d
            int r1 = r9.d()
            if (r1 <= 0) goto L_0x008d
            int r1 = r9.f()
            r8.K = r1
            int r1 = r9.d()
            r8.L = r1
            android.graphics.Rect r1 = r10.e()
            r8.O = r1
            android.graphics.Bitmap r1 = r10.b()
            if (r1 == 0) goto L_0x0049
            boolean r1 = r10.i()
            r8.f30659g = r1
            android.graphics.Bitmap r10 = r10.b()
            r8.p0(r10)
            goto L_0x009d
        L_0x0049:
            android.net.Uri r1 = r10.h()
            if (r1 != 0) goto L_0x007a
            java.lang.Integer r2 = r10.c()
            if (r2 == 0) goto L_0x007a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            android.content.Context r2 = r8.getContext()
            java.lang.String r2 = r2.getPackageName()
            r1.append(r2)
            r1.append(r11)
            java.lang.Integer r10 = r10.c()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.net.Uri r1 = android.net.Uri.parse(r10)
        L_0x007a:
            r6 = r1
            qk.c$f r10 = new qk.c$f
            android.content.Context r4 = r8.getContext()
            rk.b r5 = r8.f30651a0
            r7 = 1
            r2 = r10
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r8.a0(r10)
            goto L_0x009d
        L_0x008d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Preview image cannot be used unless dimensions are provided for the main image"
            r9.<init>(r10)
            throw r9
        L_0x0095:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Preview image cannot be used when a bitmap is provided for the main image"
            r9.<init>(r10)
            throw r9
        L_0x009d:
            android.graphics.Bitmap r10 = r9.b()
            r1 = 0
            if (r10 == 0) goto L_0x00d3
            android.graphics.Rect r10 = r9.e()
            if (r10 == 0) goto L_0x00d3
            android.graphics.Bitmap r10 = r9.b()
            android.graphics.Rect r11 = r9.e()
            int r11 = r11.left
            android.graphics.Rect r0 = r9.e()
            int r0 = r0.top
            android.graphics.Rect r2 = r9.e()
            int r2 = r2.width()
            android.graphics.Rect r9 = r9.e()
            int r9 = r9.height()
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r10, r11, r0, r2, r9)
            r8.o0(r9, r1, r1)
            goto L_0x014d
        L_0x00d3:
            android.graphics.Bitmap r10 = r9.b()
            if (r10 == 0) goto L_0x00e5
            android.graphics.Bitmap r10 = r9.b()
            boolean r9 = r9.i()
            r8.o0(r10, r1, r9)
            goto L_0x014d
        L_0x00e5:
            android.graphics.Rect r10 = r9.e()
            r8.N = r10
            android.net.Uri r10 = r9.h()
            r8.f30661h = r10
            if (r10 != 0) goto L_0x0120
            java.lang.Integer r10 = r9.c()
            if (r10 == 0) goto L_0x0120
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            android.content.Context r0 = r8.getContext()
            java.lang.String r0 = r0.getPackageName()
            r10.append(r0)
            r10.append(r11)
            java.lang.Integer r11 = r9.c()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.net.Uri r10 = android.net.Uri.parse(r10)
            r8.f30661h = r10
        L_0x0120:
            boolean r9 = r9.g()
            if (r9 != 0) goto L_0x013f
            android.graphics.Rect r9 = r8.N
            if (r9 == 0) goto L_0x012b
            goto L_0x013f
        L_0x012b:
            qk.c$f r9 = new qk.c$f
            android.content.Context r2 = r8.getContext()
            rk.b r3 = r8.f30651a0
            android.net.Uri r4 = r8.f30661h
            r5 = 0
            r0 = r9
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x013b:
            r8.a0(r9)
            goto L_0x014d
        L_0x013f:
            qk.c$m r9 = new qk.c$m
            android.content.Context r10 = r8.getContext()
            rk.b r11 = r8.f30652b0
            android.net.Uri r0 = r8.f30661h
            r9.<init>(r8, r10, r11, r0)
            goto L_0x013b
        L_0x014d:
            return
        L_0x014e:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "imageSource must not be null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.c.E0(qk.a, qk.a, qk.b):void");
    }

    public final void G0(float f10, PointF pointF) {
        this.f30668k0 = null;
        this.H = Float.valueOf(f10);
        this.I = pointF;
        this.J = pointF;
        invalidate();
    }

    public final PointF H0(float f10, float f11, PointF pointF) {
        if (this.E == null) {
            return null;
        }
        pointF.set(K0(f10), L0(f11));
        return pointF;
    }

    public final PointF I0(PointF pointF) {
        return H0(pointF.x, pointF.y, new PointF());
    }

    public final PointF O0(float f10, float f11) {
        return P0(f10, f11, new PointF());
    }

    public final PointF P0(float f10, float f11, PointF pointF) {
        if (this.E == null) {
            return null;
        }
        pointF.set(R0(f10), S0(f11));
        return pointF;
    }

    public final PointF Q0(PointF pointF) {
        return P0(pointF.x, pointF.y, new PointF());
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final PointF getCenter() {
        return O0((float) (getWidth() / 2), (float) (getHeight() / 2));
    }

    public float getMaxScale() {
        return this.f30673n;
    }

    public final float getMinScale() {
        return m0();
    }

    public final int getOrientation() {
        return this.f30671m;
    }

    public final int getSHeight() {
        return this.L;
    }

    public final int getSWidth() {
        return this.K;
    }

    public final float getScale() {
        return this.C;
    }

    public final b getState() {
        if (this.E == null || this.K <= 0 || this.L <= 0) {
            return null;
        }
        return new b(getScale(), getCenter(), getOrientation());
    }

    public final boolean j0() {
        return this.f30670l0;
    }

    /* access modifiers changed from: protected */
    public void n0() {
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        T();
        if (this.K != 0 && this.L != 0 && getWidth() != 0 && getHeight() != 0) {
            if (this.f30667k == null && this.V != null) {
                g0(f0(canvas));
            }
            if (S()) {
                u0();
                d dVar = this.f30668k0;
                if (!(dVar == null || dVar.f30707f == null)) {
                    float f11 = this.C;
                    if (this.G == null) {
                        this.G = new PointF(0.0f, 0.0f);
                    }
                    this.G.set(this.E);
                    long currentTimeMillis = System.currentTimeMillis() - this.f30668k0.f30713l;
                    boolean z10 = currentTimeMillis > this.f30668k0.f30709h;
                    long min = Math.min(currentTimeMillis, this.f30668k0.f30709h);
                    this.C = X(this.f30668k0.f30711j, min, this.f30668k0.f30702a, this.f30668k0.f30703b - this.f30668k0.f30702a, this.f30668k0.f30709h);
                    float X = X(this.f30668k0.f30711j, min, this.f30668k0.f30707f.x, this.f30668k0.f30708g.x - this.f30668k0.f30707f.x, this.f30668k0.f30709h);
                    float X2 = X(this.f30668k0.f30711j, min, this.f30668k0.f30707f.y, this.f30668k0.f30708g.y - this.f30668k0.f30707f.y, this.f30668k0.f30709h);
                    this.E.x -= K0(this.f30668k0.f30705d.x) - X;
                    this.E.y -= L0(this.f30668k0.f30705d.y) - X2;
                    c0(z10 || this.f30668k0.f30702a == this.f30668k0.f30703b);
                    D0(f11, this.G, this.f30668k0.f30712k);
                    x0(z10);
                    if (z10) {
                        g unused = this.f30668k0.getClass();
                        this.f30668k0 = null;
                    }
                    invalidate();
                }
                int i15 = 180;
                int i16 = 90;
                if (this.f30667k == null || !i0()) {
                    i10 = 5;
                    Bitmap bitmap = this.f30655e;
                    if (bitmap != null) {
                        float f12 = this.C;
                        if (this.f30657f) {
                            f12 *= ((float) this.K) / ((float) bitmap.getWidth());
                            f10 = this.C * (((float) this.L) / ((float) this.f30655e.getHeight()));
                        } else {
                            f10 = f12;
                        }
                        if (this.f30688u0 == null) {
                            this.f30688u0 = new Matrix();
                        }
                        this.f30688u0.reset();
                        this.f30688u0.postScale(f12, f10);
                        this.f30688u0.postRotate((float) getRequiredRotation());
                        Matrix matrix = this.f30688u0;
                        PointF pointF = this.E;
                        matrix.postTranslate(pointF.x, pointF.y);
                        if (getRequiredRotation() == 180) {
                            Matrix matrix2 = this.f30688u0;
                            float f13 = this.C;
                            matrix2.postTranslate(((float) this.K) * f13, f13 * ((float) this.L));
                        } else if (getRequiredRotation() == 90) {
                            this.f30688u0.postTranslate(this.C * ((float) this.L), 0.0f);
                        } else if (getRequiredRotation() == 270) {
                            this.f30688u0.postTranslate(0.0f, this.C * ((float) this.K));
                        }
                        if (this.f30684s0 != null) {
                            if (this.f30690v0 == null) {
                                this.f30690v0 = new RectF();
                            }
                            this.f30690v0.set(0.0f, 0.0f, (float) (this.f30657f ? this.f30655e.getWidth() : this.K), (float) (this.f30657f ? this.f30655e.getHeight() : this.L));
                            this.f30688u0.mapRect(this.f30690v0);
                            canvas2.drawRect(this.f30690v0, this.f30684s0);
                        }
                        canvas2.drawBitmap(this.f30655e, this.f30688u0, this.f30678p0);
                    }
                } else {
                    int min2 = Math.min(this.f30663i, Q(this.C));
                    boolean z11 = false;
                    for (Map.Entry entry : this.f30667k.entrySet()) {
                        if (((Integer) entry.getKey()).intValue() == min2) {
                            for (k kVar : (List) entry.getValue()) {
                                if (kVar.f30736e && (kVar.f30735d || kVar.f30734c == null)) {
                                    z11 = true;
                                }
                            }
                        }
                    }
                    for (Map.Entry entry2 : this.f30667k.entrySet()) {
                        if (((Integer) entry2.getKey()).intValue() == min2 || z11) {
                            for (k kVar2 : (List) entry2.getValue()) {
                                J0(kVar2.f30732a, kVar2.f30737f);
                                if (kVar2.f30735d || kVar2.f30734c == null) {
                                    i13 = i16;
                                    i12 = i15;
                                    i11 = min2;
                                    i14 = 5;
                                    if (kVar2.f30735d && this.f30669l) {
                                        canvas2.drawText("LOADING", (float) (kVar2.f30737f.left + v0(5)), (float) (kVar2.f30737f.top + v0(35)), this.f30680q0);
                                    }
                                } else {
                                    if (this.f30684s0 != null) {
                                        canvas2.drawRect(kVar2.f30737f, this.f30684s0);
                                    }
                                    if (this.f30688u0 == null) {
                                        this.f30688u0 = new Matrix();
                                    }
                                    this.f30688u0.reset();
                                    i11 = min2;
                                    i14 = 5;
                                    i13 = i16;
                                    i12 = i15;
                                    F0(this.f30692w0, 0.0f, 0.0f, (float) kVar2.f30734c.getWidth(), 0.0f, (float) kVar2.f30734c.getWidth(), (float) kVar2.f30734c.getHeight(), 0.0f, (float) kVar2.f30734c.getHeight());
                                    if (getRequiredRotation() == 0) {
                                        F0(this.f30694x0, (float) kVar2.f30737f.left, (float) kVar2.f30737f.top, (float) kVar2.f30737f.right, (float) kVar2.f30737f.top, (float) kVar2.f30737f.right, (float) kVar2.f30737f.bottom, (float) kVar2.f30737f.left, (float) kVar2.f30737f.bottom);
                                    } else if (getRequiredRotation() == i13) {
                                        F0(this.f30694x0, (float) kVar2.f30737f.right, (float) kVar2.f30737f.top, (float) kVar2.f30737f.right, (float) kVar2.f30737f.bottom, (float) kVar2.f30737f.left, (float) kVar2.f30737f.bottom, (float) kVar2.f30737f.left, (float) kVar2.f30737f.top);
                                    } else if (getRequiredRotation() == i12) {
                                        F0(this.f30694x0, (float) kVar2.f30737f.right, (float) kVar2.f30737f.bottom, (float) kVar2.f30737f.left, (float) kVar2.f30737f.bottom, (float) kVar2.f30737f.left, (float) kVar2.f30737f.top, (float) kVar2.f30737f.right, (float) kVar2.f30737f.top);
                                    } else if (getRequiredRotation() == 270) {
                                        F0(this.f30694x0, (float) kVar2.f30737f.left, (float) kVar2.f30737f.bottom, (float) kVar2.f30737f.left, (float) kVar2.f30737f.top, (float) kVar2.f30737f.right, (float) kVar2.f30737f.top, (float) kVar2.f30737f.right, (float) kVar2.f30737f.bottom);
                                    }
                                    this.f30688u0.setPolyToPoly(this.f30692w0, 0, this.f30694x0, 0, 4);
                                    canvas2.drawBitmap(kVar2.f30734c, this.f30688u0, this.f30678p0);
                                    if (this.f30669l) {
                                        canvas2.drawRect(kVar2.f30737f, this.f30682r0);
                                    }
                                }
                                if (kVar2.f30736e && this.f30669l) {
                                    canvas2.drawText("ISS " + kVar2.f30733b + " RECT " + kVar2.f30732a.top + "," + kVar2.f30732a.left + "," + kVar2.f30732a.bottom + "," + kVar2.f30732a.right, (float) (kVar2.f30737f.left + v0(i14)), (float) (kVar2.f30737f.top + v0(15)), this.f30680q0);
                                }
                                i16 = i13;
                                i15 = i12;
                                min2 = i11;
                            }
                        }
                        i16 = i16;
                        i15 = i15;
                        min2 = min2;
                    }
                    i10 = 5;
                }
                if (this.f30669l) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Scale: ");
                    Locale locale = Locale.ENGLISH;
                    sb2.append(String.format(locale, "%.2f", new Object[]{Float.valueOf(this.C)}));
                    sb2.append(" (");
                    sb2.append(String.format(locale, "%.2f", new Object[]{Float.valueOf(m0())}));
                    sb2.append(" - ");
                    sb2.append(String.format(locale, "%.2f", new Object[]{Float.valueOf(this.f30673n)}));
                    sb2.append(")");
                    canvas2.drawText(sb2.toString(), (float) v0(i10), (float) v0(15), this.f30680q0);
                    canvas2.drawText("Translate: " + String.format(locale, "%.2f", new Object[]{Float.valueOf(this.E.x)}) + ":" + String.format(locale, "%.2f", new Object[]{Float.valueOf(this.E.y)}), (float) v0(i10), (float) v0(30), this.f30680q0);
                    PointF center = getCenter();
                    canvas2.drawText("Source center: " + String.format(locale, "%.2f", new Object[]{Float.valueOf(center.x)}) + ":" + String.format(locale, "%.2f", new Object[]{Float.valueOf(center.y)}), (float) v0(i10), (float) v0(45), this.f30680q0);
                    d dVar2 = this.f30668k0;
                    if (dVar2 != null) {
                        PointF I0 = I0(dVar2.f30704c);
                        PointF I02 = I0(this.f30668k0.f30706e);
                        PointF I03 = I0(this.f30668k0.f30705d);
                        canvas2.drawCircle(I0.x, I0.y, (float) v0(10), this.f30682r0);
                        this.f30682r0.setColor(-65536);
                        canvas2.drawCircle(I02.x, I02.y, (float) v0(20), this.f30682r0);
                        this.f30682r0.setColor(-16776961);
                        canvas2.drawCircle(I03.x, I03.y, (float) v0(25), this.f30682r0);
                        this.f30682r0.setColor(-16711681);
                        canvas2.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) v0(30), this.f30682r0);
                    }
                    if (this.f30653c0 != null) {
                        this.f30682r0.setColor(-65536);
                        PointF pointF2 = this.f30653c0;
                        canvas2.drawCircle(pointF2.x, pointF2.y, (float) v0(20), this.f30682r0);
                    }
                    if (this.f30664i0 != null) {
                        this.f30682r0.setColor(-16776961);
                        canvas2.drawCircle(K0(this.f30664i0.x), L0(this.f30664i0.y), (float) v0(35), this.f30682r0);
                    }
                    if (this.f30666j0 != null && this.R) {
                        this.f30682r0.setColor(-16711681);
                        PointF pointF3 = this.f30666j0;
                        canvas2.drawCircle(pointF3.x, pointF3.y, (float) v0(30), this.f30682r0);
                    }
                    this.f30682r0.setColor(-65281);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = false;
        boolean z11 = mode != 1073741824;
        if (mode2 != 1073741824) {
            z10 = true;
        }
        if (this.K > 0 && this.L > 0) {
            if (z11 && z10) {
                size = C0();
                size2 = B0();
            } else if (z10) {
                size2 = (int) ((((double) B0()) / ((double) C0())) * ((double) size));
            } else if (z11) {
                size = (int) ((((double) C0()) / ((double) B0())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        U("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i10), Integer.valueOf(i11));
        PointF center = getCenter();
        if (this.f30670l0 && center != null) {
            this.f30668k0 = null;
            this.H = Float.valueOf(this.C);
            this.I = center;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        d dVar = this.f30668k0;
        if (dVar == null || dVar.f30710i) {
            d dVar2 = this.f30668k0;
            if (dVar2 != null) {
                g unused = dVar2.getClass();
            }
            this.f30668k0 = null;
            if (this.E == null) {
                GestureDetector gestureDetector2 = this.U;
                if (gestureDetector2 != null) {
                    gestureDetector2.onTouchEvent(motionEvent);
                }
                return true;
            } else if (this.R || ((gestureDetector = this.T) != null && !gestureDetector.onTouchEvent(motionEvent))) {
                if (this.F == null) {
                    this.F = new PointF(0.0f, 0.0f);
                }
                if (this.G == null) {
                    this.G = new PointF(0.0f, 0.0f);
                }
                if (this.f30653c0 == null) {
                    this.f30653c0 = new PointF(0.0f, 0.0f);
                }
                float f10 = this.C;
                this.G.set(this.E);
                boolean t02 = t0(motionEvent);
                D0(f10, this.G, 2);
                return t02 || super.onTouchEvent(motionEvent);
            } else {
                this.P = false;
                this.Q = false;
                this.S = 0;
                return true;
            }
        } else {
            y0(true);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void q0() {
    }

    public final void setBitmapDecoderClass(Class<? extends rk.c> cls) {
        if (cls != null) {
            this.f30651a0 = new rk.a(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setBitmapDecoderFactory(rk.b bVar) {
        if (bVar != null) {
            this.f30651a0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setDebug(boolean z10) {
        this.f30669l = z10;
    }

    public final void setDoubleTapZoomDpi(int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i10));
    }

    public final void setDoubleTapZoomDuration(int i10) {
        this.B = Math.max(0, i10);
    }

    public final void setDoubleTapZoomScale(float f10) {
        this.f30697z = f10;
    }

    public final void setDoubleTapZoomStyle(int i10) {
        if (B0.contains(Integer.valueOf(i10))) {
            this.A = i10;
            return;
        }
        throw new IllegalArgumentException("Invalid zoom style: " + i10);
    }

    public void setEagerLoadingEnabled(boolean z10) {
        this.f30689v = z10;
    }

    public void setExecutor(Executor executor) {
        if (executor != null) {
            this.f30687u = executor;
            return;
        }
        throw new NullPointerException("Executor must not be null");
    }

    public final void setHasBaseLayerTiles(boolean z10) {
        this.f30665j = z10;
    }

    public final void setImage(a aVar) {
        E0(aVar, (a) null, (b) null);
    }

    public final void setMaxScale(float f10) {
        this.f30673n = f10;
    }

    public void setMaxTileSize(int i10) {
        this.f30683s = i10;
        this.f30685t = i10;
    }

    public final void setMaximumDpi(int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i10));
    }

    public final void setMinScale(float f10) {
        this.f30675o = f10;
    }

    public final void setMinimumDpi(int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i10));
    }

    public final void setMinimumScaleType(int i10) {
        if (E0.contains(Integer.valueOf(i10))) {
            this.f30681r = i10;
            if (j0()) {
                c0(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid scale type: " + i10);
    }

    public void setMinimumTileDpi(int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f30677p = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, (float) i10);
        if (j0()) {
            z0(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(h hVar) {
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f30674n0 = onLongClickListener;
    }

    public void setOnStateChangedListener(i iVar) {
    }

    public final void setOrientation(int i10) {
        if (A0.contains(Integer.valueOf(i10))) {
            this.f30671m = i10;
            z0(false);
            invalidate();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i10);
    }

    public final void setPanEnabled(boolean z10) {
        PointF pointF;
        this.f30691w = z10;
        if (!z10 && (pointF = this.E) != null) {
            pointF.x = ((float) (getWidth() / 2)) - (this.C * ((float) (C0() / 2)));
            this.E.y = ((float) (getHeight() / 2)) - (this.C * ((float) (B0() / 2)));
            if (j0()) {
                x0(true);
                invalidate();
            }
        }
    }

    public final void setPanLimit(int i10) {
        if (D0.contains(Integer.valueOf(i10))) {
            this.f30679q = i10;
            if (j0()) {
                c0(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid pan limit: " + i10);
    }

    public final void setQuickScaleEnabled(boolean z10) {
        this.f30695y = z10;
    }

    public final void setRegionDecoderClass(Class<? extends rk.d> cls) {
        if (cls != null) {
            this.f30652b0 = new rk.a(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setRegionDecoderFactory(rk.b bVar) {
        if (bVar != null) {
            this.f30652b0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setTileBackgroundColor(int i10) {
        if (Color.alpha(i10) == 0) {
            this.f30684s0 = null;
        } else {
            Paint paint = new Paint();
            this.f30684s0 = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f30684s0.setColor(i10);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z10) {
        this.f30693x = z10;
    }

    public void w0() {
        z0(true);
        this.f30678p0 = null;
        this.f30680q0 = null;
        this.f30682r0 = null;
        this.f30684s0 = null;
    }
}
