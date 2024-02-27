package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class s4 {
    public final TextView A;
    public final qd B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f28503a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f28504b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f28505c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f28506d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f28507e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f28508f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f28509g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f28510h;

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView f28511i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f28512j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f28513k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f28514l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f28515m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f28516n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f28517o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f28518p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f28519q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f28520r;

    /* renamed from: s  reason: collision with root package name */
    public final LinearLayout f28521s;

    /* renamed from: t  reason: collision with root package name */
    public final gb f28522t;

    /* renamed from: u  reason: collision with root package name */
    public final LinearLayout f28523u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f28524v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f28525w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f28526x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f28527y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f28528z;

    private s4(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout3, RecyclerView recyclerView, LinearLayout linearLayout4, TextView textView6, TextView textView7, LinearLayout linearLayout5, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, LinearLayout linearLayout6, gb gbVar, LinearLayout linearLayout7, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, qd qdVar, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26) {
        this.f28503a = linearLayout;
        this.f28504b = linearLayout2;
        this.f28505c = textView;
        this.f28506d = textView2;
        this.f28507e = textView3;
        this.f28508f = textView4;
        this.f28509g = textView5;
        this.f28510h = linearLayout3;
        this.f28511i = recyclerView;
        this.f28512j = linearLayout4;
        this.f28513k = textView6;
        this.f28514l = textView7;
        this.f28515m = linearLayout5;
        this.f28516n = textView8;
        this.f28517o = textView9;
        this.f28518p = textView10;
        this.f28519q = textView11;
        this.f28520r = textView12;
        this.f28521s = linearLayout6;
        this.f28522t = gbVar;
        this.f28523u = linearLayout7;
        this.f28524v = textView13;
        this.f28525w = textView14;
        this.f28526x = textView15;
        this.f28527y = textView16;
        this.f28528z = textView17;
        this.A = textView18;
        this.B = qdVar;
        this.C = textView19;
        this.D = textView20;
        this.E = textView21;
        this.F = textView22;
        this.G = textView23;
        this.H = textView24;
        this.I = textView25;
        this.J = textView26;
    }

    public static s4 a(View view) {
        View view2 = view;
        int i10 = R.id.address_layout;
        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.address_layout);
        if (linearLayout != null) {
            i10 = R.id.current_address;
            TextView textView = (TextView) a.a(view2, R.id.current_address);
            if (textView != null) {
                i10 = R.id.description;
                TextView textView2 = (TextView) a.a(view2, R.id.description);
                if (textView2 != null) {
                    i10 = R.id.fee_amount;
                    TextView textView3 = (TextView) a.a(view2, R.id.fee_amount);
                    if (textView3 != null) {
                        i10 = R.id.fee_amount_txt;
                        TextView textView4 = (TextView) a.a(view2, R.id.fee_amount_txt);
                        if (textView4 != null) {
                            i10 = R.id.fee_details;
                            TextView textView5 = (TextView) a.a(view2, R.id.fee_details);
                            if (textView5 != null) {
                                i10 = R.id.fee_layout;
                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.fee_layout);
                                if (linearLayout2 != null) {
                                    i10 = R.id.feeRecycle;
                                    RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.feeRecycle);
                                    if (recyclerView != null) {
                                        i10 = R.id.fee_recycle_layout;
                                        LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.fee_recycle_layout);
                                        if (linearLayout3 != null) {
                                            i10 = R.id.fine_amount;
                                            TextView textView6 = (TextView) a.a(view2, R.id.fine_amount);
                                            if (textView6 != null) {
                                                i10 = R.id.fine_amount_txt;
                                                TextView textView7 = (TextView) a.a(view2, R.id.fine_amount_txt);
                                                if (textView7 != null) {
                                                    i10 = R.id.linear_parent;
                                                    LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.linear_parent);
                                                    if (linearLayout4 != null) {
                                                        i10 = R.id.new_current_address;
                                                        TextView textView8 = (TextView) a.a(view2, R.id.new_current_address);
                                                        if (textView8 != null) {
                                                            i10 = R.id.new_permanent_address;
                                                            TextView textView9 = (TextView) a.a(view2, R.id.new_permanent_address);
                                                            if (textView9 != null) {
                                                                i10 = R.id.permenent_address;
                                                                TextView textView10 = (TextView) a.a(view2, R.id.permenent_address);
                                                                if (textView10 != null) {
                                                                    i10 = R.id.postal_Charge;
                                                                    TextView textView11 = (TextView) a.a(view2, R.id.postal_Charge);
                                                                    if (textView11 != null) {
                                                                        i10 = R.id.postal_dec;
                                                                        TextView textView12 = (TextView) a.a(view2, R.id.postal_dec);
                                                                        if (textView12 != null) {
                                                                            i10 = R.id.postal_layout;
                                                                            LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.postal_layout);
                                                                            if (linearLayout5 != null) {
                                                                                i10 = R.id.rc_ind;
                                                                                View a10 = a.a(view2, R.id.rc_ind);
                                                                                if (a10 != null) {
                                                                                    gb a11 = gb.a(a10);
                                                                                    i10 = R.id.recycle_under_layout;
                                                                                    LinearLayout linearLayout6 = (LinearLayout) a.a(view2, R.id.recycle_under_layout);
                                                                                    if (linearLayout6 != null) {
                                                                                        i10 = R.id.serviceCharges;
                                                                                        TextView textView13 = (TextView) a.a(view2, R.id.serviceCharges);
                                                                                        if (textView13 != null) {
                                                                                            i10 = R.id.serviceCharges_title;
                                                                                            TextView textView14 = (TextView) a.a(view2, R.id.serviceCharges_title);
                                                                                            if (textView14 != null) {
                                                                                                i10 = R.id.service_name;
                                                                                                TextView textView15 = (TextView) a.a(view2, R.id.service_name);
                                                                                                if (textView15 != null) {
                                                                                                    i10 = R.id.service_title;
                                                                                                    TextView textView16 = (TextView) a.a(view2, R.id.service_title);
                                                                                                    if (textView16 != null) {
                                                                                                        i10 = R.id.skip_to_dms;
                                                                                                        TextView textView17 = (TextView) a.a(view2, R.id.skip_to_dms);
                                                                                                        if (textView17 != null) {
                                                                                                            i10 = R.id.submit_cod;
                                                                                                            TextView textView18 = (TextView) a.a(view2, R.id.submit_cod);
                                                                                                            if (textView18 != null) {
                                                                                                                i10 = R.id.topHolder;
                                                                                                                View a12 = a.a(view2, R.id.topHolder);
                                                                                                                if (a12 != null) {
                                                                                                                    qd a13 = qd.a(a12);
                                                                                                                    i10 = R.id.total_amount;
                                                                                                                    TextView textView19 = (TextView) a.a(view2, R.id.total_amount);
                                                                                                                    if (textView19 != null) {
                                                                                                                        i10 = R.id.total_amount_rec;
                                                                                                                        TextView textView20 = (TextView) a.a(view2, R.id.total_amount_rec);
                                                                                                                        if (textView20 != null) {
                                                                                                                            i10 = R.id.total_amount_txt;
                                                                                                                            TextView textView21 = (TextView) a.a(view2, R.id.total_amount_txt);
                                                                                                                            if (textView21 != null) {
                                                                                                                                i10 = R.id.total_amount_txt_rec;
                                                                                                                                TextView textView22 = (TextView) a.a(view2, R.id.total_amount_txt_rec);
                                                                                                                                if (textView22 != null) {
                                                                                                                                    i10 = R.id.tran_dec;
                                                                                                                                    TextView textView23 = (TextView) a.a(view2, R.id.tran_dec);
                                                                                                                                    if (textView23 != null) {
                                                                                                                                        i10 = R.id.trans_Charge;
                                                                                                                                        TextView textView24 = (TextView) a.a(view2, R.id.trans_Charge);
                                                                                                                                        if (textView24 != null) {
                                                                                                                                            i10 = R.id.vehicle_number;
                                                                                                                                            TextView textView25 = (TextView) a.a(view2, R.id.vehicle_number);
                                                                                                                                            if (textView25 != null) {
                                                                                                                                                i10 = R.id.vehicle_view;
                                                                                                                                                TextView textView26 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                                                if (textView26 != null) {
                                                                                                                                                    return new s4((LinearLayout) view2, linearLayout, textView, textView2, textView3, textView4, textView5, linearLayout2, recyclerView, linearLayout3, textView6, textView7, linearLayout4, textView8, textView9, textView10, textView11, textView12, linearLayout5, a11, linearLayout6, textView13, textView14, textView15, textView16, textView17, textView18, a13, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static s4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static s4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_fees_details_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f28503a;
    }
}
