package o7;

import com.google.gson.reflect.TypeToken;
import i7.d;
import i7.m;
import i7.r;
import i7.s;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p7.b;
import p7.c;

final class a extends r {

    /* renamed from: b  reason: collision with root package name */
    static final s f14446b = new C0196a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f14447a;

    /* renamed from: o7.a$a  reason: collision with other inner class name */
    class C0196a implements s {
        C0196a() {
        }

        public r a(d dVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new a((C0196a) null);
            }
            return null;
        }
    }

    private a() {
        this.f14447a = new SimpleDateFormat("MMM d, yyyy");
    }

    /* renamed from: e */
    public Date b(p7.a aVar) {
        java.util.Date parse;
        if (aVar.D0() == b.NULL) {
            aVar.s0();
            return null;
        }
        String B0 = aVar.B0();
        try {
            synchronized (this) {
                parse = this.f14447a.parse(B0);
            }
            return new Date(parse.getTime());
        } catch (ParseException e10) {
            throw new m("Failed parsing '" + B0 + "' as SQL Date; at path " + aVar.y(), e10);
        }
    }

    /* renamed from: f */
    public void d(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.R();
            return;
        }
        synchronized (this) {
            format = this.f14447a.format(date);
        }
        cVar.G0(format);
    }

    /* synthetic */ a(C0196a aVar) {
        this();
    }
}
