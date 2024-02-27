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

public final class cd {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f25783a;

    /* renamed from: b  reason: collision with root package name */
    public final qd f25784b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25785c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f25786d;

    /* renamed from: e  reason: collision with root package name */
    public final WebView f25787e;

    /* renamed from: f  reason: collision with root package name */
    public final CoordinatorLayout f25788f;

    private cd(CoordinatorLayout coordinatorLayout, qd qdVar, LinearLayout linearLayout, FrameLayout frameLayout, WebView webView, CoordinatorLayout coordinatorLayout2) {
        this.f25783a = coordinatorLayout;
        this.f25784b = qdVar;
        this.f25785c = linearLayout;
        this.f25786d = frameLayout;
        this.f25787e = webView;
        this.f25788f = coordinatorLayout2;
    }

    public static cd a(View view) {
        int i10 = R.id.holder1;
        View a10 = a.a(view, R.id.holder1);
        if (a10 != null) {
            qd a11 = qd.a(a10);
            i10 = R.id.homeBtn;
            LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.homeBtn);
            if (linearLayout != null) {
                i10 = R.id.homeBtnFl;
                FrameLayout frameLayout = (FrameLayout) a.a(view, R.id.homeBtnFl);
                if (frameLayout != null) {
                    i10 = R.id.paymentWv;
                    WebView webView = (WebView) a.a(view, R.id.paymentWv);
                    if (webView != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                        return new cd(coordinatorLayout, a11, linearLayout, frameLayout, webView, coordinatorLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static cd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static cd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.slot_receipt_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f25783a;
    }
}
