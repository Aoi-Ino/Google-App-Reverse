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

public final class v6 {
    public final MyTextView A;
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final qd D;

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f28986a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f28987b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f28988c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f28989d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatTextView f28990e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatTextView f28991f;

    /* renamed from: g  reason: collision with root package name */
    public final CheckedTextView f28992g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f28993h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f28994i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f28995j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatTextView f28996k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatTextView f28997l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f28998m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatTextView f28999n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f29000o;

    /* renamed from: p  reason: collision with root package name */
    public final AppCompatTextView f29001p;

    /* renamed from: q  reason: collision with root package name */
    public final AppCompatTextView f29002q;

    /* renamed from: r  reason: collision with root package name */
    public final CheckedTextView f29003r;

    /* renamed from: s  reason: collision with root package name */
    public final RelativeLayout f29004s;

    /* renamed from: t  reason: collision with root package name */
    public final MyTextView f29005t;

    /* renamed from: u  reason: collision with root package name */
    public final AppCompatTextView f29006u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f29007v;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatTextView f29008w;

    /* renamed from: x  reason: collision with root package name */
    public final View f29009x;

    /* renamed from: y  reason: collision with root package name */
    public final ProgressBar f29010y;

    /* renamed from: z  reason: collision with root package name */
    public final CheckedTextView f29011z;

    private v6(RelativeLayout relativeLayout, MyTextView myTextView, AppCompatTextView appCompatTextView, MyTextView myTextView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, CheckedTextView checkedTextView, MyTextView myTextView3, AppCompatTextView appCompatTextView4, MyTextView myTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, MyTextView myTextView5, AppCompatTextView appCompatTextView7, MyTextView myTextView6, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, CheckedTextView checkedTextView2, RelativeLayout relativeLayout2, MyTextView myTextView7, AppCompatTextView appCompatTextView10, MyTextView myTextView8, AppCompatTextView appCompatTextView11, View view, ProgressBar progressBar, CheckedTextView checkedTextView3, MyTextView myTextView9, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, qd qdVar) {
        this.f28986a = relativeLayout;
        this.f28987b = myTextView;
        this.f28988c = appCompatTextView;
        this.f28989d = myTextView2;
        this.f28990e = appCompatTextView2;
        this.f28991f = appCompatTextView3;
        this.f28992g = checkedTextView;
        this.f28993h = myTextView3;
        this.f28994i = appCompatTextView4;
        this.f28995j = myTextView4;
        this.f28996k = appCompatTextView5;
        this.f28997l = appCompatTextView6;
        this.f28998m = myTextView5;
        this.f28999n = appCompatTextView7;
        this.f29000o = myTextView6;
        this.f29001p = appCompatTextView8;
        this.f29002q = appCompatTextView9;
        this.f29003r = checkedTextView2;
        this.f29004s = relativeLayout2;
        this.f29005t = myTextView7;
        this.f29006u = appCompatTextView10;
        this.f29007v = myTextView8;
        this.f29008w = appCompatTextView11;
        this.f29009x = view;
        this.f29010y = progressBar;
        this.f29011z = checkedTextView3;
        this.A = myTextView9;
        this.B = appCompatTextView12;
        this.C = appCompatTextView13;
        this.D = qdVar;
    }

    public static v6 a(View view) {
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
                                i10 = R.id.challanTv;
                                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.challanTv);
                                if (myTextView3 != null) {
                                    i10 = R.id.challanValue;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) a.a(view2, R.id.challanValue);
                                    if (appCompatTextView4 != null) {
                                        i10 = R.id.dlRcNoTv;
                                        MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.dlRcNoTv);
                                        if (myTextView4 != null) {
                                            i10 = R.id.dlRcValue;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) a.a(view2, R.id.dlRcValue);
                                            if (appCompatTextView5 != null) {
                                                i10 = R.id.downloadNoticeTv;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) a.a(view2, R.id.downloadNoticeTv);
                                                if (appCompatTextView6 != null) {
                                                    i10 = R.id.offenceTv;
                                                    MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.offenceTv);
                                                    if (myTextView5 != null) {
                                                        i10 = R.id.offenceValue;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) a.a(view2, R.id.offenceValue);
                                                        if (appCompatTextView7 != null) {
                                                            i10 = R.id.ownerNameTv;
                                                            MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.ownerNameTv);
                                                            if (myTextView6 != null) {
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
                                                                                MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.paymentDateTv);
                                                                                if (myTextView7 != null) {
                                                                                    i10 = R.id.paymentDateValue;
                                                                                    AppCompatTextView appCompatTextView10 = (AppCompatTextView) a.a(view2, R.id.paymentDateValue);
                                                                                    if (appCompatTextView10 != null) {
                                                                                        i10 = R.id.paymentStatusTv;
                                                                                        MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.paymentStatusTv);
                                                                                        if (myTextView8 != null) {
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
                                                                                                            i10 = R.id.stateTv;
                                                                                                            MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.stateTv);
                                                                                                            if (myTextView9 != null) {
                                                                                                                i10 = R.id.stateValue;
                                                                                                                AppCompatTextView appCompatTextView12 = (AppCompatTextView) a.a(view2, R.id.stateValue);
                                                                                                                if (appCompatTextView12 != null) {
                                                                                                                    i10 = R.id.titleTv;
                                                                                                                    AppCompatTextView appCompatTextView13 = (AppCompatTextView) a.a(view2, R.id.titleTv);
                                                                                                                    if (appCompatTextView13 != null) {
                                                                                                                        i10 = R.id.topHolder;
                                                                                                                        View a11 = a.a(view2, R.id.topHolder);
                                                                                                                        if (a11 != null) {
                                                                                                                            return new v6((RelativeLayout) view2, myTextView, appCompatTextView, myTextView2, appCompatTextView2, appCompatTextView3, checkedTextView, myTextView3, appCompatTextView4, myTextView4, appCompatTextView5, appCompatTextView6, myTextView5, appCompatTextView7, myTextView6, appCompatTextView8, appCompatTextView9, checkedTextView2, relativeLayout, myTextView7, appCompatTextView10, myTextView8, appCompatTextView11, a10, progressBar, checkedTextView3, myTextView9, appCompatTextView12, appCompatTextView13, qd.a(a11));
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

    public static v6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static v6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_notice_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f28986a;
    }
}
