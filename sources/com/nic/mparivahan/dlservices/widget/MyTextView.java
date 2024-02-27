package com.nic.mparivahan.dlservices.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint({"AppCompatCustomView"})
public final class MyTextView extends TextView {
    public MyTextView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Regular.ttf"), 1);
    }

    public MyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
