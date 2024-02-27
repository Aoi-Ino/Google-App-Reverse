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

public abstract class ub extends h {
    public final WebView A;
    public final ShimmerFrameLayout B;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f28861w;

    /* renamed from: x  reason: collision with root package name */
    public final dc f28862x;

    /* renamed from: y  reason: collision with root package name */
    public final FrameLayout f28863y;

    /* renamed from: z  reason: collision with root package name */
    public final FrameLayout f28864z;

    protected ub(Object obj, View view, int i10, ImageView imageView, dc dcVar, FrameLayout frameLayout, FrameLayout frameLayout2, WebView webView, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i10);
        this.f28861w = imageView;
        this.f28862x = dcVar;
        this.f28863y = frameLayout;
        this.f28864z = frameLayout2;
        this.A = webView;
        this.B = shimmerFrameLayout;
    }

    public static ub x(LayoutInflater layoutInflater) {
        f.d();
        return y(layoutInflater, (Object) null);
    }

    public static ub y(LayoutInflater layoutInflater, Object obj) {
        return (ub) h.o(layoutInflater, R.layout.ll_test_activity, (ViewGroup) null, false, obj);
    }
}
