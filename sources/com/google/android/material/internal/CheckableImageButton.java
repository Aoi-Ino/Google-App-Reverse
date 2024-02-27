package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.n;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;

public class CheckableImageButton extends n implements Checkable {

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f6067k = {16842912};

    /* renamed from: h  reason: collision with root package name */
    private boolean f6068h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6069i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6070j;

    class a extends androidx.core.view.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.k0(CheckableImageButton.this.a());
            yVar.l0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends b0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        boolean f6072g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            d(parcel);
        }

        private void d(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f6072g = z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6072g ? 1 : 0);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.imageButtonStyle);
    }

    public boolean a() {
        return this.f6069i;
    }

    public boolean isChecked() {
        return this.f6068h;
    }

    public int[] onCreateDrawableState(int i10) {
        if (!this.f6068h) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f6067k;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.c());
        setChecked(bVar.f6072g);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f6072g = this.f6068h;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f6069i != z10) {
            this.f6069i = z10;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z10) {
        if (this.f6069i && this.f6068h != z10) {
            this.f6068h = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f6070j = z10;
    }

    public void setPressed(boolean z10) {
        if (this.f6070j) {
            super.setPressed(z10);
        }
    }

    public void toggle() {
        setChecked(!this.f6068h);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6069i = true;
        this.f6070j = true;
        m0.q0(this, new a());
    }
}
