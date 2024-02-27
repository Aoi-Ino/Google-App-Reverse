package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nic.mparivahan.R;
import k1.a;

public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26783a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f26784b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f26785c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialButton f26786d;

    /* renamed from: e  reason: collision with root package name */
    public final TextInputEditText f26787e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputEditText f26788f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputEditText f26789g;

    /* renamed from: h  reason: collision with root package name */
    public final dc f26790h;

    /* renamed from: i  reason: collision with root package name */
    public final Spinner f26791i;

    /* renamed from: j  reason: collision with root package name */
    public final Spinner f26792j;

    /* renamed from: k  reason: collision with root package name */
    public final Spinner f26793k;

    /* renamed from: l  reason: collision with root package name */
    public final TextInputLayout f26794l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26795m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26796n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26797o;

    /* renamed from: p  reason: collision with root package name */
    public final TextInputLayout f26798p;

    private i1(LinearLayout linearLayout, TextInputLayout textInputLayout, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, dc dcVar, Spinner spinner, Spinner spinner2, Spinner spinner3, TextInputLayout textInputLayout2, TextView textView, TextView textView2, TextView textView3, TextInputLayout textInputLayout3) {
        this.f26783a = linearLayout;
        this.f26784b = textInputLayout;
        this.f26785c = materialButton;
        this.f26786d = materialButton2;
        this.f26787e = textInputEditText;
        this.f26788f = textInputEditText2;
        this.f26789g = textInputEditText3;
        this.f26790h = dcVar;
        this.f26791i = spinner;
        this.f26792j = spinner2;
        this.f26793k = spinner3;
        this.f26794l = textInputLayout2;
        this.f26795m = textView;
        this.f26796n = textView2;
        this.f26797o = textView3;
        this.f26798p = textInputLayout3;
    }

    public static i1 a(View view) {
        View view2 = view;
        int i10 = R.id.applicationNumberLayout;
        TextInputLayout textInputLayout = (TextInputLayout) a.a(view2, R.id.applicationNumberLayout);
        if (textInputLayout != null) {
            i10 = R.id.btn_attach;
            MaterialButton materialButton = (MaterialButton) a.a(view2, R.id.btn_attach);
            if (materialButton != null) {
                i10 = R.id.btn_raise_complaint;
                MaterialButton materialButton2 = (MaterialButton) a.a(view2, R.id.btn_raise_complaint);
                if (materialButton2 != null) {
                    i10 = R.id.et_application_number;
                    TextInputEditText textInputEditText = (TextInputEditText) a.a(view2, R.id.et_application_number);
                    if (textInputEditText != null) {
                        i10 = R.id.et_remarks;
                        TextInputEditText textInputEditText2 = (TextInputEditText) a.a(view2, R.id.et_remarks);
                        if (textInputEditText2 != null) {
                            i10 = R.id.et_vehicle_number;
                            TextInputEditText textInputEditText3 = (TextInputEditText) a.a(view2, R.id.et_vehicle_number);
                            if (textInputEditText3 != null) {
                                i10 = R.id.mvvHeader;
                                View a10 = a.a(view2, R.id.mvvHeader);
                                if (a10 != null) {
                                    dc a11 = dc.a(a10);
                                    i10 = R.id.spinner_complaint_type;
                                    Spinner spinner = (Spinner) a.a(view2, R.id.spinner_complaint_type);
                                    if (spinner != null) {
                                        i10 = R.id.spinner_sub_complaint;
                                        Spinner spinner2 = (Spinner) a.a(view2, R.id.spinner_sub_complaint);
                                        if (spinner2 != null) {
                                            i10 = R.id.spinner_sub_sub_complaint;
                                            Spinner spinner3 = (Spinner) a.a(view2, R.id.spinner_sub_sub_complaint);
                                            if (spinner3 != null) {
                                                i10 = R.id.textInputLayoutDescription;
                                                TextInputLayout textInputLayout2 = (TextInputLayout) a.a(view2, R.id.textInputLayoutDescription);
                                                if (textInputLayout2 != null) {
                                                    i10 = R.id.tvDescriptionLetterCounter;
                                                    TextView textView = (TextView) a.a(view2, R.id.tvDescriptionLetterCounter);
                                                    if (textView != null) {
                                                        i10 = R.id.tv_file_name;
                                                        TextView textView2 = (TextView) a.a(view2, R.id.tv_file_name);
                                                        if (textView2 != null) {
                                                            i10 = R.id.txtRasieComp;
                                                            TextView textView3 = (TextView) a.a(view2, R.id.txtRasieComp);
                                                            if (textView3 != null) {
                                                                i10 = R.id.vehicleNumberLayout;
                                                                TextInputLayout textInputLayout3 = (TextInputLayout) a.a(view2, R.id.vehicleNumberLayout);
                                                                if (textInputLayout3 != null) {
                                                                    return new i1((LinearLayout) view2, textInputLayout, materialButton, materialButton2, textInputEditText, textInputEditText2, textInputEditText3, a11, spinner, spinner2, spinner3, textInputLayout2, textView, textView2, textView3, textInputLayout3);
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

    public static i1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static i1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_complaint, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f26783a;
    }
}
