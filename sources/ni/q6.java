package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public abstract class q6 extends h {
    public final TextView A;
    public final ImageView B;
    public final EditText C;
    public final AppCompatEditText D;
    public final rc E;
    public final AppCompatEditText F;
    public final AppCompatEditText G;
    public final TextView H;
    public final RadioButton I;
    public final RadioGroup J;
    public final RadioButton K;
    public final RadioButton L;
    public final Spinner M;
    public final TextView N;
    public final Spinner O;
    public final Spinner P;
    public final Spinner Q;
    public final RelativeLayout R;
    public final TextView S;
    public final AppCompatTextView T;
    public final AppCompatEditText U;
    public final TextView V;
    public final AppCompatTextView W;
    public final AppCompatTextView X;
    public final TextView Y;
    public final TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final AppCompatTextView f28156a0;

    /* renamed from: b0  reason: collision with root package name */
    public final AppCompatEditText f28157b0;

    /* renamed from: c0  reason: collision with root package name */
    public final AppCompatTextView f28158c0;

    /* renamed from: d0  reason: collision with root package name */
    public final AppCompatEditText f28159d0;

    /* renamed from: e0  reason: collision with root package name */
    public final TextView f28160e0;

    /* renamed from: f0  reason: collision with root package name */
    public final EditText f28161f0;

    /* renamed from: g0  reason: collision with root package name */
    public final TextView f28162g0;

    /* renamed from: h0  reason: collision with root package name */
    public final AppCompatTextView f28163h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AppCompatEditText f28164i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AppCompatTextView f28165j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AppCompatEditText f28166k0;

    /* renamed from: l0  reason: collision with root package name */
    public final AppCompatEditText f28167l0;

    /* renamed from: m0  reason: collision with root package name */
    public final AppCompatTextView f28168m0;

    /* renamed from: n0  reason: collision with root package name */
    public final AppCompatEditText f28169n0;

    /* renamed from: o0  reason: collision with root package name */
    public final AppCompatTextView f28170o0;

    /* renamed from: p0  reason: collision with root package name */
    public final TextView f28171p0;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatEditText f28172w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f28173x;

    /* renamed from: y  reason: collision with root package name */
    public final EditText f28174y;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatEditText f28175z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected q6(Object obj, View view, int i10, AppCompatEditText appCompatEditText, LinearLayout linearLayout, EditText editText, AppCompatEditText appCompatEditText2, TextView textView, ImageView imageView, EditText editText2, AppCompatEditText appCompatEditText3, rc rcVar, AppCompatEditText appCompatEditText4, AppCompatEditText appCompatEditText5, TextView textView2, RadioButton radioButton, RadioGroup radioGroup, RadioButton radioButton2, RadioButton radioButton3, Spinner spinner, TextView textView3, Spinner spinner2, Spinner spinner3, Spinner spinner4, RelativeLayout relativeLayout, TextView textView4, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText6, TextView textView5, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, TextView textView6, TextView textView7, AppCompatTextView appCompatTextView4, AppCompatEditText appCompatEditText7, AppCompatTextView appCompatTextView5, AppCompatEditText appCompatEditText8, TextView textView8, EditText editText3, TextView textView9, AppCompatTextView appCompatTextView6, AppCompatEditText appCompatEditText9, AppCompatTextView appCompatTextView7, AppCompatEditText appCompatEditText10, AppCompatEditText appCompatEditText11, AppCompatTextView appCompatTextView8, AppCompatEditText appCompatEditText12, AppCompatTextView appCompatTextView9, TextView textView10) {
        super(obj, view, i10);
        this.f28172w = appCompatEditText;
        this.f28173x = linearLayout;
        this.f28174y = editText;
        this.f28175z = appCompatEditText2;
        this.A = textView;
        this.B = imageView;
        this.C = editText2;
        this.D = appCompatEditText3;
        this.E = rcVar;
        this.F = appCompatEditText4;
        this.G = appCompatEditText5;
        this.H = textView2;
        this.I = radioButton;
        this.J = radioGroup;
        this.K = radioButton2;
        this.L = radioButton3;
        this.M = spinner;
        this.N = textView3;
        this.O = spinner2;
        this.P = spinner3;
        this.Q = spinner4;
        this.R = relativeLayout;
        this.S = textView4;
        this.T = appCompatTextView;
        this.U = appCompatEditText6;
        this.V = textView5;
        this.W = appCompatTextView2;
        this.X = appCompatTextView3;
        this.Y = textView6;
        this.Z = textView7;
        this.f28156a0 = appCompatTextView4;
        this.f28157b0 = appCompatEditText7;
        this.f28158c0 = appCompatTextView5;
        this.f28159d0 = appCompatEditText8;
        this.f28160e0 = textView8;
        this.f28161f0 = editText3;
        this.f28162g0 = textView9;
        this.f28163h0 = appCompatTextView6;
        this.f28164i0 = appCompatEditText9;
        this.f28165j0 = appCompatTextView7;
        this.f28166k0 = appCompatEditText10;
        this.f28167l0 = appCompatEditText11;
        this.f28168m0 = appCompatTextView8;
        this.f28169n0 = appCompatEditText12;
        this.f28170o0 = appCompatTextView9;
        this.f28171p0 = textView10;
    }

    public static q6 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static q6 y(LayoutInflater layoutInflater, Object obj) {
        return (q6) h.o(layoutInflater, R.layout.activity_new_learner_personal_details, (ViewGroup) null, false, obj);
    }
}