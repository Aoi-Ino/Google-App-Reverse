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

public final class i7 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f26808a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatButton f26809b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatEditText f26810c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f26811d;

    /* renamed from: e  reason: collision with root package name */
    public final qd f26812e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f26813f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatEditText f26814g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f26815h;

    private i7(ScrollView scrollView, AppCompatButton appCompatButton, AppCompatEditText appCompatEditText, MyTextView myTextView, qd qdVar, MyTextView myTextView2, AppCompatEditText appCompatEditText2, MyTextView myTextView3) {
        this.f26808a = scrollView;
        this.f26809b = appCompatButton;
        this.f26810c = appCompatEditText;
        this.f26811d = myTextView;
        this.f26812e = qdVar;
        this.f26813f = myTextView2;
        this.f26814g = appCompatEditText2;
        this.f26815h = myTextView3;
    }

    public static i7 a(View view) {
        int i10 = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.btnSubmit);
        if (appCompatButton != null) {
            i10 = R.id.chasis_no;
            AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.chasis_no);
            if (appCompatEditText != null) {
                i10 = R.id.chasis_no_txt;
                MyTextView myTextView = (MyTextView) a.a(view, R.id.chasis_no_txt);
                if (myTextView != null) {
                    i10 = R.id.topHolder;
                    View a10 = a.a(view, R.id.topHolder);
                    if (a10 != null) {
                        qd a11 = qd.a(a10);
                        i10 = R.id.vahan_details_duplicate_rc;
                        MyTextView myTextView2 = (MyTextView) a.a(view, R.id.vahan_details_duplicate_rc);
                        if (myTextView2 != null) {
                            i10 = R.id.vehicle_no;
                            AppCompatEditText appCompatEditText2 = (AppCompatEditText) a.a(view, R.id.vehicle_no);
                            if (appCompatEditText2 != null) {
                                i10 = R.id.vehicle_no_txt;
                                MyTextView myTextView3 = (MyTextView) a.a(view, R.id.vehicle_no_txt);
                                if (myTextView3 != null) {
                                    return new i7((ScrollView) view, appCompatButton, appCompatEditText, myTextView, a11, myTextView2, appCompatEditText2, myTextView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static i7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static i7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_pucccertificate_download, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f26808a;
    }
}
