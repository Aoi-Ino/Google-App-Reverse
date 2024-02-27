package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.shockwave.pdfium.a;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PdfiumCore {

    /* renamed from: b  reason: collision with root package name */
    private static final String f22468b = "com.shockwave.pdfium.PdfiumCore";

    /* renamed from: c  reason: collision with root package name */
    private static final Class f22469c = FileDescriptor.class;

    /* renamed from: d  reason: collision with root package name */
    private static Field f22470d = null;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f22471e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private int f22472a;

    static {
        try {
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e10) {
            String str = f22468b;
            Log.e(str, "Native libraries failed to load - " + e10);
        }
    }

    public PdfiumCore(Context context) {
        this.f22472a = context.getResources().getDisplayMetrics().densityDpi;
    }

    public static int c(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            if (f22470d == null) {
                Field declaredField = f22469c.getDeclaredField("descriptor");
                f22470d = declaredField;
                declaredField.setAccessible(true);
            }
            return f22470d.getInt(parcelFileDescriptor.getFileDescriptor());
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
            return -1;
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    private void j(List list, a aVar, long j10) {
        a.C0277a aVar2 = new a.C0277a();
        aVar2.f22479d = j10;
        aVar2.f22477b = nativeGetBookmarkTitle(j10);
        aVar2.f22478c = nativeGetBookmarkDestIndex(aVar.f22473a, j10);
        list.add(aVar2);
        Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(aVar.f22473a, Long.valueOf(j10));
        if (nativeGetFirstChildBookmark != null) {
            j(aVar2.a(), aVar, nativeGetFirstChildBookmark.longValue());
        }
        Long nativeGetSiblingBookmark = nativeGetSiblingBookmark(aVar.f22473a, j10);
        if (nativeGetSiblingBookmark != null) {
            j(list, aVar, nativeGetSiblingBookmark.longValue());
        }
    }

    private native void nativeCloseDocument(long j10);

    private native void nativeClosePage(long j10);

    private native long nativeGetBookmarkDestIndex(long j10, long j11);

    private native String nativeGetBookmarkTitle(long j10);

    private native String nativeGetDocumentMetaText(long j10, String str);

    private native Long nativeGetFirstChildBookmark(long j10, Long l10);

    private native int nativeGetPageCount(long j10);

    private native int nativeGetPageHeightPixel(long j10, int i10);

    private native int nativeGetPageWidthPixel(long j10, int i10);

    private native Long nativeGetSiblingBookmark(long j10, long j11);

    private native long nativeLoadPage(long j10, int i10);

    private native long nativeOpenDocument(int i10, String str);

    private native void nativeRenderPageBitmap(long j10, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, boolean z10);

    public void a(a aVar) {
        synchronized (f22471e) {
            try {
                for (Integer num : aVar.f22475c.keySet()) {
                    nativeClosePage(((Long) aVar.f22475c.get(num)).longValue());
                }
                aVar.f22475c.clear();
                nativeCloseDocument(aVar.f22473a);
                ParcelFileDescriptor parcelFileDescriptor = aVar.f22474b;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    aVar.f22474b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a.b b(a aVar) {
        a.b bVar;
        synchronized (f22471e) {
            bVar = new a.b();
            bVar.f22480a = nativeGetDocumentMetaText(aVar.f22473a, "Title");
            bVar.f22481b = nativeGetDocumentMetaText(aVar.f22473a, "Author");
            bVar.f22482c = nativeGetDocumentMetaText(aVar.f22473a, "Subject");
            bVar.f22483d = nativeGetDocumentMetaText(aVar.f22473a, "Keywords");
            bVar.f22484e = nativeGetDocumentMetaText(aVar.f22473a, "Creator");
            bVar.f22485f = nativeGetDocumentMetaText(aVar.f22473a, "Producer");
            bVar.f22486g = nativeGetDocumentMetaText(aVar.f22473a, "CreationDate");
            bVar.f22487h = nativeGetDocumentMetaText(aVar.f22473a, "ModDate");
        }
        return bVar;
    }

    public int d(a aVar) {
        int nativeGetPageCount;
        synchronized (f22471e) {
            nativeGetPageCount = nativeGetPageCount(aVar.f22473a);
        }
        return nativeGetPageCount;
    }

    public int e(a aVar, int i10) {
        synchronized (f22471e) {
            try {
                Long l10 = (Long) aVar.f22475c.get(Integer.valueOf(i10));
                if (l10 == null) {
                    return 0;
                }
                int nativeGetPageHeightPixel = nativeGetPageHeightPixel(l10.longValue(), this.f22472a);
                return nativeGetPageHeightPixel;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int f(a aVar, int i10) {
        synchronized (f22471e) {
            try {
                Long l10 = (Long) aVar.f22475c.get(Integer.valueOf(i10));
                if (l10 == null) {
                    return 0;
                }
                int nativeGetPageWidthPixel = nativeGetPageWidthPixel(l10.longValue(), this.f22472a);
                return nativeGetPageWidthPixel;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public List g(a aVar) {
        ArrayList arrayList;
        synchronized (f22471e) {
            try {
                arrayList = new ArrayList();
                Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(aVar.f22473a, (Long) null);
                if (nativeGetFirstChildBookmark != null) {
                    j(arrayList, aVar, nativeGetFirstChildBookmark.longValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public a h(ParcelFileDescriptor parcelFileDescriptor, String str) {
        a aVar = new a();
        aVar.f22474b = parcelFileDescriptor;
        synchronized (f22471e) {
            aVar.f22473a = nativeOpenDocument(c(parcelFileDescriptor), str);
        }
        return aVar;
    }

    public long i(a aVar, int i10) {
        long nativeLoadPage;
        synchronized (f22471e) {
            nativeLoadPage = nativeLoadPage(aVar.f22473a, i10);
            aVar.f22475c.put(Integer.valueOf(i10), Long.valueOf(nativeLoadPage));
        }
        return nativeLoadPage;
    }

    public void k(a aVar, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        synchronized (f22471e) {
            try {
                try {
                    nativeRenderPageBitmap(((Long) aVar.f22475c.get(Integer.valueOf(i10))).longValue(), bitmap, this.f22472a, i11, i12, i13, i14, z10);
                } catch (NullPointerException e10) {
                    e = e10;
                } catch (Exception e11) {
                    e = e11;
                    try {
                        Log.e(f22468b, "Exception throw from native");
                        e.printStackTrace();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (NullPointerException e12) {
                e = e12;
                Log.e(f22468b, "mContext may be null");
                e.printStackTrace();
            } catch (Exception e13) {
                e = e13;
                Log.e(f22468b, "Exception throw from native");
                e.printStackTrace();
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }
}
