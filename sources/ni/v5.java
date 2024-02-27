package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.f;
import androidx.databinding.h;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.nic.mparivahan.R;

public abstract class v5 extends h {
    public final FrameLayout A;
    public final WebView B;
    public final WebView C;
    public final ShimmerFrameLayout D;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f28982w;

    /* renamed from: x  reason: collision with root package name */
    public final dc f28983x;

    /* renamed from: y  reason: collision with root package name */
    public final FrameLayout f28984y;

    /* renamed from: z  reason: collision with root package name */
    public final yb f28985z;

    protected v5(Object obj, View view, int i10, ImageView imageView, dc dcVar, FrameLayout frameLayout, yb ybVar, FrameLayout frameLayout2, WebView webView, WebView webView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i10);
        this.f28982w = imageView;
        this.f28983x = dcVar;
        this.f28984y = frameLayout;
        this.f28985z = ybVar;
        this.A = frameLayout2;
        this.B = webView;
        this.C = webView2;
        this.D = shimmerFrameLayout;
    }

    public static v5 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static v5 y(LayoutInflater layoutInflater, Object obj) {
        return (v5) h.o(layoutInflater, R.layout.activity_ll_payment, (ViewGroup) null, false, obj);
    }
}
