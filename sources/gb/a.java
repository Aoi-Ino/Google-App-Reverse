package gb;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import cm.g;
import cm.l;
import java.util.Locale;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0153a f11754a = new C0153a((g) null);

    /* renamed from: gb.a$a  reason: collision with other inner class name */
    public static final class C0153a {

        /* renamed from: gb.a$a$a  reason: collision with other inner class name */
        public static final class C0154a implements TextWatcher {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ EditText f11755e;

            C0154a(EditText editText) {
                this.f11755e = editText;
            }

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                if (charSequence != null && charSequence.length() > 0) {
                    this.f11755e.setError((CharSequence) null);
                }
                String valueOf = String.valueOf(charSequence);
                Locale locale = Locale.getDefault();
                l.e(locale, "getDefault(...)");
                String upperCase = valueOf.toUpperCase(locale);
                l.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
                if (!l.a(valueOf, upperCase)) {
                    Locale locale2 = Locale.getDefault();
                    l.e(locale2, "getDefault(...)");
                    String upperCase2 = valueOf.toUpperCase(locale2);
                    l.e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                    this.f11755e.setText(upperCase2);
                    EditText editText = this.f11755e;
                    editText.setSelection(editText.length());
                }
            }
        }

        private C0153a() {
        }

        public /* synthetic */ C0153a(g gVar) {
            this();
        }

        public final void a(Context context, EditText editText) {
            l.f(context, "context");
            l.f(editText, "editText");
            editText.addTextChangedListener(new C0154a(editText));
        }
    }
}
