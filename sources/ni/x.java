package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class x extends h {
    public final CustomWegetLayout A;
    public final ImageView B;
    public final LinearLayout C;
    public final LinearLayout D;
    public final dc E;
    public final yb F;
    public final CustomWegetLayout G;
    public final CardView H;
    public final MyTextView I;
    public final Spinner J;
    public final TextView K;
    public final MyTextView L;
    public final TextView M;
    public final MyTextView N;
    public final AppCompatTextView O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;
    public final EditText S;
    public final TextView T;
    public final EditText U;
    public final TextView V;
    public final EditText W;
    public final TextView X;
    public final EditText Y;
    public final TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final EditText f29248a0;

    /* renamed from: b0  reason: collision with root package name */
    public final TextView f29249b0;

    /* renamed from: c0  reason: collision with root package name */
    public final EditText f29250c0;

    /* renamed from: d0  reason: collision with root package name */
    public final EditText f29251d0;

    /* renamed from: e0  reason: collision with root package name */
    public final TextView f29252e0;

    /* renamed from: w  reason: collision with root package name */
    public final EditText f29253w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f29254x;

    /* renamed from: y  reason: collision with root package name */
    public final EditText f29255y;

    /* renamed from: z  reason: collision with root package name */
    public final LinearLayout f29256z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected x(Object obj, View view, int i10, EditText editText, LinearLayout linearLayout, EditText editText2, LinearLayout linearLayout2, CustomWegetLayout customWegetLayout, ImageView imageView, LinearLayout linearLayout3, LinearLayout linearLayout4, dc dcVar, yb ybVar, CustomWegetLayout customWegetLayout2, CardView cardView, MyTextView myTextView, Spinner spinner, TextView textView, MyTextView myTextView2, TextView textView2, MyTextView myTextView3, AppCompatTextView appCompatTextView, TextView textView3, TextView textView4, TextView textView5, EditText editText3, TextView textView6, EditText editText4, TextView textView7, EditText editText5, TextView textView8, EditText editText6, TextView textView9, EditText editText7, TextView textView10, EditText editText8, EditText editText9, TextView textView11) {
        super(obj, view, i10);
        this.f29253w = editText;
        this.f29254x = linearLayout;
        this.f29255y = editText2;
        this.f29256z = linearLayout2;
        this.A = customWegetLayout;
        this.B = imageView;
        this.C = linearLayout3;
        this.D = linearLayout4;
        this.E = dcVar;
        this.F = ybVar;
        this.G = customWegetLayout2;
        this.H = cardView;
        this.I = myTextView;
        this.J = spinner;
        this.K = textView;
        this.L = myTextView2;
        this.M = textView2;
        this.N = myTextView3;
        this.O = appCompatTextView;
        this.P = textView3;
        this.Q = textView4;
        this.R = textView5;
        this.S = editText3;
        this.T = textView6;
        this.U = editText4;
        this.V = textView7;
        this.W = editText5;
        this.X = textView8;
        this.Y = editText6;
        this.Z = textView9;
        this.f29248a0 = editText7;
        this.f29249b0 = textView10;
        this.f29250c0 = editText8;
        this.f29251d0 = editText9;
        this.f29252e0 = textView11;
    }

    public static x x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static x y(LayoutInflater layoutInflater, Object obj) {
        return (x) h.o(layoutInflater, R.layout.activity_change_name_cl, (ViewGroup) null, false, obj);
    }
}
