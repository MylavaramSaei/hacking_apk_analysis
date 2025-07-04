package JXsqbvi9UKxeF3HXpU;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA extends IllegalStateException {
    public s3fjYDxWOUexjjVgyA(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException lEeR5KfoEr4xU5yHH7(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        if (!pbvgzgjwvy2ldxc8vo.hoXrIDAFrSwfShk8da()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excAcstmh57AKoSEkEFNJ = pbvgzgjwvy2ldxc8vo.Acstmh57AKoSEkEFNJ();
        return new s3fjYDxWOUexjjVgyA("Complete with: ".concat(excAcstmh57AKoSEkEFNJ != null ? "failure" : pbvgzgjwvy2ldxc8vo.aPyGSIylzVNKPT1Bls() ? "result ".concat(String.valueOf(pbvgzgjwvy2ldxc8vo.Z9WdNiOsPR0y54zHW4())) : pbvgzgjwvy2ldxc8vo.T9PhQIpGRhE4yZDm1C() ? "cancellation" : "unknown issue"), excAcstmh57AKoSEkEFNJ);
    }
}
