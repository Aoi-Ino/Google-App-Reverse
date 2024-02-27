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

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f26555a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f26556b;

    /* renamed from: c  reason: collision with root package name */
    public final FloatingActionButton f26557c;

    /* renamed from: d  reason: collision with root package name */
    public final FloatingActionButton f26558d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26559e;

    /* renamed from: f  reason: collision with root package name */
    public final MovableFloatingActionButton f26560f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26561g;

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f26562h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f26563i;

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f26564j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f26565k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26566l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f26567m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26568n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26569o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26570p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f26571q;

    private h(ConstraintLayout constraintLayout, TextView textView, FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, TextView textView2, MovableFloatingActionButton movableFloatingActionButton, LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView3, ImageView imageView, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f26555a = constraintLayout;
        this.f26556b = textView;
        this.f26557c = floatingActionButton;
        this.f26558d = floatingActionButton2;
        this.f26559e = textView2;
        this.f26560f = movableFloatingActionButton;
        this.f26561g = linearLayout;
        this.f26562h = recyclerView;
        this.f26563i = linearLayout2;
        this.f26564j = linearLayout3;
        this.f26565k = linearLayout4;
        this.f26566l = textView3;
        this.f26567m = imageView;
        this.f26568n = textView4;
        this.f26569o = textView5;
        this.f26570p = textView6;
        this.f26571q = textView7;
    }

    public static h a(View view) {
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
                            i10 = R.id.add_to_contact_linear;
                            LinearLayout linearLayout = (LinearLayout) a.a(view2, R.id.add_to_contact_linear);
                            if (linearLayout != null) {
                                i10 = R.id.contactRecyclerView;
                                RecyclerView recyclerView = (RecyclerView) a.a(view2, R.id.contactRecyclerView);
                                if (recyclerView != null) {
                                    i10 = R.id.nexgenarrow;
                                    LinearLayout linearLayout2 = (LinearLayout) a.a(view2, R.id.nexgenarrow);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.nexgenlogo;
                                        LinearLayout linearLayout3 = (LinearLayout) a.a(view2, R.id.nexgenlogo);
                                        if (linearLayout3 != null) {
                                            i10 = R.id.recycle_linear;
                                            LinearLayout linearLayout4 = (LinearLayout) a.a(view2, R.id.recycle_linear);
                                            if (linearLayout4 != null) {
                                                i10 = R.id.service_label;
                                                TextView textView3 = (TextView) a.a(view2, R.id.service_label);
                                                if (textView3 != null) {
                                                    i10 = R.id.shared_rc;
                                                    ImageView imageView = (ImageView) a.a(view2, R.id.shared_rc);
                                                    if (imageView != null) {
                                                        i10 = R.id.title;
                                                        TextView textView4 = (TextView) a.a(view2, R.id.title);
                                                        if (textView4 != null) {
                                                            i10 = R.id.tv_add_emerg_contact;
                                                            TextView textView5 = (TextView) a.a(view2, R.id.tv_add_emerg_contact);
                                                            if (textView5 != null) {
                                                                i10 = R.id.tv_help_note;
                                                                TextView textView6 = (TextView) a.a(view2, R.id.tv_help_note);
                                                                if (textView6 != null) {
                                                                    i10 = R.id.tv_manage_emerg_contact;
                                                                    TextView textView7 = (TextView) a.a(view2, R.id.tv_manage_emerg_contact);
                                                                    if (textView7 != null) {
                                                                        return new h((ConstraintLayout) view2, textView, floatingActionButton, floatingActionButton2, textView2, movableFloatingActionButton, linearLayout, recyclerView, linearLayout2, linearLayout3, linearLayout4, textView3, imageView, textView4, textView5, textView6, textView7);
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

    public static h c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static h d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_add_contact_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f26555a;
    }
}
