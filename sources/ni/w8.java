package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import k1.a;

public final class w8 {
    public final EditText A;
    public final EditText B;
    public final TextView C;
    public final Spinner D;
    public final Spinner E;
    public final CardView F;
    public final TextView G;
    public final TextView H;
    public final kb I;
    public final CheckBox J;
    public final Spinner K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final qd O;
    public final TextView P;
    public final TextView Q;
    public final CardView R;
    public final TextView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29193a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f29194b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f29195c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f29196d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatTextView f29197e;

    /* renamed from: f  reason: collision with root package name */
    public final Spinner f29198f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f29199g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f29200h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f29201i;

    /* renamed from: j  reason: collision with root package name */
    public final EditText f29202j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f29203k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f29204l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f29205m;

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f29206n;

    /* renamed from: o  reason: collision with root package name */
    public final AppCompatTextView f29207o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f29208p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f29209q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f29210r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f29211s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f29212t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f29213u;

    /* renamed from: v  reason: collision with root package name */
    public final LinearLayout f29214v;

    /* renamed from: w  reason: collision with root package name */
    public final AppCompatTextView f29215w;

    /* renamed from: x  reason: collision with root package name */
    public final AppCompatTextView f29216x;

    /* renamed from: y  reason: collision with root package name */
    public final EditText f29217y;

    /* renamed from: z  reason: collision with root package name */
    public final EditText f29218z;

    private w8(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, AppCompatTextView appCompatTextView, Spinner spinner, EditText editText, EditText editText2, EditText editText3, EditText editText4, TextView textView3, TextView textView4, ImageView imageView, ImageView imageView2, AppCompatTextView appCompatTextView2, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, LinearLayout linearLayout3, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, TextView textView11, Spinner spinner2, Spinner spinner3, CardView cardView, TextView textView12, TextView textView13, kb kbVar, CheckBox checkBox, Spinner spinner4, TextView textView14, TextView textView15, TextView textView16, qd qdVar, TextView textView17, TextView textView18, CardView cardView2, TextView textView19, TextView textView20, TextView textView21, TextView textView22) {
        this.f29193a = linearLayout;
        this.f29194b = textView;
        this.f29195c = textView2;
        this.f29196d = linearLayout2;
        this.f29197e = appCompatTextView;
        this.f29198f = spinner;
        this.f29199g = editText;
        this.f29200h = editText2;
        this.f29201i = editText3;
        this.f29202j = editText4;
        this.f29203k = textView3;
        this.f29204l = textView4;
        this.f29205m = imageView;
        this.f29206n = imageView2;
        this.f29207o = appCompatTextView2;
        this.f29208p = textView5;
        this.f29209q = textView6;
        this.f29210r = textView7;
        this.f29211s = textView8;
        this.f29212t = textView9;
        this.f29213u = textView10;
        this.f29214v = linearLayout3;
        this.f29215w = appCompatTextView3;
        this.f29216x = appCompatTextView4;
        this.f29217y = editText5;
        this.f29218z = editText6;
        this.A = editText7;
        this.B = editText8;
        this.C = textView11;
        this.D = spinner2;
        this.E = spinner3;
        this.F = cardView;
        this.G = textView12;
        this.H = textView13;
        this.I = kbVar;
        this.J = checkBox;
        this.K = spinner4;
        this.L = textView14;
        this.M = textView15;
        this.N = textView16;
        this.O = qdVar;
        this.P = textView17;
        this.Q = textView18;
        this.R = cardView2;
        this.S = textView19;
        this.T = textView20;
        this.U = textView21;
        this.V = textView22;
    }

