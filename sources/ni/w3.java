package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class w3 {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f29144a;

    /* renamed from: b  reason: collision with root package name */
    public final rc f29145b;

    /* renamed from: c  reason: collision with root package name */
    public final WebView f29146c;

    private w3(ConstraintLayout constraintLayout, rc rcVar, WebView webView) {
        this.f29144a = constraintLayout;
        this.f29145b = rcVar;
        this.f29146c = webView;
    }

    public static w3 a(View view) {
        int i10 = R.id.include3;
        View a10 = a.a(view, R.id.include3);
        if (a10 != null) {
            rc a11 = rc.a(a10);
            WebView webView = (WebView) a.a(view, R.id.web_view);
            if (webView != null) {
                return new w3((ConstraintLayout) view, a11, webView);
            }
            i10 = R.id.web_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static w3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static w3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_download_application, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f29144a;
    }
}
