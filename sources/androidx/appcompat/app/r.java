package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.l;
import androidx.appcompat.view.b;
import androidx.core.view.p;
import f.a;

public abstract class r extends l implements e {

    /* renamed from: h  reason: collision with root package name */
    private g f749h;

    /* renamed from: i  reason: collision with root package name */
    private final p.a f750i = new q(this);

    public r(Context context, int i10) {
        super(context, f(context, i10));
        g e10 = e();
        e10.O(f(context, i10));
        e10.y((Bundle) null);
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void B(b bVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().e(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        e().z();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return p.e(this.f750i, getWindow().getDecorView(), this, keyEvent);
    }

    public g e() {
        if (this.f749h == null) {
            this.f749h = g.i(this, this);
        }
        return this.f749h;
    }

    public b e0(b.a aVar) {
        return null;
    }

    public View findViewById(int i10) {
        return e().j(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int i10) {
        return e().H(i10);
    }

    public void invalidateOptionsMenu() {
        e().u();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        e().t();
        super.onCreate(bundle);
        e().y(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        e().E();
    }

    public void setContentView(int i10) {
        e().J(i10);
    }

    public void setTitle(int i10) {
        super.setTitle(i10);
        e().P(getContext().getString(i10));
    }

    public void v(b bVar) {
    }

    public void setContentView(View view) {
        e().K(view);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().P(charSequence);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().L(view, layoutParams);
    }
}
