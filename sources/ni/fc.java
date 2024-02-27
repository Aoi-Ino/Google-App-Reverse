package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class fc {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f26340a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f26341b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26342c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26343d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f26344e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26345f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26346g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26347h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f26348i;

    /* renamed from: j  reason: collision with root package name */
    public final EditText f26349j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f26350k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f26351l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f26352m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f26353n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26354o;

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f26355p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f26356q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f26357r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f26358s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f26359t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f26360u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f26361v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f26362w;

    private fc(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, ImageView imageView, TextView textView, FrameLayout frameLayout, TextView textView2, TextView textView3, LinearLayout linearLayout2, EditText editText, EditText editText2, LinearLayout linearLayout3, LinearLayout linearLayout4, ImageView imageView2, LinearLayout linearLayout5, TextView textView4, LinearLayout linearLayout6, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.f26340a = coordinatorLayout;
        this.f26341b = linearLayout;
        this.f26342c = imageView;
        this.f26343d = textView;
        this.f26344e = frameLayout;
        this.f26345f = textView2;
        this.f26346g = textView3;
        this.f26347h = linearLayout2;
        this.f26348i = editText;
        this.f26349j = editText2;
        this.f26350k = linearLayout3;
        this.f26351l = linearLayout4;
        this.f26352m = imageView2;
        this.f26353n = linearLayout5;
        this.f26354o = textView4;
        this.f26355p = linearLayout6;
        this.f26356q = textView5;
        this.f26357r = textView6;
        this.f26358s = textView7;
        this.f26359t = textView8;
        this.f26360u = textView9;
        this.f26361v = textView10;
        this.f26362w = textView11;
    }

    public static fc a(View view) {
        View view2 = view;
        int i10 = R.id.another_layout;
        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.another_layout);
        if (linearLayout != null) {
            i10 = R.id.backButton;
            ImageView imageView = (ImageView) a.a(view2, R.id.backButton);
            if (imageView != null) {
                i10 = R.id.change_account;
                TextView textView = (TextView) a.a(view2, R.id.change_account);
                if (textView != null) {
                    i10 = R.id.entermpin_layout;
                    FrameLayout frameLayout = (FrameLayout) a.a(view2, R.id.entermpin_layout);
                    if (frameLayout != null) {
                        i10 = R.id.forgotmpin;
                        TextView textView2 = (TextView) a.a(view2, R.id.forgotmpin);
                        if (textView2 != null) {
                            i10 = R.id.login_with_face;
                            TextView textView3 = (TextView) a.a(view2, R.id.login_with_face);
                            if (textView3 != null) {
                                i10 = R.id.login_with_face_linear;
                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.login_with_face_linear);
                                if (linearLayout2 != null) {
                                    i10 = R.id.mobile_number;
                                    EditText editText = (EditText) a.a(view2, R.id.mobile_number);
                                    if (editText != null) {
                                        i10 = R.id.mpinEditText;
                                        EditText editText2 = (EditText) a.a(view2, R.id.mpinEditText);
                                        if (editText2 != null) {
                                            i10 = R.id.nexgenarrow;
                                            LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.nexgenlogo;
                                                LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                                if (linearLayout4 != null) {
                                                    i10 = R.id.showmpin;
                                                    ImageView imageView2 = (ImageView) a.a(view2, R.id.showmpin);
                                                    if (imageView2 != null) {
                                                        i10 = R.id.signInWithOtp;
                                                        LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.signInWithOtp);
                                                        if (linearLayout5 != null) {
                                                            i10 = R.id.sign_up_text;
                                                            TextView textView4 = (TextView) a.a(view2, R.id.sign_up_text);
                                                            if (textView4 != null) {
                                                                i10 = R.id.signWithMpin;
                                                                LinearLayout linearLayout6 = (LinearLayout) a.a(view2, R.id.signWithMpin);
                                                                if (linearLayout6 != null) {
                                                                    i10 = R.id.tv_dont_account;
                                                                    TextView textView5 = (TextView) a.a(view2, R.id.tv_dont_account);
                                                                    if (textView5 != null) {
                                                                        i10 = R.id.tv_sign_in_mpin;
                                                                        TextView textView6 = (TextView) a.a(view2, R.id.tv_sign_in_mpin);
                                                                        if (textView6 != null) {
                                                                            i10 = R.id.tv_sign_in_otp;
                                                                            TextView textView7 = (TextView) a.a(view2, R.id.tv_sign_in_otp);
                                                                            if (textView7 != null) {
                                                                                i10 = R.id.tv_sign_into;
                                                                                TextView textView8 = (TextView) a.a(view2, R.id.tv_sign_into);
                                                                                if (textView8 != null) {
                                                                                    i10 = R.id.tv_your_account;
                                                                                    TextView textView9 = (TextView) a.a(view2, R.id.tv_your_account);
                                                                                    if (textView9 != null) {
                                                                                        i10 = R.id.txt_conti;
                                                                                        TextView textView10 = (TextView) a.a(view2, R.id.txt_conti);
                                                                                        if (textView10 != null) {
                                                                                            i10 = R.id.user_name;
                                                                                            TextView textView11 = (TextView) a.a(view2, R.id.user_name);
                                                                                            if (textView11 != null) {
                                                                                                return new fc((CoordinatorLayout) view2, linearLayout, imageView, textView, frameLayout, textView2, textView3, linearLayout2, editText, editText2, linearLayout3, linearLayout4, imageView2, linearLayout5, textView4, linearLayout6, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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

    public static fc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static fc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.mvvm_sign_in, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f26340a;
    }
}
