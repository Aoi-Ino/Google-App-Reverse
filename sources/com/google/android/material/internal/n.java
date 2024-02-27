package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

final class n {

    /* renamed from: n  reason: collision with root package name */
    static final int f6184n = 1;

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f6185a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f6186b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6187c;

    /* renamed from: d  reason: collision with root package name */
    private int f6188d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f6189e;

    /* renamed from: f  reason: collision with root package name */
    private Layout.Alignment f6190f;

    /* renamed from: g  reason: collision with root package name */
    private int f6191g;

    /* renamed from: h  reason: collision with root package name */
    private float f6192h;

    /* renamed from: i  reason: collision with root package name */
    private float f6193i;

    /* renamed from: j  reason: collision with root package name */
    private int f6194j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6195k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6196l;

    /* renamed from: m  reason: collision with root package name */
    private TextUtils.TruncateAt f6197m;

    static class a extends Exception {
    }

    private n(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f6185a = charSequence;
        this.f6186b = textPaint;
        this.f6187c = i10;
        this.f6189e = charSequence.length();
        this.f6190f = Layout.Alignment.ALIGN_NORMAL;
        this.f6191g = Integer.MAX_VALUE;
        this.f6192h = 0.0f;
        this.f6193i = 1.0f;
        this.f6194j = f6184n;
        this.f6195k = true;
        this.f6197m = null;
    }

    public static n b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new n(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f6185a == null) {
            this.f6185a = "";
        }
        int max = Math.max(0, this.f6187c);
        CharSequence charSequence = this.f6185a;
        if (this.f6191g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f6186b, (float) max, this.f6197m);
        }
        int min = Math.min(charSequence.length(), this.f6189e);
        this.f6189e = min;
        if (this.f6196l && this.f6191g == 1) {
            this.f6190f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f6188d, min, this.f6186b, max);
        obtain.setAlignment(this.f6190f);
        obtain.setIncludePad(this.f6195k);
        obtain.setTextDirection(this.f6196l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f6197m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f6191g);
        float f10 = this.f6192h;
        if (!(f10 == 0.0f && this.f6193i == 1.0f)) {
            obtain.setLineSpacing(f10, this.f6193i);
        }
        if (this.f6191g > 1) {
            obtain.setHyphenationFrequency(this.f6194j);
        }
        return obtain.build();
    }

    public n c(Layout.Alignment alignment) {
        this.f6190f = alignment;
        return this;
    }

    public n d(TextUtils.TruncateAt truncateAt) {
        this.f6197m = truncateAt;
        return this;
    }

    public n e(int i10) {
        this.f6194j = i10;
        return this;
    }

    public n f(boolean z10) {
        this.f6195k = z10;
        return this;
    }

    public n g(boolean z10) {
        this.f6196l = z10;
        return this;
    }

    public n h(float f10, float f11) {
        this.f6192h = f10;
        this.f6193i = f11;
        return this;
    }

    public n i(int i10) {
        this.f6191g = i10;
        return this;
    }

    public n j(o oVar) {
        return this;
    }
}
