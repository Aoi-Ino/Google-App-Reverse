package x2;

import android.util.Log;
import cm.l;
import java.io.File;
import l0.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f18192a = new b();

    private b() {
    }

    private final void b(a aVar, a aVar2, String str) {
        if (aVar.j(str) != null) {
            aVar2.Y(str, aVar.j(str));
        }
    }

    public final void a(File file, File file2) {
        l.f(file, "filePathOri");
        l.f(file2, "filePathDest");
        try {
            a aVar = new a(file);
            a aVar2 = new a(file2);
            for (String b10 : q.l("FNumber", "ExposureTime", "ISOSpeedRatings", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model", "Orientation")) {
                b(aVar, aVar2, b10);
            }
            aVar2.U();
        } catch (Exception e10) {
            Log.e("ExifDataCopier", "Error preserving Exif data on selected image: " + e10);
        }
    }
}
