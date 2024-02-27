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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class a5 extends h {
    public final CheckBox A;
    public final EditText B;
    public final TextView C;
    public final LinearLayout D;
    public final rc E;
    public final AppCompatEditText F;
    public final AppCompatTextView G;
    public final RadioGroup H;
    public final TextView I;
    public final RelativeLayout J;
    public final Spinner K;
    public final TextView L;
    public final EditText M;
    public final TextView N;
    public final RadioButton O;
    public final RadioButton P;
    public final RadioButton Q;

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f25191w;

    /* renamed from: x  reason: collision with root package name */
    public final RadioGroup f25192x;

    /* renamed from: y  reason: collision with root package name */
    public final RadioButton f25193y;

    /* renamed from: z  reason: collision with root package name */
    public final MyTextView f25194z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected a5(Object obj, View view, int i10, LinearLayout linearLayout, RadioGroup radioGroup, RadioButton radioButton, MyTextView myTextView, CheckBox checkBox, EditText editText, TextView textView, LinearLayout linearLayout2, rc rcVar, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView, RadioGroup radioGroup2, TextView textView2, RelativeLayout relativeLayout, Spinner spinner, TextView textView3, EditText editText2, TextView textView4, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4) {
        super(obj, view, i10);
        this.f25191w = linearLayout;
        this.f25192x = radioGroup;
        this.f25193y = radioButton;
        this.f25194z = myTextView;
        this.A = checkBox;
        this.B = editText;
        this.C = textView;
        this.D = linearLayout2;
        this.E = rcVar;
        this.F = appCompatEditText;
        this.G = appCompatTextView;
        this.H = radioGroup2;
        this.I = textView2;
        this.J = relativeLayout;
        this.K = spinner;
        this.L = textView3;
        this.M = editText2;
        this.N = textView4;
        this.O = radioButton2;
        this.P = radioButton3;
        this.Q = radioButton4;
    }

    public static a5 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static a5 y(LayoutInflater layoutInflater, Object obj) {
        return (a5) h.o(layoutInflater, R.layout.activity_learner_licence_aadhar, (ViewGroup) null, false, obj);
    }
}
