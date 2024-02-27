package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class f5 {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f26232a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f26233b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26234c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f26235d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26236e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f26237f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f26238g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26239h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f26240i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26241j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26242k;

    /* renamed from: l  reason: collision with root package name */
    public final rc f26243l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f26244m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatTextView f26245n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26246o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f26247p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f26248q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f26249r;

    private f5(ConstraintLayout constraintLayout, MyTextView myTextView, TextView textView, MyTextView myTextView2, TextView textView2, MyTextView myTextView3, MyTextView myTextView4, TextView textView3, AppCompatTextView appCompatTextView, TextView textView4, TextView textView5, rc rcVar, MyTextView myTextView5, AppCompatTextView appCompatTextView2, TextView textView6, MyTextView myTextView6, MyTextView myTextView7, TextView textView7) {
        this.f26232a = constraintLayout;
        this.f26233b = myTextView;
        this.f26234c = textView;
        this.f26235d = myTextView2;
        this.f26236e = textView2;
        this.f26237f = myTextView3;
        this.f26238g = myTextView4;
        this.f26239h = textView3;
        this.f26240i = appCompatTextView;
        this.f26241j = textView4;
        this.f26242k = textView5;
        this.f26243l = rcVar;
        this.f26244m = myTextView5;
        this.f26245n = appCompatTextView2;
        this.f26246o = textView6;
        this.f26247p = myTextView6;
        this.f26248q = myTextView7;
        this.f26249r = textView7;
    }

    public static f5 a(View view) {
        View view2 = view;
        int i10 = R.id.ageTv;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.ageTv);
        if (myTextView != null) {
            i10 = R.id.ageValue;
            TextView textView = (TextView) a.a(view2, R.id.ageValue);
            if (textView != null) {
                i10 = R.id.app_dob;
                MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.app_dob);
                if (myTextView2 != null) {
                    i10 = R.id.app_dob_val;
                    TextView textView2 = (TextView) a.a(view2, R.id.app_dob_val);
                    if (textView2 != null) {
                        i10 = R.id.app_father_name;
                        MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.app_father_name);
                        if (myTextView3 != null) {
                            i10 = R.id.app_gender;
                            MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.app_gender);
                            if (myTextView4 != null) {
                                i10 = R.id.app_gender_val;
                                TextView textView3 = (TextView) a.a(view2, R.id.app_gender_val);
                                if (textView3 != null) {
                                    i10 = R.id.cancelTv;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.cancelTv);
                                    if (appCompatTextView != null) {
                                        i10 = R.id.f_first_name;
                                        TextView textView4 = (TextView) a.a(view2, R.id.f_first_name);
                                        if (textView4 != null) {
                                            i10 = R.id.first_name;
                                            TextView textView5 = (TextView) a.a(view2, R.id.first_name);
                                            if (textView5 != null) {
                                                i10 = R.id.include3;
                                                View a10 = a.a(view2, R.id.include3);
                                                if (a10 != null) {
                                                    rc a11 = rc.a(a10);
                                                    i10 = R.id.myApplicationNo;
                                                    MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.myApplicationNo);
                                                    if (myTextView5 != null) {
                                                        i10 = R.id.proceedTv;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.proceedTv);
                                                        if (appCompatTextView2 != null) {
                                                            i10 = R.id.slotDataValue;
                                                            TextView textView6 = (TextView) a.a(view2, R.id.slotDataValue);
                                                            if (textView6 != null) {
                                                                i10 = R.id.slotDateTv;
                                                                MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.slotDateTv);
                                                                if (myTextView6 != null) {
                                                                    i10 = R.id.slotTimeTv;
                                                                    MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.slotTimeTv);
                                                                    if (myTextView7 != null) {
                                                                        i10 = R.id.slotTimeValue;
                                                                        TextView textView7 = (TextView) a.a(view2, R.id.slotTimeValue);
                                                                        if (textView7 != null) {
                                                                            return new f5((ConstraintLayout) view2, myTextView, textView, myTextView2, textView2, myTextView3, myTextView4, textView3, appCompatTextView, textView4, textView5, a11, myTextView5, appCompatTextView2, textView6, myTextView6, myTextView7, textView7);
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

    public static f5 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static f5 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_ll_app_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f26232a;
    }
}
