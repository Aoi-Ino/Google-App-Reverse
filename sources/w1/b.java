package w1;

import a2.e;
import a2.f;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import bm.p;
import cm.g;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import lm.d0;
import lm.q0;
import pl.o;
import pl.p;
import pl.q;
import pl.x;
import tl.d;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f17826a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f17827b = true;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f17828f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f17829g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f17830h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Uri f17831i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f17832j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ x1.b f17833k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f17834l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f17835m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ v1.b f17836n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, Uri uri, int i10, x1.b bVar, String str, String str2, v1.b bVar2, d dVar) {
            super(2, dVar);
            this.f17830h = context;
            this.f17831i = uri;
            this.f17832j = i10;
            this.f17833k = bVar;
            this.f17834l = str;
            this.f17835m = str2;
            this.f17836n = bVar2;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            a aVar = new a(this.f17830h, this.f17831i, this.f17832j, this.f17833k, this.f17834l, this.f17835m, this.f17836n, dVar);
            aVar.f17829g = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            int intValue;
            o oVar;
            int i10;
            Object unused = d.c();
            if (this.f17828f == 0) {
                q.b(obj);
                d0 d0Var = (d0) this.f17829g;
                MediaExtractor mediaExtractor = new MediaExtractor();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.f17830h, this.f17831i);
                    Context context = this.f17830h;
                    Uri uri = this.f17831i;
                    Integer num = null;
                    try {
                        p.a aVar = pl.p.f30426e;
                        mediaExtractor.setDataSource(context, uri, (Map) null);
                        pl.p.a(x.f30437a);
                    } catch (Throwable th2) {
                        p.a aVar2 = pl.p.f30426e;
                        pl.p.a(q.a(th2));
                    }
                    z1.a aVar3 = z1.a.f18712a;
                    double j10 = aVar3.j(mediaMetadataRetriever);
                    double k10 = aVar3.k(mediaMetadataRetriever);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                    if (extractMetadata == null || extractMetadata.length() == 0 || extractMetadata2 == null || extractMetadata2.length() == 0 || extractMetadata3 == null || extractMetadata3.length() == 0) {
                        return new f(this.f17832j, false, "Failed to extract video meta-data, please try again", 0, (String) null, 24, (g) null);
                    }
                    int parseInt = Integer.parseInt(extractMetadata);
                    int parseInt2 = Integer.parseInt(extractMetadata2);
                    long parseLong = Long.parseLong(extractMetadata3) * ((long) 1000);
                    if (this.f17833k.h() && parseInt2 <= 2000000) {
                        return new f(this.f17832j, false, "The provided bitrate is smaller than what is needed for compression try to set isMinBitRateEnabled to false", 0, (String) null, 24, (g) null);
                    }
                    if (this.f17833k.d() == null) {
                        intValue = aVar3.c(parseInt2, this.f17833k.c());
                    } else {
                        Integer d10 = this.f17833k.d();
                        cm.l.c(d10);
                        intValue = d10.intValue() * 1000000;
                    }
                    int i11 = intValue;
                    if (this.f17833k.e() != null) {
                        Double g10 = this.f17833k.g();
                        Integer b10 = g10 != null ? kotlin.coroutines.jvm.internal.b.b((int) g10.doubleValue()) : null;
                        Double e10 = this.f17833k.e();
                        if (e10 != null) {
                            num = kotlin.coroutines.jvm.internal.b.b((int) e10.doubleValue());
                        }
                        oVar = new o(b10, num);
                    } else {
                        oVar = aVar3.b(k10, j10, this.f17833k.b());
                    }
                    Integer num2 = (Integer) oVar.a();
                    Integer num3 = (Integer) oVar.b();
                    if (parseInt != 90) {
                        if (parseInt == 180) {
                            i10 = 0;
                        } else if (parseInt != 270) {
                            i10 = parseInt;
                        }
                        b bVar = b.f17826a;
                        int i12 = this.f17832j;
                        cm.l.c(num2);
                        int intValue2 = num2.intValue();
                        cm.l.c(num3);
                        return bVar.h(i12, intValue2, num3.intValue(), this.f17834l, i11, this.f17835m, this.f17833k.a(), mediaExtractor, this.f17836n, parseLong, i10);
                    }
                    i10 = 0;
                    Integer num4 = num2;
                    num2 = num3;
                    num3 = num4;
                    b bVar2 = b.f17826a;
                    int i122 = this.f17832j;
                    cm.l.c(num2);
                    int intValue22 = num2.intValue();
                    cm.l.c(num3);
                    return bVar2.h(i122, intValue22, num3.intValue(), this.f17834l, i11, this.f17835m, this.f17833k.a(), mediaExtractor, this.f17836n, parseLong, i10);
                } catch (IllegalArgumentException e11) {
                    z1.a.f18712a.l(e11);
                    return new f(this.f17832j, false, String.valueOf(e11.getMessage()), 0, (String) null, 24, (g) null);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private b() {
    }

    private final void c(int i10, MediaCodec mediaCodec, MediaCodec mediaCodec2, a2.a aVar, e eVar, MediaExtractor mediaExtractor) {
        mediaExtractor.unselectTrack(i10);
        mediaCodec.stop();
        mediaCodec.release();
        mediaCodec2.stop();
        mediaCodec2.release();
        aVar.d();
        eVar.d();
    }

    private final MediaCodec d(MediaFormat mediaFormat, e eVar) {
        String string = mediaFormat.getString("mime");
        cm.l.c(string);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
        cm.l.e(createDecoderByType, "createDecoderByType(inpu…(MediaFormat.KEY_MIME)!!)");
        createDecoderByType.configure(mediaFormat, eVar.c(), (MediaCrypto) null, 0);
        return createDecoderByType;
    }

    private final MediaCodec e(MediaFormat mediaFormat, boolean z10) {
        MediaCodec createByCodecName = z10 ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType("video/avc");
        cm.l.e(createByCodecName, "if (hasQTI) {\n          …Type(MIME_TYPE)\n        }");
        createByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        return createByCodecName;
    }

    private final void f(a2.b bVar, MediaCodec.BufferInfo bufferInfo, boolean z10, MediaExtractor mediaExtractor) {
        int a10 = z1.a.f18712a.a(mediaExtractor, false);
        if (a10 >= 0 && !z10) {
            mediaExtractor.selectTrack(a10);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(a10);
            cm.l.e(trackFormat, "extractor.getTrackFormat(audioIndex)");
            int a11 = bVar.a(trackFormat, true);
            int integer = trackFormat.getInteger("max-input-size");
            if (integer <= 0) {
                integer = 65536;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(integer);
            cm.l.e(allocateDirect, "allocateDirect(maxBufferSize)");
            if (Build.VERSION.SDK_INT >= 28) {
                long a12 = mediaExtractor.getSampleSize();
                if (a12 > ((long) integer)) {
                    allocateDirect = ByteBuffer.allocateDirect((int) (a12 + ((long) 1024)));
                    cm.l.e(allocateDirect, "allocateDirect(maxBufferSize)");
                }
            }
            mediaExtractor.seekTo(0, 0);
            boolean z11 = false;
            while (!z11) {
                int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
                if (sampleTrackIndex == a10) {
                    int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                    bufferInfo.size = readSampleData;
                    if (readSampleData >= 0) {
                        bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                        bufferInfo.offset = 0;
                        bufferInfo.flags = 1;
                        bVar.q(a11, allocateDirect, bufferInfo, true);
                        mediaExtractor.advance();
                    } else {
                        bufferInfo.size = 0;
                    }
                } else if (sampleTrackIndex != -1) {
                }
                z11 = true;
            }
            mediaExtractor.unselectTrack(a10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r15v17 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ea, code lost:
        r8 = r26;
        r24 = r7;
        r15 = r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e3 A[SYNTHETIC, Splitter:B:148:0x02e3] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0309  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a2.f h(int r27, int r28, int r29, java.lang.String r30, int r31, java.lang.String r32, boolean r33, android.media.MediaExtractor r34, v1.b r35, long r36, int r38) {
        /*
            r26 = this;
            r8 = r26
            r15 = r27
            r0 = r28
            r1 = r29
            r13 = r32
            r9 = r34
            r10 = r35
            if (r0 == 0) goto L_0x0326
            if (r1 == 0) goto L_0x0326
            java.io.File r14 = new java.io.File
            r2 = r30
            r14.<init>(r2)
            android.media.MediaCodec$BufferInfo r11 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x02d8 }
            r11.<init>()     // Catch:{ Exception -> 0x02d8 }
            z1.a r2 = z1.a.f18712a     // Catch:{ Exception -> 0x02d8 }
            r3 = r38
            a2.d r3 = r2.n(r3, r14)     // Catch:{ Exception -> 0x02d8 }
            a2.b r4 = new a2.b     // Catch:{ Exception -> 0x02d8 }
            r4.<init>()     // Catch:{ Exception -> 0x02d8 }
            a2.b r12 = r4.c(r3)     // Catch:{ Exception -> 0x02d8 }
            r3 = 1
            int r4 = r2.a(r9, r3)     // Catch:{ Exception -> 0x02d8 }
            r9.selectTrack(r4)     // Catch:{ Exception -> 0x02d8 }
            r5 = 0
            r7 = 0
            r9.seekTo(r5, r7)     // Catch:{ Exception -> 0x02d8 }
            android.media.MediaFormat r5 = r9.getTrackFormat(r4)     // Catch:{ Exception -> 0x02d8 }
            java.lang.String r6 = "extractor.getTrackFormat(videoIndex)"
            cm.l.e(r5, r6)     // Catch:{ Exception -> 0x02d8 }
            java.lang.String r6 = "video/avc"
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r6, r0, r1)     // Catch:{ Exception -> 0x02d8 }
            java.lang.String r1 = "createVideoFormat(MIME_TYPE, newWidth, newHeight)"
            cm.l.e(r0, r1)     // Catch:{ Exception -> 0x02d8 }
            r1 = r31
            r2.m(r5, r0, r1)     // Catch:{ Exception -> 0x02d8 }
            boolean r1 = r2.i()     // Catch:{ Exception -> 0x02d8 }
            android.media.MediaCodec r6 = r8.e(r0, r1)     // Catch:{ Exception -> 0x02d8 }
            a2.a r2 = new a2.a     // Catch:{ Exception -> 0x02b4 }
            android.view.Surface r0 = r6.createInputSurface()     // Catch:{ Exception -> 0x02b4 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x02b4 }
            r2.c()     // Catch:{ Exception -> 0x02b4 }
            r6.start()     // Catch:{ Exception -> 0x02b4 }
            a2.e r1 = new a2.e     // Catch:{ Exception -> 0x02b4 }
            r1.<init>()     // Catch:{ Exception -> 0x02b4 }
            android.media.MediaCodec r5 = r8.d(r5, r1)     // Catch:{ Exception -> 0x02b4 }
            r5.start()     // Catch:{ Exception -> 0x02b4 }
            r0 = r7
            r23 = r0
            r24 = -5
        L_0x007e:
            if (r0 != 0) goto L_0x027e
            r7 = 100
            if (r23 != 0) goto L_0x00e1
            int r3 = r34.getSampleTrackIndex()     // Catch:{ Exception -> 0x00b0 }
            if (r3 != r4) goto L_0x00c8
            int r3 = r5.dequeueInputBuffer(r7)     // Catch:{ Exception -> 0x00b0 }
            if (r3 < 0) goto L_0x00e1
            java.nio.ByteBuffer r7 = r5.getInputBuffer(r3)     // Catch:{ Exception -> 0x00b0 }
            cm.l.c(r7)     // Catch:{ Exception -> 0x00b0 }
            r8 = 0
            int r19 = r9.readSampleData(r7, r8)     // Catch:{ Exception -> 0x00b0 }
            r18 = 0
            if (r19 >= 0) goto L_0x00b7
            r19 = 0
            r20 = 0
            r22 = 4
            r16 = r5
            r17 = r3
            r16.queueInputBuffer(r17, r18, r19, r20, r22)     // Catch:{ Exception -> 0x00b0 }
        L_0x00ad:
            r23 = 1
            goto L_0x00e1
        L_0x00b0:
            r0 = move-exception
            r1 = r26
        L_0x00b3:
            r15 = r13
            r13 = r14
            goto L_0x02b8
        L_0x00b7:
            long r20 = r34.getSampleTime()     // Catch:{ Exception -> 0x00b0 }
            r22 = 0
            r16 = r5
            r17 = r3
            r16.queueInputBuffer(r17, r18, r19, r20, r22)     // Catch:{ Exception -> 0x00b0 }
            r34.advance()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00e1
        L_0x00c8:
            r7 = -1
            if (r3 != r7) goto L_0x00e1
            r7 = 100
            int r17 = r5.dequeueInputBuffer(r7)     // Catch:{ Exception -> 0x00b0 }
            if (r17 < 0) goto L_0x00e1
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 4
            r16 = r5
            r16.queueInputBuffer(r17, r18, r19, r20, r22)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00ad
        L_0x00e1:
            r7 = r24
            r3 = 1
            r8 = 1
        L_0x00e5:
            if (r8 != 0) goto L_0x00f0
            if (r3 == 0) goto L_0x00ea
            goto L_0x00f0
        L_0x00ea:
            r8 = r26
            r24 = r7
            r7 = 0
            goto L_0x007e
        L_0x00f0:
            boolean r16 = f17827b     // Catch:{ Exception -> 0x0278 }
            if (r16 != 0) goto L_0x012b
            r16 = r1
            r1 = r26
            r7 = r2
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r16
            r7 = r34
            r1.c(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0126 }
            r10.a(r15)     // Catch:{ Exception -> 0x0126 }
            a2.f r0 = new a2.f     // Catch:{ Exception -> 0x0126 }
            r11 = 0
            java.lang.String r12 = "The compression has stopped!"
            r1 = 0
            r3 = 0
            r16 = 24
            r17 = 0
            r9 = r0
            r10 = r27
            r5 = r13
            r4 = r14
            r13 = r1
            r2 = r15
            r15 = r3
            r9.<init>(r10, r11, r12, r13, r15, r16, r17)     // Catch:{ Exception -> 0x011f }
            return r0
        L_0x011f:
            r0 = move-exception
        L_0x0120:
            r1 = r26
            r13 = r4
            r15 = r5
            goto L_0x02b8
        L_0x0126:
            r0 = move-exception
            r5 = r13
            r4 = r14
            r2 = r15
            goto L_0x0120
        L_0x012b:
            r16 = r1
            r31 = r8
            r8 = 100
            r25 = r14
            r14 = r2
            r2 = r15
            r15 = r13
            r13 = r25
            int r1 = r6.dequeueOutputBuffer(r11, r8)     // Catch:{ Exception -> 0x0161 }
            r9 = -2
            r8 = -1
            if (r1 != r8) goto L_0x0147
            r3 = r0
            r19 = r7
            r7 = 0
            r9 = 1
            goto L_0x01c8
        L_0x0147:
            if (r1 != r9) goto L_0x0169
            android.media.MediaFormat r8 = r6.getOutputFormat()     // Catch:{ Exception -> 0x0161 }
            java.lang.String r9 = "encoder.outputFormat"
            cm.l.e(r8, r9)     // Catch:{ Exception -> 0x0161 }
            r9 = -5
            if (r7 != r9) goto L_0x0166
            r9 = 0
            int r7 = r12.a(r8, r9)     // Catch:{ Exception -> 0x0161 }
            r19 = r7
            r8 = -1
            r9 = 1
        L_0x015e:
            r7 = r3
            r3 = r0
            goto L_0x01c8
        L_0x0161:
            r0 = move-exception
        L_0x0162:
            r1 = r26
            goto L_0x02b8
        L_0x0166:
            r8 = 0
            r9 = 1
            goto L_0x0191
        L_0x0169:
            r8 = -3
            if (r1 == r8) goto L_0x0166
            if (r1 < 0) goto L_0x01b1
            java.nio.ByteBuffer r0 = r6.getOutputBuffer(r1)     // Catch:{ Exception -> 0x0161 }
            if (r0 == 0) goto L_0x0195
            int r8 = r11.size     // Catch:{ Exception -> 0x0161 }
            r9 = 1
            if (r8 <= r9) goto L_0x0183
            int r8 = r11.flags     // Catch:{ Exception -> 0x0161 }
            r8 = r8 & 2
            if (r8 != 0) goto L_0x0183
            r8 = 0
            r12.q(r7, r0, r11, r8)     // Catch:{ Exception -> 0x0161 }
        L_0x0183:
            int r0 = r11.flags     // Catch:{ Exception -> 0x0161 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x018c
            r0 = r9
        L_0x018a:
            r8 = 0
            goto L_0x018e
        L_0x018c:
            r0 = 0
            goto L_0x018a
        L_0x018e:
            r6.releaseOutputBuffer(r1, r8)     // Catch:{ Exception -> 0x0161 }
        L_0x0191:
            r19 = r7
            r8 = -1
            goto L_0x015e
        L_0x0195:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0161 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0161 }
            r3.<init>()     // Catch:{ Exception -> 0x0161 }
            java.lang.String r4 = "encoderOutputBuffer "
            r3.append(r4)     // Catch:{ Exception -> 0x0161 }
            r3.append(r1)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r1 = " was null"
            r3.append(r1)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0161 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0161 }
            throw r0     // Catch:{ Exception -> 0x0161 }
        L_0x01b1:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0161 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0161 }
            r3.<init>()     // Catch:{ Exception -> 0x0161 }
            java.lang.String r4 = "unexpected result from encoder.dequeueOutputBuffer: "
            r3.append(r4)     // Catch:{ Exception -> 0x0161 }
            r3.append(r1)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0161 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0161 }
            throw r0     // Catch:{ Exception -> 0x0161 }
        L_0x01c8:
            if (r1 != r8) goto L_0x0266
            r9 = 100
            int r0 = r5.dequeueOutputBuffer(r11, r9)     // Catch:{ Exception -> 0x0161 }
            if (r0 != r8) goto L_0x01e6
            r9 = r34
            r10 = r35
        L_0x01d6:
            r0 = r3
            r3 = r7
            r1 = r16
            r7 = r19
            r8 = 0
        L_0x01dd:
            r25 = r15
            r15 = r2
            r2 = r14
            r14 = r13
            r13 = r25
            goto L_0x00e5
        L_0x01e6:
            r1 = -3
            if (r0 == r1) goto L_0x025f
            r1 = -2
            if (r0 == r1) goto L_0x025f
            if (r0 < 0) goto L_0x0248
            int r1 = r11.size     // Catch:{ Exception -> 0x0161 }
            if (r1 == 0) goto L_0x01f4
            r1 = 1
            goto L_0x01f5
        L_0x01f4:
            r1 = 0
        L_0x01f5:
            r5.releaseOutputBuffer(r0, r1)     // Catch:{ Exception -> 0x0161 }
            if (r1 == 0) goto L_0x0235
            r16.a()     // Catch:{ Exception -> 0x021f }
            r16.b()     // Catch:{ Exception -> 0x0161 }
            long r0 = r11.presentationTimeUs     // Catch:{ Exception -> 0x0161 }
            r8 = 1000(0x3e8, float:1.401E-42)
            long r9 = (long) r8     // Catch:{ Exception -> 0x0161 }
            long r0 = r0 * r9
            r14.e(r0)     // Catch:{ Exception -> 0x0161 }
            long r0 = r11.presentationTimeUs     // Catch:{ Exception -> 0x0161 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0161 }
            r8 = r36
            float r1 = (float) r8     // Catch:{ Exception -> 0x0161 }
            float r0 = r0 / r1
            r1 = 100
            float r1 = (float) r1     // Catch:{ Exception -> 0x0161 }
            float r0 = r0 * r1
            r1 = r35
            r17 = 100
            r1.b(r2, r0)     // Catch:{ Exception -> 0x0161 }
            r14.f()     // Catch:{ Exception -> 0x0161 }
            goto L_0x023b
        L_0x021f:
            r0 = move-exception
            r1 = r35
            r17 = r9
            r8 = r36
            r10 = r0
            java.lang.String r0 = "Compressor"
            java.lang.String r10 = r10.getMessage()     // Catch:{ Exception -> 0x0161 }
            if (r10 != 0) goto L_0x0231
            java.lang.String r10 = "Compression failed at swapping buffer"
        L_0x0231:
            android.util.Log.e(r0, r10)     // Catch:{ Exception -> 0x0161 }
            goto L_0x023b
        L_0x0235:
            r1 = r35
            r17 = r9
            r8 = r36
        L_0x023b:
            int r0 = r11.flags     // Catch:{ Exception -> 0x0161 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x026b
            r6.signalEndOfInputStream()     // Catch:{ Exception -> 0x0161 }
            r9 = r34
            r10 = r1
            goto L_0x01d6
        L_0x0248:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0161 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0161 }
            r3.<init>()     // Catch:{ Exception -> 0x0161 }
            java.lang.String r4 = "unexpected result from decoder.dequeueOutputBuffer: "
            r3.append(r4)     // Catch:{ Exception -> 0x0161 }
            r3.append(r0)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0161 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0161 }
            throw r1     // Catch:{ Exception -> 0x0161 }
        L_0x025f:
            r1 = r35
            r17 = r9
            r8 = r36
            goto L_0x026b
        L_0x0266:
            r8 = r36
            r1 = r10
            r17 = 100
        L_0x026b:
            r8 = r31
            r9 = r34
            r10 = r1
            r0 = r3
            r3 = r7
            r1 = r16
            r7 = r19
            goto L_0x01dd
        L_0x0278:
            r0 = move-exception
            r2 = r15
            r15 = r13
            r13 = r14
            goto L_0x0162
        L_0x027e:
            r16 = r1
            r25 = r14
            r14 = r2
            r2 = r15
            r15 = r13
            r13 = r25
            r1 = r26
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r14
            r6 = r16
            r7 = r34
            r1.c(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x02b0 }
            r2 = r33
            r3 = r34
            r1.f(r12, r11, r2, r3)     // Catch:{ Exception -> 0x02ac }
            r34.release()     // Catch:{ Exception -> 0x02ac }
            r12.m()     // Catch:{ Exception -> 0x02a4 }
        L_0x02a1:
            r5 = r13
            r3 = r15
            goto L_0x02e1
        L_0x02a4:
            r0 = move-exception
            r2 = r0
            z1.a r0 = z1.a.f18712a     // Catch:{ Exception -> 0x02ac }
            r0.l(r2)     // Catch:{ Exception -> 0x02ac }
            goto L_0x02a1
        L_0x02ac:
            r0 = move-exception
        L_0x02ad:
            r5 = r13
            r3 = r15
            goto L_0x02dc
        L_0x02b0:
            r0 = move-exception
            r1 = r26
            goto L_0x02ad
        L_0x02b4:
            r0 = move-exception
            r1 = r8
            goto L_0x00b3
        L_0x02b8:
            z1.a r2 = z1.a.f18712a     // Catch:{ Exception -> 0x02ac }
            r2.l(r0)     // Catch:{ Exception -> 0x02ac }
            a2.f r2 = new a2.f     // Catch:{ Exception -> 0x02ac }
            r11 = 0
            java.lang.String r12 = r0.getMessage()     // Catch:{ Exception -> 0x02ac }
            r3 = 0
            r0 = 0
            r16 = 24
            r17 = 0
            r9 = r2
            r10 = r27
            r5 = r13
            r13 = r3
            r3 = r15
            r15 = r0
            r9.<init>(r10, r11, r12, r13, r15, r16, r17)     // Catch:{ Exception -> 0x02d6 }
            return r2
        L_0x02d6:
            r0 = move-exception
            goto L_0x02dc
        L_0x02d8:
            r0 = move-exception
            r1 = r8
            r3 = r13
            r5 = r14
        L_0x02dc:
            z1.a r2 = z1.a.f18712a
            r2.l(r0)
        L_0x02e1:
            if (r3 == 0) goto L_0x0309
            z1.c r0 = z1.c.f18714a     // Catch:{ Exception -> 0x0301 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0301 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0301 }
            boolean r0 = r0.e(r5, r2)     // Catch:{ Exception -> 0x0301 }
            java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x0301 }
            r14.<init>(r3)     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x030a
            boolean r0 = r5.exists()     // Catch:{ Exception -> 0x02ff }
            if (r0 == 0) goto L_0x030a
            r5.delete()     // Catch:{ Exception -> 0x02ff }
            goto L_0x030a
        L_0x02ff:
            r0 = move-exception
            goto L_0x0303
        L_0x0301:
            r0 = move-exception
            r14 = r5
        L_0x0303:
            z1.a r2 = z1.a.f18712a
            r2.l(r0)
            goto L_0x030a
        L_0x0309:
            r14 = r5
        L_0x030a:
            a2.f r0 = new a2.f
            r2 = 1
            r3 = 0
            long r4 = r14.length()
            java.lang.String r6 = r14.getPath()
            r28 = r0
            r29 = r27
            r30 = r2
            r31 = r3
            r32 = r4
            r34 = r6
            r28.<init>(r29, r30, r31, r32, r34)
            return r0
        L_0x0326:
            r1 = r8
            a2.f r0 = new a2.f
            r2 = 0
            java.lang.String r3 = "Something went wrong, please try again"
            r4 = 0
            r6 = 0
            r7 = 24
            r8 = 0
            r28 = r0
            r29 = r27
            r30 = r2
            r31 = r3
            r32 = r4
            r34 = r6
            r35 = r7
            r36 = r8
            r28.<init>(r29, r30, r31, r32, r34, r35, r36)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.b.h(int, int, int, java.lang.String, int, java.lang.String, boolean, android.media.MediaExtractor, v1.b, long, int):a2.f");
    }

    public final Object b(int i10, Context context, Uri uri, String str, String str2, x1.b bVar, v1.b bVar2, d dVar) {
        return lm.f.e(q0.a(), new a(context, uri, i10, bVar, str, str2, bVar2, (d) null), dVar);
    }

    public final void g(boolean z10) {
        f17827b = z10;
    }
}
