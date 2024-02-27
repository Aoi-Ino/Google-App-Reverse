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

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28309a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f28310b;

    /* renamed from: c  reason: collision with root package name */
    public final qd f28311c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatButton f28312d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f28313e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatButton f28314f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f28315g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatEditText f28316h;

    private r(ScrollView scrollView, MyTextView myTextView, qd qdVar, AppCompatButton appCompatButton, MyTextView myTextView2, AppCompatButton appCompatButton2, MyTextView myTextView3, AppCompatEditText appCompatEditText) {
        this.f28309a = scrollView;
        this.f28310b = myTextView;
        this.f28311c = qdVar;
        this.f28312d = appCompatButton;
        this.f28313e = myTextView2;
        this.f28314f = appCompatButton2;
        this.f28315g = myTextView3;
        this.f28316h = appCompatEditText;
    }

    public static r a(View view) {
        int i10 = R.id.application_no;
        MyTextView myTextView = (MyTextView) a.a(view, R.id.application_no);
        if (myTextView != null) {
            i10 = R.id.applicationStatusHeader;
            View a10 = a.a(view, R.id.applicationStatusHeader);
            if (a10 != null) {
                qd a11 = qd.a(a10);
                i10 = R.id.idCancel;
                AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.idCancel);
                if (appCompatButton != null) {
                    i10 = R.id.idLayoutTitle;
                    MyTextView myTextView2 = (MyTextView) a.a(view, R.id.idLayoutTitle);
                    if (myTextView2 != null) {
                        i10 = R.id.idSubmit;
                        AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view, R.id.idSubmit);
                        if (appCompatButton2 != null) {
                            i10 = R.id.time_text;
                            MyTextView myTextView3 = (MyTextView) a.a(view, R.id.time_text);
                            if (myTextView3 != null) {
                                i10 = R.id.txt_Acknumber;
                                AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.txt_Acknumber);
                                if (appCompatEditText != null) {
                                    return new r((ScrollView) view, myTextView, a11, appCompatButton, myTextView2, appCompatButton2, myTextView3, appCompatEditText);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static r c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static r d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_auction_status, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28309a;
    }
}
