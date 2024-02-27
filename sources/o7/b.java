package o7;

import com.google.gson.reflect.TypeToken;
import i7.d;
import i7.m;
import i7.r;
import i7.s;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p7.c;

final class b extends r {

    /* renamed from: b  reason: collision with root package name */
    static final s f14448b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f14449a;

    class a implements s {
        a() {
        }

        public r a(d dVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new b((a) null);
            }
            return null;
        }
    }

    private b() {
        this.f14449a = new SimpleDateFormat("hh:mm:ss a");
    }

    /* renamed from: e */
    public Time b(p7.a aVar) {
        Time time;
        if (aVar.D0() == p7.b.NULL) {
            aVar.s0();
            return null;
        }
        String B0 = aVar.B0();
        try {
            synchronized (this) {
                time = new Time(this.f14449a.parse(B0).getTime());
            }
            return time;
        } catch (ParseException e10) {
            throw new m("Failed parsing '" + B0 + "' as SQL Time; at path " + aVar.y(), e10);
        }
    }

    /* renamed from: f */
    public void d(c cVar, Time time) {
        String format;
        if (time == null) {
            cVar.R();
            return;
        }
        synchronized (this) {
            format = this.f14449a.format(time);
        }
        cVar.G0(format);
    }

    /* synthetic */ b(a aVar) {
        this();
    }
}
