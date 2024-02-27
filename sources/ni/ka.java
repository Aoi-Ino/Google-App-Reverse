package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import k1.a;

public final class ka {
    public final MyTextView A;
    public final MyTextView B;
    public final MyTextView C;
    public final CustomWegetLayout D;
    public final CustomWegetLayout E;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f27132a;

    /* renamed from: b  reason: collision with root package name */
    public final CheckBox f27133b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckBox f27134c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f27135d;

    /* renamed from: e  reason: collision with root package name */
    public final CheckBox f27136e;

    /* renamed from: f  reason: collision with root package name */
    public final CheckBox f27137f;

    /* renamed from: g  reason: collision with root package name */
    public final CheckBox f27138g;

    /* renamed from: h  reason: collision with root package name */
    public final Spinner f27139h;

    /* renamed from: i  reason: collision with root package name */
    public final Spinner f27140i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f27141j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27142k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27143l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f27144m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f27145n;

    /* renamed from: o  reason: collision with root package name */
    public final CardView f27146o;

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f27147p;

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f27148q;

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f27149r;

    /* renamed from: s  reason: collision with root package name */
    public final FrameLayout f27150s;

    /* renamed from: t  reason: collision with root package name */
    public final ProgressBar f27151t;

    /* renamed from: u  reason: collision with root package name */
    public final CardView f27152u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f27153v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f27154w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f27155x;

    /* renamed from: y  reason: collision with root package name */
    public final MyTextView f27156y;

    /* renamed from: z  reason: collision with root package name */
    public final MyTextView f27157z;

    private ka(LinearLayout linearLayout, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, Spinner spinner, Spinner spinner2, ImageView imageView, TextView textView, TextView textView2, MyTextView myTextView, MyTextView myTextView2, CardView cardView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout, FrameLayout frameLayout, ProgressBar progressBar, CardView cardView2, TextView textView3, TextView textView4, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2) {
        this.f27132a = linearLayout;
        this.f27133b = checkBox;
        this.f27134c = checkBox2;
        this.f27135d = checkBox3;
        this.f27136e = checkBox4;
        this.f27137f = checkBox5;
        this.f27138g = checkBox6;
        this.f27139h = spinner;
        this.f27140i = spinner2;
        this.f27141j = imageView;
        this.f27142k = textView;
        this.f27143l = textView2;
        this.f27144m = myTextView;
        this.f27145n = myTextView2;
        this.f27146o = cardView;
        this.f27147p = imageView2;
        this.f27148q = imageView3;
        this.f27149r = relativeLayout;
        this.f27150s = frameLayout;
        this.f27151t = progressBar;
        this.f27152u = cardView2;
        this.f27153v = textView3;
        this.f27154w = textView4;
        this.f27155x = myTextView3;
        this.f27156y = myTextView4;
        this.f27157z = myTextView5;
        this.A = myTextView6;
        this.B = myTextView7;
        this.C = myTextView8;
        this.D = customWegetLayout;
        this.E = customWegetLayout2;
    }

