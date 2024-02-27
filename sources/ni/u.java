package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class u {
    public final MyTextView A;
    public final MyTextView B;
    public final LinearLayout C;
    public final MyTextView D;
    public final MyTextView E;

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f28773a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f28774b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f28775c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f28776d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f28777e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f28778f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f28779g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f28780h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f28781i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f28782j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f28783k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f28784l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f28785m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f28786n;

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f28787o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f28788p;

    /* renamed from: q  reason: collision with root package name */
    public final rc f28789q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f28790r;

    /* renamed from: s  reason: collision with root package name */
    public final MyTextView f28791s;

    /* renamed from: t  reason: collision with root package name */
    public final MyTextView f28792t;

    /* renamed from: u  reason: collision with root package name */
    public final MyTextView f28793u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f28794v;

    /* renamed from: w  reason: collision with root package name */
    public final MyTextView f28795w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f28796x;

    /* renamed from: y  reason: collision with root package name */
    public final AppCompatTextView f28797y;

    /* renamed from: z  reason: collision with root package name */
    public final MyTextView f28798z;

    private u(CoordinatorLayout coordinatorLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, LinearLayout linearLayout, MyTextView myTextView4, MyTextView myTextView5, LinearLayout linearLayout2, LinearLayout linearLayout3, MyTextView myTextView6, MyTextView myTextView7, LinearLayout linearLayout4, LinearLayout linearLayout5, MyTextView myTextView8, LinearLayout linearLayout6, MyTextView myTextView9, rc rcVar, MyTextView myTextView10, MyTextView myTextView11, MyTextView myTextView12, MyTextView myTextView13, MyTextView myTextView14, MyTextView myTextView15, MyTextView myTextView16, AppCompatTextView appCompatTextView, MyTextView myTextView17, MyTextView myTextView18, MyTextView myTextView19, LinearLayout linearLayout7, MyTextView myTextView20, MyTextView myTextView21) {
        this.f28773a = coordinatorLayout;
        this.f28774b = myTextView;
        this.f28775c = myTextView2;
        this.f28776d = myTextView3;
        this.f28777e = linearLayout;
        this.f28778f = myTextView4;
        this.f28779g = myTextView5;
        this.f28780h = linearLayout2;
        this.f28781i = linearLayout3;
        this.f28782j = myTextView6;
        this.f28783k = myTextView7;
        this.f28784l = linearLayout4;
        this.f28785m = linearLayout5;
        this.f28786n = myTextView8;
        this.f28787o = linearLayout6;
        this.f28788p = myTextView9;
        this.f28789q = rcVar;
        this.f28790r = myTextView10;
        this.f28791s = myTextView11;
        this.f28792t = myTextView12;
        this.f28793u = myTextView13;
        this.f28794v = myTextView14;
        this.f28795w = myTextView15;
        this.f28796x = myTextView16;
        this.f28797y = appCompatTextView;
        this.f28798z = myTextView17;
        this.A = myTextView18;
        this.B = myTextView19;
        this.C = linearLayout7;
        this.D = myTextView20;
        this.E = myTextView21;
    }

    public static u a(View view) {
        View view2 = view;
        int i10 = R.id.amount;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.amount);
        if (myTextView != null) {
            i10 = R.id.applicationDate;
            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.applicationDate);
            if (myTextView2 != null) {
                i10 = R.id.challan_amount;
                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.challan_amount);
                if (myTextView3 != null) {
                    i10 = R.id.challan_amount_linear;
                    LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.challan_amount_linear);
                    if (linearLayout != null) {
                        i10 = R.id.challan_date;
                        MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.challan_date);
                        if (myTextView4 != null) {
                            i10 = R.id.challan_number;
                            MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.challan_number);
                            if (myTextView5 != null) {
                                i10 = R.id.challan_paymentdate_linear;
                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.challan_paymentdate_linear);
                                if (linearLayout2 != null) {
                                    i10 = R.id.challan_receipt_linear;
                                    LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.challan_receipt_linear);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.challan_state;
                                        MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.challan_state);
                                        if (myTextView6 != null) {
                                            i10 = R.id.challan_status;
                                            MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.challan_status);
                                            if (myTextView7 != null) {
                                                i10 = R.id.challan_status_linear;
                                                LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.challan_status_linear);
                                                if (linearLayout4 != null) {
                                                    i10 = R.id.challan_transation_linear;
                                                    LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.challan_transation_linear);
                                                    if (linearLayout5 != null) {
                                                        i10 = R.id.dl_number_txt;
                                                        MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.dl_number_txt);
                                                        if (myTextView8 != null) {
                                                            i10 = R.id.driving_linear;
                                                            LinearLayout linearLayout6 = (LinearLayout) a.a(view2, R.id.driving_linear);
                                                            if (linearLayout6 != null) {
                                                                i10 = R.id.drivinglic_no;
                                                                MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.drivinglic_no);
                                                                if (myTextView9 != null) {
                                                                    i10 = R.id.include3;
                                                                    View a10 = a.a(view2, R.id.include3);
                                                                    if (a10 != null) {
                                                                        rc a11 = rc.a(a10);
                                                                        i10 = R.id.offence;
                                                                        MyTextView myTextView10 = (MyTextView) a.a(view2, R.id.offence);
                                                                        if (myTextView10 != null) {
                                                                            i10 = R.id.payment_date;
                                                                            MyTextView myTextView11 = (MyTextView) a.a(view2, R.id.payment_date);
                                                                            if (myTextView11 != null) {
                                                                                i10 = R.id.payment_date_text;
                                                                                MyTextView myTextView12 = (MyTextView) a.a(view2, R.id.payment_date_text);
                                                                                if (myTextView12 != null) {
                                                                                    i10 = R.id.receiptNo;
                                                                                    MyTextView myTextView13 = (MyTextView) a.a(view2, R.id.receiptNo);
                                                                                    if (myTextView13 != null) {
                                                                                        i10 = R.id.receipt_number_Text;
                                                                                        MyTextView myTextView14 = (MyTextView) a.a(view2, R.id.receipt_number_Text);
                                                                                        if (myTextView14 != null) {
                                                                                            i10 = R.id.state;
                                                                                            MyTextView myTextView15 = (MyTextView) a.a(view2, R.id.state);
                                                                                            if (myTextView15 != null) {
                                                                                                i10 = R.id.status;
                                                                                                MyTextView myTextView16 = (MyTextView) a.a(view2, R.id.status);
                                                                                                if (myTextView16 != null) {
                                                                                                    i10 = R.id.topTitleTv;
                                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.topTitleTv);
                                                                                                    if (appCompatTextView != null) {
                                                                                                        i10 = R.id.transation_id;
                                                                                                        MyTextView myTextView17 = (MyTextView) a.a(view2, R.id.transation_id);
                                                                                                        if (myTextView17 != null) {
                                                                                                            i10 = R.id.transation_id_txt;
                                                                                                            MyTextView myTextView18 = (MyTextView) a.a(view2, R.id.transation_id_txt);
                                                                                                            if (myTextView18 != null) {
                                                                                                                i10 = R.id.tvvehicleno;
                                                                                                                MyTextView myTextView19 = (MyTextView) a.a(view2, R.id.tvvehicleno);
                                                                                                                if (myTextView19 != null) {
                                                                                                                    i10 = R.id.vehicle_linear;
                                                                                                                    LinearLayout linearLayout7 = (LinearLayout) a.a(view2, R.id.vehicle_linear);
                                                                                                                    if (linearLayout7 != null) {
                                                                                                                        i10 = R.id.vehicle_number;
                                                                                                                        MyTextView myTextView20 = (MyTextView) a.a(view2, R.id.vehicle_number);
                                                                                                                        if (myTextView20 != null) {
                                                                                                                            i10 = R.id.vehicleno;
                                                                                                                            MyTextView myTextView21 = (MyTextView) a.a(view2, R.id.vehicleno);
                                                                                                                            if (myTextView21 != null) {
                                                                                                                                return new u((CoordinatorLayout) view2, myTextView, myTextView2, myTextView3, linearLayout, myTextView4, myTextView5, linearLayout2, linearLayout3, myTextView6, myTextView7, linearLayout4, linearLayout5, myTextView8, linearLayout6, myTextView9, a11, myTextView10, myTextView11, myTextView12, myTextView13, myTextView14, myTextView15, myTextView16, appCompatTextView, myTextView17, myTextView18, myTextView19, linearLayout7, myTextView20, myTextView21);
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

    public static u c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static u d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_challan_transaction, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f28773a;
    }
}
