package tXWeW0sqVddf7ZBflq;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm implements zZKhbgvUfsK4AEX3r0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Object[] f6833lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f6834s3fjYDxWOUexjjVgyA;

    public husNiw3snxdgZPAGJm(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.f6833lEeR5KfoEr4xU5yHH7 = new Object[i];
    }

    public final boolean HJFh0TGMpafqLE9haL(Object obj) {
        int i = this.f6834s3fjYDxWOUexjjVgyA;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f6833lEeR5KfoEr4xU5yHH7[i2] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // tXWeW0sqVddf7ZBflq.zZKhbgvUfsK4AEX3r0
    public boolean lEeR5KfoEr4xU5yHH7(Object obj) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(obj, "instance");
        if (!(!HJFh0TGMpafqLE9haL(obj))) {
            throw new IllegalStateException("Already in the pool!".toString());
        }
        int i = this.f6834s3fjYDxWOUexjjVgyA;
        Object[] objArr = this.f6833lEeR5KfoEr4xU5yHH7;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.f6834s3fjYDxWOUexjjVgyA = i + 1;
        return true;
    }

    @Override // tXWeW0sqVddf7ZBflq.zZKhbgvUfsK4AEX3r0
    public Object s3fjYDxWOUexjjVgyA() {
        int i = this.f6834s3fjYDxWOUexjjVgyA;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = this.f6833lEeR5KfoEr4xU5yHH7[i2];
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f6833lEeR5KfoEr4xU5yHH7[i2] = null;
        this.f6834s3fjYDxWOUexjjVgyA--;
        return obj;
    }
}
