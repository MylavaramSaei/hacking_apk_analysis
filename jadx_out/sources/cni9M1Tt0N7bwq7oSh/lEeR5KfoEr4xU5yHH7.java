package cni9M1Tt0N7bwq7oSh;

import F8je6vTkTMHm5WbjEC.A49QRPHynYLCBN0SqP;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 implements Iterable {

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final C0075lEeR5KfoEr4xU5yHH7 f4711zZKhbgvUfsK4AEX3r0 = new C0075lEeR5KfoEr4xU5yHH7(null);

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f4712HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int f4713lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f4714s3fjYDxWOUexjjVgyA;

    /* renamed from: cni9M1Tt0N7bwq7oSh.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static final class C0075lEeR5KfoEr4xU5yHH7 {
        public C0075lEeR5KfoEr4xU5yHH7() {
        }

        public final lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(int i, int i2, int i3) {
            return new lEeR5KfoEr4xU5yHH7(i, i2, i3);
        }

        public /* synthetic */ C0075lEeR5KfoEr4xU5yHH7(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }

    public lEeR5KfoEr4xU5yHH7(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4713lEeR5KfoEr4xU5yHH7 = i;
        this.f4714s3fjYDxWOUexjjVgyA = gS59iOkCM8TpW4A2ew.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(i, i2, i3);
        this.f4712HJFh0TGMpafqLE9haL = i3;
    }

    public final int HJFh0TGMpafqLE9haL() {
        return this.f4712HJFh0TGMpafqLE9haL;
    }

    public boolean equals(Object obj) {
        if (obj instanceof lEeR5KfoEr4xU5yHH7) {
            if (!isEmpty() || !((lEeR5KfoEr4xU5yHH7) obj).isEmpty()) {
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) obj;
                if (this.f4713lEeR5KfoEr4xU5yHH7 != leer5kfoer4xu5yhh7.f4713lEeR5KfoEr4xU5yHH7 || this.f4714s3fjYDxWOUexjjVgyA != leer5kfoer4xu5yhh7.f4714s3fjYDxWOUexjjVgyA || this.f4712HJFh0TGMpafqLE9haL != leer5kfoer4xu5yhh7.f4712HJFh0TGMpafqLE9haL) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f4713lEeR5KfoEr4xU5yHH7 * 31) + this.f4714s3fjYDxWOUexjjVgyA) * 31) + this.f4712HJFh0TGMpafqLE9haL;
    }

    public boolean isEmpty() {
        if (this.f4712HJFh0TGMpafqLE9haL > 0) {
            if (this.f4713lEeR5KfoEr4xU5yHH7 <= this.f4714s3fjYDxWOUexjjVgyA) {
                return false;
            }
        } else if (this.f4713lEeR5KfoEr4xU5yHH7 >= this.f4714s3fjYDxWOUexjjVgyA) {
            return false;
        }
        return true;
    }

    public final int lEeR5KfoEr4xU5yHH7() {
        return this.f4713lEeR5KfoEr4xU5yHH7;
    }

    public final int s3fjYDxWOUexjjVgyA() {
        return this.f4714s3fjYDxWOUexjjVgyA;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f4712HJFh0TGMpafqLE9haL > 0) {
            sb = new StringBuilder();
            sb.append(this.f4713lEeR5KfoEr4xU5yHH7);
            sb.append("..");
            sb.append(this.f4714s3fjYDxWOUexjjVgyA);
            sb.append(" step ");
            i = this.f4712HJFh0TGMpafqLE9haL;
        } else {
            sb = new StringBuilder();
            sb.append(this.f4713lEeR5KfoEr4xU5yHH7);
            sb.append(" downTo ");
            sb.append(this.f4714s3fjYDxWOUexjjVgyA);
            sb.append(" step ");
            i = -this.f4712HJFh0TGMpafqLE9haL;
        }
        sb.append(i);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: merged with bridge method [inline-methods] */
    public A49QRPHynYLCBN0SqP iterator() {
        return new s3fjYDxWOUexjjVgyA(this.f4713lEeR5KfoEr4xU5yHH7, this.f4714s3fjYDxWOUexjjVgyA, this.f4712HJFh0TGMpafqLE9haL);
    }
}
