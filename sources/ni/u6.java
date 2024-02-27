package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class u6 {
    public final ImageView A;
    public final zd B;
    public final TextView C;
    public final qd D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final TextView H;
    public final TextView I;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28822a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f28823b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f28824c;

    /* renamed from: d  reason: collision with root package name */
    public final RadioButton f28825d;

    /* renamed from: e  reason: collision with root package name */
    public final RadioButton f28826e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f28827f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatTextView f28828g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatTextView f28829h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f28830i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f28831j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatTextView f28832k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatTextView f28833l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f28834m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatTextView f28835n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f28836o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f28837p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f28838q;

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f28839r;

    /* renamed from: s  reason: collision with root package name */
    public final EditText f28840s;

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f28841t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f28842u;

    /* renamed from: v  reason: collision with root package name */
    public final AppCompatTextView f28843v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f28844w;

    /* renamed from: x  reason: collision with root package name */
    public final RadioGroup f28845x;

    /* renamed from: y  reason: collision with root package name */
    public final kb f28846y;

    /* renamed from: z  reason: collision with root package name */
    public final Spinner f28847z;

    private u6(ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RadioButton radioButton, RadioButton radioButton2, TextView textView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, LinearLayout linearLayout, TextView textView2, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, TextView textView3, AppCompatTextView appCompatTextView7, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout2, EditText editText, LinearLayout linearLayout3, TextView textView7, AppCompatTextView appCompatTextView8, TextView textView8, RadioGroup radioGroup, kb kbVar, Spinner spinner, ImageView imageView, zd zdVar, TextView textView9, qd qdVar, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, TextView textView10, TextView textView11) {
        this.f28822a = scrollView;
        this.f28823b = appCompatTextView;
        this.f28824c = appCompatTextView2;
        this.f28825d = radioButton;
        this.f28826e = radioButton2;
        this.f28827f = textView;
        this.f28828g = appCompatTextView3;
        this.f28829h = appCompatTextView4;
        this.f28830i = linearLayout;
        this.f28831j = textView2;
        this.f28832k = appCompatTextView5;
        this.f28833l = appCompatTextView6;
        this.f28834m = textView3;
        this.f28835n = appCompatTextView7;
        this.f28836o = textView4;
        this.f28837p = textView5;
        this.f28838q = textView6;
        this.f28839r = linearLayout2;
        this.f28840s = editText;
        this.f28841t = linearLayout3;
        this.f28842u = textView7;
        this.f28843v = appCompatTextView8;
        this.f28844w = textView8;
        this.f28845x = radioGroup;
        this.f28846y = kbVar;
        this.f28847z = spinner;
        this.A = imageView;
        this.B = zdVar;
        this.C = textView9;
        this.D = qdVar;
        this.E = appCompatTextView9;
        this.F = appCompatTextView10;
        this.G = appCompatTextView11;
        this.H = textView10;
        this.I = textView11;
    }

    public static u6 a(View view) {
        View view2 = view;
        int i10 = R.id.add_insurance_Detail;
        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.add_insurance_Detail);
        if (appCompatTextView != null) {
            i10 = R.id.add_nominee_Detail;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.add_nominee_Detail);
            if (appCompatTextView2 != null) {
                i10 = R.id.add_nominee_no;
                RadioButton radioButton = (RadioButton) a.a(view2, R.id.add_nominee_no);
                if (radioButton != null) {
                    i10 = R.id.add_nominee_yes;
                    RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.add_nominee_yes);
                    if (radioButton2 != null) {
                        i10 = R.id.declared_insurance;
                        TextView textView = (TextView) a.a(view2, R.id.declared_insurance);
                        if (textView != null) {
                            i10 = R.id.declared_insurance_txt;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.declared_insurance_txt);
                            if (appCompatTextView3 != null) {
                                i10 = R.id.insurance_company_txt;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) a.a(view2, R.id.insurance_company_txt);
                                if (appCompatTextView4 != null) {
                                    i10 = R.id.insurance_detail;
                                    LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.insurance_detail);
                                    if (linearLayout != null) {
                                        i10 = R.id.insurance_from;
                                        TextView textView2 = (TextView) a.a(view2, R.id.insurance_from);
                                        if (textView2 != null) {
                                            i10 = R.id.insurance_from_txt;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) a.a(view2, R.id.insurance_from_txt);
                                            if (appCompatTextView5 != null) {
                                                i10 = R.id.insurance_type_txt;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) a.a(view2, R.id.insurance_type_txt);
                                                if (appCompatTextView6 != null) {
                                                    i10 = R.id.insurance_upto;
                                                    TextView textView3 = (TextView) a.a(view2, R.id.insurance_upto);
                                                    if (textView3 != null) {
                                                        i10 = R.id.insurance_upto_txt;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) a.a(view2, R.id.insurance_upto_txt);
                                                        if (appCompatTextView7 != null) {
                                                            i10 = R.id.insuranceconpany;
                                                            TextView textView4 = (TextView) a.a(view2, R.id.insuranceconpany);
                                                            if (textView4 != null) {
                                                                i10 = R.id.insurancetype;
                                                                TextView textView5 = (TextView) a.a(view2, R.id.insurancetype);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.nomineeDateOfBirth;
                                                                    TextView textView6 = (TextView) a.a(view2, R.id.nomineeDateOfBirth);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.nominee_detail;
                                                                        LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.nominee_detail);
                                                                        if (linearLayout2 != null) {
                                                                            i10 = R.id.nomineeName;
                                                                            EditText editText = (EditText) a.a(view2, R.id.nomineeName);
                                                                            if (editText != null) {
                                                                                i10 = R.id.nominneLinear;
                                                                                LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.nominneLinear);
                                                                                if (linearLayout3 != null) {
                                                                                    i10 = R.id.policy_number;
                                                                                    TextView textView7 = (TextView) a.a(view2, R.id.policy_number);
                                                                                    if (textView7 != null) {
                                                                                        i10 = R.id.policy_number_txt;
                                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) a.a(view2, R.id.policy_number_txt);
                                                                                        if (appCompatTextView8 != null) {
                                                                                            i10 = R.id.previousPage;
                                                                                            TextView textView8 = (TextView) a.a(view2, R.id.previousPage);
                                                                                            if (textView8 != null) {
                                                                                                i10 = R.id.radioGroup_id;
                                                                                                RadioGroup radioGroup = (RadioGroup) a.a(view2, R.id.radioGroup_id);
                                                                                                if (radioGroup != null) {
                                                                                                    i10 = R.id.rc_ind;
                                                                                                    View a10 = a.a(view2, R.id.rc_ind);
                                                                                                    if (a10 != null) {
                                                                                                        kb a11 = kb.a(a10);
                                                                                                        i10 = R.id.relationWithNominee;
                                                                                                        Spinner spinner = (Spinner) a.a(view2, R.id.relationWithNominee);
                                                                                                        if (spinner != null) {
                                                                                                            i10 = R.id.rightLabelPin;
                                                                                                            ImageView imageView = (ImageView) a.a(view2, R.id.rightLabelPin);
                                                                                                            if (imageView != null) {
                                                                                                                i10 = R.id.stepper_layout;
                                                                                                                View a12 = a.a(view2, R.id.stepper_layout);
                                                                                                                if (a12 != null) {
                                                                                                                    zd a13 = zd.a(a12);
                                                                                                                    i10 = R.id.submitForm;
                                                                                                                    TextView textView9 = (TextView) a.a(view2, R.id.submitForm);
                                                                                                                    if (textView9 != null) {
                                                                                                                        i10 = R.id.topHolder;
                                                                                                                        View a14 = a.a(view2, R.id.topHolder);
                                                                                                                        if (a14 != null) {
                                                                                                                            qd a15 = qd.a(a14);
                                                                                                                            i10 = R.id.vahan_financer_add;
                                                                                                                            AppCompatTextView appCompatTextView9 = (AppCompatTextView) a.a(view2, R.id.vahan_financer_add);
                                                                                                                            if (appCompatTextView9 != null) {
                                                                                                                                i10 = R.id.vahan_financer_name;
                                                                                                                                AppCompatTextView appCompatTextView10 = (AppCompatTextView) a.a(view2, R.id.vahan_financer_name);
                                                                                                                                if (appCompatTextView10 != null) {
                                                                                                                                    i10 = R.id.vahan_type;
                                                                                                                                    AppCompatTextView appCompatTextView11 = (AppCompatTextView) a.a(view2, R.id.vahan_type);
                                                                                                                                    if (appCompatTextView11 != null) {
                                                                                                                                        i10 = R.id.vehicleNumberTv;
                                                                                                                                        TextView textView10 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                                                                                        if (textView10 != null) {
                                                                                                                                            i10 = R.id.vehicle_view;
                                                                                                                                            TextView textView11 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                                            if (textView11 != null) {
                                                                                                                                                return new u6((ScrollView) view2, appCompatTextView, appCompatTextView2, radioButton, radioButton2, textView, appCompatTextView3, appCompatTextView4, linearLayout, textView2, appCompatTextView5, appCompatTextView6, textView3, appCompatTextView7, textView4, textView5, textView6, linearLayout2, editText, linearLayout3, textView7, appCompatTextView8, textView8, radioGroup, a11, spinner, imageView, a13, textView9, a15, appCompatTextView9, appCompatTextView10, appCompatTextView11, textView10, textView11);
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

    public static u6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static u6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_nominee_and_insurance_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28822a;
    }
}
