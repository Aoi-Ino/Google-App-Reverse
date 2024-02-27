package ni;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.h;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

public abstract class r5 extends h {
    public final ImageView A;
    public final dc B;
    public final AppCompatEditText C;
    public final AppCompatEditText D;
    public final EditText E;
    public final CardView F;
    public final MyTextView G;
    public final CustomWegetLayout H;
    public final MyTextView I;
    public final MyTextView J;
    public final AppCompatTextView K;

    /* renamed from: w  reason: collision with root package name */
    public final CustomWegetLayout f28379w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f28380x;

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout f28381y;

    /* renamed from: z  reason: collision with root package name */
    public final CardView f28382z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected r5(Object obj, View view, int i10, CustomWegetLayout customWegetLayout, TextView textView, LinearLayout linearLayout, CardView cardView, ImageView imageView, dc dcVar, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, EditText editText, CardView cardView2, MyTextView myTextView, CustomWegetLayout customWegetLayout2, MyTextView myTextView2, MyTextView myTextView3, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.f28379w = customWegetLayout;
        this.f28380x = textView;
        this.f28381y = linearLayout;
        this.f28382z = cardView;
        this.A = imageView;
        this.B = dcVar;
        this.C = appCompatEditText;
        this.D = appCompatEditText2;
        this.E = editText;
        this.F = cardView2;
        this.G = myTextView;
        this.H = customWegetLayout2;
        this.I = myTextView2;
        this.J = myTextView3;
        this.K = appCompatTextView;
    }
}
