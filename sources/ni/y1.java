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

public abstract class y1 extends h {
    public final EditText A;
    public final TextView B;
    public final rc C;
    public final LinearLayout D;
    public final MyTextView E;
    public final MyTextView F;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f29435w;

    /* renamed from: x  reason: collision with root package name */
    public final AppCompatButton f29436x;

    /* renamed from: y  reason: collision with root package name */
    public final AppCompatButton f29437y;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatTextView f29438z;

    protected y1(Object obj, View view, int i10, TextView textView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatTextView appCompatTextView, EditText editText, TextView textView2, rc rcVar, LinearLayout linearLayout, MyTextView myTextView, MyTextView myTextView2) {
        super(obj, view, i10);
        this.f29435w = textView;
        this.f29436x = appCompatButton;
        this.f29437y = appCompatButton2;
        this.f29438z = appCompatTextView;
        this.A = editText;
        this.B = textView2;
        this.C = rcVar;
        this.D = linearLayout;
        this.E = myTextView;
        this.F = myTextView2;
    }

    public static y1 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static y1 y(LayoutInflater layoutInflater, Object obj) {
        return (y1) h.o(layoutInflater, R.layout.activity_dl_app, (ViewGroup) null, false, obj);
    }
}
