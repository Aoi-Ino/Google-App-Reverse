package ni;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.h;
import com.facebook.shimmer.ShimmerFrameLayout;

public abstract class dd extends h {
    public final WebView A;
    public final WebView B;
    public final ShimmerFrameLayout C;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f25962w;

    /* renamed from: x  reason: collision with root package name */
    public final dc f25963x;

    /* renamed from: y  reason: collision with root package name */
    public final FrameLayout f25964y;

    /* renamed from: z  reason: collision with root package name */
    public final FrameLayout f25965z;

    protected dd(Object obj, View view, int i10, ImageView imageView, dc dcVar, FrameLayout frameLayout, FrameLayout frameLayout2, WebView webView, WebView webView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i10);
        this.f25962w = imageView;
        this.f25963x = dcVar;
        this.f25964y = frameLayout;
        this.f25965z = frameLayout2;
        this.A = webView;
        this.B = webView2;
        this.C = shimmerFrameLayout;
    }
}
