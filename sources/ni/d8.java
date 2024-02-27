package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class d8 {
    public final LinearLayout A;

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f25879a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f25880b;

    /* renamed from: c  reason: collision with root package name */
    public final RadioButton f25881c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f25882d;

    /* renamed from: e  reason: collision with root package name */
    public final RadioButton f25883e;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f25884f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25885g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f25886h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f25887i;

    /* renamed from: j  reason: collision with root package name */
    public final qd f25888j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f25889k;

    /* renamed from: l  reason: collision with root package name */
    public final EditText f25890l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f25891m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f25892n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f25893o;

    /* renamed from: p  reason: collision with root package name */
    public final RecyclerView f25894p;

    /* renamed from: q  reason: collision with root package name */
    public final AppCompatTextView f25895q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f25896r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f25897s;

    /* renamed from: t  reason: collision with root package name */
    public final MyTextView f25898t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f25899u;

    /* renamed from: v  reason: collision with root package name */
    public final LinearLayout f25900v;

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f25901w;

    /* renamed from: x  reason: collision with root package name */
    public final RadioButton f25902x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f25903y;

    /* renamed from: z  reason: collision with root package name */
    public final LinearLayout f25904z;

    private d8(LinearLayout linearLayout, LinearLayout linearLayout2, RadioButton radioButton, EditText editText, RadioButton radioButton2, LinearLayout linearLayout3, LinearLayout linearLayout4, EditText editText2, AppCompatTextView appCompatTextView, qd qdVar, LinearLayout linearLayout5, EditText editText3, LinearLayout linearLayout6, MyTextView myTextView, TextView textView, RecyclerView recyclerView, AppCompatTextView appCompatTextView2, TextView textView2, TextView textView3, MyTextView myTextView2, TextView textView4, LinearLayout linearLayout7, LinearLayout linearLayout8, RadioButton radioButton3, TextView textView5, LinearLayout linearLayout9, LinearLayout linearLayout10) {
        this.f25879a = linearLayout;
        this.f25880b = linearLayout2;
        this.f25881c = radioButton;
        this.f25882d = editText;
        this.f25883e = radioButton2;
        this.f25884f = linearLayout3;
        this.f25885g = linearLayout4;
        this.f25886h = editText2;
        this.f25887i = appCompatTextView;
        this.f25888j = qdVar;
        this.f25889k = linearLayout5;
        this.f25890l = editText3;
        this.f25891m = linearLayout6;
        this.f25892n = myTextView;
        this.f25893o = textView;
        this.f25894p = recyclerView;
        this.f25895q = appCompatTextView2;
        this.f25896r = textView2;
        this.f25897s = textView3;
        this.f25898t = myTextView2;
        this.f25899u = textView4;
        this.f25900v = linearLayout7;
        this.f25901w = linearLayout8;
        this.f25902x = radioButton3;
        this.f25903y = textView5;
        this.f25904z = linearLayout9;
        this.A = linearLayout10;
    }

    public static d8 a(View view) {
        View view2 = view;
        int i10 = R.id.challanNoLl;
        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.challanNoLl);
        if (linearLayout != null) {
            i10 = R.id.challanNoRb;
            RadioButton radioButton = (RadioButton) a.a(view2, R.id.challanNoRb);
            if (radioButton != null) {
                i10 = R.id.chasisEt;
                EditText editText = (EditText) a.a(view2, R.id.chasisEt);
                if (editText != null) {
                    i10 = R.id.dLNoRb;
                    RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.dLNoRb);
                    if (radioButton2 != null) {
                        i10 = R.id.delet_icon;
                        LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.delet_icon);
                        if (linearLayout2 != null) {
                            i10 = R.id.drivingLicenseLl;
                            LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.drivingLicenseLl);
                            if (linearLayout3 != null) {
                                i10 = R.id.engineEt;
                                EditText editText2 = (EditText) a.a(view2, R.id.engineEt);
                                if (editText2 != null) {
                                    i10 = R.id.getDetailsTv;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.getDetailsTv);
                                    if (appCompatTextView != null) {
                                        i10 = R.id.header;
                                        View a10 = a.a(view2, R.id.header);
                                        if (a10 != null) {
                                            qd a11 = qd.a(a10);
                                            i10 = R.id.inner_parent;
                                            LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.inner_parent);
                                            if (linearLayout4 != null) {
                                                i10 = R.id.inputEt;
                                                EditText editText3 = (EditText) a.a(view2, R.id.inputEt);
                                                if (editText3 != null) {
                                                    i10 = R.id.linear_parent;
                                                    LinearLayout linearLayout5 = (LinearLayout) a.a(view2, R.id.linear_parent);
                                                    if (linearLayout5 != null) {
                                                        i10 = R.id.myDlLicence;
                                                        MyTextView myTextView = (MyTextView) a.a(view2, R.id.myDlLicence);
                                                        if (myTextView != null) {
                                                            i10 = R.id.rc_number;
                                                            TextView textView = (TextView) a.a(view2, R.id.rc_number);
                                                            if (textView != null) {
                                                                i10 = R.id.rec_rc_recycler;
                                                                RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.rec_rc_recycler);
                                                                if (recyclerView != null) {
                                                                    i10 = R.id.titleTv;
                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.titleTv);
                                                                    if (appCompatTextView2 != null) {
                                                                        i10 = R.id.tv_chassi_no;
                                                                        TextView textView2 = (TextView) a.a(view2, R.id.tv_chassi_no);
                                                                        if (textView2 != null) {
                                                                            i10 = R.id.tv_engine_no;
                                                                            TextView textView3 = (TextView) a.a(view2, R.id.tv_engine_no);
                                                                            if (textView3 != null) {
                                                                                i10 = R.id.tv_my_vehicle_list;
                                                                                MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.tv_my_vehicle_list);
                                                                                if (myTextView2 != null) {
                                                                                    i10 = R.id.tv_vehicle_no;
                                                                                    TextView textView4 = (TextView) a.a(view2, R.id.tv_vehicle_no);
                                                                                    if (textView4 != null) {
                                                                                        i10 = R.id.vehicleDetailsLl;
                                                                                        LinearLayout linearLayout6 = (LinearLayout) a.a(view2, R.id.vehicleDetailsLl);
                                                                                        if (linearLayout6 != null) {
                                                                                            i10 = R.id.vehicleNoLl;
                                                                                            LinearLayout linearLayout7 = (LinearLayout) a.a(view2, R.id.vehicleNoLl);
                                                                                            if (linearLayout7 != null) {
                                                                                                i10 = R.id.vehicleNoRb;
                                                                                                RadioButton radioButton3 = (RadioButton) a.a(view2, R.id.vehicleNoRb);
                                                                                                if (radioButton3 != null) {
                                                                                                    i10 = R.id.viewdetails;
                                                                                                    TextView textView5 = (TextView) a.a(view2, R.id.viewdetails);
                                                                                                    if (textView5 != null) {
                                                                                                        i10 = R.id.virtual_dl_view;
                                                                                                        LinearLayout linearLayout8 = (LinearLayout) a.a(view2, R.id.virtual_dl_view);
                                                                                                        if (linearLayout8 != null) {
                                                                                                            i10 = R.id.virtualrc_layout;
                                                                                                            LinearLayout linearLayout9 = (LinearLayout) a.a(view2, R.id.virtualrc_layout);
                                                                                                            if (linearLayout9 != null) {
                                                                                                                return new d8((LinearLayout) view2, linearLayout, radioButton, editText, radioButton2, linearLayout2, linearLayout3, editText2, appCompatTextView, a11, linearLayout4, editText3, linearLayout5, myTextView, textView, recyclerView, appCompatTextView2, textView2, textView3, myTextView2, textView4, linearLayout6, linearLayout7, radioButton3, textView5, linearLayout8, linearLayout9);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static d8 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static d8 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_search_print_challan, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f25879a;
    }
}
