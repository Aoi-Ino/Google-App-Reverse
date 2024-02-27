package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import com.nic.mparivahan.R;
import k1.a;

public final class b {
    public final TextView A;
    public final kb B;
    public final CheckBox C;
    public final TextView D;
    public final qd E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f25386a;

    /* renamed from: b  reason: collision with root package name */
    public final Spinner f25387b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f25388c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f25389d;

    /* renamed from: e  reason: collision with root package name */
    public final Spinner f25390e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f25391f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25392g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f25393h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25394i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25395j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25396k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25397l;

    /* renamed from: m  reason: collision with root package name */
    public final Spinner f25398m;

    /* renamed from: n  reason: collision with root package name */
    public final EditText f25399n;

    /* renamed from: o  reason: collision with root package name */
    public final EditText f25400o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f25401p;

    /* renamed from: q  reason: collision with root package name */
    public final EditText f25402q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f25403r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f25404s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f25405t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f25406u;

    /* renamed from: v  reason: collision with root package name */
    public final Spinner f25407v;

    /* renamed from: w  reason: collision with root package name */
    public final EditText f25408w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f25409x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f25410y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f25411z;

    private b(ScrollView scrollView, Spinner spinner, EditText editText, EditText editText2, Spinner spinner2, EditText editText3, TextView textView, EditText editText4, TextView textView2, TextView textView3, TextView textView4, TextView textView5, Spinner spinner3, EditText editText5, EditText editText6, TextView textView6, EditText editText7, TextView textView7, TextView textView8, TextView textView9, TextView textView10, Spinner spinner4, EditText editText8, TextView textView11, TextView textView12, TextView textView13, TextView textView14, kb kbVar, CheckBox checkBox, TextView textView15, qd qdVar, TextView textView16, TextView textView17, TextView textView18) {
        this.f25386a = scrollView;
        this.f25387b = spinner;
        this.f25388c = editText;
        this.f25389d = editText2;
        this.f25390e = spinner2;
        this.f25391f = editText3;
        this.f25392g = textView;
        this.f25393h = editText4;
        this.f25394i = textView2;
        this.f25395j = textView3;
        this.f25396k = textView4;
        this.f25397l = textView5;
        this.f25398m = spinner3;
        this.f25399n = editText5;
        this.f25400o = editText6;
        this.f25401p = textView6;
        this.f25402q = editText7;
        this.f25403r = textView7;
        this.f25404s = textView8;
        this.f25405t = textView9;
        this.f25406u = textView10;
        this.f25407v = spinner4;
        this.f25408w = editText8;
        this.f25409x = textView11;
        this.f25410y = textView12;
        this.f25411z = textView13;
        this.A = textView14;
        this.B = kbVar;
        this.C = checkBox;
        this.D = textView15;
        this.E = qdVar;
        this.F = textView16;
        this.G = textView17;
        this.H = textView18;
    }