    public static w8 a(View view) {
        View view2 = view;
        int i10 = R.id.change_of_address_in_rc;
        TextView textView = (TextView) a.a(view2, R.id.change_of_address_in_rc);
        if (textView != null) {
            i10 = R.id.current_address;
            TextView textView2 = (TextView) a.a(view2, R.id.current_address);
            if (textView2 != null) {
                i10 = R.id.current_address_linear;
                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.current_address_linear);
                if (linearLayout != null) {
                    i10 = R.id.current_address_txt;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.current_address_txt);
                    if (appCompatTextView != null) {
                        i10 = R.id.current_distic_spinner;
                        Spinner spinner = (Spinner) a.a(view2, R.id.current_distic_spinner);
                        if (spinner != null) {
                            i10 = R.id.current_house_number;
                            EditText editText = (EditText) a.a(view2, R.id.current_house_number);
                            if (editText != null) {
                                i10 = R.id.current_landmark;
                                EditText editText2 = (EditText) a.a(view2, R.id.current_landmark);
                                if (editText2 != null) {
                                    i10 = R.id.current_pincode;
                                    EditText editText3 = (EditText) a.a(view2, R.id.current_pincode);
                                    if (editText3 != null) {
                                        i10 = R.id.current_village_town;
                                        EditText editText4 = (EditText) a.a(view2, R.id.current_village_town);
                                        if (editText4 != null) {
                                            i10 = R.id.district;
                                            TextView textView3 = (TextView) a.a(view2, R.id.district);
                                            if (textView3 != null) {
                                                i10 = R.id.district2;
                                                TextView textView4 = (TextView) a.a(view2, R.id.district2);
                                                if (textView4 != null) {
                                                    i10 = R.id.down_arrow_current;
                                                    ImageView imageView = (ImageView) a.a(view2, R.id.down_arrow_current);
                                                    if (imageView != null) {
                                                        i10 = R.id.down_arrow_perment;
                                                        ImageView imageView2 = (ImageView) a.a(view2, R.id.down_arrow_perment);
                                                        if (imageView2 != null) {
                                                            i10 = R.id.header_title_vehicle_details;
                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.header_title_vehicle_details);
                                                            if (appCompatTextView2 != null) {
                                                                i10 = R.id.house_no_and_street_name;
                                                                TextView textView5 = (TextView) a.a(view2, R.id.house_no_and_street_name);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.landmark_police_station;
                                                                    TextView textView6 = (TextView) a.a(view2, R.id.landmark_police_station);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.landmark_police_station2;
                                                                        TextView textView7 = (TextView) a.a(view2, R.id.landmark_police_station2);
                                                                        if (textView7 != null) {
                                                                            i10 = R.id.new_current_address;
                                                                            TextView textView8 = (TextView) a.a(view2, R.id.new_current_address);
                                                                            if (textView8 != null) {
                                                                                i10 = R.id.new_current_address_details;
                                                                                TextView textView9 = (TextView) a.a(view2, R.id.new_current_address_details);
                                                                                if (textView9 != null) {
                                                                                    i10 = R.id.new_permanent_address_details;
                                                                                    TextView textView10 = (TextView) a.a(view2, R.id.new_permanent_address_details);
                                                                                    if (textView10 != null) {
                                                                                        i10 = R.id.perm_address_linear;
                                                                                        LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.perm_address_linear);
                                                                                        if (linearLayout2 != null) {
                                                                                            i10 = R.id.permanent_address;
                                                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.permanent_address);
                                                                                            if (appCompatTextView3 != null) {
                                                                                                i10 = R.id.permanent_address2;
                                                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) a.a(view2, R.id.permanent_address2);
                                                                                                if (appCompatTextView4 != null) {
                                                                                                    i10 = R.id.permanent_house_no;
                                                                                                    EditText editText5 = (EditText) a.a(view2, R.id.permanent_house_no);
                                                                                                    if (editText5 != null) {
                                                                                                        i10 = R.id.permanent_land_mark;
                                                                                                        EditText editText6 = (EditText) a.a(view2, R.id.permanent_land_mark);
                                                                                                        if (editText6 != null) {
                                                                                                            i10 = R.id.permanent_pincode;
                                                                                                            EditText editText7 = (EditText) a.a(view2, R.id.permanent_pincode);
                                                                                                            if (editText7 != null) {
                                                                                                                i10 = R.id.perme_village_town;
                                                                                                                EditText editText8 = (EditText) a.a(view2, R.id.perme_village_town);
                                                                                                                if (editText8 != null) {
                                                                                                                    i10 = R.id.permenent_address;
                                                                                                                    TextView textView11 = (TextView) a.a(view2, R.id.permenent_address);
                                                                                                                    if (textView11 != null) {
                                                                                                                        i10 = R.id.permenent_dis_spinner;
                                                                                                                        Spinner spinner2 = (Spinner) a.a(view2, R.id.permenent_dis_spinner);
                                                                                                                        if (spinner2 != null) {
                                                                                                                            i10 = R.id.permenent_state_spinner;
                                                                                                                            Spinner spinner3 = (Spinner) a.a(view2, R.id.permenent_state_spinner);
                                                                                                                            if (spinner3 != null) {
                                                                                                                                i10 = R.id.perment_address;
                                                                                                                                CardView cardView = (CardView) a.a(view2, R.id.perment_address);
                                                                                                                                if (cardView != null) {
                                                                                                                                    i10 = R.id.pincode;
                                                                                                                                    TextView textView12 = (TextView) a.a(view2, R.id.pincode);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        i10 = R.id.pincode2;
                                                                                                                                        TextView textView13 = (TextView) a.a(view2, R.id.pincode2);
                                                                                                                                        if (textView13 != null) {
                                                                                                                                            i10 = R.id.rc_ind;
                                                                                                                                            View a10 = a.a(view2, R.id.rc_ind);
                                                                                                                                            if (a10 != null) {
                                                                                                                                                kb a11 = kb.a(a10);
                                                                                                                                                i10 = R.id.same_as_current;
                                                                                                                                                CheckBox checkBox = (CheckBox) a.a(view2, R.id.same_as_current);
                                                                                                                                                if (checkBox != null) {
                                                                                                                                                    i10 = R.id.select_spinner;
                                                                                                                                                    Spinner spinner4 = (Spinner) a.a(view2, R.id.select_spinner);
                                                                                                                                                    if (spinner4 != null) {
                                                                                                                                                        i10 = R.id.state;
                                                                                                                                                        TextView textView14 = (TextView) a.a(view2, R.id.state);
                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                            i10 = R.id.state2;
                                                                                                                                                            TextView textView15 = (TextView) a.a(view2, R.id.state2);
                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                i10 = R.id.submit_cod;
                                                                                                                                                                TextView textView16 = (TextView) a.a(view2, R.id.submit_cod);
                                                                                                                                                                if (textView16 != null) {
                                                                                                                                                                    i10 = R.id.topHolder;
                                                                                                                                                                    View a12 = a.a(view2, R.id.topHolder);
                                                                                                                                                                    if (a12 != null) {
                                                                                                                                                                        qd a13 = qd.a(a12);
                                                                                                                                                                        i10 = R.id.valid_form;
                                                                                                                                                                        TextView textView17 = (TextView) a.a(view2, R.id.valid_form);
                                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                                            i10 = R.id.valid_From_Tv;
                                                                                                                                                                            TextView textView18 = (TextView) a.a(view2, R.id.valid_From_Tv);
                                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                                i10 = R.id.vehicleDetailsCv;
                                                                                                                                                                                CardView cardView2 = (CardView) a.a(view2, R.id.vehicleDetailsCv);
                                                                                                                                                                                if (cardView2 != null) {
                                                                                                                                                                                    i10 = R.id.vehicle_number;
                                                                                                                                                                                    TextView textView19 = (TextView) a.a(view2, R.id.vehicle_number);
                                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                                        i10 = R.id.vehicle_view;
                                                                                                                                                                                        TextView textView20 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                                            i10 = R.id.village_town_city;
                                                                                                                                                                                            TextView textView21 = (TextView) a.a(view2, R.id.village_town_city);
                                                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                                                i10 = R.id.village_town_city2;
                                                                                                                                                                                                TextView textView22 = (TextView) a.a(view2, R.id.village_town_city2);
                                                                                                                                                                                                if (textView22 != null) {
                                                                                                                                                                                                    return new w8((LinearLayout) view2, textView, textView2, linearLayout, appCompatTextView, spinner, editText, editText2, editText3, editText4, textView3, textView4, imageView, imageView2, appCompatTextView2, textView5, textView6, textView7, textView8, textView9, textView10, linearLayout2, appCompatTextView3, appCompatTextView4, editText5, editText6, editText7, editText8, textView11, spinner2, spinner3, cardView, textView12, textView13, a11, checkBox, spinner4, textView14, textView15, textView16, a13, textView17, textView18, cardView2, textView19, textView20, textView21, textView22);
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

    public static w8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static w8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vahan_change_of_address, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29193a;
    }
}
