package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class c9 {
    public final MyTextView A;
    public final TextView B;
    public final RadioButton C;

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f25658a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f25659b;

    /* renamed from: c  reason: collision with root package name */
    public final RadioButton f25660c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f25661d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25662e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f25663f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f25664g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25665h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f25666i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25667j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f25668k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f25669l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f25670m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f25671n;

    /* renamed from: o  reason: collision with root package name */
    public final RadioGroup f25672o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f25673p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f25674q;

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f25675r;

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f25676s;

    /* renamed from: t  reason: collision with root package name */
    public final MyTextView f25677t;

    /* renamed from: u  reason: collision with root package name */
    public final MyTextView f25678u;

    /* renamed from: v  reason: collision with root package name */
    public final qd f25679v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f25680w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f25681x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f25682y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f25683z;

    private c9(CoordinatorLayout coordinatorLayout, TextView textView, RadioButton radioButton, CheckBox checkBox, TextView textView2, EditText editText, MyTextView myTextView, TextView textView3, EditText editText2, TextView textView4, LinearLayout linearLayout, MyTextView myTextView2, LinearLayout linearLayout2, LinearLayout linearLayout3, RadioGroup radioGroup, MyTextView myTextView3, MyTextView myTextView4, ImageView imageView, LinearLayout linearLayout4, MyTextView myTextView5, MyTextView myTextView6, qd qdVar, TextView textView5, TextView textView6, TextView textView7, TextView textView8, MyTextView myTextView7, TextView textView9, RadioButton radioButton2) {
        this.f25658a = coordinatorLayout;
        this.f25659b = textView;
        this.f25660c = radioButton;
        this.f25661d = checkBox;
        this.f25662e = textView2;
        this.f25663f = editText;
        this.f25664g = myTextView;
        this.f25665h = textView3;
        this.f25666i = editText2;
        this.f25667j = textView4;
        this.f25668k = linearLayout;
        this.f25669l = myTextView2;
        this.f25670m = linearLayout2;
        this.f25671n = linearLayout3;
        this.f25672o = radioGroup;
        this.f25673p = myTextView3;
        this.f25674q = myTextView4;
        this.f25675r = imageView;
        this.f25676s = linearLayout4;
        this.f25677t = myTextView5;
        this.f25678u = myTextView6;
        this.f25679v = qdVar;
        this.f25680w = textView5;
        this.f25681x = textView6;
        this.f25682y = textView7;
        this.f25683z = textView8;
        this.A = myTextView7;
        this.B = textView9;
        this.C = radioButton2;
    }

    public static c9 a(View view) {
        View view2 = view;
        int i10 = R.id.aadher_title;
        TextView textView = (TextView) a.a(view2, R.id.aadher_title);
        if (textView != null) {
            i10 = R.id.adhar_radio;
            RadioButton radioButton = (RadioButton) a.a(view2, R.id.adhar_radio);
            if (radioButton != null) {
                i10 = R.id.dec_kyc;
                CheckBox checkBox = (CheckBox) a.a(view2, R.id.dec_kyc);
                if (checkBox != null) {
                    i10 = R.id.disPlay;
                    TextView textView2 = (TextView) a.a(view2, R.id.disPlay);
                    if (textView2 != null) {
                        i10 = R.id.enterOtp;
                        EditText editText = (EditText) a.a(view2, R.id.enterOtp);
                        if (editText != null) {
                            i10 = R.id.enter_otp2;
                            MyTextView myTextView = (MyTextView) a.a(view2, R.id.enter_otp2);
                            if (myTextView != null) {
                                i10 = R.id.enterVirtualIdTv;
                                TextView textView3 = (TextView) a.a(view2, R.id.enterVirtualIdTv);
                                if (textView3 != null) {
                                    i10 = R.id.et_otp;
                                    EditText editText2 = (EditText) a.a(view2, R.id.et_otp);
                                    if (editText2 != null) {
                                        i10 = R.id.faceless_services;
                                        TextView textView4 = (TextView) a.a(view2, R.id.faceless_services);
                                        if (textView4 != null) {
                                            i10 = R.id.generateOtpLl;
                                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.generateOtpLl);
                                            if (linearLayout != null) {
                                                i10 = R.id.notes;
                                                MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.notes);
                                                if (myTextView2 != null) {
                                                    i10 = R.id.otpBtnLl;
                                                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.otpBtnLl);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.processLl;
                                                        LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.processLl);
                                                        if (linearLayout3 != null) {
                                                            i10 = R.id.radioGroup_id;
                                                            RadioGroup radioGroup = (RadioGroup) a.a(view2, R.id.radioGroup_id);
                                                            if (radioGroup != null) {
                                                                i10 = R.id.resendOtp;
                                                                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.resendOtp);
                                                                if (myTextView3 != null) {
                                                                    i10 = R.id.selectedServiceTv;
                                                                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.selectedServiceTv);
                                                                    if (myTextView4 != null) {
                                                                        i10 = R.id.showmpin;
                                                                        ImageView imageView = (ImageView) a.a(view2, R.id.showmpin);
                                                                        if (imageView != null) {
                                                                            i10 = R.id.termCndLl;
                                                                            LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.termCndLl);
                                                                            if (linearLayout4 != null) {
                                                                                i10 = R.id.terms_conditions;
                                                                                MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.terms_conditions);
                                                                                if (myTextView5 != null) {
                                                                                    i10 = R.id.time_text;
                                                                                    MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.time_text);
                                                                                    if (myTextView6 != null) {
                                                                                        i10 = R.id.topHolder;
                                                                                        View a10 = a.a(view2, R.id.topHolder);
                                                                                        if (a10 != null) {
                                                                                            qd a11 = qd.a(a10);
                                                                                            i10 = R.id.txt_reset;
                                                                                            TextView textView5 = (TextView) a.a(view2, R.id.txt_reset);
                                                                                            if (textView5 != null) {
                                                                                                i10 = R.id.txt_reset_otp;
                                                                                                TextView textView6 = (TextView) a.a(view2, R.id.txt_reset_otp);
                                                                                                if (textView6 != null) {
                                                                                                    i10 = R.id.txt_service_submit;
                                                                                                    TextView textView7 = (TextView) a.a(view2, R.id.txt_service_submit);
                                                                                                    if (textView7 != null) {
                                                                                                        i10 = R.id.txt_vehicle_number;
                                                                                                        TextView textView8 = (TextView) a.a(view2, R.id.txt_vehicle_number);
                                                                                                        if (textView8 != null) {
                                                                                                            i10 = R.id.vehicle_number;
                                                                                                            MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.vehicle_number);
                                                                                                            if (myTextView7 != null) {
                                                                                                                i10 = R.id.verify_user;
                                                                                                                TextView textView9 = (TextView) a.a(view2, R.id.verify_user);
                                                                                                                if (textView9 != null) {
                                                                                                                    i10 = R.id.vid_radio;
                                                                                                                    RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.vid_radio);
                                                                                                                    if (radioButton2 != null) {
                                                                                                                        return new c9((CoordinatorLayout) view2, textView, radioButton, checkBox, textView2, editText, myTextView, textView3, editText2, textView4, linearLayout, myTextView2, linearLayout2, linearLayout3, radioGroup, myTextView3, myTextView4, imageView, linearLayout4, myTextView5, myTextView6, a11, textView5, textView6, textView7, textView8, myTextView7, textView9, radioButton2);
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

    public static c9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static c9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vahan_process_with_adhar, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f25658a;
    }
}
