package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class g4 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f26472a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatEditText f26473b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f26474c;

    /* renamed from: d  reason: collision with root package name */
    public final qd f26475d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f26476e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f26477f;

    private g4(ScrollView scrollView, AppCompatEditText appCompatEditText, AppCompatButton appCompatButton, qd qdVar, MyTextView myTextView, MyTextView myTextView2) {
        this.f26472a = scrollView;
        this.f26473b = appCompatEditText;
        this.f26474c = appCompatButton;
        this.f26475d = qdVar;
        this.f26476e = myTextView;
        this.f26477f = myTextView2;
    }

    public static g4 a(View view) {
        int i10 = R.id.app_no;
        AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.app_no);
        if (appCompatEditText != null) {
            i10 = R.id.btnSubmit;
            AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.btnSubmit);
            if (appCompatButton != null) {
                i10 = R.id.topHolder;
                View a10 = a.a(view, R.id.topHolder);
                if (a10 != null) {
                    qd a11 = qd.a(a10);
                    i10 = R.id.vahan_details_duplicate_rc;
                    MyTextView myTextView = (MyTextView) a.a(view, R.id.vahan_details_duplicate_rc);
                    if (myTextView != null) {
                        i10 = R.id.vehicle_no_txt;
                        MyTextView myTextView2 = (MyTextView) a.a(view, R.id.vehicle_no_txt);
                        if (myTextView2 != null) {
                            return new g4((ScrollView) view, appCompatEditText, appCompatButton, a11, myTextView, myTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static g4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static g4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_duplicate_fitness_certificate_download, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f26472a;
    }
}
