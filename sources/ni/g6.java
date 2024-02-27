package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.nic.mparivahan.R;
import k1.a;

public final class g6 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f26482a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f26483b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26484c;

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f26485d;

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f26486e;

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f26487f;

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f26488g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26489h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f26490i;

    /* renamed from: j  reason: collision with root package name */
    public final dc f26491j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26492k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26493l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26494m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26495n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26496o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26497p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f26498q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f26499r;

    private g6(ScrollView scrollView, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, LinearLayout linearLayout3, LinearLayout linearLayout4, dc dcVar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f26482a = scrollView;
        this.f26483b = linearLayout;
        this.f26484c = linearLayout2;
        this.f26485d = relativeLayout;
        this.f26486e = relativeLayout2;
        this.f26487f = relativeLayout3;
        this.f26488g = relativeLayout4;
        this.f26489h = linearLayout3;
        this.f26490i = linearLayout4;
        this.f26491j = dcVar;
        this.f26492k = textView;
        this.f26493l = textView2;
        this.f26494m = textView3;
        this.f26495n = textView4;
        this.f26496o = textView5;
        this.f26497p = textView6;
        this.f26498q = textView7;
        this.f26499r = textView8;
    }

    public static g6 a(View view) {
        View view2 = view;
        int i10 = R.id.fuelPumpLl;
        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.fuelPumpLl);
        if (linearLayout != null) {
            i10 = R.id.hospitalLl;
            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.hospitalLl);
            if (linearLayout2 != null) {
                i10 = R.id.nearHospitalRl;
                RelativeLayout relativeLayout = (RelativeLayout) a.a(view2, R.id.nearHospitalRl);
                if (relativeLayout != null) {
                    i10 = R.id.nearestPollutionRl;
                    RelativeLayout relativeLayout2 = (RelativeLayout) a.a(view2, R.id.nearestPollutionRl);
                    if (relativeLayout2 != null) {
                        i10 = R.id.nearestRTORl;
                        RelativeLayout relativeLayout3 = (RelativeLayout) a.a(view2, R.id.nearestRTORl);
                        if (relativeLayout3 != null) {
                            i10 = R.id.nearestfuelPumpRl;
                            RelativeLayout relativeLayout4 = (RelativeLayout) a.a(view2, R.id.nearestfuelPumpRl);
                            if (relativeLayout4 != null) {
                                i10 = R.id.puccLl;
                                LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.puccLl);
                                if (linearLayout3 != null) {
                                    i10 = R.id.rtoLl;
                                    LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.rtoLl);
                                    if (linearLayout4 != null) {
                                        i10 = R.id.topheader;
                                        View a10 = a.a(view2, R.id.topheader);
                                        if (a10 != null) {
                                            dc a11 = dc.a(a10);
                                            i10 = R.id.tv_fuel_pump;
                                            TextView textView = (TextView) a.a(view2, R.id.tv_fuel_pump);
                                            if (textView != null) {
                                                i10 = R.id.tv_fuel_view;
                                                TextView textView2 = (TextView) a.a(view2, R.id.tv_fuel_view);
                                                if (textView2 != null) {
                                                    i10 = R.id.tv_hosp_view;
                                                    TextView textView3 = (TextView) a.a(view2, R.id.tv_hosp_view);
                                                    if (textView3 != null) {
                                                        i10 = R.id.tv_hospital;
                                                        TextView textView4 = (TextView) a.a(view2, R.id.tv_hospital);
                                                        if (textView4 != null) {
                                                            i10 = R.id.tv_pollution_checking;
                                                            TextView textView5 = (TextView) a.a(view2, R.id.tv_pollution_checking);
                                                            if (textView5 != null) {
                                                                i10 = R.id.tv_pollution_view;
                                                                TextView textView6 = (TextView) a.a(view2, R.id.tv_pollution_view);
                                                                if (textView6 != null) {
                                                                    i10 = R.id.tv_rto;
                                                                    TextView textView7 = (TextView) a.a(view2, R.id.tv_rto);
                                                                    if (textView7 != null) {
                                                                        i10 = R.id.tv_rto_view;
                                                                        TextView textView8 = (TextView) a.a(view2, R.id.tv_rto_view);
                                                                        if (textView8 != null) {
                                                                            return new g6((ScrollView) view2, linearLayout, linearLayout2, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, linearLayout3, linearLayout4, a11, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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

    public static g6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static g6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_near_by_places, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f26482a;
    }
}
