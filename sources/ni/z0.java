package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import k1.a;

public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29621a;

    /* renamed from: b  reason: collision with root package name */
    public final Spinner f29622b;

    /* renamed from: c  reason: collision with root package name */
    public final Spinner f29623c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f29624d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f29625e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f29626f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f29627g;

    /* renamed from: h  reason: collision with root package name */
    public final CustomWegetLayout f29628h;

    /* renamed from: i  reason: collision with root package name */
    public final CustomWegetLayout f29629i;

    private z0(LinearLayout linearLayout, Spinner spinner, Spinner spinner2, TextView textView, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, CustomWegetLayout customWegetLayout, CustomWegetLayout customWegetLayout2) {
        this.f29621a = linearLayout;
        this.f29622b = spinner;
        this.f29623c = spinner2;
        this.f29624d = textView;
        this.f29625e = myTextView;
        this.f29626f = myTextView2;
        this.f29627g = myTextView3;
        this.f29628h = customWegetLayout;
        this.f29629i = customWegetLayout2;
    }

    public static z0 a(View view) {
        int i10 = R.id.current_rto;
        Spinner spinner = (Spinner) a.a(view, R.id.current_rto);
        if (spinner != null) {
            i10 = R.id.current_state;
            Spinner spinner2 = (Spinner) a.a(view, R.id.current_state);
            if (spinner2 != null) {
                i10 = R.id.dl_no;
                TextView textView = (TextView) a.a(view, R.id.dl_no);
                if (textView != null) {
                    i10 = R.id.dl_number_new;
                    MyTextView myTextView = (MyTextView) a.a(view, R.id.dl_number_new);
                    if (myTextView != null) {
                        i10 = R.id.txt_req_submit;
                        MyTextView myTextView2 = (MyTextView) a.a(view, R.id.txt_req_submit);
                        if (myTextView2 != null) {
                            i10 = R.id.txt_req_submit_rto;
                            MyTextView myTextView3 = (MyTextView) a.a(view, R.id.txt_req_submit_rto);
                            if (myTextView3 != null) {
                                i10 = R.id.txt_service_cancel;
                                CustomWegetLayout customWegetLayout = (CustomWegetLayout) a.a(view, R.id.txt_service_cancel);
                                if (customWegetLayout != null) {
                                    i10 = R.id.txt_service_submit;
                                    CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) a.a(view, R.id.txt_service_submit);
                                    if (customWegetLayout2 != null) {
                                        return new z0((LinearLayout) view, spinner, spinner2, textView, myTextView, myTextView2, myTextView3, customWegetLayout, customWegetLayout2);
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

    public static z0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static z0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_cl_rto_select, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29621a;
    }
}
