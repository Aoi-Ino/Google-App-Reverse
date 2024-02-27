package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;

public abstract class l6 extends h {
    public final EditText A;
    public final EditText B;
    public final EditText C;
    public final EditText D;
    public final EditText E;
    public final RadioButton F;
    public final TextView G;
    public final dc H;
    public final ImageView I;
    public final ImageView J;
    public final RadioButton K;
    public final TextView L;
    public final ImageView M;
    public final ImageView N;
    public final RadioGroup O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;
    public final TextView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public final TextView W;
    public final TextView X;
    public final TextView Y;
    public final TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final TextView f27269a0;

    /* renamed from: b0  reason: collision with root package name */
    public final TextView f27270b0;

    /* renamed from: c0  reason: collision with root package name */
    public final CheckBox f27271c0;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatButton f27272w;

    /* renamed from: x  reason: collision with root package name */
    public final CheckBox f27273x;

    /* renamed from: y  reason: collision with root package name */
    public final EditText f27274y;

    /* renamed from: z  reason: collision with root package name */
    public final EditText f27275z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected l6(Object obj, View view, int i10, AppCompatButton appCompatButton, CheckBox checkBox, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, RadioButton radioButton, TextView textView, dc dcVar, ImageView imageView, ImageView imageView2, RadioButton radioButton2, TextView textView2, ImageView imageView3, ImageView imageView4, RadioGroup radioGroup, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, CheckBox checkBox2) {
        super(obj, view, i10);
        this.f27272w = appCompatButton;
        this.f27273x = checkBox;
        this.f27274y = editText;
        this.f27275z = editText2;
        this.A = editText3;
        this.B = editText4;
        this.C = editText5;
        this.D = editText6;
        this.E = editText7;
        this.F = radioButton;
        this.G = textView;
        this.H = dcVar;
        this.I = imageView;
        this.J = imageView2;
        this.K = radioButton2;
        this.L = textView2;
        this.M = imageView3;
        this.N = imageView4;
        this.O = radioGroup;
        this.P = textView3;
        this.Q = textView4;
        this.R = textView5;
        this.S = textView6;
        this.T = textView7;
        this.U = textView8;
        this.V = textView9;
        this.W = textView10;
        this.X = textView11;
        this.Y = textView12;
        this.Z = textView13;
        this.f27269a0 = textView14;
        this.f27270b0 = textView15;
        this.f27271c0 = checkBox2;
    }

    public static l6 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static l6 y(LayoutInflater layoutInflater, Object obj) {
        return (l6) h.o(layoutInflater, R.layout.activity_new_cl_three, (ViewGroup) null, false, obj);
    }
}
