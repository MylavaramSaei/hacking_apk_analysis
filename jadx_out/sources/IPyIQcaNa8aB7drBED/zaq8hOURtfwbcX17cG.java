package IPyIQcaNa8aB7drBED;

import W3RZ2dTDKrKpS5Mxdk.zZKhbgvUfsK4AEX3r0;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class zaq8hOURtfwbcX17cG {

    public static final class lEeR5KfoEr4xU5yHH7 {
        public static boolean lEeR5KfoEr4xU5yHH7(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.CSih7GetOUab1dYQjM(textView, new zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(dragEvent.getClipData(), 3).lEeR5KfoEr4xU5yHH7());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        public static boolean s3fjYDxWOUexjjVgyA(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.CSih7GetOUab1dYQjM(view, new zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(dragEvent.getClipData(), 3).lEeR5KfoEr4xU5yHH7());
            return true;
        }
    }

    public static Activity HJFh0TGMpafqLE9haL(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static boolean lEeR5KfoEr4xU5yHH7(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.THTDvPxsHqMeGb512f(view) != null) {
            Activity activityHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(view);
            if (activityHJFh0TGMpafqLE9haL == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(dragEvent, (TextView) view, activityHJFh0TGMpafqLE9haL) : lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(dragEvent, view, activityHJFh0TGMpafqLE9haL);
            }
        }
        return false;
    }

    public static boolean s3fjYDxWOUexjjVgyA(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 31 || W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.THTDvPxsHqMeGb512f(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.CSih7GetOUab1dYQjM(textView, new zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(primaryClip, 1).HJFh0TGMpafqLE9haL(i != 16908322 ? 1 : 0).lEeR5KfoEr4xU5yHH7());
        }
        return true;
    }
}
