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

public final class z5 {
    public final TextView A;
    public final MyTextView B;
    public final MyTextView C;
    public final MyTextView D;
    public final MyTextView E;
    public final MyTextView F;
    public final MyTextView G;
    public final CustomWegetLayout H;
    public final CustomWegetLayout I;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29660a;

    /* renamed from: b  reason: collision with root package name */
    public final CheckBox f29661b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckBox f29662c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f29663d;

    /* renamed from: e  reason: collision with root package name */
    public final CheckBox f29664e;

    /* renamed from: f  reason: collision with root package name */
    public final CheckBox f29665f;

    /* renamed from: g  reason: collision with root package name */
    public final CheckBox f29666g;

    /* renamed from: h  reason: collision with root package name */
    public final Spinner f29667h;

    /* renamed from: i  reason: collision with root package name */
    public final Spinner f29668i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f29669j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f29670k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f29671l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f29672m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f29673n;

    /* renamed from: o  reason: collision with root package name */
    public final CardView f29674o;

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f29675p;

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f29676q;

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f29677r;

    /* renamed from: s  reason: collision with root package name */
    public final FrameLayout f29678s;

    /* renamed from: t  reason: collision with root package name */
    public final Spinner f29679t;

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f29680u;

    /* renamed from: v  reason: collision with root package name */
    public final RelativeLayout f29681v;

    /* renamed from: w  reason: collision with root package name */
    public final MyTextView f29682w;

    /* renamed from: x  reason: collision with root package name */
    public final ProgressBar f29683x;

    /* renamed from: y  reason: collision with root package name */
    public final CardView f29684y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f29685z;

    private z5(LinearLayout linearLayout, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, Spinner spinner, Spinner spinner2, ImageView imageView, TextView textView, TextView textView2, MyTextView myTextView, MyTextView myTextView2, CardView cardView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout, FrameLayout frameLayout, Spinner spinner3, ImageView imageView4, RelativeLayout relativeLayout2, MyTextView myTextView3, ProgressBar progressBar, CardView cardView2, TextView textView3, TextView textView4, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, MyTextView myTextView9, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2) {
        this.f29660a = linearLayout;
        this.f29661b = checkBox;
        this.f29662c = checkBox2;
        this.f29663d = checkBox3;
        this.f29664e = checkBox4;
        this.f29665f = checkBox5;
        this.f29666g = checkBox6;
        this.f29667h = spinner;
        this.f29668i = spinner2;
        this.f29669j = imageView;
        this.f29670k = textView;
        this.f29671l = textView2;
        this.f29672m = myTextView;
        this.f29673n = myTextView2;
        this.f29674o = cardView;
        this.f29675p = imageView2;
        this.f29676q = imageView3;
        this.f29677r = relativeLayout;
        this.f29678s = frameLayout;
        this.f29679t = spinner3;
        this.f29680u = imageView4;
        this.f29681v = relativeLayout2;
        this.f29682w = myTextView3;
        this.f29683x = progressBar;
        this.f29684y = cardView2;
        this.f29685z = textView3;
        this.A = textView4;
        this.B = myTextView4;
        this.C = myTextView5;
        this.D = myTextView6;
        this.E = myTextView7;
        this.F = myTextView8;
        this.G = myTextView9;
        this.H = customWegetLayout;
        this.I = customWegetLayout2;
    }

    public static z5 a(View view) {
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
                                                                                i10 = R.id.new_current_rto;
                                                                                Spinner spinner3 = (Spinner) a.a(view2, R.id.new_current_rto);
                                                                                if (spinner3 != null) {
                                                                                    i10 = R.id.new_iv_down;
                                                                                    ImageView imageView4 = (ImageView) a.a(view2, R.id.new_iv_down);
                                                                                    if (imageView4 != null) {
                                                                                        i10 = R.id.new_layout_req_submit_rto;
                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) a.a(view2, R.id.new_layout_req_submit_rto);
                                                                                        if (relativeLayout2 != null) {
                                                                                            i10 = R.id.new_txt_req_submit_rto;
                                                                                            MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.new_txt_req_submit_rto);
                                                                                            if (myTextView3 != null) {
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
                                                                                                                MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.tv_dl_no);
                                                                                                                if (myTextView4 != null) {
                                                                                                                    i10 = R.id.tv_last_endor_rto;
                                                                                                                    MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.tv_last_endor_rto);
                                                                                                                    if (myTextView5 != null) {
                                                                                                                        i10 = R.id.tv_last_endor_state;
                                                                                                                        MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.tv_last_endor_state);
                                                                                                                        if (myTextView6 != null) {
                                                                                                                            i10 = R.id.txt_dl_service;
                                                                                                                            MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.txt_dl_service);
                                                                                                                            if (myTextView7 != null) {
                                                                                                                                i10 = R.id.txt_req_submit;
                                                                                                                                MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.txt_req_submit);
                                                                                                                                if (myTextView8 != null) {
                                                                                                                                    i10 = R.id.txt_req_submit_rto;
                                                                                                                                    MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.txt_req_submit_rto);
                                                                                                                                    if (myTextView9 != null) {
                                                                                                                                        i10 = R.id.txt_service_cancel;
                                                                                                                                        CustomWegetLayout customWegetLayout = (CustomWegetLayout) a.a(view2, R.id.txt_service_cancel);
                                                                                                                                        if (customWegetLayout != null) {
                                                                                                                                            i10 = R.id.txt_service_submit;
                                                                                                                                            CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) a.a(view2, R.id.txt_service_submit);
                                                                                                                                            if (customWegetLayout2 != null) {
                                                                                                                                                return new z5((LinearLayout) view2, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, spinner, spinner2, imageView, textView, textView2, myTextView, myTextView2, cardView, imageView2, imageView3, relativeLayout, frameLayout, spinner3, imageView4, relativeLayout2, myTextView3, progressBar, cardView2, textView3, textView4, myTextView4, myTextView5, myTextView6, myTextView7, myTextView8, myTextView9, customWegetLayout, customWegetLayout2);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static z5 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static z5 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_ll_rto, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29660a;
    }
}
