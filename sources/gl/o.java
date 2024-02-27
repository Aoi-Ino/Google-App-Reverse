package gl;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import gl.t;
import gl.y;
import java.io.InputStream;

class o extends g {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f23873b = {"orientation"};

    enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: e  reason: collision with root package name */
        final int f23878e;

        /* renamed from: f  reason: collision with root package name */
        final int f23879f;

        /* renamed from: g  reason: collision with root package name */
        final int f23880g;

        private a(int i10, int i11, int i12) {
            this.f23878e = i10;
            this.f23879f = i11;
            this.f23880g = i12;
        }
    }

    o(Context context) {
        super(context);
    }

    static int k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f23873b, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i10 = query.getInt(0);
                    query.close();
                    return i10;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    static a l(int i10, int i11) {
        a aVar = a.MICRO;
        if (i10 <= aVar.f23879f && i11 <= aVar.f23880g) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i10 > aVar2.f23879f || i11 > aVar2.f23880g) ? a.FULL : aVar2;
    }

    public boolean c(w wVar) {
        Uri uri = wVar.f23945d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public y.a f(w wVar, int i10) {
        Bitmap bitmap;
        w wVar2 = wVar;
        ContentResolver contentResolver = this.f23832a.getContentResolver();
        int k10 = k(contentResolver, wVar2.f23945d);
        String type = contentResolver.getType(wVar2.f23945d);
        boolean z10 = type != null && type.startsWith("video/");
        if (wVar.c()) {
            a l10 = l(wVar2.f23949h, wVar2.f23950i);
            if (!z10 && l10 == a.FULL) {
                return new y.a((Bitmap) null, j(wVar), t.e.DISK, k10);
            }
            long parseId = ContentUris.parseId(wVar2.f23945d);
            BitmapFactory.Options d10 = y.d(wVar);
            d10.inJustDecodeBounds = true;
            BitmapFactory.Options options = d10;
            y.a(wVar2.f23949h, wVar2.f23950i, l10.f23879f, l10.f23880g, d10, wVar);
            if (z10) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l10 == a.FULL ? 1 : l10.f23878e, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l10.f23878e, options);
            }
            if (bitmap != null) {
                return new y.a(bitmap, (InputStream) null, t.e.DISK, k10);
            }
        }
        return new y.a((Bitmap) null, j(wVar), t.e.DISK, k10);
    }
}
