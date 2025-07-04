package h3D8MhcyLuC2SOP1fB;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {
    public static final void lEeR5KfoEr4xU5yHH7(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                GraqRgO5nDZP94CSeH.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(th, th2);
            }
        }
    }
}
