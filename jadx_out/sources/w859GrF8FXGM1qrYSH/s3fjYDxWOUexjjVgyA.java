package w859GrF8FXGM1qrYSH;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final FileChannel f7243lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final FileLock f7244s3fjYDxWOUexjjVgyA;

    public s3fjYDxWOUexjjVgyA(FileChannel fileChannel, FileLock fileLock) {
        this.f7243lEeR5KfoEr4xU5yHH7 = fileChannel;
        this.f7244s3fjYDxWOUexjjVgyA = fileLock;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static w859GrF8FXGM1qrYSH.s3fjYDxWOUexjjVgyA lEeR5KfoEr4xU5yHH7(android.content.Context r4, java.lang.String r5) throws java.io.IOException {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.io.File r4 = r4.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.nio.channels.FileLock r5 = r4.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L28 java.io.IOException -> L2a
            w859GrF8FXGM1qrYSH.s3fjYDxWOUexjjVgyA r1 = new w859GrF8FXGM1qrYSH.s3fjYDxWOUexjjVgyA     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            return r1
        L1f:
            r1 = move-exception
            goto L34
        L21:
            r1 = move-exception
            goto L34
        L23:
            r1 = move-exception
            goto L34
        L25:
            r1 = move-exception
        L26:
            r5 = r0
            goto L34
        L28:
            r1 = move-exception
            goto L26
        L2a:
            r1 = move-exception
            goto L26
        L2c:
            r1 = move-exception
        L2d:
            r4 = r0
            r5 = r4
            goto L34
        L30:
            r1 = move-exception
            goto L2d
        L32:
            r1 = move-exception
            goto L2d
        L34:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L40
            r5.release()     // Catch: java.io.IOException -> L40
        L40:
            if (r4 == 0) goto L45
            r4.close()     // Catch: java.io.IOException -> L45
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w859GrF8FXGM1qrYSH.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(android.content.Context, java.lang.String):w859GrF8FXGM1qrYSH.s3fjYDxWOUexjjVgyA");
    }

    public void s3fjYDxWOUexjjVgyA() throws IOException {
        try {
            this.f7244s3fjYDxWOUexjjVgyA.release();
            this.f7243lEeR5KfoEr4xU5yHH7.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
