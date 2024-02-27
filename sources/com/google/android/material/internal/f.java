package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

public abstract class f {
    private static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean b() {
        return a().equals("meizu");
    }
}
