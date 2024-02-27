package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import k1.a;

public final class uc {
    public final MyTextView A;
    public final TextView B;

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f28865a;

    /* renamed from: b  reason: collision with root package name */
    public final com.nic.mparivahan.MyTextView f28866b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f28867c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f28868d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f28869e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f28870f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatEditText f28871g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatButton f28872h;

    /* renamed from: i  reason: collision with root package name */
    public final CheckBox f28873i;

    /* renamed from: j  reason: collision with root package name */
    public final CardView f28874j;

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f28875k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f28876l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f28877m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatEditText f28878n;

    /* renamed from: o  reason: collision with root package name */
    public final yb f28879o;

    /* renamed from: p  reason: collision with root package name */
    public final dc f28880p;

    /* renamed from: q  reason: collision with root package name */
    public final AppCompatTextView f28881q;

    /* renamed from: r  reason: collision with root package name */
    public final ProgressBar f28882r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f28883s;

    /* renamed from: t  reason: collision with root package name */
    public final AppCompatButton f28884t;

    /* renamed from: u  reason: collision with root package name */
    public final CardView f28885u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f28886v;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatButton f28887w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f28888x;

    /* renamed from: y  reason: collision with root package name */
    public final MyTextView f28889y;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatTextView f28890z;

    private uc(RelativeLayout relativeLayout, com.nic.mparivahan.MyTextView myTextView, MyTextView myTextView2, AppCompatTextView appCompatTextView, TextView textView, TextView textView2, AppCompatEditText appCompatEditText, AppCompatButton appCompatButton, CheckBox checkBox, CardView cardView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatEditText appCompatEditText2, yb ybVar, dc dcVar, AppCompatTextView appCompatTextView2, ProgressBar progressBar, TextView textView3, AppCompatButton appCompatButton2, CardView cardView2, MyTextView myTextView3, AppCompatButton appCompatButton3, LinearLayout linearLayout3, MyTextView myTextView4, AppCompatTextView appCompatTextView3, MyTextView myTextView5, TextView textView4) {
        this.f28865a = relativeLayout;
        this.f28866b = myTextView;
        this.f28867c = myTextView2;
        this.f28868d = appCompatTextView;
        this.f28869e = textView;
        this.f28870f = textView2;
        this.f28871g = appCompatEditText;
        this.f28872h = appCompatButton;
        this.f28873i = checkBox;
        this.f28874j = cardView;
        this.f28875k = imageView;
        this.f28876l = linearLayout;
        this.f28877m = linearLayout2;
        this.f28878n = appCompatEditText2;
        this.f28879o = ybVar;
        this.f28880p = dcVar;
        this.f28881q = appCompatTextView2;
        this.f28882r = progressBar;
        this.f28883s = textView3;
        this.f28884t = appCompatButton2;
        this.f28885u = cardView2;
        this.f28886v = myTextView3;
        this.f28887w = appCompatButton3;
        this.f28888x = linearLayout3;
        this.f28889y = myTextView4;
        this.f28890z = appCompatTextView3;
        this.A = myTextView5;
        this.B = textView4;
    }

