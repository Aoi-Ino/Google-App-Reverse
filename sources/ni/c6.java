package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import com.nic.mparivahan.R;
import k1.a;

public final class c6 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f25626a;

    /* renamed from: b  reason: collision with root package name */
    public final FragmentContainerView f25627b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25628c;

    private c6(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, ImageView imageView) {
        this.f25626a = linearLayout;
        this.f25627b = fragmentContainerView;
        this.f25628c = imageView;
    }

    public static c6 a(View view) {
        int i10 = R.id.main_activity_fragmentContainer;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) a.a(view, R.id.main_activity_fragmentContainer);
        if (fragmentContainerView != null) {
            i10 = R.id.mvvm_back;
            ImageView imageView = (ImageView) a.a(view, R.id.mvvm_back);
            if (imageView != null) {
                return new c6((LinearLayout) view, fragmentContainerView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static c6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f25626a;
    }
}
