package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class ra extends h {
    public final TextView A;
    public final RadioButton B;
    public final AppCompatEditText C;
    public final LinearLayout D;
    public final TextView E;
    public final CheckBox F;
    public final TextView G;
    public final RelativeLayout H;
    public final MyTextView I;
    public final TextView J;
    public final RadioGroup K;
    public final RadioButton L;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f28429w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f28430x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f28431y;

    /* renamed from: z  reason: collision with root package name */
    public final rc f28432z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ra(Object obj, View view, int i10, TextView textView, LinearLayout linearLayout, ImageView imageView, rc rcVar, TextView textView2, RadioButton radioButton, AppCompatEditText appCompatEditText, LinearLayout linearLayout2, TextView textView3, CheckBox checkBox, TextView textView4, RelativeLayout relativeLayout, MyTextView myTextView, TextView textView5, RadioGroup radioGroup, RadioButton radioButton2) {
        super(obj, view, i10);
        this.f28429w = textView;
        this.f28430x = linearLayout;
        this.f28431y = imageView;
        this.f28432z = rcVar;
        this.A = textView2;
        this.B = radioButton;
        this.C = appCompatEditText;
        this.D = linearLayout2;
        this.E = textView3;
        this.F = checkBox;
        this.G = textView4;
        this.H = relativeLayout;
        this.I = myTextView;
        this.J = textView5;
        this.K = radioGroup;
        this.L = radioButton2;
    }

    public static ra x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static ra y(LayoutInflater layoutInflater, Object obj) {
        return (ra) h.o(layoutInflater, R.layout.edit_appl_selected_cov_details, (ViewGroup) null, false, obj);
    }
}
