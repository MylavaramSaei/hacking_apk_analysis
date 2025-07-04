package FtYx4GXtxwA8al5hBy;

/* loaded from: classes.dex */
public final class HJFh0TGMpafqLE9haL {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final HJFh0TGMpafqLE9haL f147HJFh0TGMpafqLE9haL = new lEeR5KfoEr4xU5yHH7().lEeR5KfoEr4xU5yHH7();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final long f148lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f149s3fjYDxWOUexjjVgyA;

    public static final class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public long f150lEeR5KfoEr4xU5yHH7 = 0;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public s3fjYDxWOUexjjVgyA f151s3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA.REASON_UNKNOWN;

        public lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            this.f151s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya;
            return this;
        }

        public HJFh0TGMpafqLE9haL lEeR5KfoEr4xU5yHH7() {
            return new HJFh0TGMpafqLE9haL(this.f150lEeR5KfoEr4xU5yHH7, this.f151s3fjYDxWOUexjjVgyA);
        }

        public lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA(long j) {
            this.f150lEeR5KfoEr4xU5yHH7 = j;
            return this;
        }
    }

    public enum s3fjYDxWOUexjjVgyA implements JRgQbcjdTfLJPT0BU7.HJFh0TGMpafqLE9haL {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final int f160lEeR5KfoEr4xU5yHH7;

        s3fjYDxWOUexjjVgyA(int i) {
            this.f160lEeR5KfoEr4xU5yHH7 = i;
        }

        @Override // JRgQbcjdTfLJPT0BU7.HJFh0TGMpafqLE9haL
        public int lEeR5KfoEr4xU5yHH7() {
            return this.f160lEeR5KfoEr4xU5yHH7;
        }
    }

    public HJFh0TGMpafqLE9haL(long j, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f148lEeR5KfoEr4xU5yHH7 = j;
        this.f149s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya;
    }

    public static lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL() {
        return new lEeR5KfoEr4xU5yHH7();
    }

    public long lEeR5KfoEr4xU5yHH7() {
        return this.f148lEeR5KfoEr4xU5yHH7;
    }

    public s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA() {
        return this.f149s3fjYDxWOUexjjVgyA;
    }
}
