package SF66oTSCsXABfwyWiU;

import SF66oTSCsXABfwyWiU.evSiTWao80SbJUZk9E;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public class jocVUfxESVhVJU8LoH extends Binder {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f1470lEeR5KfoEr4xU5yHH7;

    public interface lEeR5KfoEr4xU5yHH7 {
        JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo lEeR5KfoEr4xU5yHH7(Intent intent);
    }

    public jocVUfxESVhVJU8LoH(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f1470lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
    }

    public void HJFh0TGMpafqLE9haL(final evSiTWao80SbJUZk9E.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f1470lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(leer5kfoer4xu5yhh7.f1461lEeR5KfoEr4xU5yHH7).HJFh0TGMpafqLE9haL(new hUNBy66ZO1wVLJGW3l.husNiw3snxdgZPAGJm(), new JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0() { // from class: SF66oTSCsXABfwyWiU.ctWLFN70QQINH1kyYo
            @Override // JXsqbvi9UKxeF3HXpU.zZKhbgvUfsK4AEX3r0
            public final void lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
                leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0();
            }
        });
    }
}
