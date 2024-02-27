package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import de.hdodenhof.circleimageview.CircleImageView;
import k1.a;

public final class c8 {
    public final MyTextView A;
    public final MyTextView B;
    public final MyTextView C;
    public final MyTextView D;
    public final TextView E;
    public final TextView F;
    public final LinearLayout G;
    public final MyTextView H;
    public final MyTextView I;
    public final LinearLayout J;
    public final LinearLayout K;
    public final MyTextView L;

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f25632a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f25633b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25634c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25635d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f25636e;

    /* renamed from: f  reason: collision with root package name */
    public final MyTextView f25637f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25638g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f25639h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25640i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f25641j;

    /* renamed from: k  reason: collision with root package name */
    public final CircleImageView f25642k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f25643l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f25644m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f25645n;

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f25646o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f25647p;

    /* renamed from: q  reason: collision with root package name */
    public final MyTextView f25648q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f25649r;

    /* renamed from: s  reason: collision with root package name */
    public final MyTextView f25650s;

    /* renamed from: t  reason: collision with root package name */
    public final MyTextView f25651t;

    /* renamed from: u  reason: collision with root package name */
    public final MyTextView f25652u;

    /* renamed from: v  reason: collision with root package name */
    public final MyTextView f25653v;

    /* renamed from: w  reason: collision with root package name */
    public final MyTextView f25654w;

    /* renamed from: x  reason: collision with root package name */
    public final MyTextView f25655x;

    /* renamed from: y  reason: collision with root package name */
    public final MyTextView f25656y;

    /* renamed from: z  reason: collision with root package name */
    public final MyTextView f25657z;

    private c8(CoordinatorLayout coordinatorLayout, TextView textView, LinearLayout linearLayout, LinearLayout linearLayout2, MyTextView myTextView, MyTextView myTextView2, LinearLayout linearLayout3, MyTextView myTextView3, LinearLayout linearLayout4, LinearLayout linearLayout5, CircleImageView circleImageView, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, LinearLayout linearLayout6, MyTextView myTextView7, MyTextView myTextView8, MyTextView myTextView9, MyTextView myTextView10, MyTextView myTextView11, MyTextView myTextView12, MyTextView myTextView13, MyTextView myTextView14, MyTextView myTextView15, MyTextView myTextView16, MyTextView myTextView17, MyTextView myTextView18, MyTextView myTextView19, MyTextView myTextView20, MyTextView myTextView21, TextView textView2, TextView textView3, LinearLayout linearLayout7, MyTextView myTextView22, MyTextView myTextView23, LinearLayout linearLayout8, LinearLayout linearLayout9, MyTextView myTextView24) {
        this.f25632a = coordinatorLayout;
        this.f25633b = textView;
        this.f25634c = linearLayout;
        this.f25635d = linearLayout2;
        this.f25636e = myTextView;
        this.f25637f = myTextView2;
        this.f25638g = linearLayout3;
        this.f25639h = myTextView3;
        this.f25640i = linearLayout4;
        this.f25641j = linearLayout5;
        this.f25642k = circleImageView;
        this.f25643l = myTextView4;
        this.f25644m = myTextView5;
        this.f25645n = myTextView6;
        this.f25646o = linearLayout6;
        this.f25647p = myTextView7;
        this.f25648q = myTextView8;
        this.f25649r = myTextView9;
        this.f25650s = myTextView10;
        this.f25651t = myTextView11;
        this.f25652u = myTextView12;
        this.f25653v = myTextView13;
        this.f25654w = myTextView14;
        this.f25655x = myTextView15;
        this.f25656y = myTextView16;
        this.f25657z = myTextView17;
        this.A = myTextView18;
        this.B = myTextView19;
        this.C = myTextView20;
        this.D = myTextView21;
        this.E = textView2;
        this.F = textView3;
        this.G = linearLayout7;
        this.H = myTextView22;
        this.I = myTextView23;
        this.J = linearLayout8;
        this.K = linearLayout9;
        this.L = myTextView24;
    }

