package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f2361k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f2362a;

    /* renamed from: b  reason: collision with root package name */
    Object f2363b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f2364c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f2365d;

    /* renamed from: e  reason: collision with root package name */
    public int f2366e;

    /* renamed from: f  reason: collision with root package name */
    public int f2367f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2368g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f2369h;

    /* renamed from: i  reason: collision with root package name */
    public String f2370i;

    /* renamed from: j  reason: collision with root package name */
    public String f2371j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int c(Object obj) {
            StringBuilder sb2;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                e = e10;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (InvocationTargetException e11) {
                e = e11;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (NoSuchMethodException e12) {
                e = e12;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
            if (r0 >= 26) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
            r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
            r5 = androidx.core.graphics.drawable.IconCompat.a(r5, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
            r5 = android.graphics.drawable.Icon.createWithBitmap(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
            r0 = r4.f2368g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
            if (r0 == null) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
            r5.setTintList(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
            r4 = r4.f2369h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
            if (r4 == androidx.core.graphics.drawable.IconCompat.f2361k) goto L_0x00b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
            r5.setTintMode(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
            return r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f2362a
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto L_0x00b8;
                    case 0: goto L_0x0008;
                    case 1: goto L_0x00a2;
                    case 2: goto L_0x0097;
                    case 3: goto L_0x008a;
                    case 4: goto L_0x0081;
                    case 5: goto L_0x0073;
                    case 6: goto L_0x0010;
                    default: goto L_0x0008;
                }
            L_0x0008:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L_0x0010:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L_0x0020
                android.net.Uri r5 = r4.h()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.d.a(r5)
                goto L_0x00a7
            L_0x0020:
                if (r5 == 0) goto L_0x0058
                java.io.InputStream r5 = r4.i(r5)
                if (r5 == 0) goto L_0x003d
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L_0x0034
            L_0x002e:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5)
                goto L_0x00a7
            L_0x0034:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.a(r5, r1)
            L_0x0038:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
                goto L_0x00a7
            L_0x003d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.h()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x0058:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.h()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x0073:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L_0x007c
                java.lang.Object r5 = r4.f2363b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                goto L_0x002e
            L_0x007c:
                java.lang.Object r5 = r4.f2363b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                goto L_0x0034
            L_0x0081:
                java.lang.Object r5 = r4.f2363b
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto L_0x00a7
            L_0x008a:
                java.lang.Object r5 = r4.f2363b
                byte[] r5 = (byte[]) r5
                int r0 = r4.f2366e
                int r1 = r4.f2367f
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto L_0x00a7
            L_0x0097:
                java.lang.String r5 = r4.f()
                int r0 = r4.f2366e
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto L_0x00a7
            L_0x00a2:
                java.lang.Object r5 = r4.f2363b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                goto L_0x0038
            L_0x00a7:
                android.content.res.ColorStateList r0 = r4.f2368g
                if (r0 == 0) goto L_0x00ae
                r5.setTintList(r0)
            L_0x00ae:
                android.graphics.PorterDuff$Mode r4 = r4.f2369h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f2361k
                if (r4 == r0) goto L_0x00b7
                r5.setTintMode(r4)
            L_0x00b7:
                return r5
            L_0x00b8:
                java.lang.Object r4 = r4.f2363b
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f2362a = -1;
        this.f2364c = null;
        this.f2365d = null;
        this.f2366e = 0;
        this.f2367f = 0;
        this.f2368g = null;
        this.f2369h = f2361k;
        this.f2370i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = (float) min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        androidx.core.util.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2363b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Resources resources, String str, int i10) {
        androidx.core.util.c.c(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2366e = i10;
            if (resources != null) {
                try {
                    iconCompat.f2363b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2363b = str;
            }
            iconCompat.f2371j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    private static String n(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap d() {
        int i10 = this.f2362a;
        if (i10 == -1) {
            Object obj = this.f2363b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f2363b;
        } else {
            if (i10 == 5) {
                return a((Bitmap) this.f2363b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int e() {
        int i10 = this.f2362a;
        if (i10 == -1) {
            return a.a(this.f2363b);
        }
        if (i10 == 2) {
            return this.f2366e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String f() {
        int i10 = this.f2362a;
        if (i10 == -1) {
            return a.b(this.f2363b);
        }
        if (i10 == 2) {
            String str = this.f2371j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f2363b).split(":", -1)[0] : this.f2371j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i10 = this.f2362a;
        return i10 == -1 ? a.c(this.f2363b) : i10;
    }

    public Uri h() {
        int i10 = this.f2362a;
        if (i10 == -1) {
            return a.d(this.f2363b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f2363b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream i(Context context) {
        StringBuilder sb2;
        String str;
        Uri h10 = h();
        String scheme = h10.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(h10);
            } catch (Exception e10) {
                e = e10;
                sb2 = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb2.append(str);
                sb2.append(h10);
                Log.w("IconCompat", sb2.toString(), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f2363b));
            } catch (FileNotFoundException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str = "Unable to load image from path: ";
                sb2.append(str);
                sb2.append(h10);
                Log.w("IconCompat", sb2.toString(), e);
                return null;
            }
        }
    }

    public void j() {
        Parcelable parcelable;
        this.f2369h = PorterDuff.Mode.valueOf(this.f2370i);
        switch (this.f2362a) {
            case -1:
                parcelable = this.f2365d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 1:
            case 5:
                parcelable = this.f2365d;
                if (parcelable == null) {
                    byte[] bArr = this.f2364c;
                    this.f2363b = bArr;
                    this.f2362a = 3;
                    this.f2366e = 0;
                    this.f2367f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2364c, Charset.forName("UTF-16"));
                this.f2363b = str;
                if (this.f2362a == 2 && this.f2371j == null) {
                    this.f2371j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2363b = this.f2364c;
                return;
            default:
                return;
        }
        this.f2363b = parcelable;
    }

    public void k(boolean z10) {
        this.f2370i = this.f2369h.name();
        switch (this.f2362a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 1:
            case 5:
                if (z10) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f2363b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2364c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f2364c = ((String) this.f2363b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2364c = (byte[]) this.f2363b;
                return;
            case 4:
            case 6:
                this.f2364c = this.f2363b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
        this.f2365d = (Parcelable) this.f2363b;
    }

    public Icon l() {
        return m((Context) null);
    }

    public Icon m(Context context) {
        return a.f(this, context);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r3 = this;
            int r0 = r3.f2362a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r3.f2363b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r3.f2362a
            java.lang.String r1 = n(r1)
            r0.append(r1)
            int r1 = r3.f2362a
            switch(r1) {
                case 1: goto L_0x006b;
                case 2: goto L_0x0046;
                case 3: goto L_0x002d;
                case 4: goto L_0x0022;
                case 5: goto L_0x006b;
                case 6: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0089
        L_0x0022:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r3.f2363b
            r0.append(r1)
            goto L_0x0089
        L_0x002d:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r3.f2366e
            r0.append(r1)
            int r1 = r3.f2367f
            if (r1 == 0) goto L_0x0089
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r3.f2367f
        L_0x0042:
            r0.append(r1)
            goto L_0x0089
        L_0x0046:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r3.f2371j
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            int r1 = r3.e()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x0089
        L_0x006b:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r3.f2363b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r3.f2363b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            goto L_0x0042
        L_0x0089:
            android.content.res.ColorStateList r1 = r3.f2368g
            if (r1 == 0) goto L_0x0097
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r3.f2368g
            r0.append(r1)
        L_0x0097:
            android.graphics.PorterDuff$Mode r1 = r3.f2369h
            android.graphics.PorterDuff$Mode r2 = f2361k
            if (r1 == r2) goto L_0x00a7
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r3.f2369h
            r0.append(r1)
        L_0x00a7:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    IconCompat(int i10) {
        this.f2364c = null;
        this.f2365d = null;
        this.f2366e = 0;
        this.f2367f = 0;
        this.f2368g = null;
        this.f2369h = f2361k;
        this.f2370i = null;
        this.f2362a = i10;
    }
}
