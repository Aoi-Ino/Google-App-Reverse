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

public final class oa {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f27826a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f27827b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f27828c;

    /* renamed from: d  reason: collision with root package name */
    public final RadioButton f27829d;

    /* renamed from: e  reason: collision with root package name */
    public final qd f27830e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f27831f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatButton f27832g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f27833h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatButton f27834i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f27835j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f27836k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatEditText f27837l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f27838m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatEditText f27839n;

    /* renamed from: o  reason: collision with root package name */
    public final AppCompatEditText f27840o;

    /* renamed from: p  reason: collision with root package name */
    public final AppCompatEditText f27841p;

    /* renamed from: q  reason: collision with root package name */
    public final LinearLayout f27842q;

    /* renamed from: r  reason: collision with root package name */
    public final RadioButton f27843r;

    private oa(ScrollView scrollView, MyTextView myTextView, LinearLayout linearLayout, RadioButton radioButton, qd qdVar, MyTextView myTextView2, AppCompatButton appCompatButton, MyTextView myTextView3, AppCompatButton appCompatButton2, MyTextView myTextView4, MyTextView myTextView5, AppCompatEditText appCompatEditText, MyTextView myTextView6, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, AppCompatEditText appCompatEditText4, LinearLayout linearLayout2, RadioButton radioButton2) {
        this.f27826a = scrollView;
        this.f27827b = myTextView;
        this.f27828c = linearLayout;
        this.f27829d = radioButton;
        this.f27830e = qdVar;
        this.f27831f = myTextView2;
        this.f27832g = appCompatButton;
        this.f27833h = myTextView3;
        this.f27834i = appCompatButton2;
        this.f27835j = myTextView4;
        this.f27836k = myTextView5;
        this.f27837l = appCompatEditText;
        this.f27838m = myTextView6;
        this.f27839n = appCompatEditText2;
        this.f27840o = appCompatEditText3;
        this.f27841p = appCompatEditText4;
        this.f27842q = linearLayout2;
        this.f27843r = radioButton2;
    }

    public static oa a(View view) {
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
                                            i10 = R.id.receipt_no;
                                            MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.receipt_no);
                                            if (myTextView5 != null) {
                                                i10 = R.id.receipt_number_editText;
                                                AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view2, R.id.receipt_number_editText);
                                                if (appCompatEditText != null) {
                                                    i10 = R.id.time_text;
                                                    MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.time_text);
                                                    if (myTextView6 != null) {
                                                        i10 = R.id.txt_application_no;
                                                        AppCompatEditText appCompatEditText2 = (AppCompatEditText) a.a(view2, R.id.txt_application_no);
                                                        if (appCompatEditText2 != null) {
                                                            i10 = R.id.txt_chassis_no;
                                                            AppCompatEditText appCompatEditText3 = (AppCompatEditText) a.a(view2, R.id.txt_chassis_no);
                                                            if (appCompatEditText3 != null) {
                                                                i10 = R.id.txt_reg_no;
                                                                AppCompatEditText appCompatEditText4 = (AppCompatEditText) a.a(view2, R.id.txt_reg_no);
                                                                if (appCompatEditText4 != null) {
                                                                    i10 = R.id.vehicleNoLl;
                                                                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.vehicleNoLl);
                                                                    if (linearLayout2 != null) {
                                                                        i10 = R.id.vehicleNoRb;
                                                                        RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.vehicleNoRb);
                                                                        if (radioButton2 != null) {
                                                                            return new oa((ScrollView) view2, myTextView, linearLayout, radioButton, a11, myTextView2, appCompatButton, myTextView3, appCompatButton2, myTextView4, myTextView5, appCompatEditText, myTextView6, appCompatEditText2, appCompatEditText3, appCompatEditText4, linearLayout2, radioButton2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static oa c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static oa d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.download_forms_liera, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f27826a;
    }
}
