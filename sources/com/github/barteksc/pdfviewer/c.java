package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.os.AsyncTask;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.a;

class c extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5131a = false;

    /* renamed from: b  reason: collision with root package name */
    private PDFView f5132b;

    /* renamed from: c  reason: collision with root package name */
    private Context f5133c;

    /* renamed from: d  reason: collision with root package name */
    private PdfiumCore f5134d;

    /* renamed from: e  reason: collision with root package name */
    private a f5135e;

    /* renamed from: f  reason: collision with root package name */
    private String f5136f;

    /* renamed from: g  reason: collision with root package name */
    private r2.a f5137g;

    /* renamed from: h  reason: collision with root package name */
    private int f5138h;

    /* renamed from: i  reason: collision with root package name */
    private int f5139i;

    /* renamed from: j  reason: collision with root package name */
    private int f5140j;

    c(r2.a aVar, String str, PDFView pDFView, PdfiumCore pdfiumCore, int i10) {
        this.f5137g = aVar;
        this.f5138h = i10;
        this.f5132b = pDFView;
        this.f5136f = str;
        this.f5134d = pdfiumCore;
        this.f5133c = pDFView.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Throwable doInBackground(Void... voidArr) {
        try {
            a a10 = this.f5137g.a(this.f5133c, this.f5134d, this.f5136f);
            this.f5135e = a10;
            this.f5134d.i(a10, this.f5138h);
            this.f5139i = this.f5134d.f(this.f5135e, this.f5138h);
            this.f5140j = this.f5134d.e(this.f5135e, this.f5138h);
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(Throwable th2) {
        if (th2 != null) {
            this.f5132b.J(th2);
        } else if (!this.f5131a) {
            this.f5132b.I(this.f5135e, this.f5139i, this.f5140j);
        }
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        this.f5131a = true;
    }
}
