package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    AudioAttributes f3404a;

    /* renamed from: b  reason: collision with root package name */
    int f3405b = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f3404a.equals(((AudioAttributesImplApi21) obj).f3404a);
    }

    public int hashCode() {
        return this.f3404a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3404a;
    }
}
