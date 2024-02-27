package com.nic.mparivahan.dlservices.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import cm.g;
import cm.l;
import com.nic.mparivahan.R;
import m8.b;

public final class CustomWegetLayout extends LinearLayout {

    /* renamed from: m  reason: collision with root package name */
    public static final a f22401m = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private TextView f22402e;

    /* renamed from: f  reason: collision with root package name */
    private ProgressBar f22403f;

    /* renamed from: g  reason: collision with root package name */
    private String f22404g;

    /* renamed from: h  reason: collision with root package name */
    private int f22405h;

    /* renamed from: i  reason: collision with root package name */
    private int f22406i;

    /* renamed from: j  reason: collision with root package name */
    private int f22407j;

    /* renamed from: k  reason: collision with root package name */
    private int f22408k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f22409l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomWegetLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        l.f(attributeSet, "attrs");
        b(attributeSet);
        a(context);
    }

    private final void a(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        l.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(R.layout.widget_button_layout, this);
        View findViewById = findViewById(R.id.btn_submit);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f22402e = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.progress_bar);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.ProgressBar");
        this.f22403f = (ProgressBar) findViewById2;
        TextView textView = this.f22402e;
        l.c(textView);
        textView.setText(this.f22404g);
        TextView textView2 = this.f22402e;
        l.c(textView2);
        textView2.setTextColor(this.f22405h);
        if (this.f22406i != -1) {
            TextView textView3 = this.f22402e;
            l.c(textView3);
            textView3.setTextSize(0, (float) this.f22406i);
        }
    }

    private final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, b.f13780f0, 0, 0);
        l.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f22404g = obtainStyledAttributes.getString(0);
            this.f22405h = obtainStyledAttributes.getColor(1, -1);
            this.f22406i = obtainStyledAttributes.getDimensionPixelSize(2, -1);
            this.f22407j = obtainStyledAttributes.getColor(3, -1);
            this.f22408k = obtainStyledAttributes.getDimensionPixelSize(4, -1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void d() {
        setEnabled(!this.f22409l);
        ProgressBar progressBar = this.f22403f;
        l.c(progressBar);
        int i10 = 8;
        progressBar.setVisibility(this.f22409l ? 0 : 8);
        TextView textView = this.f22402e;
        l.c(textView);
        if (!this.f22409l) {
            i10 = 0;
        }
        textView.setVisibility(i10);
    }

    public final boolean c(boolean z10) {
        this.f22409l = z10;
        d();
        return z10;
    }

    public final int getProgressColor() {
        return this.f22407j;
    }

    public final String getText() {
        return this.f22404g;
    }

    public final int getTextColor() {
        return this.f22405h;
    }

    public final int getTextSize() {
        return this.f22406i;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int paddingTop = (i11 - getPaddingTop()) - getPaddingBottom();
        ProgressBar progressBar = this.f22403f;
        l.c(progressBar);
        ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
        layoutParams.width = paddingTop;
        layoutParams.height = paddingTop;
        ProgressBar progressBar2 = this.f22403f;
        l.c(progressBar2);
        progressBar2.setLayoutParams(layoutParams);
    }

    public final void setProgressVisible(boolean z10) {
        ProgressBar progressBar = this.f22403f;
        l.c(progressBar);
        progressBar.setVisibility(z10 ? 0 : 8);
    }

    public final void setText(String str) {
        this.f22404g = str;
        TextView textView = this.f22402e;
        l.c(textView);
        textView.setText(this.f22404g);
    }

    public final void setTextColor(int i10) {
        this.f22405h = i10;
        TextView textView = this.f22402e;
        l.c(textView);
        textView.setTextColor(i10);
    }

    public final void setTextSize(int i10) {
        this.f22406i = i10;
        TextView textView = this.f22402e;
        l.c(textView);
        textView.setTextSize(0, (float) this.f22406i);
    }
}
