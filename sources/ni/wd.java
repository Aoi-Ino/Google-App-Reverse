package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class wd {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f29245a;

    /* renamed from: b  reason: collision with root package name */
    public final qd f29246b;

    /* renamed from: c  reason: collision with root package name */
    public final WebView f29247c;

    private wd(CoordinatorLayout coordinatorLayout, qd qdVar, WebView webView) {
        this.f29245a = coordinatorLayout;
        this.f29246b = qdVar;
        this.f29247c = webView;
    }

    public static wd a(View view) {
        int i10 = R.id.topHolder;
        View a10 = a.a(view, R.id.topHolder);
        if (a10 != null) {
            qd a11 = qd.a(a10);
            WebView webView = (WebView) a.a(view, R.id.web_view);
            if (webView != null) {
                return new wd((CoordinatorLayout) view, a11, webView);
            }
            i10 = R.id.web_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static wd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static wd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.vahan_payment_receipt, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f29245a;
    }
}
