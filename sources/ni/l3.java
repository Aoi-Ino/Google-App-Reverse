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

public abstract class l3 extends h {
    public final TextView A;
    public final dc B;
    public final MyTextView C;
    public final CustomWegetLayout D;
    public final LinearLayout E;
    public final MyTextView F;
    public final MyTextView G;
    public final MyTextView H;
    public final MyTextView I;

    /* renamed from: w  reason: collision with root package name */
    public final MyTextView f27245w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f27246x;

    /* renamed from: y  reason: collision with root package name */
    public final NestedScrollView f27247y;

    /* renamed from: z  reason: collision with root package name */
    public final MyTextView f27248z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected l3(Object obj, View view, int i10, MyTextView myTextView, MyTextView myTextView2, NestedScrollView nestedScrollView, MyTextView myTextView3, TextView textView, dc dcVar, MyTextView myTextView4, CustomWegetLayout customWegetLayout, LinearLayout linearLayout, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8) {
        super(obj, view, i10);
        this.f27245w = myTextView;
        this.f27246x = myTextView2;
        this.f27247y = nestedScrollView;
        this.f27248z = myTextView3;
        this.A = textView;
        this.B = dcVar;
        this.C = myTextView4;
        this.D = customWegetLayout;
        this.E = linearLayout;
        this.F = myTextView5;
        this.G = myTextView6;
        this.H = myTextView7;
        this.I = myTextView8;
    }

    public static l3 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static l3 y(LayoutInflater layoutInflater, Object obj) {
        return (l3) h.o(layoutInflater, R.layout.activity_dl_slots_next, (ViewGroup) null, false, obj);
    }
}
