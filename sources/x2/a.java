package x2;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.c;
import cm.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18185a = new a();

    /* renamed from: x2.a$a  reason: collision with other inner class name */
    static final class C0236a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v2.b f18186e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.c f18187f;

        C0236a(v2.b bVar, androidx.appcompat.app.c cVar) {
            this.f18186e = bVar;
            this.f18187f = cVar;
        }

        public final void onClick(View view) {
            this.f18186e.a(u2.a.CAMERA);
            this.f18187f.dismiss();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v2.b f18188e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.c f18189f;

        b(v2.b bVar, androidx.appcompat.app.c cVar) {
            this.f18188e = bVar;
            this.f18189f = cVar;
        }

        public final void onClick(View view) {
            this.f18188e.a(u2.a.GALLERY);
            this.f18189f.dismiss();
        }
    }

    static final class c implements DialogInterface.OnCancelListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v2.b f18190e;

        c(v2.b bVar) {
            this.f18190e = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f18190e.a((Object) null);
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v2.b f18191e;

        d(v2.b bVar) {
            this.f18191e = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i10) {
            this.f18191e.a((Object) null);
        }
    }

    static final class e implements DialogInterface.OnDismissListener {
        e(v2.a aVar) {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
        }
    }

    private a() {
    }

    public final void a(Context context, v2.b bVar, v2.a aVar) {
        l.f(context, "context");
        l.f(bVar, "listener");
        View inflate = LayoutInflater.from(context).inflate(t2.d.dialog_choose_app, (ViewGroup) null);
        androidx.appcompat.app.c q10 = new c.a(context).n(t2.e.title_choose_image_provider).p(inflate).i(new c(bVar)).g(t2.e.action_cancel, new d(bVar)).j(new e(aVar)).q();
        inflate.findViewById(t2.c.lytCameraPick).setOnClickListener(new C0236a(bVar, q10));
        inflate.findViewById(t2.c.lytGalleryPick).setOnClickListener(new b(bVar, q10));
    }
}
