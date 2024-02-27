package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class oc {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f27875a;

    /* renamed from: b  reason: collision with root package name */
    public final qd f27876b;

    /* renamed from: c  reason: collision with root package name */
    public final WebView f27877c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f27878d;

    private oc(LinearLayout linearLayout, qd qdVar, WebView webView, LinearLayout linearLayout2) {
        this.f27875a = linearLayout;
        this.f27876b = qdVar;
        this.f27877c = webView;
        this.f27878d = linearLayout2;
    }

    public static oc a(View view) {
        int i10 = R.id.echallanHolder;
        View a10 = a.a(view, R.id.echallanHolder);
        if (a10 != null) {
            qd a11 = qd.a(a10);
            WebView webView = (WebView) a.a(view, R.id.paymentWv);
            if (webView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new oc(linearLayout, a11, webView, linearLayout);
            }
            i10 = R.id.paymentWv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static oc b(LayoutInflater layoutInflater) {
        return c(layoutInflater, (ViewGroup) null, false);
    }

    public static oc c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.print_challan_web_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }
}
