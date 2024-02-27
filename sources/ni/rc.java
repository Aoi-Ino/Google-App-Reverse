package ni;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class rc {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f28447a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f28448b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatImageView f28449c;

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f28450d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatImageView f28451e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f28452f;

    private rc(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView3, TextView textView) {
        this.f28447a = constraintLayout;
        this.f28448b = appCompatImageView;
        this.f28449c = appCompatImageView2;
        this.f28450d = relativeLayout;
        this.f28451e = appCompatImageView3;
        this.f28452f = textView;
    }

    public static rc a(View view) {
        int i10 = R.id.back_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a.a(view, R.id.back_icon);
        if (appCompatImageView != null) {
            i10 = R.id.launcherIv;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) a.a(view, R.id.launcherIv);
            if (appCompatImageView2 != null) {
                i10 = R.id.nexGenHolder;
                RelativeLayout relativeLayout = (RelativeLayout) a.a(view, R.id.nexGenHolder);
                if (relativeLayout != null) {
                    i10 = R.id.notificationIv;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) a.a(view, R.id.notificationIv);
                    if (appCompatImageView3 != null) {
                        i10 = R.id.service_label;
                        TextView textView = (TextView) a.a(view, R.id.service_label);
                        if (textView != null) {
                            return new rc((ConstraintLayout) view, appCompatImageView, appCompatImageView2, relativeLayout, appCompatImageView3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
