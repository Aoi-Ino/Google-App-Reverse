package d1;

import cm.g;
import cm.l;

public final class a implements j {

    /* renamed from: g  reason: collision with root package name */
    public static final C0126a f9661g = new C0126a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final String f9662e;

    /* renamed from: f  reason: collision with root package name */
    private final Object[] f9663f;

    /* renamed from: d1.a$a  reason: collision with other inner class name */
    public static final class C0126a {
        private C0126a() {
        }

        public /* synthetic */ C0126a(g gVar) {
            this();
        }

        private final void a(i iVar, int i10, Object obj) {
            long j10;
            int byteValue;
            double doubleValue;
            if (obj == null) {
                iVar.G(i10);
            } else if (obj instanceof byte[]) {
                iVar.n0(i10, (byte[]) obj);
            } else {
                if (obj instanceof Float) {
                    doubleValue = (double) ((Number) obj).floatValue();
                } else if (obj instanceof Double) {
                    doubleValue = ((Number) obj).doubleValue();
                } else {
                    if (obj instanceof Long) {
                        j10 = ((Number) obj).longValue();
                    } else {
                        if (obj instanceof Integer) {
                            byteValue = ((Number) obj).intValue();
                        } else if (obj instanceof Short) {
                            byteValue = ((Number) obj).shortValue();
                        } else if (obj instanceof Byte) {
                            byteValue = ((Number) obj).byteValue();
                        } else if (obj instanceof String) {
                            iVar.x(i10, (String) obj);
                            return;
                        } else if (obj instanceof Boolean) {
                            j10 = ((Boolean) obj).booleanValue() ? 1 : 0;
                        } else {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                        }
                        j10 = (long) byteValue;
                    }
                    iVar.f0(i10, j10);
                    return;
                }
                iVar.K(i10, doubleValue);
            }
        }

        public final void b(i iVar, Object[] objArr) {
            l.f(iVar, "statement");
            if (objArr != null) {
                int length = objArr.length;
                int i10 = 0;
                while (i10 < length) {
                    Object obj = objArr[i10];
                    i10++;
                    a(iVar, i10, obj);
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(str, (Object[]) null);
        l.f(str, "query");
    }

    public String c() {
        return this.f9662e;
    }

    public void e(i iVar) {
        l.f(iVar, "statement");
        f9661g.b(iVar, this.f9663f);
    }

    public a(String str, Object[] objArr) {
        l.f(str, "query");
        this.f9662e = str;
        this.f9663f = objArr;
    }
}
