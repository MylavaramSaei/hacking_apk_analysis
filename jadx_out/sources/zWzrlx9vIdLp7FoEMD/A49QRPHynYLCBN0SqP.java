package zWzrlx9vIdLp7FoEMD;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class A49QRPHynYLCBN0SqP implements xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA {

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public volatile Set f7358s3fjYDxWOUexjjVgyA = null;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public volatile Set f7357lEeR5KfoEr4xU5yHH7 = Collections.newSetFromMap(new ConcurrentHashMap());

    public A49QRPHynYLCBN0SqP(Collection collection) {
        this.f7357lEeR5KfoEr4xU5yHH7.addAll(collection);
    }

    public static A49QRPHynYLCBN0SqP s3fjYDxWOUexjjVgyA(Collection collection) {
        return new A49QRPHynYLCBN0SqP((Set) collection);
    }

    @Override // xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA
    /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f7358s3fjYDxWOUexjjVgyA == null) {
            synchronized (this) {
                try {
                    if (this.f7358s3fjYDxWOUexjjVgyA == null) {
                        this.f7358s3fjYDxWOUexjjVgyA = Collections.newSetFromMap(new ConcurrentHashMap());
                        zZKhbgvUfsK4AEX3r0();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f7358s3fjYDxWOUexjjVgyA);
    }

    public synchronized void lEeR5KfoEr4xU5yHH7(xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        Set set;
        Object obj;
        try {
            if (this.f7358s3fjYDxWOUexjjVgyA == null) {
                set = this.f7357lEeR5KfoEr4xU5yHH7;
                obj = s3fjydxwouexjjvgya;
            } else {
                set = this.f7358s3fjYDxWOUexjjVgyA;
                obj = s3fjydxwouexjjvgya.get();
            }
            set.add(obj);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zZKhbgvUfsK4AEX3r0() {
        try {
            Iterator it = this.f7357lEeR5KfoEr4xU5yHH7.iterator();
            while (it.hasNext()) {
                this.f7358s3fjYDxWOUexjjVgyA.add(((xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA) it.next()).get());
            }
            this.f7357lEeR5KfoEr4xU5yHH7 = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
