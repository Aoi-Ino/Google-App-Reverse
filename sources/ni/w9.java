package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class w9 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29219a;

    /* renamed from: b  reason: collision with root package name */
    public final qd f29220b;

    /* renamed from: c  reason: collision with root package name */
    public final WebView f29221c;

    private w9(LinearLayout linearLayout, qd qdVar, WebView webView) {
        this.f29219a = linearLayout;
        this.f29220b = qdVar;
        this.f29221c = webView;
    }

    public static w9 a(View view) {
        int i10 = R.id.holder1;
        View a10 = a.a(view, R.id.holder1);
        if (a10 != null) {
            qd a11 = qd.a(a10);
            WebView webView = (WebView) a.a(view, R.id.paymentWv);
            if (webView != null) {
                return new w9((LinearLayout) view, a11, webView);
            }
            i10 = R.id.paymentWv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static w9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static w9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.challan_payment_webview, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29219a;
    }
}
