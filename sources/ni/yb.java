package ni;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;
import k1.a;

public final class yb {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29574a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f29575b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f29576c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f29577d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f29578e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f29579f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f29580g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f29581h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f29582i;

    private yb(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, LinearLayout linearLayout4, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.f29574a = linearLayout;
        this.f29575b = linearLayout2;
        this.f29576c = linearLayout3;
        this.f29577d = imageView;
        this.f29578e = linearLayout4;
        this.f29579f = imageView2;
        this.f29580g = textView;
        this.f29581h = textView2;
        this.f29582i = textView3;
    }

    public static yb a(View view) {
        int i10 = R.id.ll_home;
        LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.ll_home);
        if (linearLayout != null) {
            i10 = R.id.ll_homee;
            LinearLayout linearLayout2 = (LinearLayout) a.a(view, R.id.ll_homee);
            if (linearLayout2 != null) {
                i10 = R.id.mvvm_back;
                ImageView imageView = (ImageView) a.a(view, R.id.mvvm_back);
                if (imageView != null) {
                    LinearLayout linearLayout3 = (LinearLayout) view;
                    i10 = R.id.plus_icons;
                    ImageView imageView2 = (ImageView) a.a(view, R.id.plus_icons);
                    if (imageView2 != null) {
                        i10 = R.id.service_label;
                        TextView textView = (TextView) a.a(view, R.id.service_label);
                        if (textView != null) {
                            i10 = R.id.service_label_dl;
                            TextView textView2 = (TextView) a.a(view, R.id.service_label_dl);
                            if (textView2 != null) {
                                i10 = R.id.service_label_two;
                                TextView textView3 = (TextView) a.a(view, R.id.service_label_two);
                                if (textView3 != null) {
                                    return new yb(linearLayout3, linearLayout, linearLayout2, imageView, linearLayout3, imageView2, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
