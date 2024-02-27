package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.y;
import com.google.android.material.internal.CheckableImageButton;

abstract class t {

    /* renamed from: a  reason: collision with root package name */
    final TextInputLayout f6487a;

    /* renamed from: b  reason: collision with root package name */
    final s f6488b;

    /* renamed from: c  reason: collision with root package name */
    final Context f6489c;

    /* renamed from: d  reason: collision with root package name */
    final CheckableImageButton f6490d;

    t(s sVar) {
        this.f6487a = sVar.f6458e;
        this.f6488b = sVar;
        this.f6489c = sVar.getContext();
        this.f6490d = sVar.r();
    }

    /* access modifiers changed from: package-private */
    public void a(Editable editable) {
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener g() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public c.b h() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i10) {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n(EditText editText) {
    }

    /* access modifiers changed from: package-private */
    public void o(View view, y yVar) {
    }

    /* access modifiers changed from: package-private */
    public void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        this.f6488b.L(false);
    }

    /* access modifiers changed from: package-private */
    public void s() {
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
    }
}
