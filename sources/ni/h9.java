package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class h9 {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f26637a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f26638b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26639c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26640d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26641e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f26642f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26643g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26644h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26645i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f26646j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26647k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26648l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26649m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26650n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26651o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26652p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f26653q;

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f26654r;

    private h9(CoordinatorLayout coordinatorLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, EditText editText, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView4, ImageView imageView2, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, LinearLayout linearLayout3) {
        this.f26637a = coordinatorLayout;
        this.f26638b = imageView;
        this.f26639c = textView;
        this.f26640d = textView2;
        this.f26641e = textView3;
        this.f26642f = editText;
        this.f26643g = linearLayout;
        this.f26644h = linearLayout2;
        this.f26645i = textView4;
        this.f26646j = imageView2;
        this.f26647k = textView5;
        this.f26648l = textView6;
        this.f26649m = textView7;
        this.f26650n = textView8;
        this.f26651o = textView9;
        this.f26652p = textView10;
        this.f26653q = textView11;
        this.f26654r = linearLayout3;
    }

    public static h9 a(View view) {
        View view2 = view;
        int i10 = R.id.backButton;
        ImageView imageView = (ImageView) a.a(view2, R.id.backButton);
        if (imageView != null) {
            i10 = R.id.btn_verify;
            TextView textView = (TextView) a.a(view2, R.id.btn_verify);
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
                            i10 = R.id.nexgenarrow;
                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                            if (linearLayout != null) {
                                i10 = R.id.nexgenlogo;
                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                if (linearLayout2 != null) {
                                    i10 = R.id.resendOtp;
                                    TextView textView4 = (TextView) a.a(view2, R.id.resendOtp);
                                    if (textView4 != null) {
                                        i10 = R.id.showmpin;
                                        ImageView imageView2 = (ImageView) a.a(view2, R.id.showmpin);
                                        if (imageView2 != null) {
                                            i10 = R.id.tv_get_otp;
                                            TextView textView5 = (TextView) a.a(view2, R.id.tv_get_otp);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_mobile_no;
                                                TextView textView6 = (TextView) a.a(view2, R.id.tv_mobile_no);
                                                if (textView6 != null) {
                                                    i10 = R.id.tv_refresh_close;
                                                    TextView textView7 = (TextView) a.a(view2, R.id.tv_refresh_close);
                                                    if (textView7 != null) {
                                                        i10 = R.id.tv__send_otp;
                                                        TextView textView8 = (TextView) a.a(view2, R.id.tv__send_otp);
                                                        if (textView8 != null) {
                                                            i10 = R.id.tv_verify;
                                                            TextView textView9 = (TextView) a.a(view2, R.id.tv_verify);
                                                            if (textView9 != null) {
                                                                i10 = R.id.tv_verify_otp;
                                                                TextView textView10 = (TextView) a.a(view2, R.id.tv_verify_otp);
                                                                if (textView10 != null) {
                                                                    i10 = R.id.tv_wait_otp;
                                                                    TextView textView11 = (TextView) a.a(view2, R.id.tv_wait_otp);
                                                                    if (textView11 != null) {
                                                                        i10 = R.id.verify_user;
                                                                        LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.verify_user);
                                                                        if (linearLayout3 != null) {
                                                                            return new h9((CoordinatorLayout) view2, imageView, textView, textView2, textView3, editText, linearLayout, linearLayout2, textView4, imageView2, textView5, textView6, textView7, textView8, textView9, textView10, textView11, linearLayout3);
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

    public static h9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static h9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_verify_mobile_number_user_register, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f26637a;
    }
}
