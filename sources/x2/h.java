package x2;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.FileProvider;
import cm.l;
import java.io.File;
import t2.e;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f18197a = new h();

    private h() {
    }

    private final Intent a(Intent intent, String[] strArr) {
        intent.setType("image/*");
        if (!(strArr.length == 0)) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        return intent;
    }

    public static final Intent b(Context context, File file) {
        l.f(context, "context");
        l.f(file, "file");
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", FileProvider.g(context, context.getPackageName() + context.getString(e.image_picker_provider_authority_suffix), file));
        return intent;
    }

    private final Intent c(String[] strArr) {
        Intent a10 = a(new Intent("android.intent.action.OPEN_DOCUMENT"), strArr);
        a10.addCategory("android.intent.category.OPENABLE");
        a10.addFlags(64);
        a10.addFlags(1);
        a10.addFlags(2);
        return a10;
    }

    public static final Intent d(Context context, String[] strArr) {
        l.f(context, "context");
        l.f(strArr, "mimeTypes");
        h hVar = f18197a;
        Intent c10 = hVar.c(strArr);
        return c10.resolveActivity(context.getPackageManager()) != null ? c10 : hVar.e(strArr);
    }

    private final Intent e(String[] strArr) {
        return a(new Intent("android.intent.action.PICK"), strArr);
    }

    public static final boolean f(Context context) {
        l.f(context, "context");
        return new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(context.getPackageManager()) != null;
    }
}
