package gl;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public interface j {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final InputStream f23855a;

        /* renamed from: b  reason: collision with root package name */
        final Bitmap f23856b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f23857c;

        /* renamed from: d  reason: collision with root package name */
        final long f23858d;

        public a(InputStream inputStream, boolean z10, long j10) {
            if (inputStream != null) {
                this.f23855a = inputStream;
                this.f23856b = null;
                this.f23857c = z10;
                this.f23858d = j10;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }

        public Bitmap a() {
            return this.f23856b;
        }

        public long b() {
            return this.f23858d;
        }

        public InputStream c() {
            return this.f23855a;
        }
    }

    public static class b extends IOException {

        /* renamed from: e  reason: collision with root package name */
        final boolean f23859e;

        /* renamed from: f  reason: collision with root package name */
        final int f23860f;

        public b(String str, int i10, int i11) {
            super(str);
            this.f23859e = q.a(i10);
            this.f23860f = i11;
        }
    }

    a a(Uri uri, int i10);
}
