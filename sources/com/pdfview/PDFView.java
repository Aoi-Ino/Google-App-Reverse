package com.pdfview;

import android.content.Context;
import android.util.AttributeSet;
import cm.g;
import cm.l;
import java.io.File;
import ok.a;
import ok.b;
import qk.c;
import rk.d;

public final class PDFView extends c {
    private File G0;
    private float H0 = 8.0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        setMinimumTileDpi(120);
        setMinimumScaleType(4);
    }

    /* access modifiers changed from: private */
    public static final d W0(PDFView pDFView) {
        l.f(pDFView, "this$0");
        File file = pDFView.G0;
        l.c(file);
        return new a(pDFView, file, pDFView.H0, 0, 8, (g) null);
    }

    public final PDFView U0(File file) {
        l.f(file, "file");
        this.G0 = file;
        return this;
    }

    public final void V0() {
        File file = this.G0;
        l.c(file);
        qk.a m10 = qk.a.m(file.getPath());
        l.e(m10, "uri(mfile!!.path)");
        setRegionDecoderFactory(new b(this));
        setImage(m10);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w0();
    }
}
