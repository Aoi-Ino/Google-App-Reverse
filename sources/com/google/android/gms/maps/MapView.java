package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import z3.a;

public class MapView extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    private final d f5447e;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5447e = new d(this, context, GoogleMapOptions.g(context, attributeSet));
        setClickable(true);
    }

    public void a(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f5447e.c(bundle);
            if (this.f5447e.b() == null) {
                a.d(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
