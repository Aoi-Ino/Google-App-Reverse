package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class fd {
    public final ImageView A;
    public final Spinner B;
    public final MyTextView C;
    public final qd D;
    public final EditText E;
    public final MyTextView F;
    public final EditText G;
    public final MyTextView H;
    public final MyTextView I;
    public final MyTextView J;
    public final MyTextView K;
    public final MyTextView L;
    public final MyTextView M;
    public final MyTextView N;
    public final TextView O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f26363a;

    /* renamed from: b  reason: collision with root package name */
    public final Spinner f26364b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26365c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatButton f26366d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26367e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f26368f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26369g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f26370h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f26371i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f26372j;

    /* renamed from: k  reason: collision with root package name */
    public final Spinner f26373k;

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f26374l;

    /* renamed from: m  reason: collision with root package name */
    public final Spinner f26375m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f26376n;

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f26377o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26378p;

    /* renamed from: q  reason: collision with root package name */
    public final Spinner f26379q;

    /* renamed from: r  reason: collision with root package name */
    public final Spinner f26380r;

    /* renamed from: s  reason: collision with root package name */
    public final ImageView f26381s;

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f26382t;

    /* renamed from: u  reason: collision with root package name */
    public final MyTextView f26383u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f26384v;

    /* renamed from: w  reason: collision with root package name */
    public final MyTextView f26385w;

    /* renamed from: x  reason: collision with root package name */
    public final EditText f26386x;

    /* renamed from: y  reason: collision with root package name */
    public final MyTextView f26387y;

    /* renamed from: z  reason: collision with root package name */
    public final EditText f26388z;

    private fd(ScrollView scrollView, Spinner spinner, TextView textView, AppCompatButton appCompatButton, TextView textView2, MyTextView myTextView, ImageView imageView, MyTextView myTextView2, EditText editText, ImageView imageView2, Spinner spinner2, LinearLayout linearLayout, Spinner spinner3, MyTextView myTextView3, ImageView imageView3, TextView textView3, Spinner spinner4, Spinner spinner5, ImageView imageView4, LinearLayout linearLayout2, MyTextView myTextView4, ImageView imageView5, MyTextView myTextView5, EditText editText2, MyTextView myTextView6, EditText editText3, ImageView imageView6, Spinner spinner6, MyTextView myTextView7, qd qdVar, EditText editText4, MyTextView myTextView8, EditText editText5, MyTextView myTextView9, MyTextView myTextView10, MyTextView myTextView11, MyTextView myTextView12, MyTextView myTextView13, MyTextView myTextView14, MyTextView myTextView15, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f26363a = scrollView;
        this.f26364b = spinner;
        this.f26365c = textView;
        this.f26366d = appCompatButton;
        this.f26367e = textView2;
        this.f26368f = myTextView;
        this.f26369g = imageView;
        this.f26370h = myTextView2;
        this.f26371i = editText;
        this.f26372j = imageView2;
        this.f26373k = spinner2;
        this.f26374l = linearLayout;
        this.f26375m = spinner3;
        this.f26376n = myTextView3;
        this.f26377o = imageView3;
        this.f26378p = textView3;
        this.f26379q = spinner4;
        this.f26380r = spinner5;
        this.f26381s = imageView4;
        this.f26382t = linearLayout2;
        this.f26383u = myTextView4;
        this.f26384v = imageView5;
        this.f26385w = myTextView5;
        this.f26386x = editText2;
        this.f26387y = myTextView6;
        this.f26388z = editText3;
        this.A = imageView6;
        this.B = spinner6;
        this.C = myTextView7;
        this.D = qdVar;
        this.E = editText4;
        this.F = myTextView8;
        this.G = editText5;
        this.H = myTextView9;
        this.I = myTextView10;
        this.J = myTextView11;
        this.K = myTextView12;
        this.L = myTextView13;
        this.M = myTextView14;
        this.N = myTextView15;
        this.O = textView4;
        this.P = textView5;
        this.Q = textView6;
        this.R = textView7;
    }

    public static fd a(View view) {
        View view2 = view;
        int i10 = R.id.Good_Spinner;
        Spinner spinner = (Spinner) a.a(view2, R.id.Good_Spinner);
        if (spinner != null) {
            i10 = R.id.addPasander;
            TextView textView = (TextView) a.a(view2, R.id.addPasander);
            if (textView != null) {
                i10 = R.id.btnSubmit;
                AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btnSubmit);
                if (appCompatButton != null) {
                    i10 = R.id.firDateTv;
                    TextView textView2 = (TextView) a.a(view2, R.id.firDateTv);
                    if (textView2 != null) {
                        i10 = R.id.goodDetailTxt;
                        MyTextView myTextView = (MyTextView) a.a(view2, R.id.goodDetailTxt);
                        if (myTextView != null) {
                            i10 = R.id.goodPin;
                            ImageView imageView = (ImageView) a.a(view2, R.id.goodPin);
                            if (imageView != null) {
                                i10 = R.id.goodTxt;
                                MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.goodTxt);
                                if (myTextView2 != null) {
                                    i10 = R.id.goodsdetails;
                                    EditText editText = (EditText) a.a(view2, R.id.goodsdetails);
                                    if (editText != null) {
                                        i10 = R.id.journyPin;
                                        ImageView imageView2 = (ImageView) a.a(view2, R.id.journyPin);
                                        if (imageView2 != null) {
                                            i10 = R.id.journy_spinner;
                                            Spinner spinner2 = (Spinner) a.a(view2, R.id.journy_spinner);
                                            if (spinner2 != null) {
                                                i10 = R.id.linear_validupto;
                                                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.linear_validupto);
                                                if (linearLayout != null) {
                                                    i10 = R.id.naturGood_Spinner;
                                                    Spinner spinner3 = (Spinner) a.a(view2, R.id.naturGood_Spinner);
                                                    if (spinner3 != null) {
                                                        i10 = R.id.natureOfGoodsTxt;
                                                        MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.natureOfGoodsTxt);
                                                        if (myTextView3 != null) {
                                                            i10 = R.id.naturePin;
                                                            ImageView imageView3 = (ImageView) a.a(view2, R.id.naturePin);
                                                            if (imageView3 != null) {
                                                                i10 = R.id.office;
                                                                TextView textView3 = (TextView) a.a(view2, R.id.office);
                                                                if (textView3 != null) {
                                                                    i10 = R.id.period;
                                                                    Spinner spinner4 = (Spinner) a.a(view2, R.id.period);
                                                                    if (spinner4 != null) {
                                                                        i10 = R.id.periodmodespin;
                                                                        Spinner spinner5 = (Spinner) a.a(view2, R.id.periodmodespin);
                                                                        if (spinner5 != null) {
                                                                            i10 = R.id.periodpin;
                                                                            ImageView imageView4 = (ImageView) a.a(view2, R.id.periodpin);
                                                                            if (imageView4 != null) {
                                                                                i10 = R.id.police_fir_layout;
                                                                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.police_fir_layout);
                                                                                if (linearLayout2 != null) {
                                                                                    i10 = R.id.purposeOfJourneyTxt;
                                                                                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.purposeOfJourneyTxt);
                                                                                    if (myTextView4 != null) {
                                                                                        i10 = R.id.rightReasonPin;
                                                                                        ImageView imageView5 = (ImageView) a.a(view2, R.id.rightReasonPin);
                                                                                        if (imageView5 != null) {
                                                                                            i10 = R.id.routeDescTxt;
                                                                                            MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.routeDescTxt);
                                                                                            if (myTextView5 != null) {
                                                                                                i10 = R.id.route_length;
                                                                                                EditText editText2 = (EditText) a.a(view2, R.id.route_length);
                                                                                                if (editText2 != null) {
                                                                                                    i10 = R.id.routeLengthTxt;
                                                                                                    MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.routeLengthTxt);
                                                                                                    if (myTextView6 != null) {
                                                                                                        i10 = R.id.routedescription;
                                                                                                        EditText editText3 = (EditText) a.a(view2, R.id.routedescription);
                                                                                                        if (editText3 != null) {
                                                                                                            i10 = R.id.servicePin;
                                                                                                            ImageView imageView6 = (ImageView) a.a(view2, R.id.servicePin);
                                                                                                            if (imageView6 != null) {
                                                                                                                i10 = R.id.service_type;
                                                                                                                Spinner spinner6 = (Spinner) a.a(view2, R.id.service_type);
                                                                                                                if (spinner6 != null) {
                                                                                                                    i10 = R.id.servicesTypeTxt;
                                                                                                                    MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.servicesTypeTxt);
                                                                                                                    if (myTextView7 != null) {
                                                                                                                        i10 = R.id.tempHeader;
                                                                                                                        View a10 = a.a(view2, R.id.tempHeader);
                                                                                                                        if (a10 != null) {
                                                                                                                            qd a11 = qd.a(a10);
                                                                                                                            i10 = R.id.travelFrom;
                                                                                                                            EditText editText4 = (EditText) a.a(view2, R.id.travelFrom);
                                                                                                                            if (editText4 != null) {
                                                                                                                                i10 = R.id.travelFromTxt;
                                                                                                                                MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.travelFromTxt);
                                                                                                                                if (myTextView8 != null) {
                                                                                                                                    i10 = R.id.travelUpto;
                                                                                                                                    EditText editText5 = (EditText) a.a(view2, R.id.travelUpto);
                                                                                                                                    if (editText5 != null) {
                                                                                                                                        i10 = R.id.travelUptoTxt;
                                                                                                                                        MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.travelUptoTxt);
                                                                                                                                        if (myTextView9 != null) {
                                                                                                                                            i10 = R.id.vahan_details_duplicate_rc;
                                                                                                                                            MyTextView myTextView10 = (MyTextView) a.a(view2, R.id.vahan_details_duplicate_rc);
                                                                                                                                            if (myTextView10 != null) {
                                                                                                                                                i10 = R.id.vahan_fir_date;
                                                                                                                                                MyTextView myTextView11 = (MyTextView) a.a(view2, R.id.vahan_fir_date);
                                                                                                                                                if (myTextView11 != null) {
                                                                                                                                                    i10 = R.id.vahan_police_station;
                                                                                                                                                    MyTextView myTextView12 = (MyTextView) a.a(view2, R.id.vahan_police_station);
                                                                                                                                                    if (myTextView12 != null) {
                                                                                                                                                        i10 = R.id.vahan_reason;
                                                                                                                                                        MyTextView myTextView13 = (MyTextView) a.a(view2, R.id.vahan_reason);
                                                                                                                                                        if (myTextView13 != null) {
                                                                                                                                                            i10 = R.id.vahan_report_no;
                                                                                                                                                            MyTextView myTextView14 = (MyTextView) a.a(view2, R.id.vahan_report_no);
                                                                                                                                                            if (myTextView14 != null) {
                                                                                                                                                                i10 = R.id.vahan_required_document;
                                                                                                                                                                MyTextView myTextView15 = (MyTextView) a.a(view2, R.id.vahan_required_document);
                                                                                                                                                                if (myTextView15 != null) {
                                                                                                                                                                    i10 = R.id.validUpto;
                                                                                                                                                                    TextView textView4 = (TextView) a.a(view2, R.id.validUpto);
                                                                                                                                                                    if (textView4 != null) {
                                                                                                                                                                        i10 = R.id.vehicleNumberTv;
                                                                                                                                                                        TextView textView5 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                                            i10 = R.id.vehicle_view;
                                                                                                                                                                            TextView textView6 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                i10 = R.id.viewPassanger;
                                                                                                                                                                                TextView textView7 = (TextView) a.a(view2, R.id.viewPassanger);
                                                                                                                                                                                if (textView7 != null) {
                                                                                                                                                                                    return new fd((ScrollView) view2, spinner, textView, appCompatButton, textView2, myTextView, imageView, myTextView2, editText, imageView2, spinner2, linearLayout, spinner3, myTextView3, imageView3, textView3, spinner4, spinner5, imageView4, linearLayout2, myTextView4, imageView5, myTextView5, editText2, myTextView6, editText3, imageView6, spinner6, myTextView7, a11, editText4, myTextView8, editText5, myTextView9, myTextView10, myTextView11, myTextView12, myTextView13, myTextView14, myTextView15, textView4, textView5, textView6, textView7);
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

    public static fd c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static fd d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.temporary_permit_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f26363a;
    }
}
