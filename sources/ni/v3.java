package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class v3 {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f28959a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f28960b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f28961c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f28962d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f28963e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f28964f;

    /* renamed from: g  reason: collision with root package name */
    public final rc f28965g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f28966h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f28967i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f28968j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatTextView f28969k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f28970l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f28971m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f28972n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f28973o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f28974p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f28975q;

    private v3(ConstraintLayout constraintLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, rc rcVar, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, AppCompatTextView appCompatTextView, MyTextView myTextView9, MyTextView myTextView10, MyTextView myTextView11, MyTextView myTextView12, MyTextView myTextView13, MyTextView myTextView14) {
        this.f28959a = constraintLayout;
        this.f28960b = myTextView;
        this.f28961c = myTextView2;
        this.f28962d = myTextView3;
        this.f28963e = myTextView4;
        this.f28964f = myTextView5;
        this.f28965g = rcVar;
        this.f28966h = myTextView6;
        this.f28967i = myTextView7;
        this.f28968j = myTextView8;
        this.f28969k = appCompatTextView;
        this.f28970l = myTextView9;
        this.f28971m = myTextView10;
        this.f28972n = myTextView11;
        this.f28973o = myTextView12;
        this.f28974p = myTextView13;
        this.f28975q = myTextView14;
    }

    public static v3 a(View view) {
        View view2 = view;
        int i10 = R.id.amount;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.amount);
        if (myTextView != null) {
            i10 = R.id.applicationDate;
            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.applicationDate);
            if (myTextView2 != null) {
                i10 = R.id.applicationDateTl;
                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.applicationDateTl);
                if (myTextView3 != null) {
                    i10 = R.id.applicationNo;
                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.applicationNo);
                    if (myTextView4 != null) {
                        i10 = R.id.drivinglic_no;
                        MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.drivinglic_no);
                        if (myTextView5 != null) {
                            i10 = R.id.include3;
                            View a10 = a.a(view2, R.id.include3);
                            if (a10 != null) {
                                rc a11 = rc.a(a10);
                                i10 = R.id.myApplicationNoTl;
                                MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.myApplicationNoTl);
                                if (myTextView6 != null) {
                                    i10 = R.id.receiptdate;
                                    MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.receiptdate);
                                    if (myTextView7 != null) {
                                        i10 = R.id.receiptno;
                                        MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.receiptno);
                                        if (myTextView8 != null) {
                                            i10 = R.id.topTitleTv;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.topTitleTv);
                                            if (appCompatTextView != null) {
                                                i10 = R.id.transactionname;
                                                MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.transactionname);
                                                if (myTextView9 != null) {
                                                    i10 = R.id.tv_amount;
                                                    MyTextView myTextView10 = (MyTextView) a.a(view2, R.id.tv_amount);
                                                    if (myTextView10 != null) {
                                                        i10 = R.id.tv_receiptdate;
                                                        MyTextView myTextView11 = (MyTextView) a.a(view2, R.id.tv_receiptdate);
                                                        if (myTextView11 != null) {
                                                            i10 = R.id.tv_receiptno;
                                                            MyTextView myTextView12 = (MyTextView) a.a(view2, R.id.tv_receiptno);
                                                            if (myTextView12 != null) {
                                                                i10 = R.id.tv_transactionname;
                                                                MyTextView myTextView13 = (MyTextView) a.a(view2, R.id.tv_transactionname);
                                                                if (myTextView13 != null) {
                                                                    i10 = R.id.tvdrivinglic_no;
                                                                    MyTextView myTextView14 = (MyTextView) a.a(view2, R.id.tvdrivinglic_no);
                                                                    if (myTextView14 != null) {
                                                                        return new v3((ConstraintLayout) view2, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, a11, myTextView6, myTextView7, myTextView8, appCompatTextView, myTextView9, myTextView10, myTextView11, myTextView12, myTextView13, myTextView14);
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

    public static v3 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static v3 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_dl_transaction, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f28959a;
    }
}
