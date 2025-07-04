package fDXXEWvhMVO3O8mnuS;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class Z9WdNiOsPR0y54zHW4 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static String f5884lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static int f5885s3fjYDxWOUexjjVgyA;

    public static String lEeR5KfoEr4xU5yHH7() throws Throwable {
        BufferedReader bufferedReader;
        if (f5884lEeR5KfoEr4xU5yHH7 == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f5884lEeR5KfoEr4xU5yHH7 = Application.getProcessName();
            } else {
                int iMyPid = f5885s3fjYDxWOUexjjVgyA;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f5885s3fjYDxWOUexjjVgyA = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            try {
                                String line = bufferedReader.readLine();
                                HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(bufferedReader);
                }
                f5884lEeR5KfoEr4xU5yHH7 = strTrim;
            }
        }
        return f5884lEeR5KfoEr4xU5yHH7;
    }
}
