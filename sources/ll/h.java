package ll;

import android.view.MotionEvent;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private float f24929a;

    /* renamed from: b  reason: collision with root package name */
    private float f24930b;

    /* renamed from: c  reason: collision with root package name */
    private float f24931c;

    /* renamed from: d  reason: collision with root package name */
    private float f24932d;

    /* renamed from: e  reason: collision with root package name */
    private int f24933e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f24934f = -1;

    /* renamed from: g  reason: collision with root package name */
    private float f24935g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f24936h;

    /* renamed from: i  reason: collision with root package name */
    private a f24937i;

    public interface a {
        boolean a(h hVar);
    }

    public static class b implements a {
    }

    public h(a aVar) {
        this.f24937i = aVar;
    }

    private float a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return b((float) Math.toDegrees((double) ((float) Math.atan2((double) (f11 - f13), (double) (f10 - f12)))), (float) Math.toDegrees((double) ((float) Math.atan2((double) (f15 - f17), (double) (f14 - f16)))));
    }

    private float b(float f10, float f11) {
        float f12;
        float f13 = (f11 % 360.0f) - (f10 % 360.0f);
        this.f24935g = f13;
        if (f13 < -180.0f) {
            f12 = f13 + 360.0f;
        } else {
            if (f13 > 180.0f) {
                f12 = f13 - 360.0f;
            }
            return this.f24935g;
        }
        this.f24935g = f12;
        return this.f24935g;
    }

    public float c() {
        return this.f24935g;
    }

    public boolean d(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f24933e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f24929a = motionEvent.getX();
                    this.f24930b = motionEvent.getY();
                    this.f24934f = motionEvent2.findPointerIndex(motionEvent2.getPointerId(motionEvent.getActionIndex()));
                } else if (actionMasked == 6) {
                    this.f24934f = -1;
                }
            } else if (!(this.f24933e == -1 || this.f24934f == -1 || motionEvent.getPointerCount() <= this.f24934f)) {
                float x10 = motionEvent2.getX(this.f24933e);
                float y10 = motionEvent2.getY(this.f24933e);
                float x11 = motionEvent2.getX(this.f24934f);
                float y11 = motionEvent2.getY(this.f24934f);
                if (this.f24936h) {
                    this.f24935g = 0.0f;
                    this.f24936h = false;
                } else {
                    a(this.f24929a, this.f24930b, this.f24931c, this.f24932d, x11, y11, x10, y10);
                }
                a aVar = this.f24937i;
                if (aVar != null) {
                    aVar.a(this);
                }
                this.f24929a = x11;
                this.f24930b = y11;
                this.f24931c = x10;
                this.f24932d = y10;
            }
            return true;
        }
        this.f24931c = motionEvent.getX();
        this.f24932d = motionEvent.getY();
        this.f24933e = motionEvent2.findPointerIndex(motionEvent2.getPointerId(0));
        this.f24935g = 0.0f;
        this.f24936h = true;
        return true;
    }
}
