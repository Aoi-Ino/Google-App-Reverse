package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.databinding.f;
import androidx.databinding.h;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;

public abstract class j2 extends h {
    public final TextView A;
    public final AppCompatEditText B;
    public final TextView C;
    public final TextView D;
    public final LinearLayout E;
    public final RelativeLayout F;
    public final EditText G;
    public final AppCompatEditText H;
    public final TextView I;
    public final LinearLayout J;
    public final AppCompatEditText K;
    public final TextView L;
    public final rc M;
    public final TextView N;
    public final TextView O;
    public final LinearLayout P;
    public final TextView Q;
    public final CheckBox R;
    public final RelativeLayout S;
    public final AppCompatEditText T;
    public final TextView U;
    public final AppCompatEditText V;
    public final TextView W;
    public final EditText X;
    public final RelativeLayout Y;

    /* renamed from: w  reason: collision with root package name */
    public final RecyclerView f26924w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f26925x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f26926y;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatEditText f26927z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected j2(Object obj, View view, int i10, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView, AppCompatEditText appCompatEditText, TextView textView2, AppCompatEditText appCompatEditText2, TextView textView3, TextView textView4, LinearLayout linearLayout2, RelativeLayout relativeLayout, EditText editText, AppCompatEditText appCompatEditText3, TextView textView5, LinearLayout linearLayout3, AppCompatEditText appCompatEditText4, TextView textView6, rc rcVar, TextView textView7, TextView textView8, LinearLayout linearLayout4, TextView textView9, CheckBox checkBox, RelativeLayout relativeLayout2, AppCompatEditText appCompatEditText5, TextView textView10, AppCompatEditText appCompatEditText6, TextView textView11, EditText editText2, RelativeLayout relativeLayout3) {
        super(obj, view, i10);
        this.f26924w = recyclerView;
        this.f26925x = linearLayout;
        this.f26926y = textView;
        this.f26927z = appCompatEditText;
        this.A = textView2;
        this.B = appCompatEditText2;
        this.C = textView3;
        this.D = textView4;
        this.E = linearLayout2;
        this.F = relativeLayout;
        this.G = editText;
        this.H = appCompatEditText3;
        this.I = textView5;
        this.J = linearLayout3;
        this.K = appCompatEditText4;
        this.L = textView6;
        this.M = rcVar;
        this.N = textView7;
        this.O = textView8;
        this.P = linearLayout4;
        this.Q = textView9;
        this.R = checkBox;
        this.S = relativeLayout2;
        this.T = appCompatEditText5;
        this.U = textView10;
        this.V = appCompatEditText6;
        this.W = textView11;
        this.X = editText2;
        this.Y = relativeLayout3;
    }

    public static j2 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static j2 y(LayoutInflater layoutInflater, Object obj) {
        return (j2) h.o(layoutInflater, R.layout.activity_dl_driving_school, (ViewGroup) null, false, obj);
    }
}
