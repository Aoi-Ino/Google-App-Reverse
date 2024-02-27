package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class ua {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f28858a;

    /* renamed from: b  reason: collision with root package name */
    public final qd f28859b;

    /* renamed from: c  reason: collision with root package name */
    public final WebView f28860c;

    private ua(LinearLayout linearLayout, qd qdVar, WebView webView) {
        this.f28858a = linearLayout;
        this.f28859b = qdVar;
        this.f28860c = webView;
    }

    public static ua a(View view) {
        int i10 = R.id.topHolder;
        View a10 = a.a(view, R.id.topHolder);
        if (a10 != null) {
            qd a11 = qd.a(a10);
            WebView webView = (WebView) a.a(view, R.id.videoWv);
            if (webView != null) {
                return new ua((LinearLayout) view, a11, webView);
            }
            i10 = R.id.videoWv;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ua c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ua d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.evidence_video_play, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f28858a;
    }
}
