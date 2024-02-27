package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.i;
import java.util.concurrent.Executor;

public abstract class g {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f2462a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f2463b;

        public a(int i10, b[] bVarArr) {
            this.f2462a = i10;
            this.f2463b = bVarArr;
        }

        static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f2463b;
        }

        public int c() {
            return this.f2462a;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f2464a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2465b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2466c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f2467d;

        /* renamed from: e  reason: collision with root package name */
        private final int f2468e;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f2464a = (Uri) androidx.core.util.g.g(uri);
            this.f2465b = i10;
            this.f2466c = i11;
            this.f2467d = z10;
            this.f2468e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f2468e;
        }

        public int c() {
            return this.f2465b;
        }

        public Uri d() {
            return this.f2464a;
        }

        public int e() {
            return this.f2466c;
        }

        public boolean f() {
            return this.f2467d;
        }
    }

    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return i.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        a aVar = new a(cVar, handler);
        return z10 ? f.e(context, eVar, aVar, i10, i11) : f.d(context, eVar, i10, (Executor) null, aVar);
    }
}
