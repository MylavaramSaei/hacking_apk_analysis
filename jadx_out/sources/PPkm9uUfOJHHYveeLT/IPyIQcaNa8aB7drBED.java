package PPkm9uUfOJHHYveeLT;

import W3RZ2dTDKrKpS5Mxdk.jCtUeU2YI1poCxWcjm;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class IPyIQcaNa8aB7drBED implements jCtUeU2YI1poCxWcjm {
    public static void HJFh0TGMpafqLE9haL(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    public static CharSequence s3fjYDxWOUexjjVgyA(Context context, ClipData.Item item, int i) {
        if ((i & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    @Override // W3RZ2dTDKrKpS5Mxdk.jCtUeU2YI1poCxWcjm
    public W3RZ2dTDKrKpS5Mxdk.zZKhbgvUfsK4AEX3r0 lEeR5KfoEr4xU5yHH7(View view, W3RZ2dTDKrKpS5Mxdk.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + zzkhbgvufsk4aex3r0);
        }
        if (zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0() == 2) {
            return zzkhbgvufsk4aex3r0;
        }
        ClipData clipDataS3fjYDxWOUexjjVgyA = zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA();
        int iHJFh0TGMpafqLE9haL = zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataS3fjYDxWOUexjjVgyA.getItemCount(); i++) {
            CharSequence charSequenceS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(context, clipDataS3fjYDxWOUexjjVgyA.getItemAt(i), iHJFh0TGMpafqLE9haL);
            if (charSequenceS3fjYDxWOUexjjVgyA != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceS3fjYDxWOUexjjVgyA);
                } else {
                    HJFh0TGMpafqLE9haL(editable, charSequenceS3fjYDxWOUexjjVgyA);
                    z = true;
                }
            }
        }
        return null;
    }
}
