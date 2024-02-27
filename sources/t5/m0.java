package t5;

import android.os.IBinder;
import android.os.IInterface;

public abstract class m0 extends e0 implements n0 {
    public static n0 d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new l0(iBinder);
    }
}
