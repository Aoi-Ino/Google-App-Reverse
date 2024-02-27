package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.f;
import androidx.databinding.h;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

public abstract class h2 extends h {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final dc F;
    public final LinearLayout G;
    public final LinearLayout H;
    public final z9 I;
    public final ShimmerFrameLayout J;
    public final CustomWegetLayout K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;
    public final TextView S;
    public final CustomWegetLayout T;
    public final RecyclerView U;
    public final View V;
    public final View W;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f26598w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f26599x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f26600y;

    /* renamed from: z  reason: collision with root package name */
    public final LinearLayout f26601z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected h2(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, dc dcVar, LinearLayout linearLayout2, LinearLayout linearLayout3, z9 z9Var, ShimmerFrameLayout shimmerFrameLayout, CustomWegetLayout customWegetLayout, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, CustomWegetLayout customWegetLayout2, RecyclerView recyclerView, View view2, View view3) {
        super(obj, view, i10);
        this.f26598w = imageView;
        this.f26599x = imageView2;
        this.f26600y = textView;
        this.f26601z = linearLayout;
        this.A = textView2;
        this.B = textView3;
        this.C = textView4;
        this.D = textView5;
        this.E = textView6;
        this.F = dcVar;
        this.G = linearLayout2;
        this.H = linearLayout3;
        this.I = z9Var;
        this.J = shimmerFrameLayout;
        this.K = customWegetLayout;
        this.L = textView7;
        this.M = textView8;
        this.N = textView9;
        this.O = textView10;
        this.P = textView11;
        this.Q = textView12;
        this.R = textView13;
        this.S = textView14;
        this.T = customWegetLayout2;
        this.U = recyclerView;
        this.V = view2;
        this.W = view3;
    }

    public static h2 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static h2 y(LayoutInflater layoutInflater, Object obj) {
        return (h2) h.o(layoutInflater, R.layout.activity_dl_doc_upload, (ViewGroup) null, false, obj);
    }
}
