package zQjb36M22TWHJmh54i;

import java.util.List;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 extends sTkWmhpZ5b1ArQIw4K {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final String f7352lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final List f7353s3fjYDxWOUexjjVgyA;

    public lEeR5KfoEr4xU5yHH7(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f7352lEeR5KfoEr4xU5yHH7 = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f7353s3fjYDxWOUexjjVgyA = list;
    }

    @Override // zQjb36M22TWHJmh54i.sTkWmhpZ5b1ArQIw4K
    public String HJFh0TGMpafqLE9haL() {
        return this.f7352lEeR5KfoEr4xU5yHH7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sTkWmhpZ5b1ArQIw4K)) {
            return false;
        }
        sTkWmhpZ5b1ArQIw4K stkwmhpz5b1arqiw4k = (sTkWmhpZ5b1ArQIw4K) obj;
        return this.f7352lEeR5KfoEr4xU5yHH7.equals(stkwmhpz5b1arqiw4k.HJFh0TGMpafqLE9haL()) && this.f7353s3fjYDxWOUexjjVgyA.equals(stkwmhpz5b1arqiw4k.s3fjYDxWOUexjjVgyA());
    }

    public int hashCode() {
        return ((this.f7352lEeR5KfoEr4xU5yHH7.hashCode() ^ 1000003) * 1000003) ^ this.f7353s3fjYDxWOUexjjVgyA.hashCode();
    }

    @Override // zQjb36M22TWHJmh54i.sTkWmhpZ5b1ArQIw4K
    public List s3fjYDxWOUexjjVgyA() {
        return this.f7353s3fjYDxWOUexjjVgyA;
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f7352lEeR5KfoEr4xU5yHH7 + ", usedDates=" + this.f7353s3fjYDxWOUexjjVgyA + "}";
    }
}
