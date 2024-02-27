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

public final class g0 {
    public final TextView A;
    public final CheckBox B;
    public final TextView C;
    public final qd D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f26415a;

    /* renamed from: b  reason: collision with root package name */
    public final Spinner f26416b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f26417c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f26418d;

    /* renamed from: e  reason: collision with root package name */
    public final Spinner f26419e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f26420f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26421g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f26422h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26423i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26424j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26425k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26426l;

    /* renamed from: m  reason: collision with root package name */
    public final Spinner f26427m;

    /* renamed from: n  reason: collision with root package name */
    public final EditText f26428n;

    /* renamed from: o  reason: collision with root package name */
    public final EditText f26429o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26430p;

    /* renamed from: q  reason: collision with root package name */
    public final EditText f26431q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f26432r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f26433s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f26434t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f26435u;

    /* renamed from: v  reason: collision with root package name */
    public final Spinner f26436v;

    /* renamed from: w  reason: collision with root package name */
    public final EditText f26437w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f26438x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f26439y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f26440z;

    private g0(ScrollView scrollView, Spinner spinner, EditText editText, EditText editText2, Spinner spinner2, EditText editText3, TextView textView, EditText editText4, TextView textView2, TextView textView3, TextView textView4, TextView textView5, Spinner spinner3, EditText editText5, EditText editText6, TextView textView6, EditText editText7, TextView textView7, TextView textView8, TextView textView9, TextView textView10, Spinner spinner4, EditText editText8, TextView textView11, TextView textView12, TextView textView13, TextView textView14, CheckBox checkBox, TextView textView15, qd qdVar, TextView textView16, TextView textView17, TextView textView18) {
        this.f26415a = scrollView;
        this.f26416b = spinner;
        this.f26417c = editText;
        this.f26418d = editText2;
        this.f26419e = spinner2;
        this.f26420f = editText3;
        this.f26421g = textView;
        this.f26422h = editText4;
        this.f26423i = textView2;
        this.f26424j = textView3;
        this.f26425k = textView4;
        this.f26426l = textView5;
        this.f26427m = spinner3;
        this.f26428n = editText5;
        this.f26429o = editText6;
        this.f26430p = textView6;
        this.f26431q = editText7;
        this.f26432r = textView7;
        this.f26433s = textView8;
        this.f26434t = textView9;
        this.f26435u = textView10;
        this.f26436v = spinner4;
        this.f26437w = editText8;
        this.f26438x = textView11;
        this.f26439y = textView12;
        this.f26440z = textView13;
        this.A = textView14;
        this.B = checkBox;
        this.C = textView15;
        this.D = qdVar;
        this.E = textView16;
        this.F = textView17;
        this.G = textView18;
    }

    public static g0 a(View view) {
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
                                                                                                                i10 = R.id.same_as_current;
                                                                                                                CheckBox checkBox = (CheckBox) a.a(view2, R.id.same_as_current);
                                                                                                                if (checkBox != null) {
                                                                                                                    i10 = R.id.state;
                                                                                                                    TextView textView15 = (TextView) a.a(view2, R.id.state);
                                                                                                                    if (textView15 != null) {
                                                                                                                        i10 = R.id.topHolder;
                                                                                                                        View a10 = a.a(view2, R.id.topHolder);
                                                                                                                        if (a10 != null) {
                                                                                                                            qd a11 = qd.a(a10);
                                                                                                                            i10 = R.id.vehicleNumberTv;
                                                                                                                            TextView textView16 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                                                                            if (textView16 != null) {
                                                                                                                                i10 = R.id.vehicle_view;
                                                                                                                                TextView textView17 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                                if (textView17 != null) {
                                                                                                                                    i10 = R.id.village_town_city;
                                                                                                                                    TextView textView18 = (TextView) a.a(view2, R.id.village_town_city);
                                                                                                                                    if (textView18 != null) {
                                                                                                                                        return new g0((ScrollView) view2, spinner, editText, editText2, spinner2, editText3, textView, editText4, textView2, textView3, textView4, textView5, spinner3, editText5, editText6, textView6, editText7, textView7, textView8, textView9, textView10, spinner4, editText8, textView11, textView12, textView13, textView14, checkBox, textView15, a11, textView16, textView17, textView18);
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

    public static g0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static g0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_change_of_address_too, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f26415a;
    }
}
