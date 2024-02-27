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

public final class t7 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28682a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatButton f28683b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f28684c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f28685d;

    /* renamed from: e  reason: collision with root package name */
    public final Spinner f28686e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f28687f;

    /* renamed from: g  reason: collision with root package name */
    public final Spinner f28688g;

    /* renamed from: h  reason: collision with root package name */
    public final qd f28689h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f28690i;

    private t7(ScrollView scrollView, AppCompatButton appCompatButton, ImageView imageView, ImageView imageView2, Spinner spinner, MyTextView myTextView, Spinner spinner2, qd qdVar, MyTextView myTextView2) {
        this.f28682a = scrollView;
        this.f28683b = appCompatButton;
        this.f28684c = imageView;
        this.f28685d = imageView2;
        this.f28686e = spinner;
        this.f28687f = myTextView;
        this.f28688g = spinner2;
        this.f28689h = qdVar;
        this.f28690i = myTextView2;
    }

    public static t7 a(View view) {
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
                                    i10 = R.id.vahan_reason;
                                    MyTextView myTextView2 = (MyTextView) a.a(view, R.id.vahan_reason);
                                    if (myTextView2 != null) {
                                        return new t7((ScrollView) view, appCompatButton, imageView, imageView2, spinner, myTextView, spinner2, a11, myTextView2);
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

    public static t7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static t7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_running_auction, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28682a;
    }
}
