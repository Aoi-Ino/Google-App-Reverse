package o7;

import com.google.gson.reflect.TypeToken;
import i7.d;
import i7.r;
import i7.s;
import java.sql.Timestamp;
import java.util.Date;

class c extends r {

    /* renamed from: b  reason: collision with root package name */
    static final s f14450b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final r f14451a;

    class a implements s {
        a() {
        }

        public r a(d dVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                return new c(dVar.n(Date.class), (a) null);
            }
            return null;
        }
    }

    private c(r rVar) {
        this.f14451a = rVar;
    }

    /* renamed from: e */
    public Timestamp b(p7.a aVar) {
        Date date = (Date) this.f14451a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    /* renamed from: f */
    public void d(p7.c cVar, Timestamp timestamp) {
        this.f14451a.d(cVar, timestamp);
    }

    /* synthetic */ c(r rVar, a aVar) {
        this(rVar);
    }
}
