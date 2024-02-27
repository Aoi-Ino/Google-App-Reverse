package w2;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import cm.g;
import cm.l;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import com.yalantis.ucrop.a;
import java.io.File;
import x2.e;

public final class d extends a {

    /* renamed from: i  reason: collision with root package name */
    private static final String f17849i = d.class.getSimpleName();

    /* renamed from: j  reason: collision with root package name */
    public static final a f17850j = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private final int f17851b;

    /* renamed from: c  reason: collision with root package name */
    private final int f17852c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f17853d;

    /* renamed from: e  reason: collision with root package name */
    private final float f17854e;

    /* renamed from: f  reason: collision with root package name */
    private final float f17855f;

    /* renamed from: g  reason: collision with root package name */
    private File f17856g;

    /* renamed from: h  reason: collision with root package name */
    private final File f17857h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        l.f(imagePickerActivity, "activity");
        Intent intent = imagePickerActivity.getIntent();
        l.e(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        extras = extras == null ? new Bundle() : extras;
        l.e(extras, "activity.intent.extras ?: Bundle()");
        this.f17851b = extras.getInt("extra.max_width", 0);
        this.f17852c = extras.getInt("extra.max_height", 0);
        this.f17853d = extras.getBoolean("extra.crop", false);
        this.f17854e = extras.getFloat("extra.crop_x", 0.0f);
        this.f17855f = extras.getFloat("extra.crop_y", 0.0f);
        this.f17857h = b(extras.getString("extra.save_directory"));
    }

    private final void g(Uri uri) {
        int i10;
        e eVar = e.f18194a;
        String d10 = eVar.d(uri);
        File f10 = eVar.f(this.f17857h, d10);
        this.f17856g = f10;
        if (f10 != null) {
            l.c(f10);
            if (f10.exists()) {
                a.C0279a aVar = new a.C0279a();
                aVar.b(eVar.a(d10));
                com.yalantis.ucrop.a f11 = com.yalantis.ucrop.a.b(uri, Uri.fromFile(this.f17856g)).f(aVar);
                float f12 = this.f17854e;
                float f13 = (float) 0;
                if (f12 > f13) {
                    float f14 = this.f17855f;
                    if (f14 > f13) {
                        f11.d(f12, f14);
                    }
                }
                int i11 = this.f17851b;
                if (i11 > 0 && (i10 = this.f17852c) > 0) {
                    f11.e(i11, i10);
                }
                try {
                    f11.c(a(), 69);
                    return;
                } catch (ActivityNotFoundException e10) {
                    e("uCrop not specified in manifest file.Add UCropActivity in Manifest<activity\n    android:name=\"com.yalantis.ucrop.UCropActivity\"\n    android:screenOrientation=\"portrait\"\n    android:theme=\"@style/Theme.AppCompat.Light.NoActionBar\"/>");
                    e10.printStackTrace();
                    return;
                }
            }
        }
        Log.e(f17849i, "Failed to create crop image file");
        d(t2.e.error_failed_to_crop_image);
    }

    private final void i(File file) {
        if (file != null) {
            ImagePickerActivity a10 = a();
            Uri fromFile = Uri.fromFile(file);
            l.e(fromFile, "Uri.fromFile(file)");
            a10.h1(fromFile);
            return;
        }
        d(t2.e.error_failed_to_crop_image);
    }

    /* access modifiers changed from: protected */
    public void c() {
        h();
    }

    public final void h() {
        File file = this.f17856g;
        if (file != null) {
            file.delete();
        }
        this.f17856g = null;
    }

    public final boolean j() {
        return this.f17853d;
    }

    public final void k(int i10, int i11, Intent intent) {
        if (i10 != 69) {
            return;
        }
        if (i11 == -1) {
            i(this.f17856g);
        } else {
            f();
        }
    }

    public void l(Bundle bundle) {
        this.f17856g = (File) (bundle != null ? bundle.getSerializable("state.crop_file") : null);
    }

    public void m(Bundle bundle) {
        l.f(bundle, "outState");
        bundle.putSerializable("state.crop_file", this.f17856g);
    }

    public final void n(Uri uri) {
        l.f(uri, "uri");
        g(uri);
    }
}
