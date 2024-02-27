package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f27385a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f27386b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f27387c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f27388d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f27389e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f27390f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f27391g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f27392h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27393i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27394j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27395k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27396l;

    /* renamed from: m  reason: collision with root package name */
    public final ConstraintLayout f27397m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f27398n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f27399o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f27400p;

    /* renamed from: q  reason: collision with root package name */
    public final dc f27401q;

    private m1(LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ConstraintLayout constraintLayout2, TextView textView7, TextView textView8, TextView textView9, dc dcVar) {
        this.f27385a = linearLayout;
        this.f27386b = constraintLayout;
        this.f27387c = textView;
        this.f27388d = imageView;
        this.f27389e = imageView2;
        this.f27390f = linearLayout2;
        this.f27391g = textView2;
        this.f27392h = linearLayout3;
        this.f27393i = textView3;
        this.f27394j = textView4;
        this.f27395k = textView5;
        this.f27396l = textView6;
        this.f27397m = constraintLayout2;
        this.f27398n = textView7;
        this.f27399o = textView8;
        this.f27400p = textView9;
        this.f27401q = dcVar;
    }

    public static m1 a(View view) {
        View view2 = view;
        int i10 = R.id.challan_help;
        ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view2, R.id.challan_help);
        if (constraintLayout != null) {
            i10 = R.id.helpSupport;
            TextView textView = (TextView) a.a(view2, R.id.helpSupport);
            if (textView != null) {
                i10 = R.id.imageView7;
                ImageView imageView = (ImageView) a.a(view2, R.id.imageView7);
                if (imageView != null) {
                    i10 = R.id.imageView8;
                    ImageView imageView2 = (ImageView) a.a(view2, R.id.imageView8);
                    if (imageView2 != null) {
                        i10 = R.id.layout_timing;
                        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.layout_timing);
                        if (linearLayout != null) {
                            i10 = R.id.phone_number_text;
                            TextView textView2 = (TextView) a.a(view2, R.id.phone_number_text);
                            if (textView2 != null) {
                                i10 = R.id.raise_complaint_ll;
                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.raise_complaint_ll);
                                if (linearLayout2 != null) {
                                    i10 = R.id.text;
                                    TextView textView3 = (TextView) a.a(view2, R.id.text);
                                    if (textView3 != null) {
                                        i10 = R.id.text1;
                                        TextView textView4 = (TextView) a.a(view2, R.id.text1);
                                        if (textView4 != null) {
                                            i10 = R.id.text_desc;
                                            TextView textView5 = (TextView) a.a(view2, R.id.text_desc);
                                            if (textView5 != null) {
                                                i10 = R.id.text_email;
                                                TextView textView6 = (TextView) a.a(view2, R.id.text_email);
                                                if (textView6 != null) {
                                                    i10 = R.id.text_number;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) a.a(view2, R.id.text_number);
                                                    if (constraintLayout2 != null) {
                                                        i10 = R.id.text_raise;
                                                        TextView textView7 = (TextView) a.a(view2, R.id.text_raise);
                                                        if (textView7 != null) {
                                                            i10 = R.id.text_time;
                                                            TextView textView8 = (TextView) a.a(view2, R.id.text_time);
                                                            if (textView8 != null) {
                                                                i10 = R.id.textView4;
                                                                TextView textView9 = (TextView) a.a(view2, R.id.textView4);
                                                                if (textView9 != null) {
                                                                    i10 = R.id.topheader;
                                                                    View a10 = a.a(view2, R.id.topheader);
                                                                    if (a10 != null) {
                                                                        return new m1((LinearLayout) view2, constraintLayout, textView, imageView, imageView2, linearLayout, textView2, linearLayout2, textView3, textView4, textView5, textView6, constraintLayout2, textView7, textView8, textView9, dc.a(a10));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static m1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static m1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_contact_us, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f27385a;
    }
}
