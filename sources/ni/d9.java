package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class d9 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f25905a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f25906b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f25907c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f25908d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f25909e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f25910f;

    /* renamed from: g  reason: collision with root package name */
    public final CheckBox f25911g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f25912h;

    /* renamed from: i  reason: collision with root package name */
    public final CheckBox f25913i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f25914j;

    /* renamed from: k  reason: collision with root package name */
    public final EditText f25915k;

    /* renamed from: l  reason: collision with root package name */
    public final CheckBox f25916l;

    /* renamed from: m  reason: collision with root package name */
    public final RadioButton f25917m;

    /* renamed from: n  reason: collision with root package name */
    public final RadioButton f25918n;

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f25919o;

    /* renamed from: p  reason: collision with root package name */
    public final qd f25920p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f25921q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f25922r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f25923s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f25924t;

    private d9(ScrollView scrollView, MyTextView myTextView, AppCompatButton appCompatButton, EditText editText, EditText editText2, EditText editText3, CheckBox checkBox, MyTextView myTextView2, CheckBox checkBox2, LinearLayout linearLayout, EditText editText4, CheckBox checkBox3, RadioButton radioButton, RadioButton radioButton2, LinearLayout linearLayout2, qd qdVar, MyTextView myTextView3, MyTextView myTextView4, TextView textView, TextView textView2) {
        this.f25905a = scrollView;
        this.f25906b = myTextView;
        this.f25907c = appCompatButton;
        this.f25908d = editText;
        this.f25909e = editText2;
        this.f25910f = editText3;
        this.f25911g = checkBox;
        this.f25912h = myTextView2;
        this.f25913i = checkBox2;
        this.f25914j = linearLayout;
        this.f25915k = editText4;
        this.f25916l = checkBox3;
        this.f25917m = radioButton;
        this.f25918n = radioButton2;
        this.f25919o = linearLayout2;
        this.f25920p = qdVar;
        this.f25921q = myTextView3;
        this.f25922r = myTextView4;
        this.f25923s = textView;
        this.f25924t = textView2;
    }

    public static d9 a(View view) {
        View view2 = view;
        int i10 = R.id.apply_tax_exemption;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.apply_tax_exemption);
        if (myTextView != null) {
            i10 = R.id.btnSubmit;
            AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btnSubmit);
            if (appCompatButton != null) {
                i10 = R.id.enter_fitness_certificate;
                EditText editText = (EditText) a.a(view2, R.id.enter_fitness_certificate);
                if (editText != null) {
                    i10 = R.id.enter_permit;
                    EditText editText2 = (EditText) a.a(view2, R.id.enter_permit);
                    if (editText2 != null) {
                        i10 = R.id.enter_rc_seraial_no;
                        EditText editText3 = (EditText) a.a(view2, R.id.enter_rc_seraial_no);
                        if (editText3 != null) {
                            i10 = R.id.fitness_certificate;
                            CheckBox checkBox = (CheckBox) a.a(view2, R.id.fitness_certificate);
                            if (checkBox != null) {
                                i10 = R.id.optional_detail;
                                MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.optional_detail);
                                if (myTextView2 != null) {
                                    i10 = R.id.permit;
                                    CheckBox checkBox2 = (CheckBox) a.a(view2, R.id.permit);
                                    if (checkBox2 != null) {
                                        i10 = R.id.police_fir_layout;
                                        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.police_fir_layout);
                                        if (linearLayout != null) {
                                            i10 = R.id.remarkTv;
                                            EditText editText4 = (EditText) a.a(view2, R.id.remarkTv);
                                            if (editText4 != null) {
                                                i10 = R.id.surrender_rc;
                                                CheckBox checkBox3 = (CheckBox) a.a(view2, R.id.surrender_rc);
                                                if (checkBox3 != null) {
                                                    i10 = R.id.tax_no;
                                                    RadioButton radioButton = (RadioButton) a.a(view2, R.id.tax_no);
                                                    if (radioButton != null) {
                                                        i10 = R.id.tax_yes;
                                                        RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.tax_yes);
                                                        if (radioButton2 != null) {
                                                            i10 = R.id.text_exemption;
                                                            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.text_exemption);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.topHolder;
                                                                View a10 = a.a(view2, R.id.topHolder);
                                                                if (a10 != null) {
                                                                    qd a11 = qd.a(a10);
                                                                    i10 = R.id.vahan_details_duplicate_rc;
                                                                    MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.vahan_details_duplicate_rc);
                                                                    if (myTextView3 != null) {
                                                                        i10 = R.id.vahan_remark;
                                                                        MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.vahan_remark);
                                                                        if (myTextView4 != null) {
                                                                            i10 = R.id.vehicleNumberTv;
                                                                            TextView textView = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                            if (textView != null) {
                                                                                i10 = R.id.vehicle_view;
                                                                                TextView textView2 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                if (textView2 != null) {
                                                                                    return new d9((ScrollView) view2, myTextView, appCompatButton, editText, editText2, editText3, checkBox, myTextView2, checkBox2, linearLayout, editText4, checkBox3, radioButton, radioButton2, linearLayout2, a11, myTextView3, myTextView4, textView, textView2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static d9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vahan_rc_surrender, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f25905a;
    }
}
