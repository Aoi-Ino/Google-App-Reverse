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

public abstract class j3 extends h {
    public final View A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final dc E;
    public final ImageView F;
    public final TextView G;
    public final LinearLayout H;
    public final ImageView I;
    public final TextView J;
    public final ga K;
    public final RecyclerView L;
    public final View M;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f26928w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f26929x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f26930y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f26931z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected j3(Object obj, View view, int i10, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2, View view2, TextView textView3, TextView textView4, TextView textView5, dc dcVar, ImageView imageView3, TextView textView6, LinearLayout linearLayout, ImageView imageView4, TextView textView7, ga gaVar, RecyclerView recyclerView, View view3) {
        super(obj, view, i10);
        this.f26928w = imageView;
        this.f26929x = textView;
        this.f26930y = imageView2;
        this.f26931z = textView2;
        this.A = view2;
        this.B = textView3;
        this.C = textView4;
        this.D = textView5;
        this.E = dcVar;
        this.F = imageView3;
        this.G = textView6;
        this.H = linearLayout;
        this.I = imageView4;
        this.J = textView7;
        this.K = gaVar;
        this.L = recyclerView;
        this.M = view3;
    }

    public static j3 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static j3 y(LayoutInflater layoutInflater, Object obj) {
        return (j3) h.o(layoutInflater, R.layout.activity_dl_slots, (ViewGroup) null, false, obj);
    }
}
