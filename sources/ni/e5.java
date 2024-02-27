package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.nic.mparivahan.R;
import k1.a;

public final class e5 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f26063a;

    /* renamed from: b  reason: collision with root package name */
    public final RadioButton f26064b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckBox f26065c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f26066d;

    /* renamed from: e  reason: collision with root package name */
    public final dc f26067e;

    /* renamed from: f  reason: collision with root package name */
    public final RadioGroup f26068f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26069g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26070h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26071i;

    /* renamed from: j  reason: collision with root package name */
    public final RadioButton f26072j;

    private e5(ScrollView scrollView, RadioButton radioButton, CheckBox checkBox, EditText editText, dc dcVar, RadioGroup radioGroup, TextView textView, TextView textView2, TextView textView3, RadioButton radioButton2) {
        this.f26063a = scrollView;
        this.f26064b = radioButton;
        this.f26065c = checkBox;
        this.f26066d = editText;
        this.f26067e = dcVar;
        this.f26068f = radioGroup;
        this.f26069g = textView;
        this.f26070h = textView2;
        this.f26071i = textView3;
        this.f26072j = radioButton2;
    }

    public static e5 a(View view) {
        int i10 = R.id.adharRadio;
        RadioButton radioButton = (RadioButton) a.a(view, R.id.adharRadio);
        if (radioButton != null) {
            i10 = R.id.decKyc;
            CheckBox checkBox = (CheckBox) a.a(view, R.id.decKyc);
            if (checkBox != null) {
                i10 = R.id.et_otp;
                EditText editText = (EditText) a.a(view, R.id.et_otp);
                if (editText != null) {
                    i10 = R.id.mvvmId;
                    View a10 = a.a(view, R.id.mvvmId);
                    if (a10 != null) {
                        dc a11 = dc.a(a10);
                        i10 = R.id.radioGroup_id;
                        RadioGroup radioGroup = (RadioGroup) a.a(view, R.id.radioGroup_id);
                        if (radioGroup != null) {
                            i10 = R.id.txt_dl_number;
                            TextView textView = (TextView) a.a(view, R.id.txt_dl_number);
                            if (textView != null) {
                                i10 = R.id.txt_reset;
                                TextView textView2 = (TextView) a.a(view, R.id.txt_reset);
                                if (textView2 != null) {
                                    i10 = R.id.txt_service_submit;
                                    TextView textView3 = (TextView) a.a(view, R.id.txt_service_submit);
                                    if (textView3 != null) {
                                        i10 = R.id.vidRadio;
                                        RadioButton radioButton2 = (RadioButton) a.a(view, R.id.vidRadio);
                                        if (radioButton2 != null) {
                                            return new e5((ScrollView) view, radioButton, checkBox, editText, a11, radioGroup, textView, textView2, textView3, radioButton2);
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

    public static e5 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static e5 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_ll_adhar_otp, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f26063a;
    }
}
