package k0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    private final KeyListener f12893a;

    /* renamed from: b  reason: collision with root package name */
    private final a f12894b;

    public static class a {
        public boolean a(Editable editable, int i10, KeyEvent keyEvent) {
            return androidx.emoji2.text.e.f(editable, i10, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f12893a.clearMetaKeyState(view, editable, i10);
    }

    public int getInputType() {
        return this.f12893a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f12894b.a(editable, i10, keyEvent) || this.f12893a.onKeyDown(view, editable, i10, keyEvent);
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f12893a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f12893a.onKeyUp(view, editable, i10, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f12893a = keyListener;
        this.f12894b = aVar;
    }
}