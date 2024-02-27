package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import f5.d;
import f5.f;
import java.lang.ref.WeakReference;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f6198a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final f f6199b = new a();

    /* renamed from: c  reason: collision with root package name */
    private float f6200c;

    /* renamed from: d  reason: collision with root package name */
    private float f6201d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f6202e = true;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public WeakReference f6203f = new WeakReference((Object) null);

    /* renamed from: g  reason: collision with root package name */
    private d f6204g;

    class a extends f {
        a() {
        }

        public void a(int i10) {
            boolean unused = p.this.f6202e = true;
            b bVar = (b) p.this.f6203f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void b(Typeface typeface, boolean z10) {
            if (!z10) {
                boolean unused = p.this.f6202e = true;
                b bVar = (b) p.this.f6203f.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public p(b bVar) {
        i(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f6198a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f6198a.measureText(charSequence, 0, charSequence.length());
    }

    private void h(String str) {
        this.f6200c = d(str);
        this.f6201d = c(str);
        this.f6202e = false;
    }

    public d e() {
        return this.f6204g;
    }

    public TextPaint f() {
        return this.f6198a;
    }

    public float g(String str) {
        if (!this.f6202e) {
            return this.f6200c;
        }
        h(str);
        return this.f6200c;
    }

    public void i(b bVar) {
        this.f6203f = new WeakReference(bVar);
    }

    public void j(d dVar, Context context) {
        if (this.f6204g != dVar) {
            this.f6204g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f6198a, this.f6199b);
                b bVar = (b) this.f6203f.get();
                if (bVar != null) {
                    this.f6198a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f6198a, this.f6199b);
                this.f6202e = true;
            }
            b bVar2 = (b) this.f6203f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z10) {
        this.f6202e = z10;
    }

    public void l(Context context) {
        this.f6204g.n(context, this.f6198a, this.f6199b);
    }
}
