package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class ta {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f28721a;

    /* renamed from: b  reason: collision with root package name */
    public final dc f28722b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f28723c;

    /* renamed from: d  reason: collision with root package name */
    public final WebView f28724d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f28725e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f28726f;

    private ta(CoordinatorLayout coordinatorLayout, dc dcVar, FrameLayout frameLayout, WebView webView, TextView textView, TextView textView2) {
        this.f28721a = coordinatorLayout;
        this.f28722b = dcVar;
        this.f28723c = frameLayout;
        this.f28724d = webView;
        this.f28725e = textView;
        this.f28726f = textView2;
    }

    public static ta a(View view) {
        int i10 = R.id.header_layout;
        View a10 = a.a(view, R.id.header_layout);
        if (a10 != null) {
            dc a11 = dc.a(a10);
            i10 = R.id.linear_parent;
            FrameLayout frameLayout = (FrameLayout) a.a(view, R.id.linear_parent);
            if (frameLayout != null) {
                i10 = R.id.paymentWv;
                WebView webView = (WebView) a.a(view, R.id.paymentWv);
                if (webView != null) {
                    i10 = R.id.vehicle_number;
                    TextView textView = (TextView) a.a(view, R.id.vehicle_number);
                    if (textView != null) {
                        i10 = R.id.vehicle_view;
                        TextView textView2 = (TextView) a.a(view, R.id.vehicle_view);
                        if (textView2 != null) {
                            return new ta((CoordinatorLayout) view, a11, frameLayout, webView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ta c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ta d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.esign_dms, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f28721a;
    }
}
