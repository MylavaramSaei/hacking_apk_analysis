package zWzrlx9vIdLp7FoEMD;

/* loaded from: classes.dex */
public class LIMtzhnLwQyigzK0KO implements xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Object f7379HJFh0TGMpafqLE9haL = new Object();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public volatile Object f7380lEeR5KfoEr4xU5yHH7 = f7379HJFh0TGMpafqLE9haL;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public volatile xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA f7381s3fjYDxWOUexjjVgyA;

    public LIMtzhnLwQyigzK0KO(xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f7381s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya;
    }

    @Override // xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA
    public Object get() {
        Object obj = this.f7380lEeR5KfoEr4xU5yHH7;
        Object obj2 = f7379HJFh0TGMpafqLE9haL;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f7380lEeR5KfoEr4xU5yHH7;
                    if (obj == obj2) {
                        obj = this.f7381s3fjYDxWOUexjjVgyA.get();
                        this.f7380lEeR5KfoEr4xU5yHH7 = obj;
                        this.f7381s3fjYDxWOUexjjVgyA = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
