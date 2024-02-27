package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import k1.a;

public final class db {
    public final TextView A;
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final TextView G;
    public final TextView H;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f25929a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f25930b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f25931c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatButton f25932d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f25933e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f25934f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25935g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatTextView f25936h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f25937i;

    /* renamed from: j  reason: collision with root package name */
    public final AppCompatTextView f25938j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatTextView f25939k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatTextView f25940l;

    /* renamed from: m  reason: collision with root package name */
    public final CardView f25941m;

    /* renamed from: n  reason: collision with root package name */
    public final CardView f25942n;

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f25943o;

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f25944p;

    /* renamed from: q  reason: collision with root package name */
    public final kb f25945q;

    /* renamed from: r  reason: collision with root package name */
    public final zd f25946r;

    /* renamed from: s  reason: collision with root package name */
    public final AppCompatTextView f25947s;

    /* renamed from: t  reason: collision with root package name */
    public final AppCompatTextView f25948t;

    /* renamed from: u  reason: collision with root package name */
    public final qd f25949u;

    /* renamed from: v  reason: collision with root package name */
    public final AppCompatTextView f25950v;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatTextView f25951w;

    /* renamed from: x  reason: collision with root package name */
    public final AppCompatTextView f25952x;

    /* renamed from: y  reason: collision with root package name */
    public final AppCompatTextView f25953y;

    /* renamed from: z  reason: collision with root package name */
    public final AppCompatTextView f25954z;

    private db(ScrollView scrollView, TextView textView, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, ImageView imageView, ImageView imageView2, TextView textView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, CardView cardView, CardView cardView2, LinearLayout linearLayout, LinearLayout linearLayout2, kb kbVar, zd zdVar, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, qd qdVar, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, TextView textView3, AppCompatTextView appCompatTextView14, AppCompatTextView appCompatTextView15, AppCompatTextView appCompatTextView16, AppCompatTextView appCompatTextView17, AppCompatTextView appCompatTextView18, TextView textView4, TextView textView5) {
        this.f25929a = scrollView;
        this.f25930b = textView;
        this.f25931c = appCompatTextView;
        this.f25932d = appCompatButton;
        this.f25933e = imageView;
        this.f25934f = imageView2;
        this.f25935g = textView2;
        this.f25936h = appCompatTextView2;
        this.f25937i = appCompatTextView3;
        this.f25938j = appCompatTextView4;
        this.f25939k = appCompatTextView5;
        this.f25940l = appCompatTextView6;
        this.f25941m = cardView;
        this.f25942n = cardView2;
        this.f25943o = linearLayout;
        this.f25944p = linearLayout2;
        this.f25945q = kbVar;
        this.f25946r = zdVar;
        this.f25947s = appCompatTextView7;
        this.f25948t = appCompatTextView8;
        this.f25949u = qdVar;
        this.f25950v = appCompatTextView9;
        this.f25951w = appCompatTextView10;
        this.f25952x = appCompatTextView11;
        this.f25953y = appCompatTextView12;
        this.f25954z = appCompatTextView13;
        this.A = textView3;
        this.B = appCompatTextView14;
        this.C = appCompatTextView15;
        this.D = appCompatTextView16;
        this.E = appCompatTextView17;
        this.F = appCompatTextView18;
        this.G = textView4;
        this.H = textView5;
    }

