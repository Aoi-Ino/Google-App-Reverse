package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import q4.e;
import q4.i;

class z extends t {

    /* renamed from: e  reason: collision with root package name */
    private int f6536e = e.design_password_eye;

    /* renamed from: f  reason: collision with root package name */
    private EditText f6537f;

    /* renamed from: g  reason: collision with root package name */
    private final View.OnClickListener f6538g = new y(this);

    z(s sVar, int i10) {
        super(sVar);
        if (i10 != 0) {
            this.f6536e = i10;
        }
    }

    private boolean w() {
        EditText editText = this.f6537f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        EditText editText;
        PasswordTransformationMethod instance;
        EditText editText2 = this.f6537f;
        if (editText2 != null) {
            int selectionEnd = editText2.getSelectionEnd();
            if (w()) {
                editText = this.f6537f;
                instance = null;
            } else {
                editText = this.f6537f;
                instance = PasswordTransformationMethod.getInstance();
            }
            editText.setTransformationMethod(instance);
            if (selectionEnd >= 0) {
                this.f6537f.setSelection(selectionEnd);
            }
            r();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(CharSequence charSequence, int i10, int i11, int i12) {
        r();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return i.password_toggle_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f6536e;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f6538g;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return !w();
    }

    /* access modifiers changed from: package-private */
    public void n(EditText editText) {
        this.f6537f = editText;
        r();
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (x(this.f6537f)) {
            this.f6537f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
        EditText editText = this.f6537f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
