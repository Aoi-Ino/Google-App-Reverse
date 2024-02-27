package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class o8 {
    public final TextView A;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f27786a;

    /* renamed from: b  reason: collision with root package name */
    public final dc f27787b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f27788c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f27789d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f27790e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f27791f;

    /* renamed from: g  reason: collision with root package name */
    public final CardView f27792g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f27793h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27794i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27795j;

    /* renamed from: k  reason: collision with root package name */
    public final RecyclerView f27796k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27797l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f27798m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f27799n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f27800o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f27801p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f27802q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f27803r;

    /* renamed from: s  reason: collision with root package name */
    public final ProgressBar f27804s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f27805t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f27806u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f27807v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f27808w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f27809x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f27810y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f27811z;

    private o8(LinearLayout linearLayout, dc dcVar, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, CardView cardView, TextView textView, TextView textView2, TextView textView3, RecyclerView recyclerView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, ProgressBar progressBar, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18) {
        this.f27786a = linearLayout;
        this.f27787b = dcVar;
        this.f27788c = linearLayout2;
        this.f27789d = linearLayout3;
        this.f27790e = linearLayout4;
        this.f27791f = linearLayout5;
        this.f27792g = cardView;
        this.f27793h = textView;
        this.f27794i = textView2;
        this.f27795j = textView3;
        this.f27796k = recyclerView;
        this.f27797l = textView4;
        this.f27798m = textView5;
        this.f27799n = textView6;
        this.f27800o = textView7;
        this.f27801p = textView8;
        this.f27802q = textView9;
        this.f27803r = textView10;
        this.f27804s = progressBar;
        this.f27805t = textView11;
        this.f27806u = textView12;
        this.f27807v = textView13;
        this.f27808w = textView14;
        this.f27809x = textView15;
        this.f27810y = textView16;
        this.f27811z = textView17;
        this.A = textView18;
    }

    public static o8 a(View view) {
        View view2 = view;
        int i10 = R.id.header_acc_dash;
        View a10 = a.a(view2, R.id.header_acc_dash);
        if (a10 != null) {
            dc a11 = dc.a(a10);
            i10 = R.id.ll_comp_history;
            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.ll_comp_history);
            if (linearLayout != null) {
                i10 = R.id.ll_dashboard;
                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.ll_dashboard);
                if (linearLayout2 != null) {
                    i10 = R.id.ll_last_record;
                    LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.ll_last_record);
                    if (linearLayout3 != null) {
                        i10 = R.id.ll_reg_complaint;
                        LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.ll_reg_complaint);
                        if (linearLayout4 != null) {
                            i10 = R.id.ll_statistics;
                            CardView cardView = (CardView) a.a(view2, R.id.ll_statistics);
                            if (cardView != null) {
                                i10 = R.id.logo_compl_hist;
                                TextView textView = (TextView) a.a(view2, R.id.logo_compl_hist);
                                if (textView != null) {
                                    i10 = R.id.logo_dashboard;
                                    TextView textView2 = (TextView) a.a(view2, R.id.logo_dashboard);
                                    if (textView2 != null) {
                                        i10 = R.id.logo_reg_compln;
                                        TextView textView3 = (TextView) a.a(view2, R.id.logo_reg_compln);
                                        if (textView3 != null) {
                                            i10 = R.id.recycler_records;
                                            RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.recycler_records);
                                            if (recyclerView != null) {
                                                i10 = R.id.title_location;
                                                TextView textView4 = (TextView) a.a(view2, R.id.title_location);
                                                if (textView4 != null) {
                                                    i10 = R.id.title_report_violation;
                                                    TextView textView5 = (TextView) a.a(view2, R.id.title_report_violation);
                                                    if (textView5 != null) {
                                                        i10 = R.id.title_statistics;
                                                        TextView textView6 = (TextView) a.a(view2, R.id.title_statistics);
                                                        if (textView6 != null) {
                                                            i10 = R.id.title_status;
                                                            TextView textView7 = (TextView) a.a(view2, R.id.title_status);
                                                            if (textView7 != null) {
                                                                i10 = R.id.title_vehicleno;
                                                                TextView textView8 = (TextView) a.a(view2, R.id.title_vehicleno);
                                                                if (textView8 != null) {
                                                                    i10 = R.id.title_violationDate;
                                                                    TextView textView9 = (TextView) a.a(view2, R.id.title_violationDate);
                                                                    if (textView9 != null) {
                                                                        i10 = R.id.title_violationid;
                                                                        TextView textView10 = (TextView) a.a(view2, R.id.title_violationid);
                                                                        if (textView10 != null) {
                                                                            i10 = R.id.traffic_progress;
                                                                            ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.traffic_progress);
                                                                            if (progressBar != null) {
                                                                                i10 = R.id.txt_traffic_dashboard;
                                                                                TextView textView11 = (TextView) a.a(view2, R.id.txt_traffic_dashboard);
                                                                                if (textView11 != null) {
                                                                                    i10 = R.id.txt_traffic_state;
                                                                                    TextView textView12 = (TextView) a.a(view2, R.id.txt_traffic_state);
                                                                                    if (textView12 != null) {
                                                                                        i10 = R.id.txt_vehicle_number;
                                                                                        TextView textView13 = (TextView) a.a(view2, R.id.txt_vehicle_number);
                                                                                        if (textView13 != null) {
                                                                                            i10 = R.id.txt_view_details;
                                                                                            TextView textView14 = (TextView) a.a(view2, R.id.txt_view_details);
                                                                                            if (textView14 != null) {
                                                                                                i10 = R.id.txt_violation_date;
                                                                                                TextView textView15 = (TextView) a.a(view2, R.id.txt_violation_date);
                                                                                                if (textView15 != null) {
                                                                                                    i10 = R.id.txt_violation_id;
                                                                                                    TextView textView16 = (TextView) a.a(view2, R.id.txt_violation_id);
                                                                                                    if (textView16 != null) {
                                                                                                        i10 = R.id.txt_violation_location;
                                                                                                        TextView textView17 = (TextView) a.a(view2, R.id.txt_violation_location);
                                                                                                        if (textView17 != null) {
                                                                                                            i10 = R.id.txt_violation_status;
                                                                                                            TextView textView18 = (TextView) a.a(view2, R.id.txt_violation_status);
                                                                                                            if (textView18 != null) {
                                                                                                                return new o8((LinearLayout) view2, a11, linearLayout, linearLayout2, linearLayout3, linearLayout4, cardView, textView, textView2, textView3, recyclerView, textView4, textView5, textView6, textView7, textView8, textView9, textView10, progressBar, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18);
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

    public static o8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static o8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_traffic_dashboard, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f27786a;
    }
}
