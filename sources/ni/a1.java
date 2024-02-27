package ni;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.h;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class a1 extends h {
    public final EditText A;
    public final TextView B;
    public final ImageView C;
    public final ImageView D;
    public final LinearLayout E;
    public final TextView F;
    public final MyTextView G;
    public final MyTextView H;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f25171w;

    /* renamed from: x  reason: collision with root package name */
    public final AppCompatButton f25172x;

    /* renamed from: y  reason: collision with root package name */
    public final AppCompatButton f25173y;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatTextView f25174z;

    protected a1(Object obj, View view, int i10, TextView textView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatTextView appCompatTextView, EditText editText, TextView textView2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView3, MyTextView myTextView, MyTextView myTextView2) {
        super(obj, view, i10);
        this.f25171w = textView;
        this.f25172x = appCompatButton;
        this.f25173y = appCompatButton2;
        this.f25174z = appCompatTextView;
        this.A = editText;
        this.B = textView2;
        this.C = imageView;
        this.D = imageView2;
        this.E = linearLayout;
        this.F = textView3;
        this.G = myTextView;
        this.H = myTextView2;
    }
}
