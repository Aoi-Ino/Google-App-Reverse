package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.util.g;
import j0.b;
import java.nio.ByteBuffer;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final b f2913a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f2914b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2915c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    private final Typeface f2916d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray f2917a;

        /* renamed from: b  reason: collision with root package name */
        private g f2918b;

        private a() {
            this(1);
        }

        /* access modifiers changed from: package-private */
        public a a(int i10) {
            SparseArray sparseArray = this.f2917a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        /* access modifiers changed from: package-private */
        public final g b() {
            return this.f2918b;
        }

        /* access modifiers changed from: package-private */
        public void c(g gVar, int i10, int i11) {
            a a10 = a(gVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f2917a.put(gVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(gVar, i10 + 1, i11);
            } else {
                a10.f2918b = gVar;
            }
        }

        a(int i10) {
            this.f2917a = new SparseArray(i10);
        }
    }

    private l(Typeface typeface, b bVar) {
        this.f2916d = typeface;
        this.f2913a = bVar;
        this.f2914b = new char[(bVar.k() * 2)];
        a(bVar);
    }

    private void a(b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            g gVar = new g(this, i10);
            Character.toChars(gVar.f(), this.f2914b, i10 * 2);
            h(gVar);
        }
    }

    public static l b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            androidx.core.os.l.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            androidx.core.os.l.b();
        }
    }

    public char[] c() {
        return this.f2914b;
    }

    public b d() {
        return this.f2913a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f2913a.l();
    }

    /* access modifiers changed from: package-private */
    public a f() {
        return this.f2915c;
    }

    /* access modifiers changed from: package-private */
    public Typeface g() {
        return this.f2916d;
    }

    /* access modifiers changed from: package-private */
    public void h(g gVar) {
        g.h(gVar, "emoji metadata cannot be null");
        g.b(gVar.c() > 0, "invalid metadata codepoint length");
        this.f2915c.c(gVar, 0, gVar.c() - 1);
    }
}
