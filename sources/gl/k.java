package gl;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import gl.t;
import gl.y;

class k extends g {
    k(Context context) {
        super(context);
    }

    static int k(Uri uri) {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    public boolean c(w wVar) {
        return "file".equals(wVar.f23945d.getScheme());
    }

    public y.a f(w wVar, int i10) {
        return new y.a((Bitmap) null, j(wVar), t.e.DISK, k(wVar.f23945d));
    }
}
