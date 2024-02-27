package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import k1.a;

public final class a9 {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f25246a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatButton f25247b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatButton f25248c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatButton f25249d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatTextView f25250e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatEditText f25251f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25252g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25253h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25254i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25255j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f25256k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatButton f25257l;

    /* renamed from: m  reason: collision with root package name */
    public final AppCompatButton f25258m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f25259n;

    /* renamed from: o  reason: collision with root package name */
    public final qd f25260o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f25261p;

    /* renamed from: q  reason: collision with root package name */
    public final LinearLayout f25262q;

    /* renamed from: r  reason: collision with root package name */
    public final AppCompatTextView f25263r;

    /* renamed from: s  reason: collision with root package name */
    public final AppCompatEditText f25264s;

    /* renamed from: t  reason: collision with root package name */
    public final RecyclerView f25265t;

    private a9(CoordinatorLayout coordinatorLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3, AppCompatTextView appCompatTextView, AppCompatEditText appCompatEditText, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout2, AppCompatButton appCompatButton4, AppCompatButton appCompatButton5, LinearLayout linearLayout3, qd qdVar, TextView textView4, LinearLayout linearLayout4, AppCompatTextView appCompatTextView2, AppCompatEditText appCompatEditText2, RecyclerView recyclerView) {
        this.f25246a = coordinatorLayout;
        this.f25247b = appCompatButton;
        this.f25248c = appCompatButton2;
        this.f25249d = appCompatButton3;
        this.f25250e = appCompatTextView;
        this.f25251f = appCompatEditText;
        this.f25252g = linearLayout;
        this.f25253h = textView;
        this.f25254i = textView2;
        this.f25255j = textView3;
        this.f25256k = linearLayout2;
        this.f25257l = appCompatButton4;
        this.f25258m = appCompatButton5;
        this.f25259n = linearLayout3;
        this.f25260o = qdVar;
        this.f25261p = textView4;
        this.f25262q = linearLayout4;
        this.f25263r = appCompatTextView2;
        this.f25264s = appCompatEditText2;
        this.f25265t = recyclerView;
    }

    public static a9 a(View view) {
        View view2 = view;
        int i10 = R.id.btn_cancel;
        AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.btn_cancel);
        if (appCompatButton != null) {
            i10 = R.id.btn_my_vehicle;
            AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view2, R.id.btn_my_vehicle);
            if (appCompatButton2 != null) {
                i10 = R.id.btn_othe_vehicle;
                AppCompatButton appCompatButton3 = (AppCompatButton) a.a(view2, R.id.btn_othe_vehicle);
                if (appCompatButton3 != null) {
                    i10 = R.id.chasis_no_last_five_digits;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.chasis_no_last_five_digits);
                    if (appCompatTextView != null) {
                        i10 = R.id.chassi_number;
                        AppCompatEditText appCompatEditText = (AppCompatEditText) a.a(view2, R.id.chassi_number);
                        if (appCompatEditText != null) {
                            i10 = R.id.enter_new_vehicle_linear;
                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.enter_new_vehicle_linear);
                            if (linearLayout != null) {
                                i10 = R.id.enter_vehicle_no;
                                TextView textView = (TextView) a.a(view2, R.id.enter_vehicle_no);
                                if (textView != null) {
                                    i10 = R.id.new_note;
                                    TextView textView2 = (TextView) a.a(view2, R.id.new_note);
                                    if (textView2 != null) {
                                        i10 = R.id.notes;
                                        TextView textView3 = (TextView) a.a(view2, R.id.notes);
                                        if (textView3 != null) {
                                            i10 = R.id.other_New_VehicleLayout;
                                            LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.other_New_VehicleLayout);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.reset_button;
                                                AppCompatButton appCompatButton4 = (AppCompatButton) a.a(view2, R.id.reset_button);
                                                if (appCompatButton4 != null) {
                                                    i10 = R.id.submit_button;
                                                    AppCompatButton appCompatButton5 = (AppCompatButton) a.a(view2, R.id.submit_button);
                                                    if (appCompatButton5 != null) {
                                                        i10 = R.id.submit_layout;
                                                        LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.submit_layout);
                                                        if (linearLayout3 != null) {
                                                            i10 = R.id.topHolder;
                                                            View a10 = a.a(view2, R.id.topHolder);
                                                            if (a10 != null) {
                                                                qd a11 = qd.a(a10);
                                                                i10 = R.id.vahan_service_lable;
                                                                TextView textView4 = (TextView) a.a(view2, R.id.vahan_service_lable);
                                                                if (textView4 != null) {
                                                                    i10 = R.id.vehicle_linear;
                                                                    LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.vehicle_linear);
                                                                    if (linearLayout4 != null) {
                                                                        i10 = R.id.vehicle_no;
                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.vehicle_no);
                                                                        if (appCompatTextView2 != null) {
                                                                            i10 = R.id.vehicle_number;
                                                                            AppCompatEditText appCompatEditText2 = (AppCompatEditText) a.a(view2, R.id.vehicle_number);
                                                                            if (appCompatEditText2 != null) {
                                                                                i10 = R.id.vehicleServiceRecycler;
                                                                                RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.vehicleServiceRecycler);
                                                                                if (recyclerView != null) {
                                                                                    return new a9((CoordinatorLayout) view2, appCompatButton, appCompatButton2, appCompatButton3, appCompatTextView, appCompatEditText, linearLayout, textView, textView2, textView3, linearLayout2, appCompatButton4, appCompatButton5, linearLayout3, a11, textView4, linearLayout4, appCompatTextView2, appCompatEditText2, recyclerView);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static a9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static a9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vahan_main_view_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f25246a;
    }
}
