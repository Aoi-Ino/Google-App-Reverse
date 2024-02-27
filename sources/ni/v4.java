package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class v4 {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f28976a;

    /* renamed from: b  reason: collision with root package name */
    public final qd f28977b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f28978c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f28979d;

    /* renamed from: e  reason: collision with root package name */
    public final WebView f28980e;

    /* renamed from: f  reason: collision with root package name */
    public final CoordinatorLayout f28981f;

    private v4(CoordinatorLayout coordinatorLayout, qd qdVar, FrameLayout frameLayout, LinearLayout linearLayout, WebView webView, CoordinatorLayout coordinatorLayout2) {
        this.f28976a = coordinatorLayout;
        this.f28977b = qdVar;
        this.f28978c = frameLayout;
        this.f28979d = linearLayout;
        this.f28980e = webView;
        this.f28981f = coordinatorLayout2;
    }

    public static v4 a(View view) {
        int i10 = R.id.holder1;
        View a10 = a.a(view, R.id.holder1);
        if (a10 != null) {
            qd a11 = qd.a(a10);
            i10 = R.id.nextBtnFl;
            FrameLayout frameLayout = (FrameLayout) a.a(view, R.id.nextBtnFl);
            if (frameLayout != null) {
                i10 = R.id.next_button;
                LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.next_button);
                if (linearLayout != null) {
                    i10 = R.id.paymentWv;
                    WebView webView = (WebView) a.a(view, R.id.paymentWv);
                    if (webView != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                        return new v4(coordinatorLayout, a11, frameLayout, linearLayout, webView, coordinatorLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static v4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static v4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_informational_web_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f28976a;
    }
}
