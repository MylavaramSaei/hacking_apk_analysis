package JXsqbvi9UKxeF3HXpU;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class XzJ1BS7H9Ilbkv4eVM {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f793HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Object f794lEeR5KfoEr4xU5yHH7 = new Object();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Queue f795s3fjYDxWOUexjjVgyA;

    public final void lEeR5KfoEr4xU5yHH7(jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm) {
        synchronized (this.f794lEeR5KfoEr4xU5yHH7) {
            try {
                if (this.f795s3fjYDxWOUexjjVgyA == null) {
                    this.f795s3fjYDxWOUexjjVgyA = new ArrayDeque();
                }
                this.f795s3fjYDxWOUexjjVgyA.add(jctueu2yi1pocxwcjm);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s3fjYDxWOUexjjVgyA(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        jCtUeU2YI1poCxWcjm jctueu2yi1pocxwcjm;
        synchronized (this.f794lEeR5KfoEr4xU5yHH7) {
            if (this.f795s3fjYDxWOUexjjVgyA != null && !this.f793HJFh0TGMpafqLE9haL) {
                this.f793HJFh0TGMpafqLE9haL = true;
                while (true) {
                    synchronized (this.f794lEeR5KfoEr4xU5yHH7) {
                        try {
                            jctueu2yi1pocxwcjm = (jCtUeU2YI1poCxWcjm) this.f795s3fjYDxWOUexjjVgyA.poll();
                            if (jctueu2yi1pocxwcjm == null) {
                                this.f793HJFh0TGMpafqLE9haL = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    jctueu2yi1pocxwcjm.lEeR5KfoEr4xU5yHH7(pbvgzgjwvy2ldxc8vo);
                }
            }
        }
    }
}
