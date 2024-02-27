package w2;

import android.content.ContextWrapper;
import android.os.Environment;
import cm.l;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import java.io.File;

public abstract class a extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final ImagePickerActivity f17837a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        l.f(imagePickerActivity, "activity");
        this.f17837a = imagePickerActivity;
    }

    /* access modifiers changed from: protected */
    public final ImagePickerActivity a() {
        return this.f17837a;
    }

    public final File b(String str) {
        if (str != null) {
            return new File(str);
        }
        File externalFilesDir = getExternalFilesDir(Environment.DIRECTORY_DCIM);
        if (externalFilesDir == null) {
            externalFilesDir = this.f17837a.getFilesDir();
        }
        File file = externalFilesDir;
        l.e(file, "getExternalFilesDir(Envi…CIM) ?: activity.filesDir");
        return file;
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* access modifiers changed from: protected */
    public final void d(int i10) {
        String string = getString(i10);
        l.e(string, "getString(errorRes)");
        e(string);
    }

    /* access modifiers changed from: protected */
    public final void e(String str) {
        l.f(str, "error");
        c();
        this.f17837a.i1(str);
    }

    /* access modifiers changed from: protected */
    public final void f() {
        c();
        this.f17837a.l1();
    }
}
