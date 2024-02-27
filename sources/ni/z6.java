package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sos.MovableFloatingActionButton;
import k1.a;

public final class z6 {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f29686a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f29687b;

    /* renamed from: c  reason: collision with root package name */
    public final FloatingActionButton f29688c;

    /* renamed from: d  reason: collision with root package name */
    public final FloatingActionButton f29689d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f29690e;

    /* renamed from: f  reason: collision with root package name */
    public final MovableFloatingActionButton f29691f;

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f29692g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f29693h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f29694i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f29695j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f29696k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f29697l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f29698m;

    private z6(ConstraintLayout constraintLayout, TextView textView, FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, TextView textView2, MovableFloatingActionButton movableFloatingActionButton, RecyclerView recyclerView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView3, ImageView imageView, TextView textView4) {
        this.f29686a = constraintLayout;
        this.f29687b = textView;
        this.f29688c = floatingActionButton;
        this.f29689d = floatingActionButton2;
        this.f29690e = textView2;
        this.f29691f = movableFloatingActionButton;
        this.f29692g = recyclerView;
        this.f29693h = linearLayout;
        this.f29694i = linearLayout2;
        this.f29695j = linearLayout3;
        this.f29696k = textView3;
        this.f29697l = imageView;
        this.f29698m = textView4;
    }

    public static z6 a(View view) {
        View view2 = view;
        int i10 = R.id.add_alarm_action_text;
        TextView textView = (TextView) a.a(view2, R.id.add_alarm_action_text);
        if (textView != null) {
            i10 = R.id.add_alarm_fab;
            FloatingActionButton floatingActionButton = (FloatingActionButton) a.a(view2, R.id.add_alarm_fab);
            if (floatingActionButton != null) {
                i10 = R.id.add_fab;
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) a.a(view2, R.id.add_fab);
                if (floatingActionButton2 != null) {
                    i10 = R.id.add_person_action_text;
                    TextView textView2 = (TextView) a.a(view2, R.id.add_person_action_text);
                    if (textView2 != null) {
                        i10 = R.id.add_person_fab;
                        MovableFloatingActionButton movableFloatingActionButton = (MovableFloatingActionButton) a.a(view2, R.id.add_person_fab);
                        if (movableFloatingActionButton != null) {
                            i10 = R.id.contactRecyclerView;
                            RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.contactRecyclerView);
                            if (recyclerView != null) {
                                i10 = R.id.nexgenarrow;
                                LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                if (linearLayout != null) {
                                    i10 = R.id.nexgenlogo;
                                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.recycle_linear;
                                        LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.recycle_linear);
                                        if (linearLayout3 != null) {
                                            i10 = R.id.service_label;
                                            TextView textView3 = (TextView) a.a(view2, R.id.service_label);
                                            if (textView3 != null) {
                                                i10 = R.id.shared_rc;
                                                ImageView imageView = (ImageView) a.a(view2, R.id.shared_rc);
                                                if (imageView != null) {
                                                    i10 = R.id.tv_manage_emerg_contact;
                                                    TextView textView4 = (TextView) a.a(view2, R.id.tv_manage_emerg_contact);
                                                    if (textView4 != null) {
                                                        return new z6((ConstraintLayout) view2, textView, floatingActionButton, floatingActionButton2, textView2, movableFloatingActionButton, recyclerView, linearLayout, linearLayout2, linearLayout3, textView3, imageView, textView4);
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

    public static z6 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static z6 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_passanger_result, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f29686a;
    }
}
