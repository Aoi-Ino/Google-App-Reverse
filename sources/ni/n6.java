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

public abstract class n6 extends h {
    public final EditText A;
    public final RadioButton A0;
    public final EditText B;
    public final RadioGroup B0;
    public final EditText C;
    protected DlAddress C0;
    public final EditText D;
    public final EditText E;
    public final EditText F;
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
    public final ImageView X;
    public final ImageView Y;
    public final ImageView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final ImageView f27577a0;

    /* renamed from: b0  reason: collision with root package name */
    public final ProgressBar f27578b0;

    /* renamed from: c0  reason: collision with root package name */
    public final MyTextView f27579c0;

    /* renamed from: d0  reason: collision with root package name */
    public final MyTextView f27580d0;

    /* renamed from: e0  reason: collision with root package name */
    public final CardView f27581e0;

    /* renamed from: f0  reason: collision with root package name */
    public final CheckBox f27582f0;

    /* renamed from: g0  reason: collision with root package name */
    public final CustomWegetLayout f27583g0;

    /* renamed from: h0  reason: collision with root package name */
    public final RadioButton f27584h0;

    /* renamed from: i0  reason: collision with root package name */
    public final TextView f27585i0;

    /* renamed from: j0  reason: collision with root package name */
    public final TextView f27586j0;

    /* renamed from: k0  reason: collision with root package name */
    public final MyTextView f27587k0;

    /* renamed from: l0  reason: collision with root package name */
    public final MyTextView f27588l0;

    /* renamed from: m0  reason: collision with root package name */
    public final TextView f27589m0;

    /* renamed from: n0  reason: collision with root package name */
    public final TextView f27590n0;

    /* renamed from: o0  reason: collision with root package name */
    public final TextView f27591o0;

    /* renamed from: p0  reason: collision with root package name */
    public final TextView f27592p0;

    /* renamed from: q0  reason: collision with root package name */
    public final TextView f27593q0;

    /* renamed from: r0  reason: collision with root package name */
    public final TextView f27594r0;

    /* renamed from: s0  reason: collision with root package name */
    public final TextView f27595s0;

    /* renamed from: t0  reason: collision with root package name */
    public final TextView f27596t0;

    /* renamed from: u0  reason: collision with root package name */
    public final TextView f27597u0;

    /* renamed from: v0  reason: collision with root package name */
    public final TextView f27598v0;

    /* renamed from: w  reason: collision with root package name */
    public final EditText f27599w;

    /* renamed from: w0  reason: collision with root package name */
    public final TextView f27600w0;

    /* renamed from: x  reason: collision with root package name */
    public final EditText f27601x;

    /* renamed from: x0  reason: collision with root package name */
    public final TextView f27602x0;

    /* renamed from: y  reason: collision with root package name */
    public final EditText f27603y;

    /* renamed from: y0  reason: collision with root package name */
    public final TextView f27604y0;

    /* renamed from: z  reason: collision with root package name */
    public final EditText f27605z;

    /* renamed from: z0  reason: collision with root package name */
    public final TextView f27606z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected n6(Object obj, View view, int i10, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, EditText editText10, EditText editText11, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, EditText editText12, EditText editText13, EditText editText14, EditText editText15, EditText editText16, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, ImageView imageView2, LinearLayout linearLayout3, LinearLayout linearLayout4, dc dcVar, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ProgressBar progressBar, MyTextView myTextView, MyTextView myTextView2, CardView cardView, CheckBox checkBox, CustomWegetLayout customWegetLayout, RadioButton radioButton3, TextView textView2, TextView textView3, MyTextView myTextView3, MyTextView myTextView4, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, RadioButton radioButton4, RadioGroup radioGroup2) {
        super(obj, view, i10);
        this.f27599w = editText;
        this.f27601x = editText2;
        this.f27603y = editText3;
        this.f27605z = editText4;
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
        this.X = imageView3;
        this.Y = imageView4;
        this.Z = imageView5;
        this.f27577a0 = imageView6;
        this.f27578b0 = progressBar;
        this.f27579c0 = myTextView;
        this.f27580d0 = myTextView2;
        this.f27581e0 = cardView;
        this.f27582f0 = checkBox;
        this.f27583g0 = customWegetLayout;
        this.f27584h0 = radioButton3;
        this.f27585i0 = textView2;
        this.f27586j0 = textView3;
        this.f27587k0 = myTextView3;
        this.f27588l0 = myTextView4;
        this.f27589m0 = textView4;
        this.f27590n0 = textView5;
        this.f27591o0 = textView6;
        this.f27592p0 = textView7;
        this.f27593q0 = textView8;
        this.f27594r0 = textView9;
        this.f27595s0 = textView10;
        this.f27596t0 = textView11;
        this.f27597u0 = textView12;
        this.f27598v0 = textView13;
        this.f27600w0 = textView14;
        this.f27602x0 = textView15;
        this.f27604y0 = textView16;
        this.f27606z0 = textView17;
        this.A0 = radioButton4;
        this.B0 = radioGroup2;
    }

    public static n6 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static n6 y(LayoutInflater layoutInflater, Object obj) {
        return (n6) h.o(layoutInflater, R.layout.activity_new_cl_two, (ViewGroup) null, false, obj);
    }

    public abstract void z(DlAddress dlAddress);
}
