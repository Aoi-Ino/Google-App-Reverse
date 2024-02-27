package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class q5 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f28139a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f28140b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f28141c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatButton f28142d;

    /* renamed from: e  reason: collision with root package name */
    public final CheckBox f28143e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f28144f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f28145g;

    /* renamed from: h  reason: collision with root package name */
    public final dc f28146h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatEditText f28147i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatButton f28148j;

    /* renamed from: k  reason: collision with root package name */
    public final CardView f28149k;

    /* renamed from: l  reason: collision with root package name */
    public final com.nic.mparivahan.dlservices.widget.MyTextView f28150l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f28151m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f28152n;

    /* renamed from: o  reason: collision with root package name */
    public final com.nic.mparivahan.dlservices.widget.MyTextView f28153o;

    /* renamed from: p  reason: collision with root package name */
    public final com.nic.mparivahan.dlservices.widget.MyTextView f28154p;

    /* renamed from: q  reason: collision with root package name */
    public final com.nic.mparivahan.dlservices.widget.MyTextView f28155q;

    private q5(RelativeLayout relativeLayout, MyTextView myTextView, TextView textView, AppCompatButton appCompatButton, CheckBox checkBox, ImageView imageView, LinearLayout linearLayout, dc dcVar, AppCompatEditText appCompatEditText, AppCompatButton appCompatButton2, CardView cardView, com.nic.mparivahan.dlservices.widget.MyTextView myTextView2, LinearLayout linearLayout2, TextView textView2, com.nic.mparivahan.dlservices.widget.MyTextView myTextView3, com.nic.mparivahan.dlservices.widget.MyTextView myTextView4, com.nic.mparivahan.dlservices.widget.MyTextView myTextView5) {
        this.f28139a = relativeLayout;
        this.f28140b = myTextView;
        this.f28141c = textView;
        this.f28142d = appCompatButton;
        this.f28143e = checkBox;
        this.f28144f = imageView;
        this.f28145g = linearLayout;
        this.f28146h = dcVar;
        this.f28147i = appCompatEditText;
        this.f28148j = appCompatButton2;
        this.f28149k = cardView;
        this.f28150l = myTextView2;
        this.f28151m = linearLayout2;
        this.f28152n = textView2;
        this.f28153o = myTextView3;
        this.f28154p = myTextView4;
        this.f28155q = myTextView5;
    }

    public static q5 a(View view) {
        View view2 = view;
        int i10 = R.id.agreeTermCond;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.agreeTermCond);
        if (myTextView != null) {
            i10 = R.id.dl_number;
            TextView textView = (TextView) a.a(view2, R.id.dl_number);
            if (textView != null) {
                i10 = R.id.generate_otp;
                AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.generate_otp);
                if (appCompatButton != null) {
                    i10 = R.id.i_have_terms;
                    CheckBox checkBox = (CheckBox) a.a(view2, R.id.i_have_terms);
                    if (checkBox != null) {
                        i10 = R.id.iv_image;
                        ImageView imageView = (ImageView) a.a(view2, R.id.iv_image);
                        if (imageView != null) {
                            i10 = R.id.linear_mob;
                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.linear_mob);
                            if (linearLayout != null) {
                                i10 = R.id.mHeader;
                                View a10 = a.a(view2, R.id.mHeader);
                                if (a10 != null) {
                                    dc a11 = dc.a(a10);
                                    i10 = R.id.mob_number;
                                    AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view2, R.id.mob_number);
                                    if (appCompatEditText != null) {
                                        i10 = R.id.reset_button;
                                        AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view2, R.id.reset_button);
                                        if (appCompatButton2 != null) {
                                            i10 = R.id.round_card_view;
                                            CardView cardView = (CardView) a.a(view2, R.id.round_card_view);
                                            if (cardView != null) {
                                                i10 = R.id.select_service;
                                                com.nic.mparivahan.dlservices.widget.MyTextView myTextView2 = (com.nic.mparivahan.dlservices.widget.MyTextView) a.a(view2, R.id.select_service);
                                                if (myTextView2 != null) {
                                                    i10 = R.id.termCndLl;
                                                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.termCndLl);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.tv_cl_Details;
                                                        TextView textView2 = (TextView) a.a(view2, R.id.tv_cl_Details);
                                                        if (textView2 != null) {
                                                            i10 = R.id.tv_dl_no;
                                                            com.nic.mparivahan.dlservices.widget.MyTextView myTextView3 = (com.nic.mparivahan.dlservices.widget.MyTextView) a.a(view2, R.id.tv_dl_no);
                                                            if (myTextView3 != null) {
                                                                i10 = R.id.txt_mob_number;
                                                                com.nic.mparivahan.dlservices.widget.MyTextView myTextView4 = (com.nic.mparivahan.dlservices.widget.MyTextView) a.a(view2, R.id.txt_mob_number);
                                                                if (myTextView4 != null) {
                                                                    i10 = R.id.update_mob;
                                                                    com.nic.mparivahan.dlservices.widget.MyTextView myTextView5 = (com.nic.mparivahan.dlservices.widget.MyTextView) a.a(view2, R.id.update_mob);
                                                                    if (myTextView5 != null) {
                                                                        return new q5((RelativeLayout) view2, myTextView, textView, appCompatButton, checkBox, imageView, linearLayout, a11, appCompatEditText, appCompatButton2, cardView, myTextView2, linearLayout2, textView2, myTextView3, myTextView4, myTextView5);
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

    public static q5 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static q5 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_ll_mobile_otp, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f28139a;
    }
}
