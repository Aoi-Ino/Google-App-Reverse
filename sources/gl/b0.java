package gl;

import java.io.PrintWriter;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f23784a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23785b;

    /* renamed from: c  reason: collision with root package name */
    public final long f23786c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23787d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23788e;

    /* renamed from: f  reason: collision with root package name */
    public final long f23789f;

    /* renamed from: g  reason: collision with root package name */
    public final long f23790g;

    /* renamed from: h  reason: collision with root package name */
    public final long f23791h;

    /* renamed from: i  reason: collision with root package name */
    public final long f23792i;

    /* renamed from: j  reason: collision with root package name */
    public final long f23793j;

    /* renamed from: k  reason: collision with root package name */
    public final int f23794k;

    /* renamed from: l  reason: collision with root package name */
    public final int f23795l;

    /* renamed from: m  reason: collision with root package name */
    public final int f23796m;

    /* renamed from: n  reason: collision with root package name */
    public final long f23797n;

    public b0(int i10, int i11, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i12, int i13, int i14, long j18) {
        this.f23784a = i10;
        this.f23785b = i11;
        this.f23786c = j10;
        this.f23787d = j11;
        this.f23788e = j12;
        this.f23789f = j13;
        this.f23790g = j14;
        this.f23791h = j15;
        this.f23792i = j16;
        this.f23793j = j17;
        this.f23794k = i12;
        this.f23795l = i13;
        this.f23796m = i14;
        this.f23797n = j18;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f23784a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f23785b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f23785b) / ((float) this.f23784a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f23786c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f23787d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f23794k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f23788e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f23791h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f23795l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f23789f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f23796m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f23790g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f23792i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f23793j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f23784a + ", size=" + this.f23785b + ", cacheHits=" + this.f23786c + ", cacheMisses=" + this.f23787d + ", downloadCount=" + this.f23794k + ", totalDownloadSize=" + this.f23788e + ", averageDownloadSize=" + this.f23791h + ", totalOriginalBitmapSize=" + this.f23789f + ", totalTransformedBitmapSize=" + this.f23790g + ", averageOriginalBitmapSize=" + this.f23792i + ", averageTransformedBitmapSize=" + this.f23793j + ", originalBitmapCount=" + this.f23795l + ", transformedBitmapCount=" + this.f23796m + ", timeStamp=" + this.f23797n + '}';
    }
}
