package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import k1.a;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f27373a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27374b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f27375c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f27376d;

    /* renamed from: e  reason: collision with root package name */
    public final dc f27377e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatEditText f27378f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatButton f27379g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f27380h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f27381i;

    private m(RelativeLayout relativeLayout, TextView textView, AppCompatButton appCompatButton, LinearLayout linearLayout, dc dcVar, AppCompatEditText appCompatEditText, AppCompatButton appCompatButton2, MyTextView myTextView, MyTextView myTextView2) {
        this.f27373a = relativeLayout;
        this.f27374b = textView;
        this.f27375c = appCompatButton;
        this.f27376d = linearLayout;
        this.f27377e = dcVar;
        this.f27378f = appCompatEditText;
        this.f27379g = appCompatButton2;
        this.f27380h = myTextView;
        this.f27381i = myTextView2;
    }

    public static m a(View view) {
        int i10 = R.id.applNumberTv;
        TextView textView = (TextView) a.a(view, R.id.applNumberTv);
        if (textView != null) {
            i10 = R.id.generate_otp;
            AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.generate_otp);
            if (appCompatButton != null) {
                i10 = R.id.linear_mob;
                LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.linear_mob);
                if (linearLayout != null) {
                    i10 = R.id.mHeader;
                    View a10 = a.a(view, R.id.mHeader);
                    if (a10 != null) {
                        dc a11 = dc.a(a10);
                        i10 = R.id.mob_number;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.mob_number);
                        if (appCompatEditText != null) {
                            i10 = R.id.reset_button;
                            AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view, R.id.reset_button);
                            if (appCompatButton2 != null) {
                                i10 = R.id.tv_dl_no;
                                MyTextView myTextView = (MyTextView) a.a(view, R.id.tv_dl_no);
                                if (myTextView != null) {
                                    i10 = R.id.txt_mob_number;
                                    MyTextView myTextView2 = (MyTextView) a.a(view, R.id.txt_mob_number);
                                    if (myTextView2 != null) {
                                        return new m((RelativeLayout) view, textView, appCompatButton, linearLayout, a11, appCompatEditText, appCompatButton2, myTextView, myTextView2);
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

    public static m c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static m d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_appl_cancel_verify_mobile, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f27373a;
    }
}
