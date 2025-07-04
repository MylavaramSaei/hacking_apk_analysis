package DFYiVi7zXozAjRciKa;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 implements w9kKjxxNBwNcD4xB6O.lEeR5KfoEr4xU5yHH7 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Object f86HJFh0TGMpafqLE9haL = new Object();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public volatile w9kKjxxNBwNcD4xB6O.lEeR5KfoEr4xU5yHH7 f87lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public volatile Object f88s3fjYDxWOUexjjVgyA = f86HJFh0TGMpafqLE9haL;

    public lEeR5KfoEr4xU5yHH7(w9kKjxxNBwNcD4xB6O.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f87lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
    }

    public static w9kKjxxNBwNcD4xB6O.lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(w9kKjxxNBwNcD4xB6O.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7);
        return leer5kfoer4xu5yhh7 instanceof lEeR5KfoEr4xU5yHH7 ? leer5kfoer4xu5yhh7 : new lEeR5KfoEr4xU5yHH7(leer5kfoer4xu5yhh7);
    }

    public static Object s3fjYDxWOUexjjVgyA(Object obj, Object obj2) {
        if (obj == f86HJFh0TGMpafqLE9haL || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // w9kKjxxNBwNcD4xB6O.lEeR5KfoEr4xU5yHH7
    public Object get() {
        Object obj = this.f88s3fjYDxWOUexjjVgyA;
        Object obj2 = f86HJFh0TGMpafqLE9haL;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f88s3fjYDxWOUexjjVgyA;
                    if (obj == obj2) {
                        obj = this.f87lEeR5KfoEr4xU5yHH7.get();
                        this.f88s3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(this.f88s3fjYDxWOUexjjVgyA, obj);
                        this.f87lEeR5KfoEr4xU5yHH7 = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
