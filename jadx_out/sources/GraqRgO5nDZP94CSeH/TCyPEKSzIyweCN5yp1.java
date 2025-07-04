package GraqRgO5nDZP94CSeH;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class TCyPEKSzIyweCN5yp1 implements zZKhbgvUfsK4AEX3r0, Serializable {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Object f269HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 f270lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public volatile Object f271s3fjYDxWOUexjjVgyA;

    public TCyPEKSzIyweCN5yp1(RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Object obj) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "initializer");
        this.f270lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
        this.f271s3fjYDxWOUexjjVgyA = pbVGzGjWvY2LDXC8vo.f272lEeR5KfoEr4xU5yHH7;
        this.f269HJFh0TGMpafqLE9haL = obj == null ? this : obj;
    }

    @Override // GraqRgO5nDZP94CSeH.zZKhbgvUfsK4AEX3r0
    public Object getValue() {
        Object objLEeR5KfoEr4xU5yHH7;
        Object obj = this.f271s3fjYDxWOUexjjVgyA;
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = pbVGzGjWvY2LDXC8vo.f272lEeR5KfoEr4xU5yHH7;
        if (obj != pbvgzgjwvy2ldxc8vo) {
            return obj;
        }
        synchronized (this.f269HJFh0TGMpafqLE9haL) {
            objLEeR5KfoEr4xU5yHH7 = this.f271s3fjYDxWOUexjjVgyA;
            if (objLEeR5KfoEr4xU5yHH7 == pbvgzgjwvy2ldxc8vo) {
                RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f270lEeR5KfoEr4xU5yHH7;
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7);
                objLEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7();
                this.f271s3fjYDxWOUexjjVgyA = objLEeR5KfoEr4xU5yHH7;
                this.f270lEeR5KfoEr4xU5yHH7 = null;
            }
        }
        return objLEeR5KfoEr4xU5yHH7;
    }

    public boolean lEeR5KfoEr4xU5yHH7() {
        return this.f271s3fjYDxWOUexjjVgyA != pbVGzGjWvY2LDXC8vo.f272lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        return lEeR5KfoEr4xU5yHH7() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ TCyPEKSzIyweCN5yp1(RkBK3rbmyPvWiHUrac.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Object obj, int i, jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this(leer5kfoer4xu5yhh7, (i & 2) != 0 ? null : obj);
    }
}
