package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.R;
import k1.a;

public final class m8 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f27437a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27438b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f27439c;

    /* renamed from: d  reason: collision with root package name */
    public final RadioButton f27440d;

    /* renamed from: e  reason: collision with root package name */
    public final qd f27441e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f27442f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatButton f27443g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f27444h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatButton f27445i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27446j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27447k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatEditText f27448l;

    /* renamed from: m  reason: collision with root package name */
    public final AppCompatEditText f27449m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatEditText f27450n;

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f27451o;

    /* renamed from: p  reason: collision with root package name */
    public final RadioButton f27452p;

    private m8(ScrollView scrollView, TextView textView, LinearLayout linearLayout, RadioButton radioButton, qd qdVar, TextView textView2, AppCompatButton appCompatButton, TextView textView3, AppCompatButton appCompatButton2, TextView textView4, TextView textView5, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, LinearLayout linearLayout2, RadioButton radioButton2) {
        this.f27437a = scrollView;
        this.f27438b = textView;
        this.f27439c = linearLayout;
        this.f27440d = radioButton;
        this.f27441e = qdVar;
        this.f27442f = textView2;
        this.f27443g = appCompatButton;
        this.f27444h = textView3;
        this.f27445i = appCompatButton2;
        this.f27446j = textView4;
        this.f27447k = textView5;
        this.f27448l = appCompatEditText;
        this.f27449m = appCompatEditText2;
        this.f27450n = appCompatEditText3;
        this.f27451o = linearLayout2;
        this.f27452p = radioButton2;
    }

    public static m8 a(View view) {
        View view2 = view;
        int i10 = R.id.applNoTv;
        TextView textView = (TextView) a.a(view2, R.id.applNoTv);
        if (textView != null) {
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
                        TextView textView2 = (TextView) a.a(view2, R.id.chassisTv);
                        if (textView2 != null) {
                            i10 = R.id.idCancel;
                            AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.idCancel);
                            if (appCompatButton != null) {
                                i10 = R.id.idLayoutTitle;
                                TextView textView3 = (TextView) a.a(view2, R.id.idLayoutTitle);
                                if (textView3 != null) {
                                    i10 = R.id.idSubmit;
                                    AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view2, R.id.idSubmit);
                                    if (appCompatButton2 != null) {
                                        i10 = R.id.rcNoTv;
                                        TextView textView4 = (TextView) a.a(view2, R.id.rcNoTv);
                                        if (textView4 != null) {
                                            i10 = R.id.time_text;
                                            TextView textView5 = (TextView) a.a(view2, R.id.time_text);
                                            if (textView5 != null) {
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
                                                                    return new m8((ScrollView) view2, textView, linearLayout, radioButton, a11, textView2, appCompatButton, textView3, appCompatButton2, textView4, textView5, appCompatEditText, appCompatEditText2, appCompatEditText3, linearLayout2, radioButton2);
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

    public static m8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static m8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_tobuyer_application, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f27437a;
    }
}
