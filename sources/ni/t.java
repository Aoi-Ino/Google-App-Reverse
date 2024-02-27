package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28595a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatButton f28596b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f28597c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f28598d;

    /* renamed from: e  reason: collision with root package name */
    public final Spinner f28599e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f28600f;

    /* renamed from: g  reason: collision with root package name */
    public final Spinner f28601g;

    /* renamed from: h  reason: collision with root package name */
    public final qd f28602h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f28603i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f28604j;

    private t(ScrollView scrollView, AppCompatButton appCompatButton, ImageView imageView, ImageView imageView2, Spinner spinner, MyTextView myTextView, Spinner spinner2, qd qdVar, MyTextView myTextView2, MyTextView myTextView3) {
        this.f28595a = scrollView;
        this.f28596b = appCompatButton;
        this.f28597c = imageView;
        this.f28598d = imageView2;
        this.f28599e = spinner;
        this.f28600f = myTextView;
        this.f28601g = spinner2;
        this.f28602h = qdVar;
        this.f28603i = myTextView2;
        this.f28604j = myTextView3;
    }

    public static t a(View view) {
        int i10 = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.btnSubmit);
        if (appCompatButton != null) {
            i10 = R.id.rightRTOPin;
            ImageView imageView = (ImageView) a.a(view, R.id.rightRTOPin);
            if (imageView != null) {
                i10 = R.id.rightStatePin;
                ImageView imageView2 = (ImageView) a.a(view, R.id.rightStatePin);
                if (imageView2 != null) {
                    i10 = R.id.rtoSpinner;
                    Spinner spinner = (Spinner) a.a(view, R.id.rtoSpinner);
                    if (spinner != null) {
                        i10 = R.id.state_name;
                        MyTextView myTextView = (MyTextView) a.a(view, R.id.state_name);
                        if (myTextView != null) {
                            i10 = R.id.stateSpinner;
                            Spinner spinner2 = (Spinner) a.a(view, R.id.stateSpinner);
                            if (spinner2 != null) {
                                i10 = R.id.topHolder;
                                View a10 = a.a(view, R.id.topHolder);
                                if (a10 != null) {
                                    qd a11 = qd.a(a10);
                                    i10 = R.id.vahan_details_duplicate_rc;
                                    MyTextView myTextView2 = (MyTextView) a.a(view, R.id.vahan_details_duplicate_rc);
                                    if (myTextView2 != null) {
                                        i10 = R.id.vahan_reason;
                                        MyTextView myTextView3 = (MyTextView) a.a(view, R.id.vahan_reason);
                                        if (myTextView3 != null) {
                                            return new t((ScrollView) view, appCompatButton, imageView, imageView2, spinner, myTextView, spinner2, a11, myTextView2, myTextView3);
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

    public static t c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static t d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_available_fancy_number_status, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28595a;
    }
}
