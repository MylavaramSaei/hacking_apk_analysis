package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.HJFh0TGMpafqLE9haL;
import hUNBy66ZO1wVLJGW3l.husNiw3snxdgZPAGJm;
import java.io.IOException;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    public class lEeR5KfoEr4xU5yHH7 implements HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // androidx.profileinstaller.HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL
        public void lEeR5KfoEr4xU5yHH7(int i, Object obj) {
            HJFh0TGMpafqLE9haL.f3868s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(i, obj);
        }

        @Override // androidx.profileinstaller.HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL
        public void s3fjYDxWOUexjjVgyA(int i, Object obj) {
            HJFh0TGMpafqLE9haL.f3868s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    public static void lEeR5KfoEr4xU5yHH7(HJFh0TGMpafqLE9haL.InterfaceC0048HJFh0TGMpafqLE9haL interfaceC0048HJFh0TGMpafqLE9haL) {
        Process.sendSignal(Process.myPid(), 10);
        interfaceC0048HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws PackageManager.NameNotFoundException, IOException {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4(context, new husNiw3snxdgZPAGJm(), new lEeR5KfoEr4xU5yHH7(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    HJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM(context, new husNiw3snxdgZPAGJm(), new lEeR5KfoEr4xU5yHH7());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(context, new husNiw3snxdgZPAGJm(), new lEeR5KfoEr4xU5yHH7());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            lEeR5KfoEr4xU5yHH7(new lEeR5KfoEr4xU5yHH7());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(context, leer5kfoer4xu5yhh7);
        } else {
            leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(16, null);
        }
    }
}
