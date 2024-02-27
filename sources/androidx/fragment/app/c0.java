package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

final class c0 extends Writer {

    /* renamed from: e  reason: collision with root package name */
    private final String f2958e;

    /* renamed from: f  reason: collision with root package name */
    private StringBuilder f2959f = new StringBuilder(128);

    c0(String str) {
        this.f2958e = str;
    }

    private void c() {
        if (this.f2959f.length() > 0) {
            Log.d(this.f2958e, this.f2959f.toString());
            StringBuilder sb2 = this.f2959f;
            sb2.delete(0, sb2.length());
        }
    }

    public void close() {
        c();
    }

    public void flush() {
        c();
    }

    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == 10) {
                c();
            } else {
                this.f2959f.append(c10);
            }
        }
    }
}
