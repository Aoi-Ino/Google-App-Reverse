package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

public abstract class k1 extends h {
    public final TextView A;
    public final TextView B;
    public final LinearLayout C;
    public final EditText D;
    public final TextView E;
    public final LinearLayout F;
    public final AppCompatTextView G;
    public final EditText H;
    public final CustomWegetLayout I;
    public final TextView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final AppCompatTextView M;
    public final AppCompatTextView N;
    public final AppCompatTextView O;
    public final AppCompatTextView P;
    public final AppCompatTextView Q;
    public final AppCompatTextView R;
    public final dc S;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f27067w;

    /* renamed from: x  reason: collision with root package name */
    public final CustomWegetLayout f27068x;

    /* renamed from: y  reason: collision with root package name */
    public final EditText f27069y;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatTextView f27070z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected k1(Object obj, View view, int i10, TextView textView, CustomWegetLayout customWegetLayout, EditText editText, AppCompatTextView appCompatTextView, TextView textView2, TextView textView3, LinearLayout linearLayout, EditText editText2, TextView textView4, LinearLayout linearLayout2, AppCompatTextView appCompatTextView2, EditText editText3, CustomWegetLayout customWegetLayout2, TextView textView5, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, dc dcVar) {
        super(obj, view, i10);
        this.f27067w = textView;
        this.f27068x = customWegetLayout;
        this.f27069y = editText;
        this.f27070z = appCompatTextView;
        this.A = textView2;
        this.B = textView3;
        this.C = linearLayout;
        this.D = editText2;
        this.E = textView4;
        this.F = linearLayout2;
        this.G = appCompatTextView2;
        this.H = editText3;
        this.I = customWegetLayout2;
        this.J = textView5;
        this.K = appCompatTextView3;
        this.L = appCompatTextView4;
        this.M = appCompatTextView5;
        this.N = appCompatTextView6;
        this.O = appCompatTextView7;
        this.P = appCompatTextView8;
        this.Q = appCompatTextView9;
        this.R = appCompatTextView10;
        this.S = dcVar;
    }

    public static k1 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static k1 y(LayoutInflater layoutInflater, Object obj) {
        return (k1) h.o(layoutInflater, R.layout.activity_confirm_mob_no, (ViewGroup) null, false, obj);
    }
}
