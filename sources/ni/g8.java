package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class g8 extends h {
    public final ImageView A;
    public final dc B;
    public final CardView C;
    public final CustomWegetLayout D;
    public final CustomWegetLayout E;
    public final MyTextView F;
    public final TextView G;
    public final TextView H;

    /* renamed from: w  reason: collision with root package name */
    public final CheckBox f26500w;

    /* renamed from: x  reason: collision with root package name */
    public final CheckBox f26501x;

    /* renamed from: y  reason: collision with root package name */
    public final CheckBox f26502y;

    /* renamed from: z  reason: collision with root package name */
    public final CheckBox f26503z;

    protected g8(Object obj, View view, int i10, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, ImageView imageView, dc dcVar, CardView cardView, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2, MyTextView myTextView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f26500w = checkBox;
        this.f26501x = checkBox2;
        this.f26502y = checkBox3;
        this.f26503z = checkBox4;
        this.A = imageView;
        this.B = dcVar;
        this.C = cardView;
        this.D = customWegetLayout;
        this.E = customWegetLayout2;
        this.F = myTextView;
        this.G = textView;
        this.H = textView2;
    }

    public static g8 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static g8 y(LayoutInflater layoutInflater, Object obj) {
        return (g8) h.o(layoutInflater, R.layout.activity_select_cl_service, (ViewGroup) null, false, obj);
    }
}
