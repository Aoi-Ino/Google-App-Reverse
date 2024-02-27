package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class z extends h {
    public final LinearLayout A;
    public final LinearLayout B;
    public final dc C;
    public final yb D;
    public final CustomWegetLayout E;
    public final CardView F;
    public final MyTextView G;
    public final Spinner H;
    public final TextView I;
    public final TextView J;
    public final MyTextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final EditText O;
    public final TextView P;
    public final EditText Q;
    public final TextView R;
    public final EditText S;
    public final TextView T;
    public final EditText U;
    public final TextView V;
    public final EditText W;
    public final TextView X;
    public final EditText Y;
    public final EditText Z;

    /* renamed from: a0  reason: collision with root package name */
    public final TextView f29616a0;

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f29617w;

    /* renamed from: x  reason: collision with root package name */
    public final EditText f29618x;

    /* renamed from: y  reason: collision with root package name */
    public final CustomWegetLayout f29619y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f29620z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected z(Object obj, View view, int i10, LinearLayout linearLayout, EditText editText, CustomWegetLayout customWegetLayout, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, dc dcVar, yb ybVar, CustomWegetLayout customWegetLayout2, CardView cardView, MyTextView myTextView, Spinner spinner, TextView textView, TextView textView2, MyTextView myTextView2, TextView textView3, TextView textView4, TextView textView5, EditText editText2, TextView textView6, EditText editText3, TextView textView7, EditText editText4, TextView textView8, EditText editText5, TextView textView9, EditText editText6, TextView textView10, EditText editText7, EditText editText8, TextView textView11) {
        super(obj, view, i10);
        this.f29617w = linearLayout;
        this.f29618x = editText;
        this.f29619y = customWegetLayout;
        this.f29620z = imageView;
        this.A = linearLayout2;
        this.B = linearLayout3;
        this.C = dcVar;
        this.D = ybVar;
        this.E = customWegetLayout2;
        this.F = cardView;
        this.G = myTextView;
        this.H = spinner;
        this.I = textView;
        this.J = textView2;
        this.K = myTextView2;
        this.L = textView3;
        this.M = textView4;
        this.N = textView5;
        this.O = editText2;
        this.P = textView6;
        this.Q = editText3;
        this.R = textView7;
        this.S = editText4;
        this.T = textView8;
        this.U = editText5;
        this.V = textView9;
        this.W = editText6;
        this.X = textView10;
        this.Y = editText7;
        this.Z = editText8;
        this.f29616a0 = textView11;
    }

    public static z x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static z y(LayoutInflater layoutInflater, Object obj) {
        return (z) h.o(layoutInflater, R.layout.activity_change_name_ll, (ViewGroup) null, false, obj);
    }
}
