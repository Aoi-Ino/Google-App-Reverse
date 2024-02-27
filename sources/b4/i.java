package b4;

import android.os.Handler;
import android.os.Looper;

public class i extends Handler {
    public i(Looper looper) {
        super(looper);
    }

    public i(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
