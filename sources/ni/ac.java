package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class ac {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f25325a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f25326b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25327c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25328d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25329e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25330f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25331g;

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f25332h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25333i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25334j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25335k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f25336l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25337m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25338n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f25339o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f25340p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f25341q;

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f25342r;

    /* renamed from: s  reason: collision with root package name */
    public final gb f25343s;

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f25344t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f25345u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f25346v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f25347w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f25348x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f25349y;

    /* renamed from: z  reason: collision with root package name */
    public final qd f25350z;

    private ac(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout3, RecyclerView recyclerView, LinearLayout linearLayout4, TextView textView5, TextView textView6, LinearLayout linearLayout5, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, LinearLayout linearLayout6, gb gbVar, LinearLayout linearLayout7, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, qd qdVar, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24) {
        this.f25325a = linearLayout;
        this.f25326b = linearLayout2;
        this.f25327c = textView;
        this.f25328d = textView2;
        this.f25329e = textView3;
        this.f25330f = textView4;
        this.f25331g = linearLayout3;
        this.f25332h = recyclerView;
        this.f25333i = linearLayout4;
        this.f25334j = textView5;
        this.f25335k = textView6;
        this.f25336l = linearLayout5;
        this.f25337m = textView7;
        this.f25338n = textView8;
        this.f25339o = textView9;
        this.f25340p = textView10;
        this.f25341q = textView11;
        this.f25342r = linearLayout6;
        this.f25343s = gbVar;
        this.f25344t = linearLayout7;
        this.f25345u = textView12;
        this.f25346v = textView13;
        this.f25347w = textView14;
        this.f25348x = textView15;
        this.f25349y = textView16;
        this.f25350z = qdVar;
        this.A = textView17;
        this.B = textView18;
        this.C = textView19;
        this.D = textView20;
        this.E = textView21;
        this.F = textView22;
        this.G = textView23;
        this.H = textView24;
    }

    public static ac a(View view) {
        View view2 = view;
        int i10 = R.id.address_layout;
        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.address_layout);
        if (linearLayout != null) {
            i10 = R.id.current_address;
            TextView textView = (TextView) a.a(view2, R.id.current_address);
            if (textView != null) {
                i10 = R.id.fee_amount;
                TextView textView2 = (TextView) a.a(view2, R.id.fee_amount);
                if (textView2 != null) {
                    i10 = R.id.fee_amount_txt;
                    TextView textView3 = (TextView) a.a(view2, R.id.fee_amount_txt);
                    if (textView3 != null) {
                        i10 = R.id.fee_details;
                        TextView textView4 = (TextView) a.a(view2, R.id.fee_details);
                        if (textView4 != null) {
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
                                        TextView textView5 = (TextView) a.a(view2, R.id.fine_amount);
                                        if (textView5 != null) {
                                            i10 = R.id.fine_amount_txt;
                                            TextView textView6 = (TextView) a.a(view2, R.id.fine_amount_txt);
                                            if (textView6 != null) {
                                                i10 = R.id.linear_parent;
                                                LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.linear_parent);
                                                if (linearLayout4 != null) {
                                                    i10 = R.id.new_current_address;
                                                    TextView textView7 = (TextView) a.a(view2, R.id.new_current_address);
                                                    if (textView7 != null) {
                                                        i10 = R.id.new_permanent_address;
                                                        TextView textView8 = (TextView) a.a(view2, R.id.new_permanent_address);
                                                        if (textView8 != null) {
                                                            i10 = R.id.permenent_address;
                                                            TextView textView9 = (TextView) a.a(view2, R.id.permenent_address);
                                                            if (textView9 != null) {
                                                                i10 = R.id.postal_Charge;
                                                                TextView textView10 = (TextView) a.a(view2, R.id.postal_Charge);
                                                                if (textView10 != null) {
                                                                    i10 = R.id.postal_dec;
                                                                    TextView textView11 = (TextView) a.a(view2, R.id.postal_dec);
                                                                    if (textView11 != null) {
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
                                                                                    TextView textView12 = (TextView) a.a(view2, R.id.serviceCharges);
                                                                                    if (textView12 != null) {
                                                                                        i10 = R.id.serviceCharges_title;
                                                                                        TextView textView13 = (TextView) a.a(view2, R.id.serviceCharges_title);
                                                                                        if (textView13 != null) {
                                                                                            i10 = R.id.service_title;
                                                                                            TextView textView14 = (TextView) a.a(view2, R.id.service_title);
                                                                                            if (textView14 != null) {
                                                                                                i10 = R.id.skip_to_dms;
                                                                                                TextView textView15 = (TextView) a.a(view2, R.id.skip_to_dms);
                                                                                                if (textView15 != null) {
                                                                                                    i10 = R.id.submit_cod;
                                                                                                    TextView textView16 = (TextView) a.a(view2, R.id.submit_cod);
                                                                                                    if (textView16 != null) {
                                                                                                        i10 = R.id.topHolder;
                                                                                                        View a12 = a.a(view2, R.id.topHolder);
                                                                                                        if (a12 != null) {
                                                                                                            qd a13 = qd.a(a12);
                                                                                                            i10 = R.id.total_amount;
                                                                                                            TextView textView17 = (TextView) a.a(view2, R.id.total_amount);
                                                                                                            if (textView17 != null) {
                                                                                                                i10 = R.id.total_amount_rec;
                                                                                                                TextView textView18 = (TextView) a.a(view2, R.id.total_amount_rec);
                                                                                                                if (textView18 != null) {
                                                                                                                    i10 = R.id.total_amount_txt;
                                                                                                                    TextView textView19 = (TextView) a.a(view2, R.id.total_amount_txt);
                                                                                                                    if (textView19 != null) {
                                                                                                                        i10 = R.id.total_amount_txt_rec;
                                                                                                                        TextView textView20 = (TextView) a.a(view2, R.id.total_amount_txt_rec);
                                                                                                                        if (textView20 != null) {
                                                                                                                            i10 = R.id.tran_dec;
                                                                                                                            TextView textView21 = (TextView) a.a(view2, R.id.tran_dec);
                                                                                                                            if (textView21 != null) {
                                                                                                                                i10 = R.id.trans_Charge;
                                                                                                                                TextView textView22 = (TextView) a.a(view2, R.id.trans_Charge);
                                                                                                                                if (textView22 != null) {
                                                                                                                                    i10 = R.id.vehicle_number;
                                                                                                                                    TextView textView23 = (TextView) a.a(view2, R.id.vehicle_number);
                                                                                                                                    if (textView23 != null) {
                                                                                                                                        i10 = R.id.vehicle_view;
                                                                                                                                        TextView textView24 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                                        if (textView24 != null) {
                                                                                                                                            return new ac((LinearLayout) view2, linearLayout, textView, textView2, textView3, textView4, linearLayout2, recyclerView, linearLayout3, textView5, textView6, linearLayout4, textView7, textView8, textView9, textView10, textView11, linearLayout5, a11, linearLayout6, textView12, textView13, textView14, textView15, textView16, a13, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24);
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

    public static ac c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ac d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.multiservice_feelayout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f25325a;
    }
}
