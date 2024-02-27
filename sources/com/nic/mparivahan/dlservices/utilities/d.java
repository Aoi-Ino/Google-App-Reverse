package com.nic.mparivahan.dlservices.utilities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public abstract class d {
    public static Bitmap a(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String b() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        } catch (Exception e10) {
            e10.printStackTrace();
            return "--";
        }
    }

    public static boolean c(String str) {
        if (str == null) {
            return true;
        }
        return str.equals("");
    }

    public static boolean d(Object obj) {
        if (obj == null || obj == "null") {
            return false;
        }
        if (obj instanceof Collection) {
            return !((Collection) obj).isEmpty();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return !c(str) && !str.equalsIgnoreCase("null");
        }
    }
}
