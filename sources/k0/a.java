package k0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f12879a;

    /* renamed from: b  reason: collision with root package name */
    private int f12880b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private int f12881c = 0;

    /* renamed from: k0.a$a  reason: collision with other inner class name */
    private static class C0168a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final EditText f12882a;

        /* renamed from: b  reason: collision with root package name */
        private final g f12883b;

        C0168a(EditText editText, boolean z10) {
            this.f12882a = editText;
            g gVar = new g(editText, z10);
            this.f12883b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(b.getInstance());
        }

        /* access modifiers changed from: package-private */
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        /* access modifiers changed from: package-private */
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f12882a, inputConnection, editorInfo);
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            this.f12883b.c(z10);
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract KeyListener a(KeyListener keyListener);

        /* access modifiers changed from: package-private */
        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        /* access modifiers changed from: package-private */
        public abstract void c(boolean z10);
    }

    public a(EditText editText, boolean z10) {
        g.h(editText, "editText cannot be null");
        this.f12879a = new C0168a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f12879a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f12879a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f12879a.c(z10);
    }
}
