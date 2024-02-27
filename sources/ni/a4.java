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

public final class a4 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f25179a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f25180b;

    /* renamed from: c  reason: collision with root package name */
    public final qd f25181c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f25182d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatButton f25183e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f25184f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatButton f25185g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f25186h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f25187i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatEditText f25188j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatEditText f25189k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatEditText f25190l;

    private a4(ScrollView scrollView, MyTextView myTextView, qd qdVar, MyTextView myTextView2, AppCompatButton appCompatButton, MyTextView myTextView3, AppCompatButton appCompatButton2, MyTextView myTextView4, MyTextView myTextView5, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3) {
        this.f25179a = scrollView;
        this.f25180b = myTextView;
        this.f25181c = qdVar;
        this.f25182d = myTextView2;
        this.f25183e = appCompatButton;
        this.f25184f = myTextView3;
        this.f25185g = appCompatButton2;
        this.f25186h = myTextView4;
        this.f25187i = myTextView5;
        this.f25188j = appCompatEditText;
        this.f25189k = appCompatEditText2;
        this.f25190l = appCompatEditText3;
    }

    public static a4 a(View view) {
        int i10 = R.id.application_no;
        MyTextView myTextView = (MyTextView) a.a(view, R.id.application_no);
        if (myTextView != null) {
            i10 = R.id.applicationStatusHeader;
            View a10 = a.a(view, R.id.applicationStatusHeader);
            if (a10 != null) {
                qd a11 = qd.a(a10);
                i10 = R.id.chassisTv;
                MyTextView myTextView2 = (MyTextView) a.a(view, R.id.chassisTv);
                if (myTextView2 != null) {
                    i10 = R.id.idCancel;
                    AppCompatButton appCompatButton = (AppCompatButton) a.a(view, R.id.idCancel);
                    if (appCompatButton != null) {
                        i10 = R.id.idLayoutTitle;
                        MyTextView myTextView3 = (MyTextView) a.a(view, R.id.idLayoutTitle);
                        if (myTextView3 != null) {
                            i10 = R.id.idSubmit;
                            AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view, R.id.idSubmit);
                            if (appCompatButton2 != null) {
                                i10 = R.id.registration_no;
                                MyTextView myTextView4 = (MyTextView) a.a(view, R.id.registration_no);
                                if (myTextView4 != null) {
                                    i10 = R.id.time_text;
                                    MyTextView myTextView5 = (MyTextView) a.a(view, R.id.time_text);
                                    if (myTextView5 != null) {
                                        i10 = R.id.txt_application_no;
                                        AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view, R.id.txt_application_no);
                                        if (appCompatEditText != null) {
                                            i10 = R.id.txt_chassis_no;
                                            AppCompatEditText appCompatEditText2 = (AppCompatEditText) a.a(view, R.id.txt_chassis_no);
                                            if (appCompatEditText2 != null) {
                                                i10 = R.id.txt_reg_no;
                                                AppCompatEditText appCompatEditText3 = (AppCompatEditText) a.a(view, R.id.txt_reg_no);
                                                if (appCompatEditText3 != null) {
                                                    return new a4((ScrollView) view, myTextView, a11, myTextView2, appCompatButton, myTextView3, appCompatButton2, myTextView4, myTextView5, appCompatEditText, appCompatEditText2, appCompatEditText3);
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

    public static a4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static a4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_download_receipt, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f25179a;
    }
}
