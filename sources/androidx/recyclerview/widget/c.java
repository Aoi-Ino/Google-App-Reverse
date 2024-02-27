package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.m0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends m {

    /* renamed from: s  reason: collision with root package name */
    private static TimeInterpolator f3778s;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList f3779h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f3780i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList f3781j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList f3782k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    ArrayList f3783l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    ArrayList f3784m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    ArrayList f3785n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    ArrayList f3786o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    ArrayList f3787p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    ArrayList f3788q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    ArrayList f3789r = new ArrayList();

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f3790e;

        a(ArrayList arrayList) {
            this.f3790e = arrayList;
        }

        public void run() {
            Iterator it = this.f3790e.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.T(jVar.f3824a, jVar.f3825b, jVar.f3826c, jVar.f3827d, jVar.f3828e);
            }
            this.f3790e.clear();
            c.this.f3784m.remove(this.f3790e);
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f3792e;

        b(ArrayList arrayList) {
            this.f3792e = arrayList;
        }

        public void run() {
            Iterator it = this.f3792e.iterator();
            while (it.hasNext()) {
                c.this.S((i) it.next());
            }
            this.f3792e.clear();
            c.this.f3785n.remove(this.f3792e);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    class C0066c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f3794e;

        C0066c(ArrayList arrayList) {
            this.f3794e = arrayList;
        }

        public void run() {
            Iterator it = this.f3794e.iterator();
            while (it.hasNext()) {
                c.this.R((RecyclerView.d0) it.next());
            }
            this.f3794e.clear();
            c.this.f3783l.remove(this.f3794e);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f3796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3797b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3798c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3796a = d0Var;
            this.f3797b = viewPropertyAnimator;
            this.f3798c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3797b.setListener((Animator.AnimatorListener) null);
            this.f3798c.setAlpha(1.0f);
            c.this.H(this.f3796a);
            c.this.f3788q.remove(this.f3796a);
            c.this.W();
        }

        public void onAnimationStart(Animator animator) {
            c.this.I(this.f3796a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f3800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3801b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3802c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3800a = d0Var;
            this.f3801b = view;
            this.f3802c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3801b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3802c.setListener((Animator.AnimatorListener) null);
            c.this.B(this.f3800a);
            c.this.f3786o.remove(this.f3800a);
            c.this.W();
        }

        public void onAnimationStart(Animator animator) {
            c.this.C(this.f3800a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f3804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3805b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3806c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3807d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3808e;

        f(RecyclerView.d0 d0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3804a = d0Var;
            this.f3805b = i10;
            this.f3806c = view;
            this.f3807d = i11;
            this.f3808e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f3805b != 0) {
                this.f3806c.setTranslationX(0.0f);
            }
            if (this.f3807d != 0) {
                this.f3806c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f3808e.setListener((Animator.AnimatorListener) null);
            c.this.F(this.f3804a);
            c.this.f3787p.remove(this.f3804a);
            c.this.W();
        }

        public void onAnimationStart(Animator animator) {
            c.this.G(this.f3804a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f3810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3811b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3812c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3810a = iVar;
            this.f3811b = viewPropertyAnimator;
            this.f3812c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3811b.setListener((Animator.AnimatorListener) null);
            this.f3812c.setAlpha(1.0f);
            this.f3812c.setTranslationX(0.0f);
            this.f3812c.setTranslationY(0.0f);
            c.this.D(this.f3810a.f3818a, true);
            c.this.f3789r.remove(this.f3810a.f3818a);
            c.this.W();
        }

        public void onAnimationStart(Animator animator) {
            c.this.E(this.f3810a.f3818a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f3814a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3815b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3816c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3814a = iVar;
            this.f3815b = viewPropertyAnimator;
            this.f3816c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3815b.setListener((Animator.AnimatorListener) null);
            this.f3816c.setAlpha(1.0f);
            this.f3816c.setTranslationX(0.0f);
            this.f3816c.setTranslationY(0.0f);
            c.this.D(this.f3814a.f3819b, false);
            c.this.f3789r.remove(this.f3814a.f3819b);
            c.this.W();
        }

        public void onAnimationStart(Animator animator) {
            c.this.E(this.f3814a.f3819b, false);
        }
    }

    private static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f3818a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.d0 f3819b;

        /* renamed from: c  reason: collision with root package name */
        public int f3820c;

        /* renamed from: d  reason: collision with root package name */
        public int f3821d;

        /* renamed from: e  reason: collision with root package name */
        public int f3822e;

        /* renamed from: f  reason: collision with root package name */
        public int f3823f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f3818a = d0Var;
            this.f3819b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3818a + ", newHolder=" + this.f3819b + ", fromX=" + this.f3820c + ", fromY=" + this.f3821d + ", toX=" + this.f3822e + ", toY=" + this.f3823f + '}';
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13) {
            this(d0Var, d0Var2);
            this.f3820c = i10;
            this.f3821d = i11;
            this.f3822e = i12;
            this.f3823f = i13;
        }
    }

    private static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f3824a;

        /* renamed from: b  reason: collision with root package name */
        public int f3825b;

        /* renamed from: c  reason: collision with root package name */
        public int f3826c;

        /* renamed from: d  reason: collision with root package name */
        public int f3827d;

        /* renamed from: e  reason: collision with root package name */
        public int f3828e;

        j(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
            this.f3824a = d0Var;
            this.f3825b = i10;
            this.f3826c = i11;
            this.f3827d = i12;
            this.f3828e = i13;
        }
    }

    private void U(RecyclerView.d0 d0Var) {
        View view = d0Var.f3622e;
        ViewPropertyAnimator animate = view.animate();
        this.f3788q.add(d0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(d0Var, animate, view)).start();
    }

    private void X(List list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Z(iVar, d0Var) && iVar.f3818a == null && iVar.f3819b == null) {
                list.remove(iVar);
            }
        }
    }

    private void Y(i iVar) {
        RecyclerView.d0 d0Var = iVar.f3818a;
        if (d0Var != null) {
            Z(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f3819b;
        if (d0Var2 != null) {
            Z(iVar, d0Var2);
        }
    }

    private boolean Z(i iVar, RecyclerView.d0 d0Var) {
        boolean z10 = false;
        if (iVar.f3819b == d0Var) {
            iVar.f3819b = null;
        } else if (iVar.f3818a != d0Var) {
            return false;
        } else {
            iVar.f3818a = null;
            z10 = true;
        }
        d0Var.f3622e.setAlpha(1.0f);
        d0Var.f3622e.setTranslationX(0.0f);
        d0Var.f3622e.setTranslationY(0.0f);
        D(d0Var, z10);
        return true;
    }

    private void a0(RecyclerView.d0 d0Var) {
        if (f3778s == null) {
            f3778s = new ValueAnimator().getInterpolator();
        }
        d0Var.f3622e.animate().setInterpolator(f3778s);
        j(d0Var);
    }

    public boolean A(RecyclerView.d0 d0Var) {
        a0(d0Var);
        this.f3779h.add(d0Var);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void R(RecyclerView.d0 d0Var) {
        View view = d0Var.f3622e;
        ViewPropertyAnimator animate = view.animate();
        this.f3786o.add(d0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(d0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void S(i iVar) {
        RecyclerView.d0 d0Var = iVar.f3818a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f3622e;
        RecyclerView.d0 d0Var2 = iVar.f3819b;
        if (d0Var2 != null) {
            view = d0Var2.f3622e;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(m());
            this.f3789r.add(iVar.f3818a);
            duration.translationX((float) (iVar.f3822e - iVar.f3820c));
            duration.translationY((float) (iVar.f3823f - iVar.f3821d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f3789r.add(iVar.f3819b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void T(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
        View view = d0Var.f3622e;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3787p.add(d0Var);
        animate.setDuration(n()).setListener(new f(d0Var, i14, view, i15, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void V(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.d0) list.get(size)).f3622e.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        if (!p()) {
            i();
        }
    }

    public boolean g(RecyclerView.d0 d0Var, List list) {
        return !list.isEmpty() || super.g(d0Var, list);
    }

    public void j(RecyclerView.d0 d0Var) {
        View view = d0Var.f3622e;
        view.animate().cancel();
        int size = this.f3781j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((j) this.f3781j.get(size)).f3824a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                F(d0Var);
                this.f3781j.remove(size);
            }
        }
        X(this.f3782k, d0Var);
        if (this.f3779h.remove(d0Var)) {
            view.setAlpha(1.0f);
            H(d0Var);
        }
        if (this.f3780i.remove(d0Var)) {
            view.setAlpha(1.0f);
            B(d0Var);
        }
        for (int size2 = this.f3785n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f3785n.get(size2);
            X(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f3785n.remove(size2);
            }
        }
        for (int size3 = this.f3784m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f3784m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).f3824a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    F(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3784m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3783l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f3783l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                B(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f3783l.remove(size5);
                }
            }
        }
        this.f3788q.remove(d0Var);
        this.f3786o.remove(d0Var);
        this.f3789r.remove(d0Var);
        this.f3787p.remove(d0Var);
        W();
    }

    public void k() {
        int size = this.f3781j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f3781j.get(size);
            View view = jVar.f3824a.f3622e;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            F(jVar.f3824a);
            this.f3781j.remove(size);
        }
        for (int size2 = this.f3779h.size() - 1; size2 >= 0; size2--) {
            H((RecyclerView.d0) this.f3779h.get(size2));
            this.f3779h.remove(size2);
        }
        int size3 = this.f3780i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = (RecyclerView.d0) this.f3780i.get(size3);
            d0Var.f3622e.setAlpha(1.0f);
            B(d0Var);
            this.f3780i.remove(size3);
        }
        for (int size4 = this.f3782k.size() - 1; size4 >= 0; size4--) {
            Y((i) this.f3782k.get(size4));
        }
        this.f3782k.clear();
        if (p()) {
            for (int size5 = this.f3784m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f3784m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f3824a.f3622e;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    F(jVar2.f3824a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3784m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3783l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f3783l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = (RecyclerView.d0) arrayList2.get(size8);
                    d0Var2.f3622e.setAlpha(1.0f);
                    B(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3783l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3785n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f3785n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    Y((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3785n.remove(arrayList3);
                    }
                }
            }
            V(this.f3788q);
            V(this.f3787p);
            V(this.f3786o);
            V(this.f3789r);
            i();
        }
    }

    public boolean p() {
        return !this.f3780i.isEmpty() || !this.f3782k.isEmpty() || !this.f3781j.isEmpty() || !this.f3779h.isEmpty() || !this.f3787p.isEmpty() || !this.f3788q.isEmpty() || !this.f3786o.isEmpty() || !this.f3789r.isEmpty() || !this.f3784m.isEmpty() || !this.f3783l.isEmpty() || !this.f3785n.isEmpty();
    }

    public void v() {
        boolean z10 = !this.f3779h.isEmpty();
        boolean z11 = !this.f3781j.isEmpty();
        boolean z12 = !this.f3782k.isEmpty();
        boolean z13 = !this.f3780i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator it = this.f3779h.iterator();
            while (it.hasNext()) {
                U((RecyclerView.d0) it.next());
            }
            this.f3779h.clear();
            if (z11) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3781j);
                this.f3784m.add(arrayList);
                this.f3781j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    m0.j0(((j) arrayList.get(0)).f3824a.f3622e, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3782k);
                this.f3785n.add(arrayList2);
                this.f3782k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    m0.j0(((i) arrayList2.get(0)).f3818a.f3622e, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3780i);
                this.f3783l.add(arrayList3);
                this.f3780i.clear();
                C0066c cVar = new C0066c(arrayList3);
                if (z10 || z11 || z12) {
                    long j10 = 0;
                    long o10 = z10 ? o() : 0;
                    long n10 = z11 ? n() : 0;
                    if (z12) {
                        j10 = m();
                    }
                    m0.j0(((RecyclerView.d0) arrayList3.get(0)).f3622e, cVar, o10 + Math.max(n10, j10));
                    return;
                }
                cVar.run();
            }
        }
    }

    public boolean x(RecyclerView.d0 d0Var) {
        a0(d0Var);
        d0Var.f3622e.setAlpha(0.0f);
        this.f3780i.add(d0Var);
        return true;
    }

    public boolean y(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13) {
        if (d0Var == d0Var2) {
            return z(d0Var, i10, i11, i12, i13);
        }
        float translationX = d0Var.f3622e.getTranslationX();
        float translationY = d0Var.f3622e.getTranslationY();
        float alpha = d0Var.f3622e.getAlpha();
        a0(d0Var);
        int i14 = (int) (((float) (i12 - i10)) - translationX);
        int i15 = (int) (((float) (i13 - i11)) - translationY);
        d0Var.f3622e.setTranslationX(translationX);
        d0Var.f3622e.setTranslationY(translationY);
        d0Var.f3622e.setAlpha(alpha);
        if (d0Var2 != null) {
            a0(d0Var2);
            d0Var2.f3622e.setTranslationX((float) (-i14));
            d0Var2.f3622e.setTranslationY((float) (-i15));
            d0Var2.f3622e.setAlpha(0.0f);
        }
        this.f3782k.add(new i(d0Var, d0Var2, i10, i11, i12, i13));
        return true;
    }

    public boolean z(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
        View view = d0Var.f3622e;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) d0Var.f3622e.getTranslationY());
        a0(d0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            F(d0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX((float) (-i14));
        }
        if (i15 != 0) {
            view.setTranslationY((float) (-i15));
        }
        this.f3781j.add(new j(d0Var, translationX, translationY, i12, i13));
        return true;
    }
}
