package ni;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.h;
import com.facebook.shimmer.ShimmerFrameLayout;

public abstract class wb extends h {
    public final WebView A;
    public final WebView B;
    public final ShimmerFrameLayout C;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f29227w;

    /* renamed from: x  reason: collision with root package name */
    public final dc f29228x;

    /* renamed from: y  reason: collision with root package name */
    public final FrameLayout f29229y;

    /* renamed from: z  reason: collision with root package name */
    public final FrameLayout f29230z;

    protected wb(Object obj, View view, int i10, ImageView imageView, dc dcVar, FrameLayout frameLayout, FrameLayout frameLayout2, WebView webView, WebView webView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i10);
        this.f29227w = imageView;
        this.f29228x = dcVar;
        this.f29229y = frameLayout;
        this.f29230z = frameLayout2;
        this.A = webView;
        this.B = webView2;
        this.C = shimmerFrameLayout;
    }
}
