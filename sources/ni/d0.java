package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class d0 extends h {
    public final EditText A;
    public final TextView A0;
    public final EditText B;
    public final TextView B0;
    public final EditText C;
    public final TextView C0;
    public final EditText D;
    public final RadioButton D0;
    public final EditText E;
    public final RadioGroup E0;
    public final EditText F;
    protected DlAddress F0;
    public final EditText G;
    public final RadioButton H;
    public final RadioButton I;
    public final RadioGroup J;
    public final EditText K;
    public final EditText L;
    public final EditText M;
    public final EditText N;
    public final EditText O;
    public final ImageView P;
    public final LinearLayout Q;
    public final LinearLayout R;
    public final TextView S;
    public final ImageView T;
    public final LinearLayout U;
    public final LinearLayout V;
    public final dc W;
    public final yb X;
    public final ImageView Y;
    public final ImageView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final ImageView f25820a0;

    /* renamed from: b0  reason: collision with root package name */
    public final ImageView f25821b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ProgressBar f25822c0;

    /* renamed from: d0  reason: collision with root package name */
    public final MyTextView f25823d0;

    /* renamed from: e0  reason: collision with root package name */
    public final MyTextView f25824e0;

    /* renamed from: f0  reason: collision with root package name */
    public final CardView f25825f0;

    /* renamed from: g0  reason: collision with root package name */
    public final CheckBox f25826g0;

    /* renamed from: h0  reason: collision with root package name */
    public final CustomWegetLayout f25827h0;

    /* renamed from: i0  reason: collision with root package name */
    public final RadioButton f25828i0;

    /* renamed from: j0  reason: collision with root package name */
    public final TextView f25829j0;

    /* renamed from: k0  reason: collision with root package name */
    public final TextView f25830k0;

    /* renamed from: l0  reason: collision with root package name */
    public final TextView f25831l0;

    /* renamed from: m0  reason: collision with root package name */
    public final MyTextView f25832m0;

    /* renamed from: n0  reason: collision with root package name */
    public final MyTextView f25833n0;

    /* renamed from: o0  reason: collision with root package name */
    public final TextView f25834o0;

    /* renamed from: p0  reason: collision with root package name */
    public final TextView f25835p0;

    /* renamed from: q0  reason: collision with root package name */
    public final TextView f25836q0;

    /* renamed from: r0  reason: collision with root package name */
    public final TextView f25837r0;

    /* renamed from: s0  reason: collision with root package name */
    public final TextView f25838s0;

    /* renamed from: t0  reason: collision with root package name */
    public final TextView f25839t0;

    /* renamed from: u0  reason: collision with root package name */
    public final TextView f25840u0;

    /* renamed from: v0  reason: collision with root package name */
    public final TextView f25841v0;

    /* renamed from: w  reason: collision with root package name */
    public final EditText f25842w;

    /* renamed from: w0  reason: collision with root package name */
    public final TextView f25843w0;

    /* renamed from: x  reason: collision with root package name */
    public final EditText f25844x;

    /* renamed from: x0  reason: collision with root package name */
    public final TextView f25845x0;

    /* renamed from: y  reason: collision with root package name */
    public final EditText f25846y;

    /* renamed from: y0  reason: collision with root package name */
    public final TextView f25847y0;

    /* renamed from: z  reason: collision with root package name */
    public final EditText f25848z;

    /* renamed from: z0  reason: collision with root package name */
    public final TextView f25849z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected d0(Object obj, View view, int i10, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, EditText editText10, EditText editText11, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, EditText editText12, EditText editText13, EditText editText14, EditText editText15, EditText editText16, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, ImageView imageView2, LinearLayout linearLayout3, LinearLayout linearLayout4, dc dcVar, yb ybVar, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ProgressBar progressBar, MyTextView myTextView, MyTextView myTextView2, CardView cardView, CheckBox checkBox, CustomWegetLayout customWegetLayout, RadioButton radioButton3, TextView textView2, TextView textView3, TextView textView4, MyTextView myTextView3, MyTextView myTextView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, RadioButton radioButton4, RadioGroup radioGroup2) {
        super(obj, view, i10);
        this.f25842w = editText;
        this.f25844x = editText2;
        this.f25846y = editText3;
        this.f25848z = editText4;
        this.A = editText5;
        this.B = editText6;
        this.C = editText7;
        this.D = editText8;
        this.E = editText9;
        this.F = editText10;
        this.G = editText11;
        this.H = radioButton;
        this.I = radioButton2;
        this.J = radioGroup;
        this.K = editText12;
        this.L = editText13;
        this.M = editText14;
        this.N = editText15;
        this.O = editText16;
        this.P = imageView;
        this.Q = linearLayout;
        this.R = linearLayout2;
        this.S = textView;
        this.T = imageView2;
        this.U = linearLayout3;
        this.V = linearLayout4;
        this.W = dcVar;
        this.X = ybVar;
        this.Y = imageView3;
        this.Z = imageView4;
        this.f25820a0 = imageView5;
        this.f25821b0 = imageView6;
        this.f25822c0 = progressBar;
        this.f25823d0 = myTextView;
        this.f25824e0 = myTextView2;
        this.f25825f0 = cardView;
        this.f25826g0 = checkBox;
        this.f25827h0 = customWegetLayout;
        this.f25828i0 = radioButton3;
        this.f25829j0 = textView2;
        this.f25830k0 = textView3;
        this.f25831l0 = textView4;
        this.f25832m0 = myTextView3;
        this.f25833n0 = myTextView4;
        this.f25834o0 = textView5;
        this.f25835p0 = textView6;
        this.f25836q0 = textView7;
        this.f25837r0 = textView8;
        this.f25838s0 = textView9;
        this.f25839t0 = textView10;
        this.f25840u0 = textView11;
        this.f25841v0 = textView12;
        this.f25843w0 = textView13;
        this.f25845x0 = textView14;
        this.f25847y0 = textView15;
        this.f25849z0 = textView16;
        this.A0 = textView17;
        this.B0 = textView18;
        this.C0 = textView19;
        this.D0 = radioButton4;
        this.E0 = radioGroup2;
    }

    public static d0 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static d0 y(LayoutInflater layoutInflater, Object obj) {
        return (d0) h.o(layoutInflater, R.layout.activity_change_of_address_cl, (ViewGroup) null, false, obj);
    }

    public abstract void z(DlAddress dlAddress);
}
