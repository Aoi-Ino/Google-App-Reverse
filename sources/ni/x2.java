package ni;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.h;
import com.facebook.shimmer.ShimmerFrameLayout;

public abstract class x2 extends h {
    public final yb A;
    public final FrameLayout B;
    public final WebView C;
    public final WebView D;
    public final ShimmerFrameLayout E;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f29287w;

    /* renamed from: x  reason: collision with root package name */
    public final dc f29288x;

    /* renamed from: y  reason: collision with root package name */
    public final FrameLayout f29289y;

    /* renamed from: z  reason: collision with root package name */
    public final LinearLayout f29290z;

    protected x2(Object obj, View view, int i10, ImageView imageView, dc dcVar, FrameLayout frameLayout, LinearLayout linearLayout, yb ybVar, FrameLayout frameLayout2, WebView webView, WebView webView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i10);
        this.f29287w = imageView;
        this.f29288x = dcVar;
        this.f29289y = frameLayout;
        this.f29290z = linearLayout;
        this.A = ybVar;
        this.B = frameLayout2;
        this.C = webView;
        this.D = webView2;
        this.E = shimmerFrameLayout;
    }
}
