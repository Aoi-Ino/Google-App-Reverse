package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class be {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f25575a;

    /* renamed from: b  reason: collision with root package name */
    public final qd f25576b;

    /* renamed from: c  reason: collision with root package name */
    public final WebView f25577c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25578d;

    private be(LinearLayout linearLayout, qd qdVar, WebView webView, LinearLayout linearLayout2) {
        this.f25575a = linearLayout;
        this.f25576b = qdVar;
        this.f25577c = webView;
        this.f25578d = linearLayout2;
    }

    public static be a(View view) {
        int i10 = R.id.holder;
        View a10 = a.a(view, R.id.holder);
        if (a10 != null) {
            qd a11 = qd.a(a10);
            WebView webView = (WebView) a.a(view, R.id.paymentWv);
            if (webView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new be(linearLayout, a11, webView, linearLayout);
            }
            i10 = R.id.paymentWv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static be b(LayoutInflater layoutInflater) {
        return c(layoutInflater, (ViewGroup) null, false);
    }

    public static be c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.view_forms, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }
}
