package com.nic.mparivahan.dlservices.utilities;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import cm.l;
import hc.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f22375a = "NextGen mParivahan";

    /* renamed from: b  reason: collision with root package name */
    private static final String f22376b = "OK";

    /* renamed from: c  reason: collision with root package name */
    private static final String f22377c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f22378d;

    /* renamed from: e  reason: collision with root package name */
    private static String f22379e = "2";

    /* renamed from: f  reason: collision with root package name */
    private static String f22380f = "1";

    /* renamed from: g  reason: collision with root package name */
    private static String f22381g = "ANDROID";

    static {
        StringBuilder sb2 = new StringBuilder();
        a.C0155a aVar = a.f12073a;
        sb2.append(aVar.y());
        sb2.append("dms-sarthi/search-dms?applno=");
        f22377c = sb2.toString();
        f22378d = aVar.A();
    }

    public static final String a(Context context, Uri uri) {
        InputStream inputStream;
        l.f(context, "context");
        byte[] bArr = null;
        new File(uri != null ? uri.getPath() : null);
        if (uri != null) {
            try {
                inputStream = context.getContentResolver().openInputStream(uri);
            } catch (FileNotFoundException e10) {
                e = e10;
                e.printStackTrace();
                return "";
            } catch (IOException e11) {
                e = e11;
                e.printStackTrace();
                return "";
            }
        } else {
            inputStream = null;
        }
        if (inputStream != null) {
            bArr = new byte[inputStream.available()];
        }
        if (inputStream != null) {
            inputStream.read(bArr);
        }
        String encodeToString = Base64.encodeToString(bArr, 0);
        l.c(encodeToString);
        String w10 = p.w(p.w(encodeToString, "\n", "", false, 4, (Object) null), "\r", "", false, 4, (Object) null);
        System.out.println(w10);
        return w10;
    }

    public static final String b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 30, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l.e(byteArray, "toByteArray(...)");
        String encodeToString = Base64.encodeToString(byteArray, 0);
        l.c(encodeToString);
        String w10 = p.w(p.w(encodeToString, "\n", "", false, 4, (Object) null), "\r", "", false, 4, (Object) null);
        l.c(w10);
        return w10;
    }

    public static final Bitmap c(String str) {
        l.f(str, "base64");
        byte[] decode = Base64.decode(str, 0);
        l.e(decode, "decode(...)");
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static final boolean d(Activity activity) {
        l.f(activity, "activity");
        b bVar = b.f22373a;
        if (!bVar.c() || bVar.b(activity)) {
            return true;
        }
        bVar.e(activity, 222);
        return false;
    }

    public static final boolean e(Activity activity) {
        l.f(activity, "activity");
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        b bVar = b.f22373a;
        if (!bVar.c() || bVar.d(activity)) {
            return true;
        }
        bVar.f(activity, 666);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String f(android.graphics.Bitmap r7) {
        /*
            java.lang.String r0 = "image"
            cm.l.f(r7, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 100
            r7.compress(r1, r2, r0)
            byte[] r2 = r0.toByteArray()
            int r2 = r2.length
            int r2 = r2 / 1024
            r3 = 800(0x320, float:1.121E-42)
            if (r2 <= r3) goto L_0x0024
            r0.reset()
            r2 = 50
            r7.compress(r1, r2, r0)
        L_0x0024:
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            byte[] r1 = r0.toByteArray()
            r7.<init>(r1)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r2 = 1
            r1.inJustDecodeBounds = r2
            r3 = 0
            android.graphics.BitmapFactory.decodeStream(r7, r3, r1)
            r7 = 0
            r1.inJustDecodeBounds = r7
            int r7 = r1.outWidth
            int r4 = r1.outHeight
            if (r7 <= r4) goto L_0x004d
            float r5 = (float) r7
            r6 = 1139802112(0x43f00000, float:480.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            float r7 = (float) r7
            float r7 = r7 / r6
        L_0x004b:
            int r7 = (int) r7
            goto L_0x005a
        L_0x004d:
            if (r7 >= r4) goto L_0x0059
            float r7 = (float) r4
            r5 = 1145569280(0x44480000, float:800.0)
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0059
            float r7 = (float) r4
            float r7 = r7 / r5
            goto L_0x004b
        L_0x0059:
            r7 = r2
        L_0x005a:
            if (r7 > 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r2 = r7
        L_0x005e:
            r1.inSampleSize = r2
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.toByteArray()
            r7.<init>(r0)
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7, r3, r1)
            java.lang.String r7 = g(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.utilities.e.f(android.graphics.Bitmap):java.lang.String");
    }

    public static final String g(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        l.c(bitmap);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
        int i10 = 100;
        while (byteArrayOutputStream.toByteArray().length / 1024 > 100) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
            i10 -= 10;
        }
        return p.w(p.w(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0), "\n", "", false, 4, (Object) null), "\r", "", false, 4, (Object) null);
    }

    public static final String h(String str, String str2) {
        l.f(str, "request");
        l.f(str2, "key");
        return zi.a.f33201a.a(str, str2);
    }

    public static final String i(int i10) {
        return zi.a.f33201a.a(String.valueOf(i10), f22378d);
    }

    public static final String j(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static final String k(String str, String str2, String str3) {
        l.f(str2, "inFormType");
        l.f(str3, "outFormType");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str3);
        try {
            Date parse = simpleDateFormat.parse(str);
            l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static final String l(int i10) {
        String str = f22378d;
        String substring = str.substring(0, str.length() - 5);
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring + i10;
    }

    public static final String m() {
        return f22377c;
    }

    public static final String n() {
        return f22375a;
    }

    public static final String o() {
        return f22376b;
    }

    public static final int p(double d10, double d11) {
        return (int) (((double) ((int) (Math.random() * ((d11 - d10) + ((double) 1))))) + d10);
    }

    public static final String q(Context context, Uri uri) {
        l.f(context, "context");
        l.f(uri, "uri");
        Cursor query = context.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        l.c(query);
        int columnIndex = query.getColumnIndex("_display_name");
        query.moveToFirst();
        String string = query.getString(columnIndex);
        l.e(string, "getString(...)");
        return string;
    }

    public static final String r(Context context, Uri uri) {
        l.f(context, "context");
        l.f(uri, "uri");
        return String.valueOf(MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)));
    }
}
