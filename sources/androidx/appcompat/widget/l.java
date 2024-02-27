package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import f.j;
import k0.f;

class l {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1471a;

    /* renamed from: b  reason: collision with root package name */
    private final f f1472b;

    l(TextView textView) {
        this.f1471a = textView;
        this.f1472b = new f(textView, false);
    }

    /* access modifiers changed from: package-private */
    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1472b.a(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1471a.getContext().obtainStyledAttributes(attributeSet, j.f11209g0, i10, 0);
        try {
            int i11 = j.f11279u0;
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(i11)) {
                z10 = obtainStyledAttributes.getBoolean(i11, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z10) {
        this.f1472b.b(z10);
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z10) {
        this.f1472b.c(z10);
    }
}
