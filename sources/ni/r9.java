package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class r9 {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f28406a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f28407b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f28408c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f28409d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f28410e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f28411f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatTextView f28412g;

    /* renamed from: h  reason: collision with root package name */
    public final CheckBox f28413h;

    /* renamed from: i  reason: collision with root package name */
    public final CheckBox f28414i;

    /* renamed from: j  reason: collision with root package name */
    public final CheckBox f28415j;

    /* renamed from: k  reason: collision with root package name */
    public final rc f28416k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f28417l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f28418m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f28419n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f28420o;

    /* renamed from: p  reason: collision with root package name */
    public final AppCompatSpinner f28421p;

    /* renamed from: q  reason: collision with root package name */
    public final AppCompatSpinner f28422q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f28423r;

    /* renamed from: s  reason: collision with root package name */
    public final MyTextView f28424s;

    /* renamed from: t  reason: collision with root package name */
    public final AppCompatTextView f28425t;

    /* renamed from: u  reason: collision with root package name */
    public final AppCompatTextView f28426u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f28427v;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatTextView f28428w;

    private r9(ConstraintLayout constraintLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, AppCompatTextView appCompatTextView, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, rc rcVar, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, MyTextView myTextView9, AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, MyTextView myTextView10, MyTextView myTextView11, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, MyTextView myTextView12, AppCompatTextView appCompatTextView4) {
        this.f28406a = constraintLayout;
        this.f28407b = myTextView;
        this.f28408c = myTextView2;
        this.f28409d = myTextView3;
        this.f28410e = myTextView4;
        this.f28411f = myTextView5;
        this.f28412g = appCompatTextView;
        this.f28413h = checkBox;
        this.f28414i = checkBox2;
        this.f28415j = checkBox3;
        this.f28416k = rcVar;
        this.f28417l = myTextView6;
        this.f28418m = myTextView7;
        this.f28419n = myTextView8;
        this.f28420o = myTextView9;
        this.f28421p = appCompatSpinner;
        this.f28422q = appCompatSpinner2;
        this.f28423r = myTextView10;
        this.f28424s = myTextView11;
        this.f28425t = appCompatTextView2;
        this.f28426u = appCompatTextView3;
        this.f28427v = myTextView12;
        this.f28428w = appCompatTextView4;
    }

    public static r9 a(View view) {
        View view2 = view;
        int i10 = R.id.applicantName;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.applicantName);
        if (myTextView != null) {
            i10 = R.id.applicantNameTl;
            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.applicantNameTl);
            if (myTextView2 != null) {
                i10 = R.id.applicationDate;
                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.applicationDate);
                if (myTextView3 != null) {
                    i10 = R.id.applicationDateTl;
                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.applicationDateTl);
                    if (myTextView4 != null) {
                        i10 = R.id.applicationNo;
                        MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.applicationNo);
                        if (myTextView5 != null) {
                            i10 = R.id.cancelTv;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.cancelTv);
                            if (appCompatTextView != null) {
                                i10 = R.id.checkBox;
                                CheckBox checkBox = (CheckBox) a.a(view2, R.id.checkBox);
                                if (checkBox != null) {
                                    i10 = R.id.check_duplDL;
                                    CheckBox checkBox2 = (CheckBox) a.a(view2, R.id.check_duplDL);
                                    if (checkBox2 != null) {
                                        i10 = R.id.check_renewalDL;
                                        CheckBox checkBox3 = (CheckBox) a.a(view2, R.id.check_renewalDL);
                                        if (checkBox3 != null) {
                                            i10 = R.id.include3;
                                            View a10 = a.a(view2, R.id.include3);
                                            if (a10 != null) {
                                                rc a11 = rc.a(a10);
                                                i10 = R.id.myApplicationNoTl;
                                                MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.myApplicationNoTl);
                                                if (myTextView6 != null) {
                                                    i10 = R.id.reason_remarkTl;
                                                    MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.reason_remarkTl);
                                                    if (myTextView7 != null) {
                                                        i10 = R.id.rtoName;
                                                        MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.rtoName);
                                                        if (myTextView8 != null) {
                                                            i10 = R.id.rtoNameTl;
                                                            MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.rtoNameTl);
                                                            if (myTextView9 != null) {
                                                                i10 = R.id.spinner_duplDL;
                                                                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) a.a(view2, R.id.spinner_duplDL);
                                                                if (appCompatSpinner != null) {
                                                                    i10 = R.id.spinner_renewalDL;
                                                                    AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) a.a(view2, R.id.spinner_renewalDL);
                                                                    if (appCompatSpinner2 != null) {
                                                                        i10 = R.id.stateName;
                                                                        MyTextView myTextView10 = (MyTextView) a.a(view2, R.id.stateName);
                                                                        if (myTextView10 != null) {
                                                                            i10 = R.id.stateNameTl;
                                                                            MyTextView myTextView11 = (MyTextView) a.a(view2, R.id.stateNameTl);
                                                                            if (myTextView11 != null) {
                                                                                i10 = R.id.topTitleTv;
                                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.topTitleTv);
                                                                                if (appCompatTextView2 != null) {
                                                                                    i10 = R.id.trans_applied_TitleTv;
                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.trans_applied_TitleTv);
                                                                                    if (appCompatTextView3 != null) {
                                                                                        i10 = R.id.transNameTl;
                                                                                        MyTextView myTextView12 = (MyTextView) a.a(view2, R.id.transNameTl);
                                                                                        if (myTextView12 != null) {
                                                                                            i10 = R.id.withDrawTv;
                                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) a.a(view2, R.id.withDrawTv);
                                                                                            if (appCompatTextView4 != null) {
                                                                                                return new r9((ConstraintLayout) view2, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, appCompatTextView, checkBox, checkBox2, checkBox3, a11, myTextView6, myTextView7, myTextView8, myTextView9, appCompatSpinner, appCompatSpinner2, myTextView10, myTextView11, appCompatTextView2, appCompatTextView3, myTextView12, appCompatTextView4);
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

    public static r9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static r9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_withdraw_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f28406a;
    }
}
