package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.s;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.w;
import e5.a;

public class MaterialComponentsViewInflater extends s {
    /* access modifiers changed from: protected */
    public d c(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public f e(Context context, AttributeSet attributeSet) {
        return new v4.d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public androidx.appcompat.widget.s k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new l5.a(context, attributeSet);
    }
}
