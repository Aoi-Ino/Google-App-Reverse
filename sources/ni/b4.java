package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class b4 extends h {
    public final dc A;
    public final yb B;
    public final CustomWegetLayout C;
    public final CardView D;
    public final MyTextView E;
    public final TextView F;
    public final MyTextView G;
    public final MyTextView H;
    public final TextView I;

    /* renamed from: w  reason: collision with root package name */
    public final EditText f25446w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f25447x;

    /* renamed from: y  reason: collision with root package name */
    public final CustomWegetLayout f25448y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f25449z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected b4(Object obj, View view, int i10, EditText editText, LinearLayout linearLayout, CustomWegetLayout customWegetLayout, ImageView imageView, dc dcVar, yb ybVar, CustomWegetLayout customWegetLayout2, CardView cardView, MyTextView myTextView, TextView textView, MyTextView myTextView2, MyTextView myTextView3, TextView textView2) {
        super(obj, view, i10);
        this.f25446w = editText;
        this.f25447x = linearLayout;
        this.f25448y = customWegetLayout;
        this.f25449z = imageView;
        this.A = dcVar;
        this.B = ybVar;
        this.C = customWegetLayout2;
        this.D = cardView;
        this.E = myTextView;
        this.F = textView;
        this.G = myTextView2;
        this.H = myTextView3;
        this.I = textView2;
    }

    public static b4 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static b4 y(LayoutInflater layoutInflater, Object obj) {
        return (b4) h.o(layoutInflater, R.layout.activity_duplicate_cl, (ViewGroup) null, false, obj);
    }
}
