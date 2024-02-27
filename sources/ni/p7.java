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
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import k1.a;

public final class p7 {
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final Spinner F;
    public final MyTextView G;
    public final LinearLayout H;
    public final qd I;
    public final TextView J;
    public final TextView K;
    public final Spinner L;
    public final MyTextView M;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f27960a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f27961b;

    /* renamed from: c  reason: collision with root package name */
    public final Spinner f27962c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f27963d;

    /* renamed from: e  reason: collision with root package name */
    public final Spinner f27964e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f27965f;

    /* renamed from: g  reason: collision with root package name */
    public final CustomWegetLayout f27966g;

    /* renamed from: h  reason: collision with root package name */
    public final Spinner f27967h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f27968i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f27969j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27970k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f27971l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f27972m;

    /* renamed from: n  reason: collision with root package name */
    public final Spinner f27973n;

    /* renamed from: o  reason: collision with root package name */
    public final EditText f27974o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f27975p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f27976q;

    /* renamed from: r  reason: collision with root package name */
    public final Spinner f27977r;

    /* renamed from: s  reason: collision with root package name */
    public final EditText f27978s;

    /* renamed from: t  reason: collision with root package name */
    public final MyTextView f27979t;

    /* renamed from: u  reason: collision with root package name */
    public final EditText f27980u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f27981v;

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f27982w;

    /* renamed from: x  reason: collision with root package name */
    public final CustomWegetLayout f27983x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f27984y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f27985z;

    private p7(ScrollView scrollView, MyTextView myTextView, Spinner spinner, EditText editText, Spinner spinner2, MyTextView myTextView2, CustomWegetLayout customWegetLayout, Spinner spinner3, MyTextView myTextView3, MyTextView myTextView4, TextView textView, MyTextView myTextView5, MyTextView myTextView6, Spinner spinner4, EditText editText2, MyTextView myTextView7, MyTextView myTextView8, Spinner spinner5, EditText editText3, MyTextView myTextView9, EditText editText4, MyTextView myTextView10, LinearLayout linearLayout, CustomWegetLayout customWegetLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, Spinner spinner6, MyTextView myTextView11, LinearLayout linearLayout2, qd qdVar, TextView textView2, TextView textView3, Spinner spinner7, MyTextView myTextView12) {
        this.f27960a = scrollView;
        this.f27961b = myTextView;
        this.f27962c = spinner;
        this.f27963d = editText;
        this.f27964e = spinner2;
        this.f27965f = myTextView2;
        this.f27966g = customWegetLayout;
        this.f27967h = spinner3;
        this.f27968i = myTextView3;
        this.f27969j = myTextView4;
        this.f27970k = textView;
        this.f27971l = myTextView5;
        this.f27972m = myTextView6;
        this.f27973n = spinner4;
        this.f27974o = editText2;
        this.f27975p = myTextView7;
        this.f27976q = myTextView8;
        this.f27977r = spinner5;
        this.f27978s = editText3;
        this.f27979t = myTextView9;
        this.f27980u = editText4;
        this.f27981v = myTextView10;
        this.f27982w = linearLayout;
        this.f27983x = customWegetLayout2;
        this.f27984y = imageView;
        this.f27985z = imageView2;
        this.A = imageView3;
        this.B = imageView4;
        this.C = imageView5;
        this.D = imageView6;
        this.E = imageView7;
        this.F = spinner6;
        this.G = myTextView11;
        this.H = linearLayout2;
        this.I = qdVar;
        this.J = textView2;
        this.K = textView3;
        this.L = spinner7;
        this.M = myTextView12;
    }

