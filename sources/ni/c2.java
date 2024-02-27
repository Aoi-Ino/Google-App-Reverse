package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class c2 extends h {
    public final ImageView A;
    public final rc B;
    public final TextView C;
    public final RadioButton D;
    public final EditText E;
    public final TextView F;
    public final LinearLayout G;
    public final LinearLayout H;
    public final TextView I;
    public final CheckBox J;
    public final TextView K;
    public final EditText L;
    public final TextView M;
    public final MyTextView N;
    public final TextView O;
    public final RadioGroup P;
    public final RadioButton Q;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f25597w;

    /* renamed from: x  reason: collision with root package name */
    public final CheckBox f25598x;

    /* renamed from: y  reason: collision with root package name */
    public final RelativeLayout f25599y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f25600z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected c2(Object obj, View view, int i10, TextView textView, CheckBox checkBox, RelativeLayout relativeLayout, TextView textView2, ImageView imageView, rc rcVar, TextView textView3, RadioButton radioButton, EditText editText, TextView textView4, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView5, CheckBox checkBox2, TextView textView6, EditText editText2, TextView textView7, MyTextView myTextView, TextView textView8, RadioGroup radioGroup, RadioButton radioButton2) {
        super(obj, view, i10);
        this.f25597w = textView;
        this.f25598x = checkBox;
        this.f25599y = relativeLayout;
        this.f25600z = textView2;
        this.A = imageView;
        this.B = rcVar;
        this.C = textView3;
        this.D = radioButton;
        this.E = editText;
        this.F = textView4;
        this.G = linearLayout;
        this.H = linearLayout2;
        this.I = textView5;
        this.J = checkBox2;
        this.K = textView6;
        this.L = editText2;
        this.M = textView7;
        this.N = myTextView;
        this.O = textView8;
        this.P = radioGroup;
        this.Q = radioButton2;
    }

    public static c2 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static c2 y(LayoutInflater layoutInflater, Object obj) {
        return (c2) h.o(layoutInflater, R.layout.activity_dl_cov, (ViewGroup) null, false, obj);
    }
}
