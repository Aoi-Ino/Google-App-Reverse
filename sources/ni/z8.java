package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class z8 {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f29713a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f29714b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f29715c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f29716d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f29717e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f29718f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f29719g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f29720h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f29721i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f29722j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f29723k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f29724l;

    /* renamed from: m  reason: collision with root package name */
    public final CheckBox f29725m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f29726n;

    /* renamed from: o  reason: collision with root package name */
    public final qd f29727o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f29728p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f29729q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f29730r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f29731s;

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f29732t;

    /* renamed from: u  reason: collision with root package name */
    public final LinearLayout f29733u;

    private z8(CoordinatorLayout coordinatorLayout, MyTextView myTextView, TextView textView, TextView textView2, TextView textView3, EditText editText, TextView textView4, MyTextView myTextView2, MyTextView myTextView3, ImageView imageView, TextView textView5, LinearLayout linearLayout, CheckBox checkBox, MyTextView myTextView4, qd qdVar, TextView textView6, TextView textView7, TextView textView8, TextView textView9, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f29713a = coordinatorLayout;
        this.f29714b = myTextView;
        this.f29715c = textView;
        this.f29716d = textView2;
        this.f29717e = textView3;
        this.f29718f = editText;
        this.f29719g = textView4;
        this.f29720h = myTextView2;
        this.f29721i = myTextView3;
        this.f29722j = imageView;
        this.f29723k = textView5;
        this.f29724l = linearLayout;
        this.f29725m = checkBox;
        this.f29726n = myTextView4;
        this.f29727o = qdVar;
        this.f29728p = textView6;
        this.f29729q = textView7;
        this.f29730r = textView8;
        this.f29731s = textView9;
        this.f29732t = linearLayout2;
        this.f29733u = linearLayout3;
    }

    public static z8 a(View view) {
        View view2 = view;
        int i10 = R.id.agreeTermCond;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.agreeTermCond);
        if (myTextView != null) {
            i10 = R.id.disPlay;
            TextView textView = (TextView) a.a(view2, R.id.disPlay);
            if (textView != null) {
                i10 = R.id.edit_mobile_number;
                TextView textView2 = (TextView) a.a(view2, R.id.edit_mobile_number);
                if (textView2 != null) {
                    i10 = R.id.enterMobileTv;
                    TextView textView3 = (TextView) a.a(view2, R.id.enterMobileTv);
                    if (textView3 != null) {
                        i10 = R.id.enterOtp;
                        EditText editText = (EditText) a.a(view2, R.id.enterOtp);
                        if (editText != null) {
                            i10 = R.id.note_text;
                            TextView textView4 = (TextView) a.a(view2, R.id.note_text);
                            if (textView4 != null) {
                                i10 = R.id.resendOtp;
                                MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.resendOtp);
                                if (myTextView2 != null) {
                                    i10 = R.id.selectedServiceTv;
                                    MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.selectedServiceTv);
                                    if (myTextView3 != null) {
                                        i10 = R.id.showmpin;
                                        ImageView imageView = (ImageView) a.a(view2, R.id.showmpin);
                                        if (imageView != null) {
                                            i10 = R.id.submitOtp;
                                            TextView textView5 = (TextView) a.a(view2, R.id.submitOtp);
                                            if (textView5 != null) {
                                                i10 = R.id.termCndLl;
                                                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.termCndLl);
                                                if (linearLayout != null) {
                                                    i10 = R.id.term_condition;
                                                    CheckBox checkBox = (CheckBox) a.a(view2, R.id.term_condition);
                                                    if (checkBox != null) {
                                                        i10 = R.id.time_text;
                                                        MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.time_text);
                                                        if (myTextView4 != null) {
                                                            i10 = R.id.topHolder;
                                                            View a10 = a.a(view2, R.id.topHolder);
                                                            if (a10 != null) {
                                                                qd a11 = qd.a(a10);
                                                                i10 = R.id.txt_reset;
                                                                TextView textView6 = (TextView) a.a(view2, R.id.txt_reset);
                                                                if (textView6 != null) {
                                                                    i10 = R.id.txt_vehicle_number;
                                                                    TextView textView7 = (TextView) a.a(view2, R.id.txt_vehicle_number);
                                                                    if (textView7 != null) {
                                                                        i10 = R.id.update_mob;
                                                                        TextView textView8 = (TextView) a.a(view2, R.id.update_mob);
                                                                        if (textView8 != null) {
                                                                            i10 = R.id.vehile_no;
                                                                            TextView textView9 = (TextView) a.a(view2, R.id.vehile_no);
                                                                            if (textView9 != null) {
                                                                                i10 = R.id.verifyOtpBtn;
                                                                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.verifyOtpBtn);
                                                                                if (linearLayout2 != null) {
                                                                                    i10 = R.id.verifyOtpLl;
                                                                                    LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.verifyOtpLl);
                                                                                    if (linearLayout3 != null) {
                                                                                        return new z8((CoordinatorLayout) view2, myTextView, textView, textView2, textView3, editText, textView4, myTextView2, myTextView3, imageView, textView5, linearLayout, checkBox, myTextView4, a11, textView6, textView7, textView8, textView9, linearLayout2, linearLayout3);
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

    public static z8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static z8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vahan_generate_o_t_p_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f29713a;
    }
}