    public static uc a(View view) {
        View view2 = view;
        int i10 = R.id.agreeTermCond;
        com.nic.mparivahan.MyTextView myTextView = (com.nic.mparivahan.MyTextView) a.a(view2, R.id.agreeTermCond);
        if (myTextView != null) {
            i10 = R.id.chassi_number;
            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.chassi_number);
            if (myTextView2 != null) {
                i10 = R.id.demo_top;
                AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.demo_top);
                if (appCompatTextView != null) {
                    i10 = R.id.dl_no_txt;
                    TextView textView = (TextView) a.a(view2, R.id.dl_no_txt);
                    if (textView != null) {
                        i10 = R.id.dl_number;
                        TextView textView2 = (TextView) a.a(view2, R.id.dl_number);
                        if (textView2 != null) {
                            i10 = R.id.et_otp;
                            AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view2, R.id.et_otp);
                            if (appCompatEditText != null) {
                                i10 = R.id.generate_otp;
                                AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.generate_otp);
                                if (appCompatButton != null) {
                                    i10 = R.id.i_have_terms;
                                    CheckBox checkBox = (CheckBox) a.a(view2, R.id.i_have_terms);
                                    if (checkBox != null) {
                                        i10 = R.id.icon_image;
                                        CardView cardView = (CardView) a.a(view2, R.id.icon_image);
                                        if (cardView != null) {
                                            i10 = R.id.iv_report_traffic_violation_icon;
                                            ImageView imageView = (ImageView) a.a(view2, R.id.iv_report_traffic_violation_icon);
                                            if (imageView != null) {
                                                i10 = R.id.linear_mob;
                                                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.linear_mob);
                                                if (linearLayout != null) {
                                                    i10 = R.id.linear_otp;
                                                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.linear_otp);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.mob_number;
                                                        AppCompatEditText appCompatEditText2 = (AppCompatEditText) a.a(view2, R.id.mob_number);
                                                        if (appCompatEditText2 != null) {
                                                            i10 = R.id.multi_head;
                                                            View a10 = a.a(view2, R.id.multi_head);
                                                            if (a10 != null) {
                                                                yb a11 = yb.a(a10);
                                                                i10 = R.id.mvvmId;
                                                                View a12 = a.a(view2, R.id.mvvmId);
                                                                if (a12 != null) {
                                                                    dc a13 = dc.a(a12);
                                                                    i10 = R.id.otp_time;
                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.otp_time);
                                                                    if (appCompatTextView2 != null) {
                                                                        i10 = R.id.pb_pwm;
                                                                        ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.pb_pwm);
                                                                        if (progressBar != null) {
                                                                            i10 = R.id.resendOtp;
                                                                            TextView textView3 = (TextView) a.a(view2, R.id.resendOtp);
                                                                            if (textView3 != null) {
                                                                                i10 = R.id.reset_button;
                                                                                AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view2, R.id.reset_button);
                                                                                if (appCompatButton2 != null) {
                                                                                    i10 = R.id.round_card_view;
                                                                                    CardView cardView2 = (CardView) a.a(view2, R.id.round_card_view);
                                                                                    if (cardView2 != null) {
                                                                                        i10 = R.id.select_service;
                                                                                        MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.select_service);
                                                                                        if (myTextView3 != null) {
                                                                                            i10 = R.id.submit;
                                                                                            AppCompatButton appCompatButton3 = (AppCompatButton) a.a(view2, R.id.submit);
                                                                                            if (appCompatButton3 != null) {
                                                                                                i10 = R.id.termCndLl;
                                                                                                LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.termCndLl);
                                                                                                if (linearLayout3 != null) {
                                                                                                    i10 = R.id.tv_dl_no;
                                                                                                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.tv_dl_no);
                                                                                                    if (myTextView4 != null) {
                                                                                                        i10 = R.id.tv_enter_otp;
                                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.tv_enter_otp);
                                                                                                        if (appCompatTextView3 != null) {
                                                                                                            i10 = R.id.update_mob;
                                                                                                            MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.update_mob);
                                                                                                            if (myTextView5 != null) {
                                                                                                                i10 = R.id.update_mobile_no;
                                                                                                                TextView textView4 = (TextView) a.a(view2, R.id.update_mobile_no);
                                                                                                                if (textView4 != null) {
                                                                                                                    return new uc((RelativeLayout) view2, myTextView, myTextView2, appCompatTextView, textView, textView2, appCompatEditText, appCompatButton, checkBox, cardView, imageView, linearLayout, linearLayout2, appCompatEditText2, a11, a13, appCompatTextView2, progressBar, textView3, appCompatButton2, cardView2, myTextView3, appCompatButton3, linearLayout3, myTextView4, appCompatTextView3, myTextView5, textView4);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static uc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static uc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.screen_7_main, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f28865a;
    }
}
