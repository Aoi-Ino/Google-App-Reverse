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

public abstract class n2 extends h {
    public final WebView A;
    public final WebView B;
    public final ShimmerFrameLayout C;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f27543w;

    /* renamed from: x  reason: collision with root package name */
    public final dc f27544x;

    /* renamed from: y  reason: collision with root package name */
    public final FrameLayout f27545y;

    /* renamed from: z  reason: collision with root package name */
    public final FrameLayout f27546z;

    protected n2(Object obj, View view, int i10, ImageView imageView, dc dcVar, FrameLayout frameLayout, FrameLayout frameLayout2, WebView webView, WebView webView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i10);
        this.f27543w = imageView;
        this.f27544x = dcVar;
        this.f27545y = frameLayout;
        this.f27546z = frameLayout2;
        this.A = webView;
        this.B = webView2;
        this.C = shimmerFrameLayout;
    }

    public static n2 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static n2 y(LayoutInflater layoutInflater, Object obj) {
        return (n2) h.o(layoutInflater, R.layout.activity_dl_fee_payment, (ViewGroup) null, false, obj);
    }
}
