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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public abstract class w1 extends h {
    public final EditText A;
    public final EditText B;
    public final EditText C;
    public final EditText D;
    public final EditText E;
    public final EditText F;
    public final EditText G;
    public final EditText H;
    public final RadioButton I;
    public final RadioButton J;
    public final RadioGroup K;
    public final EditText L;
    public final EditText M;
    public final EditText N;
    public final EditText O;
    public final EditText P;
    public final AppCompatTextView Q;
    public final LinearLayout R;
    public final ImageView S;
    public final LinearLayout T;
    public final rc U;
    public final AppCompatEditText V;
    public final ProgressBar W;
    public final CheckBox X;
    public final TextView Y;
    public final RelativeLayout Z;

    /* renamed from: a0  reason: collision with root package name */
    public final RadioButton f29115a0;

    /* renamed from: b0  reason: collision with root package name */
    public final TextView f29116b0;

    /* renamed from: c0  reason: collision with root package name */
    public final TextView f29117c0;

    /* renamed from: d0  reason: collision with root package name */
    public final TextView f29118d0;

    /* renamed from: e0  reason: collision with root package name */
    public final TextView f29119e0;

    /* renamed from: f0  reason: collision with root package name */
    public final TextView f29120f0;

    /* renamed from: g0  reason: collision with root package name */
    public final TextView f29121g0;

    /* renamed from: h0  reason: collision with root package name */
    public final TextView f29122h0;

    /* renamed from: i0  reason: collision with root package name */
    public final TextView f29123i0;

    /* renamed from: j0  reason: collision with root package name */
    public final TextView f29124j0;

    /* renamed from: k0  reason: collision with root package name */
    public final TextView f29125k0;

    /* renamed from: l0  reason: collision with root package name */
    public final TextView f29126l0;

    /* renamed from: m0  reason: collision with root package name */
    public final TextView f29127m0;

    /* renamed from: n0  reason: collision with root package name */
    public final TextView f29128n0;

    /* renamed from: o0  reason: collision with root package name */
    public final TextView f29129o0;

    /* renamed from: p0  reason: collision with root package name */
    public final TextView f29130p0;

    /* renamed from: q0  reason: collision with root package name */
    public final TextView f29131q0;

    /* renamed from: r0  reason: collision with root package name */
    public final RadioButton f29132r0;

    /* renamed from: s0  reason: collision with root package name */
    public final RadioGroup f29133s0;

    /* renamed from: t0  reason: collision with root package name */
    public final AppCompatEditText f29134t0;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f29135w;

    /* renamed from: x  reason: collision with root package name */
    public final EditText f29136x;

    /* renamed from: y  reason: collision with root package name */
    public final EditText f29137y;

    /* renamed from: z  reason: collision with root package name */
    public final EditText f29138z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected w1(Object obj, View view, int i10, TextView textView, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, EditText editText10, EditText editText11, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, EditText editText12, EditText editText13, EditText editText14, EditText editText15, EditText editText16, AppCompatTextView appCompatTextView, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, rc rcVar, AppCompatEditText appCompatEditText, ProgressBar progressBar, CheckBox checkBox, TextView textView2, RelativeLayout relativeLayout, RadioButton radioButton3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, RadioButton radioButton4, RadioGroup radioGroup2, AppCompatEditText appCompatEditText2) {
        super(obj, view, i10);
        this.f29135w = textView;
        this.f29136x = editText;
        this.f29137y = editText2;
        this.f29138z = editText3;
        this.A = editText4;
        this.B = editText5;
        this.C = editText6;
        this.D = editText7;
        this.E = editText8;
        this.F = editText9;
        this.G = editText10;
        this.H = editText11;
        this.I = radioButton;
        this.J = radioButton2;
        this.K = radioGroup;
        this.L = editText12;
        this.M = editText13;
        this.N = editText14;
        this.O = editText15;
        this.P = editText16;
        this.Q = appCompatTextView;
        this.R = linearLayout;
        this.S = imageView;
        this.T = linearLayout2;
        this.U = rcVar;
        this.V = appCompatEditText;
        this.W = progressBar;
        this.X = checkBox;
        this.Y = textView2;
        this.Z = relativeLayout;
        this.f29115a0 = radioButton3;
        this.f29116b0 = textView3;
        this.f29117c0 = textView4;
        this.f29118d0 = textView5;
        this.f29119e0 = textView6;
        this.f29120f0 = textView7;
        this.f29121g0 = textView8;
        this.f29122h0 = textView9;
        this.f29123i0 = textView10;
        this.f29124j0 = textView11;
        this.f29125k0 = textView12;
        this.f29126l0 = textView13;
        this.f29127m0 = textView14;
        this.f29128n0 = textView15;
        this.f29129o0 = textView16;
        this.f29130p0 = textView17;
        this.f29131q0 = textView18;
        this.f29132r0 = radioButton4;
        this.f29133s0 = radioGroup2;
        this.f29134t0 = appCompatEditText2;
    }

    public static w1 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static w1 y(LayoutInflater layoutInflater, Object obj) {
        return (w1) h.o(layoutInflater, R.layout.activity_dl_address_details, (ViewGroup) null, false, obj);
    }
}
