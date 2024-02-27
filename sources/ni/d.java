package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.nic.mparivahan.R;
import k1.a;

public final class d {
    public final TextView A;
    public final TextView B;
    public final TextView C;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f25794a;

    /* renamed from: b  reason: collision with root package name */
    public final ProgressBar f25795b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialCardView f25796c;

    /* renamed from: d  reason: collision with root package name */
    public final CardView f25797d;

    /* renamed from: e  reason: collision with root package name */
    public final dc f25798e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f25799f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25800g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25801h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25802i;

    /* renamed from: j  reason: collision with root package name */
    public final CardView f25803j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25804k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25805l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25806m;

    /* renamed from: n  reason: collision with root package name */
    public final RecyclerView f25807n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f25808o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f25809p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f25810q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f25811r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f25812s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f25813t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f25814u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f25815v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f25816w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f25817x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f25818y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f25819z;

    private d(LinearLayout linearLayout, ProgressBar progressBar, MaterialCardView materialCardView, CardView cardView, dc dcVar, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, CardView cardView2, TextView textView, TextView textView2, TextView textView3, RecyclerView recyclerView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18) {
        this.f25794a = linearLayout;
        this.f25795b = progressBar;
        this.f25796c = materialCardView;
        this.f25797d = cardView;
        this.f25798e = dcVar;
        this.f25799f = linearLayout2;
        this.f25800g = linearLayout3;
        this.f25801h = linearLayout4;
        this.f25802i = linearLayout5;
        this.f25803j = cardView2;
        this.f25804k = textView;
        this.f25805l = textView2;
        this.f25806m = textView3;
        this.f25807n = recyclerView;
        this.f25808o = textView4;
        this.f25809p = textView5;
        this.f25810q = textView6;
        this.f25811r = textView7;
        this.f25812s = textView8;
        this.f25813t = textView9;
        this.f25814u = textView10;
        this.f25815v = textView11;
        this.f25816w = textView12;
        this.f25817x = textView13;
        this.f25818y = textView14;
        this.f25819z = textView15;
        this.A = textView16;
        this.B = textView17;
        this.C = textView18;
    }

    public static d a(View view) {
        View view2 = view;
        int i10 = R.id.acc_dash_progress;
        ProgressBar progressBar = (ProgressBar) a.a(view2, R.id.acc_dash_progress);
        if (progressBar != null) {
            i10 = R.id.cv_complaint_status;
            MaterialCardView materialCardView = (MaterialCardView) a.a(view2, R.id.cv_complaint_status);
            if (materialCardView != null) {
                i10 = R.id.cv_report_complaint;
                CardView cardView = (CardView) a.a(view2, R.id.cv_report_complaint);
                if (cardView != null) {
                    i10 = R.id.header_acc_dash;
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
                                        CardView cardView2 = (CardView) a.a(view2, R.id.ll_statistics);
                                        if (cardView2 != null) {
                                            i10 = R.id.logo_dashboard;
                                            TextView textView = (TextView) a.a(view2, R.id.logo_dashboard);
                                            if (textView != null) {
                                                i10 = R.id.logo_reg_acc_repo;
                                                TextView textView2 = (TextView) a.a(view2, R.id.logo_reg_acc_repo);
                                                if (textView2 != null) {
                                                    i10 = R.id.logo_repo_acc_hist;
                                                    TextView textView3 = (TextView) a.a(view2, R.id.logo_repo_acc_hist);
                                                    if (textView3 != null) {
                                                        i10 = R.id.recycler_records;
                                                        RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.recycler_records);
                                                        if (recyclerView != null) {
                                                            i10 = R.id.tv_acc_id;
                                                            TextView textView4 = (TextView) a.a(view2, R.id.tv_acc_id);
                                                            if (textView4 != null) {
                                                                i10 = R.id.tv_last_acc_repo;
                                                                TextView textView5 = (TextView) a.a(view2, R.id.tv_last_acc_repo);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.tv_location;
                                                                    TextView textView6 = (TextView) a.a(view2, R.id.tv_location);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.tv_statistics;
                                                                        TextView textView7 = (TextView) a.a(view2, R.id.tv_statistics);
                                                                        if (textView7 != null) {
                                                                            i10 = R.id.tv_status;
                                                                            TextView textView8 = (TextView) a.a(view2, R.id.tv_status);
                                                                            if (textView8 != null) {
                                                                                i10 = R.id.tv_vehicle_no;
                                                                                TextView textView9 = (TextView) a.a(view2, R.id.tv_vehicle_no);
                                                                                if (textView9 != null) {
                                                                                    i10 = R.id.tv_viola_date;
                                                                                    TextView textView10 = (TextView) a.a(view2, R.id.tv_viola_date);
                                                                                    if (textView10 != null) {
                                                                                        i10 = R.id.txt_acc_dashboard;
                                                                                        TextView textView11 = (TextView) a.a(view2, R.id.txt_acc_dashboard);
                                                                                        if (textView11 != null) {
                                                                                            i10 = R.id.txt_acc_id;
                                                                                            TextView textView12 = (TextView) a.a(view2, R.id.txt_acc_id);
                                                                                            if (textView12 != null) {
                                                                                                i10 = R.id.txt_acc_state;
                                                                                                TextView textView13 = (TextView) a.a(view2, R.id.txt_acc_state);
                                                                                                if (textView13 != null) {
                                                                                                    i10 = R.id.txt_vehicle_number;
                                                                                                    TextView textView14 = (TextView) a.a(view2, R.id.txt_vehicle_number);
                                                                                                    if (textView14 != null) {
                                                                                                        i10 = R.id.txt_view_details;
                                                                                                        TextView textView15 = (TextView) a.a(view2, R.id.txt_view_details);
                                                                                                        if (textView15 != null) {
                                                                                                            i10 = R.id.txt_violation_date;
                                                                                                            TextView textView16 = (TextView) a.a(view2, R.id.txt_violation_date);
                                                                                                            if (textView16 != null) {
                                                                                                                i10 = R.id.txt_violation_location;
                                                                                                                TextView textView17 = (TextView) a.a(view2, R.id.txt_violation_location);
                                                                                                                if (textView17 != null) {
                                                                                                                    i10 = R.id.txt_violation_status;
                                                                                                                    TextView textView18 = (TextView) a.a(view2, R.id.txt_violation_status);
                                                                                                                    if (textView18 != null) {
                                                                                                                        return new d((LinearLayout) view2, progressBar, materialCardView, cardView, a11, linearLayout, linearLayout2, linearLayout3, linearLayout4, cardView2, textView, textView2, textView3, recyclerView, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18);
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

    public static d c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static d d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_accident_dashboard, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f25794a;
    }
}
