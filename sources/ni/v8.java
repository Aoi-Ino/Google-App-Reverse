package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class v8 {
    public final ImageView A;
    public final ImageView B;
    public final EditText C;
    public final MyTextView D;
    public final EditText E;
    public final MyTextView F;
    public final EditText G;
    public final MyTextView H;
    public final qd I;
    public final EditText J;
    public final MyTextView K;
    public final TextView L;
    public final TextView M;
    public final Spinner N;
    public final MyTextView O;
    public final EditText P;
    public final MyTextView Q;
    public final EditText R;
    public final MyTextView S;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f29016a;

    /* renamed from: b  reason: collision with root package name */
    public final Spinner f29017b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f29018c;

    /* renamed from: d  reason: collision with root package name */
    public final Spinner f29019d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f29020e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f29021f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f29022g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatButton f29023h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f29024i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f29025j;

    /* renamed from: k  reason: collision with root package name */
    public final EditText f29026k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f29027l;

    /* renamed from: m  reason: collision with root package name */
    public final Spinner f29028m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f29029n;

    /* renamed from: o  reason: collision with root package name */
    public final EditText f29030o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f29031p;

    /* renamed from: q  reason: collision with root package name */
    public final EditText f29032q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f29033r;

    /* renamed from: s  reason: collision with root package name */
    public final EditText f29034s;

    /* renamed from: t  reason: collision with root package name */
    public final MyTextView f29035t;

    /* renamed from: u  reason: collision with root package name */
    public final EditText f29036u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f29037v;

    /* renamed from: w  reason: collision with root package name */
    public final EditText f29038w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f29039x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f29040y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f29041z;

    private v8(ScrollView scrollView, Spinner spinner, MyTextView myTextView, Spinner spinner2, MyTextView myTextView2, EditText editText, MyTextView myTextView3, AppCompatButton appCompatButton, EditText editText2, MyTextView myTextView4, EditText editText3, MyTextView myTextView5, Spinner spinner3, MyTextView myTextView6, EditText editText4, MyTextView myTextView7, EditText editText5, MyTextView myTextView8, EditText editText6, MyTextView myTextView9, EditText editText7, MyTextView myTextView10, EditText editText8, MyTextView myTextView11, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, EditText editText9, MyTextView myTextView12, EditText editText10, MyTextView myTextView13, EditText editText11, MyTextView myTextView14, qd qdVar, EditText editText12, MyTextView myTextView15, TextView textView, TextView textView2, Spinner spinner4, MyTextView myTextView16, EditText editText13, MyTextView myTextView17, EditText editText14, MyTextView myTextView18) {
        this.f29016a = scrollView;
        this.f29017b = spinner;
        this.f29018c = myTextView;
        this.f29019d = spinner2;
        this.f29020e = myTextView2;
        this.f29021f = editText;
        this.f29022g = myTextView3;
        this.f29023h = appCompatButton;
        this.f29024i = editText2;
        this.f29025j = myTextView4;
        this.f29026k = editText3;
        this.f29027l = myTextView5;
        this.f29028m = spinner3;
        this.f29029n = myTextView6;
        this.f29030o = editText4;
        this.f29031p = myTextView7;
        this.f29032q = editText5;
        this.f29033r = myTextView8;
        this.f29034s = editText6;
        this.f29035t = myTextView9;
        this.f29036u = editText7;
        this.f29037v = myTextView10;
        this.f29038w = editText8;
        this.f29039x = myTextView11;
        this.f29040y = imageView;
        this.f29041z = imageView2;
        this.A = imageView3;
        this.B = imageView4;
        this.C = editText9;
        this.D = myTextView12;
        this.E = editText10;
        this.F = myTextView13;
        this.G = editText11;
        this.H = myTextView14;
        this.I = qdVar;
        this.J = editText12;
        this.K = myTextView15;
        this.L = textView;
        this.M = textView2;
        this.N = spinner4;
        this.O = myTextView16;
        this.P = editText13;
        this.Q = myTextView17;
        this.R = editText14;
        this.S = myTextView18;
    }

    public static v8 a(View view) {
        View view2 = view;
        int i10 = R.id.ac_fitted_spinner;
        Spinner spinner = (Spinner) a.a(view2, R.id.ac_fitted_spinner);
        if (spinner != null) {
            i10 = R.id.ac_fitted_txt;
            MyTextView myTextView = (MyTextView) a.a(view2, R.id.ac_fitted_txt);
            if (myTextView != null) {
                i10 = R.id.audio_fitted_spinner;
                Spinner spinner2 = (Spinner) a.a(view2, R.id.audio_fitted_spinner);
                if (spinner2 != null) {
                    i10 = R.id.audio_fitted_txt;
                    MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.audio_fitted_txt);
                    if (myTextView2 != null) {
                        i10 = R.id.body_type;
                        EditText editText = (EditText) a.a(view2, R.id.body_type);
                        if (editText != null) {
                            i10 = R.id.body_type_text;
                            MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.body_type_text);
                            if (myTextView3 != null) {
                                i10 = R.id.btnSubmit;
                                AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btnSubmit);
                                if (appCompatButton != null) {
                                    i10 = R.id.color;
                                    EditText editText2 = (EditText) a.a(view2, R.id.color);
                                    if (editText2 != null) {
                                        i10 = R.id.color_txt;
                                        MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.color_txt);
                                        if (myTextView4 != null) {
                                            i10 = R.id.cubic_capacity;
                                            EditText editText3 = (EditText) a.a(view2, R.id.cubic_capacity);
                                            if (editText3 != null) {
                                                i10 = R.id.cubic_capacity_txt;
                                                MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.cubic_capacity_txt);
                                                if (myTextView5 != null) {
                                                    i10 = R.id.fuel_spinner;
                                                    Spinner spinner3 = (Spinner) a.a(view2, R.id.fuel_spinner);
                                                    if (spinner3 != null) {
                                                        i10 = R.id.fuel_txt;
                                                        MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.fuel_txt);
                                                        if (myTextView6 != null) {
                                                            i10 = R.id.height;
                                                            EditText editText4 = (EditText) a.a(view2, R.id.height);
                                                            if (editText4 != null) {
                                                                i10 = R.id.height_txt;
                                                                MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.height_txt);
                                                                if (myTextView7 != null) {
                                                                    i10 = R.id.horse_power;
                                                                    EditText editText5 = (EditText) a.a(view2, R.id.horse_power);
                                                                    if (editText5 != null) {
                                                                        i10 = R.id.horse_power_txt;
                                                                        MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.horse_power_txt);
                                                                        if (myTextView8 != null) {
                                                                            i10 = R.id.laden_weight;
                                                                            EditText editText6 = (EditText) a.a(view2, R.id.laden_weight);
                                                                            if (editText6 != null) {
                                                                                i10 = R.id.laden_weight_txt;
                                                                                MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.laden_weight_txt);
                                                                                if (myTextView9 != null) {
                                                                                    i10 = R.id.length;
                                                                                    EditText editText7 = (EditText) a.a(view2, R.id.length);
                                                                                    if (editText7 != null) {
                                                                                        i10 = R.id.length_txt;
                                                                                        MyTextView myTextView10 = (MyTextView) a.a(view2, R.id.length_txt);
                                                                                        if (myTextView10 != null) {
                                                                                            i10 = R.id.no_of_cylinders;
                                                                                            EditText editText8 = (EditText) a.a(view2, R.id.no_of_cylinders);
                                                                                            if (editText8 != null) {
                                                                                                i10 = R.id.no_of_cylinders_txt;
                                                                                                MyTextView myTextView11 = (MyTextView) a.a(view2, R.id.no_of_cylinders_txt);
                                                                                                if (myTextView11 != null) {
                                                                                                    i10 = R.id.rightAcFittedPin;
                                                                                                    ImageView imageView = (ImageView) a.a(view2, R.id.rightAcFittedPin);
                                                                                                    if (imageView != null) {
                                                                                                        i10 = R.id.rightAudioFittedPin;
                                                                                                        ImageView imageView2 = (ImageView) a.a(view2, R.id.rightAudioFittedPin);
                                                                                                        if (imageView2 != null) {
                                                                                                            i10 = R.id.rightFuelPin;
                                                                                                            ImageView imageView3 = (ImageView) a.a(view2, R.id.rightFuelPin);
                                                                                                            if (imageView3 != null) {
                                                                                                                i10 = R.id.rightVideoFittedPin;
                                                                                                                ImageView imageView4 = (ImageView) a.a(view2, R.id.rightVideoFittedPin);
                                                                                                                if (imageView4 != null) {
                                                                                                                    i10 = R.id.seating_capacity;
                                                                                                                    EditText editText9 = (EditText) a.a(view2, R.id.seating_capacity);
                                                                                                                    if (editText9 != null) {
                                                                                                                        i10 = R.id.seating_capacity_txt;
                                                                                                                        MyTextView myTextView12 = (MyTextView) a.a(view2, R.id.seating_capacity_txt);
                                                                                                                        if (myTextView12 != null) {
                                                                                                                            i10 = R.id.sleeper_capacity;
                                                                                                                            EditText editText10 = (EditText) a.a(view2, R.id.sleeper_capacity);
                                                                                                                            if (editText10 != null) {
                                                                                                                                i10 = R.id.sleeper_capacity_txt;
                                                                                                                                MyTextView myTextView13 = (MyTextView) a.a(view2, R.id.sleeper_capacity_txt);
                                                                                                                                if (myTextView13 != null) {
                                                                                                                                    i10 = R.id.standing_capacity;
                                                                                                                                    EditText editText11 = (EditText) a.a(view2, R.id.standing_capacity);
                                                                                                                                    if (editText11 != null) {
                                                                                                                                        i10 = R.id.standing_capacity_txt;
                                                                                                                                        MyTextView myTextView14 = (MyTextView) a.a(view2, R.id.standing_capacity_txt);
                                                                                                                                        if (myTextView14 != null) {
                                                                                                                                            i10 = R.id.topHolder;
                                                                                                                                            View a10 = a.a(view2, R.id.topHolder);
                                                                                                                                            if (a10 != null) {
                                                                                                                                                qd a11 = qd.a(a10);
                                                                                                                                                i10 = R.id.unladen_weight;
                                                                                                                                                EditText editText12 = (EditText) a.a(view2, R.id.unladen_weight);
                                                                                                                                                if (editText12 != null) {
                                                                                                                                                    i10 = R.id.unladen_weight_txt;
                                                                                                                                                    MyTextView myTextView15 = (MyTextView) a.a(view2, R.id.unladen_weight_txt);
                                                                                                                                                    if (myTextView15 != null) {
                                                                                                                                                        i10 = R.id.vehicleNumberTv;
                                                                                                                                                        TextView textView = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                                                                                                        if (textView != null) {
                                                                                                                                                            i10 = R.id.vehicle_view;
                                                                                                                                                            TextView textView2 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                                                            if (textView2 != null) {
                                                                                                                                                                i10 = R.id.video_fitted_spinner;
                                                                                                                                                                Spinner spinner4 = (Spinner) a.a(view2, R.id.video_fitted_spinner);
                                                                                                                                                                if (spinner4 != null) {
                                                                                                                                                                    i10 = R.id.video_fitted_txt;
                                                                                                                                                                    MyTextView myTextView16 = (MyTextView) a.a(view2, R.id.video_fitted_txt);
                                                                                                                                                                    if (myTextView16 != null) {
                                                                                                                                                                        i10 = R.id.wheelbase;
                                                                                                                                                                        EditText editText13 = (EditText) a.a(view2, R.id.wheelbase);
                                                                                                                                                                        if (editText13 != null) {
                                                                                                                                                                            i10 = R.id.wheelbase_txt;
                                                                                                                                                                            MyTextView myTextView17 = (MyTextView) a.a(view2, R.id.wheelbase_txt);
                                                                                                                                                                            if (myTextView17 != null) {
                                                                                                                                                                                i10 = R.id.width;
                                                                                                                                                                                EditText editText14 = (EditText) a.a(view2, R.id.width);
                                                                                                                                                                                if (editText14 != null) {
                                                                                                                                                                                    i10 = R.id.width_txt;
                                                                                                                                                                                    MyTextView myTextView18 = (MyTextView) a.a(view2, R.id.width_txt);
                                                                                                                                                                                    if (myTextView18 != null) {
                                                                                                                                                                                        return new v8((ScrollView) view2, spinner, myTextView, spinner2, myTextView2, editText, myTextView3, appCompatButton, editText2, myTextView4, editText3, myTextView5, spinner3, myTextView6, editText4, myTextView7, editText5, myTextView8, editText6, myTextView9, editText7, myTextView10, editText8, myTextView11, imageView, imageView2, imageView3, imageView4, editText9, myTextView12, editText10, myTextView13, editText11, myTextView14, a11, editText12, myTextView15, textView, textView2, spinner4, myTextView16, editText13, myTextView17, editText14, myTextView18);
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

    public static v8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static v8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vahan_alteration_of_vehicle, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f29016a;
    }
}
