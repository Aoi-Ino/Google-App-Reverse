package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CircleImageView;
import k1.a;

public final class t8 {
    public final MyTextView A;
    public final MyTextView B;
    public final MyTextView C;
    public final MyTextView D;
    public final MyTextView E;
    public final MyTextView F;
    public final dc G;
    public final CircleImageView H;
    public final LinearLayout I;
    public final LinearLayout J;
    public final MyTextView K;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f28691a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f28692b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f28693c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f28694d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f28695e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f28696f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f28697g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f28698h;

    /* renamed from: i  reason: collision with root package name */
    public final RadioButton f28699i;

    /* renamed from: j  reason: collision with root package name */
    public final EditText f28700j;

    /* renamed from: k  reason: collision with root package name */
    public final RadioButton f28701k;

    /* renamed from: l  reason: collision with root package name */
    public final EditText f28702l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f28703m;

    /* renamed from: n  reason: collision with root package name */
    public final RadioButton f28704n;

    /* renamed from: o  reason: collision with root package name */
    public final Spinner f28705o;

    /* renamed from: p  reason: collision with root package name */
    public final EditText f28706p;

    /* renamed from: q  reason: collision with root package name */
    public final EditText f28707q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f28708r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f28709s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f28710t;

    /* renamed from: u  reason: collision with root package name */
    public final Spinner f28711u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f28712v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f28713w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f28714x;

    /* renamed from: y  reason: collision with root package name */
    public final MyTextView f28715y;

    /* renamed from: z  reason: collision with root package name */
    public final MyTextView f28716z;

    private t8(LinearLayout linearLayout, TextView textView, EditText editText, TextView textView2, TextView textView3, ImageView imageView, MyTextView myTextView, TextView textView4, RadioButton radioButton, EditText editText2, RadioButton radioButton2, EditText editText3, LinearLayout linearLayout2, RadioButton radioButton3, Spinner spinner, EditText editText4, EditText editText5, MyTextView myTextView2, TextView textView5, TextView textView6, Spinner spinner2, ImageView imageView2, ImageView imageView3, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, MyTextView myTextView9, MyTextView myTextView10, MyTextView myTextView11, dc dcVar, CircleImageView circleImageView, LinearLayout linearLayout3, LinearLayout linearLayout4, MyTextView myTextView12) {
        this.f28691a = linearLayout;
        this.f28692b = textView;
        this.f28693c = editText;
        this.f28694d = textView2;
        this.f28695e = textView3;
        this.f28696f = imageView;
        this.f28697g = myTextView;
        this.f28698h = textView4;
        this.f28699i = radioButton;
        this.f28700j = editText2;
        this.f28701k = radioButton2;
        this.f28702l = editText3;
        this.f28703m = linearLayout2;
        this.f28704n = radioButton3;
        this.f28705o = spinner;
        this.f28706p = editText4;
        this.f28707q = editText5;
        this.f28708r = myTextView2;
        this.f28709s = textView5;
        this.f28710t = textView6;
        this.f28711u = spinner2;
        this.f28712v = imageView2;
        this.f28713w = imageView3;
        this.f28714x = myTextView3;
        this.f28715y = myTextView4;
        this.f28716z = myTextView5;
        this.A = myTextView6;
        this.B = myTextView7;
        this.C = myTextView8;
        this.D = myTextView9;
        this.E = myTextView10;
        this.F = myTextView11;
        this.G = dcVar;
        this.H = circleImageView;
        this.I = linearLayout3;
        this.J = linearLayout4;
        this.K = myTextView12;
    }

