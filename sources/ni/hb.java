package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class hb {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f26685a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatButton f26686b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26687c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26688d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26689e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26690f;

    /* renamed from: g  reason: collision with root package name */
    public final kb f26691g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26692h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26693i;

    /* renamed from: j  reason: collision with root package name */
    public final zd f26694j;

    /* renamed from: k  reason: collision with root package name */
    public final qd f26695k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f26696l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26697m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f26698n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f26699o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f26700p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f26701q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f26702r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f26703s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f26704t;

    private hb(ScrollView scrollView, AppCompatButton appCompatButton, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3, kb kbVar, TextView textView4, TextView textView5, zd zdVar, qd qdVar, MyTextView myTextView, TextView textView6, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, TextView textView7, TextView textView8) {
        this.f26685a = scrollView;
        this.f26686b = appCompatButton;
        this.f26687c = textView;
        this.f26688d = textView2;
        this.f26689e = linearLayout;
        this.f26690f = textView3;
        this.f26691g = kbVar;
        this.f26692h = textView4;
        this.f26693i = textView5;
        this.f26694j = zdVar;
        this.f26695k = qdVar;
        this.f26696l = myTextView;
        this.f26697m = textView6;
        this.f26698n = myTextView2;
        this.f26699o = myTextView3;
        this.f26700p = myTextView4;
        this.f26701q = myTextView5;
        this.f26702r = myTextView6;
        this.f26703s = textView7;
        this.f26704t = textView8;
    }

    public static hb a(View view) {
        View view2 = view;
        int i10 = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btnSubmit);
        if (appCompatButton != null) {
            i10 = R.id.firDateTv;
            TextView textView = (TextView) a.a(view2, R.id.firDateTv);
            if (textView != null) {
                i10 = R.id.firNoTv;
                TextView textView2 = (TextView) a.a(view2, R.id.firNoTv);
                if (textView2 != null) {
                    i10 = R.id.police_fir_layout;
                    LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.police_fir_layout);
                    if (linearLayout != null) {
                        i10 = R.id.policeStationTv;
                        TextView textView3 = (TextView) a.a(view2, R.id.policeStationTv);
                        if (textView3 != null) {
                            i10 = R.id.rc_ind;
                            View a10 = a.a(view2, R.id.rc_ind);
                            if (a10 != null) {
                                kb a11 = kb.a(a10);
                                i10 = R.id.reasonTV;
                                TextView textView4 = (TextView) a.a(view2, R.id.reasonTV);
                                if (textView4 != null) {
                                    i10 = R.id.remarkTv;
                                    TextView textView5 = (TextView) a.a(view2, R.id.remarkTv);
                                    if (textView5 != null) {
                                        i10 = R.id.stepper_layout;
                                        View a12 = a.a(view2, R.id.stepper_layout);
                                        if (a12 != null) {
                                            zd a13 = zd.a(a12);
                                            i10 = R.id.topHolder;
                                            View a14 = a.a(view2, R.id.topHolder);
                                            if (a14 != null) {
                                                qd a15 = qd.a(a14);
                                                i10 = R.id.vahan_details_duplicate_rc;
                                                MyTextView myTextView = (MyTextView) a.a(view2, R.id.vahan_details_duplicate_rc);
                                                if (myTextView != null) {
                                                    i10 = R.id.vahan_duplicate_rc;
                                                    TextView textView6 = (TextView) a.a(view2, R.id.vahan_duplicate_rc);
                                                    if (textView6 != null) {
                                                        i10 = R.id.vahan_fir_date;
                                                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.vahan_fir_date);
                                                        if (myTextView2 != null) {
                                                            i10 = R.id.vahan_police_station;
                                                            MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.vahan_police_station);
                                                            if (myTextView3 != null) {
                                                                i10 = R.id.vahan_reason;
                                                                MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.vahan_reason);
                                                                if (myTextView4 != null) {
                                                                    i10 = R.id.vahan_remark;
                                                                    MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.vahan_remark);
                                                                    if (myTextView5 != null) {
                                                                        i10 = R.id.vahan_report_no;
                                                                        MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.vahan_report_no);
                                                                        if (myTextView6 != null) {
                                                                            i10 = R.id.vehicleNumberTv;
                                                                            TextView textView7 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                            if (textView7 != null) {
                                                                                i10 = R.id.vehicle_view;
                                                                                TextView textView8 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                if (textView8 != null) {
                                                                                    return new hb((ScrollView) view2, appCompatButton, textView, textView2, linearLayout, textView3, a11, textView4, textView5, a13, a15, myTextView, textView6, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, textView7, textView8);
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

    public static hb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static hb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.issueofduplicate_detailsview, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f26685a;
    }
}
