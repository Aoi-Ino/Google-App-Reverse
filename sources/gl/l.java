package gl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import gl.t;

class l extends a {
    l(t tVar, ImageView imageView, w wVar, int i10, int i11, int i12, Drawable drawable, String str, Object obj, e eVar, boolean z10) {
        super(tVar, imageView, wVar, i10, i11, i12, drawable, str, obj, z10);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        super.a();
    }

    public void b(Bitmap bitmap, t.e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f23754c.get();
            if (imageView != null) {
                t tVar = this.f23752a;
                Bitmap bitmap2 = bitmap;
                t.e eVar2 = eVar;
                u.c(imageView, tVar.f23898d, bitmap2, eVar2, this.f23755d, tVar.f23906l);
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    public void c() {
        ImageView imageView = (ImageView) this.f23754c.get();
        if (imageView != null) {
            int i10 = this.f23758g;
            if (i10 != 0) {
                imageView.setImageResource(i10);
                return;
            }
            Drawable drawable = this.f23759h;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
    }
}
