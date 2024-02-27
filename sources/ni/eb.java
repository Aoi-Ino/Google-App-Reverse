package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class eb {
    public final TextView A;
    public final TextView B;
    public final EditText C;
    public final TextView D;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f26115a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatButton f26116b;

    /* renamed from: c  reason: collision with root package name */
    public final Spinner f26117c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f26118d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26119e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26120f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f26121g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f26122h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f26123i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26124j;

    /* renamed from: k  reason: collision with root package name */
    public final Spinner f26125k;

    /* renamed from: l  reason: collision with root package name */
    public final EditText f26126l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26127m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26128n;

    /* renamed from: o  reason: collision with root package name */
    public final kb f26129o;

    /* renamed from: p  reason: collision with root package name */
    public final Spinner f26130p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f26131q;

    /* renamed from: r  reason: collision with root package name */
    public final zd f26132r;

    /* renamed from: s  reason: collision with root package name */
    public final qd f26133s;

    /* renamed from: t  reason: collision with root package name */
    public final MyTextView f26134t;

    /* renamed from: u  reason: collision with root package name */
    public final MyTextView f26135u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f26136v;

    /* renamed from: w  reason: collision with root package name */
    public final MyTextView f26137w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f26138x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f26139y;

    /* renamed from: z  reason: collision with root package name */
    public final MyTextView f26140z;

    private eb(ScrollView scrollView, AppCompatButton appCompatButton, Spinner spinner, EditText editText, TextView textView, TextView textView2, EditText editText2, EditText editText3, EditText editText4, TextView textView3, Spinner spinner2, EditText editText5, TextView textView4, TextView textView5, kb kbVar, Spinner spinner3, TextView textView6, zd zdVar, qd qdVar, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, TextView textView7, MyTextView myTextView6, TextView textView8, TextView textView9, EditText editText6, TextView textView10) {
        this.f26115a = scrollView;
        this.f26116b = appCompatButton;
        this.f26117c = spinner;
        this.f26118d = editText;
        this.f26119e = textView;
        this.f26120f = textView2;
        this.f26121g = editText2;
        this.f26122h = editText3;
        this.f26123i = editText4;
        this.f26124j = textView3;
        this.f26125k = spinner2;
        this.f26126l = editText5;
        this.f26127m = textView4;
        this.f26128n = textView5;
        this.f26129o = kbVar;
        this.f26130p = spinner3;
        this.f26131q = textView6;
        this.f26132r = zdVar;
        this.f26133s = qdVar;
        this.f26134t = myTextView;
        this.f26135u = myTextView2;
        this.f26136v = myTextView3;
        this.f26137w = myTextView4;
        this.f26138x = myTextView5;
        this.f26139y = textView7;
        this.f26140z = myTextView6;
        this.A = textView8;
        this.B = textView9;
        this.C = editText6;
        this.D = textView10;
    }

    public static eb a(View view) {
        View view2 = view;
        int i10 = R.id.btnSubmit;
        AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btnSubmit);
        if (appCompatButton != null) {
            i10 = R.id.current_distic_spinner;
            Spinner spinner = (Spinner) a.a(view2, R.id.current_distic_spinner);
            if (spinner != null) {
                i10 = R.id.current_pincode;
                EditText editText = (EditText) a.a(view2, R.id.current_pincode);
                if (editText != null) {
                    i10 = R.id.district;
                    TextView textView = (TextView) a.a(view2, R.id.district);
                    if (textView != null) {
                        i10 = R.id.finance_From_Date_Tv;
                        TextView textView2 = (TextView) a.a(view2, R.id.finance_From_Date_Tv);
                        if (textView2 != null) {
                            i10 = R.id.financerBranchTv;
                            EditText editText2 = (EditText) a.a(view2, R.id.financerBranchTv);
                            if (editText2 != null) {
                                i10 = R.id.financerNameTv;
                                EditText editText3 = (EditText) a.a(view2, R.id.financerNameTv);
                                if (editText3 != null) {
                                    i10 = R.id.house_no;
                                    EditText editText4 = (EditText) a.a(view2, R.id.house_no);
                                    if (editText4 != null) {
                                        i10 = R.id.house_no_and_street_name;
                                        TextView textView3 = (TextView) a.a(view2, R.id.house_no_and_street_name);
                                        if (textView3 != null) {
                                            i10 = R.id.hpt_type_spinner;
                                            Spinner spinner2 = (Spinner) a.a(view2, R.id.hpt_type_spinner);
                                            if (spinner2 != null) {
                                                i10 = R.id.land_mark;
                                                EditText editText5 = (EditText) a.a(view2, R.id.land_mark);
                                                if (editText5 != null) {
                                                    i10 = R.id.landmark_police_station;
                                                    TextView textView4 = (TextView) a.a(view2, R.id.landmark_police_station);
                                                    if (textView4 != null) {
                                                        i10 = R.id.pincode;
                                                        TextView textView5 = (TextView) a.a(view2, R.id.pincode);
                                                        if (textView5 != null) {
                                                            i10 = R.id.rc_ind;
                                                            View a10 = a.a(view2, R.id.rc_ind);
                                                            if (a10 != null) {
                                                                kb a11 = kb.a(a10);
                                                                i10 = R.id.select_spinner;
                                                                Spinner spinner3 = (Spinner) a.a(view2, R.id.select_spinner);
                                                                if (spinner3 != null) {
                                                                    i10 = R.id.state;
                                                                    TextView textView6 = (TextView) a.a(view2, R.id.state);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.stepper_layout;
                                                                        View a12 = a.a(view2, R.id.stepper_layout);
                                                                        if (a12 != null) {
                                                                            zd a13 = zd.a(a12);
                                                                            i10 = R.id.topHolder;
                                                                            View a14 = a.a(view2, R.id.topHolder);
                                                                            if (a14 != null) {
                                                                                qd a15 = qd.a(a14);
                                                                                i10 = R.id.vahan_finance_from_date;
                                                                                MyTextView myTextView = (MyTextView) a.a(view2, R.id.vahan_finance_from_date);
                                                                                if (myTextView != null) {
                                                                                    i10 = R.id.vahan_financer_add;
                                                                                    MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.vahan_financer_add);
                                                                                    if (myTextView2 != null) {
                                                                                        i10 = R.id.vahan_financer_branch;
                                                                                        MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.vahan_financer_branch);
                                                                                        if (myTextView3 != null) {
                                                                                            i10 = R.id.vahan_financer_name;
                                                                                            MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.vahan_financer_name);
                                                                                            if (myTextView4 != null) {
                                                                                                i10 = R.id.vahan_hypothecation_add_details;
                                                                                                MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.vahan_hypothecation_add_details);
                                                                                                if (myTextView5 != null) {
                                                                                                    i10 = R.id.vahan_hypothecation_addition;
                                                                                                    TextView textView7 = (TextView) a.a(view2, R.id.vahan_hypothecation_addition);
                                                                                                    if (textView7 != null) {
                                                                                                        i10 = R.id.vahan_type;
                                                                                                        MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.vahan_type);
                                                                                                        if (myTextView6 != null) {
                                                                                                            i10 = R.id.vehicleNumberTv;
                                                                                                            TextView textView8 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                                                            if (textView8 != null) {
                                                                                                                i10 = R.id.vehicle_view;
                                                                                                                TextView textView9 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                if (textView9 != null) {
                                                                                                                    i10 = R.id.village_town;
                                                                                                                    EditText editText6 = (EditText) a.a(view2, R.id.village_town);
                                                                                                                    if (editText6 != null) {
                                                                                                                        i10 = R.id.village_town_city;
                                                                                                                        TextView textView10 = (TextView) a.a(view2, R.id.village_town_city);
                                                                                                                        if (textView10 != null) {
                                                                                                                            return new eb((ScrollView) view2, appCompatButton, spinner, editText, textView, textView2, editText2, editText3, editText4, textView3, spinner2, editText5, textView4, textView5, a11, spinner3, textView6, a13, a15, myTextView, myTextView2, myTextView3, myTextView4, myTextView5, textView7, myTextView6, textView8, textView9, editText6, textView10);
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

    public static eb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static eb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.hyptaddition_multi, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f26115a;
    }
}
