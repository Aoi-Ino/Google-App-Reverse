package x2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import cm.l;
import g0.a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import pl.o;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f18194a = new e();

    private e() {
    }

    private final String c() {
        return "IMG_" + l();
    }

    public static /* synthetic */ File g(e eVar, File file, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return eVar.f(file, str);
    }

    private final String l() {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.getDefault()).format(new Date());
        l.e(format, "SimpleDateFormat(timeFor…Default()).format(Date())");
        return format;
    }

    private final boolean m(Uri uri) {
        return p.o("file", uri.getScheme(), true);
    }

    public final Bitmap.CompressFormat a(String str) {
        l.f(str, "extension");
        if (q.D(str, "png", true)) {
            return Bitmap.CompressFormat.PNG;
        }
        if (q.D(str, "webp", true)) {
            return Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSLESS : Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final a b(Context context, Uri uri) {
        l.f(context, "context");
        l.f(uri, "uri");
        if (!m(uri)) {
            return a.b(context, uri);
        }
        String g10 = c.f18193a.g(context, uri);
        if (g10 != null) {
            return a.a(new File(g10));
        }
        return null;
    }

    public final String d(Uri uri) {
        l.f(uri, "uriImage");
        String str = null;
        try {
            String path = uri.getPath();
            if (!(path == null || q.V(path, ".", 0, false, 6, (Object) null) == -1)) {
                String substring = path.substring(q.V(path, ".", 0, false, 6, (Object) null) + 1);
                l.e(substring, "(this as java.lang.String).substring(startIndex)");
                str = substring;
            }
        } catch (Exception unused) {
        }
        if (str == null || str.length() == 0) {
            str = "jpg";
        }
        return '.' + str;
    }

    public final String e(File file) {
        l.f(file, "file");
        Uri fromFile = Uri.fromFile(file);
        l.e(fromFile, "Uri.fromFile(file)");
        return d(fromFile);
    }

    public final File f(File file, String str) {
        l.f(file, "fileDir");
        if (str == null) {
            str = ".jpg";
        }
        try {
            String str2 = c() + str;
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            file2.createNewFile();
            return file2;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final o h(Context context, Uri uri) {
        l.f(context, "context");
        l.f(uri, "uri");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), (Rect) null, options);
        return new o(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public final o i(File file) {
        l.f(file, "file");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new o(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public final long j(Context context, Uri uri) {
        l.f(context, "context");
        l.f(uri, "uri");
        a b10 = b(context, uri);
        if (b10 != null) {
            return b10.c();
        }
        return 0;
    }

    public final File k(Context context, Uri uri) {
        FileDescriptor fileDescriptor;
        l.f(context, "context");
        l.f(uri, "uri");
        try {
            File file = new File(context.getCacheDir(), "image_picker.png");
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor == null || (fileDescriptor = openFileDescriptor.getFileDescriptor()) == null) {
                return null;
            }
            FileChannel channel = new FileInputStream(fileDescriptor).getChannel();
            FileChannel channel2 = new FileOutputStream(file).getChannel();
            channel2.transferFrom(channel, 0, channel.size());
            channel.close();
            channel2.close();
            return file;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
