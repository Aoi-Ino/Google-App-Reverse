package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26894a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f26895b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f26896c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f26897d;

    /* renamed from: e  reason: collision with root package name */
    public final RadioButton f26898e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26899f;

    /* renamed from: g  reason: collision with root package name */
    public final Spinner f26900g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f26901h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f26902i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f26903j;

    /* renamed from: k  reason: collision with root package name */
    public final qd f26904k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f26905l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f26906m;

    /* renamed from: n  reason: collision with root package name */
    public final RadioButton f26907n;

    private j0(LinearLayout linearLayout, EditText editText, AppCompatTextView appCompatTextView, EditText editText2, RadioButton radioButton, LinearLayout linearLayout2, Spinner spinner, ImageView imageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, qd qdVar, LinearLayout linearLayout3, LinearLayout linearLayout4, RadioButton radioButton2) {
        this.f26894a = linearLayout;
        this.f26895b = editText;
        this.f26896c = appCompatTextView;
        this.f26897d = editText2;
        this.f26898e = radioButton;
        this.f26899f = linearLayout2;
        this.f26900g = spinner;
        this.f26901h = imageView;
        this.f26902i = appCompatTextView2;
        this.f26903j = appCompatTextView3;
        this.f26904k = qdVar;
        this.f26905l = linearLayout3;
        this.f26906m = linearLayout4;
        this.f26907n = radioButton2;
    }

    public static j0 a(View view) {
        View view2 = view;
        int i10 = R.id.enter_vehicle_number;
        EditText editText = (EditText) a.a(view2, R.id.enter_vehicle_number);
        if (editText != null) {
            i10 = R.id.getDetailsTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.getDetailsTv);
            if (appCompatTextView != null) {
                i10 = R.id.inputEt;
                EditText editText2 = (EditText) a.a(view2, R.id.inputEt);
                if (editText2 != null) {
                    i10 = R.id.noticeNoRb;
                    RadioButton radioButton = (RadioButton) a.a(view2, R.id.noticeNoRb);
                    if (radioButton != null) {
                        i10 = R.id.noticeServiceLl;
                        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.noticeServiceLl);
                        if (linearLayout != null) {
                            i10 = R.id.state_spinner;
                            Spinner spinner = (Spinner) a.a(view2, R.id.state_spinner);
                            if (spinner != null) {
                                i10 = R.id.tax_mode_icon;
                                ImageView imageView = (ImageView) a.a(view2, R.id.tax_mode_icon);
                                if (imageView != null) {
                                    i10 = R.id.taxhead;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.taxhead);
                                    if (appCompatTextView2 != null) {
                                        i10 = R.id.titleTv;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.titleTv);
                                        if (appCompatTextView3 != null) {
                                            i10 = R.id.top_back;
                                            View a10 = a.a(view2, R.id.top_back);
                                            if (a10 != null) {
                                                qd a11 = qd.a(a10);
                                                i10 = R.id.vehicleDetailsLl;
                                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.vehicleDetailsLl);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.vehicleNoLl;
                                                    LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.vehicleNoLl);
                                                    if (linearLayout3 != null) {
                                                        i10 = R.id.vehicleNoRb;
                                                        RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.vehicleNoRb);
                                                        if (radioButton2 != null) {
                                                            return new j0((LinearLayout) view2, editText, appCompatTextView, editText2, radioButton, linearLayout, spinner, imageView, appCompatTextView2, appCompatTextView3, a11, linearLayout2, linearLayout3, radioButton2);
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

    public static j0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static j0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_check_post_receipt_status, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f26894a;
    }
}
