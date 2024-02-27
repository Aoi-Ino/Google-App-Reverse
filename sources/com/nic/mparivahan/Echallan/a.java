package com.nic.mparivahan.Echallan;

import cm.g;
import cm.l;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0116a f8906a = new C0116a((g) null);

    /* renamed from: com.nic.mparivahan.Echallan.a$a  reason: collision with other inner class name */
    public static final class C0116a {
        private C0116a() {
        }

        public /* synthetic */ C0116a(g gVar) {
            this();
        }

        public final String a(String str) {
            l.f(str, "date");
            try {
                String format = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str));
                l.e(format, "format(...)");
                return format;
            } catch (ParseException e10) {
                e10.printStackTrace();
                return str;
            }
        }
    }
}
