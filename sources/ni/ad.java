package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import k1.a;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f25351a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f25352b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f25353c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25354d;

    /* renamed from: e  reason: collision with root package name */
    public final rc f25355e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25356f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatButton f25357g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f25358h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f25359i;

    private ad(RelativeLayout relativeLayout, TextView textView, AppCompatButton appCompatButton, LinearLayout linearLayout, rc rcVar, TextView textView2, AppCompatButton appCompatButton2, MyTextView myTextView, MyTextView myTextView2) {
        this.f25351a = relativeLayout;
        this.f25352b = textView;
        this.f25353c = appCompatButton;
        this.f25354d = linearLayout;
        this.f25355e = rcVar;
        this.f25356f = textView2;
        this.f25357g = appCompatButton2;
        this.f25358h = myTextView;
        this.f25359i = myTextView2;
    }

    public static ad a(View view) {
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
                        rc a11 = rc.a(a10);
                        i10 = R.id.mob_number;
                        TextView textView2 = (TextView) a.a(view, R.id.mob_number);
                        if (textView2 != null) {
                            i10 = R.id.reset_button;
                            AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view, R.id.reset_button);
                            if (appCompatButton2 != null) {
                                i10 = R.id.tv_dl_no;
                                MyTextView myTextView = (MyTextView) a.a(view, R.id.tv_dl_no);
                                if (myTextView != null) {
                                    i10 = R.id.txt_mob_number;
                                    MyTextView myTextView2 = (MyTextView) a.a(view, R.id.txt_mob_number);
                                    if (myTextView2 != null) {
                                        return new ad((RelativeLayout) view, textView, appCompatButton, linearLayout, a11, textView2, appCompatButton2, myTextView, myTextView2);
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

    public static ad c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ad d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.service_withdrawn_otp_verify, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f25351a;
    }
}
