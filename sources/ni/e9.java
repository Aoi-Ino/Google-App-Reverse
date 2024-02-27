package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class e9 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f26096a;

    /* renamed from: b  reason: collision with root package name */
    public final CheckBox f26097b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckBox f26098c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f26099d;

    /* renamed from: e  reason: collision with root package name */
    public final CheckBox f26100e;

    /* renamed from: f  reason: collision with root package name */
    public final CheckBox f26101f;

    /* renamed from: g  reason: collision with root package name */
    public final CheckBox f26102g;

    /* renamed from: h  reason: collision with root package name */
    public final CheckBox f26103h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f26104i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f26105j;

    /* renamed from: k  reason: collision with root package name */
    public final qd f26106k;

    /* renamed from: l  reason: collision with root package name */
    public final CheckBox f26107l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26108m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26109n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26110o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26111p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f26112q;

    /* renamed from: r  reason: collision with root package name */
    public final MyTextView f26113r;

    /* renamed from: s  reason: collision with root package name */
    public final MyTextView f26114s;

    private e9(LinearLayout linearLayout, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, MyTextView myTextView, MyTextView myTextView2, qd qdVar, CheckBox checkBox8, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, MyTextView myTextView3, MyTextView myTextView4) {
        this.f26096a = linearLayout;
        this.f26097b = checkBox;
        this.f26098c = checkBox2;
        this.f26099d = checkBox3;
        this.f26100e = checkBox4;
        this.f26101f = checkBox5;
        this.f26102g = checkBox6;
        this.f26103h = checkBox7;
        this.f26104i = myTextView;
        this.f26105j = myTextView2;
        this.f26106k = qdVar;
        this.f26107l = checkBox8;
        this.f26108m = textView;
        this.f26109n = textView2;
        this.f26110o = textView3;
        this.f26111p = textView4;
        this.f26112q = textView5;
        this.f26113r = myTextView3;
        this.f26114s = myTextView4;
    }

    public static e9 a(View view) {
        View view2 = view;
        int i10 = R.id.change_of_address;
        CheckBox checkBox = (CheckBox) a.a(view2, R.id.change_of_address);
        if (checkBox != null) {
            i10 = R.id.duplicate_rc;
            CheckBox checkBox2 = (CheckBox) a.a(view2, R.id.duplicate_rc);
            if (checkBox2 != null) {
                i10 = R.id.hyper_add;
                CheckBox checkBox3 = (CheckBox) a.a(view2, R.id.hyper_add);
                if (checkBox3 != null) {
                    i10 = R.id.hyper_con;
                    CheckBox checkBox4 = (CheckBox) a.a(view2, R.id.hyper_con);
                    if (checkBox4 != null) {
                        i10 = R.id.hyper_term;
                        CheckBox checkBox5 = (CheckBox) a.a(view2, R.id.hyper_term);
                        if (checkBox5 != null) {
                            i10 = R.id.noc_service;
                            CheckBox checkBox6 = (CheckBox) a.a(view2, R.id.noc_service);
                            if (checkBox6 != null) {
                                i10 = R.id.rc_particular;
                                CheckBox checkBox7 = (CheckBox) a.a(view2, R.id.rc_particular);
                                if (checkBox7 != null) {
                                    i10 = R.id.rto;
                                    MyTextView myTextView = (MyTextView) a.a(view2, R.id.rto);
                                    if (myTextView != null) {
                                        i10 = R.id.state;
                                        MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.state);
                                        if (myTextView2 != null) {
                                            i10 = R.id.topHolder;
                                            View a10 = a.a(view2, R.id.topHolder);
                                            if (a10 != null) {
                                                qd a11 = qd.a(a10);
                                                i10 = R.id.trans_owner;
                                                CheckBox checkBox8 = (CheckBox) a.a(view2, R.id.trans_owner);
                                                if (checkBox8 != null) {
                                                    i10 = R.id.txt_reset;
                                                    TextView textView = (TextView) a.a(view2, R.id.txt_reset);
                                                    if (textView != null) {
                                                        i10 = R.id.txt_rto;
                                                        TextView textView2 = (TextView) a.a(view2, R.id.txt_rto);
                                                        if (textView2 != null) {
                                                            i10 = R.id.txt_service_submit;
                                                            TextView textView3 = (TextView) a.a(view2, R.id.txt_service_submit);
                                                            if (textView3 != null) {
                                                                i10 = R.id.txt_state_name;
                                                                TextView textView4 = (TextView) a.a(view2, R.id.txt_state_name);
                                                                if (textView4 != null) {
                                                                    i10 = R.id.txt_vehicle_number;
                                                                    TextView textView5 = (TextView) a.a(view2, R.id.txt_vehicle_number);
                                                                    if (textView5 != null) {
                                                                        i10 = R.id.vahan_service_lable;
                                                                        MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.vahan_service_lable);
                                                                        if (myTextView3 != null) {
                                                                            i10 = R.id.vehicle_number;
                                                                            MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.vehicle_number);
                                                                            if (myTextView4 != null) {
                                                                                return new e9((LinearLayout) view2, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, myTextView, myTextView2, a11, checkBox8, textView, textView2, textView3, textView4, textView5, myTextView3, myTextView4);
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

    public static e9 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static e9 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_vahan_select_service_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f26096a;
    }
}
