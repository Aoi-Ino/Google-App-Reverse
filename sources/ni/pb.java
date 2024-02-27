package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class pb {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28013a;

    /* renamed from: b  reason: collision with root package name */
    public final qd f28014b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f28015c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatButton f28016d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f28017e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatEditText f28018f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f28019g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f28020h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f28021i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f28022j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f28023k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f28024l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f28025m;

    private pb(ScrollView scrollView, qd qdVar, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, MyTextView myTextView, AppCompatEditText appCompatEditText, MyTextView myTextView2, ImageView imageView, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7) {
        this.f28013a = scrollView;
        this.f28014b = qdVar;
        this.f28015c = appCompatButton;
        this.f28016d = appCompatButton2;
        this.f28017e = myTextView;
        this.f28018f = appCompatEditText;
        this.f28019g = myTextView2;
        this.f28020h = imageView;
        this.f28021i = myTextView3;
        this.f28022j = myTextView4;
        this.f28023k = myTextView5;
        this.f28024l = myTextView6;
        this.f28025m = myTextView7;
    }

    public static pb a(View view) {
        View view2 = view;
        int i10 = R.id.applicationStatusHeader;
        View a10 = a.a(view2, R.id.applicationStatusHeader);
        if (a10 != null) {
            qd a11 = qd.a(a10);
            i10 = R.id.btnCancel;
            AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btnCancel);
            if (appCompatButton != null) {
                i10 = R.id.btnVerify;
                AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view2, R.id.btnVerify);
                if (appCompatButton2 != null) {
                    i10 = R.id.defaultOtpTv;
                    MyTextView myTextView = (MyTextView) a.a(view2, R.id.defaultOtpTv);
                    if (myTextView != null) {
                        i10 = R.id.et_otp;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view2, R.id.et_otp);
                        if (appCompatEditText != null) {
                            i10 = R.id.idLayoutTitle;
                            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.idLayoutTitle);
                            if (myTextView2 != null) {
                                i10 = R.id.showPassword;
                                ImageView imageView = (ImageView) a.a(view2, R.id.showPassword);
                                if (imageView != null) {
                                    i10 = R.id.time_text;
                                    MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.time_text);
                                    if (myTextView3 != null) {
                                        i10 = R.id.txt_application_no_value;
                                        MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.txt_application_no_value);
                                        if (myTextView4 != null) {
                                            i10 = R.id.txt_chassis_no_value;
                                            MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.txt_chassis_no_value);
                                            if (myTextView5 != null) {
                                                i10 = R.id.txt_engine_no_value;
                                                MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.txt_engine_no_value);
                                                if (myTextView6 != null) {
                                                    i10 = R.id.txt_resend_otp;
                                                    MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.txt_resend_otp);
                                                    if (myTextView7 != null) {
                                                        return new pb((ScrollView) view2, a11, appCompatButton, appCompatButton2, myTextView, appCompatEditText, myTextView2, imageView, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7);
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

    public static pb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static pb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_application_otp_verify_vahan_services, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28013a;
    }
}
