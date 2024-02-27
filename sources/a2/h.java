package a2;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import cm.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f85a = 4;

    /* renamed from: b  reason: collision with root package name */
    private final int f86b = (4 * 5);

    /* renamed from: c  reason: collision with root package name */
    private final int f87c;

    /* renamed from: d  reason: collision with root package name */
    private final int f88d = 3;

    /* renamed from: e  reason: collision with root package name */
    private FloatBuffer f89e;

    /* renamed from: f  reason: collision with root package name */
    private final String f90f = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: g  reason: collision with root package name */
    private final String f91g = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";

    /* renamed from: h  reason: collision with root package name */
    private final float[] f92h = new float[16];

    /* renamed from: i  reason: collision with root package name */
    private final float[] f93i;

    /* renamed from: j  reason: collision with root package name */
    private int f94j;

    /* renamed from: k  reason: collision with root package name */
    private int f95k;

    /* renamed from: l  reason: collision with root package name */
    private int f96l;

    /* renamed from: m  reason: collision with root package name */
    private int f97m;

    /* renamed from: n  reason: collision with root package name */
    private int f98n;

    /* renamed from: o  reason: collision with root package name */
    private int f99o;

    public h() {
        float[] fArr = new float[16];
        this.f93i = fArr;
        this.f95k = -12345;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(20 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        l.e(asFloatBuffer, "allocateDirect(\n        …eOrder()).asFloatBuffer()");
        this.f89e = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    private final int b() {
        int e10;
        int e11 = e(35633, this.f90f);
        if (e11 == 0 || (e10 = e(35632, this.f91g)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (glCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, e11);
        a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, e10);
        a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    private final int e(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        a("glCreateShader type=" + i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public final void a(String str) {
        l.f(str, "op");
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw new RuntimeException(str + ": glError " + glGetError);
        }
    }

    public final void c(SurfaceTexture surfaceTexture) {
        l.f(surfaceTexture, "st");
        a("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.f93i);
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f94j);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f95k);
        this.f89e.position(this.f87c);
        GLES20.glVertexAttribPointer(this.f98n, 3, 5126, false, this.f86b, this.f89e);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.f98n);
        a("glEnableVertexAttribArray maPositionHandle");
        this.f89e.position(this.f88d);
        GLES20.glVertexAttribPointer(this.f99o, 2, 5126, false, this.f86b, this.f89e);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.f99o);
        a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.f92h, 0);
        GLES20.glUniformMatrix4fv(this.f96l, 1, false, this.f92h, 0);
        GLES20.glUniformMatrix4fv(this.f97m, 1, false, this.f93i, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        GLES20.glFinish();
    }

    public final int d() {
        return this.f95k;
    }

    public final void f() {
        int b10 = b();
        this.f94j = b10;
        if (b10 != 0) {
            this.f98n = GLES20.glGetAttribLocation(b10, "aPosition");
            a("glGetAttribLocation aPosition");
            if (this.f98n != -1) {
                this.f99o = GLES20.glGetAttribLocation(this.f94j, "aTextureCoord");
                a("glGetAttribLocation aTextureCoord");
                if (this.f99o != -1) {
                    this.f96l = GLES20.glGetUniformLocation(this.f94j, "uMVPMatrix");
                    a("glGetUniformLocation uMVPMatrix");
                    if (this.f96l != -1) {
                        this.f97m = GLES20.glGetUniformLocation(this.f94j, "uSTMatrix");
                        a("glGetUniformLocation uSTMatrix");
                        if (this.f97m != -1) {
                            int[] iArr = new int[1];
                            GLES20.glGenTextures(1, iArr, 0);
                            int i10 = iArr[0];
                            this.f95k = i10;
                            GLES20.glBindTexture(36197, i10);
                            a("glBindTexture mTextureID");
                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            a("glTexParameter");
                            return;
                        }
                        throw new RuntimeException("Could not get attrib location for uSTMatrix");
                    }
                    throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                }
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        throw new RuntimeException("failed creating program");
    }
}
