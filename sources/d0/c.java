package d0;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.databinding.g;

public abstract class c {

    class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f9660e;

        a(C0125c cVar, d dVar, g gVar, b bVar) {
            this.f9660e = gVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            g gVar = this.f9660e;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    public interface b {
    }

    /* renamed from: d0.c$c  reason: collision with other inner class name */
    public interface C0125c {
    }

    public interface d {
    }

    public static String a(TextView textView) {
        return textView.getText().toString();
    }

    private static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return true;
            }
        }
        return false;
    }

    public static void c(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence == text) {
            return;
        }
        if (charSequence != null || text.length() != 0) {
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!b(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static void d(TextView textView, C0125c cVar, d dVar, b bVar, g gVar) {
        a aVar = (cVar == null && bVar == null && dVar == null && gVar == null) ? null : new a(cVar, dVar, gVar, bVar);
        TextWatcher textWatcher = (TextWatcher) b.a(textView, aVar, f0.a.textWatcher);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }
}
