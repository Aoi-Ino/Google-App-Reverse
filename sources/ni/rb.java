package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class rb {

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f28433a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f28434b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f28435c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f28436d;

    /* renamed from: e  reason: collision with root package name */
    public final qd f28437e;

    /* renamed from: f  reason: collision with root package name */
    public final CheckBox f28438f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f28439g;

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f28440h;

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f28441i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f28442j;

    /* renamed from: k  reason: collision with root package name */
    public final MyTextView f28443k;

    /* renamed from: l  reason: collision with root package name */
    public final MyTextView f28444l;

    /* renamed from: m  reason: collision with root package name */
    public final MyTextView f28445m;

    /* renamed from: n  reason: collision with root package name */
    public final RecyclerView f28446n;

    private rb(ScrollView scrollView, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, qd qdVar, CheckBox checkBox, MyTextView myTextView4, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, RecyclerView recyclerView) {
        this.f28433a = scrollView;
        this.f28434b = myTextView;
        this.f28435c = myTextView2;
        this.f28436d = myTextView3;
        this.f28437e = qdVar;
        this.f28438f = checkBox;
        this.f28439g = myTextView4;
        this.f28440h = relativeLayout;
        this.f28441i = relativeLayout2;
        this.f28442j = linearLayout;
        this.f28443k = myTextView5;
        this.f28444l = myTextView6;
        this.f28445m = myTextView7;
        this.f28446n = recyclerView;
    }

    public static rb a(View view) {
        View view2 = view;
        int i10 = R.id.applDateValue;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.applDateValue);
        if (myTextView != null) {
            i10 = R.id.applNoValue;
            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.applNoValue);
            if (myTextView2 != null) {
                i10 = R.id.applicantNameValue;
                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.applicantNameValue);
                if (myTextView3 != null) {
                    i10 = R.id.applicationStatusHeader;
                    View a10 = a.a(view2, R.id.applicationStatusHeader);
                    if (a10 != null) {
                        qd a11 = qd.a(a10);
                        i10 = R.id.idAgreeTnC;
                        CheckBox checkBox = (CheckBox) a.a(view2, R.id.idAgreeTnC);
                        if (checkBox != null) {
                            i10 = R.id.idLayoutTitle;
                            MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.idLayoutTitle);
                            if (myTextView4 != null) {
                                i10 = R.id.idWithdraw;
                                RelativeLayout relativeLayout = (RelativeLayout) a.a(view2, R.id.idWithdraw);
                                if (relativeLayout != null) {
                                    i10 = R.id.idWithdrawCancel;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) a.a(view2, R.id.idWithdrawCancel);
                                    if (relativeLayout2 != null) {
                                        i10 = R.id.lowerBtn;
                                        LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.lowerBtn);
                                        if (linearLayout != null) {
                                            i10 = R.id.registrationNoValue;
                                            MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.registrationNoValue);
                                            if (myTextView5 != null) {
                                                i10 = R.id.rtoNameValue;
                                                MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.rtoNameValue);
                                                if (myTextView6 != null) {
                                                    i10 = R.id.stateValue;
                                                    MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.stateValue);
                                                    if (myTextView7 != null) {
                                                        i10 = R.id.transcationRv;
                                                        RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.transcationRv);
                                                        if (recyclerView != null) {
                                                            return new rb((ScrollView) view2, myTextView, myTextView2, myTextView3, a11, checkBox, myTextView4, relativeLayout, relativeLayout2, linearLayout, myTextView5, myTextView6, myTextView7, recyclerView);
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

    public static rb c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static rb d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.layout_withdrawn_transaction_applied, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f28433a;
    }
}
