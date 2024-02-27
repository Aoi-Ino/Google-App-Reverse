package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

public abstract class i9 extends h {
    public final AppCompatTextView A;
    public final qd B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatTextView f26821w;

    /* renamed from: x  reason: collision with root package name */
    public final AppCompatTextView f26822x;

    /* renamed from: y  reason: collision with root package name */
    public final MyTextView f26823y;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatTextView f26824z;

    protected i9(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MyTextView myTextView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, qd qdVar, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7) {
        super(obj, view, i10);
        this.f26821w = appCompatTextView;
        this.f26822x = appCompatTextView2;
        this.f26823y = myTextView;
        this.f26824z = appCompatTextView3;
        this.A = appCompatTextView4;
        this.B = qdVar;
        this.C = appCompatImageView;
        this.D = appCompatTextView5;
        this.E = appCompatTextView6;
        this.F = appCompatTextView7;
    }

    public static i9 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static i9 y(LayoutInflater layoutInflater, Object obj) {
        return (i9) h.o(layoutInflater, R.layout.activity_verify_notice_payment_response, (ViewGroup) null, false, obj);
    }
}
