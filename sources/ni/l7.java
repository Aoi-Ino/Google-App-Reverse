package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class l7 extends h {
    public final dc A;
    public final yb B;
    public final CardView C;
    public final MyTextView D;
    public final TextView E;
    public final MyTextView F;
    public final MyTextView G;
    public final TextView H;

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f27276w;

    /* renamed from: x  reason: collision with root package name */
    public final CustomWegetLayout f27277x;

    /* renamed from: y  reason: collision with root package name */
    public final CustomWegetLayout f27278y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f27279z;

    protected l7(Object obj, View view, int i10, LinearLayout linearLayout, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2, ImageView imageView, dc dcVar, yb ybVar, CardView cardView, MyTextView myTextView, TextView textView, MyTextView myTextView2, MyTextView myTextView3, TextView textView2) {
        super(obj, view, i10);
        this.f27276w = linearLayout;
        this.f27277x = customWegetLayout;
        this.f27278y = customWegetLayout2;
        this.f27279z = imageView;
        this.A = dcVar;
        this.B = ybVar;
        this.C = cardView;
        this.D = myTextView;
        this.E = textView;
        this.F = myTextView2;
        this.G = myTextView3;
        this.H = textView2;
    }

    public static l7 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static l7 y(LayoutInflater layoutInflater, Object obj) {
        return (l7) h.o(layoutInflater, R.layout.activity_renewal_cl, (ViewGroup) null, false, obj);
    }
}
