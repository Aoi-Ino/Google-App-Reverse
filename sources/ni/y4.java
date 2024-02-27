package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class y4 extends h {
    public final AppCompatTextView A;
    public final rc B;
    public final LinearLayout C;
    public final MyTextView D;

    /* renamed from: w  reason: collision with root package name */
    public final EditText f29446w;

    /* renamed from: x  reason: collision with root package name */
    public final AppCompatButton f29447x;

    /* renamed from: y  reason: collision with root package name */
    public final AppCompatButton f29448y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f29449z;

    protected y4(Object obj, View view, int i10, EditText editText, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, TextView textView, AppCompatTextView appCompatTextView, rc rcVar, LinearLayout linearLayout, MyTextView myTextView) {
        super(obj, view, i10);
        this.f29446w = editText;
        this.f29447x = appCompatButton;
        this.f29448y = appCompatButton2;
        this.f29449z = textView;
        this.A = appCompatTextView;
        this.B = rcVar;
        this.C = linearLayout;
        this.D = myTextView;
    }

    public static y4 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static y4 y(LayoutInflater layoutInflater, Object obj) {
        return (y4) h.o(layoutInflater, R.layout.activity_learner_download, (ViewGroup) null, false, obj);
    }
}
