package k7;

import i7.g;
import java.io.Writer;
import java.util.Objects;
import p7.c;

public abstract class m {

    private static final class b extends Writer {

        /* renamed from: e  reason: collision with root package name */
        private final Appendable f13085e;

        /* renamed from: f  reason: collision with root package name */
        private final a f13086f = new a();

        private static class a implements CharSequence {

            /* renamed from: e  reason: collision with root package name */
            private char[] f13087e;

            /* renamed from: f  reason: collision with root package name */
            private String f13088f;

            private a() {
            }

            /* access modifiers changed from: package-private */
            public void a(char[] cArr) {
                this.f13087e = cArr;
                this.f13088f = null;
            }

            public char charAt(int i10) {
                return this.f13087e[i10];
            }

            public int length() {
                return this.f13087e.length;
            }

            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f13087e, i10, i11 - i10);
            }

            public String toString() {
                if (this.f13088f == null) {
                    this.f13088f = new String(this.f13087e);
                }
                return this.f13088f;
            }
        }

        b(Appendable appendable) {
            this.f13085e = appendable;
        }

        public Writer append(CharSequence charSequence) {
            this.f13085e.append(charSequence);
            return this;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i10) {
            this.f13085e.append((char) i10);
        }

        public Writer append(CharSequence charSequence, int i10, int i11) {
            this.f13085e.append(charSequence, i10, i11);
            return this;
        }

        public void write(String str, int i10, int i11) {
            Objects.requireNonNull(str);
            this.f13085e.append(str, i10, i11 + i10);
        }

        public void write(char[] cArr, int i10, int i11) {
            this.f13086f.a(cArr);
            this.f13085e.append(this.f13086f, i10, i11 + i10);
        }
    }

    public static void a(g gVar, c cVar) {
        l7.m.V.d(cVar, gVar);
    }

    public static Writer b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }
}
