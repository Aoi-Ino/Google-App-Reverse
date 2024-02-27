package com.google.android.gms.common.api.internal;

import android.os.Looper;
import s3.o;

public abstract class d {
    public static c a(Object obj, Looper looper, String str) {
        o.j(obj, "Listener must not be null");
        o.j(looper, "Looper must not be null");
        o.j(str, "Listener type must not be null");
        return new c(looper, obj, str);
    }
}
