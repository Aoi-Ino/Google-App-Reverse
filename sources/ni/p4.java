package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public abstract class p4 extends h {
    public final TextView A;
    public final TextView B;
    public final TextView C;

    /* renamed from: w  reason: collision with root package name */
    public final EditText f27927w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f27928x;

    /* renamed from: y  reason: collision with root package name */
    public final rc f27929y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f27930z;

    protected p4(Object obj, View view, int i10, EditText editText, TextView textView, rc rcVar, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i10);
        this.f27927w = editText;
        this.f27928x = textView;
        this.f27929y = rcVar;
        this.f27930z = textView2;
        this.A = textView3;
        this.B = textView4;
        this.C = textView5;
    }

    public static p4 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static p4 y(LayoutInflater layoutInflater, Object obj) {
        return (p4) h.o(layoutInflater, R.layout.activity_edit_learner_appl, (ViewGroup) null, false, obj);
    }
}
