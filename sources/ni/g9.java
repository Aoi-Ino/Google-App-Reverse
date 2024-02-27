package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class g9 {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f26504a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f26505b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f26506c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f26507d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f26508e;

    /* renamed from: f  reason: collision with root package name */
    public final rc f26509f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f26510g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f26511h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f26512i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f26513j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f26514k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f26515l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f26516m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f26517n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f26518o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f26519p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f26520q;

    private g9(ConstraintLayout constraintLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, rc rcVar, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, AppCompatTextView appCompatTextView, MyTextView myTextView8, MyTextView myTextView9, MyTextView myTextView10, MyTextView myTextView11, MyTextView myTextView12, MyTextView myTextView13, MyTextView myTextView14) {
        this.f26504a = constraintLayout;
        this.f26505b = myTextView;
        this.f26506c = myTextView2;
        this.f26507d = myTextView3;
        this.f26508e = myTextView4;
        this.f26509f = rcVar;
        this.f26510g = myTextView5;
        this.f26511h = myTextView6;
        this.f26512i = myTextView7;
        this.f26513j = appCompatTextView;
        this.f26514k = myTextView8;
        this.f26515l = myTextView9;
        this.f26516m = myTextView10;
        this.f26517n = myTextView11;
        this.f26518o = myTextView12;
        this.f26519p = myTextView13;
        this.f26520q = myTextView14;
    }

    public static g9 a(View view) {
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
                        i10 = R.id.include3;
                        View a10 = a.a(view2, R.id.include3);
                        if (a10 != null) {
                            rc a11 = rc.a(a10);
                            i10 = R.id.myApplicationNoTl;
                            MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.myApplicationNoTl);
                            if (myTextView5 != null) {
                                i10 = R.id.receiptdate;
                                MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.receiptdate);
                                if (myTextView6 != null) {
                                    i10 = R.id.receiptno;
                                    MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.receiptno);
                                    if (myTextView7 != null) {
                                        i10 = R.id.topTitleTv;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.topTitleTv);
                                        if (appCompatTextView != null) {
                                            i10 = R.id.transactionname;
                                            MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.transactionname);
                                            if (myTextView8 != null) {
                                                i10 = R.id.tv_amount;
                                                MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.tv_amount);
                                                if (myTextView9 != null) {
                                                    i10 = R.id.tv_receiptdate;
                                                    MyTextView myTextView10 = (MyTextView) a.a(view2, R.id.tv_receiptdate);
                                                    if (myTextView10 != null) {
                                                        i10 = R.id.tv_receiptno;
                                                        MyTextView myTextView11 = (MyTextView) a.a(view2, R.id.tv_receiptno);
                                                        if (myTextView11 != null) {
                                                            i10 = R.id.tv_transactionname;
                                                            MyTextView myTextView12 = (MyTextView) a.a(view2, R.id.tv_transactionname);
                                                            if (myTextView12 != null) {
                                                                i10 = R.id.tvvehicleno;
                                                                MyTextView myTextView13 = (MyTextView) a.a(view2, R.id.tvvehicleno);
                                                                if (myTextView13 != null) {
                                                                    i10 = R.id.vehicleno;
                                                                    MyTextView myTextView14 = (MyTextView) a.a(view2, R.id.vehicleno);
                                                                    if (myTextView14 != null) {
                                                                        return new g9((ConstraintLayout) view2, myTextView, myTextView2, myTextView3, myTextView4, a11, myTextView5, myTextView6, myTextView7, appCompatTextView, myTextView8, myTextView9, myTextView10, myTextView11, myTextView12, myTextView13, myTextView14);
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

    public static g9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static g9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vehicle_transcation, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f26504a;
    }
}
