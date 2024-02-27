package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class n7 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f27607a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27608b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f27609c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f27610d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27611e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f27612f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatButton f27613g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f27614h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27615i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f27616j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27617k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f27618l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f27619m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f27620n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f27621o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f27622p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f27623q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f27624r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f27625s;

    /* renamed from: t  reason: collision with root package name */
    public final MyTextView f27626t;

    /* renamed from: u  reason: collision with root package name */
    public final LinearLayout f27627u;

    /* renamed from: v  reason: collision with root package name */
    public final qd f27628v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f27629w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f27630x;

    private n7(ScrollView scrollView, TextView textView, MyTextView myTextView, MyTextView myTextView2, TextView textView2, MyTextView myTextView3, AppCompatButton appCompatButton, MyTextView myTextView4, TextView textView3, MyTextView myTextView5, TextView textView4, MyTextView myTextView6, TextView textView5, MyTextView myTextView7, TextView textView6, MyTextView myTextView8, TextView textView7, MyTextView myTextView9, TextView textView8, MyTextView myTextView10, LinearLayout linearLayout, qd qdVar, TextView textView9, TextView textView10) {
        this.f27607a = scrollView;
        this.f27608b = textView;
        this.f27609c = myTextView;
        this.f27610d = myTextView2;
        this.f27611e = textView2;
        this.f27612f = myTextView3;
        this.f27613g = appCompatButton;
        this.f27614h = myTextView4;
        this.f27615i = textView3;
        this.f27616j = myTextView5;
        this.f27617k = textView4;
        this.f27618l = myTextView6;
        this.f27619m = textView5;
        this.f27620n = myTextView7;
        this.f27621o = textView6;
        this.f27622p = myTextView8;
        this.f27623q = textView7;
        this.f27624r = myTextView9;
        this.f27625s = textView8;
        this.f27626t = myTextView10;
        this.f27627u = linearLayout;
        this.f27628v = qdVar;
        this.f27629w = textView9;
        this.f27630x = textView10;
    }

    public static n7 a(View view) {
        View view2 = view;
        int i10 = R.id.allot_office;
        TextView textView = (TextView) a.a(view2, R.id.allot_office);
        if (textView != null) {
            i10 = R.id.allot_office_txt;
            MyTextView myTextView = (MyTextView) a.a(view2, R.id.allot_office_txt);
            if (myTextView != null) {
                i10 = R.id.auth_details;
                MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.auth_details);
                if (myTextView2 != null) {
                    i10 = R.id.auth_upto;
                    TextView textView2 = (TextView) a.a(view2, R.id.auth_upto);
                    if (textView2 != null) {
                        i10 = R.id.auth_upto_txt;
                        MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.auth_upto_txt);
                        if (myTextView3 != null) {
                            i10 = R.id.btnSubmit;
                            AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btnSubmit);
                            if (appCompatButton != null) {
                                i10 = R.id.period_details;
                                MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.period_details);
                                if (myTextView4 != null) {
                                    i10 = R.id.previous_authorization_form;
                                    TextView textView3 = (TextView) a.a(view2, R.id.previous_authorization_form);
                                    if (textView3 != null) {
                                        i10 = R.id.previous_authorization_form_txt;
                                        MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.previous_authorization_form_txt);
                                        if (myTextView5 != null) {
                                            i10 = R.id.previous_authorization_no;
                                            TextView textView4 = (TextView) a.a(view2, R.id.previous_authorization_no);
                                            if (textView4 != null) {
                                                i10 = R.id.previous_authorization_no_txt;
                                                MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.previous_authorization_no_txt);
                                                if (myTextView6 != null) {
                                                    i10 = R.id.previous_authorization__upto;
                                                    TextView textView5 = (TextView) a.a(view2, R.id.previous_authorization__upto);
                                                    if (textView5 != null) {
                                                        i10 = R.id.previous_authorization__upto_txt;
                                                        MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.previous_authorization__upto_txt);
                                                        if (myTextView7 != null) {
                                                            i10 = R.id.previous_issuing_date;
                                                            TextView textView6 = (TextView) a.a(view2, R.id.previous_issuing_date);
                                                            if (textView6 != null) {
                                                                i10 = R.id.previous_issuing_date_txt;
                                                                MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.previous_issuing_date_txt);
                                                                if (myTextView8 != null) {
                                                                    i10 = R.id.previous_permit_no;
                                                                    TextView textView7 = (TextView) a.a(view2, R.id.previous_permit_no);
                                                                    if (textView7 != null) {
                                                                        i10 = R.id.previous_permit_no_txt;
                                                                        MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.previous_permit_no_txt);
                                                                        if (myTextView9 != null) {
                                                                            i10 = R.id.previous_registration_no;
                                                                            TextView textView8 = (TextView) a.a(view2, R.id.previous_registration_no);
                                                                            if (textView8 != null) {
                                                                                i10 = R.id.previous_registration_no_txt;
                                                                                MyTextView myTextView10 = (MyTextView) a.a(view2, R.id.previous_registration_no_txt);
                                                                                if (myTextView10 != null) {
                                                                                    i10 = R.id.rc_relesae_layout;
                                                                                    LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.rc_relesae_layout);
                                                                                    if (linearLayout != null) {
                                                                                        i10 = R.id.topHolder;
                                                                                        View a10 = a.a(view2, R.id.topHolder);
                                                                                        if (a10 != null) {
                                                                                            qd a11 = qd.a(a10);
                                                                                            i10 = R.id.vehicleNumberTv;
                                                                                            TextView textView9 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                                            if (textView9 != null) {
                                                                                                i10 = R.id.vehicle_view;
                                                                                                TextView textView10 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                if (textView10 != null) {
                                                                                                    return new n7((ScrollView) view2, textView, myTextView, myTextView2, textView2, myTextView3, appCompatButton, myTextView4, textView3, myTextView5, textView4, myTextView6, textView5, myTextView7, textView6, myTextView8, textView7, myTextView9, textView8, myTextView10, linearLayout, a11, textView9, textView10);
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

    public static n7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static n7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_renewal_of_npauthorization_permit, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f27607a;
    }
}
