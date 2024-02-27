package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import k1.a;

public final class k4 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f27073a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27074b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f27075c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatButton f27076d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatButton f27077e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f27078f;

    /* renamed from: g  reason: collision with root package name */
    public final rc f27079g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f27080h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f27081i;

    private k4(RelativeLayout relativeLayout, TextView textView, MyTextView myTextView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, LinearLayout linearLayout, rc rcVar, EditText editText, MyTextView myTextView2) {
        this.f27073a = relativeLayout;
        this.f27074b = textView;
        this.f27075c = myTextView;
        this.f27076d = appCompatButton;
        this.f27077e = appCompatButton2;
        this.f27078f = linearLayout;
        this.f27079g = rcVar;
        this.f27080h = editText;
        this.f27081i = myTextView2;
    }

    public static k4 a(View view) {
        int i10 = R.id.applNumberTv;
        TextView textView = (TextView) a.a(view, R.id.applNumberTv);
        if (textView != null) {
            i10 = R.id.applTv;
            MyTextView myTextView = (MyTextView) a.a(view, R.id.applTv);
            if (myTextView != null) {
                i10 = R.id.cancelBtn;
                AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.cancelBtn);
                if (appCompatButton != null) {
                    i10 = R.id.generateOtp;
                    AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view, R.id.generateOtp);
                    if (appCompatButton2 != null) {
                        i10 = R.id.linear_mob;
                        LinearLayout linearLayout = (LinearLayout) a.a(view, R.id.linear_mob);
                        if (linearLayout != null) {
                            i10 = R.id.mHeader;
                            View a10 = a.a(view, R.id.mHeader);
                            if (a10 != null) {
                                rc a11 = rc.a(a10);
                                i10 = R.id.mob_number;
                                EditText editText = (EditText) a.a(view, R.id.mob_number);
                                if (editText != null) {
                                    i10 = R.id.txt_mob_number;
                                    MyTextView myTextView2 = (MyTextView) a.a(view, R.id.txt_mob_number);
                                    if (myTextView2 != null) {
                                        return new k4((RelativeLayout) view, textView, myTextView, appCompatButton, appCompatButton2, linearLayout, a11, editText, myTextView2);
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

    public static k4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static k4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_edit_app_otp, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f27073a;
    }
}
