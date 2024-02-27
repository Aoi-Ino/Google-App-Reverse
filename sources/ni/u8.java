package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class u8 {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f28853a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f28854b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f28855c;

    /* renamed from: d  reason: collision with root package name */
    public final qd f28856d;

    /* renamed from: e  reason: collision with root package name */
    public final WebView f28857e;

    private u8(ConstraintLayout constraintLayout, LinearLayout linearLayout, FrameLayout frameLayout, qd qdVar, WebView webView) {
        this.f28853a = constraintLayout;
        this.f28854b = linearLayout;
        this.f28855c = frameLayout;
        this.f28856d = qdVar;
        this.f28857e = webView;
    }

    public static u8 a(View view) {
        int i10 = R.id.download;
        LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.download);
        if (linearLayout != null) {
            i10 = R.id.homeBtnFl;
            FrameLayout frameLayout = (FrameLayout) a.a(view, R.id.homeBtnFl);
            if (frameLayout != null) {
                i10 = R.id.topHolder;
                View a10 = a.a(view, R.id.topHolder);
                if (a10 != null) {
                    qd a11 = qd.a(a10);
                    i10 = R.id.web_view;
                    WebView webView = (WebView) a.a(view, R.id.web_view);
                    if (webView != null) {
                        return new u8((ConstraintLayout) view, linearLayout, frameLayout, a11, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static u8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static u8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_v__payment_receipt, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f28853a;
    }
}
