package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class gc {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f26535a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f26536b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26537c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f26538d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26539e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26540f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26541g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26542h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26543i;

    private gc(CoordinatorLayout coordinatorLayout, TextView textView, TextView textView2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f26535a = coordinatorLayout;
        this.f26536b = textView;
        this.f26537c = textView2;
        this.f26538d = linearLayout;
        this.f26539e = linearLayout2;
        this.f26540f = textView3;
        this.f26541g = textView4;
        this.f26542h = textView5;
        this.f26543i = textView6;
    }

    public static gc a(View view) {
        int i10 = R.id.btn_sign_in;
        TextView textView = (TextView) a.a(view, R.id.btn_sign_in);
        if (textView != null) {
            i10 = R.id.create_account;
            TextView textView2 = (TextView) a.a(view, R.id.create_account);
            if (textView2 != null) {
                i10 = R.id.sign_in;
                LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.sign_in);
                if (linearLayout != null) {
                    i10 = R.id.sign_up;
                    LinearLayout linearLayout2 = (LinearLayout) a.a(view, R.id.sign_up);
                    if (linearLayout2 != null) {
                        i10 = R.id.tv_disc;
                        TextView textView3 = (TextView) a.a(view, R.id.tv_disc);
                        if (textView3 != null) {
                            i10 = R.id.tv_new_mpariv;
                            TextView textView4 = (TextView) a.a(view, R.id.tv_new_mpariv);
                            if (textView4 != null) {
                                i10 = R.id.tv_sign_in;
                                TextView textView5 = (TextView) a.a(view, R.id.tv_sign_in);
                                if (textView5 != null) {
                                    i10 = R.id.tv_your_account;
                                    TextView textView6 = (TextView) a.a(view, R.id.tv_your_account);
                                    if (textView6 != null) {
                                        return new gc((CoordinatorLayout) view, textView, textView2, linearLayout, linearLayout2, textView3, textView4, textView5, textView6);
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

    public static gc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static gc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.mvvm_sign_option, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f26535a;
    }
}
