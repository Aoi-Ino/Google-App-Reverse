package r2;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.a;
import java.io.File;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private File f15539a;

    public b(File file) {
        this.f15539a = file;
    }

    public a a(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.h(ParcelFileDescriptor.open(this.f15539a, 268435456), str);
    }
}
