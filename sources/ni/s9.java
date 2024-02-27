package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class s9 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28545a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f28546b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f28547c;

    /* renamed from: d  reason: collision with root package name */
    public final RadioButton f28548d;

    /* renamed from: e  reason: collision with root package name */
    public final qd f28549e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f28550f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatButton f28551g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f28552h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatButton f28553i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f28554j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f28555k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatEditText f28556l;

    /* renamed from: m  reason: collision with root package name */
    public final AppCompatEditText f28557m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatEditText f28558n;

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f28559o;

    /* renamed from: p  reason: collision with root package name */
    public final RadioButton f28560p;

    private s9(ScrollView scrollView, MyTextView myTextView, LinearLayout linearLayout, RadioButton radioButton, qd qdVar, MyTextView myTextView2, AppCompatButton appCompatButton, MyTextView myTextView3, AppCompatButton appCompatButton2, MyTextView myTextView4, MyTextView myTextView5, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, LinearLayout linearLayout2, RadioButton radioButton2) {
        this.f28545a = scrollView;
        this.f28546b = myTextView;
        this.f28547c = linearLayout;
        this.f28548d = radioButton;
        this.f28549e = qdVar;
        this.f28550f = myTextView2;
        this.f28551g = appCompatButton;
        this.f28552h = myTextView3;
        this.f28553i = appCompatButton2;
        this.f28554j = myTextView4;
        this.f28555k = myTextView5;
        this.f28556l = appCompatEditText;
        this.f28557m = appCompatEditText2;
        this.f28558n = appCompatEditText3;
        this.f28559o = linearLayout2;
        this.f28560p = radioButton2;
    }

    public static s9 a(View view) {
        View view2 = view;
        int i10 = R.id.applNoTv;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.applNoTv);
        if (myTextView != null) {
            i10 = R.id.applicationNoLl;
            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.applicationNoLl);
            if (linearLayout != null) {
                i10 = R.id.applicationNoRb;
                RadioButton radioButton = (RadioButton) a.a(view2, R.id.applicationNoRb);
                if (radioButton != null) {
                    i10 = R.id.applicationStatusHeader;
                    View a10 = a.a(view2, R.id.applicationStatusHeader);
                    if (a10 != null) {
                        qd a11 = qd.a(a10);
                        i10 = R.id.chassisTv;
                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.chassisTv);
                        if (myTextView2 != null) {
                            i10 = R.id.idCancel;
                            AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.idCancel);
                            if (appCompatButton != null) {
                                i10 = R.id.idLayoutTitle;
                                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.idLayoutTitle);
                                if (myTextView3 != null) {
                                    i10 = R.id.idSubmit;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view2, R.id.idSubmit);
                                    if (appCompatButton2 != null) {
                                        i10 = R.id.rcNoTv;
                                        MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.rcNoTv);
                                        if (myTextView4 != null) {
                                            i10 = R.id.time_text;
                                            MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.time_text);
                                            if (myTextView5 != null) {
                                                i10 = R.id.txt_application_no;
                                                AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view2, R.id.txt_application_no);
                                                if (appCompatEditText != null) {
                                                    i10 = R.id.txt_chassis_no;
                                                    AppCompatEditText appCompatEditText2 = (AppCompatEditText) a.a(view2, R.id.txt_chassis_no);
                                                    if (appCompatEditText2 != null) {
                                                        i10 = R.id.txt_reg_no;
                                                        AppCompatEditText appCompatEditText3 = (AppCompatEditText) a.a(view2, R.id.txt_reg_no);
                                                        if (appCompatEditText3 != null) {
                                                            i10 = R.id.vehicleNoLl;
                                                            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.vehicleNoLl);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.vehicleNoRb;
                                                                RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.vehicleNoRb);
                                                                if (radioButton2 != null) {
                                                                    return new s9((ScrollView) view2, myTextView, linearLayout, radioButton, a11, myTextView2, appCompatButton, myTextView3, appCompatButton2, myTextView4, myTextView5, appCompatEditText, appCompatEditText2, appCompatEditText3, linearLayout2, radioButton2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static s9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static s9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.application_status_new, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28545a;
    }
}
