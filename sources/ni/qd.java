package ni;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.nic.mparivahan.R;
import k1.a;

public final class qd {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f28300a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f28301b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatImageView f28302c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f28303d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f28304e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatImageView f28305f;

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f28306g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatImageView f28307h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f28308i;

    private qd(LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, LinearLayout linearLayout3, TextView textView, AppCompatImageView appCompatImageView2, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView3, TextView textView2) {
        this.f28300a = linearLayout;
        this.f28301b = linearLayout2;
        this.f28302c = appCompatImageView;
        this.f28303d = linearLayout3;
        this.f28304e = textView;
        this.f28305f = appCompatImageView2;
        this.f28306g = relativeLayout;
        this.f28307h = appCompatImageView3;
        this.f28308i = textView2;
    }

    public static qd a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = R.id.launcherIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a.a(view, R.id.launcherIv);
        if (appCompatImageView != null) {
            i10 = R.id.mainLayout;
            LinearLayout linearLayout2 = (LinearLayout) a.a(view, R.id.mainLayout);
            if (linearLayout2 != null) {
                i10 = R.id.multi_service_label;
                TextView textView = (TextView) a.a(view, R.id.multi_service_label);
                if (textView != null) {
                    i10 = R.id.mvvm_back;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) a.a(view, R.id.mvvm_back);
                    if (appCompatImageView2 != null) {
                        i10 = R.id.nexGenHolder;
                        RelativeLayout relativeLayout = (RelativeLayout) a.a(view, R.id.nexGenHolder);
                        if (relativeLayout != null) {
                            i10 = R.id.notificationIv;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) a.a(view, R.id.notificationIv);
                            if (appCompatImageView3 != null) {
                                i10 = R.id.vahan_service_lable;
                                TextView textView2 = (TextView) a.a(view, R.id.vahan_service_lable);
                                if (textView2 != null) {
                                    return new qd(linearLayout, linearLayout, appCompatImageView, linearLayout2, textView, appCompatImageView2, relativeLayout, appCompatImageView3, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
