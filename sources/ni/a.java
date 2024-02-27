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

public final class a {
    public final TextView A;
    public final kb B;
    public final CheckBox C;
    public final TextView D;
    public final zd E;
    public final qd F;
    public final TextView G;
    public final TextView H;
    public final TextView I;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f25142a;

    /* renamed from: b  reason: collision with root package name */
    public final Spinner f25143b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f25144c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f25145d;

    /* renamed from: e  reason: collision with root package name */
    public final Spinner f25146e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f25147f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25148g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f25149h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25150i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25151j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25152k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25153l;

    /* renamed from: m  reason: collision with root package name */
    public final EditText f25154m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25155n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f25156o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f25157p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f25158q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f25159r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f25160s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f25161t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f25162u;

    /* renamed from: v  reason: collision with root package name */
    public final Spinner f25163v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f25164w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f25165x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f25166y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f25167z;

    private a(ScrollView scrollView, Spinner spinner, EditText editText, EditText editText2, Spinner spinner2, EditText editText3, TextView textView, EditText editText4, TextView textView2, TextView textView3, TextView textView4, TextView textView5, EditText editText5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, Spinner spinner3, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, kb kbVar, CheckBox checkBox, TextView textView19, zd zdVar, qd qdVar, TextView textView20, TextView textView21, TextView textView22) {
        this.f25142a = scrollView;
        this.f25143b = spinner;
        this.f25144c = editText;
        this.f25145d = editText2;
        this.f25146e = spinner2;
        this.f25147f = editText3;
        this.f25148g = textView;
        this.f25149h = editText4;
        this.f25150i = textView2;
        this.f25151j = textView3;
        this.f25152k = textView4;
        this.f25153l = textView5;
        this.f25154m = editText5;
        this.f25155n = textView6;
        this.f25156o = textView7;
        this.f25157p = textView8;
        this.f25158q = textView9;
        this.f25159r = textView10;
        this.f25160s = textView11;
        this.f25161t = textView12;
        this.f25162u = textView13;
        this.f25163v = spinner3;
        this.f25164w = textView14;
        this.f25165x = textView15;
        this.f25166y = textView16;
        this.f25167z = textView17;
        this.A = textView18;
        this.B = kbVar;
        this.C = checkBox;
        this.D = textView19;
        this.E = zdVar;
        this.F = qdVar;
        this.G = textView20;
        this.H = textView21;
        this.I = textView22;
    }

