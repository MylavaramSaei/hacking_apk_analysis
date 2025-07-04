package androidx.activity;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA {

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f2570husNiw3snxdgZPAGJm = new lEeR5KfoEr4xU5yHH7(null);

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final float f2571HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final float f2572lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final float f2573s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int f2574zZKhbgvUfsK4AEX3r0;

    public static final class lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        public /* synthetic */ lEeR5KfoEr4xU5yHH7(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }

    public s3fjYDxWOUexjjVgyA(float f, float f2, float f3, int i) {
        this.f2572lEeR5KfoEr4xU5yHH7 = f;
        this.f2573s3fjYDxWOUexjjVgyA = f2;
        this.f2571HJFh0TGMpafqLE9haL = f3;
        this.f2574zZKhbgvUfsK4AEX3r0 = i;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f2572lEeR5KfoEr4xU5yHH7 + ", touchY=" + this.f2573s3fjYDxWOUexjjVgyA + ", progress=" + this.f2571HJFh0TGMpafqLE9haL + ", swipeEdge=" + this.f2574zZKhbgvUfsK4AEX3r0 + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s3fjYDxWOUexjjVgyA(BackEvent backEvent) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(backEvent, "backEvent");
        androidx.activity.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = androidx.activity.lEeR5KfoEr4xU5yHH7.f2566lEeR5KfoEr4xU5yHH7;
        this(leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0(backEvent), leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm(backEvent), leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(backEvent), leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL(backEvent));
    }
}