    public static db a(View view) {
        View view2 = view;
        int i10 = R.id.bankNocDateTv;
        TextView textView = (TextView) a.a(view2, R.id.bankNocDateTv);
        if (textView != null) {
            i10 = R.id.branchAddTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.branchAddTv);
            if (appCompatTextView != null) {
                i10 = R.id.btnSubmit;
                AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btnSubmit);
                if (appCompatButton != null) {
                    i10 = R.id.downArrowHypoDetails;
                    ImageView imageView = (ImageView) a.a(view2, R.id.downArrowHypoDetails);
                    if (imageView != null) {
                        i10 = R.id.downArrowHypoTermination;
                        ImageView imageView2 = (ImageView) a.a(view2, R.id.downArrowHypoTermination);
                        if (imageView2 != null) {
                            i10 = R.id.financeFromDateTv;
                            TextView textView2 = (TextView) a.a(view2, R.id.financeFromDateTv);
                            if (textView2 != null) {
                                i10 = R.id.financerAddTv;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.financerAddTv);
                                if (appCompatTextView2 != null) {
                                    i10 = R.id.financerBranchTv;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.financerBranchTv);
                                    if (appCompatTextView3 != null) {
                                        i10 = R.id.financerNameTv;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) a.a(view2, R.id.financerNameTv);
                                        if (appCompatTextView4 != null) {
                                            i10 = R.id.header_title_hypo_details;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) a.a(view2, R.id.header_title_hypo_details);
                                            if (appCompatTextView5 != null) {
                                                i10 = R.id.header_title_hypo_termination;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) a.a(view2, R.id.header_title_hypo_termination);
                                                if (appCompatTextView6 != null) {
                                                    i10 = R.id.hypoDetailsCv;
                                                    CardView cardView = (CardView) a.a(view2, R.id.hypoDetailsCv);
                                                    if (cardView != null) {
                                                        i10 = R.id.hypoTermDetailsCv;
                                                        CardView cardView2 = (CardView) a.a(view2, R.id.hypoTermDetailsCv);
                                                        if (cardView2 != null) {
                                                            i10 = R.id.layoutHypoDetails;
                                                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.layoutHypoDetails);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.layoutHypoTerm;
                                                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.layoutHypoTerm);
                                                                if (linearLayout2 != null) {
                                                                    i10 = R.id.rc_ind;
                                                                    View a10 = a.a(view2, R.id.rc_ind);
                                                                    if (a10 != null) {
                                                                        kb a11 = kb.a(a10);
                                                                        i10 = R.id.stepper_layout;
                                                                        View a12 = a.a(view2, R.id.stepper_layout);
                                                                        if (a12 != null) {
                                                                            zd a13 = zd.a(a12);
                                                                            i10 = R.id.terminationBankNameTv;
                                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) a.a(view2, R.id.terminationBankNameTv);
                                                                            if (appCompatTextView7 != null) {
                                                                                i10 = R.id.terminationBranchNameTv;
                                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) a.a(view2, R.id.terminationBranchNameTv);
                                                                                if (appCompatTextView8 != null) {
                                                                                    i10 = R.id.topHolder;
                                                                                    View a14 = a.a(view2, R.id.topHolder);
                                                                                    if (a14 != null) {
                                                                                        qd a15 = qd.a(a14);
                                                                                        i10 = R.id.typeTv;
                                                                                        AppCompatTextView appCompatTextView9 = (AppCompatTextView) a.a(view2, R.id.typeTv);
                                                                                        if (appCompatTextView9 != null) {
                                                                                            i10 = R.id.vahan_finance_from_date;
                                                                                            AppCompatTextView appCompatTextView10 = (AppCompatTextView) a.a(view2, R.id.vahan_finance_from_date);
                                                                                            if (appCompatTextView10 != null) {
                                                                                                i10 = R.id.vahan_financer_add;
                                                                                                AppCompatTextView appCompatTextView11 = (AppCompatTextView) a.a(view2, R.id.vahan_financer_add);
                                                                                                if (appCompatTextView11 != null) {
                                                                                                    i10 = R.id.vahan_financer_branch;
                                                                                                    AppCompatTextView appCompatTextView12 = (AppCompatTextView) a.a(view2, R.id.vahan_financer_branch);
                                                                                                    if (appCompatTextView12 != null) {
                                                                                                        i10 = R.id.vahan_financer_name;
                                                                                                        AppCompatTextView appCompatTextView13 = (AppCompatTextView) a.a(view2, R.id.vahan_financer_name);
                                                                                                        if (appCompatTextView13 != null) {
                                                                                                            i10 = R.id.vahan_hypothecation_continuation;
                                                                                                            TextView textView3 = (TextView) a.a(view2, R.id.vahan_hypothecation_continuation);
                                                                                                            if (textView3 != null) {
                                                                                                                i10 = R.id.vahan_term_branch_add;
                                                                                                                AppCompatTextView appCompatTextView14 = (AppCompatTextView) a.a(view2, R.id.vahan_term_branch_add);
                                                                                                                if (appCompatTextView14 != null) {
                                                                                                                    i10 = R.id.vahan_term_branch_name;
                                                                                                                    AppCompatTextView appCompatTextView15 = (AppCompatTextView) a.a(view2, R.id.vahan_term_branch_name);
                                                                                                                    if (appCompatTextView15 != null) {
                                                                                                                        i10 = R.id.vahan_term_noc_date;
                                                                                                                        AppCompatTextView appCompatTextView16 = (AppCompatTextView) a.a(view2, R.id.vahan_term_noc_date);
                                                                                                                        if (appCompatTextView16 != null) {
                                                                                                                            i10 = R.id.vahan_termination_bank_name;
                                                                                                                            AppCompatTextView appCompatTextView17 = (AppCompatTextView) a.a(view2, R.id.vahan_termination_bank_name);
                                                                                                                            if (appCompatTextView17 != null) {
                                                                                                                                i10 = R.id.vahan_type;
                                                                                                                                AppCompatTextView appCompatTextView18 = (AppCompatTextView) a.a(view2, R.id.vahan_type);
                                                                                                                                if (appCompatTextView18 != null) {
                                                                                                                                    i10 = R.id.vehicleNumberTv;
                                                                                                                                    TextView textView4 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                                                                                    if (textView4 != null) {
                                                                                                                                        i10 = R.id.vehicle_view;
                                                                                                                                        TextView textView5 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                                        if (textView5 != null) {
                                                                                                                                            return new db((ScrollView) view2, textView, appCompatTextView, appCompatButton, imageView, imageView2, textView2, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, cardView, cardView2, linearLayout, linearLayout2, a11, a13, appCompatTextView7, appCompatTextView8, a15, appCompatTextView9, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13, textView3, appCompatTextView14, appCompatTextView15, appCompatTextView16, appCompatTextView17, appCompatTextView18, textView4, textView5);
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

    public static db c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static db d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.hypo_continustion_multi, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f25929a;
    }
}
