package com.nic.mparivahan.dlservices.utilities;

import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.TextView;
import cm.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import km.d;

public abstract class a {
    public static final void a(TextView textView, String str) {
        String str2;
        if (!b(str)) {
            if (textView != null) {
                textView.setTextColor(-65536);
            }
            if (textView != null) {
                str2 = "Expired";
            } else {
                return;
            }
        } else {
            if (textView != null) {
                textView.setTextColor(-16711936);
            }
            if (textView != null) {
                str2 = "Not Expired";
            } else {
                return;
            }
        }
        textView.setText(str2);
    }

    public static final boolean b(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        try {
            return new Date().before(new SimpleDateFormat("MMM dd, yyyy").parse(str));
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void c(ImageView imageView, String str) {
        l.f(imageView, "view");
        l.f(str, "imageBase64");
        if (str.length() > 0) {
            byte[] bytes = str.getBytes(d.f24740b);
            l.e(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] decode = Base64.decode(bytes, 0);
            l.e(decode, "decode(...)");
            imageView.setImageBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length));
        }
    }
}
