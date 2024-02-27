package gl;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    static final StringBuilder f23829a = new StringBuilder();

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    private static class b {
        static int a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    private static class c {
        static int a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    private static class d {
        static j a(Context context) {
            return new s(context);
        }
    }

    private static class e extends Thread {
        public e(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    static class f implements ThreadFactory {
        f() {
        }

        public Thread newThread(Runnable runnable) {
            return new e(runnable);
        }
    }

    static long a(File file) {
        long j10;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j10 = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j10 = 5242880;
        }
        return Math.max(Math.min(j10, 52428800), 5242880);
    }

    static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) p(context, "activity");
        boolean z10 = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z10) {
            memoryClass = b.a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    static void c() {
        if (!s()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static void e(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    static File f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static j g(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return d.a(context);
        } catch (ClassNotFoundException unused) {
            return new d0(context);
        }
    }

    static String h(w wVar) {
        StringBuilder sb2 = f23829a;
        String i10 = i(wVar, sb2);
        sb2.setLength(0);
        return i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String i(gl.w r4, java.lang.StringBuilder r5) {
        /*
            java.lang.String r0 = r4.f23947f
            r1 = 50
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.f23947f
        L_0x0010:
            r5.append(r0)
            goto L_0x002d
        L_0x0014:
            android.net.Uri r0 = r4.f23945d
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            goto L_0x0010
        L_0x0025:
            r5.ensureCapacity(r1)
            int r0 = r4.f23946e
            r5.append(r0)
        L_0x002d:
            r0 = 10
            r5.append(r0)
            float r1 = r4.f23954m
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r2 = 120(0x78, float:1.68E-43)
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "rotation:"
            r5.append(r1)
            float r1 = r4.f23954m
            r5.append(r1)
            boolean r1 = r4.f23957p
            if (r1 == 0) goto L_0x005b
            r1 = 64
            r5.append(r1)
            float r1 = r4.f23955n
            r5.append(r1)
            r5.append(r2)
            float r1 = r4.f23956o
            r5.append(r1)
        L_0x005b:
            r5.append(r0)
        L_0x005e:
            boolean r1 = r4.c()
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = "resize:"
            r5.append(r1)
            int r1 = r4.f23949h
            r5.append(r1)
            r5.append(r2)
            int r1 = r4.f23950i
            r5.append(r1)
            r5.append(r0)
        L_0x0079:
            boolean r1 = r4.f23951j
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = "centerCrop"
        L_0x007f:
            r5.append(r1)
            r5.append(r0)
            goto L_0x008d
        L_0x0086:
            boolean r1 = r4.f23952k
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = "centerInside"
            goto L_0x007f
        L_0x008d:
            java.util.List r1 = r4.f23948g
            if (r1 == 0) goto L_0x00ad
            int r1 = r1.size()
            r2 = 0
        L_0x0096:
            if (r2 >= r1) goto L_0x00ad
            java.util.List r3 = r4.f23948g
            java.lang.Object r3 = r3.get(r2)
            gl.c0 r3 = (gl.c0) r3
            java.lang.String r3 = r3.b()
            r5.append(r3)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x0096
        L_0x00ad:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.e0.i(gl.w, java.lang.StringBuilder):java.lang.String");
    }

    static void j(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000);
    }

    static int k(Bitmap bitmap) {
        int a10 = c.a(bitmap);
        if (a10 >= 0) {
            return a10;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static String l(c cVar) {
        return m(cVar, "");
    }

    static String m(c cVar, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        a h10 = cVar.h();
        if (h10 != null) {
            sb2.append(h10.f23753b.d());
        }
        List i10 = cVar.i();
        if (i10 != null) {
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 > 0 || h10 != null) {
                    sb2.append(", ");
                }
                sb2.append(((a) i10.get(i11)).f23753b.d());
            }
        }
        return sb2.toString();
    }

    static int n(Resources resources, w wVar) {
        Uri uri;
        int i10 = wVar.f23946e;
        if (i10 != 0 || (uri = wVar.f23945d) == null) {
            return i10;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = wVar.f23945d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + wVar.f23945d);
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.f23945d);
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + wVar.f23945d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f23945d);
        }
    }

    static Resources o(Context context, w wVar) {
        Uri uri;
        if (wVar.f23946e != 0 || (uri = wVar.f23945d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.f23945d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f23945d);
        }
    }

    static Object p(Context context, String str) {
        return context.getSystemService(str);
    }

    static boolean q(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean r(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    static boolean s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean t(InputStream inputStream) {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
    }

    static void u(String str, String str2, String str3) {
        v(str, str2, str3, "");
    }

    static void v(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4}));
    }

    static boolean w(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            return "CONDITIONAL_CACHE".equals(split[0]) && Integer.parseInt(split[1]) == 304;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    static byte[] x(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
