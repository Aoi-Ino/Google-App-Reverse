package androidx.media;

import androidx.versionedparcelable.a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3406a = aVar.p(audioAttributesImplBase.f3406a, 1);
        audioAttributesImplBase.f3407b = aVar.p(audioAttributesImplBase.f3407b, 2);
        audioAttributesImplBase.f3408c = aVar.p(audioAttributesImplBase.f3408c, 3);
        audioAttributesImplBase.f3409d = aVar.p(audioAttributesImplBase.f3409d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f3406a, 1);
        aVar.F(audioAttributesImplBase.f3407b, 2);
        aVar.F(audioAttributesImplBase.f3408c, 3);
        aVar.F(audioAttributesImplBase.f3409d, 4);
    }
}
