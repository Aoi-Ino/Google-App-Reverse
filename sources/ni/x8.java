package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class x8 {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f29366a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatEditText f29367b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f29368c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f29369d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatButton f29370e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatEditText f29371f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatEditText f29372g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f29373h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f29374i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f29375j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f29376k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f29377l;

    /* renamed from: m  reason: collision with root package name */
    public final AppCompatEditText f29378m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f29379n;

    /* renamed from: o  reason: collision with root package name */
    public final CheckBox f29380o;

    /* renamed from: p  reason: collision with root package name */
    public final qd f29381p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f29382q;

    /* renamed from: r  reason: collision with root package name */
    public final AppCompatButton f29383r;

    /* renamed from: s  reason: collision with root package name */
    public final MyTextView f29384s;

    private x8(RelativeLayout relativeLayout, AppCompatEditText appCompatEditText, TextView textView, MyTextView myTextView, AppCompatButton appCompatButton, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, TextView textView2, TextView textView3, MyTextView myTextView2, TextView textView4, TextView textView5, AppCompatEditText appCompatEditText4, LinearLayout linearLayout, CheckBox checkBox, qd qdVar, MyTextView myTextView3, AppCompatButton appCompatButton2, MyTextView myTextView4) {
        this.f29366a = relativeLayout;
        this.f29367b = appCompatEditText;
        this.f29368c = textView;
        this.f29369d = myTextView;
        this.f29370e = appCompatButton;
        this.f29371f = appCompatEditText2;
        this.f29372g = appCompatEditText3;
        this.f29373h = textView2;
        this.f29374i = textView3;
        this.f29375j = myTextView2;
        this.f29376k = textView4;
        this.f29377l = textView5;
        this.f29378m = appCompatEditText4;
        this.f29379n = linearLayout;
        this.f29380o = checkBox;
        this.f29381p = qdVar;
        this.f29382q = myTextView3;
        this.f29383r = appCompatButton2;
        this.f29384s = myTextView4;
    }

    public static x8 a(View view) {
        View view2 = view;
        int i10 = R.id.aadharNoEt;
        AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view2, R.id.aadharNoEt);
        if (appCompatEditText != null) {
            i10 = R.id.aadharTv;
            TextView textView = (TextView) a.a(view2, R.id.aadharTv);
            if (textView != null) {
                i10 = R.id.agreeTermCond;
                MyTextView myTextView = (MyTextView) a.a(view2, R.id.agreeTermCond);
                if (myTextView != null) {
                    i10 = R.id.cancelBtn;
                    AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.cancelBtn);
                    if (appCompatButton != null) {
                        i10 = R.id.mobileNoEt;
                        AppCompatEditText appCompatEditText2 = (AppCompatEditText) a.a(view2, R.id.mobileNoEt);
                        if (appCompatEditText2 != null) {
                            i10 = R.id.newMobileNoEt;
                            AppCompatEditText appCompatEditText3 = (AppCompatEditText) a.a(view2, R.id.newMobileNoEt);
                            if (appCompatEditText3 != null) {
                                i10 = R.id.newMobileNoTv;
                                TextView textView2 = (TextView) a.a(view2, R.id.newMobileNoTv);
                                if (textView2 != null) {
                                    i10 = R.id.note1Tv;
                                    TextView textView3 = (TextView) a.a(view2, R.id.note1Tv);
                                    if (textView3 != null) {
                                        i10 = R.id.noteTv;
                                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.noteTv);
                                        if (myTextView2 != null) {
                                            i10 = R.id.registerNameTv;
                                            TextView textView4 = (TextView) a.a(view2, R.id.registerNameTv);
                                            if (textView4 != null) {
                                                i10 = R.id.registeredMobileNoTv;
                                                TextView textView5 = (TextView) a.a(view2, R.id.registeredMobileNoTv);
                                                if (textView5 != null) {
                                                    i10 = R.id.registeredNameEt;
                                                    AppCompatEditText appCompatEditText4 = (AppCompatEditText) a.a(view2, R.id.registeredNameEt);
                                                    if (appCompatEditText4 != null) {
                                                        i10 = R.id.termCndLl;
                                                        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.termCndLl);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.term_condition;
                                                            CheckBox checkBox = (CheckBox) a.a(view2, R.id.term_condition);
                                                            if (checkBox != null) {
                                                                i10 = R.id.topHolder;
                                                                View a10 = a.a(view2, R.id.topHolder);
                                                                if (a10 != null) {
                                                                    qd a11 = qd.a(a10);
                                                                    i10 = R.id.update_mobile_no;
                                                                    MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.update_mobile_no);
                                                                    if (myTextView3 != null) {
                                                                        i10 = R.id.updateMobileNoBtn;
                                                                        AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view2, R.id.updateMobileNoBtn);
                                                                        if (appCompatButton2 != null) {
                                                                            i10 = R.id.vehicleNoTv;
                                                                            MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.vehicleNoTv);
                                                                            if (myTextView4 != null) {
                                                                                return new x8((RelativeLayout) view2, appCompatEditText, textView, myTextView, appCompatButton, appCompatEditText2, appCompatEditText3, textView2, textView3, myTextView2, textView4, textView5, appCompatEditText4, linearLayout, checkBox, a11, myTextView3, appCompatButton2, myTextView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static x8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static x8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vahan_confirm_update_mobile, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f29366a;
    }
}
