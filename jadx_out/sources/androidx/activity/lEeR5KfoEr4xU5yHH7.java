package androidx.activity;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f2566lEeR5KfoEr4xU5yHH7 = new lEeR5KfoEr4xU5yHH7();

    public final int HJFh0TGMpafqLE9haL(BackEvent backEvent) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float husNiw3snxdgZPAGJm(BackEvent backEvent) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(backEvent, "backEvent");
        return backEvent.getTouchY();
    }

    public final BackEvent lEeR5KfoEr4xU5yHH7(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float s3fjYDxWOUexjjVgyA(BackEvent backEvent) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final float zZKhbgvUfsK4AEX3r0(BackEvent backEvent) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(backEvent, "backEvent");
        return backEvent.getTouchX();
    }
}
