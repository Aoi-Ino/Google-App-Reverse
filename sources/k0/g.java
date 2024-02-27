package k0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class g implements TextWatcher {

    /* renamed from: e  reason: collision with root package name */
    private final EditText f12900e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12901f;

    /* renamed from: g  reason: collision with root package name */
    private e.C0049e f12902g;

    /* renamed from: h  reason: collision with root package name */
    private int f12903h = Integer.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    private int f12904i = 0;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12905j;

    private static class a extends e.C0049e {

        /* renamed from: a  reason: collision with root package name */
        private final Reference f12906a;

        a(EditText editText) {
            this.f12906a = new WeakReference(editText);
        }

        public void b() {
            super.b();
            g.b((EditText) this.f12906a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f12900e = editText;
        this.f12901f = z10;
        this.f12905j = true;
    }

    private e.C0049e a() {
        if (this.f12902g == null) {
            this.f12902g = new a(this.f12900e);
        }
        return this.f12902g;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            e.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return !this.f12905j || (!this.f12901f && !e.h());
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.f12905j != z10) {
            if (this.f12902g != null) {
                e.b().t(this.f12902g);
            }
            this.f12905j = z10;
            if (z10) {
                b(this.f12900e, e.b().d());
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (!this.f12900e.isInEditMode() && !d() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int d10 = e.b().d();
            if (d10 != 0) {
                if (d10 == 1) {
                    e.b().r((Spannable) charSequence, i10, i10 + i12, this.f12903h, this.f12904i);
                    return;
                } else if (d10 != 3) {
                    return;
                }
            }
            e.b().s(a());
        }
    }
}
