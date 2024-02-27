package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class ba {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f25512a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f25513b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25514c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f25515d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f25516e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f25517f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f25518g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f25519h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25520i;

    /* renamed from: j  reason: collision with root package name */
    public final RecyclerView f25521j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f25522k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f25523l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f25524m;

    /* renamed from: n  reason: collision with root package name */
    public final MyTextView f25525n;

    /* renamed from: o  reason: collision with root package name */
    public final MyTextView f25526o;

    /* renamed from: p  reason: collision with root package name */
    public final MyTextView f25527p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f25528q;

    /* renamed from: r  reason: collision with root package name */
    public final LinearLayout f25529r;

    private ba(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, LinearLayout linearLayout, EditText editText, MyTextView myTextView, EditText editText2, EditText editText3, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView2, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, TextView textView, LinearLayout linearLayout4) {
        this.f25512a = coordinatorLayout;
        this.f25513b = recyclerView;
        this.f25514c = linearLayout;
        this.f25515d = editText;
        this.f25516e = myTextView;
        this.f25517f = editText2;
        this.f25518g = editText3;
        this.f25519h = linearLayout2;
        this.f25520i = linearLayout3;
        this.f25521j = recyclerView2;
        this.f25522k = myTextView2;
        this.f25523l = myTextView3;
        this.f25524m = myTextView4;
        this.f25525n = myTextView5;
        this.f25526o = myTextView6;
        this.f25527p = myTextView7;
        this.f25528q = textView;
        this.f25529r = linearLayout4;
    }

    public static ba a(View view) {
        View view2 = view;
        int i10 = R.id.alerst_recycle_view;
        RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.alerst_recycle_view);
        if (recyclerView != null) {
            i10 = R.id.alerts_layout;
            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.alerts_layout);
            if (linearLayout != null) {
                i10 = R.id.chassis_no_et;
                EditText editText = (EditText) a.a(view2, R.id.chassis_no_et);
                if (editText != null) {
                    i10 = R.id.createvirtualrc;
                    MyTextView myTextView = (MyTextView) a.a(view2, R.id.createvirtualrc);
                    if (myTextView != null) {
                        i10 = R.id.engin_no;
                        EditText editText2 = (EditText) a.a(view2, R.id.engin_no);
                        if (editText2 != null) {
                            i10 = R.id.et_search_rc;
                            EditText editText3 = (EditText) a.a(view2, R.id.et_search_rc);
                            if (editText3 != null) {
                                i10 = R.id.nexgenarrow;
                                LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                if (linearLayout2 != null) {
                                    i10 = R.id.nexgenlogo;
                                    LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.rec_rc_recycler;
                                        RecyclerView recyclerView2 = (RecyclerView) a.a(view2, R.id.rec_rc_recycler);
                                        if (recyclerView2 != null) {
                                            i10 = R.id.tv_alert_list;
                                            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.tv_alert_list);
                                            if (myTextView2 != null) {
                                                i10 = R.id.tv_chassi_no;
                                                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.tv_chassi_no);
                                                if (myTextView3 != null) {
                                                    i10 = R.id.tv_engin_no;
                                                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.tv_engin_no);
                                                    if (myTextView4 != null) {
                                                        i10 = R.id.tv_my_vehicle;
                                                        MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.tv_my_vehicle);
                                                        if (myTextView5 != null) {
                                                            i10 = R.id.tv_my_vehicle_list;
                                                            MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.tv_my_vehicle_list);
                                                            if (myTextView6 != null) {
                                                                i10 = R.id.tv_vehicle_no;
                                                                MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.tv_vehicle_no);
                                                                if (myTextView7 != null) {
                                                                    i10 = R.id.vahan_service_lable;
                                                                    TextView textView = (TextView) a.a(view2, R.id.vahan_service_lable);
                                                                    if (textView != null) {
                                                                        i10 = R.id.virtualrc_layout;
                                                                        LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.virtualrc_layout);
                                                                        if (linearLayout4 != null) {
                                                                            return new ba((CoordinatorLayout) view2, recyclerView, linearLayout, editText, myTextView, editText2, editText3, linearLayout2, linearLayout3, recyclerView2, myTextView2, myTextView3, myTextView4, myTextView5, myTextView6, myTextView7, textView, linearLayout4);
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

    public static ba c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ba d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.creater_rc_alerts, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f25512a;
    }
}
