package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;
import k1.a;

public final class k8 {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f27099a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f27100b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f27101c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27102d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialCardView f27103e;

    /* renamed from: f  reason: collision with root package name */
    public final MaterialCardView f27104f;

    /* renamed from: g  reason: collision with root package name */
    public final MaterialCardView f27105g;

    /* renamed from: h  reason: collision with root package name */
    public final MaterialCardView f27106h;

    /* renamed from: i  reason: collision with root package name */
    public final MaterialCardView f27107i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f27108j;

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f27109k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f27110l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f27111m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f27112n;

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f27113o;

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f27114p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f27115q;

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f27116r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f27117s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f27118t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f27119u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f27120v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f27121w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f27122x;

    private k8(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView2, LinearLayout linearLayout6, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f27099a = coordinatorLayout;
        this.f27100b = linearLayout;
        this.f27101c = linearLayout2;
        this.f27102d = textView;
        this.f27103e = materialCardView;
        this.f27104f = materialCardView2;
        this.f27105g = materialCardView3;
        this.f27106h = materialCardView4;
        this.f27107i = materialCardView5;
        this.f27108j = imageView;
        this.f27109k = imageView2;
        this.f27110l = imageView3;
        this.f27111m = imageView4;
        this.f27112n = linearLayout3;
        this.f27113o = linearLayout4;
        this.f27114p = linearLayout5;
        this.f27115q = textView2;
        this.f27116r = linearLayout6;
        this.f27117s = textView3;
        this.f27118t = textView4;
        this.f27119u = textView5;
        this.f27120v = textView6;
        this.f27121w = textView7;
        this.f27122x = textView8;
    }

    public static k8 a(View view) {
        View view2 = view;
        int i10 = R.id.addcontactdetails;
        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.addcontactdetails);
        if (linearLayout != null) {
            i10 = R.id.contact_amblunce;
            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.contact_amblunce);
            if (linearLayout2 != null) {
                i10 = R.id.create_emerg_profile;
                TextView textView = (TextView) a.a(view2, R.id.create_emerg_profile);
                if (textView != null) {
                    i10 = R.id.cv_citizen_sentinel;
                    MaterialCardView materialCardView = (MaterialCardView) a.a(view2, R.id.cv_citizen_sentinel);
                    if (materialCardView != null) {
                        i10 = R.id.cv_report_accident;
                        MaterialCardView materialCardView2 = (MaterialCardView) a.a(view2, R.id.cv_report_accident);
                        if (materialCardView2 != null) {
                            i10 = R.id.cv_report_accident_icon;
                            MaterialCardView materialCardView3 = (MaterialCardView) a.a(view2, R.id.cv_report_accident_icon);
                            if (materialCardView3 != null) {
                                i10 = R.id.cv_report_traffic_violation;
                                MaterialCardView materialCardView4 = (MaterialCardView) a.a(view2, R.id.cv_report_traffic_violation);
                                if (materialCardView4 != null) {
                                    i10 = R.id.cv_report_traffic_violation_icon;
                                    MaterialCardView materialCardView5 = (MaterialCardView) a.a(view2, R.id.cv_report_traffic_violation_icon);
                                    if (materialCardView5 != null) {
                                        i10 = R.id.iv_report_accident_icon;
                                        ImageView imageView = (ImageView) a.a(view2, R.id.iv_report_accident_icon);
                                        if (imageView != null) {
                                            i10 = R.id.iv_report_accident_view_more;
                                            ImageView imageView2 = (ImageView) a.a(view2, R.id.iv_report_accident_view_more);
                                            if (imageView2 != null) {
                                                i10 = R.id.iv_report_traffic_violation_icon;
                                                ImageView imageView3 = (ImageView) a.a(view2, R.id.iv_report_traffic_violation_icon);
                                                if (imageView3 != null) {
                                                    i10 = R.id.iv_report_traffic_violation_view_more;
                                                    ImageView imageView4 = (ImageView) a.a(view2, R.id.iv_report_traffic_violation_view_more);
                                                    if (imageView4 != null) {
                                                        i10 = R.id.ll_citizen_sentinel;
                                                        LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.ll_citizen_sentinel);
                                                        if (linearLayout3 != null) {
                                                            i10 = R.id.nexgenarrow;
                                                            LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                                            if (linearLayout4 != null) {
                                                                i10 = R.id.nexgenlogo;
                                                                LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                                                if (linearLayout5 != null) {
                                                                    i10 = R.id.service_label;
                                                                    TextView textView2 = (TextView) a.a(view2, R.id.service_label);
                                                                    if (textView2 != null) {
                                                                        i10 = R.id.tap_notify;
                                                                        LinearLayout linearLayout6 = (LinearLayout) a.a(view2, R.id.tap_notify);
                                                                        if (linearLayout6 != null) {
                                                                            i10 = R.id.tv_call_ambulance;
                                                                            TextView textView3 = (TextView) a.a(view2, R.id.tv_call_ambulance);
                                                                            if (textView3 != null) {
                                                                                i10 = R.id.tv_citizen_sentinel;
                                                                                TextView textView4 = (TextView) a.a(view2, R.id.tv_citizen_sentinel);
                                                                                if (textView4 != null) {
                                                                                    i10 = R.id.tv_emerg_note;
                                                                                    TextView textView5 = (TextView) a.a(view2, R.id.tv_emerg_note);
                                                                                    if (textView5 != null) {
                                                                                        i10 = R.id.tv_report_traffic_violation;
                                                                                        TextView textView6 = (TextView) a.a(view2, R.id.tv_report_traffic_violation);
                                                                                        if (textView6 != null) {
                                                                                            i10 = R.id.tv_tap_dial;
                                                                                            TextView textView7 = (TextView) a.a(view2, R.id.tv_tap_dial);
                                                                                            if (textView7 != null) {
                                                                                                i10 = R.id.tv_tap_notify_contact;
                                                                                                TextView textView8 = (TextView) a.a(view2, R.id.tv_tap_notify_contact);
                                                                                                if (textView8 != null) {
                                                                                                    return new k8((CoordinatorLayout) view2, linearLayout, linearLayout2, textView, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, imageView, imageView2, imageView3, imageView4, linearLayout3, linearLayout4, linearLayout5, textView2, linearLayout6, textView3, textView4, textView5, textView6, textView7, textView8);
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

    public static k8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static k8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_sos_home_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f27099a;
    }
}
