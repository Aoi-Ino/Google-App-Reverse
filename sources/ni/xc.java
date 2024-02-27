package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class xc {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f29400a;

    /* renamed from: b  reason: collision with root package name */
    public final MyTextView f29401b;

    /* renamed from: c  reason: collision with root package name */
    public final MyTextView f29402c;

    /* renamed from: d  reason: collision with root package name */
    public final MyTextView f29403d;

    /* renamed from: e  reason: collision with root package name */
    public final MyTextView f29404e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatButton f29405f;

    /* renamed from: g  reason: collision with root package name */
    public final MyTextView f29406g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f29407h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f29408i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f29409j;

    /* renamed from: k  reason: collision with root package name */
    public final rc f29410k;

    /* renamed from: l  reason: collision with root package name */
    public final RecyclerView f29411l;

    /* renamed from: m  reason: collision with root package name */
    public final AppCompatButton f29412m;

    private xc(RelativeLayout relativeLayout, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, MyTextView myTextView4, AppCompatButton appCompatButton, MyTextView myTextView5, MyTextView myTextView6, MyTextView myTextView7, MyTextView myTextView8, rc rcVar, RecyclerView recyclerView, AppCompatButton appCompatButton2) {
        this.f29400a = relativeLayout;
        this.f29401b = myTextView;
        this.f29402c = myTextView2;
        this.f29403d = myTextView3;
        this.f29404e = myTextView4;
        this.f29405f = appCompatButton;
        this.f29406g = myTextView5;
        this.f29407h = myTextView6;
        this.f29408i = myTextView7;
        this.f29409j = myTextView8;
        this.f29410k = rcVar;
        this.f29411l = recyclerView;
        this.f29412m = appCompatButton2;
    }

    public static xc a(View view) {
        View view2 = view;
        int i10 = R.id.applDate;
        MyTextView myTextView = (MyTextView) a.a(view2, R.id.applDate);
        if (myTextView != null) {
            i10 = R.id.applDateValue;
            MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.applDateValue);
            if (myTextView2 != null) {
                i10 = R.id.applNo;
                MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.applNo);
                if (myTextView3 != null) {
                    i10 = R.id.applNoValue;
                    MyTextView myTextView4 = (MyTextView) a.a(view2, R.id.applNoValue);
                    if (myTextView4 != null) {
                        i10 = R.id.cancelBtn;
                        AppCompatButton appCompatButton = (AppCompatButton) a.a(view2, R.id.cancelBtn);
                        if (appCompatButton != null) {
                            i10 = R.id.dob;
                            MyTextView myTextView5 = (MyTextView) a.a(view2, R.id.dob);
                            if (myTextView5 != null) {
                                i10 = R.id.dobValue;
                                MyTextView myTextView6 = (MyTextView) a.a(view2, R.id.dobValue);
                                if (myTextView6 != null) {
                                    i10 = R.id.fullName;
                                    MyTextView myTextView7 = (MyTextView) a.a(view2, R.id.fullName);
                                    if (myTextView7 != null) {
                                        i10 = R.id.fullNameValue;
                                        MyTextView myTextView8 = (MyTextView) a.a(view2, R.id.fullNameValue);
                                        if (myTextView8 != null) {
                                            i10 = R.id.mHeader;
                                            View a10 = a.a(view2, R.id.mHeader);
                                            if (a10 != null) {
                                                rc a11 = rc.a(a10);
                                                i10 = R.id.selectedWithdrawnRv;
                                                RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.selectedWithdrawnRv);
                                                if (recyclerView != null) {
                                                    i10 = R.id.submitBtn;
                                                    AppCompatButton appCompatButton2 = (AppCompatButton) a.a(view2, R.id.submitBtn);
                                                    if (appCompatButton2 != null) {
                                                        return new xc((RelativeLayout) view2, myTextView, myTextView2, myTextView3, myTextView4, appCompatButton, myTextView5, myTextView6, myTextView7, myTextView8, a11, recyclerView, appCompatButton2);
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

    public static xc c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static xc d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.selected_withdrawn_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public RelativeLayout b() {
        return this.f29400a;
    }
}
