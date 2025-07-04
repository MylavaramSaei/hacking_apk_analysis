package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.KYHag8HRDlnO3X9zmZ;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements osrHU7fvDp2EgxZPfM.s3fjYDxWOUexjjVgyA {

    public static class HJFh0TGMpafqLE9haL implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7("EmojiCompat.EmojiCompatInitializer.run");
                if (KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo()) {
                    KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().e54J8UWNHWALQNixXM();
                }
            } finally {
                OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
            }
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 extends KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL {
        public lEeR5KfoEr4xU5yHH7(Context context) {
            super(new s3fjYDxWOUexjjVgyA(context));
            s3fjYDxWOUexjjVgyA(1);
        }
    }

    public static class s3fjYDxWOUexjjVgyA implements KYHag8HRDlnO3X9zmZ.IPyIQcaNa8aB7drBED {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Context f3301lEeR5KfoEr4xU5yHH7;

        public class lEeR5KfoEr4xU5yHH7 extends KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo {

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final /* synthetic */ KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo f3303lEeR5KfoEr4xU5yHH7;

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public final /* synthetic */ ThreadPoolExecutor f3304s3fjYDxWOUexjjVgyA;

            public lEeR5KfoEr4xU5yHH7(KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, ThreadPoolExecutor threadPoolExecutor) {
                this.f3303lEeR5KfoEr4xU5yHH7 = pbvgzgjwvy2ldxc8vo;
                this.f3304s3fjYDxWOUexjjVgyA = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo
            public void lEeR5KfoEr4xU5yHH7(Throwable th) {
                try {
                    this.f3303lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(th);
                } finally {
                    this.f3304s3fjYDxWOUexjjVgyA.shutdown();
                }
            }

            @Override // androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo
            public void s3fjYDxWOUexjjVgyA(hoXrIDAFrSwfShk8da hoxridafrswfshk8da) {
                try {
                    this.f3303lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(hoxridafrswfshk8da);
                } finally {
                    this.f3304s3fjYDxWOUexjjVgyA.shutdown();
                }
            }
        }

        public s3fjYDxWOUexjjVgyA(Context context) {
            this.f3301lEeR5KfoEr4xU5yHH7 = context.getApplicationContext();
        }

        /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
        public void zZKhbgvUfsK4AEX3r0(KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, ThreadPoolExecutor threadPoolExecutor) {
            try {
                Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4LEeR5KfoEr4xU5yHH7 = zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this.f3301lEeR5KfoEr4xU5yHH7);
                if (z9WdNiOsPR0y54zHW4LEeR5KfoEr4xU5yHH7 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                z9WdNiOsPR0y54zHW4LEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(threadPoolExecutor);
                z9WdNiOsPR0y54zHW4LEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7().lEeR5KfoEr4xU5yHH7(new lEeR5KfoEr4xU5yHH7(pbvgzgjwvy2ldxc8vo, threadPoolExecutor));
            } catch (Throwable th) {
                pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7(th);
                threadPoolExecutor.shutdown();
            }
        }

        @Override // androidx.emoji2.text.KYHag8HRDlnO3X9zmZ.IPyIQcaNa8aB7drBED
        public void lEeR5KfoEr4xU5yHH7(final KYHag8HRDlnO3X9zmZ.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
            final ThreadPoolExecutor threadPoolExecutorS3fjYDxWOUexjjVgyA = androidx.emoji2.text.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA("EmojiCompatInitializer");
            threadPoolExecutorS3fjYDxWOUexjjVgyA.execute(new Runnable() { // from class: androidx.emoji2.text.TCyPEKSzIyweCN5yp1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3347lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(pbvgzgjwvy2ldxc8vo, threadPoolExecutorS3fjYDxWOUexjjVgyA);
                }
            });
        }
    }

    @Override // osrHU7fvDp2EgxZPfM.s3fjYDxWOUexjjVgyA
    /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
    public Boolean s3fjYDxWOUexjjVgyA(Context context) {
        KYHag8HRDlnO3X9zmZ.IPyIQcaNa8aB7drBED(new lEeR5KfoEr4xU5yHH7(context));
        zZKhbgvUfsK4AEX3r0(context);
        return Boolean.TRUE;
    }

    public void husNiw3snxdgZPAGJm() {
        androidx.emoji2.text.HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0().postDelayed(new HJFh0TGMpafqLE9haL(), 500L);
    }

    @Override // osrHU7fvDp2EgxZPfM.s3fjYDxWOUexjjVgyA
    public List lEeR5KfoEr4xU5yHH7() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public void zZKhbgvUfsK4AEX3r0(Context context) {
        final androidx.lifecycle.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1 = ((androidx.lifecycle.Z9WdNiOsPR0y54zHW4) osrHU7fvDp2EgxZPfM.lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(context).KYHag8HRDlnO3X9zmZ(ProcessLifecycleInitializer.class)).TCyPEKSzIyweCN5yp1();
        kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(new androidx.lifecycle.s3fjYDxWOUexjjVgyA() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.s3fjYDxWOUexjjVgyA
            public void lEeR5KfoEr4xU5yHH7(androidx.lifecycle.Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
                EmojiCompatInitializer.this.husNiw3snxdgZPAGJm();
                kYHag8HRDlnO3X9zmZTCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL(this);
            }
        });
    }
}