    public static p7 a(View view) {
        View view2 = view;
        int i10 = R.id.allotment_office_txt;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.allotment_office_txt);
        if (myTextView != null) {
            i10 = R.id.allotment_office_txt_spinner;
            Spinner spinner = (Spinner) a.a(view2, R.id.allotment_office_txt_spinner);
            if (spinner != null) {
                i10 = R.id.good_detail;
                EditText editText = (EditText) a.a(view2, R.id.good_detail);
                if (editText != null) {
                    i10 = R.id.goods_spinner;
                    Spinner spinner2 = (Spinner) a.a(view2, R.id.goods_spinner);
                    if (spinner2 != null) {
                        i10 = R.id.goods_txt;
                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.goods_txt);
                        if (myTextView2 != null) {
                            i10 = R.id.id_next_service;
                            CustomWegetLayout customWegetLayout = (CustomWegetLayout) a.a(view2, R.id.id_next_service);
                            if (customWegetLayout != null) {
                                i10 = R.id.nature_good_spinner;
                                Spinner spinner3 = (Spinner) a.a(view2, R.id.nature_good_spinner);
                                if (spinner3 != null) {
                                    i10 = R.id.nature_good_txt;
                                    MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.nature_good_txt);
                                    if (myTextView3 != null) {
                                        i10 = R.id.optional_details;
                                        MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.optional_details);
                                        if (myTextView4 != null) {
                                            i10 = R.id.period_enter;
                                            TextView textView = (TextView) a.a(view2, R.id.period_enter);
                                            if (textView != null) {
                                                i10 = R.id.period_txt;
                                                MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.period_txt);
                                                if (myTextView5 != null) {
                                                    i10 = R.id.permit_category;
                                                    MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.permit_category);
                                                    if (myTextView6 != null) {
                                                        i10 = R.id.permit_category_spinner;
                                                        Spinner spinner4 = (Spinner) a.a(view2, R.id.permit_category_spinner);
                                                        if (spinner4 != null) {
                                                            i10 = R.id.permit_no;
                                                            EditText editText2 = (EditText) a.a(view2, R.id.permit_no);
                                                            if (editText2 != null) {
                                                                i10 = R.id.permit_no_txt;
                                                                MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.permit_no_txt);
                                                                if (myTextView7 != null) {
                                                                    i10 = R.id.permit_type;
                                                                    MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.permit_type);
                                                                    if (myTextView8 != null) {
                                                                        i10 = R.id.permit_type_spinner;
                                                                        Spinner spinner5 = (Spinner) a.a(view2, R.id.permit_type_spinner);
                                                                        if (spinner5 != null) {
                                                                            i10 = R.id.permit_valid_from;
                                                                            EditText editText3 = (EditText) a.a(view2, R.id.permit_valid_from);
                                                                            if (editText3 != null) {
                                                                                i10 = R.id.permit_valid_from_txt;
                                                                                MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.permit_valid_from_txt);
                                                                                if (myTextView9 != null) {
                                                                                    i10 = R.id.permit_valid_upto;
                                                                                    EditText editText4 = (EditText) a.a(view2, R.id.permit_valid_upto);
                                                                                    if (editText4 != null) {
                                                                                        i10 = R.id.permit_valid_upto_txt;
                                                                                        MyTextView myTextView10 = (MyTextView) a.a(view2, R.id.permit_valid_upto_txt);
                                                                                        if (myTextView10 != null) {
                                                                                            i10 = R.id.police_fir_layout;
                                                                                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.police_fir_layout);
                                                                                            if (linearLayout != null) {
                                                                                                i10 = R.id.reset;
                                                                                                CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) a.a(view2, R.id.reset);
                                                                                                if (customWegetLayout2 != null) {
                                                                                                    i10 = R.id.rightGoodsPin;
                                                                                                    ImageView imageView = (ImageView) a.a(view2, R.id.rightGoodsPin);
                                                                                                    if (imageView != null) {
                                                                                                        i10 = R.id.rightNatureGoodPin;
                                                                                                        ImageView imageView2 = (ImageView) a.a(view2, R.id.rightNatureGoodPin);
                                                                                                        if (imageView2 != null) {
                                                                                                            i10 = R.id.rightServicesTypePin;
                                                                                                            ImageView imageView3 = (ImageView) a.a(view2, R.id.rightServicesTypePin);
                                                                                                            if (imageView3 != null) {
                                                                                                                i10 = R.id.rightYearlyModePin;
                                                                                                                ImageView imageView4 = (ImageView) a.a(view2, R.id.rightYearlyModePin);
                                                                                                                if (imageView4 != null) {
                                                                                                                    i10 = R.id.rightofficePin;
                                                                                                                    ImageView imageView5 = (ImageView) a.a(view2, R.id.rightofficePin);
                                                                                                                    if (imageView5 != null) {
                                                                                                                        i10 = R.id.rightpermitCategoryPin;
                                                                                                                        ImageView imageView6 = (ImageView) a.a(view2, R.id.rightpermitCategoryPin);
                                                                                                                        if (imageView6 != null) {
                                                                                                                            i10 = R.id.rightpermitTypePin;
                                                                                                                            ImageView imageView7 = (ImageView) a.a(view2, R.id.rightpermitTypePin);
                                                                                                                            if (imageView7 != null) {
                                                                                                                                i10 = R.id.services_type_spinner;
                                                                                                                                Spinner spinner6 = (Spinner) a.a(view2, R.id.services_type_spinner);
                                                                                                                                if (spinner6 != null) {
                                                                                                                                    i10 = R.id.services_type_txt;
                                                                                                                                    MyTextView myTextView11 = (MyTextView) a.a(view2, R.id.services_type_txt);
                                                                                                                                    if (myTextView11 != null) {
                                                                                                                                        i10 = R.id.text_exemption;
                                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.text_exemption);
                                                                                                                                        if (linearLayout2 != null) {
                                                                                                                                            i10 = R.id.topHolder;
                                                                                                                                            View a10 = a.a(view2, R.id.topHolder);
                                                                                                                                            if (a10 != null) {
                                                                                                                                                qd a11 = qd.a(a10);
                                                                                                                                                i10 = R.id.vehicleNumberTv;
                                                                                                                                                TextView textView2 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                                                                                                if (textView2 != null) {
                                                                                                                                                    i10 = R.id.vehicle_view;
                                                                                                                                                    TextView textView3 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                        i10 = R.id.yearly_mode_Spinner;
                                                                                                                                                        Spinner spinner7 = (Spinner) a.a(view2, R.id.yearly_mode_Spinner);
                                                                                                                                                        if (spinner7 != null) {
                                                                                                                                                            i10 = R.id.yearly_mode_txt;
                                                                                                                                                            MyTextView myTextView12 = (MyTextView) a.a(view2, R.id.yearly_mode_txt);
                                                                                                                                                            if (myTextView12 != null) {
                                                                                                                                                                return new p7((ScrollView) view2, myTextView, spinner, editText, spinner2, myTextView2, customWegetLayout, spinner3, myTextView3, myTextView4, textView, myTextView5, myTextView6, spinner4, editText2, myTextView7, myTextView8, spinner5, editText3, myTextView9, editText4, myTextView10, linearLayout, customWegetLayout2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, spinner6, myTextView11, linearLayout2, a11, textView2, textView3, spinner7, myTextView12);
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

    public static p7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static p7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_renewal_of_permit_main_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f27960a;
    }
}
