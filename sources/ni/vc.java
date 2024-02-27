package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class vc {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f29063a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f29064b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f29065c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f29066d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatTextView f29067e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatTextView f29068f;

    /* renamed from: g  reason: collision with root package name */
    public final CheckedTextView f29069g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatTextView f29070h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f29071i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f29072j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f29073k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatTextView f29074l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f29075m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatTextView f29076n;

    /* renamed from: o  reason: collision with root package name */
    public final CheckedTextView f29077o;

    /* renamed from: p  reason: collision with root package name */
    public final AppCompatTextView f29078p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f29079q;

    /* renamed from: r  reason: collision with root package name */
    public final AppCompatTextView f29080r;

    /* renamed from: s  reason: collision with root package name */
    public final View f29081s;

    /* renamed from: t  reason: collision with root package name */
    public final ProgressBar f29082t;

    /* renamed from: u  reason: collision with root package name */
    public final CheckedTextView f29083u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f29084v;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatTextView f29085w;

    /* renamed from: x  reason: collision with root package name */
    public final AppCompatTextView f29086x;

    /* renamed from: y  reason: collision with root package name */
    public final qd f29087y;

    /* renamed from: z  reason: collision with root package name */
    public final View f29088z;

    private vc(RelativeLayout relativeLayout, MyTextView myTextView, AppCompatTextView appCompatTextView, MyTextView myTextView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, CheckedTextView checkedTextView, AppCompatTextView appCompatTextView4, MyTextView myTextView3, AppCompatTextView appCompatTextView5, MyTextView myTextView4, AppCompatTextView appCompatTextView6, MyTextView myTextView5, AppCompatTextView appCompatTextView7, CheckedTextView checkedTextView2, AppCompatTextView appCompatTextView8, MyTextView myTextView6, AppCompatTextView appCompatTextView9, View view, ProgressBar progressBar, CheckedTextView checkedTextView3, MyTextView myTextView7, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, qd qdVar, View view2) {
        this.f29063a = relativeLayout;
        this.f29064b = myTextView;
        this.f29065c = appCompatTextView;
        this.f29066d = myTextView2;
        this.f29067e = appCompatTextView2;
        this.f29068f = appCompatTextView3;
        this.f29069g = checkedTextView;
        this.f29070h = appCompatTextView4;
        this.f29071i = myTextView3;
        this.f29072j = appCompatTextView5;
        this.f29073k = myTextView4;
        this.f29074l = appCompatTextView6;
        this.f29075m = myTextView5;
        this.f29076n = appCompatTextView7;
        this.f29077o = checkedTextView2;
        this.f29078p = appCompatTextView8;
        this.f29079q = myTextView6;
        this.f29080r = appCompatTextView9;
        this.f29081s = view;
        this.f29082t = progressBar;
        this.f29083u = checkedTextView3;
        this.f29084v = myTextView7;
        this.f29085w = appCompatTextView10;
        this.f29086x = appCompatTextView11;
        this.f29087y = qdVar;
        this.f29088z = view2;
    }

    public static vc a(View view) {
        View view2 = view;
        int i10 = R.id.amountTv;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.amountTv);
        if (myTextView != null) {
            i10 = R.id.amountValue;
            AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.amountValue);
            if (appCompatTextView != null) {
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
                                    i10 = R.id.challanTv;
                                    MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.challanTv);
                                    if (myTextView3 != null) {
                                        i10 = R.id.challanValue;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) a.a(view2, R.id.challanValue);
                                        if (appCompatTextView5 != null) {
                                            i10 = R.id.dlRcNoTv;
                                            MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.dlRcNoTv);
                                            if (myTextView4 != null) {
                                                i10 = R.id.dlRcValue;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) a.a(view2, R.id.dlRcValue);
                                                if (appCompatTextView6 != null) {
                                                    i10 = R.id.ownerNameTv;
                                                    MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.ownerNameTv);
                                                    if (myTextView5 != null) {
                                                        i10 = R.id.ownerNameValue;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) a.a(view2, R.id.ownerNameValue);
                                                        if (appCompatTextView7 != null) {
                                                            i10 = R.id.paymentCb;
                                                            CheckedTextView checkedTextView2 = (CheckedTextView) a.a(view2, R.id.paymentCb);
                                                            if (checkedTextView2 != null) {
                                                                i10 = R.id.paymentReceiptTv;
                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) a.a(view2, R.id.paymentReceiptTv);
                                                                if (appCompatTextView8 != null) {
                                                                    i10 = R.id.paymentStatusTv;
                                                                    MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.paymentStatusTv);
                                                                    if (myTextView6 != null) {
                                                                        i10 = R.id.paymentStatusValue;
                                                                        AppCompatTextView appCompatTextView9 = (AppCompatTextView) a.a(view2, R.id.paymentStatusValue);
                                                                        if (appCompatTextView9 != null) {
                                                                            i10 = R.id.paymentView;
                                                                            View a10 = a.a(view2, R.id.paymentView);
                                                                            if (a10 != null) {
                                                                                i10 = R.id.progressBar;
                                                                                ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.progressBar);
                                                                                if (progressBar != null) {
                                                                                    i10 = R.id.receiptCb;
                                                                                    CheckedTextView checkedTextView3 = (CheckedTextView) a.a(view2, R.id.receiptCb);
                                                                                    if (checkedTextView3 != null) {
                                                                                        i10 = R.id.stateTv;
                                                                                        MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.stateTv);
                                                                                        if (myTextView7 != null) {
                                                                                            i10 = R.id.stateValue;
                                                                                            AppCompatTextView appCompatTextView10 = (AppCompatTextView) a.a(view2, R.id.stateValue);
                                                                                            if (appCompatTextView10 != null) {
                                                                                                i10 = R.id.titleTv;
                                                                                                AppCompatTextView appCompatTextView11 = (AppCompatTextView) a.a(view2, R.id.titleTv);
                                                                                                if (appCompatTextView11 != null) {
                                                                                                    i10 = R.id.topHolder;
                                                                                                    View a11 = a.a(view2, R.id.topHolder);
                                                                                                    if (a11 != null) {
                                                                                                        qd a12 = qd.a(a11);
                                                                                                        i10 = R.id.view2;
                                                                                                        View a13 = a.a(view2, R.id.view2);
                                                                                                        if (a13 != null) {
                                                                                                            return new vc((RelativeLayout) view2, myTextView, appCompatTextView, myTextView2, appCompatTextView2, appCompatTextView3, checkedTextView, appCompatTextView4, myTextView3, appCompatTextView5, myTextView4, appCompatTextView6, myTextView5, appCompatTextView7, checkedTextView2, appCompatTextView8, myTextView6, appCompatTextView9, a10, progressBar, checkedTextView3, myTextView7, appCompatTextView10, appCompatTextView11, a12, a13);
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

    public static vc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static vc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.search_challan_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f29063a;
    }
}
