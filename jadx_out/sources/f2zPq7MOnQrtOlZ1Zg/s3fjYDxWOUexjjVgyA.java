package f2zPq7MOnQrtOlZ1Zg;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA extends DialogFragment {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public Dialog f5820HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public Dialog f5821lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public DialogInterface.OnCancelListener f5822s3fjYDxWOUexjjVgyA;

    public static s3fjYDxWOUexjjVgyA lEeR5KfoEr4xU5yHH7(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = new s3fjYDxWOUexjjVgyA();
        Dialog dialog2 = (Dialog) HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        s3fjydxwouexjjvgya.f5821lEeR5KfoEr4xU5yHH7 = dialog2;
        if (onCancelListener != null) {
            s3fjydxwouexjjvgya.f5822s3fjYDxWOUexjjVgyA = onCancelListener;
        }
        return s3fjydxwouexjjvgya;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f5822s3fjYDxWOUexjjVgyA;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f5821lEeR5KfoEr4xU5yHH7;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f5820HJFh0TGMpafqLE9haL == null) {
            this.f5820HJFh0TGMpafqLE9haL = new AlertDialog.Builder((Context) HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(getActivity())).create();
        }
        return this.f5820HJFh0TGMpafqLE9haL;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
