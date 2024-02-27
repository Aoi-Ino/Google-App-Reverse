package l7;

import i7.m;
import i7.r;
import i7.s;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import k7.e;
import k7.j;
import p7.c;

public final class d extends r {

    /* renamed from: a  reason: collision with root package name */
    private final b f13319a;

    /* renamed from: b  reason: collision with root package name */
    private final List f13320b;

    public static abstract class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f13321b = new a(Date.class);

        /* renamed from: a  reason: collision with root package name */
        private final Class f13322a;

        class a extends b {
            a(Class cls) {
                super(cls);
            }

            /* access modifiers changed from: protected */
            public Date d(Date date) {
                return date;
            }
        }

        protected b(Class cls) {
            this.f13322a = cls;
        }

        private final s c(d dVar) {
            return m.a(this.f13322a, dVar);
        }

        public final s a(int i10, int i11) {
            return c(new d(this, i10, i11));
        }

        public final s b(String str) {
            return c(new d(this, str));
        }

        /* access modifiers changed from: protected */
        public abstract Date d(Date date);
    }

    private d(b bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f13320b = arrayList;
        Objects.requireNonNull(bVar);
        this.f13319a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (e.d()) {
            arrayList.add(j.c(i10, i11));
        }
    }

    private Date e(p7.a aVar) {
        String B0 = aVar.B0();
        synchronized (this.f13320b) {
            try {
                for (DateFormat parse : this.f13320b) {
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
        if (aVar.D0() == p7.b.NULL) {
            aVar.s0();
            return null;
        }
        return this.f13319a.d(e(aVar));
    }

    /* renamed from: g */
    public void d(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.R();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f13320b.get(0);
        synchronized (this.f13320b) {
            format = dateFormat.format(date);
        }
        cVar.G0(format);
    }

    public String toString() {
        StringBuilder sb2;
        String simpleName;
        DateFormat dateFormat = (DateFormat) this.f13320b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb2 = new StringBuilder();
            sb2.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb2 = new StringBuilder();
            sb2.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb2.append(simpleName);
        sb2.append(')');
        return sb2.toString();
    }

    private d(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f13320b = arrayList;
        Objects.requireNonNull(bVar);
        this.f13319a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }
}