    public static b a(View view) {
        View view2 = view;
        int i10 = R.id.current_district_spinner;
        Spinner spinner = (Spinner) a.a(view2, R.id.current_district_spinner);
        if (spinner != null) {
            i10 = R.id.current_landmark;
            EditText editText = (EditText) a.a(view2, R.id.current_landmark);
            if (editText != null) {
                i10 = R.id.currentPinCode;
                EditText editText2 = (EditText) a.a(view2, R.id.currentPinCode);
                if (editText2 != null) {
                    i10 = R.id.current_state_spinner;
                    Spinner spinner2 = (Spinner) a.a(view2, R.id.current_state_spinner);
                    if (spinner2 != null) {
                        i10 = R.id.current_village_town;
                        EditText editText3 = (EditText) a.a(view2, R.id.current_village_town);
                        if (editText3 != null) {
                            i10 = R.id.distict_txt;
                            TextView textView = (TextView) a.a(view2, R.id.distict_txt);
                            if (textView != null) {
                                i10 = R.id.house_street_enter;
                                EditText editText4 = (EditText) a.a(view2, R.id.house_street_enter);
                                if (editText4 != null) {
                                    i10 = R.id.house_street_text;
                                    TextView textView2 = (TextView) a.a(view2, R.id.house_street_text);
                                    if (textView2 != null) {
                                        i10 = R.id.landmark_police_station;
                                        TextView textView3 = (TextView) a.a(view2, R.id.landmark_police_station);
                                        if (textView3 != null) {
                                            i10 = R.id.new_current_address_details;
                                            TextView textView4 = (TextView) a.a(view2, R.id.new_current_address_details);
                                            if (textView4 != null) {
                                                i10 = R.id.nextPage;
                                                TextView textView5 = (TextView) a.a(view2, R.id.nextPage);
                                                if (textView5 != null) {
                                                    i10 = R.id.per_district_spinner;
                                                    Spinner spinner3 = (Spinner) a.a(view2, R.id.per_district_spinner);
                                                    if (spinner3 != null) {
                                                        i10 = R.id.per_enter_pincode;
                                                        EditText editText5 = (EditText) a.a(view2, R.id.per_enter_pincode);
                                                        if (editText5 != null) {
                                                            i10 = R.id.per_house_street_enter;
                                                            EditText editText6 = (EditText) a.a(view2, R.id.per_house_street_enter);
                                                            if (editText6 != null) {
                                                                i10 = R.id.per_house_street_text;
                                                                TextView textView6 = (TextView) a.a(view2, R.id.per_house_street_text);
                                                                if (textView6 != null) {
                                                                    i10 = R.id.per_landmark;
                                                                    EditText editText7 = (EditText) a.a(view2, R.id.per_landmark);
                                                                    if (editText7 != null) {
                                                                        i10 = R.id.per_landmark_police_station;
                                                                        TextView textView7 = (TextView) a.a(view2, R.id.per_landmark_police_station);
                                                                        if (textView7 != null) {
                                                                            i10 = R.id.per_pinCode;
                                                                            TextView textView8 = (TextView) a.a(view2, R.id.per_pinCode);
                                                                            if (textView8 != null) {
                                                                                i10 = R.id.per_pincode;
                                                                                TextView textView9 = (TextView) a.a(view2, R.id.per_pincode);
                                                                                if (textView9 != null) {
                                                                                    i10 = R.id.per_state;
                                                                                    TextView textView10 = (TextView) a.a(view2, R.id.per_state);
                                                                                    if (textView10 != null) {
                                                                                        i10 = R.id.per_state_spinner;
                                                                                        Spinner spinner4 = (Spinner) a.a(view2, R.id.per_state_spinner);
                                                                                        if (spinner4 != null) {
                                                                                            i10 = R.id.per_village_town;
                                                                                            EditText editText8 = (EditText) a.a(view2, R.id.per_village_town);
                                                                                            if (editText8 != null) {
                                                                                                i10 = R.id.per_village_town_city;
                                                                                                TextView textView11 = (TextView) a.a(view2, R.id.per_village_town_city);
                                                                                                if (textView11 != null) {
                                                                                                    i10 = R.id.permanent_address_details;
                                                                                                    TextView textView12 = (TextView) a.a(view2, R.id.permanent_address_details);
                                                                                                    if (textView12 != null) {
                                                                                                        i10 = R.id.pinCode;
                                                                                                        TextView textView13 = (TextView) a.a(view2, R.id.pinCode);
                                                                                                        if (textView13 != null) {
                                                                                                            i10 = R.id.previousPage;
                                                                                                            TextView textView14 = (TextView) a.a(view2, R.id.previousPage);
                                                                                                            if (textView14 != null) {
                                                                                                                i10 = R.id.rc_ind;
                                                                                                                View a10 = a.a(view2, R.id.rc_ind);
                                                                                                                if (a10 != null) {
                                                                                                                    kb a11 = kb.a(a10);
                                                                                                                    i10 = R.id.same_as_current;
                                                                                                                    CheckBox checkBox = (CheckBox) a.a(view2, R.id.same_as_current);
                                                                                                                    if (checkBox != null) {
                                                                                                                        i10 = R.id.state;
                                                                                                                        TextView textView15 = (TextView) a.a(view2, R.id.state);
                                                                                                                        if (textView15 != null) {
                                                                                                                            i10 = R.id.topHolder;
                                                                                                                            View a12 = a.a(view2, R.id.topHolder);
                                                                                                                            if (a12 != null) {
                                                                                                                                qd a13 = qd.a(a12);
                                                                                                                                i10 = R.id.vehicleNumberTv;
                                                                                                                                TextView textView16 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                                                                                if (textView16 != null) {
                                                                                                                                    i10 = R.id.vehicle_view;
                                                                                                                                    TextView textView17 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                                    if (textView17 != null) {
                                                                                                                                        i10 = R.id.village_town_city;
                                                                                                                                        TextView textView18 = (TextView) a.a(view2, R.id.village_town_city);
                                                                                                                                        if (textView18 != null) {
                                                                                                                                            return new b((ScrollView) view2, spinner, editText, editText2, spinner2, editText3, textView, editText4, textView2, textView3, textView4, textView5, spinner3, editText5, editText6, textView6, editText7, textView7, textView8, textView9, textView10, spinner4, editText8, textView11, textView12, textView13, textView14, a11, checkBox, textView15, a13, textView16, textView17, textView18);
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

    public static b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.aadhaartolayout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f25386a;
    }
}
