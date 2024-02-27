package l7;

import com.google.gson.reflect.TypeToken;
import i7.d;
import i7.m;
import i7.r;
import i7.s;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import k7.e;
import k7.j;
import p7.b;

public final class c extends r {

    /* renamed from: b  reason: collision with root package name */
    public static final s f13317b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List f13318a;

    class a implements s {
        a() {
        }

        public r a(d dVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f13318a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (e.d()) {
            arrayList.add(j.c(2, 2));
        }
    }

    private Date e(p7.a aVar) {
        String B0 = aVar.B0();
        synchronized (this.f13318a) {
            try {
                for (DateFormat parse : this.f13318a) {
                    try {
                        Date parse2 = parse.parse(B0);
                        return parse2;
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return m7.a.c(B0, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new m("Failed parsing '" + B0 + "' as Date; at path " + aVar.y(), e10);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: f */
    public Date b(p7.a aVar) {
        if (aVar.D0() != b.NULL) {
            return e(aVar);
        }
        aVar.s0();
        return null;
    }

    /* renamed from: g */
    public void d(p7.c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.R();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f13318a.get(0);
        synchronized (this.f13318a) {
            format = dateFormat.format(date);
        }
        cVar.G0(format);
    }
}
