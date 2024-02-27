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

public final class w6 {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f29177a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f29178b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f29179c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f29180d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f29181e;

    /* renamed from: f  reason: collision with root package name */
    public final RadioButton f29182f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f29183g;

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f29184h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f29185i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f29186j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f29187k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f29188l;

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f29189m;

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f29190n;

    /* renamed from: o  reason: collision with root package name */
    public final RadioButton f29191o;

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f29192p;

    private w6(LinearLayout linearLayout, EditText editText, EditText editText2, AppCompatTextView appCompatTextView, EditText editText3, RadioButton radioButton, LinearLayout linearLayout2, RecyclerView recyclerView, AppCompatTextView appCompatTextView2, TextView textView, TextView textView2, MyTextView myTextView, LinearLayout linearLayout3, LinearLayout linearLayout4, RadioButton radioButton2, LinearLayout linearLayout5) {
        this.f29177a = linearLayout;
        this.f29178b = editText;
        this.f29179c = editText2;
        this.f29180d = appCompatTextView;
        this.f29181e = editText3;
        this.f29182f = radioButton;
        this.f29183g = linearLayout2;
        this.f29184h = recyclerView;
        this.f29185i = appCompatTextView2;
        this.f29186j = textView;
        this.f29187k = textView2;
        this.f29188l = myTextView;
        this.f29189m = linearLayout3;
        this.f29190n = linearLayout4;
        this.f29191o = radioButton2;
        this.f29192p = linearLayout5;
    }

    public static w6 a(View view) {
        View view2 = view;
        int i10 = R.id.chasisEt;
        EditText editText = (EditText) a.a(view2, R.id.chasisEt);
        if (editText != null) {
            i10 = R.id.engineEt;
            EditText editText2 = (EditText) a.a(view2, R.id.engineEt);
            if (editText2 != null) {
                i10 = R.id.getDetailsTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.getDetailsTv);
                if (appCompatTextView != null) {
                    i10 = R.id.inputEt;
                    EditText editText3 = (EditText) a.a(view2, R.id.inputEt);
                    if (editText3 != null) {
                        i10 = R.id.noticeNoRb;
                        RadioButton radioButton = (RadioButton) a.a(view2, R.id.noticeNoRb);
                        if (radioButton != null) {
                            i10 = R.id.noticeServiceLl;
                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.noticeServiceLl);
                            if (linearLayout != null) {
                                i10 = R.id.rec_rc_recycler;
                                RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.rec_rc_recycler);
                                if (recyclerView != null) {
                                    i10 = R.id.titleTv;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.titleTv);
                                    if (appCompatTextView2 != null) {
                                        i10 = R.id.tv_chassi_no;
                                        TextView textView = (TextView) a.a(view2, R.id.tv_chassi_no);
                                        if (textView != null) {
                                            i10 = R.id.tv_engine_no;
                                            TextView textView2 = (TextView) a.a(view2, R.id.tv_engine_no);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_my_vehicle_list;
                                                MyTextView myTextView = (MyTextView) a.a(view2, R.id.tv_my_vehicle_list);
                                                if (myTextView != null) {
                                                    i10 = R.id.vehicleDetailsLl;
                                                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.vehicleDetailsLl);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.vehicleNoLl;
                                                        LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.vehicleNoLl);
                                                        if (linearLayout3 != null) {
                                                            i10 = R.id.vehicleNoRb;
                                                            RadioButton radioButton2 = (RadioButton) a.a(view2, R.id.vehicleNoRb);
                                                            if (radioButton2 != null) {
                                                                i10 = R.id.virtualrc_layout;
                                                                LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.virtualrc_layout);
                                                                if (linearLayout4 != null) {
                                                                    return new w6((LinearLayout) view2, editText, editText2, appCompatTextView, editText3, radioButton, linearLayout, recyclerView, appCompatTextView2, textView, textView2, myTextView, linearLayout2, linearLayout3, radioButton2, linearLayout4);
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

    public static w6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static w6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_notice_search, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f29177a;
    }
}
