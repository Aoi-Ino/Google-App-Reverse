package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.m0;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.q;
import com.google.android.material.internal.u;
import com.google.android.material.textfield.TextInputLayout;
import q4.f;
import q4.h;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Chip f6539e;

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout f6540f;

    /* renamed from: g  reason: collision with root package name */
    private final EditText f6541g;

    /* renamed from: h  reason: collision with root package name */
    private TextWatcher f6542h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f6543i;

    private class b extends q {
        private b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f6539e.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String a10 = ChipTextInputComboView.this.c(editable);
            Chip b10 = ChipTextInputComboView.this.f6539e;
            if (TextUtils.isEmpty(a10)) {
                a10 = ChipTextInputComboView.this.c("00");
            }
            b10.setText(a10);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return e.c(getResources(), charSequence);
    }

    private void d() {
        this.f6541g.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public boolean isChecked() {
        return this.f6539e.isChecked();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    public void setChecked(boolean z10) {
        this.f6539e.setChecked(z10);
        this.f6541g.setVisibility(z10 ? 0 : 4);
        this.f6539e.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            u.k(this.f6541g, false);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6539e.setOnClickListener(onClickListener);
    }

    public void setTag(int i10, Object obj) {
        this.f6539e.setTag(i10, obj);
    }

    public void toggle() {
        this.f6539e.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(h.material_time_chip, this, false);
        this.f6539e = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(h.material_time_input, this, false);
        this.f6540f = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f6541g = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f6542h = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f6543i = (TextView) findViewById(f.material_label);
        editText.setId(m0.k());
        m0.E0(this.f6543i, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
