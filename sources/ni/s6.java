package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class s6 extends h {
    public final RelativeLayout A;
    public final TextView B;
    public final LinearLayout C;
    public final CheckBox D;
    public final EditText E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final ImageView J;
    public final TextView K;
    public final EditText L;
    public final TextView M;
    public final TextView N;
    public final rc O;
    public final TextView P;
    public final RadioButton Q;
    public final AppCompatEditText R;
    public final LinearLayout S;
    public final LinearLayout T;
    public final TextView U;
    public final CheckBox V;
    public final TextView W;
    public final Spinner X;
    public final Spinner Y;
    public final TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final TextView f28529a0;

    /* renamed from: b0  reason: collision with root package name */
    public final MyTextView f28530b0;

    /* renamed from: c0  reason: collision with root package name */
    public final TextView f28531c0;

    /* renamed from: d0  reason: collision with root package name */
    public final TextView f28532d0;

    /* renamed from: e0  reason: collision with root package name */
    public final RadioGroup f28533e0;

    /* renamed from: f0  reason: collision with root package name */
    public final RadioButton f28534f0;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f28535w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f28536x;

    /* renamed from: y  reason: collision with root package name */
    public final FrameLayout f28537y;

    /* renamed from: z  reason: collision with root package name */
    public final CheckBox f28538z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected s6(Object obj, View view, int i10, TextView textView, MyTextView myTextView, FrameLayout frameLayout, CheckBox checkBox, RelativeLayout relativeLayout, TextView textView2, LinearLayout linearLayout, CheckBox checkBox2, EditText editText, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView, TextView textView7, EditText editText2, TextView textView8, TextView textView9, rc rcVar, TextView textView10, RadioButton radioButton, AppCompatEditText appCompatEditText, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView11, CheckBox checkBox3, TextView textView12, Spinner spinner, Spinner spinner2, TextView textView13, TextView textView14, MyTextView myTextView2, TextView textView15, TextView textView16, RadioGroup radioGroup, RadioButton radioButton2) {
        super(obj, view, i10);
        this.f28535w = textView;
        this.f28536x = myTextView;
        this.f28537y = frameLayout;
        this.f28538z = checkBox;
        this.A = relativeLayout;
        this.B = textView2;
        this.C = linearLayout;
        this.D = checkBox2;
        this.E = editText;
        this.F = textView3;
        this.G = textView4;
        this.H = textView5;
        this.I = textView6;
        this.J = imageView;
        this.K = textView7;
        this.L = editText2;
        this.M = textView8;
        this.N = textView9;
        this.O = rcVar;
        this.P = textView10;
        this.Q = radioButton;
        this.R = appCompatEditText;
        this.S = linearLayout2;
        this.T = linearLayout3;
        this.U = textView11;
        this.V = checkBox3;
        this.W = textView12;
        this.X = spinner;
        this.Y = spinner2;
        this.Z = textView13;
        this.f28529a0 = textView14;
        this.f28530b0 = myTextView2;
        this.f28531c0 = textView15;
        this.f28532d0 = textView16;
        this.f28533e0 = radioGroup;
        this.f28534f0 = radioButton2;
    }

    public static s6 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static s6 y(LayoutInflater layoutInflater, Object obj) {
        return (s6) h.o(layoutInflater, R.layout.activity_new_learner_training, (ViewGroup) null, false, obj);
    }
}
