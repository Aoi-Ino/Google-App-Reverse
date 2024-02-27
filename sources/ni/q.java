package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f28098a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f28099b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f28100c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f28101d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f28102e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f28103f;

    /* renamed from: g  reason: collision with root package name */
    public final rc f28104g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f28105h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f28106i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f28107j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatTextView f28108k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatTextView f28109l;

    /* renamed from: m  reason: collision with root package name */
    public final AppCompatTextView f28110m;

    private q(ConstraintLayout constraintLayout, TextView textView, EditText editText, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, ImageView imageView, rc rcVar, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.f28098a = constraintLayout;
        this.f28099b = textView;
        this.f28100c = editText;
        this.f28101d = appCompatTextView;
        this.f28102e = constraintLayout2;
        this.f28103f = imageView;
        this.f28104g = rcVar;
        this.f28105h = myTextView;
        this.f28106i = myTextView2;
        this.f28107j = myTextView3;
        this.f28108k = appCompatTextView2;
        this.f28109l = appCompatTextView3;
        this.f28110m = appCompatTextView4;
    }

    public static q a(View view) {
        View view2 = view;
        int i10 = R.id.applicant_date;
        TextView textView = (TextView) a.a(view2, R.id.applicant_date);
        if (textView != null) {
            i10 = R.id.applicationNoEt;
            EditText editText = (EditText) a.a(view2, R.id.applicationNoEt);
            if (editText != null) {
                i10 = R.id.cancelTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.cancelTv);
                if (appCompatTextView != null) {
                    i10 = R.id.datePikerCL;
                    ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view2, R.id.datePikerCL);
                    if (constraintLayout != null) {
                        i10 = R.id.dob_cal;
                        ImageView imageView = (ImageView) a.a(view2, R.id.dob_cal);
                        if (imageView != null) {
                            i10 = R.id.include3;
                            View a10 = a.a(view2, R.id.include3);
                            if (a10 != null) {
                                rc a11 = rc.a(a10);
                                i10 = R.id.myApplicationNo;
                                MyTextView myTextView = (MyTextView) a.a(view2, R.id.myApplicationNo);
                                if (myTextView != null) {
                                    i10 = R.id.myDateOfBirth;
                                    MyTextView myTextView2 = (MyTextView) a.a(view2, R.id.myDateOfBirth);
                                    if (myTextView2 != null) {
                                        i10 = R.id.note_Info;
                                        MyTextView myTextView3 = (MyTextView) a.a(view2, R.id.note_Info);
                                        if (myTextView3 != null) {
                                            i10 = R.id.noteTitleTv;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.noteTitleTv);
                                            if (appCompatTextView2 != null) {
                                                i10 = R.id.submitTv;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.submitTv);
                                                if (appCompatTextView3 != null) {
                                                    i10 = R.id.topTitleTv;
                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) a.a(view2, R.id.topTitleTv);
                                                    if (appCompatTextView4 != null) {
                                                        return new q((ConstraintLayout) view2, textView, editText, appCompatTextView, constraintLayout, imageView, a11, myTextView, myTextView2, myTextView3, appCompatTextView2, appCompatTextView3, appCompatTextView4);
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

    public static q c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static q d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_application_status, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f28098a;
    }
}
