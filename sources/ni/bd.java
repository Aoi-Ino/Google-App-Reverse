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

public final class bd {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f25564a;

    /* renamed from: b  reason: collision with root package name */
    public final RelativeLayout f25565b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25566c;

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f25567d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f25568e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f25569f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25570g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f25571h;

    /* renamed from: i  reason: collision with root package name */
    public final qd f25572i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25573j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25574k;

    private bd(LinearLayout linearLayout, RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, ImageView imageView2, ImageView imageView3, TextView textView, ImageView imageView4, qd qdVar, TextView textView2, TextView textView3) {
        this.f25564a = linearLayout;
        this.f25565b = relativeLayout;
        this.f25566c = imageView;
        this.f25567d = relativeLayout2;
        this.f25568e = imageView2;
        this.f25569f = imageView3;
        this.f25570g = textView;
        this.f25571h = imageView4;
        this.f25572i = qdVar;
        this.f25573j = textView2;
        this.f25574k = textView3;
    }

    public static bd a(View view) {
        int i10 = R.id.changeLangRl;
        RelativeLayout relativeLayout = (RelativeLayout) a.a(view, R.id.changeLangRl);
        if (relativeLayout != null) {
            i10 = R.id.changeMpinImg;
            ImageView imageView = (ImageView) a.a(view, R.id.changeMpinImg);
            if (imageView != null) {
                i10 = R.id.changeMpinRl;
                RelativeLayout relativeLayout2 = (RelativeLayout) a.a(view, R.id.changeMpinRl);
                if (relativeLayout2 != null) {
                    i10 = R.id.changeMpinViewImg;
                    ImageView imageView2 = (ImageView) a.a(view, R.id.changeMpinViewImg);
                    if (imageView2 != null) {
                        i10 = R.id.chooseLangImg;
                        ImageView imageView3 = (ImageView) a.a(view, R.id.chooseLangImg);
                        if (imageView3 != null) {
                            i10 = R.id.chooseLangTv;
                            TextView textView = (TextView) a.a(view, R.id.chooseLangTv);
                            if (textView != null) {
                                i10 = R.id.chooseLangViewIv;
                                ImageView imageView4 = (ImageView) a.a(view, R.id.chooseLangViewIv);
                                if (imageView4 != null) {
                                    i10 = R.id.topHolder;
                                    View a10 = a.a(view, R.id.topHolder);
                                    if (a10 != null) {
                                        qd a11 = qd.a(a10);
                                        i10 = R.id.txtSettings;
                                        TextView textView2 = (TextView) a.a(view, R.id.txtSettings);
                                        if (textView2 != null) {
                                            i10 = R.id.virtualRcTv;
                                            TextView textView3 = (TextView) a.a(view, R.id.virtualRcTv);
                                            if (textView3 != null) {
                                                return new bd((LinearLayout) view, relativeLayout, imageView, relativeLayout2, imageView2, imageView3, textView, imageView4, a11, textView2, textView3);
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

    public static bd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static bd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.setting_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f25564a;
    }
}
