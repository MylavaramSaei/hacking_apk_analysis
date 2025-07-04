package com.google.firebase.messaging;

import JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Executor f5541lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Map f5542s3fjYDxWOUexjjVgyA = new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7();

    /* renamed from: com.google.firebase.messaging.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public interface InterfaceC0084lEeR5KfoEr4xU5yHH7 {
        pbVGzGjWvY2LDXC8vo lEeR5KfoEr4xU5yHH7();
    }

    public lEeR5KfoEr4xU5yHH7(Executor executor) {
        this.f5541lEeR5KfoEr4xU5yHH7 = executor;
    }

    public final /* synthetic */ pbVGzGjWvY2LDXC8vo HJFh0TGMpafqLE9haL(String str, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        synchronized (this) {
            this.f5542s3fjYDxWOUexjjVgyA.remove(str);
        }
        return pbvgzgjwvy2ldxc8vo;
    }

    public synchronized pbVGzGjWvY2LDXC8vo s3fjYDxWOUexjjVgyA(final String str, InterfaceC0084lEeR5KfoEr4xU5yHH7 interfaceC0084lEeR5KfoEr4xU5yHH7) {
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = (pbVGzGjWvY2LDXC8vo) this.f5542s3fjYDxWOUexjjVgyA.get(str);
        if (pbvgzgjwvy2ldxc8vo != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return pbvgzgjwvy2ldxc8vo;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        pbVGzGjWvY2LDXC8vo pbVGzGjWvY2LDXC8vo2 = interfaceC0084lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7().pbVGzGjWvY2LDXC8vo(this.f5541lEeR5KfoEr4xU5yHH7, new JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7() { // from class: SF66oTSCsXABfwyWiU.oocVJL811qFf0j0XXZ
            @Override // JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7
            public final Object lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo2) {
                return this.f1505lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(str, pbvgzgjwvy2ldxc8vo2);
            }
        });
        this.f5542s3fjYDxWOUexjjVgyA.put(str, pbVGzGjWvY2LDXC8vo2);
        return pbVGzGjWvY2LDXC8vo2;
    }
}
