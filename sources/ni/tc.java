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
import com.nic.mparivahan.dlservices.widget.MyTextView;
import k1.a;

public final class tc {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28734a;

    /* renamed from: b  reason: collision with root package name */
    public final RadioButton f28735b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f28736c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f28737d;

    /* renamed from: e  reason: collision with root package name */
    public final CheckBox f28738e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f28739f;

    /* renamed from: g  reason: collision with root package name */
    public final yb f28740g;

    /* renamed from: h  reason: collision with root package name */
    public final dc f28741h;

    /* renamed from: i  reason: collision with root package name */
    public final RadioGroup f28742i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f28743j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f28744k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f28745l;

    /* renamed from: m  reason: collision with root package name */
    public final RadioButton f28746m;

    private tc(ScrollView scrollView, RadioButton radioButton, MyTextView myTextView, TextView textView, CheckBox checkBox, EditText editText, yb ybVar, dc dcVar, RadioGroup radioGroup, TextView textView2, TextView textView3, TextView textView4, RadioButton radioButton2) {
        this.f28734a = scrollView;
        this.f28735b = radioButton;
        this.f28736c = myTextView;
        this.f28737d = textView;
        this.f28738e = checkBox;
        this.f28739f = editText;
        this.f28740g = ybVar;
        this.f28741h = dcVar;
        this.f28742i = radioGroup;
        this.f28743j = textView2;
        this.f28744k = textView3;
        this.f28745l = textView4;
        this.f28746m = radioButton2;
    }

    public static tc a(View view) {
        View view2 = view;
        int i10 = R.id.adharRadio;
        RadioButton radioButton = (RadioButton) a.a(view2, R.id.adharRadio);
        if (radioButton != null) {
            i10 = R.id.adhar_term;
            MyTextView myTextView = (MyTextView) a.a(view2, R.id.adhar_term);
            if (myTextView != null) {
                i10 = R.id.adhr_vid_txt;
                TextView textView = (TextView) a.a(view2, R.id.adhr_vid_txt);
                if (textView != null) {
                    i10 = R.id.decKyc;
                    CheckBox checkBox = (CheckBox) a.a(view2, R.id.decKyc);
                    if (checkBox != null) {
                        i10 = R.id.et_otp;
                        EditText editText = (EditText) a.a(view2, R.id.et_otp);
                        if (editText != null) {
                            i10 = R.id.multi_head;
                            View a10 = a.a(view2, R.id.multi_head);
                            if (a10 != null) {
                                yb a11 = yb.a(a10);
                                i10 = R.id.mvvmId;
                                View a12 = a.a(view2, R.id.mvvmId);
                                if (a12 != null) {
                                    dc a13 = dc.a(a12);
                                    i10 = R.id.radioGroup_id;
                                    RadioGroup radioGroup = (RadioGroup) a.a(view2, R.id.radioGroup_id);
                                    if (radioGroup != null) {
                                        i10 = R.id.txt_dl_number;
                                        TextView textView2 = (TextView) a.a(view2, R.id.txt_dl_number);
                                        if (textView2 != null) {
                                            i10 = R.id.txt_reset;
                                            TextView textView3 = (TextView) a.a(view2, R.id.txt_reset);
                                            if (textView3 != null) {
                                                i10 = R.id.txt_service_submit;
                                                TextView textView4 = (TextView) a.a(view2, R.id.txt_service_submit);
                                                if (textView4 != null) {
                                                    i10 = R.id.vidRadio;
                                                    RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.vidRadio);
                                                    if (radioButton2 != null) {
                                                        return new tc((ScrollView) view2, radioButton, myTextView, textView, checkBox, editText, a11, a13, radioGroup, textView2, textView3, textView4, radioButton2);
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

    public static tc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static tc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.sarthi_adhar_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28734a;
    }
}
