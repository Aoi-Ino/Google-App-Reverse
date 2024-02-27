package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import k1.a;

public final class o7 {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f27765a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f27766b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f27767c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f27768d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f27769e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f27770f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f27771g;

    /* renamed from: h  reason: collision with root package name */
    public final CustomWegetLayout f27772h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f27773i;

    /* renamed from: j  reason: collision with root package name */
    public final CheckBox f27774j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f27775k;

    /* renamed from: l  reason: collision with root package name */
    public final EditText f27776l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f27777m;

    /* renamed from: n  reason: collision with root package name */
    public final RecyclerView f27778n;

    /* renamed from: o  reason: collision with root package name */
    public final CustomWegetLayout f27779o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f27780p;

    /* renamed from: q  reason: collision with root package name */
    public final LinearLayout f27781q;

    /* renamed from: r  reason: collision with root package name */
    public final qd f27782r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f27783s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f27784t;

    /* renamed from: u  reason: collision with root package name */
    public final CheckBox f27785u;

    private o7(ScrollView scrollView, MyTextView myTextView, LinearLayout linearLayout, MyTextView myTextView2, LinearLayout linearLayout2, EditText editText, MyTextView myTextView3, CustomWegetLayout customWegetLayout, MyTextView myTextView4, CheckBox checkBox, LinearLayout linearLayout3, EditText editText2, MyTextView myTextView5, RecyclerView recyclerView, CustomWegetLayout customWegetLayout2, TextView textView, LinearLayout linearLayout4, qd qdVar, TextView textView2, TextView textView3, CheckBox checkBox2) {
        this.f27765a = scrollView;
        this.f27766b = myTextView;
        this.f27767c = linearLayout;
        this.f27768d = myTextView2;
        this.f27769e = linearLayout2;
        this.f27770f = editText;
        this.f27771g = myTextView3;
        this.f27772h = customWegetLayout;
        this.f27773i = myTextView4;
        this.f27774j = checkBox;
        this.f27775k = linearLayout3;
        this.f27776l = editText2;
        this.f27777m = myTextView5;
        this.f27778n = recyclerView;
        this.f27779o = customWegetLayout2;
        this.f27780p = textView;
        this.f27781q = linearLayout4;
        this.f27782r = qdVar;
        this.f27783s = textView2;
        this.f27784t = textView3;
        this.f27785u = checkBox2;
    }

    public static o7 a(View view) {
        View view2 = view;
        int i10 = R.id.area_detail;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.area_detail);
        if (myTextView != null) {
            i10 = R.id.area_details_layout;
            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.area_details_layout);
            if (linearLayout != null) {
                i10 = R.id.area_selected;
                MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.area_selected);
                if (myTextView2 != null) {
                    i10 = R.id.area_selected_details;
                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.area_selected_details);
                    if (linearLayout2 != null) {
                        i10 = R.id.enter_parking;
                        EditText editText = (EditText) a.a(view2, R.id.enter_parking);
                        if (editText != null) {
                            i10 = R.id.enter_parking_txt;
                            MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.enter_parking_txt);
                            if (myTextView3 != null) {
                                i10 = R.id.id_next_service;
                                CustomWegetLayout customWegetLayout = (CustomWegetLayout) a.a(view2, R.id.id_next_service);
                                if (customWegetLayout != null) {
                                    i10 = R.id.optional_details;
                                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.optional_details);
                                    if (myTextView4 != null) {
                                        i10 = R.id.other_area;
                                        CheckBox checkBox = (CheckBox) a.a(view2, R.id.other_area);
                                        if (checkBox != null) {
                                            i10 = R.id.police_fir_layout;
                                            LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.police_fir_layout);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.purpose_of_journey;
                                                EditText editText2 = (EditText) a.a(view2, R.id.purpose_of_journey);
                                                if (editText2 != null) {
                                                    i10 = R.id.purpose_of_journey_txt;
                                                    MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.purpose_of_journey_txt);
                                                    if (myTextView5 != null) {
                                                        i10 = R.id.reginRecycle;
                                                        RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.reginRecycle);
                                                        if (recyclerView != null) {
                                                            i10 = R.id.reset;
                                                            CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) a.a(view2, R.id.reset);
                                                            if (customWegetLayout2 != null) {
                                                                i10 = R.id.seclected_area;
                                                                TextView textView = (TextView) a.a(view2, R.id.seclected_area);
                                                                if (textView != null) {
                                                                    i10 = R.id.text_exemption;
                                                                    LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.text_exemption);
                                                                    if (linearLayout4 != null) {
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
                                                                                    i10 = R.id.within_gujarat;
                                                                                    CheckBox checkBox2 = (CheckBox) a.a(view2, R.id.within_gujarat);
                                                                                    if (checkBox2 != null) {
                                                                                        return new o7((ScrollView) view2, myTextView, linearLayout, myTextView2, linearLayout2, editText, myTextView3, customWegetLayout, myTextView4, checkBox, linearLayout3, editText2, myTextView5, recyclerView, customWegetLayout2, textView, linearLayout4, a11, textView2, textView3, checkBox2);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static o7 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static o7 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_renewal_of_permit, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f27765a;
    }
}
