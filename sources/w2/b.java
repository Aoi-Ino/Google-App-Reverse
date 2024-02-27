package w2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import cm.g;
import cm.l;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import java.io.File;
import java.util.ArrayList;
import x2.e;
import x2.h;
import x2.i;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f17838d = {"android.permission.CAMERA"};

    /* renamed from: e  reason: collision with root package name */
    public static final a f17839e = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private File f17840b;

    /* renamed from: c  reason: collision with root package name */
    private final File f17841c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        l.f(imagePickerActivity, "activity");
        Intent intent = imagePickerActivity.getIntent();
        l.e(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        extras = extras == null ? new Bundle() : extras;
        l.e(extras, "activity.intent.extras ?: Bundle()");
        this.f17841c = b(extras.getString("extra.save_directory"));
    }

    private final void g() {
        if (k(this)) {
            q();
        } else {
            p();
        }
    }

    private final String[] i(Context context) {
        String[] strArr = f17838d;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (i.f18198a.b(context, str)) {
                arrayList.add(str);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final void j() {
        ImagePickerActivity a10 = a();
        Uri fromFile = Uri.fromFile(this.f17840b);
        l.e(fromFile, "Uri.fromFile(mCameraFile)");
        a10.j1(fromFile);
    }

    private final boolean k(Context context) {
        for (String a10 : i(context)) {
            if (true ^ i.f18198a.a(context, a10)) {
                return false;
            }
        }
        return true;
    }

    private final void p() {
        androidx.core.app.b.s(a(), i(a()), 4282);
    }

    private final void q() {
        File g10 = e.g(e.f18194a, this.f17841c, (String) null, 2, (Object) null);
        this.f17840b = g10;
        if (g10 == null || !g10.exists()) {
            d(t2.e.error_failed_to_create_camera_image_file);
            return;
        }
        a().startActivityForResult(h.b(this, g10), 4281);
    }

    /* access modifiers changed from: protected */
    public void c() {
        h();
    }

    public final void h() {
        File file = this.f17840b;
        if (file != null) {
            file.delete();
        }
        this.f17840b = null;
    }

    public final void l(int i10, int i11, Intent intent) {
        if (i10 != 4281) {
            return;
        }
        if (i11 == -1) {
            j();
        } else {
            f();
        }
    }

    public final void m(int i10) {
        if (i10 != 4282) {
            return;
        }
        if (k(this)) {
            r();
            return;
        }
        String string = getString(t2.e.permission_camera_denied);
        l.e(string, "getString(R.string.permission_camera_denied)");
        e(string);
    }

    public void n(Bundle bundle) {
        this.f17840b = (File) (bundle != null ? bundle.getSerializable("state.camera_file") : null);
    }

    public void o(Bundle bundle) {
        l.f(bundle, "outState");
        bundle.putSerializable("state.camera_file", this.f17840b);
    }

    public final void r() {
        if (!h.f(this)) {
            d(t2.e.error_camera_app_not_found);
        } else {
            g();
        }
    }
}
