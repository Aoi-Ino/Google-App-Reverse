package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;
import k1.a;

public final class yd {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f29609a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f29610b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f29611c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f29612d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f29613e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f29614f;

    /* renamed from: g  reason: collision with root package name */
    public final qd f29615g;

    private yd(RelativeLayout relativeLayout, TextView textView, TextView textView2, ImageView imageView, LinearLayout linearLayout, TextView textView3, qd qdVar) {
        this.f29609a = relativeLayout;
        this.f29610b = textView;
        this.f29611c = textView2;
        this.f29612d = imageView;
        this.f29613e = linearLayout;
        this.f29614f = textView3;
        this.f29615g = qdVar;
    }

    public static yd a(View view) {
        int i10 = R.id.apptNoTv;
        TextView textView = (TextView) a.a(view, R.id.apptNoTv);
        if (textView != null) {
            i10 = R.id.homeTv;
            TextView textView2 = (TextView) a.a(view, R.id.homeTv);
            if (textView2 != null) {
                i10 = R.id.imageView6;
                ImageView imageView = (ImageView) a.a(view, R.id.imageView6);
                if (imageView != null) {
                    i10 = R.id.lin_layour;
                    LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.lin_layour);
                    if (linearLayout != null) {
                        i10 = R.id.reprint_recipt;
                        TextView textView3 = (TextView) a.a(view, R.id.reprint_recipt);
                        if (textView3 != null) {
                            i10 = R.id.topHolder;
                            View a10 = a.a(view, R.id.topHolder);
                            if (a10 != null) {
                                return new yd((RelativeLayout) view, textView, textView2, imageView, linearLayout, textView3, qd.a(a10));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static yd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static yd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.vahan_slot_success_booked, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f29609a;
    }
}
