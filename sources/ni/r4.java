package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class r4 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28370a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f28371b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f28372c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f28373d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f28374e;

    /* renamed from: f  reason: collision with root package name */
    public final Spinner f28375f;

    /* renamed from: g  reason: collision with root package name */
    public final qd f28376g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatEditText f28377h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f28378i;

    private r4(ScrollView scrollView, MyTextView myTextView, AppCompatButton appCompatButton, ImageView imageView, MyTextView myTextView2, Spinner spinner, qd qdVar, AppCompatEditText appCompatEditText, MyTextView myTextView3) {
        this.f28370a = scrollView;
        this.f28371b = myTextView;
        this.f28372c = appCompatButton;
        this.f28373d = imageView;
        this.f28374e = myTextView2;
        this.f28375f = spinner;
        this.f28376g = qdVar;
        this.f28377h = appCompatEditText;
        this.f28378i = myTextView3;
    }

    public static r4 a(View view) {
        int i10 = R.id.application_no;
        MyTextView myTextView = (MyTextView) a.a(view, R.id.application_no);
        if (myTextView != null) {
            i10 = R.id.btnSubmit;
            AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.btnSubmit);
            if (appCompatButton != null) {
                i10 = R.id.rightStatePin;
                ImageView imageView = (ImageView) a.a(view, R.id.rightStatePin);
                if (imageView != null) {
                    i10 = R.id.state_name;
                    MyTextView myTextView2 = (MyTextView) a.a(view, R.id.state_name);
                    if (myTextView2 != null) {
                        i10 = R.id.stateSpinner;
                        Spinner spinner = (Spinner) a.a(view, R.id.stateSpinner);
                        if (spinner != null) {
                            i10 = R.id.topHolder;
                            View a10 = a.a(view, R.id.topHolder);
                            if (a10 != null) {
                                qd a11 = qd.a(a10);
                                i10 = R.id.txt_rcptnumber;
                                AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.txt_rcptnumber);
                                if (appCompatEditText != null) {
                                    i10 = R.id.vahan_details_duplicate_rc;
                                    MyTextView myTextView3 = (MyTextView) a.a(view, R.id.vahan_details_duplicate_rc);
                                    if (myTextView3 != null) {
                                        return new r4((ScrollView) view, myTextView, appCompatButton, imageView, myTextView2, spinner, a11, appCompatEditText, myTextView3);
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

    public static r4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static r4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_fancy_fee_receipt, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28370a;
    }
}
