package zWzrlx9vIdLp7FoEMD;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class G7AC3DWIx9i9fdanjk implements tGGjvtdOhUewv2twsg.zZKhbgvUfsK4AEX3r0, tGGjvtdOhUewv2twsg.HJFh0TGMpafqLE9haL {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Executor f7359HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Map f7360lEeR5KfoEr4xU5yHH7 = new HashMap();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public Queue f7361s3fjYDxWOUexjjVgyA = new ArrayDeque();

    public G7AC3DWIx9i9fdanjk(Executor executor) {
        this.f7359HJFh0TGMpafqLE9haL = executor;
    }

    public static /* synthetic */ void husNiw3snxdgZPAGJm(Map.Entry entry, tGGjvtdOhUewv2twsg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        ((tGGjvtdOhUewv2twsg.s3fjYDxWOUexjjVgyA) entry.getKey()).lEeR5KfoEr4xU5yHH7(leer5kfoer4xu5yhh7);
    }

    public void HJFh0TGMpafqLE9haL() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f7361s3fjYDxWOUexjjVgyA;
                if (queue != null) {
                    this.f7361s3fjYDxWOUexjjVgyA = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(it.next());
                KYHag8HRDlnO3X9zmZ(null);
            }
        }
    }

    public void KYHag8HRDlnO3X9zmZ(final tGGjvtdOhUewv2twsg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        OUd9THiLjZndMj0qdF.s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7);
        synchronized (this) {
            try {
                Queue queue = this.f7361s3fjYDxWOUexjjVgyA;
                if (queue != null) {
                    queue.add(leer5kfoer4xu5yhh7);
                    return;
                }
                for (final Map.Entry entry : zZKhbgvUfsK4AEX3r0(leer5kfoer4xu5yhh7)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, leer5kfoer4xu5yhh7) { // from class: zWzrlx9vIdLp7FoEMD.R9SAhYMerGybF9OAjL

                        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
                        public final /* synthetic */ Map.Entry f7387lEeR5KfoEr4xU5yHH7;

                        @Override // java.lang.Runnable
                        public final void run() {
                            G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(this.f7387lEeR5KfoEr4xU5yHH7, null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void TCyPEKSzIyweCN5yp1(Class cls, Executor executor, tGGjvtdOhUewv2twsg.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        try {
            OUd9THiLjZndMj0qdF.s3fjYDxWOUexjjVgyA(cls);
            OUd9THiLjZndMj0qdF.s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgya);
            OUd9THiLjZndMj0qdF.s3fjYDxWOUexjjVgyA(executor);
            if (!this.f7360lEeR5KfoEr4xU5yHH7.containsKey(cls)) {
                this.f7360lEeR5KfoEr4xU5yHH7.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f7360lEeR5KfoEr4xU5yHH7.get(cls)).put(s3fjydxwouexjjvgya, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // tGGjvtdOhUewv2twsg.zZKhbgvUfsK4AEX3r0
    public void lEeR5KfoEr4xU5yHH7(Class cls, tGGjvtdOhUewv2twsg.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        TCyPEKSzIyweCN5yp1(cls, this.f7359HJFh0TGMpafqLE9haL, s3fjydxwouexjjvgya);
    }

    public final synchronized Set zZKhbgvUfsK4AEX3r0(tGGjvtdOhUewv2twsg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        throw null;
    }
}
