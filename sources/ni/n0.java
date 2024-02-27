package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

public abstract class n0 extends h {
    public final TextView A;
    public final LinearLayout B;
    public final ImageView C;
    public final ImageView D;
    public final TextView E;
    public final CardView F;
    public final ImageView G;
    public final ImageView H;
    public final LinearLayout I;
    public final LinearLayout J;
    public final LinearLayout K;
    public final yb L;
    public final AppCompatTextView M;
    public final CustomWegetLayout N;
    public final ImageView O;
    public final ImageView P;
    public final TextView Q;
    public final CardView R;
    public final AppCompatTextView S;
    public final AppCompatTextView T;
    public final AppCompatTextView U;
    public final AppCompatTextView V;
    public final AppCompatTextView W;
    public final TextView X;
    public final AppCompatTextView Y;
    public final AppCompatTextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public final AppCompatTextView f27508a0;

    /* renamed from: b0  reason: collision with root package name */
    public final AppCompatTextView f27509b0;

    /* renamed from: c0  reason: collision with root package name */
    public final AppCompatTextView f27510c0;

    /* renamed from: d0  reason: collision with root package name */
    public final AppCompatTextView f27511d0;

    /* renamed from: e0  reason: collision with root package name */
    public final TextView f27512e0;

    /* renamed from: f0  reason: collision with root package name */
    public final AppCompatTextView f27513f0;

    /* renamed from: g0  reason: collision with root package name */
    public final AppCompatTextView f27514g0;

    /* renamed from: h0  reason: collision with root package name */
    public final AppCompatTextView f27515h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AppCompatTextView f27516i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AppCompatTextView f27517j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AppCompatTextView f27518k0;

    /* renamed from: l0  reason: collision with root package name */
    public final AppCompatTextView f27519l0;

    /* renamed from: m0  reason: collision with root package name */
    public final AppCompatTextView f27520m0;

    /* renamed from: n0  reason: collision with root package name */
    public final TextView f27521n0;

    /* renamed from: o0  reason: collision with root package name */
    public final AppCompatTextView f27522o0;

    /* renamed from: p0  reason: collision with root package name */
    public final AppCompatTextView f27523p0;

    /* renamed from: q0  reason: collision with root package name */
    public final dc f27524q0;

    /* renamed from: r0  reason: collision with root package name */
    public final CardView f27525r0;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f27526w;

    /* renamed from: x  reason: collision with root package name */
    public final AppCompatButton f27527x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f27528y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f27529z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected n0(Object obj, View view, int i10, TextView textView, AppCompatButton appCompatButton, TextView textView2, ImageView imageView, TextView textView3, LinearLayout linearLayout, ImageView imageView2, ImageView imageView3, TextView textView4, CardView cardView, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, yb ybVar, AppCompatTextView appCompatTextView, CustomWegetLayout customWegetLayout, ImageView imageView6, ImageView imageView7, TextView textView5, CardView cardView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, TextView textView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12, TextView textView7, AppCompatTextView appCompatTextView13, AppCompatTextView appCompatTextView14, AppCompatTextView appCompatTextView15, AppCompatTextView appCompatTextView16, AppCompatTextView appCompatTextView17, AppCompatTextView appCompatTextView18, AppCompatTextView appCompatTextView19, AppCompatTextView appCompatTextView20, TextView textView8, AppCompatTextView appCompatTextView21, AppCompatTextView appCompatTextView22, dc dcVar, CardView cardView3) {
        super(obj, view, i10);
        this.f27526w = textView;
        this.f27527x = appCompatButton;
        this.f27528y = textView2;
        this.f27529z = imageView;
        this.A = textView3;
        this.B = linearLayout;
        this.C = imageView2;
        this.D = imageView3;
        this.E = textView4;
        this.F = cardView;
        this.G = imageView4;
        this.H = imageView5;
        this.I = linearLayout2;
        this.J = linearLayout3;
        this.K = linearLayout4;
        this.L = ybVar;
        this.M = appCompatTextView;
        this.N = customWegetLayout;
        this.O = imageView6;
        this.P = imageView7;
        this.Q = textView5;
        this.R = cardView2;
        this.S = appCompatTextView2;
        this.T = appCompatTextView3;
        this.U = appCompatTextView4;
        this.V = appCompatTextView5;
        this.W = appCompatTextView6;
        this.X = textView6;
        this.Y = appCompatTextView7;
        this.Z = appCompatTextView8;
        this.f27508a0 = appCompatTextView9;
        this.f27509b0 = appCompatTextView10;
        this.f27510c0 = appCompatTextView11;
        this.f27511d0 = appCompatTextView12;
        this.f27512e0 = textView7;
        this.f27513f0 = appCompatTextView13;
        this.f27514g0 = appCompatTextView14;
        this.f27515h0 = appCompatTextView15;
        this.f27516i0 = appCompatTextView16;
        this.f27517j0 = appCompatTextView17;
        this.f27518k0 = appCompatTextView18;
        this.f27519l0 = appCompatTextView19;
        this.f27520m0 = appCompatTextView20;
        this.f27521n0 = textView8;
        this.f27522o0 = appCompatTextView21;
        this.f27523p0 = appCompatTextView22;
        this.f27524q0 = dcVar;
        this.f27525r0 = cardView3;
    }

    public static n0 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static n0 y(LayoutInflater layoutInflater, Object obj) {
        return (n0) h.o(layoutInflater, R.layout.activity_cl_details_top, (ViewGroup) null, false, obj);
    }
}
