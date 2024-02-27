package t2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import bm.l;
import cm.g;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import pl.x;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16505a = new b((g) null);

    /* renamed from: t2.a$a  reason: collision with other inner class name */
    public static final class C0223a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public u2.a f16506a = u2.a.BOTH;

        /* renamed from: b  reason: collision with root package name */
        private String[] f16507b = new String[0];

        /* renamed from: c  reason: collision with root package name */
        private float f16508c;

        /* renamed from: d  reason: collision with root package name */
        private float f16509d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f16510e;

        /* renamed from: f  reason: collision with root package name */
        private int f16511f;

        /* renamed from: g  reason: collision with root package name */
        private int f16512g;

        /* renamed from: h  reason: collision with root package name */
        private long f16513h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public l f16514i;

        /* renamed from: j  reason: collision with root package name */
        private String f16515j;

        /* renamed from: k  reason: collision with root package name */
        private final Activity f16516k;

        /* renamed from: t2.a$a$a  reason: collision with other inner class name */
        public static final class C0224a implements v2.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0223a f16517a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f16518b;

            C0224a(C0223a aVar, l lVar) {
                this.f16517a = aVar;
                this.f16518b = lVar;
            }

            /* renamed from: b */
            public void a(u2.a aVar) {
                if (aVar != null) {
                    this.f16517a.f16506a = aVar;
                    l c10 = this.f16517a.f16514i;
                    if (c10 != null) {
                        x xVar = (x) c10.invoke(this.f16517a.f16506a);
                    }
                    this.f16518b.invoke(this.f16517a.g());
                }
            }
        }

        public C0223a(Activity activity) {
            cm.l.f(activity, "activity");
            this.f16516k = activity;
        }

        /* access modifiers changed from: private */
        public final Intent g() {
            Intent intent = new Intent(this.f16516k, ImagePickerActivity.class);
            intent.putExtras(k());
            return intent;
        }

        private final Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra.image_provider", this.f16506a);
            bundle.putStringArray("extra.mime_types", this.f16507b);
            bundle.putBoolean("extra.crop", this.f16510e);
            bundle.putFloat("extra.crop_x", this.f16508c);
            bundle.putFloat("extra.crop_y", this.f16509d);
            bundle.putInt("extra.max_width", this.f16511f);
            bundle.putInt("extra.max_height", this.f16512g);
            bundle.putLong("extra.image_max_size", this.f16513h);
            bundle.putString("extra.save_directory", this.f16515j);
            return bundle;
        }

        public final C0223a e() {
            this.f16506a = u2.a.CAMERA;
            return this;
        }

        public final C0223a f(int i10) {
            this.f16513h = ((long) i10) * 1024;
            return this;
        }

        public final void h(l lVar) {
            cm.l.f(lVar, "onResult");
            if (this.f16506a == u2.a.BOTH) {
                x2.a.f18185a.a(this.f16516k, new C0224a(this, lVar), (v2.a) null);
            } else {
                lVar.invoke(g());
            }
        }

        public final C0223a i() {
            this.f16510e = true;
            return this;
        }

        public final C0223a j() {
            this.f16506a = u2.a.GALLERY;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final String a(Intent intent) {
            String stringExtra = intent != null ? intent.getStringExtra("extra.error") : null;
            return stringExtra != null ? stringExtra : "Unknown Error!";
        }

        public final C0223a b(Activity activity) {
            cm.l.f(activity, "activity");
            return new C0223a(activity);
        }
    }
}
