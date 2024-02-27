package ni;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.h;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class t9 extends h {
    public final dc A;
    public final ImageView B;
    public final yb C;
    public final ImageView D;
    public final ImageView E;
    public final LinearLayout F;

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f28717w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f28718x;

    /* renamed from: y  reason: collision with root package name */
    public final MyTextView f28719y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f28720z;

    protected t9(Object obj, View view, int i10, LinearLayout linearLayout, MyTextView myTextView, MyTextView myTextView2, TextView textView, dc dcVar, ImageView imageView, yb ybVar, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout2) {
        super(obj, view, i10);
        this.f28717w = linearLayout;
        this.f28718x = myTextView;
        this.f28719y = myTextView2;
        this.f28720z = textView;
        this.A = dcVar;
        this.B = imageView;
        this.C = ybVar;
        this.D = imageView2;
        this.E = imageView3;
        this.F = linearLayout2;
    }
}
