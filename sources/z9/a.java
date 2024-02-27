package z9;

import android.os.Build;
import cm.g;
import cm.l;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0251a f18947a = new C0251a((g) null);

    /* renamed from: z9.a$a  reason: collision with other inner class name */
    public static final class C0251a {
        private C0251a() {
        }

        public /* synthetic */ C0251a(g gVar) {
            this();
        }

        public final String a(String str) {
            l.f(str, "date");
            try {
                String format = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MMM-yyyy").parse(str));
                l.c(format);
                return format;
            } catch (Exception e10) {
                e10.printStackTrace();
                return str;
            }
        }

        public final String b(String str) {
            l.f(str, "date");
            try {
                Locale locale = Locale.ENGLISH;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", locale);
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", locale);
                Date parse = simpleDateFormat.parse(str);
                l.c(parse);
                String format = simpleDateFormat2.format(parse);
                l.e(format, "format(...)");
                return format;
            } catch (ParseException e10) {
                e10.printStackTrace();
                return c(str);
            }
        }

        public final String c(String str) {
            l.f(str, "date");
            try {
                String format = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("MMM dd, yyyy").parse(str));
                l.e(format, "format(...)");
                return format;
            } catch (ParseException e10) {
                e10.printStackTrace();
                return str;
            }
        }

        public final boolean d(String str) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(str).after(new Date());
            } catch (ParseException e10) {
                e10.printStackTrace();
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }

        public final boolean e(String str) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(str).before(new Date());
            } catch (ParseException e10) {
                e10.printStackTrace();
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
            return i(r4);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String f(java.lang.String r4) {
            /*
                r3 = this;
                java.lang.String r0 = "date"
                cm.l.f(r4, r0)
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ ParseException -> 0x0024 }
                r1 = 26
                if (r0 < r1) goto L_0x0026
                j$.time.OffsetDateTime r0 = j$.time.OffsetDateTime.parse(r4)     // Catch:{ Exception -> 0x001f }
                java.lang.String r1 = "dd-MM-yyyy"
                java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x001f }
                j$.time.format.DateTimeFormatter r1 = j$.time.format.DateTimeFormatter.ofPattern(r1, r2)     // Catch:{ Exception -> 0x001f }
                java.lang.String r0 = r1.format(r0)     // Catch:{ Exception -> 0x001f }
                cm.l.c(r0)     // Catch:{ Exception -> 0x001f }
                return r0
            L_0x001f:
                java.lang.String r4 = r3.i(r4)     // Catch:{ ParseException -> 0x0024 }
                return r4
            L_0x0024:
                r0 = move-exception
                goto L_0x0027
            L_0x0026:
                return r4
            L_0x0027:
                r0.printStackTrace()
                java.lang.String r4 = r3.i(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: z9.a.C0251a.f(java.lang.String):java.lang.String");
        }

        public final String g(String str) {
            l.f(str, "date");
            try {
                if (Build.VERSION.SDK_INT < 26) {
                    return str;
                }
                String format = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH).format(OffsetDateTime.parse(str));
                l.c(format);
                return format;
            } catch (Exception e10) {
                e10.printStackTrace();
                return str;
            }
        }

        public final String h(String str) {
            l.f(str, "date");
            try {
                String format = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MM-yyyy").parse(str));
                l.e(format, "format(...)");
                return format;
            } catch (ParseException e10) {
                e10.printStackTrace();
                return str;
            }
        }

        public final String i(String str) {
            l.f(str, "date");
            try {
                String format = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(str));
                l.e(format, "format(...)");
                return format;
            } catch (ParseException e10) {
                e10.printStackTrace();
                return str;
            }
        }

        public final String j(String str, String str2) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                Date parse = simpleDateFormat.parse(str);
                Date parse2 = simpleDateFormat.parse(str2);
                if (parse.compareTo(parse2) < 0) {
                    return String.valueOf(str);
                }
                return parse.compareTo(parse2) > 0 ? String.valueOf(str2) : String.valueOf(str);
            } catch (ParseException e10) {
                e = e10;
                e.printStackTrace();
                return String.valueOf(str);
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                return String.valueOf(str);
            }
        }
    }
}