    public static a a(View view) {
        View view2 = view;
        int i10 = R.id.current_district_spinner;
        Spinner spinner = (Spinner) k1.a.a(view2, R.id.current_district_spinner);
        if (spinner != null) {
            i10 = R.id.current_landmark;
            EditText editText = (EditText) k1.a.a(view2, R.id.current_landmark);
            if (editText != null) {
                i10 = R.id.currentPinCode;
                EditText editText2 = (EditText) k1.a.a(view2, R.id.currentPinCode);
                if (editText2 != null) {
                    i10 = R.id.current_state_spinner;
                    Spinner spinner2 = (Spinner) k1.a.a(view2, R.id.current_state_spinner);
                    if (spinner2 != null) {
                        i10 = R.id.current_village_town;
                        EditText editText3 = (EditText) k1.a.a(view2, R.id.current_village_town);
                        if (editText3 != null) {
                            i10 = R.id.distict_txt;
                            TextView textView = (TextView) k1.a.a(view2, R.id.distict_txt);
                            if (textView != null) {
                                i10 = R.id.house_street_enter;
                                EditText editText4 = (EditText) k1.a.a(view2, R.id.house_street_enter);
                                if (editText4 != null) {
                                    i10 = R.id.house_street_text;
                                    TextView textView2 = (TextView) k1.a.a(view2, R.id.house_street_text);
                                    if (textView2 != null) {
                                        i10 = R.id.landmark_police_station;
                                        TextView textView3 = (TextView) k1.a.a(view2, R.id.landmark_police_station);
                                        if (textView3 != null) {
                                            i10 = R.id.new_current_address_details;
                                            TextView textView4 = (TextView) k1.a.a(view2, R.id.new_current_address_details);
                                            if (textView4 != null) {
                                                i10 = R.id.nextPage;
                                                TextView textView5 = (TextView) k1.a.a(view2, R.id.nextPage);
                                                if (textView5 != null) {
                                                    i10 = R.id.per_district_spinner;
                                                    EditText editText5 = (EditText) k1.a.a(view2, R.id.per_district_spinner);
                                                    if (editText5 != null) {
                                                        i10 = R.id.per_enter_pincode;
                                                        TextView textView6 = (TextView) k1.a.a(view2, R.id.per_enter_pincode);
                                                        if (textView6 != null) {
                                                            i10 = R.id.per_house_street_enter;
                                                            TextView textView7 = (TextView) k1.a.a(view2, R.id.per_house_street_enter);
                                                            if (textView7 != null) {
                                                                i10 = R.id.per_house_street_text;
                                                                TextView textView8 = (TextView) k1.a.a(view2, R.id.per_house_street_text);
                                                                if (textView8 != null) {
                                                                    i10 = R.id.per_landmark;
                                                                    TextView textView9 = (TextView) k1.a.a(view2, R.id.per_landmark);
                                                                    if (textView9 != null) {
                                                                        i10 = R.id.per_landmark_police_station;
                                                                        TextView textView10 = (TextView) k1.a.a(view2, R.id.per_landmark_police_station);
                                                                        if (textView10 != null) {
                                                                            i10 = R.id.per_pinCode;
                                                                            TextView textView11 = (TextView) k1.a.a(view2, R.id.per_pinCode);
                                                                            if (textView11 != null) {
                                                                                i10 = R.id.per_pincode;
                                                                                TextView textView12 = (TextView) k1.a.a(view2, R.id.per_pincode);
                                                                                if (textView12 != null) {
                                                                                    i10 = R.id.per_state;
                                                                                    TextView textView13 = (TextView) k1.a.a(view2, R.id.per_state);
                                                                                    if (textView13 != null) {
                                                                                        i10 = R.id.per_state_spinner;
                                                                                        Spinner spinner3 = (Spinner) k1.a.a(view2, R.id.per_state_spinner);
                                                                                        if (spinner3 != null) {
                                                                                            i10 = R.id.per_village_town;
                                                                                            TextView textView14 = (TextView) k1.a.a(view2, R.id.per_village_town);
                                                                                            if (textView14 != null) {
                                                                                                i10 = R.id.per_village_town_city;
                                                                                                TextView textView15 = (TextView) k1.a.a(view2, R.id.per_village_town_city);
                                                                                                if (textView15 != null) {
                                                                                                    i10 = R.id.permanent_address_details;
                                                                                                    TextView textView16 = (TextView) k1.a.a(view2, R.id.permanent_address_details);
                                                                                                    if (textView16 != null) {
                                                                                                        i10 = R.id.pinCode;
                                                                                                        TextView textView17 = (TextView) k1.a.a(view2, R.id.pinCode);
                                                                                                        if (textView17 != null) {
                                                                                                            i10 = R.id.previousPage;
                                                                                                            TextView textView18 = (TextView) k1.a.a(view2, R.id.previousPage);
                                                                                                            if (textView18 != null) {
                                                                                                                i10 = R.id.rc_ind;
                                                                                                                View a10 = k1.a.a(view2, R.id.rc_ind);
                                                                                                                if (a10 != null) {
                                                                                                                    kb a11 = kb.a(a10);
                                                                                                                    i10 = R.id.same_as_current;
                                                                                                                    CheckBox checkBox = (CheckBox) k1.a.a(view2, R.id.same_as_current);
                                                                                                                    if (checkBox != null) {
                                                                                                                        i10 = R.id.state;
                                                                                                                        TextView textView19 = (TextView) k1.a.a(view2, R.id.state);
                                                                                                                        if (textView19 != null) {
                                                                                                                            i10 = R.id.stepper_layout;
                                                                                                                            View a12 = k1.a.a(view2, R.id.stepper_layout);
                                                                                                                            if (a12 != null) {
                                                                                                                                zd a13 = zd.a(a12);
                                                                                                                                i10 = R.id.topHolder;
                                                                                                                                View a14 = k1.a.a(view2, R.id.topHolder);
                                                                                                                                if (a14 != null) {
                                                                                                                                    qd a15 = qd.a(a14);
                                                                                                                                    i10 = R.id.vehicleNumberTv;
                                                                                                                                    TextView textView20 = (TextView) k1.a.a(view2, R.id.vehicleNumberTv);
                                                                                                                                    if (textView20 != null) {
                                                                                                                                        i10 = R.id.vehicle_view;
                                                                                                                                        TextView textView21 = (TextView) k1.a.a(view2, R.id.vehicle_view);
                                                                                                                                        if (textView21 != null) {
                                                                                                                                            i10 = R.id.village_town_city;
                                                                                                                                            TextView textView22 = (TextView) k1.a.a(view2, R.id.village_town_city);
                                                                                                                                            if (textView22 != null) {
                                                                                                                                                return new a((ScrollView) view2, spinner, editText, editText2, spinner2, editText3, textView, editText4, textView2, textView3, textView4, textView5, editText5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, spinner3, textView14, textView15, textView16, textView17, textView18, a11, checkBox, textView19, a13, a15, textView20, textView21, textView22);
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

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.aadhaar_to_address, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f25142a;
    }
}
