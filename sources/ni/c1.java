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

public abstract class c1 extends h {
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
    public final MyTextView f25593w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f25594x;

    /* renamed from: y  reason: collision with root package name */
    public final NestedScrollView f25595y;

    /* renamed from: z  reason: collision with root package name */
    public final MyTextView f25596z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected c1(Object obj, View view, int i10, MyTextView myTextView, MyTextView myTextView2, NestedScrollView nestedScrollView, MyTextView myTextView3, TextView textView, dc dcVar, yb ybVar, MyTextView myTextView4, CustomWegetLayout customWegetLayout, LinearLayout linearLayout, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8) {
        super(obj, view, i10);
        this.f25593w = myTextView;
        this.f25594x = myTextView2;
        this.f25595y = nestedScrollView;
        this.f25596z = myTextView3;
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

    public static c1 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static c1 y(LayoutInflater layoutInflater, Object obj) {
        return (c1) h.o(layoutInflater, R.layout.activity_cl_slots_acknow, (ViewGroup) null, false, obj);
    }
}
