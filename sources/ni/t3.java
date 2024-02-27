package ni;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.h;
import com.nic.mparivahan.MyTextView;

public abstract class t3 extends h {
    public final TextView A;
    public final ImageView B;
    public final ImageView C;
    public final dc D;
    public final MyTextView E;
    public final LinearLayout F;
    public final LinearLayout G;
    public final TextView H;
    public final View I;
    public final View J;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f28666w;

    /* renamed from: x  reason: collision with root package name */
    public final NestedScrollView f28667x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f28668y;

    /* renamed from: z  reason: collision with root package name */
    public final MyTextView f28669z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected t3(Object obj, View view, int i10, TextView textView, NestedScrollView nestedScrollView, ImageView imageView, MyTextView myTextView, TextView textView2, ImageView imageView2, ImageView imageView3, dc dcVar, MyTextView myTextView2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView3, View view2, View view3) {
        super(obj, view, i10);
        this.f28666w = textView;
        this.f28667x = nestedScrollView;
        this.f28668y = imageView;
        this.f28669z = myTextView;
        this.A = textView2;
        this.B = imageView2;
        this.C = imageView3;
        this.D = dcVar;
        this.E = myTextView2;
        this.F = linearLayout;
        this.G = linearLayout2;
        this.H = textView3;
        this.I = view2;
        this.J = view3;
    }
}
