package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class a6 extends h {
    public final TextView A;
    public final dc B;
    public final yb C;
    public final MyTextView D;
    public final CustomWegetLayout E;
    public final LinearLayout F;
    public final MyTextView G;
    public final MyTextView H;
    public final MyTextView I;
    public final MyTextView J;

    /* renamed from: w  reason: collision with root package name */
    public final MyTextView f25195w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f25196x;

    /* renamed from: y  reason: collision with root package name */
    public final NestedScrollView f25197y;

    /* renamed from: z  reason: collision with root package name */
    public final MyTextView f25198z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected a6(Object obj, View view, int i10, MyTextView myTextView, MyTextView myTextView2, NestedScrollView nestedScrollView, MyTextView myTextView3, TextView textView, dc dcVar, yb ybVar, MyTextView myTextView4, CustomWegetLayout customWegetLayout, LinearLayout linearLayout, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8) {
        super(obj, view, i10);
        this.f25195w = myTextView;
        this.f25196x = myTextView2;
        this.f25197y = nestedScrollView;
        this.f25198z = myTextView3;
        this.A = textView;
        this.B = dcVar;
        this.C = ybVar;
        this.D = myTextView4;
        this.E = customWegetLayout;
        this.F = linearLayout;
        this.G = myTextView5;
        this.H = myTextView6;
        this.I = myTextView7;
        this.J = myTextView8;
    }

    public static a6 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static a6 y(LayoutInflater layoutInflater, Object obj) {
        return (a6) h.o(layoutInflater, R.layout.activity_ll_stolts_ack, (ViewGroup) null, false, obj);
    }
}
