package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer.c f2878e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e.h f2879f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f2880g;

    public /* synthetic */ f(EmojiCompatInitializer.c cVar, e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f2878e = cVar;
        this.f2879f = hVar;
        this.f2880g = threadPoolExecutor;
    }

    public final void run() {
        this.f2878e.d(this.f2879f, this.f2880g);
    }
}