    public static t8 a(View view) {
        View view2 = view;
        int i10 = R.id.applicant_date;
        TextView textView = (TextView) a.a(view2, R.id.applicant_date);
        if (textView != null) {
            i10 = R.id.applicant_dob;
            EditText editText = (EditText) a.a(view2, R.id.applicant_dob);
            if (editText != null) {
                i10 = R.id.applicant_month;
                TextView textView2 = (TextView) a.a(view2, R.id.applicant_month);
                if (textView2 != null) {
                    i10 = R.id.applicant_year;
                    TextView textView3 = (TextView) a.a(view2, R.id.applicant_year);
                    if (textView3 != null) {
                        i10 = R.id.dob_cal;
                        ImageView imageView = (ImageView) a.a(view2, R.id.dob_cal);
                        if (imageView != null) {
                            i10 = R.id.edit_profile;
                            MyTextView myTextView = (MyTextView) a.a(view2, R.id.edit_profile);
                            if (myTextView != null) {
                                i10 = R.id.em_dob;
                                TextView textView4 = (TextView) a.a(view2, R.id.em_dob);
                                if (textView4 != null) {
                                    i10 = R.id.em_female;
                                    RadioButton radioButton = (RadioButton) a.a(view2, R.id.em_female);
                                    if (radioButton != null) {
                                        i10 = R.id.em_height;
                                        EditText editText2 = (EditText) a.a(view2, R.id.em_height);
                                        if (editText2 != null) {
                                            i10 = R.id.em_male;
                                            RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.em_male);
                                            if (radioButton2 != null) {
                                                i10 = R.id.em_name;
                                                EditText editText3 = (EditText) a.a(view2, R.id.em_name);
                                                if (editText3 != null) {
                                                    i10 = R.id.em_next;
                                                    LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.em_next);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.em_other;
                                                        RadioButton radioButton3 = (RadioButton) a.a(view2, R.id.em_other);
                                                        if (radioButton3 != null) {
                                                            i10 = R.id.em_spn;
                                                            Spinner spinner = (Spinner) a.a(view2, R.id.em_spn);
                                                            if (spinner != null) {
                                                                i10 = R.id.em_weight;
                                                                EditText editText4 = (EditText) a.a(view2, R.id.em_weight);
                                                                if (editText4 != null) {
                                                                    i10 = R.id.emailIdEt;
                                                                    EditText editText5 = (EditText) a.a(view2, R.id.emailIdEt);
                                                                    if (editText5 != null) {
                                                                        i10 = R.id.mobile_no;
                                                                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.mobile_no);
                                                                        if (myTextView2 != null) {
                                                                            i10 = R.id.mobile_no_tv;
                                                                            TextView textView5 = (TextView) a.a(view2, R.id.mobile_no_tv);
                                                                            if (textView5 != null) {
                                                                                i10 = R.id.profile_txt;
                                                                                TextView textView6 = (TextView) a.a(view2, R.id.profile_txt);
                                                                                if (textView6 != null) {
                                                                                    i10 = R.id.select_spinner;
                                                                                    Spinner spinner2 = (Spinner) a.a(view2, R.id.select_spinner);
                                                                                    if (spinner2 != null) {
                                                                                        i10 = R.id.showmpin;
                                                                                        ImageView imageView2 = (ImageView) a.a(view2, R.id.showmpin);
                                                                                        if (imageView2 != null) {
                                                                                            i10 = R.id.showmpin_state;
                                                                                            ImageView imageView3 = (ImageView) a.a(view2, R.id.showmpin_state);
                                                                                            if (imageView3 != null) {
                                                                                                i10 = R.id.stateTxt;
                                                                                                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.stateTxt);
                                                                                                if (myTextView3 != null) {
                                                                                                    i10 = R.id.title_bloodgp;
                                                                                                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.title_bloodgp);
                                                                                                    if (myTextView4 != null) {
                                                                                                        i10 = R.id.title_dob;
                                                                                                        MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.title_dob);
                                                                                                        if (myTextView5 != null) {
                                                                                                            i10 = R.id.titleEmail;
                                                                                                            MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.titleEmail);
                                                                                                            if (myTextView6 != null) {
                                                                                                                i10 = R.id.title_fill_details;
                                                                                                                MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.title_fill_details);
                                                                                                                if (myTextView7 != null) {
                                                                                                                    i10 = R.id.title_gender;
                                                                                                                    MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.title_gender);
                                                                                                                    if (myTextView8 != null) {
                                                                                                                        i10 = R.id.title_height;
                                                                                                                        MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.title_height);
                                                                                                                        if (myTextView9 != null) {
                                                                                                                            i10 = R.id.title_name;
                                                                                                                            MyTextView myTextView10 = (MyTextView) a.a(view2, R.id.title_name);
                                                                                                                            if (myTextView10 != null) {
                                                                                                                                i10 = R.id.title_weight;
                                                                                                                                MyTextView myTextView11 = (MyTextView) a.a(view2, R.id.title_weight);
                                                                                                                                if (myTextView11 != null) {
                                                                                                                                    i10 = R.id.topheader;
                                                                                                                                    View a10 = a.a(view2, R.id.topheader);
                                                                                                                                    if (a10 != null) {
                                                                                                                                        dc a11 = dc.a(a10);
                                                                                                                                        i10 = R.id.uploadIv;
                                                                                                                                        CircleImageView circleImageView = (CircleImageView) a.a(view2, R.id.uploadIv);
                                                                                                                                        if (circleImageView != null) {
                                                                                                                                            i10 = R.id.user_info_linear;
                                                                                                                                            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.user_info_linear);
                                                                                                                                            if (linearLayout2 != null) {
                                                                                                                                                i10 = R.id.vehicle_linear;
                                                                                                                                                LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.vehicle_linear);
                                                                                                                                                if (linearLayout3 != null) {
                                                                                                                                                    i10 = R.id.view_profile;
                                                                                                                                                    MyTextView myTextView12 = (MyTextView) a.a(view2, R.id.view_profile);
                                                                                                                                                    if (myTextView12 != null) {
                                                                                                                                                        return new t8((LinearLayout) view2, textView, editText, textView2, textView3, imageView, myTextView, textView4, radioButton, editText2, radioButton2, editText3, linearLayout, radioButton3, spinner, editText4, editText5, myTextView2, textView5, textView6, spinner2, imageView2, imageView3, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7, myTextView8, myTextView9, myTextView10, myTextView11, a11, circleImageView, linearLayout2, linearLayout3, myTextView12);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static t8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static t8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_user_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f28691a;
    }
}
