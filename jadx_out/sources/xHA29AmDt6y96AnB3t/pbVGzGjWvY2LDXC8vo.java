package xHA29AmDt6y96AnB3t;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class pbVGzGjWvY2LDXC8vo {

    public static class lEeR5KfoEr4xU5yHH7 {
        public static Bundle HJFh0TGMpafqLE9haL(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }

        public static void lEeR5KfoEr4xU5yHH7(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput s3fjYDxWOUexjjVgyA(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
            throw null;
        }
    }

    public static RemoteInput lEeR5KfoEr4xU5yHH7(pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        return lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(pbvgzgjwvy2ldxc8vo);
    }

    public static RemoteInput[] s3fjYDxWOUexjjVgyA(pbVGzGjWvY2LDXC8vo[] pbvgzgjwvy2ldxc8voArr) {
        if (pbvgzgjwvy2ldxc8voArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[pbvgzgjwvy2ldxc8voArr.length];
        for (int i = 0; i < pbvgzgjwvy2ldxc8voArr.length; i++) {
            pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = pbvgzgjwvy2ldxc8voArr[i];
            remoteInputArr[i] = lEeR5KfoEr4xU5yHH7(null);
        }
        return remoteInputArr;
    }
}
