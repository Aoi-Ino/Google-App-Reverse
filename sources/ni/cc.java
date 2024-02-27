package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class cc {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f25762a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f25763b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25764c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25765d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25766e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f25767f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25768g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25769h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25770i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25771j;

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f25772k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f25773l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f25774m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25775n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f25776o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f25777p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f25778q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f25779r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f25780s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f25781t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f25782u;

    private cc(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, EditText editText, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView4, ImageView imageView2, LinearLayout linearLayout5, MyTextView myTextView, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.f25762a = linearLayout;
        this.f25763b = imageView;
        this.f25764c = textView;
        this.f25765d = textView2;
        this.f25766e = textView3;
        this.f25767f = editText;
        this.f25768g = linearLayout2;
        this.f25769h = linearLayout3;
        this.f25770i = linearLayout4;
        this.f25771j = textView4;
        this.f25772k = imageView2;
        this.f25773l = linearLayout5;
        this.f25774m = myTextView;
        this.f25775n = textView5;
        this.f25776o = textView6;
        this.f25777p = textView7;
        this.f25778q = textView8;
        this.f25779r = textView9;
        this.f25780s = textView10;
        this.f25781t = textView11;
        this.f25782u = textView12;
    }

    public static cc a(View view) {
        View view2 = view;
        int i10 = R.id.backButton;
        ImageView imageView = (ImageView) a.a(view2, R.id.backButton);
        if (imageView != null) {
            i10 = R.id.btnContinue;
            TextView textView = (TextView) a.a(view2, R.id.btnContinue);
            if (textView != null) {
                i10 = R.id.default_otp;
                TextView textView2 = (TextView) a.a(view2, R.id.default_otp);
                if (textView2 != null) {
                    i10 = R.id.disPlay;
                    TextView textView3 = (TextView) a.a(view2, R.id.disPlay);
                    if (textView3 != null) {
                        i10 = R.id.enterOtp;
                        EditText editText = (EditText) a.a(view2, R.id.enterOtp);
                        if (editText != null) {
                            i10 = R.id.linera_otp;
                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.linera_otp);
                            if (linearLayout != null) {
                                i10 = R.id.nexgenarrow;
                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                if (linearLayout2 != null) {
                                    i10 = R.id.nexgenlogo;
                                    LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.resendOtp;
                                        TextView textView4 = (TextView) a.a(view2, R.id.resendOtp);
                                        if (textView4 != null) {
                                            i10 = R.id.showmpin;
                                            ImageView imageView2 = (ImageView) a.a(view2, R.id.showmpin);
                                            if (imageView2 != null) {
                                                i10 = R.id.submit;
                                                LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.submit);
                                                if (linearLayout4 != null) {
                                                    i10 = R.id.time_text;
                                                    MyTextView myTextView = (MyTextView) a.a(view2, R.id.time_text);
                                                    if (myTextView != null) {
                                                        i10 = R.id.tv_forgot;
                                                        TextView textView5 = (TextView) a.a(view2, R.id.tv_forgot);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_get_otp;
                                                            TextView textView6 = (TextView) a.a(view2, R.id.tv_get_otp);
                                                            if (textView6 != null) {
                                                                i10 = R.id.tv_refresh_close;
                                                                TextView textView7 = (TextView) a.a(view2, R.id.tv_refresh_close);
                                                                if (textView7 != null) {
                                                                    i10 = R.id.tv_security_mpin;
                                                                    TextView textView8 = (TextView) a.a(view2, R.id.tv_security_mpin);
                                                                    if (textView8 != null) {
                                                                        i10 = R.id.tv_send_otp;
                                                                        TextView textView9 = (TextView) a.a(view2, R.id.tv_send_otp);
                                                                        if (textView9 != null) {
                                                                            i10 = R.id.tv_verify;
                                                                            TextView textView10 = (TextView) a.a(view2, R.id.tv_verify);
                                                                            if (textView10 != null) {
                                                                                i10 = R.id.tv_verify_otp;
                                                                                TextView textView11 = (TextView) a.a(view2, R.id.tv_verify_otp);
                                                                                if (textView11 != null) {
                                                                                    i10 = R.id.tv_wait_otp;
                                                                                    TextView textView12 = (TextView) a.a(view2, R.id.tv_wait_otp);
                                                                                    if (textView12 != null) {
                                                                                        return new cc((LinearLayout) view2, imageView, textView, textView2, textView3, editText, linearLayout, linearLayout2, linearLayout3, textView4, imageView2, linearLayout4, myTextView, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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

    public static cc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static cc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.mvvm_forget_pin, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f25762a;
    }
}
