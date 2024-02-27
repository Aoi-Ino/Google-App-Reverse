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

public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f27530a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f27531b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f27532c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatTextView f27533d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f27534e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f27535f;

    /* renamed from: g  reason: collision with root package name */
    public final rc f27536g;

    /* renamed from: h  reason: collision with root package name */
    public final MyTextView f27537h;

    /* renamed from: i  reason: collision with root package name */
    public final MyTextView f27538i;

    /* renamed from: j  reason: collision with root package name */
    public final MyTextView f27539j;

    /* renamed from: k  reason: collision with root package name */
    public final AppCompatTextView f27540k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatTextView f27541l;

    /* renamed from: m  reason: collision with root package name */
    public final AppCompatTextView f27542m;

    private n1(ConstraintLayout constraintLayout, TextView textView, EditText editText, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout2, ImageView imageView, rc rcVar, MyTextView myTextView, MyTextView myTextView2, MyTextView myTextView3, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.f27530a = constraintLayout;
        this.f27531b = textView;
        this.f27532c = editText;
        this.f27533d = appCompatTextView;
        this.f27534e = constraintLayout2;
        this.f27535f = imageView;
        this.f27536g = rcVar;
        this.f27537h = myTextView;
        this.f27538i = myTextView2;
        this.f27539j = myTextView3;
        this.f27540k = appCompatTextView2;
        this.f27541l = appCompatTextView3;
        this.f27542m = appCompatTextView4;
    }

    public static n1 a(View view) {
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
                                                        return new n1((ConstraintLayout) view2, textView, editText, appCompatTextView, constraintLayout, imageView, a11, myTextView, myTextView2, myTextView3, appCompatTextView2, appCompatTextView3, appCompatTextView4);
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

    public static n1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static n1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_cov_application, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f27530a;
    }
}
