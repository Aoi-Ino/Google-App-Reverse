package w2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import cm.g;
import cm.l;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import x2.h;

public final class e extends a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f17858c = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private final String[] f17859b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        l.f(imagePickerActivity, "activity");
        Intent intent = imagePickerActivity.getIntent();
        l.e(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        extras = extras == null ? new Bundle() : extras;
        l.e(extras, "activity.intent.extras ?: Bundle()");
        String[] stringArray = extras.getStringArray("extra.mime_types");
        this.f17859b = stringArray == null ? new String[0] : stringArray;
    }

    private final void g(Intent intent) {
        Uri data = intent != null ? intent.getData() : null;
        if (data != null) {
            k(data);
            a().j1(data);
            return;
        }
        d(t2.e.error_failed_pick_gallery_image);
    }

    private final void i() {
        a().startActivityForResult(h.d(a(), this.f17859b), 4261);
    }

    private final void k(Uri uri) {
        getContentResolver().takePersistableUriPermission(uri, 1);
    }

    public final void h(int i10, int i11, Intent intent) {
        if (i10 != 4261) {
            return;
        }
        if (i11 == -1) {
            g(intent);
        } else {
            f();
        }
    }

    public final void j() {
        i();
    }
}
