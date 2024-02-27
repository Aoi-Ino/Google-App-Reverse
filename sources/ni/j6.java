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

public abstract class j6 extends h {
    public final ImageView A;
    public final ImageView B;
    public final CardView C;
    public final CustomWegetLayout D;
    public final CustomWegetLayout E;
    public final TextView F;
    public final LinearLayout G;

    /* renamed from: w  reason: collision with root package name */
    public final MyTextView f26958w;

    /* renamed from: x  reason: collision with root package name */
    public final ConstraintLayout f26959x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f26960y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f26961z;

    protected j6(Object obj, View view, int i10, MyTextView myTextView, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, CardView cardView, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2, TextView textView, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.f26958w = myTextView;
        this.f26959x = constraintLayout;
        this.f26960y = imageView;
        this.f26961z = imageView2;
        this.A = imageView3;
        this.B = imageView4;
        this.C = cardView;
        this.D = customWegetLayout;
        this.E = customWegetLayout2;
        this.F = textView;
        this.G = linearLayout;
    }

    public static j6 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static j6 y(LayoutInflater layoutInflater, Object obj) {
        return (j6) h.o(layoutInflater, R.layout.activity_new_cl_submit_screen, (ViewGroup) null, false, obj);
    }
}
