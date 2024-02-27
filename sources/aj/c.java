package aj;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class c {
    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static String b() {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        } catch (Exception e10) {
            e10.printStackTrace();
            return "--";
        }
    }

    public static void c(File file, Context context) {
        AssetManager assets = context.getAssets();
        Log.e("SAVE_FILE_FROM_ASSETS", file.getName());
        try {
            InputStream open = assets.open("fonts/" + file.getName());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            a(open, bufferedOutputStream);
            open.close();
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (Exception e10) {
            Log.e("SAVE_FILE_FROM_ASSETS", e10.getMessage());
        }
    }
}
