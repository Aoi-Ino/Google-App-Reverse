package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public abstract class r2 extends h {
    public final EditText A;
    public final EditText B;
    public final EditText C;
    public final EditText D;
    public final EditText E;
    public final EditText F;
    public final EditText G;
    public final EditText H;
    public final EditText I;
    public final EditText J;
    public final EditText K;
    public final RadioButton L;
    public final RadioGroup M;
    public final rc N;
    public final RadioButton O;
    public final TextView P;
    public final Spinner Q;
    public final RadioButton R;
    public final TextView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public final TextView W;
    public final TextView X;
    public final TextView Y;
    public final TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final EditText f28324a0;

    /* renamed from: b0  reason: collision with root package name */
    public final TextView f28325b0;

    /* renamed from: c0  reason: collision with root package name */
    public final TextView f28326c0;

    /* renamed from: d0  reason: collision with root package name */
    public final TextView f28327d0;

    /* renamed from: e0  reason: collision with root package name */
    public final TextView f28328e0;

    /* renamed from: f0  reason: collision with root package name */
    public final TextView f28329f0;

    /* renamed from: g0  reason: collision with root package name */
    public final TextView f28330g0;

    /* renamed from: h0  reason: collision with root package name */
    public final TextView f28331h0;

    /* renamed from: i0  reason: collision with root package name */
    public final TextView f28332i0;

    /* renamed from: j0  reason: collision with root package name */
    public final EditText f28333j0;

    /* renamed from: k0  reason: collision with root package name */
    public final EditText f28334k0;

    /* renamed from: l0  reason: collision with root package name */
    public final EditText f28335l0;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatButton f28336w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f28337x;

    /* renamed from: y  reason: collision with root package name */
    public final EditText f28338y;

    /* renamed from: z  reason: collision with root package name */
    public final EditText f28339z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected r2(Object obj, View view, int i10, AppCompatButton appCompatButton, TextView textView, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, EditText editText10, EditText editText11, EditText editText12, EditText editText13, RadioButton radioButton, RadioGroup radioGroup, rc rcVar, RadioButton radioButton2, TextView textView2, Spinner spinner, RadioButton radioButton3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, EditText editText14, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, EditText editText15, EditText editText16, EditText editText17) {
        super(obj, view, i10);
        this.f28336w = appCompatButton;
        this.f28337x = textView;
        this.f28338y = editText;
        this.f28339z = editText2;
        this.A = editText3;
        this.B = editText4;
        this.C = editText5;
        this.D = editText6;
        this.E = editText7;
        this.F = editText8;
        this.G = editText9;
        this.H = editText10;
        this.I = editText11;
        this.J = editText12;
        this.K = editText13;
        this.L = radioButton;
        this.M = radioGroup;
        this.N = rcVar;
        this.O = radioButton2;
        this.P = textView2;
        this.Q = spinner;
        this.R = radioButton3;
        this.S = textView3;
        this.T = textView4;
        this.U = textView5;
        this.V = textView6;
        this.W = textView7;
        this.X = textView8;
        this.Y = textView9;
        this.Z = textView10;
        this.f28324a0 = editText14;
        this.f28325b0 = textView11;
        this.f28326c0 = textView12;
        this.f28327d0 = textView13;
        this.f28328e0 = textView14;
        this.f28329f0 = textView15;
        this.f28330g0 = textView16;
        this.f28331h0 = textView17;
        this.f28332i0 = textView18;
        this.f28333j0 = editText15;
        this.f28334k0 = editText16;
        this.f28335l0 = editText17;
    }

    public static r2 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static r2 y(LayoutInflater layoutInflater, Object obj) {
        return (r2) h.o(layoutInflater, R.layout.activity_dl_personal_details, (ViewGroup) null, false, obj);
    }
}
