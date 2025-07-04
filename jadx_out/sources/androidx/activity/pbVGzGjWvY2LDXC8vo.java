package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class pbVGzGjWvY2LDXC8vo {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 f2567HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f2568lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final CopyOnWriteArrayList f2569s3fjYDxWOUexjjVgyA = new CopyOnWriteArrayList();

    public pbVGzGjWvY2LDXC8vo(boolean z) {
        this.f2568lEeR5KfoEr4xU5yHH7 = z;
    }

    public final void Acstmh57AKoSEkEFNJ(boolean z) {
        this.f2568lEeR5KfoEr4xU5yHH7 = z;
        RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2567HJFh0TGMpafqLE9haL;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7();
        }
    }

    public void HJFh0TGMpafqLE9haL() {
    }

    public final void IPyIQcaNa8aB7drBED() {
        Iterator it = this.f2569s3fjYDxWOUexjjVgyA.iterator();
        while (it.hasNext()) {
            ((HJFh0TGMpafqLE9haL) it.next()).cancel();
        }
    }

    public void KYHag8HRDlnO3X9zmZ(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya, "backEvent");
    }

    public final boolean TCyPEKSzIyweCN5yp1() {
        return this.f2568lEeR5KfoEr4xU5yHH7;
    }

    public final void Z9WdNiOsPR0y54zHW4(RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f2567HJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh7;
    }

    public void husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya, "backEvent");
    }

    public final void lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(hJFh0TGMpafqLE9haL, "cancellable");
        this.f2569s3fjYDxWOUexjjVgyA.add(hJFh0TGMpafqLE9haL);
    }

    public final void pbVGzGjWvY2LDXC8vo(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(hJFh0TGMpafqLE9haL, "cancellable");
        this.f2569s3fjYDxWOUexjjVgyA.remove(hJFh0TGMpafqLE9haL);
    }

    public final RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA() {
        return this.f2567HJFh0TGMpafqLE9haL;
    }

    public abstract void zZKhbgvUfsK4AEX3r0();
}
