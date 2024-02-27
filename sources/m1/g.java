package m1;

import android.app.Notification;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final int f13687a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13688b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f13689c;

    public g(int i10, Notification notification, int i11) {
        this.f13687a = i10;
        this.f13689c = notification;
        this.f13688b = i11;
    }

    public int a() {
        return this.f13688b;
    }

    public Notification b() {
        return this.f13689c;
    }

    public int c() {
        return this.f13687a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f13687a == gVar.f13687a && this.f13688b == gVar.f13688b) {
            return this.f13689c.equals(gVar.f13689c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f13687a * 31) + this.f13688b) * 31) + this.f13689c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f13687a + ", mForegroundServiceType=" + this.f13688b + ", mNotification=" + this.f13689c + '}';
    }
}
