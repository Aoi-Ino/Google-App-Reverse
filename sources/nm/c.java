package nm;

import bm.l;
import bm.p;
import cm.k;
import im.d;
import lm.j;
import qm.h0;

public abstract class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final j f29932a = new j(-1, (j) null, (b) null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f29933b = k0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f29934c = k0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public static final h0 f29935d = new h0("BUFFERED");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final h0 f29936e = new h0("SHOULD_BUFFER");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final h0 f29937f = new h0("S_RESUMING_BY_RCV");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final h0 f29938g = new h0("RESUMING_BY_EB");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final h0 f29939h = new h0("POISONED");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final h0 f29940i = new h0("DONE_RCV");
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final h0 f29941j = new h0("INTERRUPTED_SEND");
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final h0 f29942k = new h0("INTERRUPTED_RCV");

    /* renamed from: l  reason: collision with root package name */
    private static final h0 f29943l = new h0("CHANNEL_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final h0 f29944m = new h0("SUSPEND");
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final h0 f29945n = new h0("SUSPEND_NO_WAITER");
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final h0 f29946o = new h0("FAILED");
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final h0 f29947p = new h0("NO_RECEIVE_RESULT");
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final h0 f29948q = new h0("CLOSE_HANDLER_CLOSED");
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final h0 f29949r = new h0("CLOSE_HANDLER_INVOKED");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final h0 f29950s = new h0("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends k implements p {

        /* renamed from: n  reason: collision with root package name */
        public static final a f29951n = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return k(((Number) obj).longValue(), (j) obj2);
        }

        public final j k(long j10, j jVar) {
            return c.x(j10, jVar);
        }
    }

    /* access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 != Integer.MAX_VALUE) {
            return (long) i10;
        }
        return Long.MAX_VALUE;
    }

    /* access modifiers changed from: private */
    public static final boolean B(j jVar, Object obj, l lVar) {
        Object t10 = jVar.t(obj, (Object) null, lVar);
        if (t10 == null) {
            return false;
        }
        jVar.r(t10);
        return true;
    }

    static /* synthetic */ boolean C(j jVar, Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return B(jVar, obj, lVar);
    }

    /* access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0) + j10;
    }

    /* access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* access modifiers changed from: private */
    public static final j x(long j10, j jVar) {
        return new j(j10, jVar, jVar.u(), 0);
    }

    public static final d y() {
        return a.f29951n;
    }

    public static final h0 z() {
        return f29943l;
    }
}
