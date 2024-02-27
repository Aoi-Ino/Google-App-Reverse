package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import s3.n;

final class x0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f7598d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private final String f7599a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7600b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7601c;

    private x0(String str, String str2) {
        this.f7599a = d(str2, str);
        this.f7600b = str;
        this.f7601c = str + "!" + str2;
    }

    static x0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new x0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2}));
            str = str.substring(8);
        }
        if (str != null && f7598d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    public String b() {
        return this.f7600b;
    }

    public String c() {
        return this.f7599a;
    }

    public String e() {
        return this.f7601c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f7599a.equals(x0Var.f7599a) && this.f7600b.equals(x0Var.f7600b);
    }

    public int hashCode() {
        return n.b(this.f7600b, this.f7599a);
    }
}
