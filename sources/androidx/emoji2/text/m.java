package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import i0.e;
import java.util.stream.IntStream;

class m implements Spannable {

    /* renamed from: e  reason: collision with root package name */
    private boolean f2919e = false;

    /* renamed from: f  reason: collision with root package name */
    private Spannable f2920f;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence) {
            return false;
        }
    }

    static class c extends b {
        c() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence) {
            return e.a(charSequence);
        }
    }

    m(Spannable spannable) {
        this.f2920f = spannable;
    }

    private void a() {
        Spannable spannable = this.f2920f;
        if (!this.f2919e && c().a(spannable)) {
            this.f2920f = new SpannableString(spannable);
        }
        this.f2919e = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    /* access modifiers changed from: package-private */
    public Spannable b() {
        return this.f2920f;
    }

    public char charAt(int i10) {
        return this.f2920f.charAt(i10);
    }

    public IntStream chars() {
        return a.a(this.f2920f);
    }

    public IntStream codePoints() {
        return a.b(this.f2920f);
    }

    public int getSpanEnd(Object obj) {
        return this.f2920f.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f2920f.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f2920f.getSpanStart(obj);
    }

    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f2920f.getSpans(i10, i11, cls);
    }

    public int length() {
        return this.f2920f.length();
    }

    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f2920f.nextSpanTransition(i10, i11, cls);
    }

    public void removeSpan(Object obj) {
        a();
        this.f2920f.removeSpan(obj);
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f2920f.setSpan(obj, i10, i11, i12);
    }

    public CharSequence subSequence(int i10, int i11) {
        return this.f2920f.subSequence(i10, i11);
    }

    public String toString() {
        return this.f2920f.toString();
    }

    m(CharSequence charSequence) {
        this.f2920f = new SpannableString(charSequence);
    }
}
