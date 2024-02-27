package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f26908a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f26909b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26910c;

    /* renamed from: d  reason: collision with root package name */
    public final RadioButton f26911d;

    /* renamed from: e  reason: collision with root package name */
    public final qd f26912e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatTextView f26913f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f26914g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatTextView f26915h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f26916i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatButton f26917j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f26918k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatTextView f26919l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f26920m;

    /* renamed from: n  reason: collision with root package name */
    public final RadioButton f26921n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26922o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26923p;

    private j1(CoordinatorLayout coordinatorLayout, MyTextView myTextView, LinearLayout linearLayout, RadioButton radioButton, qd qdVar, AppCompatTextView appCompatTextView, MyTextView myTextView2, AppCompatTextView appCompatTextView2, MyTextView myTextView3, AppCompatButton appCompatButton, MyTextView myTextView4, AppCompatTextView appCompatTextView3, LinearLayout linearLayout2, RadioButton radioButton2, TextView textView, TextView textView2) {
        this.f26908a = coordinatorLayout;
        this.f26909b = myTextView;
        this.f26910c = linearLayout;
        this.f26911d = radioButton;
        this.f26912e = qdVar;
        this.f26913f = appCompatTextView;
        this.f26914g = myTextView2;
        this.f26915h = appCompatTextView2;
        this.f26916i = myTextView3;
        this.f26917j = appCompatButton;
        this.f26918k = myTextView4;
        this.f26919l = appCompatTextView3;
        this.f26920m = linearLayout2;
        this.f26921n = radioButton2;
        this.f26922o = textView;
        this.f26923p = textView2;
    }

    public static j1 a(View view) {
        View view2 = view;
        int i10 = R.id.applNoTv;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.applNoTv);
        if (myTextView != null) {
            i10 = R.id.applicationNoLl;
            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.applicationNoLl);
            if (linearLayout != null) {
                i10 = R.id.applicationNoRb;
                RadioButton radioButton = (RadioButton) a.a(view2, R.id.applicationNoRb);
                if (radioButton != null) {
                    i10 = R.id.applicationStatusHeader;
                    View a10 = a.a(view2, R.id.applicationStatusHeader);
                    if (a10 != null) {
                        qd a11 = qd.a(a10);
                        i10 = R.id.fee_amount;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.fee_amount);
                        if (appCompatTextView != null) {
                            i10 = R.id.fine_amount_tv;
                            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.fine_amount_tv);
                            if (myTextView2 != null) {
                                i10 = R.id.fine_amount_txt;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.fine_amount_txt);
                                if (appCompatTextView2 != null) {
                                    i10 = R.id.idLayoutTitle;
                                    MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.idLayoutTitle);
                                    if (myTextView3 != null) {
                                        i10 = R.id.paynow;
                                        AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.paynow);
                                        if (appCompatButton != null) {
                                            i10 = R.id.total_amount_tv;
                                            MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.total_amount_tv);
                                            if (myTextView4 != null) {
                                                i10 = R.id.total_amount_txt;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.total_amount_txt);
                                                if (appCompatTextView3 != null) {
                                                    i10 = R.id.vehicleNoLl;
                                                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.vehicleNoLl);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.vehicleNoRb;
                                                        RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.vehicleNoRb);
                                                        if (radioButton2 != null) {
                                                            i10 = R.id.vehicle_number;
                                                            TextView textView = (TextView) a.a(view2, R.id.vehicle_number);
                                                            if (textView != null) {
                                                                i10 = R.id.vehicle_view;
                                                                TextView textView2 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                if (textView2 != null) {
                                                                    return new j1((CoordinatorLayout) view2, myTextView, linearLayout, radioButton, a11, appCompatTextView, myTextView2, appCompatTextView2, myTextView3, appCompatButton, myTextView4, appCompatTextView3, linearLayout2, radioButton2, textView, textView2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static j1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static j1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_compounding_fee2, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f26908a;
    }
}
