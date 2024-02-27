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

public abstract class g1 extends h {
    public final ImageView A;
    public final ImageView B;
    public final CardView C;
    public final CustomWegetLayout D;
    public final CustomWegetLayout E;
    public final TextView F;
    public final LinearLayout G;

    /* renamed from: w  reason: collision with root package name */
    public final MyTextView f26441w;

    /* renamed from: x  reason: collision with root package name */
    public final ConstraintLayout f26442x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f26443y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f26444z;

    protected g1(Object obj, View view, int i10, MyTextView myTextView, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, CardView cardView, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2, TextView textView, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.f26441w = myTextView;
        this.f26442x = constraintLayout;
        this.f26443y = imageView;
        this.f26444z = imageView2;
        this.A = imageView3;
        this.B = imageView4;
        this.C = cardView;
        this.D = customWegetLayout;
        this.E = customWegetLayout2;
        this.F = textView;
        this.G = linearLayout;
    }

    public static g1 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static g1 y(LayoutInflater layoutInflater, Object obj) {
        return (g1) h.o(layoutInflater, R.layout.activity_cl_submit_screen, (ViewGroup) null, false, obj);
    }
}
