package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.c;

public abstract class m implements Spannable {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f2495a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f2496b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2497c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2498d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f2499e;

        /* renamed from: androidx.core.text.m$a$a  reason: collision with other inner class name */
        public static class C0036a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f2500a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f2501b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            /* renamed from: c  reason: collision with root package name */
            private int f2502c = 1;

            /* renamed from: d  reason: collision with root package name */
            private int f2503d = 1;

            public C0036a(TextPaint textPaint) {
                this.f2500a = textPaint;
            }

            public a a() {
                return new a(this.f2500a, this.f2501b, this.f2502c, this.f2503d);
            }

            public C0036a b(int i10) {
                this.f2502c = i10;
                return this;
            }

            public C0036a c(int i10) {
                this.f2503d = i10;
                return this;
            }

            public C0036a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2501b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f2495a = params.getTextPaint();
            this.f2496b = params.getTextDirection();
            this.f2497c = params.getBreakStrategy();
            this.f2498d = params.getHyphenationFrequency();
            this.f2499e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public boolean a(a aVar) {
            if (this.f2497c == aVar.b() && this.f2498d == aVar.c() && this.f2495a.getTextSize() == aVar.e().getTextSize() && this.f2495a.getTextScaleX() == aVar.e().getTextScaleX() && this.f2495a.getTextSkewX() == aVar.e().getTextSkewX() && this.f2495a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f2495a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f2495a.getFlags() == aVar.e().getFlags() && this.f2495a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f2495a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f2495a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f2497c;
        }

        public int c() {
            return this.f2498d;
        }

        public TextDirectionHeuristic d() {
            return this.f2496b;
        }

        public TextPaint e() {
            return this.f2495a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f2496b == aVar.d();
        }

        public int hashCode() {
            return c.b(Float.valueOf(this.f2495a.getTextSize()), Float.valueOf(this.f2495a.getTextScaleX()), Float.valueOf(this.f2495a.getTextSkewX()), Float.valueOf(this.f2495a.getLetterSpacing()), Integer.valueOf(this.f2495a.getFlags()), this.f2495a.getTextLocales(), this.f2495a.getTypeface(), Boolean.valueOf(this.f2495a.isElegantTextHeight()), this.f2496b, Integer.valueOf(this.f2497c), Integer.valueOf(this.f2498d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f2495a.getTextSize());
            sb2.append(", textScaleX=" + this.f2495a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f2495a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f2495a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f2495a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f2495a.getTextLocales());
            sb2.append(", typeface=" + this.f2495a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f2495a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f2496b);
            sb2.append(", breakStrategy=" + this.f2497c);
            sb2.append(", hyphenationFrequency=" + this.f2498d);
            sb2.append("}");
            return sb2.toString();
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            this.f2499e = Build.VERSION.SDK_INT >= 29 ? l.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build() : null;
            this.f2495a = textPaint;
            this.f2496b = textDirectionHeuristic;
            this.f2497c = i10;
            this.f2498d = i11;
        }
    }
}
