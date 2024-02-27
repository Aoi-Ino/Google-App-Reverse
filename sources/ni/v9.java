package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class v9 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f29042a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f29043b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f29044c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f29045d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatTextView f29046e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatTextView f29047f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatImageView f29048g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatTextView f29049h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f29050i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f29051j;

    private v9(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MyTextView myTextView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7) {
        this.f29042a = scrollView;
        this.f29043b = appCompatTextView;
        this.f29044c = appCompatTextView2;
        this.f29045d = myTextView;
        this.f29046e = appCompatTextView3;
        this.f29047f = appCompatTextView4;
        this.f29048g = appCompatImageView;
        this.f29049h = appCompatTextView5;
        this.f29050i = appCompatTextView6;
        this.f29051j = appCompatTextView7;
    }

    public static v9 a(View view) {
        int i10 = R.id.amountTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view, R.id.amountTv);
        if (appCompatTextView != null) {
            i10 = R.id.amountValueTv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view, R.id.amountValueTv);
            if (appCompatTextView2 != null) {
                i10 = R.id.buttonTv;
                MyTextView myTextView = (MyTextView) a.a(view, R.id.buttonTv);
                if (myTextView != null) {
                    i10 = R.id.challanNoTv;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view, R.id.challanNoTv);
                    if (appCompatTextView3 != null) {
                        i10 = R.id.challanNoValueTv;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) a.a(view, R.id.challanNoValueTv);
                        if (appCompatTextView4 != null) {
                            i10 = R.id.paymentResponseIv;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) a.a(view, R.id.paymentResponseIv);
                            if (appCompatImageView != null) {
                                i10 = R.id.transactionStatusTv;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) a.a(view, R.id.transactionStatusTv);
                                if (appCompatTextView5 != null) {
                                    i10 = R.id.vehcileNoValueTv;
                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) a.a(view, R.id.vehcileNoValueTv);
                                    if (appCompatTextView6 != null) {
                                        i10 = R.id.vehicleNoTv;
                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) a.a(view, R.id.vehicleNoTv);
                                        if (appCompatTextView7 != null) {
                                            return new v9((ScrollView) view, appCompatTextView, appCompatTextView2, myTextView, appCompatTextView3, appCompatTextView4, appCompatImageView, appCompatTextView5, appCompatTextView6, appCompatTextView7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static v9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static v9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.challan_demo_response_payment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f29042a;
    }
}
