package ip;

import java.text.SimpleDateFormat;
import java.util.Date;

enum o {
    FULL("yyyy-MM-dd HH:mm:ss.S z"),
    LONG("yyyy-MM-dd HH:mm:ss z"),
    NORMAL("yyyy-MM-dd z"),
    SHORT("yyyy-MM-dd");
    

    /* renamed from: e  reason: collision with root package name */
    private a f24533e;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDateFormat f24534a;

        public a(String str) {
            this.f24534a = new SimpleDateFormat(str);
        }

        public synchronized Date a(String str) {
            return this.f24534a.parse(str);
        }

        public synchronized String b(Date date) {
            return this.f24534a.format(date);
        }
    }

    private o(String str) {
        this.f24533e = new a(str);
    }

    public static Date a(String str) {
        return d(str).b().a(str);
    }

    private a b() {
        return this.f24533e;
    }

    public static String c(Date date) {
        return FULL.b().b(date);
    }

    public static o d(String str) {
        int length = str.length();
        if (length > 23) {
            return FULL;
        }
        if (length > 20) {
            return LONG;
        }
        return length > 11 ? NORMAL : SHORT;
    }
}
