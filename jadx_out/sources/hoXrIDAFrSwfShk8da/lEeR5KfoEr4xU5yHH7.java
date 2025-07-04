package hoXrIDAFrSwfShk8da;

import android.view.View;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {
    public static String lEeR5KfoEr4xU5yHH7(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
