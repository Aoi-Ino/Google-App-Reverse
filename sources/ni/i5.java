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
import com.nic.mparivahan.R;

public abstract class i5 extends h {
    public final View A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final dc E;
    public final ImageView F;
    public final TextView G;
    public final LinearLayout H;
    public final yb I;
    public final ImageView J;
    public final TextView K;
    public final ga L;
    public final RecyclerView M;
    public final View N;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f26801w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f26802x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f26803y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f26804z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected i5(Object obj, View view, int i10, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, View view2, TextView textView3, TextView textView4, TextView textView5, dc dcVar, ImageView imageView3, TextView textView6, LinearLayout linearLayout, yb ybVar, ImageView imageView4, TextView textView7, ga gaVar, RecyclerView recyclerView, View view3) {
        super(obj, view, i10);
        this.f26801w = imageView;
        this.f26802x = textView;
        this.f26803y = imageView2;
        this.f26804z = textView2;
        this.A = view2;
        this.B = textView3;
        this.C = textView4;
        this.D = textView5;
        this.E = dcVar;
        this.F = imageView3;
        this.G = textView6;
        this.H = linearLayout;
        this.I = ybVar;
        this.J = imageView4;
        this.K = textView7;
        this.L = gaVar;
        this.M = recyclerView;
        this.N = view3;
    }

    public static i5 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static i5 y(LayoutInflater layoutInflater, Object obj) {
        return (i5) h.o(layoutInflater, R.layout.activity_ll_appointment, (ViewGroup) null, false, obj);
    }
}
