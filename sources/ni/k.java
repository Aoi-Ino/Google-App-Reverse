package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f27035a;

    /* renamed from: b  reason: collision with root package name */
    public final ProgressBar f27036b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f27037c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f27038d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f27039e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f27040f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f27041g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f27042h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27043i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f27044j;

    /* renamed from: k  reason: collision with root package name */
    public final rc f27045k;

    /* renamed from: l  reason: collision with root package name */
    public final ConstraintLayout f27046l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f27047m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f27048n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f27049o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f27050p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f27051q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f27052r;

    /* renamed from: s  reason: collision with root package name */
    public final MyTextView f27053s;

    /* renamed from: t  reason: collision with root package name */
    public final AppCompatTextView f27054t;

    /* renamed from: u  reason: collision with root package name */
    public final AppCompatTextView f27055u;

    private k(ConstraintLayout constraintLayout, ProgressBar progressBar, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, TextView textView, TextView textView2, MyTextView myTextView6, rc rcVar, ConstraintLayout constraintLayout2, LinearLayout linearLayout, MyTextView myTextView7, MyTextView myTextView8, MyTextView myTextView9, MyTextView myTextView10, MyTextView myTextView11, MyTextView myTextView12, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27035a = constraintLayout;
        this.f27036b = progressBar;
        this.f27037c = myTextView;
        this.f27038d = myTextView2;
        this.f27039e = myTextView3;
        this.f27040f = myTextView4;
        this.f27041g = myTextView5;
        this.f27042h = textView;
        this.f27043i = textView2;
        this.f27044j = myTextView6;
        this.f27045k = rcVar;
        this.f27046l = constraintLayout2;
        this.f27047m = linearLayout;
        this.f27048n = myTextView7;
        this.f27049o = myTextView8;
        this.f27050p = myTextView9;
        this.f27051q = myTextView10;
        this.f27052r = myTextView11;
        this.f27053s = myTextView12;
        this.f27054t = appCompatTextView;
        this.f27055u = appCompatTextView2;
    }

    public static k a(View view) {
        View view2 = view;
        int i10 = R.id.app_prog;
        ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.app_prog);
        if (progressBar != null) {
            i10 = R.id.applicantName;
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
                                i10 = R.id.btnCancel;
                                TextView textView = (TextView) a.a(view2, R.id.btnCancel);
                                if (textView != null) {
                                    i10 = R.id.btnConfirm;
                                    TextView textView2 = (TextView) a.a(view2, R.id.btnConfirm);
                                    if (textView2 != null) {
                                        i10 = R.id.duplicateDLTl;
                                        MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.duplicateDLTl);
                                        if (myTextView6 != null) {
                                            i10 = R.id.include3;
                                            View a10 = a.a(view2, R.id.include3);
                                            if (a10 != null) {
                                                rc a11 = rc.a(a10);
                                                i10 = R.id.layout;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view2, R.id.layout);
                                                if (constraintLayout != null) {
                                                    i10 = R.id.layoutbottom;
                                                    LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.layoutbottom);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.myApplicationNoTl;
                                                        MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.myApplicationNoTl);
                                                        if (myTextView7 != null) {
                                                            i10 = R.id.renewalDLTl;
                                                            MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.renewalDLTl);
                                                            if (myTextView8 != null) {
                                                                i10 = R.id.rtoName;
                                                                MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.rtoName);
                                                                if (myTextView9 != null) {
                                                                    i10 = R.id.rtoNameTl;
                                                                    MyTextView myTextView10 = (MyTextView) a.a(view2, R.id.rtoNameTl);
                                                                    if (myTextView10 != null) {
                                                                        i10 = R.id.stateName;
                                                                        MyTextView myTextView11 = (MyTextView) a.a(view2, R.id.stateName);
                                                                        if (myTextView11 != null) {
                                                                            i10 = R.id.stateNameTl;
                                                                            MyTextView myTextView12 = (MyTextView) a.a(view2, R.id.stateNameTl);
                                                                            if (myTextView12 != null) {
                                                                                i10 = R.id.topTitleTv;
                                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.topTitleTv);
                                                                                if (appCompatTextView != null) {
                                                                                    i10 = R.id.trans_applied_TitleTv;
                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.trans_applied_TitleTv);
                                                                                    if (appCompatTextView2 != null) {
                                                                                        return new k((ConstraintLayout) view2, progressBar, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, textView, textView2, myTextView6, a11, constraintLayout, linearLayout, myTextView7, myTextView8, myTextView9, myTextView10, myTextView11, myTextView12, appCompatTextView, appCompatTextView2);
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

    public static k c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static k d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_app_details_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f27035a;
    }
}
