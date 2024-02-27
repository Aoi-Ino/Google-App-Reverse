package ok;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import cm.g;
import cm.l;
import com.pdfview.PDFView;
import java.io.File;
import pl.x;
import rk.d;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final PDFView f30125a;

    /* renamed from: b  reason: collision with root package name */
    private final File f30126b;

    /* renamed from: c  reason: collision with root package name */
    private final float f30127c;

    /* renamed from: d  reason: collision with root package name */
    private final int f30128d;

    /* renamed from: e  reason: collision with root package name */
    private ParcelFileDescriptor f30129e;

    /* renamed from: f  reason: collision with root package name */
    private PdfRenderer f30130f;

    /* renamed from: g  reason: collision with root package name */
    private int f30131g;

    /* renamed from: h  reason: collision with root package name */
    private int f30132h;

    public a(PDFView pDFView, File file, float f10, int i10) {
        l.f(pDFView, "view");
        l.f(file, "file");
        this.f30125a = pDFView;
        this.f30126b = file;
        this.f30127c = f10;
        this.f30128d = i10;
    }

    public boolean a() {
        return this.f30131g > 0 && this.f30132h > 0;
    }

    public Bitmap b(Rect rect, int i10) {
        Rect rect2 = rect;
        int i11 = i10;
        l.f(rect2, "rect");
        int floor = (int) Math.floor(((double) rect2.top) / ((double) this.f30132h));
        int ceil = ((int) Math.ceil(((double) rect2.bottom) / ((double) this.f30132h))) - 1;
        Bitmap createBitmap = Bitmap.createBitmap(rect.width() / i11, rect.height() / i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(this.f30128d);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        if (floor <= ceil) {
            int i12 = 0;
            int i13 = floor;
            while (true) {
                int i14 = i12 + 1;
                int i15 = i13 + 1;
                PdfRenderer pdfRenderer = this.f30130f;
                if (pdfRenderer != null) {
                    synchronized (pdfRenderer) {
                        PdfRenderer pdfRenderer2 = this.f30130f;
                        if (pdfRenderer2 != null) {
                            PdfRenderer.Page openPage = pdfRenderer2.openPage(i13);
                            Matrix matrix = new Matrix();
                            float f10 = this.f30127c;
                            float f11 = (float) i11;
                            matrix.setScale(f10 / f11, f10 / f11);
                            int i16 = rect2.top;
                            int i17 = this.f30132h;
                            matrix.postTranslate((float) ((-rect2.left) / i11), (-((float) ((i16 - (i17 * floor)) / i11))) + ((((float) i17) / f11) * ((float) i12)));
                            openPage.render(createBitmap, (Rect) null, matrix, 1);
                            openPage.close();
                            x xVar = x.f30437a;
                        } else {
                            l.v("renderer");
                            throw null;
                        }
                    }
                    if (i13 == ceil) {
                        break;
                    }
                    i12 = i14;
                    i13 = i15;
                    rect2 = rect;
                } else {
                    l.v("renderer");
                    throw null;
                }
            }
        }
        l.e(createBitmap, "bitmap");
        return createBitmap;
    }

    public void c() {
        PdfRenderer pdfRenderer = this.f30130f;
        if (pdfRenderer != null) {
            pdfRenderer.close();
            ParcelFileDescriptor parcelFileDescriptor = this.f30129e;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
                this.f30131g = 0;
                this.f30132h = 0;
                return;
            }
            l.v("descriptor");
            throw null;
        }
        l.v("renderer");
        throw null;
    }

    public Point d(Context context, Uri uri) {
        l.f(context, "context");
        l.f(uri, "uri");
        ParcelFileDescriptor open = ParcelFileDescriptor.open(this.f30126b, 268435456);
        l.e(open, "open(file, ParcelFileDescriptor.MODE_READ_ONLY)");
        this.f30129e = open;
        ParcelFileDescriptor parcelFileDescriptor = this.f30129e;
        if (parcelFileDescriptor != null) {
            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptor);
            this.f30130f = pdfRenderer;
            PdfRenderer.Page openPage = pdfRenderer.openPage(0);
            this.f30131g = (int) (((float) openPage.getWidth()) * this.f30127c);
            this.f30132h = (int) (((float) openPage.getHeight()) * this.f30127c);
            PdfRenderer pdfRenderer2 = this.f30130f;
            if (pdfRenderer2 != null) {
                if (pdfRenderer2.getPageCount() > 15) {
                    this.f30125a.setHasBaseLayerTiles(false);
                } else {
                    PdfRenderer pdfRenderer3 = this.f30130f;
                    if (pdfRenderer3 == null) {
                        l.v("renderer");
                        throw null;
                    } else if (pdfRenderer3.getPageCount() == 1) {
                        this.f30125a.setMinimumScaleType(1);
                    }
                }
                openPage.close();
                int i10 = this.f30131g;
                int i11 = this.f30132h;
                PdfRenderer pdfRenderer4 = this.f30130f;
                if (pdfRenderer4 != null) {
                    return new Point(i10, i11 * pdfRenderer4.getPageCount());
                }
                l.v("renderer");
                throw null;
            }
            l.v("renderer");
            throw null;
        }
        l.v("descriptor");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(PDFView pDFView, File file, float f10, int i10, int i11, g gVar) {
        this(pDFView, file, f10, (i11 & 8) != 0 ? -1 : i10);
    }
}
