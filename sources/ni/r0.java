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

public abstract class r0 extends h {
    public final FrameLayout A;
    public final WebView B;
    public final WebView C;
    public final ShimmerFrameLayout D;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f28317w;

    /* renamed from: x  reason: collision with root package name */
    public final dc f28318x;

    /* renamed from: y  reason: collision with root package name */
    public final FrameLayout f28319y;

    /* renamed from: z  reason: collision with root package name */
    public final yb f28320z;

    protected r0(Object obj, View view, int i10, ImageView imageView, dc dcVar, FrameLayout frameLayout, yb ybVar, FrameLayout frameLayout2, WebView webView, WebView webView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i10);
        this.f28317w = imageView;
        this.f28318x = dcVar;
        this.f28319y = frameLayout;
        this.f28320z = ybVar;
        this.A = frameLayout2;
        this.B = webView;
        this.C = webView2;
        this.D = shimmerFrameLayout;
    }

    public static r0 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static r0 y(LayoutInflater layoutInflater, Object obj) {
        return (r0) h.o(layoutInflater, R.layout.activity_cl_fee_payment, (ViewGroup) null, false, obj);
    }
}