    public static ka a(View view) {
        View view2 = view;
        int i10 = R.id.check_change_add;
        CheckBox checkBox = (CheckBox) a.a(view2, R.id.check_change_add);
        if (checkBox != null) {
            i10 = R.id.check_dl_abs;
            CheckBox checkBox2 = (CheckBox) a.a(view2, R.id.check_dl_abs);
            if (checkBox2 != null) {
                i10 = R.id.check_dl_replace;
                CheckBox checkBox3 = (CheckBox) a.a(view2, R.id.check_dl_replace);
                if (checkBox3 != null) {
                    i10 = R.id.check_dup_dl;
                    CheckBox checkBox4 = (CheckBox) a.a(view2, R.id.check_dup_dl);
                    if (checkBox4 != null) {
                        i10 = R.id.check_idp;
                        CheckBox checkBox5 = (CheckBox) a.a(view2, R.id.check_idp);
                        if (checkBox5 != null) {
                            i10 = R.id.check_renewal_dl;
                            CheckBox checkBox6 = (CheckBox) a.a(view2, R.id.check_renewal_dl);
                            if (checkBox6 != null) {
                                i10 = R.id.current_rto;
                                Spinner spinner = (Spinner) a.a(view2, R.id.current_rto);
                                if (spinner != null) {
                                    i10 = R.id.current_state;
                                    Spinner spinner2 = (Spinner) a.a(view2, R.id.current_state);
                                    if (spinner2 != null) {
                                        i10 = R.id.current_state_button;
                                        ImageView imageView = (ImageView) a.a(view2, R.id.current_state_button);
                                        if (imageView != null) {
                                            i10 = R.id.dl_no;
                                            TextView textView = (TextView) a.a(view2, R.id.dl_no);
                                            if (textView != null) {
                                                i10 = R.id.dl_no_txt;
                                                TextView textView2 = (TextView) a.a(view2, R.id.dl_no_txt);
                                                if (textView2 != null) {
                                                    i10 = R.id.dl_number_new;
                                                    MyTextView myTextView = (MyTextView) a.a(view2, R.id.dl_number_new);
                                                    if (myTextView != null) {
                                                        i10 = R.id.dl_service_new;
                                                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.dl_service_new);
                                                        if (myTextView2 != null) {
                                                            i10 = R.id.icon_image;
                                                            CardView cardView = (CardView) a.a(view2, R.id.icon_image);
                                                            if (cardView != null) {
                                                                i10 = R.id.iv_down;
                                                                ImageView imageView2 = (ImageView) a.a(view2, R.id.iv_down);
                                                                if (imageView2 != null) {
                                                                    i10 = R.id.iv_report_traffic_violation_icon;
                                                                    ImageView imageView3 = (ImageView) a.a(view2, R.id.iv_report_traffic_violation_icon);
                                                                    if (imageView3 != null) {
                                                                        i10 = R.id.layout_req_submit_rto;
                                                                        RelativeLayout relativeLayout = (RelativeLayout) a.a(view2, R.id.layout_req_submit_rto);
                                                                        if (relativeLayout != null) {
                                                                            i10 = R.id.layout_request_state;
                                                                            FrameLayout frameLayout = (FrameLayout) a.a(view2, R.id.layout_request_state);
                                                                            if (frameLayout != null) {
                                                                                i10 = R.id.progress_bar_act;
                                                                                ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.progress_bar_act);
                                                                                if (progressBar != null) {
                                                                                    i10 = R.id.round_card_view;
                                                                                    CardView cardView2 = (CardView) a.a(view2, R.id.round_card_view);
                                                                                    if (cardView2 != null) {
                                                                                        i10 = R.id.rto;
                                                                                        TextView textView3 = (TextView) a.a(view2, R.id.rto);
                                                                                        if (textView3 != null) {
                                                                                            i10 = R.id.state;
                                                                                            TextView textView4 = (TextView) a.a(view2, R.id.state);
                                                                                            if (textView4 != null) {
                                                                                                i10 = R.id.tv_dl_no;
                                                                                                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.tv_dl_no);
                                                                                                if (myTextView3 != null) {
                                                                                                    i10 = R.id.tv_last_endor_rto;
                                                                                                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.tv_last_endor_rto);
                                                                                                    if (myTextView4 != null) {
                                                                                                        i10 = R.id.tv_last_endor_state;
                                                                                                        MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.tv_last_endor_state);
                                                                                                        if (myTextView5 != null) {
                                                                                                            i10 = R.id.txt_dl_service;
                                                                                                            MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.txt_dl_service);
                                                                                                            if (myTextView6 != null) {
                                                                                                                i10 = R.id.txt_req_submit;
                                                                                                                MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.txt_req_submit);
                                                                                                                if (myTextView7 != null) {
                                                                                                                    i10 = R.id.txt_req_submit_rto;
                                                                                                                    MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.txt_req_submit_rto);
                                                                                                                    if (myTextView8 != null) {
                                                                                                                        i10 = R.id.txt_service_cancel;
                                                                                                                        CustomWegetLayout customWegetLayout = (CustomWegetLayout) a.a(view2, R.id.txt_service_cancel);
                                                                                                                        if (customWegetLayout != null) {
                                                                                                                            i10 = R.id.txt_service_submit;
                                                                                                                            CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) a.a(view2, R.id.txt_service_submit);
                                                                                                                            if (customWegetLayout2 != null) {
                                                                                                                                return new ka((LinearLayout) view2, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, spinner, spinner2, imageView, textView, textView2, myTextView, myTextView2, cardView, imageView2, imageView3, relativeLayout, frameLayout, progressBar, cardView2, textView3, textView4, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7, myTextView8, customWegetLayout, customWegetLayout2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ka c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ka d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dl_services_11, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f27132a;
    }
}
