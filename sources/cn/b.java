package cn;

import cm.g;

public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: u  reason: collision with root package name */
    public static final a f20253u = null;

    /* renamed from: e  reason: collision with root package name */
    private final int f20254e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final b a(int i10) {
            for (b bVar : b.values()) {
                if (bVar.a() == i10) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f20253u = new a((g) null);
    }

    private b(int i10) {
        this.f20254e = i10;
    }

    public final int a() {
        return this.f20254e;
    }
}
