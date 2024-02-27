package ni;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import k1.a;

public final class dc {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f25955a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f25956b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25957c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25958d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f25959e;

    /* renamed from: f  reason: collision with root package name */
    public final CardView f25960f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25961g;

    private dc(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView2, CardView cardView, TextView textView) {
        this.f25955a = linearLayout;
        this.f25956b = imageView;
        this.f25957c = linearLayout2;
        this.f25958d = linearLayout3;
        this.f25959e = imageView2;
        this.f25960f = cardView;
        this.f25961g = textView;
    }

    public static dc a(View view) {
        int i10 = R.id.iv_report_traffic_violation_icon;
        ImageView imageView = (ImageView) a.a(view, R.id.iv_report_traffic_violation_icon);
        if (imageView != null) {
            i10 = R.id.ll_home;
            LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.ll_home);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i10 = R.id.mvvm_Back;
                ImageView imageView2 = (ImageView) a.a(view, R.id.mvvm_Back);
                if (imageView2 != null) {
                    i10 = R.id.round_card_view;
                    CardView cardView = (CardView) a.a(view, R.id.round_card_view);
                    if (cardView != null) {
                        i10 = R.id.service_label;
                        TextView textView = (TextView) a.a(view, R.id.service_label);
                        if (textView != null) {
                            return new dc(linearLayout2, imageView, linearLayout, linearLayout2, imageView2, cardView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