    public static c8 a(View view) {
        View view2 = view;
        int i10 = R.id.active;
        TextView textView = (TextView) a.a(view2, R.id.active);
        if (textView != null) {
            i10 = R.id.dl_layout;
            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.dl_layout);
            if (linearLayout != null) {
                i10 = R.id.dloldlinear;
                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.dloldlinear);
                if (linearLayout2 != null) {
                    i10 = R.id.drivinglicOldname;
                    MyTextView myTextView = (MyTextView) a.a(view2, R.id.drivinglicOldname);
                    if (myTextView != null) {
                        i10 = R.id.drivinglicOldnametxt;
                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.drivinglicOldnametxt);
                        if (myTextView2 != null) {
                            i10 = R.id.ll_create_dl;
                            LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.ll_create_dl);
                            if (linearLayout3 != null) {
                                i10 = R.id.maker_title;
                                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.maker_title);
                                if (myTextView3 != null) {
                                    i10 = R.id.nexgenarrow;
                                    LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                    if (linearLayout4 != null) {
                                        i10 = R.id.nexgenlogo;
                                        LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                        if (linearLayout5 != null) {
                                            i10 = R.id.owner_image;
                                            CircleImageView circleImageView = (CircleImageView) a.a(view2, R.id.owner_image);
                                            if (circleImageView != null) {
                                                i10 = R.id.registering_auth_title;
                                                MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.registering_auth_title);
                                                if (myTextView4 != null) {
                                                    i10 = R.id.registration_dt_title;
                                                    MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.registration_dt_title);
                                                    if (myTextView5 != null) {
                                                        i10 = R.id.trans_validity;
                                                        MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.trans_validity);
                                                        if (myTextView6 != null) {
                                                            i10 = R.id.transport_layout;
                                                            LinearLayout linearLayout6 = (LinearLayout) a.a(view2, R.id.transport_layout);
                                                            if (linearLayout6 != null) {
                                                                i10 = R.id.transvalidity_tv;
                                                                MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.transvalidity_tv);
                                                                if (myTextView7 != null) {
                                                                    i10 = R.id.tv_creat_virt_dl;
                                                                    MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.tv_creat_virt_dl);
                                                                    if (myTextView8 != null) {
                                                                        i10 = R.id.tv_dl;
                                                                        MyTextView myTextView9 = (MyTextView) a.a(view2, R.id.tv_dl);
                                                                        if (myTextView9 != null) {
                                                                            i10 = R.id.tv_driv_lic_hol_name;
                                                                            MyTextView myTextView10 = (MyTextView) a.a(view2, R.id.tv_driv_lic_hol_name);
                                                                            if (myTextView10 != null) {
                                                                                i10 = R.id.tv_issue_date;
                                                                                MyTextView myTextView11 = (MyTextView) a.a(view2, R.id.tv_issue_date);
                                                                                if (myTextView11 != null) {
                                                                                    i10 = R.id.tv_tap_check_dl;
                                                                                    MyTextView myTextView12 = (MyTextView) a.a(view2, R.id.tv_tap_check_dl);
                                                                                    if (myTextView12 != null) {
                                                                                        i10 = R.id.tv_view_challan;
                                                                                        MyTextView myTextView13 = (MyTextView) a.a(view2, R.id.tv_view_challan);
                                                                                        if (myTextView13 != null) {
                                                                                            i10 = R.id.txt_dl_holder_name;
                                                                                            MyTextView myTextView14 = (MyTextView) a.a(view2, R.id.txt_dl_holder_name);
                                                                                            if (myTextView14 != null) {
                                                                                                i10 = R.id.txt_dl_number;
                                                                                                MyTextView myTextView15 = (MyTextView) a.a(view2, R.id.txt_dl_number);
                                                                                                if (myTextView15 != null) {
                                                                                                    i10 = R.id.txt_issue_date;
                                                                                                    MyTextView myTextView16 = (MyTextView) a.a(view2, R.id.txt_issue_date);
                                                                                                    if (myTextView16 != null) {
                                                                                                        i10 = R.id.txt_lic_auth;
                                                                                                        MyTextView myTextView17 = (MyTextView) a.a(view2, R.id.txt_lic_auth);
                                                                                                        if (myTextView17 != null) {
                                                                                                            i10 = R.id.txt_lic_authority;
                                                                                                            MyTextView myTextView18 = (MyTextView) a.a(view2, R.id.txt_lic_authority);
                                                                                                            if (myTextView18 != null) {
                                                                                                                i10 = R.id.txt_lic_validity;
                                                                                                                MyTextView myTextView19 = (MyTextView) a.a(view2, R.id.txt_lic_validity);
                                                                                                                if (myTextView19 != null) {
                                                                                                                    i10 = R.id.txt_vehicle_class;
                                                                                                                    MyTextView myTextView20 = (MyTextView) a.a(view2, R.id.txt_vehicle_class);
                                                                                                                    if (myTextView20 != null) {
                                                                                                                        i10 = R.id.txt_vehicle_impound;
                                                                                                                        MyTextView myTextView21 = (MyTextView) a.a(view2, R.id.txt_vehicle_impound);
                                                                                                                        if (myTextView21 != null) {
                                                                                                                            i10 = R.id.txt_vehicle_impound_value;
                                                                                                                            TextView textView2 = (TextView) a.a(view2, R.id.txt_vehicle_impound_value);
                                                                                                                            if (textView2 != null) {
                                                                                                                                i10 = R.id.vahan_service_lable;
                                                                                                                                TextView textView3 = (TextView) a.a(view2, R.id.vahan_service_lable);
                                                                                                                                if (textView3 != null) {
                                                                                                                                    i10 = R.id.vclass_linear;
                                                                                                                                    LinearLayout linearLayout7 = (LinearLayout) a.a(view2, R.id.vclass_linear);
                                                                                                                                    if (linearLayout7 != null) {
                                                                                                                                        i10 = R.id.vehclasstv;
                                                                                                                                        MyTextView myTextView22 = (MyTextView) a.a(view2, R.id.vehclasstv);
                                                                                                                                        if (myTextView22 != null) {
                                                                                                                                            i10 = R.id.vehicle_class_title;
                                                                                                                                            MyTextView myTextView23 = (MyTextView) a.a(view2, R.id.vehicle_class_title);
                                                                                                                                            if (myTextView23 != null) {
                                                                                                                                                i10 = R.id.vehicleImpoundLl;
                                                                                                                                                LinearLayout linearLayout8 = (LinearLayout) a.a(view2, R.id.vehicleImpoundLl);
                                                                                                                                                if (linearLayout8 != null) {
                                                                                                                                                    i10 = R.id.viewChallanLl;
                                                                                                                                                    LinearLayout linearLayout9 = (LinearLayout) a.a(view2, R.id.viewChallanLl);
                                                                                                                                                    if (linearLayout9 != null) {
                                                                                                                                                        i10 = R.id.vtxt;
                                                                                                                                                        MyTextView myTextView24 = (MyTextView) a.a(view2, R.id.vtxt);
                                                                                                                                                        if (myTextView24 != null) {
                                                                                                                                                            return new c8((CoordinatorLayout) view2, textView, linearLayout, linearLayout2, myTextView, myTextView2, linearLayout3, myTextView3, linearLayout4, linearLayout5, circleImageView, myTextView4, myTextView5, myTextView6, linearLayout6, myTextView7, myTextView8, myTextView9, myTextView10, myTextView11, myTextView12, myTextView13, myTextView14, myTextView15, myTextView16, myTextView17, myTextView18, myTextView19, myTextView20, myTextView21, textView2, textView3, linearLayout7, myTextView22, myTextView23, linearLayout8, linearLayout9, myTextView24);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static c8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static c8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_search_dl, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f25632a;
    }
}
