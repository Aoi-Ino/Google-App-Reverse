package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class b7 {
    public final AppCompatTextView A;
    public final MyTextView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final qd E;

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f25450a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f25451b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f25452c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25453d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f25454e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatTextView f25455f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatTextView f25456g;

    /* renamed from: h  reason: collision with root package name */
    public final CheckedTextView f25457h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f25458i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f25459j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f25460k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatTextView f25461l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f25462m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatTextView f25463n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f25464o;

    /* renamed from: p  reason: collision with root package name */
    public final AppCompatTextView f25465p;

    /* renamed from: q  reason: collision with root package name */
    public final AppCompatTextView f25466q;

    /* renamed from: r  reason: collision with root package name */
    public final CheckedTextView f25467r;

    /* renamed from: s  reason: collision with root package name */
    public final RelativeLayout f25468s;

    /* renamed from: t  reason: collision with root package name */
    public final MyTextView f25469t;

    /* renamed from: u  reason: collision with root package name */
    public final AppCompatTextView f25470u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f25471v;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatTextView f25472w;

    /* renamed from: x  reason: collision with root package name */
    public final View f25473x;

    /* renamed from: y  reason: collision with root package name */
    public final ProgressBar f25474y;

    /* renamed from: z  reason: collision with root package name */
    public final CheckedTextView f25475z;

    private b7(RelativeLayout relativeLayout, MyTextView myTextView, AppCompatTextView appCompatTextView, LinearLayout linearLayout, MyTextView myTextView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, CheckedTextView checkedTextView, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, MyTextView myTextView3, AppCompatTextView appCompatTextView6, MyTextView myTextView4, AppCompatTextView appCompatTextView7, MyTextView myTextView5, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, CheckedTextView checkedTextView2, RelativeLayout relativeLayout2, MyTextView myTextView6, AppCompatTextView appCompatTextView10, MyTextView myTextView7, AppCompatTextView appCompatTextView11, View view, ProgressBar progressBar, CheckedTextView checkedTextView3, AppCompatTextView appCompatTextView12, MyTextView myTextView8, AppCompatTextView appCompatTextView13, AppCompatTextView appCompatTextView14, qd qdVar) {
        this.f25450a = relativeLayout;
        this.f25451b = myTextView;
        this.f25452c = appCompatTextView;
        this.f25453d = linearLayout;
        this.f25454e = myTextView2;
        this.f25455f = appCompatTextView2;
        this.f25456g = appCompatTextView3;
        this.f25457h = checkedTextView;
        this.f25458i = appCompatTextView4;
        this.f25459j = appCompatTextView5;
        this.f25460k = myTextView3;
        this.f25461l = appCompatTextView6;
        this.f25462m = myTextView4;
        this.f25463n = appCompatTextView7;
        this.f25464o = myTextView5;
        this.f25465p = appCompatTextView8;
        this.f25466q = appCompatTextView9;
        this.f25467r = checkedTextView2;
        this.f25468s = relativeLayout2;
        this.f25469t = myTextView6;
        this.f25470u = appCompatTextView10;
        this.f25471v = myTextView7;
        this.f25472w = appCompatTextView11;
        this.f25473x = view;
        this.f25474y = progressBar;
        this.f25475z = checkedTextView3;
        this.A = appCompatTextView12;
        this.B = myTextView8;
        this.C = appCompatTextView13;
        this.D = appCompatTextView14;
        this.E = qdVar;
    }

    public static b7 a(View view) {
        View view2 = view;
        int i10 = R.id.amountTv;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.amountTv);
        if (myTextView != null) {
            i10 = R.id.amountValue;
            AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.amountValue);
            if (appCompatTextView != null) {
                i10 = R.id.bottomBtnHolderLl;
                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.bottomBtnHolderLl);
                if (linearLayout != null) {
                    i10 = R.id.challanDateTv;
                    MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.challanDateTv);
                    if (myTextView2 != null) {
                        i10 = R.id.challanDateValue;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.challanDateValue);
                        if (appCompatTextView2 != null) {
                            i10 = R.id.challanDetailTv;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.challanDetailTv);
                            if (appCompatTextView3 != null) {
                                i10 = R.id.challanDetailsCb;
                                CheckedTextView checkedTextView = (CheckedTextView) a.a(view2, R.id.challanDetailsCb);
                                if (checkedTextView != null) {
                                    i10 = R.id.challanPrint1Tv;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) a.a(view2, R.id.challanPrint1Tv);
                                    if (appCompatTextView4 != null) {
                                        i10 = R.id.challanPrintTv;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) a.a(view2, R.id.challanPrintTv);
                                        if (appCompatTextView5 != null) {
                                            i10 = R.id.challanTv;
                                            MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.challanTv);
                                            if (myTextView3 != null) {
                                                i10 = R.id.challanValue;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) a.a(view2, R.id.challanValue);
                                                if (appCompatTextView6 != null) {
                                                    i10 = R.id.dlRcNoTv;
                                                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.dlRcNoTv);
                                                    if (myTextView4 != null) {
                                                        i10 = R.id.dlRcValue;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) a.a(view2, R.id.dlRcValue);
                                                        if (appCompatTextView7 != null) {
                                                            i10 = R.id.ownerNameTv;
                                                            MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.ownerNameTv);
                                                            if (myTextView5 != null) {
                                                                i10 = R.id.ownerNameValue;
                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) a.a(view2, R.id.ownerNameValue);
                                                                if (appCompatTextView8 != null) {
                                                                    i10 = R.id.payNowTv;
                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) a.a(view2, R.id.payNowTv);
                                                                    if (appCompatTextView9 != null) {
                                                                        i10 = R.id.paymentCb;
                                                                        CheckedTextView checkedTextView2 = (CheckedTextView) a.a(view2, R.id.paymentCb);
                                                                        if (checkedTextView2 != null) {
                                                                            i10 = R.id.paymentDateRl;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) a.a(view2, R.id.paymentDateRl);
                                                                            if (relativeLayout != null) {
                                                                                i10 = R.id.paymentDateTv;
                                                                                MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.paymentDateTv);
                                                                                if (myTextView6 != null) {
                                                                                    i10 = R.id.paymentDateValue;
                                                                                    AppCompatTextView appCompatTextView10 = (AppCompatTextView) a.a(view2, R.id.paymentDateValue);
                                                                                    if (appCompatTextView10 != null) {
                                                                                        i10 = R.id.paymentStatusTv;
                                                                                        MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.paymentStatusTv);
                                                                                        if (myTextView7 != null) {
                                                                                            i10 = R.id.paymentStatusValue;
                                                                                            AppCompatTextView appCompatTextView11 = (AppCompatTextView) a.a(view2, R.id.paymentStatusValue);
                                                                                            if (appCompatTextView11 != null) {
                                                                                                i10 = R.id.paymentView;
                                                                                                View a10 = a.a(view2, R.id.paymentView);
                                                                                                if (a10 != null) {
                                                                                                    i10 = R.id.progressBar;
                                                                                                    ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.progressBar);
                                                                                                    if (progressBar != null) {
                                                                                                        i10 = R.id.receiptCb;
                                                                                                        CheckedTextView checkedTextView3 = (CheckedTextView) a.a(view2, R.id.receiptCb);
                                                                                                        if (checkedTextView3 != null) {
                                                                                                            i10 = R.id.receiptTv;
                                                                                                            AppCompatTextView appCompatTextView12 = (AppCompatTextView) a.a(view2, R.id.receiptTv);
                                                                                                            if (appCompatTextView12 != null) {
                                                                                                                i10 = R.id.stateTv;
                                                                                                                MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.stateTv);
                                                                                                                if (myTextView8 != null) {
                                                                                                                    i10 = R.id.stateValue;
                                                                                                                    AppCompatTextView appCompatTextView13 = (AppCompatTextView) a.a(view2, R.id.stateValue);
                                                                                                                    if (appCompatTextView13 != null) {
                                                                                                                        i10 = R.id.titleTv;
                                                                                                                        AppCompatTextView appCompatTextView14 = (AppCompatTextView) a.a(view2, R.id.titleTv);
                                                                                                                        if (appCompatTextView14 != null) {
                                                                                                                            i10 = R.id.topHolder;
                                                                                                                            View a11 = a.a(view2, R.id.topHolder);
                                                                                                                            if (a11 != null) {
                                                                                                                                return new b7((RelativeLayout) view2, myTextView, appCompatTextView, linearLayout, myTextView2, appCompatTextView2, appCompatTextView3, checkedTextView, appCompatTextView4, appCompatTextView5, myTextView3, appCompatTextView6, myTextView4, appCompatTextView7, myTextView5, appCompatTextView8, appCompatTextView9, checkedTextView2, relativeLayout, myTextView6, appCompatTextView10, myTextView7, appCompatTextView11, a10, progressBar, checkedTextView3, appCompatTextView12, myTextView8, appCompatTextView13, appCompatTextView14, qd.a(a11));
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

    public static b7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static b7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_payment_challan, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f25450a;
    }
}
