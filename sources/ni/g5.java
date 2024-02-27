package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class g5 extends h {
    public final ImageView A;
    public final yb B;
    public final ImageView C;
    public final CardView D;
    public final CustomWegetLayout E;
    public final CustomWegetLayout F;
    public final TextView G;
    public final LinearLayout H;

    /* renamed from: w  reason: collision with root package name */
    public final MyTextView f26478w;

    /* renamed from: x  reason: collision with root package name */
    public final ConstraintLayout f26479x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f26480y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f26481z;

    protected g5(Object obj, View view, int i10, MyTextView myTextView, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, yb ybVar, ImageView imageView4, CardView cardView, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2, TextView textView, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.f26478w = myTextView;
        this.f26479x = constraintLayout;
        this.f26480y = imageView;
        this.f26481z = imageView2;
        this.A = imageView3;
        this.B = ybVar;
        this.C = imageView4;
        this.D = cardView;
        this.E = customWegetLayout;
        this.F = customWegetLayout2;
        this.G = textView;
        this.H = linearLayout;
    }

    public static g5 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static g5 y(LayoutInflater layoutInflater, Object obj) {
        return (g5) h.o(layoutInflater, R.layout.activity_ll_application_number, (ViewGroup) null, false, obj);
    }
}
