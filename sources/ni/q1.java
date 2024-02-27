package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.databinding.f;
import androidx.databinding.h;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class q1 extends h {
    public final AppCompatEditText A;
    public final AppCompatEditText B;
    public final TextView C;
    public final LinearLayout D;
    public final EditText E;
    public final TextView F;
    public final RelativeLayout G;
    public final Spinner H;
    public final AppCompatEditText I;
    public final LinearLayout J;
    public final AppCompatEditText K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final EditText P;
    public final TextView Q;
    public final TextView R;
    public final dc S;
    public final TextView T;
    public final RadioButton U;
    public final AppCompatEditText V;
    public final LinearLayout W;
    public final LinearLayout X;
    public final TextView Y;
    public final LinearLayout Z;

    /* renamed from: a0  reason: collision with root package name */
    public final TextView f28114a0;

    /* renamed from: b0  reason: collision with root package name */
    public final CheckBox f28115b0;

    /* renamed from: c0  reason: collision with root package name */
    public final CheckBox f28116c0;

    /* renamed from: d0  reason: collision with root package name */
    public final RelativeLayout f28117d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Spinner f28118e0;

    /* renamed from: f0  reason: collision with root package name */
    public final TextView f28119f0;

    /* renamed from: g0  reason: collision with root package name */
    public final TextView f28120g0;

    /* renamed from: h0  reason: collision with root package name */
    public final AppCompatEditText f28121h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AppCompatEditText f28122i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Spinner f28123j0;

    /* renamed from: k0  reason: collision with root package name */
    public final RelativeLayout f28124k0;

    /* renamed from: l0  reason: collision with root package name */
    public final MyTextView f28125l0;

    /* renamed from: m0  reason: collision with root package name */
    public final TextView f28126m0;

    /* renamed from: n0  reason: collision with root package name */
    public final TextView f28127n0;

    /* renamed from: o0  reason: collision with root package name */
    public final RadioGroup f28128o0;

    /* renamed from: p0  reason: collision with root package name */
    public final RadioButton f28129p0;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f28130w;

    /* renamed from: x  reason: collision with root package name */
    public final RecyclerView f28131x;

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout f28132y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f28133z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected q1(Object obj, View view, int i10, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView2, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, TextView textView3, LinearLayout linearLayout2, EditText editText, TextView textView4, RelativeLayout relativeLayout, Spinner spinner, AppCompatEditText appCompatEditText3, LinearLayout linearLayout3, AppCompatEditText appCompatEditText4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, EditText editText2, TextView textView9, TextView textView10, dc dcVar, TextView textView11, RadioButton radioButton, AppCompatEditText appCompatEditText5, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView12, LinearLayout linearLayout6, TextView textView13, CheckBox checkBox, CheckBox checkBox2, RelativeLayout relativeLayout2, Spinner spinner2, TextView textView14, TextView textView15, AppCompatEditText appCompatEditText6, AppCompatEditText appCompatEditText7, Spinner spinner3, RelativeLayout relativeLayout3, MyTextView myTextView, TextView textView16, TextView textView17, RadioGroup radioGroup, RadioButton radioButton2) {
        super(obj, view, i10);
        this.f28130w = textView;
        this.f28131x = recyclerView;
        this.f28132y = linearLayout;
        this.f28133z = textView2;
        this.A = appCompatEditText;
        this.B = appCompatEditText2;
        this.C = textView3;
        this.D = linearLayout2;
        this.E = editText;
        this.F = textView4;
        this.G = relativeLayout;
        this.H = spinner;
        this.I = appCompatEditText3;
        this.J = linearLayout3;
        this.K = appCompatEditText4;
        this.L = textView5;
        this.M = textView6;
        this.N = textView7;
        this.O = textView8;
        this.P = editText2;
        this.Q = textView9;
        this.R = textView10;
        this.S = dcVar;
        this.T = textView11;
        this.U = radioButton;
        this.V = appCompatEditText5;
        this.W = linearLayout4;
        this.X = linearLayout5;
        this.Y = textView12;
        this.Z = linearLayout6;
        this.f28114a0 = textView13;
        this.f28115b0 = checkBox;
        this.f28116c0 = checkBox2;
        this.f28117d0 = relativeLayout2;
        this.f28118e0 = spinner2;
        this.f28119f0 = textView14;
        this.f28120g0 = textView15;
        this.f28121h0 = appCompatEditText6;
        this.f28122i0 = appCompatEditText7;
        this.f28123j0 = spinner3;
        this.f28124k0 = relativeLayout3;
        this.f28125l0 = myTextView;
        this.f28126m0 = textView16;
        this.f28127n0 = textView17;
        this.f28128o0 = radioGroup;
        this.f28129p0 = radioButton2;
    }

    public static q1 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static q1 y(LayoutInflater layoutInflater, Object obj) {
        return (q1) h.o(layoutInflater, R.layout.activity_cov_list, (ViewGroup) null, false, obj);
    }
}
