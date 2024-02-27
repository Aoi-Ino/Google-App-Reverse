package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class kc {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f27165a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27166b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatEditText f27167c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27168d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatEditText f27169e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatButton f27170f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatButton f27171g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatEditText f27172h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f27173i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27174j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27175k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27176l;

    /* renamed from: m  reason: collision with root package name */
    public final AppCompatTextView f27177m;

    /* renamed from: n  reason: collision with root package name */
    public final qd f27178n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f27179o;

    private kc(RelativeLayout relativeLayout, TextView textView, AppCompatEditText appCompatEditText, TextView textView2, AppCompatEditText appCompatEditText2, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatEditText appCompatEditText3, AppCompatTextView appCompatTextView, TextView textView3, TextView textView4, TextView textView5, AppCompatTextView appCompatTextView2, qd qdVar, TextView textView6) {
        this.f27165a = relativeLayout;
        this.f27166b = textView;
        this.f27167c = appCompatEditText;
        this.f27168d = textView2;
        this.f27169e = appCompatEditText2;
        this.f27170f = appCompatButton;
        this.f27171g = appCompatButton2;
        this.f27172h = appCompatEditText3;
        this.f27173i = appCompatTextView;
        this.f27174j = textView3;
        this.f27175k = textView4;
        this.f27176l = textView5;
        this.f27177m = appCompatTextView2;
        this.f27178n = qdVar;
        this.f27179o = textView6;
    }

    public static kc a(View view) {
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
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.registrationDateEt);
                                    if (appCompatTextView != null) {
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
                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.registrationUptoEt);
                                                    if (appCompatTextView2 != null) {
                                                        i10 = R.id.topHolder;
                                                        View a10 = a.a(view2, R.id.topHolder);
                                                        if (a10 != null) {
                                                            qd a11 = qd.a(a10);
                                                            i10 = R.id.update_mobile_no;
                                                            TextView textView6 = (TextView) a.a(view2, R.id.update_mobile_no);
                                                            if (textView6 != null) {
                                                                return new kc((RelativeLayout) view2, textView, appCompatEditText, textView2, appCompatEditText2, appCompatButton, appCompatButton2, appCompatEditText3, appCompatTextView, textView3, textView4, textView5, appCompatTextView2, a11, textView6);
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

    public static kc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static kc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.nomines_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f27165a;
    }
}
