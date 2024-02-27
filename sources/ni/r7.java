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

public abstract class r7 extends h {
    public final WebView A;
    public final ShimmerFrameLayout B;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f28386w;

    /* renamed from: x  reason: collision with root package name */
    public final dc f28387x;

    /* renamed from: y  reason: collision with root package name */
    public final FrameLayout f28388y;

    /* renamed from: z  reason: collision with root package name */
    public final FrameLayout f28389z;

    protected r7(Object obj, View view, int i10, ImageView imageView, dc dcVar, FrameLayout frameLayout, FrameLayout frameLayout2, WebView webView, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i10);
        this.f28386w = imageView;
        this.f28387x = dcVar;
        this.f28388y = frameLayout;
        this.f28389z = frameLayout2;
        this.A = webView;
        this.B = shimmerFrameLayout;
    }

    public static r7 x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static r7 y(LayoutInflater layoutInflater, Object obj) {
        return (r7) h.o(layoutInflater, R.layout.activity_reprint, (ViewGroup) null, false, obj);
    }
}
