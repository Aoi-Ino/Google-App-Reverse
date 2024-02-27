package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.R;
import k1.a;

public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f28486a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f28487b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f28488c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f28489d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f28490e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f28491f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f28492g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f28493h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f28494i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f28495j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f28496k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f28497l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f28498m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f28499n;

    private s1(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, TextView textView, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12, LinearLayout linearLayout13) {
        this.f28486a = linearLayout;
        this.f28487b = linearLayout2;
        this.f28488c = linearLayout3;
        this.f28489d = linearLayout4;
        this.f28490e = linearLayout5;
        this.f28491f = linearLayout6;
        this.f28492g = linearLayout7;
        this.f28493h = textView;
        this.f28494i = linearLayout8;
        this.f28495j = linearLayout9;
        this.f28496k = linearLayout10;
        this.f28497l = linearLayout11;
        this.f28498m = linearLayout12;
        this.f28499n = linearLayout13;
    }

    public static s1 a(View view) {
        View view2 = view;
        int i10 = R.id.app_status_layout;
        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.app_status_layout);
        if (linearLayout != null) {
            i10 = R.id.change_of_address;
            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.change_of_address);
            if (linearLayout2 != null) {
                i10 = R.id.dispose_app_layout;
                LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.dispose_app_layout);
                if (linearLayout3 != null) {
                    i10 = R.id.dl_abstract;
                    LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.dl_abstract);
                    if (linearLayout4 != null) {
                        i10 = R.id.dl_replacement;
                        LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.dl_replacement);
                        if (linearLayout5 != null) {
                            i10 = R.id.duplicate_dl;
                            LinearLayout linearLayout6 = (LinearLayout) a.a(view2, R.id.duplicate_dl);
                            if (linearLayout6 != null) {
                                i10 = R.id.enrolled_state_sarthi;
                                TextView textView = (TextView) a.a(view2, R.id.enrolled_state_sarthi);
                                if (textView != null) {
                                    i10 = R.id.internationl_permit;
                                    LinearLayout linearLayout7 = (LinearLayout) a.a(view2, R.id.internationl_permit);
                                    if (linearLayout7 != null) {
                                        i10 = R.id.mobile_update_service;
                                        LinearLayout linearLayout8 = (LinearLayout) a.a(view2, R.id.mobile_update_service);
                                        if (linearLayout8 != null) {
                                            i10 = R.id.nexgenarrow;
                                            LinearLayout linearLayout9 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                            if (linearLayout9 != null) {
                                                i10 = R.id.nexgenlogo;
                                                LinearLayout linearLayout10 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                                if (linearLayout10 != null) {
                                                    i10 = R.id.renewal_of_dl;
                                                    LinearLayout linearLayout11 = (LinearLayout) a.a(view2, R.id.renewal_of_dl);
                                                    if (linearLayout11 != null) {
                                                        i10 = R.id.withdraw_service_layout;
                                                        LinearLayout linearLayout12 = (LinearLayout) a.a(view2, R.id.withdraw_service_layout);
                                                        if (linearLayout12 != null) {
                                                            return new s1((LinearLayout) view2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12);
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

    public static s1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static s1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_d_l_service_home, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f28486a;
    }
}
