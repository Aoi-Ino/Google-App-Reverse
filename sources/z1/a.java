package z1;

import a2.d;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import cm.l;
import java.io.File;
import pl.m;
import pl.o;
import v1.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18712a = new a();

    /* renamed from: z1.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0247a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18713a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                v1.e[] r0 = v1.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                v1.e r1 = v1.e.VERY_LOW     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                v1.e r1 = v1.e.LOW     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                v1.e r1 = v1.e.MEDIUM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                v1.e r1 = v1.e.HIGH     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                v1.e r1 = v1.e.VERY_HIGH     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f18713a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.a.C0247a.<clinit>():void");
        }
    }

    private a() {
    }

    private final Integer d(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-range")) {
            return Integer.valueOf(mediaFormat.getInteger("color-range"));
        }
        return null;
    }

    private final Integer e(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-standard")) {
            return Integer.valueOf(mediaFormat.getInteger("color-standard"));
        }
        return null;
    }

    private final Integer f(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-transfer")) {
            return Integer.valueOf(mediaFormat.getInteger("color-transfer"));
        }
        return null;
    }

    private final int g(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("frame-rate")) {
            return mediaFormat.getInteger("frame-rate");
        }
        return 30;
    }

    private final int h(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("i-frame-interval")) {
            return mediaFormat.getInteger("i-frame-interval");
        }
        return 1;
    }

    public final int a(MediaExtractor mediaExtractor, boolean z10) {
        l.f(mediaExtractor, "extractor");
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i10);
            l.e(trackFormat, "extractor.getTrackFormat(i)");
            String string = trackFormat.getString("mime");
            Boolean bool = null;
            if (z10) {
                if (string != null) {
                    bool = Boolean.valueOf(p.A(string, "video/", false, 2, (Object) null));
                }
                l.c(bool);
                if (bool.booleanValue()) {
                    return i10;
                }
            } else {
                if (string != null) {
                    bool = Boolean.valueOf(p.A(string, "audio/", false, 2, (Object) null));
                }
                l.c(bool);
                if (bool.booleanValue()) {
                    return i10;
                }
            }
        }
        return -5;
    }

    public final o b(double d10, double d11, boolean z10) {
        if (z10) {
            return new o(Integer.valueOf(c.a(d10)), Integer.valueOf(c.a(d11)));
        }
        double d12 = (d10 >= 1920.0d || d11 >= 1920.0d) ? 0.5d : (d10 >= 1280.0d || d11 >= 1280.0d) ? 0.75d : (d10 >= 960.0d || d11 >= 960.0d) ? 0.95d : 0.9d;
        return new o(Integer.valueOf(b.a(d10, d12)), Integer.valueOf(b.a(d11, d12)));
    }

    public final int c(int i10, e eVar) {
        double d10;
        double d11;
        l.f(eVar, "quality");
        int i11 = C0247a.f18713a[eVar.ordinal()];
        if (i11 == 1) {
            d10 = (double) i10;
            d11 = 0.1d;
        } else if (i11 == 2) {
            d10 = (double) i10;
            d11 = 0.2d;
        } else if (i11 == 3) {
            d10 = (double) i10;
            d11 = 0.3d;
        } else if (i11 == 4) {
            d10 = (double) i10;
            d11 = 0.4d;
        } else if (i11 == 5) {
            d10 = (double) i10;
            d11 = 0.6d;
        } else {
            throw new m();
        }
        return c.a(d10 * d11);
    }

    public final boolean i() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        l.e(codecInfos, "list");
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            Log.i("CODECS: ", mediaCodecInfo.getName());
            String name = mediaCodecInfo.getName();
            l.e(name, "codec.name");
            if (q.F(name, "qti.avc", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final double j(MediaMetadataRetriever mediaMetadataRetriever) {
        l.f(mediaMetadataRetriever, "mediaMetadataRetriever");
        String extractMetadata = mediaMetadataRetriever.extractMetadata(19);
        if (extractMetadata == null || extractMetadata.length() == 0) {
            return 640.0d;
        }
        return Double.parseDouble(extractMetadata);
    }

    public final double k(MediaMetadataRetriever mediaMetadataRetriever) {
        l.f(mediaMetadataRetriever, "mediaMetadataRetriever");
        String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
        if (extractMetadata == null || extractMetadata.length() == 0) {
            return 368.0d;
        }
        return Double.parseDouble(extractMetadata);
    }

    public final void l(Exception exc) {
        l.f(exc, "exception");
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "An error has occurred!";
        }
        Log.e("Compressor", localizedMessage, exc);
    }

    public final void m(MediaFormat mediaFormat, MediaFormat mediaFormat2, int i10) {
        l.f(mediaFormat, "inputFormat");
        l.f(mediaFormat2, "outputFormat");
        int g10 = g(mediaFormat);
        int h10 = h(mediaFormat);
        mediaFormat2.setInteger("color-format", 2130708361);
        mediaFormat2.setInteger("frame-rate", g10);
        mediaFormat2.setInteger("i-frame-interval", h10);
        mediaFormat2.setInteger("bitrate", i10);
        mediaFormat2.setInteger("bitrate-mode", 2);
        a aVar = f18712a;
        Integer e10 = aVar.e(mediaFormat);
        if (e10 != null) {
            mediaFormat2.setInteger("color-standard", e10.intValue());
        }
        Integer f10 = aVar.f(mediaFormat);
        if (f10 != null) {
            mediaFormat2.setInteger("color-transfer", f10.intValue());
        }
        Integer d10 = aVar.d(mediaFormat);
        if (d10 != null) {
            mediaFormat2.setInteger("color-range", d10.intValue());
        }
        Log.i("Output file parameters", "videoFormat: " + mediaFormat2);
    }

    public final d n(int i10, File file) {
        l.f(file, "cacheFile");
        d dVar = new d();
        dVar.f(file);
        dVar.g(i10);
        return dVar;
    }
}
