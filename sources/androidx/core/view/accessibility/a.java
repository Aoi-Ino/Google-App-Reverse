package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f2524a;

    /* renamed from: b  reason: collision with root package name */
    private final y f2525b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2526c;

    public a(int i10, y yVar, int i11) {
        this.f2524a = i10;
        this.f2525b = yVar;
        this.f2526c = i11;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2524a);
        this.f2525b.c0(this.f2526c, bundle);
    }
}
