package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.R;
import k1.a;

public final class f9 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f26311a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f26312b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatEditText f26313c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26314d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatEditText f26315e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatButton f26316f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatButton f26317g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatEditText f26318h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatEditText f26319i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26320j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26321k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26322l;

    /* renamed from: m  reason: collision with root package name */
    public final AppCompatEditText f26323m;

    /* renamed from: n  reason: collision with root package name */
    public final qd f26324n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26325o;

    private f9(RelativeLayout relativeLayout, TextView textView, AppCompatEditText appCompatEditText, TextView textView2, AppCompatEditText appCompatEditText2, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatEditText appCompatEditText3, AppCompatEditText appCompatEditText4, TextView textView3, TextView textView4, TextView textView5, AppCompatEditText appCompatEditText5, qd qdVar, TextView textView6) {
        this.f26311a = relativeLayout;
        this.f26312b = textView;
        this.f26313c = appCompatEditText;
        this.f26314d = textView2;
        this.f26315e = appCompatEditText2;
        this.f26316f = appCompatButton;
        this.f26317g = appCompatButton2;
        this.f26318h = appCompatEditText3;
        this.f26319i = appCompatEditText4;
        this.f26320j = textView3;
        this.f26321k = textView4;
        this.f26322l = textView5;
        this.f26323m = appCompatEditText5;
        this.f26324n = qdVar;
        this.f26325o = textView6;
    }

    public static f9 a(View view) {
        View view2 = view;
        int i10 = R.id.chassis_no;
        TextView textView = (TextView) a.a(view2, R.id.chassis_no);
        if (textView != null) {
            i10 = R.id.chassisNoEt;
            AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view2, R.id.chassisNoEt);
            if (appCompatEditText != null) {
                i10 = R.id.engine_no;
                TextView textView2 = (TextView) a.a(view2, R.id.engine_no);
                if (textView2 != null) {
                    i10 = R.id.engineNoEt;
                    AppCompatEditText appCompatEditText2 = (AppCompatEditText) a.a(view2, R.id.engineNoEt);
                    if (appCompatEditText2 != null) {
                        i10 = R.id.idCancel;
                        AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.idCancel);
                        if (appCompatButton != null) {
                            i10 = R.id.idSubmit;
                            AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view2, R.id.idSubmit);
                            if (appCompatButton2 != null) {
                                i10 = R.id.regNoEt;
                                AppCompatEditText appCompatEditText3 = (AppCompatEditText) a.a(view2, R.id.regNoEt);
                                if (appCompatEditText3 != null) {
                                    i10 = R.id.registrationDateEt;
                                    AppCompatEditText appCompatEditText4 = (AppCompatEditText) a.a(view2, R.id.registrationDateEt);
                                    if (appCompatEditText4 != null) {
                                        i10 = R.id.registration_dt;
                                        TextView textView3 = (TextView) a.a(view2, R.id.registration_dt);
                                        if (textView3 != null) {
                                            i10 = R.id.registration_no;
                                            TextView textView4 = (TextView) a.a(view2, R.id.registration_no);
                                            if (textView4 != null) {
                                                i10 = R.id.registration_upto_date;
                                                TextView textView5 = (TextView) a.a(view2, R.id.registration_upto_date);
                                                if (textView5 != null) {
                                                    i10 = R.id.registrationUptoEt;
                                                    AppCompatEditText appCompatEditText5 = (AppCompatEditText) a.a(view2, R.id.registrationUptoEt);
                                                    if (appCompatEditText5 != null) {
                                                        i10 = R.id.topHolder;
                                                        View a10 = a.a(view2, R.id.topHolder);
                                                        if (a10 != null) {
                                                            qd a11 = qd.a(a10);
                                                            i10 = R.id.update_mobile_no;
                                                            TextView textView6 = (TextView) a.a(view2, R.id.update_mobile_no);
                                                            if (textView6 != null) {
                                                                return new f9((RelativeLayout) view2, textView, appCompatEditText, textView2, appCompatEditText2, appCompatButton, appCompatButton2, appCompatEditText3, appCompatEditText4, textView3, textView4, textView5, appCompatEditText5, a11, textView6);
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

    public static f9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static f9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vahan_update_mobile, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f26311a;
    }
}
